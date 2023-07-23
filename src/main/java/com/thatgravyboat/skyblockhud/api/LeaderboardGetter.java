package com.thatgravyboat.skyblockhud.api;

import com.thatgravyboat.skyblockhud.SkyblockHud;
import com.thatgravyboat.skyblockhud.api.events.SidebarLineUpdateEvent;
import com.thatgravyboat.skyblockhud.api.events.SidebarPostEvent;
import com.thatgravyboat.skyblockhud.api.events.SidebarPreGetEvent;
import com.thatgravyboat.skyblockhud.utils.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.*;
import java.util.stream.Collectors;

import static com.thatgravyboat.skyblockhud.ComponentHandler.SCOREBOARD_CHARACTERS;

public class LeaderboardGetter {

    private static Map<Integer, String> cachedScores = new HashMap<>();
    private static List<String> cachedScoresList = new ArrayList<>();

    private static int ticks = 0;

    public static List<String> getCachedScores() {
        return cachedScoresList;
    }

    @SubscribeEvent
    public void onClientUpdate(TickEvent.ClientTickEvent event) {
        if (event.phase.equals(TickEvent.Phase.START)) return;
        ticks++;
        if (ticks % 5 != 0) return;

        Minecraft mc = Minecraft.getMinecraft();
        if (mc.theWorld != null && SkyblockHud.hasSkyblockScoreboard()) {
            Scoreboard scoreboard = mc.theWorld.getScoreboard();
            ScoreObjective sidebarObjective = scoreboard.getObjectiveInDisplaySlot(1);

            if (sidebarObjective != null && !MinecraftForge.EVENT_BUS.post(new SidebarPreGetEvent(scoreboard, sidebarObjective))) {
                Collection<Score> scoreList = sidebarObjective.getScoreboard().getSortedScores(sidebarObjective);
                Map<Integer, String> scores = scoreList.stream().collect(Collectors.toMap(Score::getScorePoints, this::getLine, (s1, s2) -> s1));
                if (!cachedScores.equals(scores)) {
                    Map<Integer, String> allFormattedLines = scores.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, (entry) -> SCOREBOARD_CHARACTERS.matcher(entry.getValue()).replaceAll("").trim()));
                    scores.forEach((score, name) -> {
                        if (cachedScores.get(score) == null || !cachedScores.get(score).equals(name)) {
                            MinecraftForge.EVENT_BUS.post(new SidebarLineUpdateEvent(name, SCOREBOARD_CHARACTERS.matcher(name).replaceAll("").trim(), score, scores.size(), scoreboard, sidebarObjective, allFormattedLines));
                        }
                    });
                    cachedScores = scores;
                    cachedScoresList = scores.values().stream().map(name -> SCOREBOARD_CHARACTERS.matcher(name).replaceAll("").trim()).collect(Collectors.toList());
                }
                MinecraftForge.EVENT_BUS.post(new SidebarPostEvent(scoreboard, sidebarObjective, cachedScoresList));
            }
        }
    }

    public String getLine(Score score) {
        ScorePlayerTeam scorePlayerTeam = score.getScoreScoreboard().getPlayersTeam(score.getPlayerName());
        return Utils.removeColor(ScorePlayerTeam.formatPlayerName(scorePlayerTeam, score.getPlayerName()));
    }
}

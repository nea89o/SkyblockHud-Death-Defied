package com.thatgravyboat.skyblockhud.api.events;

import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraftforge.fml.common.eventhandler.Event;

import java.util.Map;

public class SidebarLineUpdateEvent extends Event {

    public String rawLine;
    public String formattedLine;
    public int position;
    public Scoreboard scoreboard;
    public Map<Integer, String> allFormattedLines;
    public ScoreObjective objective;

    public SidebarLineUpdateEvent(String rawLine, String formattedLine, int score, int max, Scoreboard scoreboard, ScoreObjective objective, Map<Integer, String> allFormattedLines) {
        this.rawLine = rawLine;
        this.formattedLine = formattedLine;
        this.allFormattedLines = allFormattedLines;
        this.position = max - score;
        this.scoreboard = scoreboard;
        this.objective = objective;
    }
}

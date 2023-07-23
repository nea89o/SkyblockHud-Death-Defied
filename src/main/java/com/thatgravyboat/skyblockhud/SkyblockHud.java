package com.thatgravyboat.skyblockhud;

import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thatgravyboat.skyblockhud.api.KillTracking;
import com.thatgravyboat.skyblockhud.api.LeaderboardGetter;
import com.thatgravyboat.skyblockhud.api.events.ProfileJoinedEvent;
import com.thatgravyboat.skyblockhud.api.events.ProfileSwitchedEvent;
import com.thatgravyboat.skyblockhud.commands.Commands;
import com.thatgravyboat.skyblockhud.config.KeyBindings;
import com.thatgravyboat.skyblockhud.config.SBHConfig;
import com.thatgravyboat.skyblockhud.dungeons.DungeonHandler;
import com.thatgravyboat.skyblockhud.handlers.*;
import com.thatgravyboat.skyblockhud.location.*;
import com.thatgravyboat.skyblockhud.misc.*;
import com.thatgravyboat.skyblockhud.overlay.DungeonOverlay;
import com.thatgravyboat.skyblockhud.overlay.MiningHud;
import com.thatgravyboat.skyblockhud.overlay.OverlayHud;
import com.thatgravyboat.skyblockhud.overlay.RPGHud;
import com.thatgravyboat.skyblockhud.playerstats.ActionBarParsing;
import com.thatgravyboat.skyblockhud.seasons.SeasonDateHandler;
import com.thatgravyboat.skyblockhud.textures.Textures;
import com.thatgravyboat.skyblockhud.tracker.TrackerFileLoader;
import com.thatgravyboat.skyblockhud.tracker.TrackerHandler;
import com.thatgravyboat.skyblockhud.utils.Utils;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.IReloadableResourceManager;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import org.lwjgl.input.Keyboard;

@Mod(modid = SkyblockHud.MODID, useMetadata = true)
public class SkyblockHud {

    public static final String MODID = "skyblockhud";

    public static SBHConfig config;

    private File configFile;

    private static final Set<String> SKYBLOCK_IN_ALL_LANGUAGES = Sets.newHashSet("SKYBLOCK", "\u7A7A\u5C9B\u751F\u5B58");

    private final Gson gson = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();

    public static File configDirectory;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new LeaderboardGetter());
        MinecraftForge.EVENT_BUS.register(new SeasonDateHandler());
        MinecraftForge.EVENT_BUS.register(new LocationHandler());
        MinecraftForge.EVENT_BUS.register(new IslandHandler());
        MinecraftForge.EVENT_BUS.register(new TimeHandler());
        MinecraftForge.EVENT_BUS.register(new CurrencyHandler());
        MinecraftForge.EVENT_BUS.register(new SlayerHandler());
        MinecraftForge.EVENT_BUS.register(new DungeonHandler());
        MinecraftForge.EVENT_BUS.register(new MinesHandler());
        MinecraftForge.EVENT_BUS.register(new RiftHandler());
        MinecraftForge.EVENT_BUS.register(new FarmingIslandHandler());

        MinecraftForge.EVENT_BUS.register(new TrackerHandler());
        MinecraftForge.EVENT_BUS.register(new KillTracking());

        MinecraftForge.EVENT_BUS.register(new HeldItemHandler());

        ClientRegistry.registerKeyBinding(KeyBindings.map);

        MinecraftForge.EVENT_BUS.register(new ComponentHandler());
        MinecraftForge.EVENT_BUS.register(new ActionBarParsing());
        MinecraftForge.EVENT_BUS.register(new CrystalWaypoints());
        MinecraftForge.EVENT_BUS.register(new FarmHouseHandler());
        MinecraftForge.EVENT_BUS.register(new WarpHandler());
        MinecraftForge.EVENT_BUS.register(new CooldownHandler());
        Commands.init();

        ((IReloadableResourceManager) Minecraft.getMinecraft().getResourceManager()).registerReloadListener(new NpcDialogue());
        ((IReloadableResourceManager) Minecraft.getMinecraft().getResourceManager()).registerReloadListener(new Textures());

        configDirectory = new File(event.getModConfigurationDirectory(), "skyblockhud");
        try {
            configDirectory.mkdir();
        } catch (Exception ignored) {}

        configFile = new File(configDirectory, "sbh-config.json");

        if (configFile.exists()) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(configFile), StandardCharsets.UTF_8))) {
                config = gson.fromJson(reader, SBHConfig.class);
            } catch (Exception ignored) {}
        }

        if (config == null) {
            config = new SBHConfig();
            saveConfig();
        }

        Textures.setTexture(config.misc.style);

        if (WarpHandler.load()) {
            WarpHandler.save();
        }

        Runtime.getRuntime().addShutdownHook(new Thread(this::saveConfig));
        Runtime.getRuntime().addShutdownHook(new Thread(TrackerFileLoader::saveTrackerStatsFile));
    }

    public void saveConfig() {
        try {
            configFile.createNewFile();

            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(configFile), StandardCharsets.UTF_8))) {
                writer.write(gson.toJson(config));
            }
        } catch (IOException ignored) {}
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new PleaseUseSkyguide());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new OverlayHud());
        MinecraftForge.EVENT_BUS.register(new RPGHud());
        MinecraftForge.EVENT_BUS.register(new DungeonOverlay());
        MinecraftForge.EVENT_BUS.register(new BossbarHandler());
        MinecraftForge.EVENT_BUS.register(new MapHandler());
        MinecraftForge.EVENT_BUS.register(new MiningHud());
        MinecraftForge.EVENT_BUS.register(new NpcDialogue());
    }

    @EventHandler
    public void loadComplete(FMLLoadCompleteEvent event) {
        TrackerFileLoader.loadTrackersFile();

        if (TrackerFileLoader.loadTrackerStatsFile()) {
            TrackerFileLoader.saveTrackerStatsFile();
        }
    }

    @SubscribeEvent
    public void onLeaveServer(FMLNetworkEvent.ClientDisconnectionFromServerEvent event) {
        TrackerFileLoader.saveTrackerStatsFile();
    }

    public static boolean hasSkyblockScoreboard() {
        Minecraft mc = Minecraft.getMinecraft();

        if (mc != null && mc.theWorld != null) {
            Scoreboard scoreboard = mc.theWorld.getScoreboard();
            ScoreObjective sidebarObjective = scoreboard.getObjectiveInDisplaySlot(1);
            if (sidebarObjective != null) {
                String objectiveName = sidebarObjective.getDisplayName().replaceAll("(?i)\\u00A7.", "");
                for (String skyblock : SKYBLOCK_IN_ALL_LANGUAGES) {
                    if (objectiveName.startsWith(skyblock)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    @SubscribeEvent
    public void onTooltip(ItemTooltipEvent event) {
        if (event.itemStack != null && Keyboard.isKeyDown(Keyboard.KEY_BACKSLASH)) {
            try {
                StringSelection clipboard = new StringSelection(event.itemStack.serializeNBT().toString());
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(clipboard, clipboard);
            } catch (Exception ignored) {}
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void onStatusBar(ClientChatReceivedEvent event) {
        String message = Utils.removeColor(event.message.getUnformattedText()).toLowerCase().trim();

        if (message.startsWith("your profile was changed to:")) {
            String stripped = message.replace("your profile was changed to:", "").replace("(co-op)", "").trim();
            MinecraftForge.EVENT_BUS.post(new ProfileSwitchedEvent(stripped));
        }
        if (message.startsWith("you are playing on profile:")) {
            String stripped = message.replace("you are playing on profile:", "").replace("(co-op)", "").trim();
            MinecraftForge.EVENT_BUS.post(new ProfileJoinedEvent(stripped));
        }
    }

    public static GuiScreen screenToOpen = null;
    private static int screenTicks = 0;

    @SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent event) {
        if (screenToOpen != null) {
            screenTicks++;
            if (screenTicks == 5) {
                Minecraft.getMinecraft().displayGuiScreen(screenToOpen);
                screenTicks = 0;
                screenToOpen = null;
            }
        }
    }
}

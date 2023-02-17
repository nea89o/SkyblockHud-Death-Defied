package com.thatgravyboat.skyblockhud.location;

import com.thatgravyboat.skyblockhud.api.events.LocationChangeEvent;
import com.thatgravyboat.skyblockhud.api.events.ProfileSwitchedEvent;
import com.thatgravyboat.skyblockhud.api.events.SidebarLineUpdateEvent;
import com.thatgravyboat.skyblockhud.api.events.SidebarPostEvent;
import com.thatgravyboat.skyblockhud.utils.Utils;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Locale;

public class IslandHandler {

    public static int flightTime;
    public static boolean hadFlightTime;

    public static int redstone;
    public static boolean hadRedstone;

    public static float cleanupPercentage;
    public static boolean hadCleanupPercentage;

    @SubscribeEvent
    public void onSidebarLineUpdate(SidebarLineUpdateEvent event) {
        hadFlightTime = checkFlightDuration(event.formattedLine);
        hadRedstone = checkRestone(event.formattedLine);
        hadCleanupPercentage |= checkPlotClearPercentage(event.formattedLine);
    }

    @SubscribeEvent
    public void onSidebarUpdate(SidebarPostEvent event) {
        for (String line : event.scores) {
            hadCleanupPercentage |= checkPlotClearPercentage(line.replaceAll("[^a-zA-Z:0-9,%. ]", ""));
        }
    }

    @SubscribeEvent
    public void onLocationChange(LocationChangeEvent event) {
        hadCleanupPercentage = false;
    }


    @SubscribeEvent
    public void onProfileSwitch(ProfileSwitchedEvent event) {
        flightTime = 0;
    }

    public static boolean checkFlightDuration(String formatedScoreboardLine) {
        if (LocationHandler.getCurrentLocation().getCategory() == LocationCategory.ISLAND
                && Utils.removeColor(formatedScoreboardLine.toLowerCase().trim()).contains("flight duration:")) {
            String timeString = formatedScoreboardLine.toLowerCase().replace("flight duration:", "").replace(" ", "");
            String[] times = timeString.split(":");
            if (times.length == 2) {
                int s = 0;
                try {
                    s += Integer.parseInt(times[0].replaceAll(",", "")) * 60;
                } catch (NumberFormatException ignored) {
                }
                try {
                    s += Integer.parseInt(times[1].replaceAll(",", ""));
                } catch (NumberFormatException ignored) {
                }
                flightTime = s - 1;
            } else if (times.length == 3) {
                int s = 0;
                try {
                    s += Integer.parseInt(times[0].replaceAll(",", "")) * 3600;
                } catch (NumberFormatException ignored) {}
                try {
                    s += Integer.parseInt(times[1].replaceAll(",", "")) * 60;
                } catch (NumberFormatException ignored) {
                }
                try {
                    s += Integer.parseInt(times[2].replaceAll(",", ""));
                } catch (NumberFormatException ignored) {
                }
                flightTime = s - 1;
            }
            return true;
        }
        return false;
    }

    public static boolean checkPlotClearPercentage(String formatedScoreboardLine) {
        if (LocationHandler.getCurrentLocation() == Locations.THEGARDEN) {
            String lowered = formatedScoreboardLine.toLowerCase(Locale.ROOT);
            if (lowered.contains("cleanup:")) {
                try {
                    String s = Utils.removeWhiteSpaceAndRemoveWord(lowered, "cleanup:").replace("%", "");
                    cleanupPercentage = Float.parseFloat(s);
                    return true;
                } catch (Exception ignored) {
                }
            }
        }
        return false;
    }

    public static boolean checkRestone(String formatedScoreboardLine) {
        if (LocationHandler.getCurrentLocation() == Locations.YOURISLAND) {
            try {
                redstone = formatedScoreboardLine.toLowerCase().contains("redstone:") ? Integer.parseInt(Utils.removeWhiteSpaceAndRemoveWord(formatedScoreboardLine, "redstone:").replaceAll(",", "")) : 0;
            } catch (Exception ignored) {
            }
            return formatedScoreboardLine.toLowerCase().contains("redstone:");
        }
        return false;
    }
}

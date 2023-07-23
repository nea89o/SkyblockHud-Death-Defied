package com.thatgravyboat.skyblockhud.location;

import com.thatgravyboat.skyblockhud.api.events.LocationChangeEvent;
import com.thatgravyboat.skyblockhud.api.events.SidebarLineUpdateEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Locale;

public class LocationHandler {

    private static Locations currentLocation = Locations.NONE;

    public static void handleLocation(String locationLine, boolean isGuesting, boolean isRift) {
        String location = locationLine.replace(" ", "")
                .toUpperCase(Locale.ENGLISH).trim()
                .replaceAll("[^A-Za-z0-9]", "");
        if (location.startsWith("THECATACOMBS")) {
            MinecraftForge.EVENT_BUS.post(new LocationChangeEvent(currentLocation, Locations.CATACOMBS));
            currentLocation = Locations.CATACOMBS;
        } else {
            Locations locations;
            boolean isPlot = location.startsWith("PLOT");
            if (isGuesting && (isPlot || location.endsWith("GARDEN"))) {
                locations = Locations.GUESTGARDEN;
            } else if (isGuesting) {
                locations = Locations.GUESTISLAND;
            } else if (isPlot) {
                locations = Locations.THEGARDEN;
            } else if (isRift) {
                locations = Locations.get("RIFT_" + location);
            } else {
                locations = Locations.get(location);
            }
            MinecraftForge.EVENT_BUS.post(new LocationChangeEvent(currentLocation, locations));
            currentLocation = locations;
        }
    }

    public static void setCurrentLocation(Locations location) {
        currentLocation = location;
    }

    public static Locations getCurrentLocation() {
        return currentLocation;
    }

    @SubscribeEvent
    public void onSidebarLineUpdate(SidebarLineUpdateEvent event) {
        boolean isRift = event.rawLine.contains("ф");
        if (event.rawLine.contains("⏣") || isRift) {
            String objectiveName = event.objective.getDisplayName().replaceAll("(?i)\\u00A7.", "");
            boolean isGuesting = objectiveName.toLowerCase(Locale.ENGLISH).endsWith("guest");
            LocationHandler.handleLocation(event.formattedLine, isGuesting, isRift);
        }
    }
}

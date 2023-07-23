package com.thatgravyboat.skyblockhud.location;

import com.thatgravyboat.skyblockhud.SkyblockHud;
import com.thatgravyboat.skyblockhud.handlers.MapHandler;

import static com.thatgravyboat.skyblockhud.handlers.MapHandler.Maps;

public enum LocationCategory {
    ERROR("error", 34),
    HUB("hub", 34, Maps.HUB),
    ISLAND("island", 43),
    PARK("park", 51, Maps.PARK),
    JERRY("jerry", 59, Maps.JERRY),
    BARN("barn", 67, Maps.BARN),
    MUSHROOMDESERT("mushroomdesert", 75, Maps.MUSHROOM),
    GOLDMINE("gold_mine", 83, Maps.GOLDMINE),
    DEEPCAVERNS("deepcaverns", 91),
    SPIDERSDEN("spiders_den", 99, Maps.SPIDERS),
    CRIMSON("crimson_isle", 107, Maps.CRIMSON),
    DN("dungeonhub", 115, Maps.DN),
    THEEND("the_end", 123, Maps.THEEND),
    DWARVENMINES("dwarven_mines", 131, Maps.DWARVEN),
    CRYSTALHOLLOWS("crystal_hollows", 139, Maps.CRYSTAL),
    RIFT("rift", 147/*, TODO */);

    private final String name;
    private final int texturePos;
    private final MapHandler.Maps map;

    LocationCategory(String name, int texturePos) {
        this(name, texturePos, null);
    }

    LocationCategory(String name, int texturePos, MapHandler.Maps map) {
        this.name = name;
        this.texturePos = texturePos;
        this.map = map;
    }

    public String getName() {
        return this.name;
    }

    public int getTexturePos() {
        return this.texturePos;
    }

    public MapHandler.Maps getMap() {
        if (this.map != null && SkyblockHud.config.map.mapLocations.contains(this.ordinal() - 2)) return this.map; else return null;
    }

    public boolean isMiningCategory() {
        return this == LocationCategory.DWARVENMINES || this == LocationCategory.CRYSTALHOLLOWS;
    }
}

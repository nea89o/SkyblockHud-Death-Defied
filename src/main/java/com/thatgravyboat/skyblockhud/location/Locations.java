package com.thatgravyboat.skyblockhud.location;

public enum Locations {
    //ERROR LOCATIONS
    DEFAULT("unknown", "Somewhere on Skyblock...", LocationCategory.ERROR),
    NONE("none", "Unknown", LocationCategory.ERROR),
    //PRIVATE ISLAND
    YOURISLAND("yourisland", "Your Island", LocationCategory.ISLAND),
    GUESTISLAND("guestisland", "Guest Island", LocationCategory.ISLAND),
    MOULBERRYSISLAND("moulberryisland", "Cool Dude Hub", LocationCategory.ISLAND),
    //HUB
    VILLAGE("village", "Village", LocationCategory.HUB),
    AUCTIONHOUSE("auctionhouse", "Auction House", LocationCategory.HUB),
    BAZAARALLEY("bazaaralley", "Bazaar Alley", LocationCategory.HUB),
    BANK("bank", "Bank", LocationCategory.HUB),
    FASHIONSHOP("fashionshop", "Fashion Shop", LocationCategory.HUB),
    COLOSSEUM("colosseum", "Colosseum", LocationCategory.HUB),
    COLOSSEUMARENA("colosseumarena", "Colosseum Arena", LocationCategory.HUB),
    MOUNTAIN("mountain", "Mountain", LocationCategory.HUB),
    HIGHLEVEL("highlevel", "High Level", LocationCategory.HUB),
    WILDERNESS("wilderness", "Wilderness", LocationCategory.HUB),
    FISHERMANSHUT("fishermanshut", "Fisherman's Hut", LocationCategory.HUB),
    FLOWERHOUSE("flowerhouse", "Flower House", LocationCategory.HUB),
    CANVASROOM("canvasroom", "Canvas Room", LocationCategory.HUB),
    TAVERN("tavern", "Tavern", LocationCategory.HUB),
    FOREST("forest", "Forest", LocationCategory.HUB),
    RUINS("ruins", "Ruins", LocationCategory.HUB),
    GRAVEYARD("graveyard", "Graveyard", LocationCategory.HUB),
    COALMINE("coalmine", "Coal Mine", LocationCategory.HUB),
    FARM("farm", "Farm", LocationCategory.HUB),
    LIBRARY("library", "Library", LocationCategory.HUB),
    COMMUNITYCENTER("communitycenter", "Community Center", LocationCategory.HUB),
    ELECTIONROOM("electionroom", "Election Room", LocationCategory.HUB),
    BUILDERSHOUSE("buildershouse", "Builder's House", LocationCategory.HUB),
    BLACKSMITH("blacksmith", "Blacksmith", LocationCategory.HUB),
    FARMHOUSE("farmhouse", "Farmhouse", LocationCategory.HUB),
    WIZARDTOWER("wizardtower", "Wizard Tower", LocationCategory.HUB),
    THAUMATURGIST("thaumaturgist", "Thaumaturgist", LocationCategory.HUB),
    //THE BARN
    THEBARN("thebarn", "The Barn", LocationCategory.BARN),
    WINDMILL("windmill", "Windmill", LocationCategory.BARN),
    //MUSHROOM DESERT
    MUSHROOMDESERT("mushroomdesert", "Mushroom Desert", LocationCategory.MUSHROOMDESERT),
    DESERTSETTLEMENT("desertsettlement", "Desert Settlement", LocationCategory.MUSHROOMDESERT),
    OASIS("oasis", "Oasis", LocationCategory.MUSHROOMDESERT),
    MUSHROOMGORGE("mushroomgorge", "Mushroom Gorge", LocationCategory.MUSHROOMDESERT),
    SHEPHERDSKEEP("shepherdskeep", "Shepherds Keep", LocationCategory.MUSHROOMDESERT),
    JAKESHOUSE("jakeshouse", "Jake's House", LocationCategory.MUSHROOMDESERT),
    TREASUREHUNTERCAMP("treasurehuntercamp", "Treasure Hunter Camp", LocationCategory.MUSHROOMDESERT),
    GLOWINGMUSHROOMCAVE("glowingmushroomcave", "Glowing Mushroom Cave", LocationCategory.MUSHROOMDESERT),
    TRAPPERSDEN("trappersden", "Trappers Den", LocationCategory.MUSHROOMDESERT),
    OVERGROWNMUSHROOMCAVE("overgrownmushroomcave", "Overgrown Mushroom Cave", LocationCategory.MUSHROOMDESERT),
    //GOLD MINE
    GOLDMINE("goldmine", "Gold Mine", LocationCategory.GOLDMINE),
    //DEEP CAVERNS
    DEEPCAVERNS("deepcaverns", "Deep Caverns", LocationCategory.DEEPCAVERNS),
    GUNPOWDERMINES("gunpowdermines", "Gunpowder Mines", LocationCategory.DEEPCAVERNS),
    LAPISQUARRY("lapisquarry", "Lapis Quarry", LocationCategory.DEEPCAVERNS),
    PIGMENSDEN("pigmensden", "Pigmen's Den", LocationCategory.DEEPCAVERNS),
    SLIMEHILL("slimehill", "Slimehill", LocationCategory.DEEPCAVERNS),
    DIAMONDRESERVE("diamondreserve", "Diamond Reserve", LocationCategory.DEEPCAVERNS),
    OBSIDIANSANCTUARY("obsidiansanctuary", "Obsidian Sanctuary", LocationCategory.DEEPCAVERNS),
    //SPIDERS DEN
    SPIDERSDEN("spidersden", "Spider's Den", LocationCategory.SPIDERSDEN),
    //THE END
    THEEND("theend", "The End", LocationCategory.THEEND),
    DRAGONSNEST("dragonsnest", "Dragon's Nest", LocationCategory.THEEND),
    VOIDSEPULTURE("voidsepulture", "Void Sepulture", LocationCategory.THEEND),
    //PARK
    HOWLINGCAVE("howlingcave", "Howling Cave", LocationCategory.PARK),
    BIRCHPARK("birchpark", "Birch Park", LocationCategory.PARK),
    SPRUCEWOODS("sprucewoods", "Spruce Woods", LocationCategory.PARK),
    DARKTHICKET("darkthicket", "Dark Thicket", LocationCategory.PARK),
    SAVANNAWOODLAND("savannawoodland", "Savanna Woodland", LocationCategory.PARK),
    JUNGLEISLAND("jungleisland", "Jungle Island", LocationCategory.PARK),
    //CRIMSON ISLE
    CRIMSONISLE("crimsonisle", "Crimson Isle", LocationCategory.CRIMSON),
    CRIMSONFIELDS("crimsonfields", "Crimson Fields", LocationCategory.CRIMSON),
    CATHEDRAL("cathedral", "Cathedral", LocationCategory.CRIMSON),
    BARBARIANOUTPOST("barbarianoutpost", "Barbarian Outpost", LocationCategory.CRIMSON),
    MAGEOUTPOST("mageoutpost", "Mage Outpost", LocationCategory.CRIMSON),
    THEBASTION("thebastion", "The Bastion", LocationCategory.CRIMSON),
    BLAZINGVOLCANO("blazingvolcano", "Blazing Volcano", LocationCategory.CRIMSON),
    BURNINGDESERT("burningdesert", "Burning Desert", LocationCategory.CRIMSON),
    DOJO("dojo", "Dojo", LocationCategory.CRIMSON),
    DRAGONTAIL("dragontail", "Dragontail", LocationCategory.CRIMSON),
    DRAGONTAILTOWNSQUARE("dragontailtownsquare", "Dragontail Townsquare", LocationCategory.CRIMSON),
    DRAGONTAILAUCTIONHOUS("dragontailauctionhous", "Dragontail AH", LocationCategory.CRIMSON),
    DRAGONTAILBAZAAR("dragontailbazaar", "Dragontail BZ", LocationCategory.CRIMSON),
    DRAGONTAILBANK("dragontailbank", "Dragontail Bank", LocationCategory.CRIMSON),
    DRAGONTAILBLACKSMITH("dragontailblacksmith", "Dragontail Blacksmith", LocationCategory.CRIMSON),
    DRAGONTAILMINIONSHOP("dragontailminionshop", "Dragontail Minion Shop", LocationCategory.CRIMSON),
    CHIEFSHUT("chiefshut", "Chief's Hut", LocationCategory.CRIMSON),
    FORGOTTENSKULL("forgottenskull", "Forgotten Skull", LocationCategory.CRIMSON),
    KUUDRASEND("kuudrasend", "Kuudra's End", LocationCategory.CRIMSON),
    MAGMACHAMBER("magmachamber", "Magma Chamber", LocationCategory.CRIMSON),
    MYSTICMARSH("mysticmarsh", "Mystic Marsh", LocationCategory.CRIMSON),
    ODGERSHUT("odgershut", "Odger's Hut", LocationCategory.CRIMSON),
    RUINSOFASHFANG("ruinsofashfang", "Ruins of Ashfang", LocationCategory.CRIMSON),
    SCARLETON("scarleton", "Scarleton", LocationCategory.CRIMSON),
    SCARLETONPLAZA("scarletonplaza", "Scarleton Plaza", LocationCategory.CRIMSON),
    SCARLETONAUCTIONHOUS("scarletonauctionhous", "Scarleton AH", LocationCategory.CRIMSON),
    SCARLETONBAZAAR("scarletonbazaar", "Scarleton BZ", LocationCategory.CRIMSON),
    SCARLETONBANK("scarletonbank", "Scarleton Bank", LocationCategory.CRIMSON),
    SCARLETONBLACKSMITH("scarletonblacksmith", "Scarleton Blacksmith", LocationCategory.CRIMSON),
    SCARLETONMINIONSHOP("scarletonminionshop", "Scarleton Minion Shop", LocationCategory.CRIMSON),
    STRONGHOLD("stronghold", "Stronghold", LocationCategory.CRIMSON),
    THEWASTELAND("thewasteland", "The Wasteland", LocationCategory.CRIMSON),
    MATRIARCHSLAIR("matriarchslair", "Matriarch's Lair", LocationCategory.CRIMSON),
    BELLYOFTHEBEAST("bellyofthebeast", "Belly of the Beast", LocationCategory.CRIMSON),
    AURASLAB("auraslab", "Aura's Lab", LocationCategory.CRIMSON),
    COURTYARD("courtyard", "Courtyard", LocationCategory.CRIMSON),
    //DUNGEONS
    DUNGEONHUB("dungeonhub", "Dungeon Hub", LocationCategory.DUNGEONHUB),
    CATACOMBS("catacombs", "The Catacombs", LocationCategory.DUNGEONHUB),
    CATACOMBSENTRANCE("catacombsentrance", "Catacombs Entrance", LocationCategory.DUNGEONHUB),
    //JERRYISLAND
    JERRYSWORKSHOP("jerrysworkshop", "Jerry's Workshop", LocationCategory.JERRY),
    JERRYPOND("jerrypond", "Jerry Pond", LocationCategory.JERRY),
    //DWARVENMINES
    THELIFT("thelift", "The Lift", LocationCategory.DWARVENMINES),
    DWARVENVILLAGE("dwarvenvillage", "Dwarven Village", LocationCategory.DWARVENMINES),
    DWARVENMINES("dwarvenmines", "Dwarven Mines", LocationCategory.DWARVENMINES),
    DWARVENTAVERN("dwarvemtavern", "Dwarven Tavern", LocationCategory.DWARVENMINES),
    LAVASPRINGS("lavasprings", "Lava Springs", LocationCategory.DWARVENMINES),
    PALACEBRIDGE("palacebridge", "Palace Bridge", LocationCategory.DWARVENMINES),
    ROYALPALACE("royalpalace", "Royal Palace", LocationCategory.DWARVENMINES),
    GRANDLIBRARY("grandlibrary", "Grand Library", LocationCategory.DWARVENMINES),
    ROYALQUARTERS("royalquarters", "Royal Quarters", LocationCategory.DWARVENMINES),
    BARRACKSOFHEROES("barracksofheroes", "Barracks of Heroes", LocationCategory.DWARVENMINES),
    HANGINGCOURT("hangingcourt", "Hanging Court", LocationCategory.DWARVENMINES),
    GREATICEWALL("greaticewall", "Great Ice Wall", LocationCategory.DWARVENMINES),
    GOBLINBURROWS("goblinburrows", "Goblin Burrows", LocationCategory.DWARVENMINES),
    FARRESERVE("farreserve", "Far Reserve", LocationCategory.DWARVENMINES),
    CCMINECARTSCO("ccminecartco", "Minecart Co.", LocationCategory.DWARVENMINES),
    UPPERMINES("uppermines", "Upper Mines", LocationCategory.DWARVENMINES),
    RAMPARTSQUARRY("rampartsquarry", "Ramparts Quarry", LocationCategory.DWARVENMINES),
    GATESTOTHEMINES("gatestothemines", "Gates to The Mines", LocationCategory.DWARVENMINES),
    FORGEBASIN("forgebasin", "Forge Basin", LocationCategory.DWARVENMINES),
    THEFORGE("theforge", "The Forge", LocationCategory.DWARVENMINES),
    CLIFFSIDEVEINS("cliffsideveins", "Cliffside Veins", LocationCategory.DWARVENMINES),
    DIVANSGATEWAY("divansgateway", "Divan's Gateway", LocationCategory.DWARVENMINES),
    THEMIST("themist", "The Mist", LocationCategory.DWARVENMINES),
    ROYALMINES("royalmines", "Royal Mines", LocationCategory.DWARVENMINES),
    ARISTOCRATPASSAGE("aristocratpassage", "Aristocrat Passage", LocationCategory.DWARVENMINES),
    MINERSGUILD("minersguild", "Miner's Guild", LocationCategory.DWARVENMINES),
    //CRYSTALHOLLOWS
    JUNGLE("jungle", "Jungle", LocationCategory.CRYSTALHOLLOWS),
    JUNGLETEMPLE("jungletemple", "Jungle Temple", LocationCategory.CRYSTALHOLLOWS),
    MITHRILDEPOSITS("mithrildeposits", "Mithril Deposits", LocationCategory.CRYSTALHOLLOWS),
    MINESOFDIVAN("minesofdivan", "Mines of Divan", LocationCategory.CRYSTALHOLLOWS),
    MAGMAFIELDS("magmafields", "Magma Fields", LocationCategory.CRYSTALHOLLOWS),
    KHAZADDM("khzaddm", "Khazad-d\u00FBm", LocationCategory.CRYSTALHOLLOWS),
    GOBLINHOLDOUT("goblinholdout", "Goblin Holdout", LocationCategory.CRYSTALHOLLOWS),
    GOBLINQUEENSDEN("goblinqueensden", "Goblin Queens Den", LocationCategory.CRYSTALHOLLOWS),
    PRECURSORREMNANTS("precursorremnants", "Precursor Remnants", LocationCategory.CRYSTALHOLLOWS),
    LOSTPRECURSORCITY("lostprecursorcity", "Lost Precursor City", LocationCategory.CRYSTALHOLLOWS),
    CRYSTALNUCLEUS("crystalnucleus", "Crystal Nucleus", LocationCategory.CRYSTALHOLLOWS),
    CRYSTALHOLLOWS("crystalhollows", "Crystal Hollows", LocationCategory.CRYSTALHOLLOWS),
    FAIRYGROTTO("fairygrotto", "Fairy Grotto", LocationCategory.CRYSTALHOLLOWS);

    private final String name;
    private final String displayName;
    private final LocationCategory category;

    Locations(String name, String displayName, LocationCategory category) {
        this.name = name;
        this.displayName = displayName;
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public LocationCategory getCategory() {
        return this.category;
    }

    public static Locations get(String id) {
        try {
            return Locations.valueOf(id.replace(" ", "").toUpperCase());
        } catch (IllegalArgumentException ex) {
            return DEFAULT;
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}

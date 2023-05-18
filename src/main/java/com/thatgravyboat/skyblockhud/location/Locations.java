package com.thatgravyboat.skyblockhud.location;

public enum Locations {
    //ERROR LOCATIONS
    DEFAULT("unknown", "Error", LocationCategory.ERROR),
    NONE("none", "Unknown", LocationCategory.ERROR),
    //ISLAND
    YOURISLAND("yourisland", "Your Island", LocationCategory.ISLAND),
    GUESTISLAND("guestisland", "Guest Island", LocationCategory.ISLAND),
    THEGARDEN("garden", "The Garden", LocationCategory.ISLAND),
    GUESTGARDEN("guestgarden", "Guest Garden", LocationCategory.ISLAND),
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
    HEXATORUM("hexatorum", "Hexatorum", LocationCategory.HUB),
    SHENSAUCTION("shensauction", "Shen's Auction", LocationCategory.HUB),
    REGALIAROOM("regaliaroom", "Regalia Room", LocationCategory.HUB),
    ARCHERYRANGE("archeryrange", "Archery Range", LocationCategory.HUB),
    UNINCORPORATEDTERRITOR("unincorporatedterritor", "Unincorporated Territory", LocationCategory.HUB),

    //THE BARN
    THEBARN("thebarn", "The Barn", LocationCategory.BARN),
    WINDMILL("windmill", "Windmill", LocationCategory.BARN),
    //MUSHROOM DESERT
    MUSHROOMDESERT("mushroomdesert", "Mushroom Desert", LocationCategory.MUSHROOMDESERT),
    DESERTSETTLEMENT("desertsettlement", "Desert Settlement", LocationCategory.MUSHROOMDESERT),
    DESERTMOUNTAIN("desertmountain", "Desert Mountain", LocationCategory.MUSHROOMDESERT),
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
    GRANDMASHOUSE("grandmashouse", "Grandma's House", LocationCategory.SPIDERSDEN),
    ARACHNESBURROW("arachnesburrow", "Arachne's Burrow", LocationCategory.SPIDERSDEN),
    ARACHNESSANCTUARY("arachnessanctuary", "Arachne's Sanctuary", LocationCategory.SPIDERSDEN),
    SPIDERMOUND("spidermound", "Spider Mound", LocationCategory.SPIDERSDEN),
    GRAVELMINES("gravelmines", "Gravel Mines", LocationCategory.SPIDERSDEN),

    //THE END
    THEEND("theend", "The End", LocationCategory.THEEND),
    DRAGONSNEST("dragonsnest", "Dragon's Nest", LocationCategory.THEEND),
    VOIDSEPULTURE("voidsepulture", "Void Sepulture", LocationCategory.THEEND),
    VOIDSLATE("voidslate", "Void Slate", LocationCategory.THEEND),
    ZEALOTBRUISERHIDEOUT("zealotbruiserhideout", "Zealot Bruiser Hideout", LocationCategory.THEEND),
    //PARK
    HOWLINGCAVE("howlingcave", "Howling Cave", LocationCategory.PARK),
    BIRCHPARK("birchpark", "Birch Park", LocationCategory.PARK),
    SPRUCEWOODS("sprucewoods", "Spruce Woods", LocationCategory.PARK),
    LONELYISLAND("lonelyisland", "Lonely Island", LocationCategory.PARK),
    MELODYSPLATEAU("melodysplateau", "Melody's Plateau", LocationCategory.PARK),
    MELANCHOLICVIKING("melancholicviking", "Melancholic Viking", LocationCategory.PARK),
    DARKTHICKET("darkthicket", "Dark Thicket", LocationCategory.PARK),
    SAVANNAWOODLAND("savannawoodland", "Savanna Woodland", LocationCategory.PARK),
    JUNGLEISLAND("jungleisland", "Jungle Island", LocationCategory.PARK),
    //BLAZING FORTRESS
    BLAZINGFORTRESS("blazingfortress", "Blazing Fortress", LocationCategory.CRIMSON),
    //DUNGEONS
    DUNGEONHUB("dungeonhub", "Dungeon Hub", LocationCategory.DN),
    CATACOMBS("catacombs", "The Catacombs", LocationCategory.DN),
    CATACOMBSENTRANCE("catacombsentrance", "Catacombs Entrance", LocationCategory.DN),
    //JERRYISLAND
    JERRYSWORKSHOP("jerrysworkshop", "Jerry's Workshop", LocationCategory.JERRY),
    JERRYPOND("jerrypond", "Jerry Pond", LocationCategory.JERRY),
    REFLECTIVEPOND("reflectivepond", "Reflective Pond", LocationCategory.JERRY),
    MOUNTJERRY("mountjerry", "Mount Jerry", LocationCategory.JERRY),
    HOTSPRINGS("hotsprings", "Hot Springs", LocationCategory.JERRY),
    TERRYSSHACK("terrysshack", "Terry's Shack", LocationCategory.JERRY),
    GLACIALCAVE("glacialcave", "Glacial Cave", LocationCategory.JERRY),
    GARYSSHACK("garysshack", "Gary's Shack", LocationCategory.JERRY),
    SHERRYSSHOWROOM("sherrysshowroom", "Sherry's Showroom", LocationCategory.JERRY),
    EINARYSEMPORIUM("einarysemporium", "Einary's Emporium", LocationCategory.JERRY),
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
    KHAZADDM("khzaddm", "Khazad-dûm", LocationCategory.CRYSTALHOLLOWS),
    GOBLINHOLDOUT("goblinholdout", "Goblin Holdout", LocationCategory.CRYSTALHOLLOWS),
    GOBLINQUEENSDEN("goblinqueensden", "Goblin Queens Den", LocationCategory.CRYSTALHOLLOWS),
    PRECURSORREMNANTS("precursorremnants", "Precursor Remnants", LocationCategory.CRYSTALHOLLOWS),
    LOSTPRECURSORCITY("lostprecursorcity", "Lost Precursor City", LocationCategory.CRYSTALHOLLOWS),
    CRYSTALNUCLEUS("crystalnucleus", "Crystal Nucleus", LocationCategory.CRYSTALHOLLOWS),
    CRYSTALHOLLOWS("crystalhollows", "Crystal Hollows", LocationCategory.CRYSTALHOLLOWS),
    FAIRYGROTTO("fairygrotto", "Fairy Grotto", LocationCategory.CRYSTALHOLLOWS),

    //CRIMSON ISLE
    CRIMSONISLE("crimsonisle", "Crimson Isle", LocationCategory.CRIMSON),
    STRONGHOLD("stronghold", "Stronghold", LocationCategory.CRIMSON),
    CRIMSONFIELDS("crimsonfields", "Crimson Fields", LocationCategory.CRIMSON),
    BURNINGDESERT("burningdesert", "Burning Desert", LocationCategory.CRIMSON),
    DRAGONTAIL("dragontail", "Dragontail", LocationCategory.CRIMSON),
    DRAGONTAILBANK("dragontailbank", "Dragontail Bank", LocationCategory.CRIMSON),
    DRAGONTAILTOWNSQUARE("dragontailtownsquare", "Dragontail Townsquare", LocationCategory.CRIMSON),
    DRAGONTAILAUCTIONHOUS("dragontailah", "Dragontail Auction House", LocationCategory.CRIMSON),
    THEBASTION("thebastion", "The Bastion", LocationCategory.CRIMSON),
    RUINSOFASHFANG("ruinsash", "Ruins of Ashfang", LocationCategory.CRIMSON),
    FORGOTTENSKULL("forskull", "Forgotten Skull", LocationCategory.CRIMSON),
    THEWASTELAND("waste", "The Wasteland", LocationCategory.CRIMSON),
    MYSTICMARSH("marsh", "Mystic Marsh", LocationCategory.CRIMSON),
    CATHEDRAL("cathedral", "Cathedral", LocationCategory.CRIMSON),
    SCARLETON("scarleton", "Scarleton", LocationCategory.CRIMSON),
    SCARLETONPLAZA("scarletonpl", "Scarleton Plaza", LocationCategory.CRIMSON),
    SCARLETONAUCTIONHOUSE("scarletonah", "Scarleton Auction House", LocationCategory.CRIMSON),
    SCARLETONBANK("scarletonbank", "Scarleton Bank", LocationCategory.CRIMSON),
    SCARLETONBAZAAR("scarletonbz", "Scarleton Bazaar", LocationCategory.CRIMSON),
    SCARLETONBLACKSMITH("scarletonblacksmith", "Scarleton Blacksmith", LocationCategory.CRIMSON),
    SCARLETONMINIONSHOP("scarletonminshop", "Scarleton Minion Shop", LocationCategory.CRIMSON),
    COURTYARD("court", "Courtyard", LocationCategory.CRIMSON),
    AURASLAB("lab", "Aura's Lab", LocationCategory.CRIMSON),
    DOJO("dojo", "Dojo", LocationCategory.CRIMSON),
    DOJOAREA("dojoarea", "Dojo Area", LocationCategory.CRIMSON),
    BARBARIANOUTPOST("barbar", "Barbarian Outpost", LocationCategory.CRIMSON),
    MAGMACHAMBER("magma", "Magma Chamber", LocationCategory.CRIMSON),
    MINIONSHOP("minshop", "Minion Shop", LocationCategory.CRIMSON),
    BLAZINGVOLCANO("volcano", "Blazing Volcano", LocationCategory.CRIMSON),
    KUUUNDRAEND("kuuundraend", "Kuundra's End", LocationCategory.CRIMSON),
    DRAGONTAILBAZAAR("dragontailbz", "Dragontail Bazaar", LocationCategory.CRIMSON),
    DRAGONTAILBLACKSMITH("dragontailblacksmith", "Dragontail Blacksmith", LocationCategory.CRIMSON),
    MAGECOUNCIL("magecouncil", "Mage Council", LocationCategory.CRIMSON),
    MAGEOUTPOST("mageoutpost", "Mage Outpost", LocationCategory.CRIMSON),
    ODGERSHUT("odgershut", "Odger's Hut", LocationCategory.CRIMSON),
    PLHLEGBLASTPOOL("ppool", "Plhlegblast Pool", LocationCategory.CRIMSON),
    SMOLDERINGTOMB("smolderingtomb", "Smoldering Tomb", LocationCategory.CRIMSON),
    THEDUKEDOM("dukedom", "The Dukedom", LocationCategory.CRIMSON),
    THRONEROOM("throneroom", "Throne Room", LocationCategory.CRIMSON),
    CHIEFSHUT("chiefshut", "Chief's Hut", LocationCategory.CRIMSON),
    IGRUPANSCHICKENCOOP("igrupancoop", "Igrupan's Chicken Coop", LocationCategory.CRIMSON);

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

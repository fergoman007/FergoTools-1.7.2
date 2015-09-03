package io.github.fergoman123.fergotools.api.content;

import net.minecraft.util.*;

public enum WoodTypes implements IStringSerializable
{
    obsidian(0, "Obsidian"),
    emerald(1, "Emerald"),
    lapis(2, "Lapis"),
    bronze(3, "Bronze"),
    coal(4, "Coal"),
    glowstone(5, "Glowstone"),
    adamantium(6, "Adamantium"),
    silk(7, "Silk"),
    redstone(8, "Redstone");

    public static final WoodTypes[] VALUES = new WoodTypes[values().length];
    
    private static final String prefixLog = "log";
    private static final String prefixPlank = "plank";
    private static final String prefixLeaves = "leaves";
    private static final String prefixSapling = "sapling";
    private static final String[] prefixSlab = {"slab", "Single", "Double"};

    private final int meta;
    private final String name;

    private WoodTypes(int meta, String name)
    {
        this.meta = meta;
        this.name = name;
    }

    public int getMeta() {
        return meta;
    }

    public static WoodTypes byMetadata(int meta)
    {
        if (meta < 0 || meta >= VALUES.length)
        {
            meta = 0;
        }

        return VALUES[meta];
    }

    public String getName()
    {
        return this.name;
    }
    
    public static String getLogName(int meta){
    	return prefixLog + WoodTypes.values()[meta];
    }
    
    public static String getPlankName(int meta){
    	return prefixPlank + WoodTypes.values()[meta];
    }
    
    public static String getLeavesName(int meta){
    	return prefixLeaves + WoodTypes.values()[meta];
    }
    
    public static String getSaplingName(int meta){
    	return prefixSapling + WoodTypes.values()[meta];
    }
    
    public static String getSlabName(int meta, boolean isDouble){
    	if(isDouble == false)
    		return prefixSlab[0] + WoodTypes.values()[meta] + prefixSlab[1];
    	else
    		return prefixSlab[0] + WoodTypes.values()[meta] + prefixSlab[2];
    }
}

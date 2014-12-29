package io.github.fergoman123.fergotools.helper;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.util.item.AM;
import io.github.fergoman123.fergotools.util.item.TM;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemHelper
{
    public static Item getRepairItemForArmor(ArmorMaterial material)
    {
        if (material == AM.quartzArmor)
        {
            return Items.quartz;
        }
        else if (material == AM.obsidianArmor)
        {
            return FTContent.ingotObsidian;
        }
        else if (material == AM.emeraldArmor)
        {
            return FTContent.gemEmerald;
        }
        else if (material == AM.lapisArmor)
        {
            return FTContent.gemLapis;
        }
        else if (material == AM.bronzeArmor)
        {
            return FTContent.ingotBronze;
        }
        else if (material == AM.coalArmor)
        {
            return FTContent.ingotCoal;
        }
        else if (material == AM.glowstoneArmor)
        {
            return FTContent.ingotGlowstone;
        }
        else if (material == AM.adamantiumArmor)
        {
            return FTContent.ingotAdamantium;
        }
        else if (material == AM.redstoneArmor)
        {
            return FTContent.gemRedstone;
        }
        else {
            return null;
        }
    }

    public static Item getRepairItemForTool(ToolMaterial material)
    {
        if (material == TM.quartz)
        {
            return Items.quartz;
        }
        else if (material == TM.obsidian)
        {
            return FTContent.ingotObsidian;
        }
        else if (material == TM.emerald)
        {
            return FTContent.gemEmerald;
        }
        else if (material == TM.lapis)
        {
            return FTContent.gemLapis;
        }
        else if (material == TM.bronze)
        {
            return FTContent.ingotBronze;
        }
        else if (material == TM.coal)
        {
            return FTContent.ingotCoal;
        }
        else if (material == TM.glowstone)
        {
            return FTContent.ingotGlowstone;
        }
        else if (material == TM.adamantium)
        {
            return FTContent.ingotAdamantium;
        }
        else if (material == TM.redstone)
        {
            return FTContent.gemRedstone;
        }
        else {
            return null;
        }
    }

    public static String getArmorTextureForArmor(ArmorMaterial material)
    {
        if (material == AM.quartzArmor)
        {
            return "quartz";
        }
        else if (material == AM.obsidianArmor)
        {
            return "obsidian";
        }
        else if (material == AM.emeraldArmor)
        {
            return "emerald";
        }
        else if (material == AM.lapisArmor)
        {
            return "lapis";
        }
        else if (material == AM.bronzeArmor)
        {
            return "bronze";
        }
        else if (material == AM.coalArmor)
        {
            return "coal";
        }
        else if (material == AM.glowstoneArmor)
        {
            return "glowstone";
        }
        else if (material == AM.adamantiumArmor)
        {
            return "adamantium";
        }
        else if (material == AM.redstoneArmor)
        {
            return "redstone";
        }
        else {
            return null;
        }
    }

    public static String getTextureFolder(ToolMaterial material)
    {
        if (material == TM.quartz)
        {
            return "quartz";
        }
        else if (material == TM.obsidian)
        {
            return "obsidian";
        }
        else if (material == TM.emerald)
        {
            return "emerald";
        }
        else if (material == TM.lapis)
        {
            return "lapis";
        }
        else if (material == TM.bronze)
        {
            return "bronze";
        }
        else if (material == TM.coal)
        {
            return "coal";
        }
        else if (material == TM.glowstone)
        {
            return "glowstone";
        }
        else if (material == TM.adamantium)
        {
            return "adamantium";
        }
        else if (material == TM.silk)
        {
            return "silk";
        }
        else if (material == TM.redstone)
        {
            return "redstone";
        }
        else
        {
            return null;
        }
    }

    public static String getBowName(ToolMaterial material)
    {
        if (material == TM.quartz)
        {
            return "Quartz";
        }
        else if (material == TM.obsidian)
        {
            return "Obsidian";
        }
        else if (material == TM.emerald)
        {
            return "Emerald";
        }
        else if (material == TM.lapis)
        {
            return "Lapis";
        }
        else if (material == TM.bronze)
        {
            return "Bronze";
        }
        else if (material == TM.coal)
        {
            return "Coal";
        }
        else if (material == TM.glowstone)
        {
            return "Glowstone";
        }
        else if (material == TM.adamantium)
        {
            return "Adamantium";
        }
        else if (material == TM.silk)
        {
            return "Silk";
        }
        else if (material == TM.redstone)
        {
            return "Redstone";
        }
        else
        {
            return null;
        }
    }
}

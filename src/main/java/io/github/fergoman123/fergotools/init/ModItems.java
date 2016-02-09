package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.handler.ConfigHandler;
import io.github.fergoman123.fergotools.item.*;
import io.github.fergoman123.fergotools.item.tool.*;
import io.github.fergoman123.fergotools.material.ToolMaterials;
import io.github.fergoman123.fergotools.reference.ItemNames;
import io.github.fergoman123.fergotools.resloc.ModelResLocFT;
import io.github.fergoman123.fergotools.resloc.ResLocFT;
import io.github.fergoman123.fergotools.tab.CTFT;
import io.github.fergoman123.fergoutil.helper.ConfigHelper;
import io.github.fergoman123.fergoutil.item.ItemMultiFergo;
import io.github.fergoman123.fergoutil.model.ModelHelper;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import javax.print.attribute.standard.MediaSize;

public class ModItems {

    public static Item ingotObsidian;
    public static Item gemEmerald;
    public static Item gemLapis;
    public static Item ingotBronze;
    public static Item ingotCoal;
    public static Item ingotGlowstone;
    public static Item ingotAdamantium;
    public static Item gemSilk;
    public static Item gemRedstone;

    public static ItemMultiFT gemExp;

    public static ItemMultiFT staffExp;

    public static Item shardExp;
    public static Item expCollector;

    public static ItemPickaxeFT quartzPickaxe;
    public static ItemShovelFT quartzShovel;
    public static ItemAxeFT quartzAxe;
    public static ItemHoeFT quartzHoe;
    public static ItemSwordFT quartzSword;

    public static ItemPickaxeFT obsidianPickaxe;
    public static ItemShovelFT obsidianShovel;
    public static ItemAxeFT obsidianAxe;
    public static ItemHoeFT obsidianHoe;
    public static ItemSwordFT obsidianSword;

    public static ItemPickaxeFT emeraldPickaxe;
    public static ItemShovelFT emeraldShovel;
    public static ItemAxeFT emeraldAxe;
    public static ItemHoeFT emeraldHoe;
    public static ItemSwordFT emeraldSword;

    public static ItemPickaxeFT lapisPickaxe;
    public static ItemShovelFT lapisShovel;
    public static ItemAxeFT lapisAxe;
    public static ItemHoeFT lapisHoe;
    public static ItemSwordFT  lapisSword;

    public static ItemPickaxeFT adamantiumPickaxe;
    public static ItemShovelFT adamantiumShovel;
    public static ItemAxeFT adamantiumAxe;
    public static ItemHoeFT adamantiumHoe;
    public static ItemSwordFT adamantiumSword;

    public static ItemArmorFT adamantiumHelmet;
    public static ItemArmorFT adamantiumChestplate;
    public static ItemArmorFT adamantiumLeggings;
    public static ItemArmorFT adamantiumBoots;

    public static void addItems() {
        ingotObsidian = new Item().setCreativeTab(CTFT.tabFergoItems).setUnlocalizedName("fergotools." + ItemNames.ingotObsidian);
        gemEmerald = new Item().setCreativeTab(CTFT.tabFergoItems).setUnlocalizedName("fergotools." + ItemNames.gemEmerald);
        gemLapis = new Item().setCreativeTab(CTFT.tabFergoItems).setUnlocalizedName("fergotools." + ItemNames.gemLapis);
        ingotBronze = new Item().setCreativeTab(CTFT.tabFergoItems).setUnlocalizedName("fergotools." + ItemNames.ingotBronze);
        ingotCoal = new Item().setCreativeTab(CTFT.tabFergoItems).setUnlocalizedName("fergotools." + ItemNames.ingotCoal);
        ingotGlowstone = new Item().setCreativeTab(CTFT.tabFergoItems).setUnlocalizedName("fergotools." + ItemNames.ingotGlowstone);
        ingotAdamantium = new Item().setCreativeTab(CTFT.tabFergoItems).setUnlocalizedName(ItemNames.ingotAdamantium);
        gemSilk = new Item().setCreativeTab(CTFT.tabFergoItems).setUnlocalizedName("fergotools." + ItemNames.gemSilk);
        gemRedstone = new Item().setCreativeTab(CTFT.tabFergoItems).setUnlocalizedName("fergotools." + ItemNames.gemRedstone);

        gemExp = new ItemGemExp().setCreativeTab(CTFT.tabFergoMisc).setUnlocalizedName(ItemNames.gemExp);

        staffExp = new ItemStaffExp().setCreativeTab(CTFT.tabFergoMisc).setUnlocalizedName(ItemNames.staffExp);

        shardExp = new ItemShardExp().setCreativeTab(CTFT.tabFergoItems).setUnlocalizedName("fergotools." + ItemNames.shardExp);
        expCollector = new Item().setCreativeTab(CTFT.tabFergoItems).setUnlocalizedName("fergotools." + ItemNames.expCollector);

        quartzPickaxe = new ItemPickaxeFT(ToolMaterials.quartz, ItemNames.quartzPickaxe);
        quartzShovel = new ItemShovelFT(ToolMaterials.quartz, ItemNames.quartzShovel);
        quartzAxe = new ItemAxeFT(ToolMaterials.quartz, ItemNames.quartzAxe);
        quartzHoe = new ItemHoeFT(ToolMaterials.quartz, ItemNames.quartzHoe);
        quartzSword = new ItemSwordFT(ToolMaterials.quartz, ItemNames.quartzSword);

        obsidianPickaxe = new ItemPickaxeFT(ToolMaterials.obsidian, ItemNames.obsidianPickaxe);
        obsidianShovel = new ItemShovelFT(ToolMaterials.obsidian, ItemNames.obsidianShovel);
        obsidianAxe = new ItemAxeFT(ToolMaterials.obsidian, ItemNames.obsidianAxe);
        obsidianHoe = new ItemHoeFT(ToolMaterials.obsidian, ItemNames.obsidianHoe);
        obsidianSword = new ItemSwordFT(ToolMaterials.obsidian, ItemNames.obsidianSword);

        emeraldPickaxe = new ItemPickaxeFT(ToolMaterials.emerald, ItemNames.emeraldPickaxe);
        emeraldShovel = new ItemShovelFT(ToolMaterials.emerald, ItemNames.emeraldShovel);
        emeraldAxe = new ItemAxeFT(ToolMaterials.emerald, ItemNames.emeraldAxe);
        emeraldHoe = new ItemHoeFT(ToolMaterials.emerald, ItemNames.emeraldHoe);
        emeraldSword = new ItemSwordFT(ToolMaterials.emerald, ItemNames.emeraldSword);

        if (ConfigHandler.adamantiumToolsEnabled){
            adamantiumPickaxe = new ItemPickaxeFT(ToolMaterials.adamantium, ItemNames.adamantiumPickaxe);
            adamantiumShovel = new ItemShovelFT(ToolMaterials.adamantium, ItemNames.adamantiumShovel);
            adamantiumAxe = new ItemAxeFT(ToolMaterials.adamantium, ItemNames.adamantiumAxe);
            adamantiumHoe = new ItemHoeFT(ToolMaterials.adamantium, ItemNames.adamantiumHoe);
            adamantiumSword = new ItemSwordFT(ToolMaterials.adamantium, ItemNames.adamantiumSword);
        }
    }

    public static void registerItems() {

        GameRegistry.registerItem(ingotObsidian, ItemNames.ingotObsidian);
        GameRegistry.registerItem(gemEmerald, ItemNames.gemEmerald);
        GameRegistry.registerItem(gemLapis, ItemNames.gemLapis);
        GameRegistry.registerItem(ingotBronze, ItemNames.ingotBronze);
        GameRegistry.registerItem(ingotCoal, ItemNames.ingotCoal);
        GameRegistry.registerItem(ingotGlowstone, ItemNames.ingotGlowstone);
        GameRegistry.registerItem(ingotAdamantium, ItemNames.ingotAdamantium);
        GameRegistry.registerItem(gemSilk, ItemNames.gemSilk);
        GameRegistry.registerItem(gemRedstone, ItemNames.gemRedstone);

        GameRegistry.registerItem(gemExp, ItemNames.gemExp);
        GameRegistry.registerItem(staffExp, ItemNames.staffExp);

        GameRegistry.registerItem(shardExp, ItemNames.shardExp);
        GameRegistry.registerItem(expCollector, ItemNames.expCollector);

        GameRegistry.registerItem(quartzPickaxe, ItemNames.quartzPickaxe);
        GameRegistry.registerItem(quartzShovel, ItemNames.quartzShovel);
        GameRegistry.registerItem(quartzAxe, ItemNames.quartzAxe);
        GameRegistry.registerItem(quartzHoe, ItemNames.quartzHoe);
        GameRegistry.registerItem(quartzSword, ItemNames.quartzSword);

        GameRegistry.registerItem(obsidianPickaxe, ItemNames.obsidianPickaxe);
        GameRegistry.registerItem(obsidianShovel, ItemNames.obsidianShovel);
        GameRegistry.registerItem(obsidianAxe, ItemNames.obsidianAxe);
        GameRegistry.registerItem(obsidianHoe, ItemNames.obsidianHoe);
        GameRegistry.registerItem(obsidianSword, ItemNames.obsidianSword);

        GameRegistry.registerItem(emeraldPickaxe, ItemNames.emeraldPickaxe);
        GameRegistry.registerItem(emeraldShovel, ItemNames.emeraldShovel);
        GameRegistry.registerItem(emeraldAxe, ItemNames.emeraldAxe);
        GameRegistry.registerItem(emeraldHoe, ItemNames.emeraldHoe);
        GameRegistry.registerItem(emeraldSword, ItemNames.emeraldSword);

        register(ingotObsidian, 0, ItemNames.ingotObsidian);
        register(gemEmerald, 0, ItemNames.gemEmerald);
        register(gemLapis, 0, ItemNames.gemLapis);
        register(ingotBronze, 0, ItemNames.ingotBronze);
        register(ingotCoal, 0, ItemNames.ingotCoal);
        register(ingotGlowstone, 0, ItemNames.ingotGlowstone);
        register(ingotAdamantium, 0, ItemNames.ingotAdamantium);
        register(gemSilk, 0, ItemNames.gemSilk);
        register(gemRedstone, 0, ItemNames.gemRedstone);

        register(gemExp, 0, ItemNames.gemExp);
        register(gemExp, 1, ItemNames.gemExp2);
        register(gemExp, 2, ItemNames.gemExp3);

        register(staffExp, 0, ItemStaffExp.names[0]);
        register(staffExp, 1, ItemStaffExp.names[1]);
        register(staffExp, 2, ItemStaffExp.names[2]);

        register(shardExp, 0, ItemNames.shardExp);
        register(expCollector, 0, ItemNames.expCollector);

        register(quartzPickaxe, 0, ItemNames.quartzPickaxe);
        register(quartzShovel, 0, ItemNames.quartzShovel);
        register(quartzAxe, 0, ItemNames.quartzAxe);
        register(quartzHoe, 0, ItemNames.quartzHoe);
        register(quartzSword, 0, ItemNames.quartzSword);

        register(obsidianPickaxe, 0, ItemNames.obsidianPickaxe);
        register(obsidianShovel, 0, ItemNames.obsidianShovel);
        register(obsidianAxe, 0, ItemNames.obsidianAxe);
        register(obsidianHoe, 0, ItemNames.obsidianHoe);
        register(obsidianSword, 0, ItemNames.obsidianSword);

        register(emeraldPickaxe, 0, ItemNames.emeraldPickaxe);
        register(emeraldShovel, 0, ItemNames.emeraldShovel);
        register(emeraldAxe, 0, ItemNames.emeraldAxe);
        register(emeraldHoe, 0, ItemNames.emeraldHoe);
        register(emeraldSword, 0, ItemNames.emeraldSword);

        variant(ingotObsidian, ItemNames.ingotObsidian);
        variant(gemEmerald, ItemNames.gemEmerald);
        variant(gemLapis, ItemNames.gemLapis);
        variant(ingotBronze, ItemNames.ingotBronze);
        variant(ingotCoal, ItemNames.ingotCoal);
        variant(ingotGlowstone, ItemNames.ingotGlowstone);
        variant(ingotAdamantium, ItemNames.ingotAdamantium);
        variant(gemSilk, ItemNames.gemSilk);
        variant(gemRedstone, ItemNames.gemRedstone);

        variant(gemExp, ItemNames.gemExp);
        variant(gemExp, ItemNames.gemExp2);
        variant(gemExp, ItemNames.gemExp3);

        for(String variant : ItemStaffExp.names){
            variant(staffExp, variant);
        }

        variant(shardExp, ItemNames.shardExp);
        variant(expCollector, ItemNames.expCollector);

        variant(quartzPickaxe, ItemNames.quartzPickaxe);
        variant(quartzShovel, ItemNames.quartzShovel);
        variant(quartzAxe, ItemNames.quartzAxe);
        variant(quartzHoe, ItemNames.quartzHoe);
        variant(quartzSword, ItemNames.quartzSword);

        variant(obsidianPickaxe, ItemNames.obsidianPickaxe);
        variant(obsidianShovel, ItemNames.obsidianShovel);
        variant(obsidianAxe, ItemNames.obsidianAxe);
        variant(obsidianHoe, ItemNames.obsidianHoe);
        variant(obsidianSword, ItemNames.obsidianSword);

        variant(emeraldPickaxe, ItemNames.emeraldPickaxe);
        variant(emeraldShovel, ItemNames.emeraldShovel);
        variant(emeraldAxe, ItemNames.emeraldAxe);
        variant(emeraldHoe, ItemNames.emeraldHoe);
        variant(emeraldSword, ItemNames.emeraldSword);
    }

    private static void register(Item item, int meta, String name){
        ModelHelper.getModelMesher().register(item, meta, new ModelResLocFT(name));
    }

    private static void variant(Item item, String name){
        ModelBakery.registerItemVariants(item, new ResLocFT(name));
    }
}

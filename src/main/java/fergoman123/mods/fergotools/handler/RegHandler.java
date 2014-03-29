package fergoman123.mods.fergotools.handler;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.block.ModBlocks;
import fergoman123.mods.fergotools.item.ModItems;
import fergoman123.mods.fergotools.lib.strings.Strings;
import fergoman123.mods.fergotools.tileentity.*;

import static fergoman123.mods.fergotools.util.RegisterUtil.*;

/**
 * Created by Fergoman123 on 17/03/14.
 */
public class RegHandler {

    public static GuiHandler handler = new GuiHandler();
    public static EventHandler event = new EventHandler();

    public static void registerBlocks()
    {
        registerBlock(ModBlocks.oreExperience, Strings.ores[0]);
        registerBlock(ModBlocks.oreObsidian, Strings.ores[1]);
        registerBlock(ModBlocks.oreEmeraldCrystal, Strings.ores[2]);
        registerBlock(ModBlocks.oreLapisCrystal, Strings.ores[3]);
        registerBlock(ModBlocks.oreBronze, Strings.ores[4]);
        registerBlock(ModBlocks.oreAdamantium, Strings.ores[5]);

        registerBlock(ModBlocks.blockExperience, Strings.blocks[0]);
        registerBlock(ModBlocks.blockObsidian, Strings.blocks[1]);
        registerBlock(ModBlocks.blockEmeraldCrystal, Strings.blocks[2]);
        registerBlock(ModBlocks.blockLapisCrystal, Strings.blocks[3]);
        registerBlock(ModBlocks.blockBronze, Strings.blocks[4]);
        registerBlock(ModBlocks.blockCoal, Strings.blocks[5]);
        registerBlock(ModBlocks.blockGlowstone, Strings.blocks[6]);
        registerBlock(ModBlocks.blockAdamantium, Strings.blocks[7]);

        registerBlock(ModBlocks.quartzFurnaceIdle, Strings.quartzFurnace[0]);
        registerBlock(ModBlocks.obsidianFurnaceIdle, Strings.obsidianFurnace[0]);
        registerBlock(ModBlocks.emeraldCrystalFurnaceIdle, Strings.emeraldCrystalFurnace[0]);
        registerBlock(ModBlocks.lapisCrystalFurnaceIdle, Strings.lapisCrystalFurnace[0]);
        registerBlock(ModBlocks.bronzeFurnaceIdle, Strings.bronzeFurnace[0]);
        registerBlock(ModBlocks.coalFurnaceIdle, Strings.coalFurnace[0]);
        registerBlock(ModBlocks.glowstoneFurnaceIdle, Strings.glowstoneFurnace[0]);
        registerBlock(ModBlocks.adamantiumFurnaceIdle, Strings.adamantiumFurnace[0]);

        registerBlock(ModBlocks.quartzFurnaceActive, Strings.quartzFurnace[1]);
        registerBlock(ModBlocks.obsidianFurnaceActive, Strings.obsidianFurnace[1]);
        registerBlock(ModBlocks.emeraldCrystalFurnaceActive, Strings.emeraldCrystalFurnace[1]);
        registerBlock(ModBlocks.lapisCrystalFurnaceActive, Strings.lapisCrystalFurnace[1]);
        registerBlock(ModBlocks.bronzeFurnaceActive, Strings.bronzeFurnace[1]);
        registerBlock(ModBlocks.coalFurnaceActive, Strings.coalFurnace[1]);
        registerBlock(ModBlocks.glowstoneFurnaceActive, Strings.glowstoneFurnace[1]);
        registerBlock(ModBlocks.adamantiumFurnaceActive, Strings.adamantiumFurnace[1]);
    }

    public static void registerTileEntities()
    {
        registerTileEntity(TileEntityQuartzFurnace.class, Strings.tilePrefix + "QuartzFurnace");
        registerTileEntity(TileEntityObsidianFurnace.class, Strings.tilePrefix + "ObsidianFurnace");
        registerTileEntity(TileEntityEmeraldCrystalFurnace.class, Strings.tilePrefix + "EmeraldCrystalFurnace");
        registerTileEntity(TileEntityLapisCrystalFurnace.class, Strings.tilePrefix + "LapisCrystalFurnace");
        registerTileEntity(TileEntityBronzeFurnace.class, Strings.tilePrefix + "BronzeFurnace");
        registerTileEntity(TileEntityCoalFurnace.class, Strings.tilePrefix + "CoalFurnace");
        registerTileEntity(TileEntityGlowstoneFurnace.class, Strings.tilePrefix + "GlowstoneFurnace");
        registerTileEntity(TileEntityAdamantiumFurnace.class, Strings.tilePrefix + "AdamantiumFurnace");
    }

    public static void registerItems()
    {
        registerItem(ModItems.quartzPickaxe, Strings.quartzTool[0]);
        registerItem(ModItems.quartzShovel, Strings.quartzTool[1]);
        registerItem(ModItems.quartzAxe, Strings.quartzTool[2]);
        registerItem(ModItems.quartzHoe, Strings.quartzTool[3]);
        registerItem(ModItems.quartzSword, Strings.quartzTool[4]);

        registerItem(ModItems.obsidianPickaxe, Strings.obsidianTool[0]);
        registerItem(ModItems.obsidianShovel, Strings.obsidianTool[1]);
        registerItem(ModItems.obsidianAxe, Strings.obsidianTool[2]);
        registerItem(ModItems.obsidianHoe, Strings.obsidianTool[3]);
        registerItem(ModItems.obsidianSword, Strings.obsidianTool[4]);

        registerItem(ModItems.emeraldPickaxe, Strings.emeraldTool[0]);
        registerItem(ModItems.emeraldShovel, Strings.emeraldTool[1]);
        registerItem(ModItems.emeraldAxe, Strings.emeraldTool[2]);
        registerItem(ModItems.emeraldHoe, Strings.emeraldTool[3]);
        registerItem(ModItems.emeraldSword, Strings.emeraldTool[4]);

        registerItem(ModItems.lapisPickaxe, Strings.lapisTool[0]);
        registerItem(ModItems.lapisShovel, Strings.lapisTool[1]);
        registerItem(ModItems.lapisAxe, Strings.lapisTool[2]);
        registerItem(ModItems.lapisHoe, Strings.lapisTool[3]);
        registerItem(ModItems.lapisSword, Strings.lapisTool[4]);

        registerItem(ModItems.bronzePickaxe, Strings.bronzeTool[0]);
        registerItem(ModItems.bronzeShovel, Strings.bronzeTool[1]);
        registerItem(ModItems.bronzeAxe, Strings.bronzeTool[2]);
        registerItem(ModItems.bronzeHoe, Strings.bronzeTool[3]);
        registerItem(ModItems.bronzeSword, Strings.bronzeTool[4]);

        registerItem(ModItems.coalPickaxe, Strings.coalTool[0]);
        registerItem(ModItems.coalShovel, Strings.coalTool[1]);
        registerItem(ModItems.coalAxe, Strings.coalTool[2]);
        registerItem(ModItems.coalHoe, Strings.coalTool[3]);
        registerItem(ModItems.coalSword, Strings.coalTool[4]);

        registerItem(ModItems.glowstonePickaxe, Strings.glowstoneTool[0]);
        registerItem(ModItems.glowstoneShovel, Strings.glowstoneTool[1]);
        registerItem(ModItems.glowstoneAxe, Strings.glowstoneTool[2]);
        registerItem(ModItems.glowstoneHoe, Strings.glowstoneTool[3]);
        registerItem(ModItems.glowstoneSword, Strings.glowstoneTool[4]);

        registerItem(ModItems.adamantiumPickaxe, Strings.adamantiumTool[0]);
        registerItem(ModItems.adamantiumShovel, Strings.adamantiumTool[1]);
        registerItem(ModItems.adamantiumAxe, Strings.adamantiumTool[2]);
        registerItem(ModItems.adamantiumHoe, Strings.adamantiumTool[3]);
        registerItem(ModItems.adamantiumSword, Strings.adamantiumTool[4]);

        registerItem(ModItems.obsidianIngot, Strings.modItems[0]);
        registerItem(ModItems.emeraldCrystal, Strings.modItems[1]);
        registerItem(ModItems.lapisCrystal, Strings.modItems[2]);
        registerItem(ModItems.bronzeIngot, Strings.modItems[3]);
        registerItem(ModItems.coalIngot, Strings.modItems[4]);
        registerItem(ModItems.glowstoneIngot, Strings.modItems[5]);
        registerItem(ModItems.adamantiumIngot, Strings.modItems[6]);
        registerItem(ModItems.expShard, Strings.modItems[7]);

        registerItem(ModItems.quartzHelmet, Strings.quartzArmorKey[0]);
        registerItem(ModItems.quartzChestplate, Strings.quartzArmorKey[1]);
        registerItem(ModItems.quartzLeggings, Strings.quartzArmorKey[2]);
        registerItem(ModItems.quartzBoots, Strings.quartzArmorKey[3]);

        registerItem(ModItems.obsidianHelmet, Strings.obsidianArmorKey[0]);
        registerItem(ModItems.obsidianChestplate, Strings.obsidianArmorKey[1]);
        registerItem(ModItems.obsidianLeggings, Strings.obsidianArmorKey[2]);
        registerItem(ModItems.obsidianBoots, Strings.obsidianArmorKey[3]);

        registerItem(ModItems.emeraldHelmet, Strings.emeraldArmorKey[0]);
        registerItem(ModItems.emeraldChestplate, Strings.emeraldArmorKey[1]);
        registerItem(ModItems.emeraldLeggings, Strings.emeraldArmorKey[2]);
        registerItem(ModItems.emeraldBoots, Strings.emeraldArmorKey[3]);

        registerItem(ModItems.lapisHelmet, Strings.lapisArmorKey[0]);
        registerItem(ModItems.lapisChestplate, Strings.lapisArmorKey[1]);
        registerItem(ModItems.lapisLeggings, Strings.lapisArmorKey[2]);
        registerItem(ModItems.lapisBoots, Strings.lapisArmorKey[3]);

        registerItem(ModItems.bronzeHelmet, Strings.bronzeArmorKey[0]);
        registerItem(ModItems.bronzeChestplate, Strings.bronzeArmorKey[1]);
        registerItem(ModItems.bronzeLeggings, Strings.bronzeArmorKey[2]);
        registerItem(ModItems.bronzeBoots, Strings.bronzeArmorKey[3]);

        registerItem(ModItems.coalHelmet, Strings.coalArmorKey[0]);
        registerItem(ModItems.coalChestplate, Strings.coalArmorKey[1]);
        registerItem(ModItems.coalLeggings, Strings.coalArmorKey[2]);
        registerItem(ModItems.coalBoots, Strings.coalArmorKey[3]);

        registerItem(ModItems.glowstoneHelmet, Strings.glowstoneArmorKey[0]);
        registerItem(ModItems.glowstoneChestplate, Strings.glowstoneArmorKey[1]);
        registerItem(ModItems.glowstoneLeggings, Strings.glowstoneArmorKey[2]);
        registerItem(ModItems.glowstoneBoots, Strings.glowstoneArmorKey[3]);
        
        registerItem(ModItems.quartzBow, Strings.bows[0]);
//        registerItem(ModItems.obsidianBow, Strings.bows[1]);
//        registerItem(ModItems.emeraldBow, Strings.bows[2]);
//        registerItem(ModItems.lapisBow, Strings.bows[3]);
//        registerItem(ModItems.bronzeBow, Strings.bows[4]);
//        registerItem(ModItems.coalBow, Strings.bows[5]);
//        registerItem(ModItems.glowstoneBow, Strings.bows[6]);
//        registerItem(ModItems.adamantiumBow, Strings.bows[7]);

    }

    public static void registerGuiHandlers()
    {
        registerGuiHandler(FergoTools.instance, handler);
    }

    public static void registerWorldGen()
    {
        registerWorldGenerator(event, 0);
    }
}

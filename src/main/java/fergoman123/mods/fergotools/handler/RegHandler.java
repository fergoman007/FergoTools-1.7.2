package fergoman123.mods.fergotools.handler;

import cpw.mods.fml.common.network.IGuiHandler;
import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.block.ModBlocks;
import fergoman123.mods.fergotools.gui.*;
import fergoman123.mods.fergotools.gui.container.*;
import fergoman123.mods.fergotools.item.ModItems;
import fergoman123.mods.fergotools.lib.strings.*;
import fergoman123.mods.fergotools.tileentity.FergoToolsTileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import static fergoman123.mods.fergotools.util.RegisterUtil.*;

public class RegHandler {
    public static EventHandler event = new EventHandler();

    public static void registerBlocks()
    {
        registerBlock(ModBlocks.oreExperience, BlockStrings.ores[0]);
        registerBlock(ModBlocks.oreObsidian, BlockStrings.ores[1]);
        registerBlock(ModBlocks.oreEmeraldCrystal, BlockStrings.ores[2]);
        registerBlock(ModBlocks.oreLapisCrystal, BlockStrings.ores[3]);
        registerBlock(ModBlocks.oreBronze, BlockStrings.ores[4]);
        registerBlock(ModBlocks.oreAdamantium, BlockStrings.ores[5]);

        registerBlock(ModBlocks.blockExperience, BlockStrings.blocks[0]);
        registerBlock(ModBlocks.blockObsidian, BlockStrings.blocks[1]);
        registerBlock(ModBlocks.blockEmeraldCrystal, BlockStrings.blocks[2]);
        registerBlock(ModBlocks.blockLapisCrystal, BlockStrings.blocks[3]);
        registerBlock(ModBlocks.blockBronze, BlockStrings.blocks[4]);
        registerBlock(ModBlocks.blockCoal, BlockStrings.blocks[5]);
        registerBlock(ModBlocks.blockGlowstone, BlockStrings.blocks[6]);
        registerBlock(ModBlocks.blockAdamantium, BlockStrings.blocks[7]);
        registerBlock(ModBlocks.blockSilkGem, BlockStrings.blocks[8]);

        registerBlock(ModBlocks.quartzFurnaceIdle, FurnaceStrings.quartzFurnace[0]);
        registerBlock(ModBlocks.obsidianFurnaceIdle, FurnaceStrings.obsidianFurnace[0]);
        registerBlock(ModBlocks.emeraldCrystalFurnaceIdle, FurnaceStrings.emeraldCrystalFurnace[0]);
        registerBlock(ModBlocks.lapisCrystalFurnaceIdle, FurnaceStrings.lapisCrystalFurnace[0]);
        registerBlock(ModBlocks.bronzeFurnaceIdle, FurnaceStrings.bronzeFurnace[0]);
        registerBlock(ModBlocks.coalFurnaceIdle, FurnaceStrings.coalFurnace[0]);
        registerBlock(ModBlocks.glowstoneFurnaceIdle, FurnaceStrings.glowstoneFurnace[0]);
        registerBlock(ModBlocks.adamantiumFurnaceIdle, FurnaceStrings.adamantiumFurnace[0]);

        registerBlock(ModBlocks.quartzFurnaceActive, FurnaceStrings.quartzFurnace[1]);
        registerBlock(ModBlocks.obsidianFurnaceActive, FurnaceStrings.obsidianFurnace[1]);
        registerBlock(ModBlocks.emeraldCrystalFurnaceActive, FurnaceStrings.emeraldCrystalFurnace[1]);
        registerBlock(ModBlocks.lapisCrystalFurnaceActive, FurnaceStrings.lapisCrystalFurnace[1]);
        registerBlock(ModBlocks.bronzeFurnaceActive, FurnaceStrings.bronzeFurnace[1]);
        registerBlock(ModBlocks.coalFurnaceActive, FurnaceStrings.coalFurnace[1]);
        registerBlock(ModBlocks.glowstoneFurnaceActive, FurnaceStrings.glowstoneFurnace[1]);
        registerBlock(ModBlocks.adamantiumFurnaceActive, FurnaceStrings.adamantiumFurnace[1]);
    }

    public static void registerTileEntities()
    {
        registerTileEntity(FergoToolsTileEntity.TileEntityQuartzFurnace.class, TileStrings.tilePrefix + "QuartzFurnace");
        registerTileEntity(FergoToolsTileEntity.TileEntityObsidianFurnace.class, TileStrings.tilePrefix + "ObsidianFurnace");
        registerTileEntity(FergoToolsTileEntity.TileEntityEmeraldCrystalFurnace.class, TileStrings.tilePrefix + "EmeraldCrystalFurnace");
        registerTileEntity(FergoToolsTileEntity.TileEntityLapisCrystalFurnace.class, TileStrings.tilePrefix + "LapisCrystalFurnace");
        registerTileEntity(FergoToolsTileEntity.TileEntityBronzeFurnace.class, TileStrings.tilePrefix + "BronzeFurnace");
        registerTileEntity(FergoToolsTileEntity.TileEntityCoalFurnace.class, TileStrings.tilePrefix + "CoalFurnace");
        registerTileEntity(FergoToolsTileEntity.TileEntityGlowstoneFurnace.class, TileStrings.tilePrefix + "GlowstoneFurnace");
        registerTileEntity(FergoToolsTileEntity.TileEntityAdamantiumFurnace.class, TileStrings.tilePrefix + "AdamantiumFurnace");
    }

    public static void registerItems()
    {
        registerItem(ModItems.quartzPickaxe, ToolStrings.quartzTool[0]);
        registerItem(ModItems.quartzShovel, ToolStrings.quartzTool[1]);
        registerItem(ModItems.quartzAxe, ToolStrings.quartzTool[2]);
        registerItem(ModItems.quartzHoe, ToolStrings.quartzTool[3]);
        registerItem(ModItems.quartzSword, ToolStrings.quartzTool[4]);

        registerItem(ModItems.obsidianPickaxe, ToolStrings.obsidianTool[0]);
        registerItem(ModItems.obsidianShovel, ToolStrings.obsidianTool[1]);
        registerItem(ModItems.obsidianAxe, ToolStrings.obsidianTool[2]);
        registerItem(ModItems.obsidianHoe, ToolStrings.obsidianTool[3]);
        registerItem(ModItems.obsidianSword, ToolStrings.obsidianTool[4]);

        registerItem(ModItems.emeraldPickaxe, ToolStrings.emeraldTool[0]);
        registerItem(ModItems.emeraldShovel, ToolStrings.emeraldTool[1]);
        registerItem(ModItems.emeraldAxe, ToolStrings.emeraldTool[2]);
        registerItem(ModItems.emeraldHoe, ToolStrings.emeraldTool[3]);
        registerItem(ModItems.emeraldSword, ToolStrings.emeraldTool[4]);

        registerItem(ModItems.lapisPickaxe, ToolStrings.lapisTool[0]);
        registerItem(ModItems.lapisShovel, ToolStrings.lapisTool[1]);
        registerItem(ModItems.lapisAxe, ToolStrings.lapisTool[2]);
        registerItem(ModItems.lapisHoe, ToolStrings.lapisTool[3]);
        registerItem(ModItems.lapisSword, ToolStrings.lapisTool[4]);

        registerItem(ModItems.bronzePickaxe, ToolStrings.bronzeTool[0]);
        registerItem(ModItems.bronzeShovel, ToolStrings.bronzeTool[1]);
        registerItem(ModItems.bronzeAxe, ToolStrings.bronzeTool[2]);
        registerItem(ModItems.bronzeHoe, ToolStrings.bronzeTool[3]);
        registerItem(ModItems.bronzeSword, ToolStrings.bronzeTool[4]);

        registerItem(ModItems.coalPickaxe, ToolStrings.coalTool[0]);
        registerItem(ModItems.coalShovel, ToolStrings.coalTool[1]);
        registerItem(ModItems.coalAxe, ToolStrings.coalTool[2]);
        registerItem(ModItems.coalHoe, ToolStrings.coalTool[3]);
        registerItem(ModItems.coalSword, ToolStrings.coalTool[4]);

        registerItem(ModItems.glowstonePickaxe, ToolStrings.glowstoneTool[0]);
        registerItem(ModItems.glowstoneShovel, ToolStrings.glowstoneTool[1]);
        registerItem(ModItems.glowstoneAxe, ToolStrings.glowstoneTool[2]);
        registerItem(ModItems.glowstoneHoe, ToolStrings.glowstoneTool[3]);
        registerItem(ModItems.glowstoneSword, ToolStrings.glowstoneTool[4]);

        registerItem(ModItems.adamantiumPickaxe, ToolStrings.adamantiumTool[0]);
        registerItem(ModItems.adamantiumShovel, ToolStrings.adamantiumTool[1]);
        registerItem(ModItems.adamantiumAxe, ToolStrings.adamantiumTool[2]);
        registerItem(ModItems.adamantiumHoe, ToolStrings.adamantiumTool[3]);
        registerItem(ModItems.adamantiumSword, ToolStrings.adamantiumTool[4]);
        
        registerItem(ModItems.silkPickaxe, ToolStrings.silkTool[0]);
        registerItem(ModItems.silkShovel, ToolStrings.silkTool[1]);
        registerItem(ModItems.silkAxe, ToolStrings.silkTool[2]);
        registerItem(ModItems.silkHoe, ToolStrings.silkTool[3]);
        registerItem(ModItems.silkSword, ToolStrings.silkTool[4]);

        registerItem(ModItems.quartzHammer, ToolStrings.hammers[0]);
        registerItem(ModItems.obsidianHammer, ToolStrings.hammers[1]);

        registerItem(ModItems.obsidianIngot, ItemStrings.modItems[0]);
        registerItem(ModItems.emeraldCrystal, ItemStrings.modItems[1]);
        registerItem(ModItems.lapisCrystal, ItemStrings.modItems[2]);
        registerItem(ModItems.bronzeIngot, ItemStrings.modItems[3]);
        registerItem(ModItems.coalIngot, ItemStrings.modItems[4]);
        registerItem(ModItems.glowstoneIngot, ItemStrings.modItems[5]);
        registerItem(ModItems.adamantiumIngot, ItemStrings.modItems[6]);
        registerItem(ModItems.expShard, ItemStrings.modItems[7]);
        registerItem(ModItems.silkGem, ItemStrings.modItems[8]);

        registerItem(ModItems.quartzHelmet, ArmorStrings.quartzArmorKey[0]);
        registerItem(ModItems.quartzChestplate, ArmorStrings.quartzArmorKey[1]);
        registerItem(ModItems.quartzLeggings, ArmorStrings.quartzArmorKey[2]);
        registerItem(ModItems.quartzBoots, ArmorStrings.quartzArmorKey[3]);

        registerItem(ModItems.obsidianHelmet, ArmorStrings.obsidianArmorKey[0]);
        registerItem(ModItems.obsidianChestplate, ArmorStrings.obsidianArmorKey[1]);
        registerItem(ModItems.obsidianLeggings, ArmorStrings.obsidianArmorKey[2]);
        registerItem(ModItems.obsidianBoots, ArmorStrings.obsidianArmorKey[3]);

        registerItem(ModItems.emeraldHelmet, ArmorStrings.emeraldArmorKey[0]);
        registerItem(ModItems.emeraldChestplate, ArmorStrings.emeraldArmorKey[1]);
        registerItem(ModItems.emeraldLeggings, ArmorStrings.emeraldArmorKey[2]);
        registerItem(ModItems.emeraldBoots, ArmorStrings.emeraldArmorKey[3]);

        registerItem(ModItems.lapisHelmet, ArmorStrings.lapisArmorKey[0]);
        registerItem(ModItems.lapisChestplate, ArmorStrings.lapisArmorKey[1]);
        registerItem(ModItems.lapisLeggings, ArmorStrings.lapisArmorKey[2]);
        registerItem(ModItems.lapisBoots, ArmorStrings.lapisArmorKey[3]);

        registerItem(ModItems.bronzeHelmet, ArmorStrings.bronzeArmorKey[0]);
        registerItem(ModItems.bronzeChestplate, ArmorStrings.bronzeArmorKey[1]);
        registerItem(ModItems.bronzeLeggings, ArmorStrings.bronzeArmorKey[2]);
        registerItem(ModItems.bronzeBoots, ArmorStrings.bronzeArmorKey[3]);

        registerItem(ModItems.coalHelmet, ArmorStrings.coalArmorKey[0]);
        registerItem(ModItems.coalChestplate, ArmorStrings.coalArmorKey[1]);
        registerItem(ModItems.coalLeggings, ArmorStrings.coalArmorKey[2]);
        registerItem(ModItems.coalBoots, ArmorStrings.coalArmorKey[3]);

        registerItem(ModItems.glowstoneHelmet, ArmorStrings.glowstoneArmorKey[0]);
        registerItem(ModItems.glowstoneChestplate, ArmorStrings.glowstoneArmorKey[1]);
        registerItem(ModItems.glowstoneLeggings, ArmorStrings.glowstoneArmorKey[2]);
        registerItem(ModItems.glowstoneBoots, ArmorStrings.glowstoneArmorKey[3]);
        
        registerItem(ModItems.quartzBow, BowStrings.bows[0]);
        registerItem(ModItems.obsidianBow, BowStrings.bows[1]);
        registerItem(ModItems.emeraldBow, BowStrings.bows[2]);
        registerItem(ModItems.lapisBow, BowStrings.bows[3]);
        registerItem(ModItems.bronzeBow, BowStrings.bows[4]);
        registerItem(ModItems.coalBow, BowStrings.bows[5]);
        registerItem(ModItems.glowstoneBow, BowStrings.bows[6]);
        registerItem(ModItems.adamantiumBow, BowStrings.bows[7]);

    }

    public static class GuiHandler implements IGuiHandler {

        @Override
        public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
            TileEntity entity = world.getTileEntity(x, y, z);
            switch(ID)
            {
                case 0: return new ContainerQuartzFurnace(player.inventory, (FergoToolsTileEntity.TileEntityQuartzFurnace) entity);
                case 1: return new ContainerObsidianFurnace(player.inventory, (FergoToolsTileEntity.TileEntityObsidianFurnace)entity);
                case 2: return new ContainerEmeraldCrystalFurnace(player.inventory, (FergoToolsTileEntity.TileEntityEmeraldCrystalFurnace)entity);
                case 3: return new ContainerLapisCrystalFurnace(player.inventory, (FergoToolsTileEntity.TileEntityLapisCrystalFurnace)entity);
                case 4: return new ContainerBronzeFurnace(player.inventory, (FergoToolsTileEntity.TileEntityBronzeFurnace)entity);
                case 5: return new ContainerCoalFurnace(player.inventory, (FergoToolsTileEntity.TileEntityCoalFurnace)entity);
                case 6: return new ContainerGlowstoneFurnace(player.inventory, (FergoToolsTileEntity.TileEntityGlowstoneFurnace)entity);
                case 7: return new ContainerAdamantiumFurnace(player.inventory, (FergoToolsTileEntity.TileEntityAdamantiumFurnace)entity);
            }
            return null;
        }

        @Override
        public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
            TileEntity entity = world.getTileEntity(x, y, z);
            switch(ID)
            {
                case 0: return new GuiQuartzFurnace(player.inventory, (FergoToolsTileEntity.TileEntityQuartzFurnace) entity);
                case 1: return new GuiObsidianFurnace(player.inventory, (FergoToolsTileEntity.TileEntityObsidianFurnace)entity);
                case 2: return new GuiEmeraldCrystalFurnace(player.inventory, (FergoToolsTileEntity.TileEntityEmeraldCrystalFurnace)entity);
                case 3: return new GuiLapisCrystalFurnace(player.inventory, (FergoToolsTileEntity.TileEntityLapisCrystalFurnace)entity);
                case 4: return new GuiBronzeFurnace(player.inventory, (FergoToolsTileEntity.TileEntityBronzeFurnace)entity);
                case 5: return new GuiCoalFurnace(player.inventory, (FergoToolsTileEntity.TileEntityCoalFurnace)entity);
                case 6: return new GuiGlowstoneFurnace(player.inventory, (FergoToolsTileEntity.TileEntityGlowstoneFurnace)entity);
                case 7: return new GuiAdamantiumFurnace(player.inventory, (FergoToolsTileEntity.TileEntityAdamantiumFurnace)entity);
            }
            return null;
        }
    }

    public static void registerGuiHandlers()
    {
        registerGuiHandler(FergoTools.instance, new GuiHandler());
    }

    public static void registerWorldGen()
    {
        registerWorldGenerator(event, 0);
    }
}

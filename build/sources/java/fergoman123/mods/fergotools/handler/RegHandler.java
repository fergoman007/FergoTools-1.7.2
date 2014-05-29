package fergoman123.mods.fergotools.handler;

import cpw.mods.fml.common.network.IGuiHandler;
import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.gui.*;
import fergoman123.mods.fergotools.gui.container.*;
import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.tileentity.*;
import fergoman123.mods.fergoutil.helper.RegisterHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class RegHandler {

    public static EventHandler event = new EventHandler();
    public static GuiHandler handler = new GuiHandler();

    public static void init()
    {
        registerBlocks();
        registerFurnaces();
        registerArmor();
        registerTools();
        registerTileEntities();
        registerItems();
        registerBows();
        registerOther();
    }

    public static void registerFurnaces()
    {
        RegisterHelper.registerBlock(ModBlocks.quartzFurnaceIdle, FurnaceStrings.quartzFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.obsidianFurnaceIdle, FurnaceStrings.obsidianFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.emeraldCrystalFurnaceIdle, FurnaceStrings.emeraldCrystalFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.lapisCrystalFurnaceIdle, FurnaceStrings.lapisCrystalFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.bronzeFurnaceIdle, FurnaceStrings.bronzeFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.coalFurnaceIdle, FurnaceStrings.coalFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.glowstoneFurnaceIdle, FurnaceStrings.glowstoneFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.adamantiumFurnaceIdle, FurnaceStrings.adamantiumFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.silkFurnaceIdle, FurnaceStrings.silkFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.redstoneFurnaceIdle, FurnaceStrings.redstoneFurnaceIdle);

        RegisterHelper.registerBlock(ModBlocks.quartzFurnaceActive, FurnaceStrings.quartzFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.obsidianFurnaceActive, FurnaceStrings.obsidianFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.emeraldCrystalFurnaceActive, FurnaceStrings.emeraldCrystalFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.lapisCrystalFurnaceActive, FurnaceStrings.lapisCrystalFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.bronzeFurnaceActive, FurnaceStrings.bronzeFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.coalFurnaceActive, FurnaceStrings.coalFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.glowstoneFurnaceActive, FurnaceStrings.glowstoneFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.adamantiumFurnaceActive, FurnaceStrings.adamantiumFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.silkFurnaceActive, FurnaceStrings.silkFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.redstoneFurnaceActive, FurnaceStrings.redstoneFurnaceActive);
    }

    public static void registerArmor()
    {
        RegisterHelper.registerItem(ModItems.quartzHelmet, ArmorStrings.quartzHelmet);
        RegisterHelper.registerItem(ModItems.quartzChestplate, ArmorStrings.quartzChest);
        RegisterHelper.registerItem(ModItems.quartzLeggings, ArmorStrings.quartzLegs);
        RegisterHelper.registerItem(ModItems.quartzBoots, ArmorStrings.quartzBoots);

        RegisterHelper.registerItem(ModItems.obsidianHelmet, ArmorStrings.obsidianHelmet);
        RegisterHelper.registerItem(ModItems.obsidianChestplate, ArmorStrings.obsidianChest);
        RegisterHelper.registerItem(ModItems.obsidianLeggings, ArmorStrings.obsidianLegs);
        RegisterHelper.registerItem(ModItems.obsidianBoots, ArmorStrings.obsidianBoots);

        RegisterHelper.registerItem(ModItems.emeraldHelmet, ArmorStrings.emeraldHelmet);
        RegisterHelper.registerItem(ModItems.emeraldChestplate, ArmorStrings.emeraldChest);
        RegisterHelper.registerItem(ModItems.emeraldLeggings, ArmorStrings.emeraldLegs);
        RegisterHelper.registerItem(ModItems.emeraldBoots, ArmorStrings.emeraldBoots);

        RegisterHelper.registerItem(ModItems.lapisHelmet, ArmorStrings.lapisHelmet);
        RegisterHelper.registerItem(ModItems.lapisChestplate, ArmorStrings.lapisChest);
        RegisterHelper.registerItem(ModItems.lapisLeggings, ArmorStrings.lapisLegs);
        RegisterHelper.registerItem(ModItems.lapisBoots, ArmorStrings.lapisBoots);

        RegisterHelper.registerItem(ModItems.bronzeHelmet, ArmorStrings.bronzeHelmet);
        RegisterHelper.registerItem(ModItems.bronzeChestplate, ArmorStrings.bronzeChest);
        RegisterHelper.registerItem(ModItems.bronzeLeggings, ArmorStrings.bronzeLegs);
        RegisterHelper.registerItem(ModItems.bronzeBoots, ArmorStrings.bronzeBoots);

        RegisterHelper.registerItem(ModItems.coalHelmet, ArmorStrings.coalHelmet);
        RegisterHelper.registerItem(ModItems.coalChestplate, ArmorStrings.coalChest);
        RegisterHelper.registerItem(ModItems.coalLeggings, ArmorStrings.coalLegs);
        RegisterHelper.registerItem(ModItems.coalBoots, ArmorStrings.coalBoots);

        RegisterHelper.registerItem(ModItems.glowstoneHelmet, ArmorStrings.glowstoneHelmet);
        RegisterHelper.registerItem(ModItems.glowstoneChestplate, ArmorStrings.glowstoneChest);
        RegisterHelper.registerItem(ModItems.glowstoneLeggings, ArmorStrings.glowstoneLegs);
        RegisterHelper.registerItem(ModItems.glowstoneBoots, ArmorStrings.glowstoneBoots);

        RegisterHelper.registerItem(ModItems.redstoneHelmet, ArmorStrings.redstoneHelmet);
        RegisterHelper.registerItem(ModItems.redstoneChestplate, ArmorStrings.redstoneChest);
        RegisterHelper.registerItem(ModItems.redstoneLeggings, ArmorStrings.redstoneLegs);
        RegisterHelper.registerItem(ModItems.redstoneBoots, ArmorStrings.redstoneBoots);
    }

    public static void registerTools()
    {
        RegisterHelper.registerItem(ModItems.quartzPickaxe, ToolStrings.quartzPickaxe);
        RegisterHelper.registerItem(ModItems.quartzShovel, ToolStrings.quartzShovel);
        RegisterHelper.registerItem(ModItems.quartzAxe, ToolStrings.quartzAxe);
        RegisterHelper.registerItem(ModItems.quartzHoe, ToolStrings.quartzHoe);
        RegisterHelper.registerItem(ModItems.quartzSword, ToolStrings.quartzSword);

        RegisterHelper.registerItem(ModItems.obsidianPickaxe, ToolStrings.obsidianPickaxe);
        RegisterHelper.registerItem(ModItems.obsidianShovel, ToolStrings.obsidianShovel);
        RegisterHelper.registerItem(ModItems.obsidianAxe, ToolStrings.obsidianAxe);
        RegisterHelper.registerItem(ModItems.obsidianHoe, ToolStrings.obsidianHoe);
        RegisterHelper.registerItem(ModItems.obsidianSword, ToolStrings.obsidianSword);

        RegisterHelper.registerItem(ModItems.emeraldPickaxe, ToolStrings.emeraldPickaxe);
        RegisterHelper.registerItem(ModItems.emeraldShovel, ToolStrings.emeraldShovel);
        RegisterHelper.registerItem(ModItems.emeraldAxe, ToolStrings.emeraldAxe);
        RegisterHelper.registerItem(ModItems.emeraldHoe, ToolStrings.emeraldHoe);
        RegisterHelper.registerItem(ModItems.emeraldSword, ToolStrings.emeraldSword);

        RegisterHelper.registerItem(ModItems.lapisPickaxe, ToolStrings.lapisPickaxe);
        RegisterHelper.registerItem(ModItems.lapisShovel, ToolStrings.lapisShovel);
        RegisterHelper.registerItem(ModItems.lapisAxe, ToolStrings.lapisAxe);
        RegisterHelper.registerItem(ModItems.lapisHoe, ToolStrings.lapisHoe);
        RegisterHelper.registerItem(ModItems.lapisSword, ToolStrings.lapisSword);

        RegisterHelper.registerItem(ModItems.bronzePickaxe, ToolStrings.bronzePickaxe);
        RegisterHelper.registerItem(ModItems.bronzeShovel, ToolStrings.bronzeShovel);
        RegisterHelper.registerItem(ModItems.bronzeAxe, ToolStrings.bronzeAxe);
        RegisterHelper.registerItem(ModItems.bronzeHoe, ToolStrings.bronzeHoe);
        RegisterHelper.registerItem(ModItems.bronzeSword, ToolStrings.bronzeSword);

        RegisterHelper.registerItem(ModItems.coalPickaxe, ToolStrings.coalPickaxe);
        RegisterHelper.registerItem(ModItems.coalShovel, ToolStrings.coalShovel);
        RegisterHelper.registerItem(ModItems.coalAxe, ToolStrings.coalAxe);
        RegisterHelper.registerItem(ModItems.coalHoe, ToolStrings.coalHoe);
        RegisterHelper.registerItem(ModItems.coalSword, ToolStrings.coalSword);

        RegisterHelper.registerItem(ModItems.glowstonePickaxe, ToolStrings.glowstonePickaxe);
        RegisterHelper.registerItem(ModItems.glowstoneShovel, ToolStrings.glowstoneShovel);
        RegisterHelper.registerItem(ModItems.glowstoneAxe, ToolStrings.glowstoneAxe);
        RegisterHelper.registerItem(ModItems.glowstoneHoe, ToolStrings.glowstoneHoe);
        RegisterHelper.registerItem(ModItems.glowstoneSword, ToolStrings.glowstoneSword);

        RegisterHelper.registerItem(ModItems.adamantiumPickaxe, ToolStrings.adamantiumPickaxe);
        RegisterHelper.registerItem(ModItems.adamantiumShovel, ToolStrings.adamantiumShovel);
        RegisterHelper.registerItem(ModItems.adamantiumAxe, ToolStrings.adamantiumAxe);
        RegisterHelper.registerItem(ModItems.adamantiumHoe, ToolStrings.adamantiumHoe);
        RegisterHelper.registerItem(ModItems.adamantiumSword, ToolStrings.adamantiumSword);

        RegisterHelper.registerItem(ModItems.silkPickaxe, ToolStrings.silkPickaxe);
        RegisterHelper.registerItem(ModItems.silkShovel, ToolStrings.silkShovel);
        RegisterHelper.registerItem(ModItems.silkAxe, ToolStrings.silkAxe);
        RegisterHelper.registerItem(ModItems.silkHoe, ToolStrings.silkHoe);
        RegisterHelper.registerItem(ModItems.silkSword, ToolStrings.silkSword);

        RegisterHelper.registerItem(ModItems.redstonePickaxe, ToolStrings.redstonePickaxe);
        RegisterHelper.registerItem(ModItems.redstoneShovel, ToolStrings.redstoneShovel);
        RegisterHelper.registerItem(ModItems.redstoneAxe, ToolStrings.redstoneAxe);
        RegisterHelper.registerItem(ModItems.redstoneHoe, ToolStrings.redstoneHoe);
        RegisterHelper.registerItem(ModItems.redstoneSword, ToolStrings.redstoneSword);
    }

    public static void registerTileEntities()
    {
        RegisterHelper.registerTileEntity(TileEntityQuartzFurnace.class, TileStrings.tilePrefix + "QuartzFurnace");
        RegisterHelper.registerTileEntity(TileEntityObsidianFurnace.class, TileStrings.tilePrefix + "ObsidianFurnace");
        RegisterHelper.registerTileEntity(TileEntityEmeraldCrystalFurnace.class, TileStrings.tilePrefix + "EmeraldCrystalFurnace");
        RegisterHelper.registerTileEntity(TileEntityLapisCrystalFurnace.class, TileStrings.tilePrefix + "LapisCrystalFurnace");
        RegisterHelper.registerTileEntity(TileEntityBronzeFurnace.class, TileStrings.tilePrefix + "BronzeFurnace");
        RegisterHelper.registerTileEntity(TileEntityCoalFurnace.class, TileStrings.tilePrefix + "CoalFurnace");
        RegisterHelper.registerTileEntity(TileEntityGlowstoneFurnace.class, TileStrings.tilePrefix + "GlowstoneFurnace");
        RegisterHelper.registerTileEntity(TileEntityAdamantiumFurnace.class, TileStrings.tilePrefix + "AdamantiumFurnace");
        RegisterHelper.registerTileEntity(TileEntitySilkFurnace.class, TileStrings.tilePrefix + "SilkFurnace");
        RegisterHelper.registerTileEntity(TileEntityRedstoneFurnace.class, TileStrings.tilePrefix + "RedstoneFurnace");
    }

    public static void registerBows()
    {
        RegisterHelper.registerItem(ModItems.quartzBow, BowStrings.bowQuartz);
        RegisterHelper.registerItem(ModItems.obsidianBow, BowStrings.bowObsidian);
        RegisterHelper.registerItem(ModItems.emeraldBow, BowStrings.bowEmerald);
        RegisterHelper.registerItem(ModItems.lapisBow, BowStrings.bowLapis);
        RegisterHelper.registerItem(ModItems.bronzeBow, BowStrings.bowBronze);
        RegisterHelper.registerItem(ModItems.coalBow, BowStrings.bowCoal);
        RegisterHelper.registerItem(ModItems.glowstoneBow, BowStrings.bowGlowstone);
        RegisterHelper.registerItem(ModItems.adamantiumBow, BowStrings.bowAdamantium);
    }

    public static void registerOther()
    {
        RegisterHelper.registerGuiHandler(FergoTools.instance, handler);
        RegisterHelper.registerWorldGen(event, 0);
    }

    public static void registerItems()
    {
        RegisterHelper.registerItem(ModItems.fergoMaterials, "ft");
    }



    public static void registerBlocks()
    {
        RegisterHelper.registerBlock(ModBlocks.oreExperience, BlockStrings.oreExperience);
        RegisterHelper.registerBlock(ModBlocks.oreObsidian, BlockStrings.oreObsidian);
        RegisterHelper.registerBlock(ModBlocks.oreEmeraldCrystal, BlockStrings.oreEmeraldCrystal);
        RegisterHelper.registerBlock(ModBlocks.oreLapisCrystal, BlockStrings.oreLapisCrystal);
        RegisterHelper.registerBlock(ModBlocks.oreBronze, BlockStrings.oreBronze);
        RegisterHelper.registerBlock(ModBlocks.oreAdamantium, BlockStrings.oreAdamantium);
        RegisterHelper.registerBlock(ModBlocks.oreRedstoneCrystal, BlockStrings.oreRedstone);

        RegisterHelper.registerBlock(ModBlocks.blockExperience, BlockStrings.blockExperience);
        RegisterHelper.registerBlock(ModBlocks.blockObsidian, BlockStrings.blockObsidian);
        RegisterHelper.registerBlock(ModBlocks.blockEmeraldCrystal, BlockStrings.blockEmeraldCrystal);
        RegisterHelper.registerBlock(ModBlocks.blockLapisCrystal, BlockStrings.blockLapisCrystal);
        RegisterHelper.registerBlock(ModBlocks.blockBronze, BlockStrings.blockBronze);
        RegisterHelper.registerBlock(ModBlocks.blockCoal, BlockStrings.blockCoal);
        RegisterHelper.registerBlock(ModBlocks.blockGlowstone, BlockStrings.blockGlowstone);
        RegisterHelper.registerBlock(ModBlocks.blockAdamantium, BlockStrings.blockAdamantium);
        RegisterHelper.registerBlock(ModBlocks.blockSilkGem, BlockStrings.blockSilkGem);
        RegisterHelper.registerBlock(ModBlocks.blockRedstone, BlockStrings.blockRedstone);
        }

    public static class GuiHandler implements IGuiHandler {

        @Override
        public Object getServerGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z) {
            TileEntity entity = world.getTileEntity(x, y, z);
            switch(guiId)
            {
                case 0: return new ContainerQuartzFurnace(player.inventory, (TileEntityQuartzFurnace) entity);
                case 1: return new ContainerObsidianFurnace(player.inventory, (TileEntityObsidianFurnace)entity);
                case 2: return new ContainerEmeraldCrystalFurnace(player.inventory, (TileEntityEmeraldCrystalFurnace)entity);
                case 3: return new ContainerLapisCrystalFurnace(player.inventory, (TileEntityLapisCrystalFurnace)entity);
                case 4: return new ContainerBronzeFurnace(player.inventory, (TileEntityBronzeFurnace)entity);
                case 5: return new ContainerCoalFurnace(player.inventory, (TileEntityCoalFurnace)entity);
                case 6: return new ContainerGlowstoneFurnace(player.inventory, (TileEntityGlowstoneFurnace)entity);
                case 7: return new ContainerAdamantiumFurnace(player.inventory, (TileEntityAdamantiumFurnace)entity);
                case 8: return new ContainerSilkFurnace(player.inventory, (TileEntitySilkFurnace) entity);
                case 9: return new ContainerRedstoneFurnace(player.inventory, (TileEntityRedstoneFurnace)entity);
            }
            return null;
}

        @Override
        public Object getClientGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z)
        {
            TileEntity entity = world.getTileEntity(x, y, z);
            switch(guiId)
            {
                case 0: return new GuiQuartzFurnace(player.inventory, (TileEntityQuartzFurnace) entity);
                case 1: return new GuiObsidianFurnace(player.inventory, (TileEntityObsidianFurnace)entity);
                case 2: return new GuiEmeraldCrystalFurnace(player.inventory, (TileEntityEmeraldCrystalFurnace)entity);
                case 3: return new GuiLapisCrystalFurnace(player.inventory, (TileEntityLapisCrystalFurnace)entity);
                case 4: return new GuiBronzeFurnace(player.inventory, (TileEntityBronzeFurnace)entity);
                case 5: return new GuiCoalFurnace(player.inventory, (TileEntityCoalFurnace)entity);
                case 6: return new GuiGlowstoneFurnace(player.inventory, (TileEntityGlowstoneFurnace)entity);
                case 7: return new GuiAdamantiumFurnace(player.inventory, (TileEntityAdamantiumFurnace)entity);
                case 8: return new GuiSilkFurnace(player.inventory, (TileEntitySilkFurnace) entity);
                case 9: return new GuiRedstoneFurnace(player.inventory, (TileEntityRedstoneFurnace)entity);
            }
            return null;
        }
}
}
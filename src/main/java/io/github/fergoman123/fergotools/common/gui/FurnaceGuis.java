package io.github.fergoman123.fergotools.common.gui;

import io.github.fergoman123.fergotools.api.base.GuiFurnaceFT;
import io.github.fergoman123.fergotools.common.tileentities.*;
import io.github.fergoman123.fergotools.reference.gui.Textures;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import io.github.fergoman123.fergotools.common.gui.FurnaceContainers.*;

public class FurnaceGuis
{
    public static final class GuiQuartzFurnace extends GuiFurnaceFT
    {
        public GuiQuartzFurnace(InventoryPlayer invPlayer, IInventory furnace) {
            super(new ContainerQuartzFurnace(invPlayer, furnace), Textures.quartzFurnaceGuiTexture, new TileQuartzFurnace(), invPlayer, furnace);
        }
    }

    public static final class GuiObsidianFurnace extends GuiFurnaceFT{
        public GuiObsidianFurnace(InventoryPlayer invPlayer, IInventory furnace){
            super(new ContainerObsidianFurnace(invPlayer, furnace), Textures.obsidianFurnaceGuiTexture, new TileObsidianFurnace(), invPlayer, furnace);
        }
    }

    public static final class GuiEmeraldFurnace extends GuiFurnaceFT
    {
        public GuiEmeraldFurnace(InventoryPlayer invPlayer, IInventory furnace)
        {
            super(new ContainerEmeraldFurnace(invPlayer, furnace), Textures.emeraldFurnaceGuiTexture, new TileEmeraldFurnace(), invPlayer, furnace);
        }
    }

    public static final class GuiLapisFurnace extends GuiFurnaceFT
    {
        public GuiLapisFurnace(InventoryPlayer invPlayer, IInventory furnace)
        {
            super(new ContainerLapisFurnace(invPlayer, furnace), Textures.lapisFurnaceGuiTexture, new TileLapisFurnace(), invPlayer, furnace);
        }
    }

    public static final class GuiBronzeFurnace extends GuiFurnaceFT
    {
        public GuiBronzeFurnace(InventoryPlayer invPlayer, IInventory furnace)
        {
            super(new ContainerBronzeFurnace(invPlayer, furnace), Textures.bronzeFurnaceGuiTexture, new TileBronzeFurnace(), invPlayer, furnace);
        }
    }

    public static final class GuiCoalFurnace extends GuiFurnaceFT
    {
        public GuiCoalFurnace(InventoryPlayer invPlayer, IInventory furnace)
        {
            super(new ContainerCoalFurnace(invPlayer, furnace), Textures.coalFurnaceGuiTexture, new TileCoalFurnace(), invPlayer, furnace);
        }
    }

    public static final class GuiGlowstoneFurnace extends GuiFurnaceFT
    {
        public GuiGlowstoneFurnace(InventoryPlayer invPlayer, IInventory furnace)
        {
            super(new ContainerGlowstoneFurnace(invPlayer, furnace), Textures.glowstoneFurnaceGuiTexture, new TileGlowstoneFurnace(), invPlayer, furnace);
        }
    }

    public static final class GuiAdamantiumFurnace extends GuiFurnaceFT
    {
        public GuiAdamantiumFurnace(InventoryPlayer invPlayer, IInventory furnace)
        {
            super(new ContainerAdamantiumFurnace(invPlayer, furnace), Textures.adamantiumFurnaceGuiTexture, new TileAdamantiumFurnace(), invPlayer, furnace);
        }
    }

    public static final class GuiSilkFurnace extends GuiFurnaceFT
    {
        public GuiSilkFurnace(InventoryPlayer invPlayer, IInventory furnace)
        {
            super(new ContainerSilkFurnace(invPlayer, furnace), Textures.silkFurnaceGuiTexture, new TileSilkFurnace(), invPlayer, furnace);
        }
    }

    public static final class GuiRedstoneFurnace extends GuiFurnaceFT
    {
        public GuiRedstoneFurnace(InventoryPlayer invPlayer, IInventory furnace)
        {
            super(new ContainerRedstoneFurnace(invPlayer, furnace), Textures.redstoneFurnaceGuiTexture, new TileRedstoneFurnace(), invPlayer, furnace);
        }
    }

    public static final class GuiMacerator extends GuiFurnaceFT
    {
        public GuiMacerator(InventoryPlayer invPlayer, IInventory furnace)
        {
            super(new ContainerMacerator(invPlayer, furnace), Textures.maceratorGuiTexture, new TileMacerator(), invPlayer, furnace);
        }
    }
}

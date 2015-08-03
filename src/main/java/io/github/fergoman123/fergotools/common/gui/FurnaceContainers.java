package io.github.fergoman123.fergotools.common.gui;

import io.github.fergoman123.fergotools.common.tileentities.*;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;

public class FurnaceContainers
{
    public static final class ContainerQuartzFurnace extends ContainerFurnaceFT{
        public ContainerQuartzFurnace(InventoryPlayer invPlayer, IInventory furnace) {
            super(invPlayer, furnace, new TileQuartzFurnace());
        }
    }

    public static final class ContainerObsidianFurnace extends ContainerFurnaceFT{
        public ContainerObsidianFurnace(InventoryPlayer invPlayer, IInventory furnace){
            super(invPlayer, furnace, new TileObsidianFurnace());
        }
    }

    public static final class ContainerEmeraldFurnace extends ContainerFurnaceFT{
        public ContainerEmeraldFurnace(InventoryPlayer invPlayer, IInventory furnace){
            super(invPlayer, furnace, new TileEmeraldFurnace());
        }
    }

    public static final class ContainerLapisFurnace extends ContainerFurnaceFT{
        public ContainerLapisFurnace(InventoryPlayer invPlayer, IInventory furnace){
            super(invPlayer, furnace, new TileLapisFurnace());
        }
    }

    public static final class ContainerBronzeFurnace extends ContainerFurnaceFT{
        public ContainerBronzeFurnace(InventoryPlayer invPlayer, IInventory furnace){
            super(invPlayer, furnace, new TileBronzeFurnace());
        }
    }

    public static final class ContainerCoalFurnace extends ContainerFurnaceFT{
        public ContainerCoalFurnace(InventoryPlayer invPlayer, IInventory furnace){
            super(invPlayer, furnace, new TileCoalFurnace());
        }
    }

    public static final class ContainerGlowstoneFurnace extends ContainerFurnaceFT{
        public ContainerGlowstoneFurnace(InventoryPlayer invPlayer, IInventory furnace){
            super(invPlayer, furnace, new TileGlowstoneFurnace());
        }
    }

    public static final class ContainerAdamantiumFurnace extends ContainerFurnaceFT{
        public ContainerAdamantiumFurnace(InventoryPlayer invPlayer, IInventory furnace){
            super(invPlayer, furnace, new TileAdamantiumFurnace());
        }
    }

    public static final class ContainerSilkFurnace extends ContainerFurnaceFT{
        public ContainerSilkFurnace(InventoryPlayer invPlayer, IInventory furnace){
            super(invPlayer, furnace, new TileSilkFurnace());
        }
    }

    public static final class ContainerRedstoneFurnace extends ContainerFurnaceFT{
        public ContainerRedstoneFurnace(InventoryPlayer invPlayer, IInventory furnace){
            super(invPlayer, furnace, new TileRedstoneFurnace());
        }
    }

    public static final class ContainerMacerator extends ContainerFurnaceFT{
        public ContainerMacerator(InventoryPlayer invPlayer, IInventory furnace){
            super(invPlayer, furnace, new TileMacerator());
        }

        @Override
        public void addInventorySlots() {
            addSlot(furnace, 0, 80, 31);
            addMaceratorFuelSlot(furnace, 1, 62, 31);
            addOutputSlot(invPlayer.player, furnace, 2, 98, 31);
        }
    }
}

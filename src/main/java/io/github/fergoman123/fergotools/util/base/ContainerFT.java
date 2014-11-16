package io.github.fergoman123.fergotools.util.base;


import io.github.fergoman123.fergoutil.inventory.FergoContainer;
import net.minecraft.entity.player.InventoryPlayer;

public abstract class ContainerFT extends FergoContainer{
    public InventoryPlayer invPlayer;

    public abstract void addPlayerInventory();

    public abstract void addInventorySlots();
}

package io.github.fergoman123.fergotools.util.base;


import io.github.fergoman123.fergoutil.inventory.FergoContainer;
import net.minecraft.entity.player.InventoryPlayer;

/**
 * this is the base class for
 * furnaces
 */
public abstract class ContainerFT extends FergoContainer{
    /** the players inventory */
    public InventoryPlayer invPlayer;

    /**
     * adds the player inventory to the container
     */
    public abstract void addPlayerInventory();

    /**
     * adds the slots for the container
     */
    public abstract void addInventorySlots();
}

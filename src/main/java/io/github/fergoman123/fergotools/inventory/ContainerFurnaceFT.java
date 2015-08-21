package io.github.fergoman123.fergotools.inventory;

import io.github.fergoman123.fergoutil.gui.ContainerFurnaceFergo;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;

public abstract class ContainerFurnaceFT extends ContainerFurnaceFergo{

	public ContainerFurnaceFT(InventoryPlayer invPlayer, IInventory furnace) {
		super(invPlayer, furnace);
		this.addInventorySlots();
		this.addPlayerInventory();
	}
}

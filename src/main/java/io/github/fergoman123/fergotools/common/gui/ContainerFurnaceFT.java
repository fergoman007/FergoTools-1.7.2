package io.github.fergoman123.fergotools.common.gui;

import io.github.fergoman123.fergotools.common.tileentities.TileEntityFurnaceFT;
import io.github.fergoman123.fergoutil.gui.ContainerFurnaceFergo;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;

public abstract class ContainerFurnaceFT extends ContainerFurnaceFergo{
	
	public TileEntityFurnaceFT furnaceFT;

	public ContainerFurnaceFT(InventoryPlayer invPlayer, IInventory furnace, TileEntityFurnaceFT furnaceFT) {
		super(invPlayer, furnace);
		this.addInventorySlots();
		this.addPlayerInventory();
		this.furnaceFT = furnaceFT;
	}
}

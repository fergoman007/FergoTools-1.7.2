package io.github.fergoman123.fergotools.inventory;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

public class ContainerObsidianWorkbench extends ContainerWorkbenchFT{
	public ContainerObsidianWorkbench(InventoryPlayer invPlayer, World world) {
		super(invPlayer, world);
		this.setIsBlank(false);
	}
}
package io.github.fergoman123.fergotools.inventory;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

public class ContainerEmeraldWorkbench extends ContainerWorkbenchFT{
	public ContainerEmeraldWorkbench(InventoryPlayer invPlayer, World world) {
		super(invPlayer, world);
		this.setIsBlank(false);
	}
}

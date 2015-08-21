package io.github.fergoman123.fergotools.client.gui;

import io.github.fergoman123.fergotools.inventory.ContainerLapisWorkbench;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

public class GuiLapisWorkbench extends GuiWorkbenchFT{

	public GuiLapisWorkbench(InventoryPlayer invPlayer, World world) {
		super(new ContainerLapisWorkbench(invPlayer, world), invPlayer, world);
	}

}

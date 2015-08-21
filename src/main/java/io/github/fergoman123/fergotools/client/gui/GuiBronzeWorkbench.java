package io.github.fergoman123.fergotools.client.gui;

import io.github.fergoman123.fergotools.inventory.ContainerBronzeWorkbench;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

public class GuiBronzeWorkbench extends GuiWorkbenchFT{

	public GuiBronzeWorkbench(InventoryPlayer invPlayer, World world) {
		super(new ContainerBronzeWorkbench(invPlayer, world), invPlayer, world);
	}
}

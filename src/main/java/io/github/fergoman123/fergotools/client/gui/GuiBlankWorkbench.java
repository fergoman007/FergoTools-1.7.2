package io.github.fergoman123.fergotools.client.gui;
import io.github.fergoman123.fergotools.inventory.ContainerBlankWorkbench;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

public class GuiBlankWorkbench extends GuiWorkbenchFT {

	public GuiBlankWorkbench(InventoryPlayer invPlayer, World world) {
		super(new ContainerBlankWorkbench(invPlayer, world), invPlayer, world);
	}
}

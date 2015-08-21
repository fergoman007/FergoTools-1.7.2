package io.github.fergoman123.fergotools.client.gui;

import io.github.fergoman123.fergotools.inventory.ContainerRedstoneWorkbench;
import io.github.fergoman123.fergotools.reference.Assets;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

public class GuiRedstoneWorkbench extends GuiWorkbenchFT{

	public GuiRedstoneWorkbench(InventoryPlayer invPlayer, World world) {
		super(new ContainerRedstoneWorkbench(invPlayer, world), invPlayer, world, Assets.Locale.containerRedstoneWorkbench, Assets.GuiTextures.redstoneWorkbenchGui);
	}

}

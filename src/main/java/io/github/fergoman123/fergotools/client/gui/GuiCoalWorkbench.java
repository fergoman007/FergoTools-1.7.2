package io.github.fergoman123.fergotools.client.gui;

import io.github.fergoman123.fergotools.inventory.ContainerCoalWorkbench;
import io.github.fergoman123.fergotools.reference.Assets.GuiTextures;
import io.github.fergoman123.fergotools.reference.Assets.Locale;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

public class GuiCoalWorkbench extends GuiWorkbenchFT{

	public GuiCoalWorkbench(InventoryPlayer invPlayer, World world) {
		super(new ContainerCoalWorkbench(invPlayer, world), invPlayer, world, Locale.containerCoalWorkbench, GuiTextures.coalWorkbenchGuiTexture);
	}

}

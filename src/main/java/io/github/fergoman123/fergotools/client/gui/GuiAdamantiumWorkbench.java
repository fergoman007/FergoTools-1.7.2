package io.github.fergoman123.fergotools.client.gui;

import io.github.fergoman123.fergotools.inventory.ContainerAdamantiumWorkbench;
import io.github.fergoman123.fergotools.reference.Assets.GuiTextures;
import io.github.fergoman123.fergotools.reference.Assets.Locale;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

public class GuiAdamantiumWorkbench extends GuiWorkbenchFT{

	public GuiAdamantiumWorkbench(InventoryPlayer invPlayer, World world) {
		super(new ContainerAdamantiumWorkbench(invPlayer, world), invPlayer, world, Locale.containerAdamantiumWorkbench, GuiTextures.adamantiumWorkbenchGui);
	}
	
}

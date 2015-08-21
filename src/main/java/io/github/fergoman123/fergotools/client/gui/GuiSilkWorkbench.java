package io.github.fergoman123.fergotools.client.gui;

import io.github.fergoman123.fergotools.inventory.ContainerSilkWorkbench;
import io.github.fergoman123.fergotools.reference.Assets;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

public class GuiSilkWorkbench extends GuiWorkbenchFT {

	public GuiSilkWorkbench(InventoryPlayer invPlayer, World world) {
		super(new ContainerSilkWorkbench(invPlayer, world), invPlayer, world, Assets.Locale.containerSilkWorkbench, Assets.GuiTextures.silkWorkbenchGuiTexture);
	}

}

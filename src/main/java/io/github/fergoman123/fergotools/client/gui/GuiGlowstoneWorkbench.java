package io.github.fergoman123.fergotools.client.gui;

import io.github.fergoman123.fergotools.inventory.ContainerGlowstoneWorkbench;
import io.github.fergoman123.fergotools.reference.Assets.GuiTextures;
import io.github.fergoman123.fergotools.reference.Assets.Locale;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

public class GuiGlowstoneWorkbench extends GuiWorkbenchFT{

	public GuiGlowstoneWorkbench(InventoryPlayer invPlayer, World world) {
		super(new ContainerGlowstoneWorkbench(invPlayer, world), invPlayer, world, Locale.containergGlowstoneWorkbench, GuiTextures.glowstoneWorkbenchGuiTexture);
	}

}

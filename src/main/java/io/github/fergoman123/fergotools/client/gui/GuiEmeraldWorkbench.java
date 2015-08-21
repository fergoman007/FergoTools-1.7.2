package io.github.fergoman123.fergotools.client.gui;

import io.github.fergoman123.fergotools.inventory.ContainerEmeraldWorkbench;
import io.github.fergoman123.fergotools.reference.Assets.GuiTextures;
import io.github.fergoman123.fergotools.reference.Assets.Locale;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

public class GuiEmeraldWorkbench extends GuiWorkbenchFT{

	public GuiEmeraldWorkbench(InventoryPlayer invPlayer, World world) {
		super(new ContainerEmeraldWorkbench(invPlayer, world), invPlayer, world, Locale.containerEmeraldWorkbench, GuiTextures.emeraldWorkbenchGui);
	}
	
}

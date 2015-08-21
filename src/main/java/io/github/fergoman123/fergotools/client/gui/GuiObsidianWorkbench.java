package io.github.fergoman123.fergotools.client.gui;

import io.github.fergoman123.fergotools.inventory.ContainerWorkbenchFT;
import io.github.fergoman123.fergotools.reference.Assets.GuiTextures;
import io.github.fergoman123.fergotools.reference.Assets.Locale;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

public class GuiObsidianWorkbench extends GuiWorkbenchFT{

    public GuiObsidianWorkbench(InventoryPlayer invPlayer, World world){
        super(new ContainerWorkbenchFT(invPlayer, world), invPlayer, world, Locale.containerObsidianWorkbench, GuiTextures.obsidianWorkbenchGui);
    }
}

/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergotools.handler;

import io.github.fergoman123.fergotools.common.gui.workbench.ContainerWorkbenchFT;
import io.github.fergoman123.fergotools.common.gui.workbench.GuiWorkbenchFT;
import io.github.fergoman123.fergotools.common.tileentities.*;
import io.github.fergoman123.fergotools.common.gui.FurnaceGuis.*;
import io.github.fergoman123.fergotools.common.gui.FurnaceContainers.*;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.reference.GuiIds;
import io.github.fergoman123.fergotools.reference.Locale;
import io.github.fergoman123.fergotools.reference.Textures;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity tileEntity = world.getTileEntity(pos);
        InventoryPlayer invPlayer = player.inventory;
        switch (id) {
            case GuiIds.quartzFurnace:
                return new ContainerQuartzFurnace(invPlayer, (TileQuartzFurnace) tileEntity);
            case GuiIds.obsidianFurnace:
                return new ContainerObsidianFurnace(invPlayer, (TileObsidianFurnace)tileEntity);
            case GuiIds.emeraldFurnace:
                return new ContainerEmeraldFurnace(invPlayer, (TileEmeraldFurnace)tileEntity);
            case GuiIds.lapisFurnace:
                return new ContainerLapisFurnace(invPlayer, (TileLapisFurnace)tileEntity);
            case GuiIds.bronzeFurnace:
                return new ContainerBronzeFurnace(invPlayer, (TileBronzeFurnace)tileEntity);
            case GuiIds.coalFurnace:
                return new ContainerCoalFurnace(invPlayer, (TileCoalFurnace)tileEntity);
            case GuiIds.glowstoneFurnace:
                return new ContainerGlowstoneFurnace(invPlayer, (TileGlowstoneFurnace)tileEntity);
            case GuiIds.adamantiumFurnace:
                return new ContainerAdamantiumFurnace(invPlayer, (TileAdamantiumFurnace)tileEntity);
            case GuiIds.silkFurnace:
                return new ContainerSilkFurnace(invPlayer, (TileSilkFurnace)tileEntity);
            case GuiIds.redstoneFurnace:
                return new ContainerRedstoneFurnace(invPlayer, (TileRedstoneFurnace)tileEntity);
            case GuiIds.macerator:
                return new ContainerMacerator(invPlayer, (TileMacerator)tileEntity);
            case GuiIds.obsidianWorkbench:
                return new ContainerWorkbenchFT(invPlayer, world, pos, ModBlocks.obsidianWorkbench);
            case GuiIds.emeraldWorkbench:
                return new ContainerWorkbenchFT(invPlayer, world, pos, ModBlocks.emeraldWorkbench);
            case GuiIds.lapisWorkbench:
                return new ContainerWorkbenchFT(invPlayer, world, pos, ModBlocks.lapisWorkbench);
            case GuiIds.bronzeWorkbench:
                return new ContainerWorkbenchFT(invPlayer, world, pos, ModBlocks.bronzeWorkbench);
            case GuiIds.coalWorkbench:
                return new ContainerWorkbenchFT(invPlayer, world, pos, ModBlocks.coalWorkbench);
            case GuiIds.glowstoneWorkbench:
                return new ContainerWorkbenchFT(invPlayer, world, pos, ModBlocks.glowstoneWorkbench);
            case GuiIds.adamantiumWorkbench:
                return new ContainerWorkbenchFT(invPlayer, world, pos, ModBlocks.adamantiumWorkbench);
            case GuiIds.silkWorkbench:
                return new ContainerWorkbenchFT(invPlayer, world, pos, ModBlocks.silkWorkbench);
            case GuiIds.redstoneWorkbench:
                return new ContainerWorkbenchFT(invPlayer, world, pos, ModBlocks.redstoneWorkbench);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity tileEntity = world.getTileEntity(pos);
        InventoryPlayer invPlayer = player.inventory;

        //todo GUI's
        switch (id) {
            case GuiIds.quartzFurnace:
                return new GuiQuartzFurnace(invPlayer, (TileQuartzFurnace)tileEntity);
            case GuiIds.obsidianFurnace:
                return new GuiObsidianFurnace(invPlayer, (TileObsidianFurnace)tileEntity);
            case GuiIds.emeraldFurnace:
                return new GuiEmeraldFurnace(invPlayer, (TileEmeraldFurnace)tileEntity);
            case GuiIds.lapisFurnace:
                return new GuiLapisFurnace(invPlayer, (TileLapisFurnace)tileEntity);
            case GuiIds.bronzeFurnace:
                return new GuiBronzeFurnace(invPlayer, (TileBronzeFurnace)tileEntity);
            case GuiIds.coalFurnace:
                return new GuiCoalFurnace(invPlayer, (TileCoalFurnace)tileEntity);
            case GuiIds.glowstoneFurnace:
                return new GuiGlowstoneFurnace(invPlayer, (TileGlowstoneFurnace)tileEntity);
            case GuiIds.adamantiumFurnace:
                return new GuiAdamantiumFurnace(invPlayer, (TileAdamantiumFurnace)tileEntity);
            case GuiIds.silkFurnace:
                return new GuiSilkFurnace(invPlayer, (TileSilkFurnace)tileEntity);
            case GuiIds.redstoneFurnace:
                return new GuiRedstoneFurnace(invPlayer, (TileRedstoneFurnace)tileEntity);
            case GuiIds.macerator:
                return new GuiMacerator(invPlayer, (TileMacerator)tileEntity);

            case GuiIds.obsidianWorkbench:
                return new GuiWorkbenchFT(
                        invPlayer, world, pos,
                        ModBlocks.obsidianWorkbench, Locale.containerObsidianWorkbench, Textures.obsidianWorkbenchGuiTexture
                );
            case GuiIds.emeraldWorkbench:
                return new GuiWorkbenchFT(
                        invPlayer, world, pos,
                        ModBlocks.emeraldWorkbench, Locale.containerEmeraldWorkbench, Textures.emeraldWorkbenchGuiTexture
                );
            case GuiIds.lapisWorkbench:
                return new GuiWorkbenchFT(
                        invPlayer, world, pos,
                        ModBlocks.lapisWorkbench, Locale.containerLapisWorkbench, Textures.lapisWorkbenchGuiTexture
                );
            case GuiIds.bronzeWorkbench:
                return new GuiWorkbenchFT(invPlayer, world, pos,
                        ModBlocks.bronzeWorkbench, Locale.containerBronzeWorkbench, Textures.bronzeWorkbenchGuiTexture
                );
            case GuiIds.coalWorkbench:
                return new GuiWorkbenchFT(invPlayer, world, pos,
                        ModBlocks.coalWorkbench, Locale.containerCoalWorkbench, Textures.coalWorkbenchGuiTexture
                );
            case GuiIds.glowstoneWorkbench:
                return new GuiWorkbenchFT(invPlayer, world, pos,
                        ModBlocks.glowstoneWorkbench, Locale.containerGlowstoneWorkbench, Textures.glowstoneWorkbenchGuiTexture
                );
            case GuiIds.adamantiumWorkbench:
                return new GuiWorkbenchFT(invPlayer, world, pos,
                        ModBlocks.adamantiumWorkbench, Locale.containerAdamantiumWorkbench, Textures.adamantiumWorkbenchGuiTexture
                );
            case GuiIds.silkWorkbench:
                return new GuiWorkbenchFT(invPlayer, world, pos,
                        ModBlocks.silkWorkbench, Locale.containerSilkWorkbench, Textures.silkWorkbenchGuiTexture
                );
            case GuiIds.redstoneWorkbench:
                return new GuiWorkbenchFT(invPlayer, world, pos,
                        ModBlocks.redstoneWorkbench, Locale.containerRedstoneWorkbench, Textures.redstoneWorkbenchGuiTexture
                );
        }
        return null;
    }
}

/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergotools.handler;

import io.github.fergoman123.fergotools.client.gui.GuiAdamantiumWorkbench;
import io.github.fergoman123.fergotools.client.gui.GuiBlankWorkbench;
import io.github.fergoman123.fergotools.client.gui.GuiBronzeWorkbench;
import io.github.fergoman123.fergotools.client.gui.GuiCoalWorkbench;
import io.github.fergoman123.fergotools.client.gui.GuiEmeraldFurnace;
import io.github.fergoman123.fergotools.client.gui.GuiEmeraldWorkbench;
import io.github.fergoman123.fergotools.client.gui.GuiGlowstoneWorkbench;
import io.github.fergoman123.fergotools.client.gui.GuiLapisWorkbench;
import io.github.fergoman123.fergotools.client.gui.GuiObsidianFurnace;
import io.github.fergoman123.fergotools.client.gui.GuiObsidianWorkbench;
import io.github.fergoman123.fergotools.client.gui.GuiQuartzFurnace;
import io.github.fergoman123.fergotools.client.gui.GuiRedstoneWorkbench;
import io.github.fergoman123.fergotools.client.gui.GuiSilkWorkbench;
import io.github.fergoman123.fergotools.client.gui.GuiWorkbenchFT;
import io.github.fergoman123.fergotools.common.tileentities.TileBronzeFurnace;
import io.github.fergoman123.fergotools.common.tileentities.TileCoalFurnace;
import io.github.fergoman123.fergotools.inventory.ContainerAdamantiumWorkbench;
import io.github.fergoman123.fergotools.inventory.ContainerBlankWorkbench;
import io.github.fergoman123.fergotools.inventory.ContainerBronzeWorkbench;
import io.github.fergoman123.fergotools.inventory.ContainerCoalWorkbench;
import io.github.fergoman123.fergotools.inventory.ContainerEmeraldWorkbench;
import io.github.fergoman123.fergotools.inventory.ContainerGlowstoneWorkbench;
import io.github.fergoman123.fergotools.inventory.ContainerLapisWorkbench;
import io.github.fergoman123.fergotools.inventory.ContainerObsidianFurnace;
import io.github.fergoman123.fergotools.inventory.ContainerObsidianWorkbench;
import io.github.fergoman123.fergotools.inventory.ContainerQuartzFurnace;
import io.github.fergoman123.fergotools.inventory.ContainerRedstoneWorkbench;
import io.github.fergoman123.fergotools.inventory.ContainerSilkWorkbench;
import io.github.fergoman123.fergotools.reference.GuiIds;
import io.github.fergoman123.fergotools.tileentity.TileAdamantiumFurnace;
import io.github.fergoman123.fergotools.tileentity.TileEmeraldFurnace;
import io.github.fergoman123.fergotools.tileentity.TileGlowstoneFurnace;
import io.github.fergoman123.fergotools.tileentity.TileLapisFurnace;
import io.github.fergoman123.fergotools.tileentity.TileMacerator;
import io.github.fergoman123.fergotools.tileentity.TileObsidianFurnace;
import io.github.fergoman123.fergotools.tileentity.TileQuartzFurnace;
import io.github.fergoman123.fergotools.tileentity.TileRedstoneFurnace;
import io.github.fergoman123.fergotools.tileentity.TileSilkFurnace;
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
			return new ContainerObsidianFurnace(invPlayer, (TileObsidianFurnace) tileEntity);
		case GuiIds.emeraldFurnace:
			return new ContainerEmeraldFurnace(invPlayer, (TileEmeraldFurnace) tileEntity);
		case GuiIds.lapisFurnace:
			return new ContainerLapisFurnace(invPlayer, (TileLapisFurnace) tileEntity);
		case GuiIds.bronzeFurnace:
			return new ContainerBronzeFurnace(invPlayer, (TileBronzeFurnace) tileEntity);
		case GuiIds.coalFurnace:
			return new ContainerCoalFurnace(invPlayer, (TileCoalFurnace) tileEntity);
		case GuiIds.glowstoneFurnace:
			return new ContainerGlowstoneFurnace(invPlayer, (TileGlowstoneFurnace) tileEntity);
		case GuiIds.adamantiumFurnace:
			return new ContainerAdamantiumFurnace(invPlayer, (TileAdamantiumFurnace) tileEntity);
		case GuiIds.silkFurnace:
			return new ContainerSilkFurnace(invPlayer, (TileSilkFurnace) tileEntity);
		case GuiIds.redstoneFurnace:
			return new ContainerRedstoneFurnace(invPlayer, (TileRedstoneFurnace) tileEntity);
		case GuiIds.macerator:
			return new ContainerMacerator(invPlayer, (TileMacerator) tileEntity);
			
		case GuiIds.obsidianWorkbench:
			return new ContainerObsidianWorkbench(invPlayer, world);
		case GuiIds.emeraldWorkbench:
			return new ContainerEmeraldWorkbench(invPlayer, world);
		case GuiIds.lapisWorkbench:
			return new ContainerLapisWorkbench(invPlayer, world);
		case GuiIds.bronzeWorkbench:
			return new ContainerBronzeWorkbench(invPlayer, world);
		case GuiIds.coalWorkbench:
			return new ContainerCoalWorkbench(invPlayer, world);
		case GuiIds.glowstoneWorkbench:
			return new ContainerGlowstoneWorkbench(invPlayer, world);
		case GuiIds.adamantiumWorkbench:
			return new ContainerAdamantiumWorkbench(invPlayer, world);
		case GuiIds.silkWorkbench:
			return new ContainerSilkWorkbench(invPlayer, world);
		case GuiIds.redstoneWorkbench:
			return new ContainerRedstoneWorkbench(invPlayer, world);
		case GuiIds.blankWorkbench:
			return new ContainerBlankWorkbench(invPlayer, world);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		TileEntity tileEntity = world.getTileEntity(pos);
		InventoryPlayer invPlayer = player.inventory;

		// todo GUI's
		switch (id) {
		case GuiIds.quartzFurnace:
			return new GuiQuartzFurnace(invPlayer, (TileQuartzFurnace) tileEntity);
		case GuiIds.obsidianFurnace:
			return new GuiObsidianFurnace(invPlayer, (TileObsidianFurnace) tileEntity);
		case GuiIds.emeraldFurnace:
			return new GuiEmeraldFurnace(invPlayer, (TileEmeraldFurnace) tileEntity);
		case GuiIds.lapisFurnace:
			return new GuiLapisFurnace(invPlayer, (TileLapisFurnace) tileEntity);
		case GuiIds.bronzeFurnace:
			return new GuiBronzeFurnace(invPlayer, (TileBronzeFurnace) tileEntity);
		case GuiIds.coalFurnace:
			return new GuiCoalFurnace(invPlayer, (TileCoalFurnace) tileEntity);
		case GuiIds.glowstoneFurnace:
			return new GuiGlowstoneFurnace(invPlayer, (TileGlowstoneFurnace) tileEntity);
		case GuiIds.adamantiumFurnace:
			return new GuiAdamantiumFurnace(invPlayer, (TileAdamantiumFurnace) tileEntity);
		case GuiIds.silkFurnace:
			return new GuiSilkFurnace(invPlayer, (TileSilkFurnace) tileEntity);
		case GuiIds.redstoneFurnace:
			return new GuiRedstoneFurnace(invPlayer, (TileRedstoneFurnace) tileEntity);
		case GuiIds.macerator:
			return new GuiMacerator(invPlayer, (TileMacerator) tileEntity);

		case GuiIds.obsidianWorkbench:
			return new GuiObsidianWorkbench(invPlayer, world);
		case GuiIds.emeraldWorkbench:
			return new GuiEmeraldWorkbench(invPlayer, world);
		case GuiIds.lapisWorkbench:
			return new GuiLapisWorkbench(invPlayer, world);
		case GuiIds.bronzeWorkbench:
			return new GuiBronzeWorkbench(invPlayer, world);
		case GuiIds.coalWorkbench:
			return new GuiCoalWorkbench(invPlayer, world);
		case GuiIds.glowstoneWorkbench:
			return new GuiGlowstoneWorkbench(invPlayer, world);
		case GuiIds.adamantiumWorkbench:
			return new GuiAdamantiumWorkbench(invPlayer, world);
		case GuiIds.silkWorkbench:
			return new GuiSilkWorkbench(invPlayer, world);
		case GuiIds.redstoneWorkbench:
			return new GuiRedstoneWorkbench(invPlayer, world);
		case GuiIds.blankWorkbench:
			new GuiBlankWorkbench(invPlayer, world);
		}
		return null;
	}
}

 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.util;

import cpw.mods.fml.common.network.IGuiHandler;
import io.github.fergoman123.fergotools.furnaces.QuartzFurnace.*;
import io.github.fergoman123.fergotools.furnaces.ObsidianFurnace.*;
import io.github.fergoman123.fergotools.furnaces.EmeraldFurnace.*;
import io.github.fergoman123.fergotools.furnaces.LapisFurnace.*;
import io.github.fergoman123.fergotools.furnaces.BronzeFurnace.*;
import io.github.fergoman123.fergotools.furnaces.CoalFurnace.*;
import io.github.fergoman123.fergotools.furnaces.GlowstoneFurnace.*;
import io.github.fergoman123.fergotools.furnaces.AdamantiumFurnace.*;
import io.github.fergoman123.fergotools.furnaces.SilkFurnace.*;
import io.github.fergoman123.fergotools.furnaces.RedstoneFurnace.*;
import io.github.fergoman123.fergotools.furnaces.Macerator.*;

import io.github.fergoman123.fergotools.reference.GuiIds;
import io.github.fergoman123.fergotools.workbenches.EmeraldWorkbench.*;
import io.github.fergoman123.fergotools.workbenches.ObsidianWorkbench.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

public class GuiHandler  implements IGuiHandler
{
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
    {
        InventoryPlayer inventory = player.inventory;
        if(id == GuiIds.quartzFurnace.ordinal())
        {
            TileEntityQuartzFurnace quartzFurnace = (TileEntityQuartzFurnace)world.getTileEntity(x, y, z);
            return new ContainerQuartzFurnace(inventory, quartzFurnace);
        }
        else if (id == GuiIds.obsidianFurnace.ordinal())
        {
            TileEntityObsidianFurnace obsidianFurnace = (TileEntityObsidianFurnace)world.getTileEntity(x, y, z);
            return new ContainerObsidianFurnace(inventory, obsidianFurnace);
        }
        else if (id == GuiIds.emeraldCrystalFurnace.ordinal())
        {
            TileEntityEmeraldFurnace emeraldCrystalFurnace = (TileEntityEmeraldFurnace)world.getTileEntity(x, y, z);
            return new ContainerEmeraldFurnace(inventory, emeraldCrystalFurnace);
        }
        else if (id == GuiIds.lapisCrystalFurnace.ordinal())
        {
            TileEntityLapisFurnace lapisCrystalFurnace = (TileEntityLapisFurnace)world.getTileEntity(x, y, z);
            return new ContainerLapisFurnace(inventory, lapisCrystalFurnace);
        }
        else if (id == GuiIds.bronzeFurnace.ordinal())
        {
            TileEntityBronzeFurnace bronzeFurnace = (TileEntityBronzeFurnace)world.getTileEntity(x, y, z);
            return new ContainerBronzeFurnace(inventory, bronzeFurnace);
        }
        else if (id == GuiIds.coalFurnace.ordinal())
        {
            TileEntityCoalFurnace coalFurnace = (TileEntityCoalFurnace)world.getTileEntity(x, y, z);
            return new ContainerCoalFurnace(inventory, coalFurnace);
        }
        else if (id == GuiIds.glowstoneFurnace.ordinal())
        {
            TileEntityGlowstoneFurnace glowstoneFurnace = (TileEntityGlowstoneFurnace)world.getTileEntity(x, y, z);
            return new ContainerGlowstoneFurnace(inventory, glowstoneFurnace);
        }
        else if (id == GuiIds.adamantiumFurnace.ordinal())
        {
            TileEntityAdamantiumFurnace adamantiumFurnace = (TileEntityAdamantiumFurnace)world.getTileEntity(x, y, z);
            return new ContainerAdamantiumFurnace(inventory, adamantiumFurnace);
        }
        else if (id == GuiIds.silkFurnace.ordinal())
        {
            TileEntitySilkFurnace silkFurnace = (TileEntitySilkFurnace)world.getTileEntity(x, y, z);
            return new ContainerSilkFurnace(inventory, silkFurnace);
        }
        else if (id == GuiIds.redstoneFurnace.ordinal())
        {
            TileEntityRedstoneFurnace redstoneFurnace = (TileEntityRedstoneFurnace)world.getTileEntity(x, y, z);
            return new ContainerRedstoneFurnace(inventory, redstoneFurnace);
        }
        else if (id == GuiIds.macerator.ordinal())
        {
            TileEntityMacerator macerator = (TileEntityMacerator)world.getTileEntity(x, y, z);
            return new ContainerMacerator(inventory, macerator);
        }
        else if (id == GuiIds.obsidianWorkbench.ordinal())
        {
            return new ContainerObsidianWorkbench(inventory, world, x, y, z);
        }
        else if (id == GuiIds.emeraldWorkbench.ordinal())
        {
            ContainerEmeraldWorkbench workbench = new ContainerEmeraldWorkbench(inventory, world, x, y, z);
            return workbench;
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
    {
        InventoryPlayer inventory = player.inventory;
        if(id == GuiIds.quartzFurnace.ordinal())
        {
            TileEntityQuartzFurnace quartzFurnace = (TileEntityQuartzFurnace)world.getTileEntity(x, y, z);
            return new GuiQuartzFurnace(inventory, quartzFurnace);
        }
        else if (id == GuiIds.obsidianFurnace.ordinal())
        {
            TileEntityObsidianFurnace obsidianFurnace = (TileEntityObsidianFurnace)world.getTileEntity(x, y, z);
            return new GuiObsidianFurnace(inventory, obsidianFurnace);
        }
        else if (id == GuiIds.emeraldCrystalFurnace.ordinal())
        {
            TileEntityEmeraldFurnace emeraldCrystalFurnace = (TileEntityEmeraldFurnace)world.getTileEntity(x, y, z);
            return new GuiEmeraldFurnace(inventory, emeraldCrystalFurnace);
        }
        else if (id == GuiIds.lapisCrystalFurnace.ordinal())
        {
            TileEntityLapisFurnace lapisCrystalFurnace = (TileEntityLapisFurnace)world.getTileEntity(x, y, z);
            return new GuiLapisFurnace(inventory, lapisCrystalFurnace);
        }
        else if (id == GuiIds.bronzeFurnace.ordinal())
        {
            TileEntityBronzeFurnace bronzeFurnace = (TileEntityBronzeFurnace)world.getTileEntity(x, y, z);
            return new GuiBronzeFurnace(inventory, bronzeFurnace);
        }
        else if (id == GuiIds.coalFurnace.ordinal())
        {
            TileEntityCoalFurnace coalFurnace = (TileEntityCoalFurnace)world.getTileEntity(x, y, z);
            return new GuiCoalFurnace(inventory, coalFurnace);
        }
        else if (id == GuiIds.glowstoneFurnace.ordinal())
        {
            TileEntityGlowstoneFurnace glowstoneFurnace = (TileEntityGlowstoneFurnace)world.getTileEntity(x, y, z);
            return new GuiGlowstoneFurnace(inventory, glowstoneFurnace);
        }
        else if (id == GuiIds.adamantiumFurnace.ordinal())
        {
            TileEntityAdamantiumFurnace adamantiumFurnace = (TileEntityAdamantiumFurnace)world.getTileEntity(x, y, z);
            return new GuiAdamantiumFurnace(inventory, adamantiumFurnace);
        }
        else if (id == GuiIds.silkFurnace.ordinal())
        {
            TileEntitySilkFurnace silkFurnace = (TileEntitySilkFurnace)world.getTileEntity(x, y, z);
            return new GuiSilkFurnace(inventory, silkFurnace);
        }
        else if (id == GuiIds.redstoneFurnace.ordinal())
        {
            TileEntityRedstoneFurnace redstoneFurnace = (TileEntityRedstoneFurnace)world.getTileEntity(x, y, z);
            return new GuiRedstoneFurnace(inventory, redstoneFurnace);
        }
        else if (id == GuiIds.macerator.ordinal())
        {
            TileEntityMacerator macerator = (TileEntityMacerator)world.getTileEntity(x, y, z);
            return new GuiMacerator(inventory, macerator);
        }
        else if (id == GuiIds.obsidianWorkbench.ordinal())
        {
            return new GuiObsidianWorkbench(inventory, world, x, y, z);
        }
        return null;
    }
}

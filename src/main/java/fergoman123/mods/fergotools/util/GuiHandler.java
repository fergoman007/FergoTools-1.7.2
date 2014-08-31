 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.fergotools.util;

import cpw.mods.fml.common.network.IGuiHandler;
import fergoman123.mods.fergotools.furnaces.QuartzFurnace.*;
import fergoman123.mods.fergotools.furnaces.ObsidianFurnace.*;
import fergoman123.mods.fergotools.furnaces.EmeraldFurnace.*;
import fergoman123.mods.fergotools.furnaces.LapisFurnace.*;
import fergoman123.mods.fergotools.furnaces.BronzeFurnace.*;
import fergoman123.mods.fergotools.furnaces.CoalFurnace.*;
import fergoman123.mods.fergotools.furnaces.GlowstoneFurnace.*;
import fergoman123.mods.fergotools.furnaces.AdamantiumFurnace.*;
import fergoman123.mods.fergotools.furnaces.SilkFurnace.*;
import fergoman123.mods.fergotools.furnaces.RedstoneFurnace.*;
import fergoman123.mods.fergotools.furnaces.Macerator.*;

import fergoman123.mods.fergotools.reference.GuiIds;
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
        return null;
    }
}

 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.handler;

 import cpw.mods.fml.common.network.IGuiHandler;
 import io.github.fergoman123.fergotools.core.gui.furnace.*;
 import io.github.fergoman123.fergotools.core.gui.furnace.container.*;
 import io.github.fergoman123.fergotools.core.tileentity.*;
 import io.github.fergoman123.fergotools.reference.GuiIds;
 import io.github.fergoman123.fergotools.workbenches.AdamantiumWorkbench.ContainerAdamantiumWorkbench;
 import io.github.fergoman123.fergotools.workbenches.AdamantiumWorkbench.GuiAdamantiumWorkbench;
 import io.github.fergoman123.fergotools.workbenches.BronzeWorkbench.ContainerBronzeWorkbench;
 import io.github.fergoman123.fergotools.workbenches.BronzeWorkbench.GuiBronzeWorkbench;
 import io.github.fergoman123.fergotools.workbenches.CoalWorkbench.ContainerCoalWorkbench;
 import io.github.fergoman123.fergotools.workbenches.CoalWorkbench.GuiCoalWorkbench;
 import io.github.fergoman123.fergotools.workbenches.EmeraldWorkbench.ContainerEmeraldWorkbench;
 import io.github.fergoman123.fergotools.workbenches.EmeraldWorkbench.GuiEmeraldWorkbench;
 import io.github.fergoman123.fergotools.workbenches.GlowstoneWorkbench.ContainerGlowstoneWorkbench;
 import io.github.fergoman123.fergotools.workbenches.GlowstoneWorkbench.GuiGlowstoneWorkbench;
 import io.github.fergoman123.fergotools.workbenches.LapisWorkbench.ContainerLapisWorkbench;
 import io.github.fergoman123.fergotools.workbenches.LapisWorkbench.GuiLapisWorkbench;
 import io.github.fergoman123.fergotools.workbenches.ObsidianWorkbench.ContainerObsidianWorkbench;
 import io.github.fergoman123.fergotools.workbenches.ObsidianWorkbench.GuiObsidianWorkbench;
 import io.github.fergoman123.fergotools.workbenches.RedstoneWorkbench.ContainerRedstoneWorkbench;
 import io.github.fergoman123.fergotools.workbenches.RedstoneWorkbench.GuiRedstoneWorkbench;
 import io.github.fergoman123.fergotools.workbenches.SilkWorkbench.ContainerSilkWorkbench;
 import io.github.fergoman123.fergotools.workbenches.SilkWorkbench.GuiSilkWorkbench;
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
            return new ContainerEmeraldWorkbench(inventory, world, x, y, z);
        }
        else if (id == GuiIds.lapisWorkbench.ordinal())
        {
            return new ContainerLapisWorkbench(inventory, world, x, y, z);
        }
        else if (id == GuiIds.bronzeWorkbench.ordinal())
        {
            return new ContainerBronzeWorkbench(inventory, world, x, y, z);
        }
        else if (id == GuiIds.coalWorkbench.ordinal())
        {
            return new ContainerCoalWorkbench(inventory, world, x, y, z);
        }
        else if (id == GuiIds.glowstoneWorkBench.ordinal())
        {
            return new ContainerGlowstoneWorkbench(inventory, world,x, y, z);
        }
        else if (id == GuiIds.adamantiumWorkbench.ordinal())
        {
            return new ContainerAdamantiumWorkbench(inventory, world, x, y, z);
        }
        else if (id == GuiIds.silkWorkbench.ordinal())
        {
            return new ContainerSilkWorkbench(inventory, world, x, y, z);
        }
        else if (id == GuiIds.redstoneWorkbench.ordinal())
        {
            return new ContainerRedstoneWorkbench(inventory, world, x, y, z);
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
        else if (id == GuiIds.emeraldWorkbench.ordinal())
        {
            return new GuiEmeraldWorkbench(inventory, world, x, y, z);
        }
        else if (id == GuiIds.lapisWorkbench.ordinal())
        {
            return new GuiLapisWorkbench(inventory, world, x, y, z);
        }
        else if (id == GuiIds.bronzeWorkbench.ordinal())
        {
            return new GuiBronzeWorkbench(inventory, world, x, y, z);
        }
        else if (id == GuiIds.coalWorkbench.ordinal())
        {
            return new GuiCoalWorkbench(inventory, world, x, y, z);
        }
        else if (id == GuiIds.glowstoneWorkBench.ordinal())
        {
            return new GuiGlowstoneWorkbench(inventory, world,x, y, z);
        }
        else if (id == GuiIds.adamantiumWorkbench.ordinal())
        {
            return new GuiAdamantiumWorkbench(inventory, world, x, y, z);
        }
        else if (id == GuiIds.silkWorkbench.ordinal())
        {
            return new GuiSilkWorkbench(inventory, world, x, y, z);
        }
        else if (id == GuiIds.redstoneWorkbench.ordinal())
        {
            return new GuiRedstoneWorkbench(inventory, world, x, y, z);
        }
        return null;
    }
}

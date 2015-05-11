 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.handler;

 import io.github.fergoman123.fergotools.common.Containers.ContainerQuartzFurnace;
 import io.github.fergoman123.fergotools.common.FurnaceGuis;
 import io.github.fergoman123.fergotools.common.Tiles.TileQuartzFurnace;
 import io.github.fergoman123.fergotools.reference.GuiIds;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.entity.player.InventoryPlayer;
 import net.minecraft.tileentity.TileEntity;
 import net.minecraft.util.BlockPos;
 import net.minecraft.world.World;
 import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler  implements IGuiHandler
{
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
    {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity tileEntity = world.getTileEntity(pos);
        InventoryPlayer inventory = player.inventory;
        if(id == GuiIds.quartzFurnace.ordinal())
        {
            TileQuartzFurnace quartzFurnace = (TileQuartzFurnace)tileEntity;
            return new ContainerQuartzFurnace(inventory, quartzFurnace);
        }
//        else if (id == GuiIds.obsidianFurnace.ordinal())
//        {
//            TileEntityObsidianFurnace obsidianFurnace = (TileEntityObsidianFurnace)tileEntity;
//            return new ContainerObsidianFurnace(inventory, obsidianFurnace);
//        }
//        else if (id == GuiIds.emeraldCrystalFurnace.ordinal())
//        {
//            TileEntityEmeraldFurnace emeraldCrystalFurnace = (TileEntityEmeraldFurnace)tileEntity;
//            return new ContainerEmeraldFurnace(inventory, emeraldCrystalFurnace);
//        }
//        else if (id == GuiIds.lapisCrystalFurnace.ordinal())
//        {
//            TileEntityLapisFurnace lapisCrystalFurnace = (TileEntityLapisFurnace)tileEntity;
//            return new ContainerLapisFurnace(inventory, lapisCrystalFurnace);
//        }
//        else if (id == GuiIds.bronzeFurnace.ordinal())
//        {
//            TileEntityBronzeFurnace bronzeFurnace = (TileEntityBronzeFurnace)tileEntity;
//            return new ContainerBronzeFurnace(inventory, bronzeFurnace);
//        }
//        else if (id == GuiIds.coalFurnace.ordinal())
//        {
//            TileEntityCoalFurnace coalFurnace = (TileEntityCoalFurnace)tileEntity;
//            return new ContainerCoalFurnace(inventory, coalFurnace);
//        }
//        else if (id == GuiIds.glowstoneFurnace.ordinal())
//        {
//            TileEntityGlowstoneFurnace glowstoneFurnace = (TileEntityGlowstoneFurnace)tileEntity;
//            return new ContainerGlowstoneFurnace(inventory, glowstoneFurnace);
//        }
//        else if (id == GuiIds.adamantiumFurnace.ordinal())
//        {
//            TileEntityAdamantiumFurnace adamantiumFurnace = (TileEntityAdamantiumFurnace)tileEntity;
//            return new ContainerAdamantiumFurnace(inventory, adamantiumFurnace);
//        }
//        else if (id == GuiIds.silkFurnace.ordinal())
//        {
//            TileEntitySilkFurnace silkFurnace = (TileEntitySilkFurnace)tileEntity;
//            return new ContainerSilkFurnace(inventory, silkFurnace);
//        }
//        else if (id == GuiIds.redstoneFurnace.ordinal())
//        {
//            TileEntityRedstoneFurnace redstoneFurnace = (TileEntityRedstoneFurnace)tileEntity;
//            return new ContainerRedstoneFurnace(inventory, redstoneFurnace);
//        }
//        else if (id == GuiIds.macerator.ordinal())
//        {
//            TileEntityMacerator macerator = (TileEntityMacerator)tileEntity;
//            return new ContainerMacerator(inventory, macerator);
//        }
//        else if (id == GuiIds.obsidianWorkbench.ordinal())
//        {
//            return new ContainerObsidianWorkbench(inventory, world, x, y, z);
//        }
//        else if (id == GuiIds.emeraldWorkbench.ordinal())
//        {
//            return new ContainerEmeraldWorkbench(inventory, world, x, y, z);
//        }
//        else if (id == GuiIds.lapisWorkbench.ordinal())
//        {
//            return new ContainerLapisWorkbench(inventory, world, x, y, z);
//        }
//        else if (id == GuiIds.bronzeWorkbench.ordinal())
//        {
//            return new ContainerBronzeWorkbench(inventory, world, x, y, z);
//        }
//        else if (id == GuiIds.coalWorkbench.ordinal())
//        {
//            return new ContainerCoalWorkbench(inventory, world, x, y, z);
//        }
//        else if (id == GuiIds.glowstoneWorkbench.ordinal())
//        {
//            return new ContainerGlowstoneWorkbench(inventory, world,x, y, z);
//        }
//        else if (id == GuiIds.adamantiumWorkbench.ordinal())
//        {
//            return new ContainerAdamantiumWorkbench(inventory, world, x, y, z);
//        }
//        else if (id == GuiIds.silkWorkbench.ordinal())
//        {
//            return new ContainerSilkWorkbench(inventory, world, x, y, z);
//        }
//        else if (id == GuiIds.redstoneWorkbench.ordinal())
//        {
//            return new ContainerRedstoneWorkbench(inventory, world, x, y, z);
//        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
    {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity tileEntity = world.getTileEntity(pos);
        InventoryPlayer inventory = player.inventory;
        if(id == GuiIds.quartzFurnace.ordinal())
        {
            TileQuartzFurnace quartzFurnace = (TileQuartzFurnace)tileEntity;
            return new FurnaceGuis.GuiQuartzFurnace(inventory, quartzFurnace);
        }
//        else if (id == GuiIds.obsidianFurnace.ordinal())
//        {
//            TileEntityObsidianFurnace obsidianFurnace = (TileEntityObsidianFurnace)tileEntity;
//            return new GuiObsidianFurnace(inventory, obsidianFurnace);
//        }
//        else if (id == GuiIds.emeraldCrystalFurnace.ordinal())
//        {
//            TileEntityEmeraldFurnace emeraldCrystalFurnace = (TileEntityEmeraldFurnace)tileEntity;
//            return new GuiEmeraldFurnace(inventory, emeraldCrystalFurnace);
//        }
//        else if (id == GuiIds.lapisCrystalFurnace.ordinal())
//        {
//            TileEntityLapisFurnace lapisCrystalFurnace = (TileEntityLapisFurnace)tileEntity;
//            return new GuiLapisFurnace(inventory, lapisCrystalFurnace);
//        }
//        else if (id == GuiIds.bronzeFurnace.ordinal())
//        {
//            TileEntityBronzeFurnace bronzeFurnace = (TileEntityBronzeFurnace)tileEntity;
//            return new GuiBronzeFurnace(inventory, bronzeFurnace);
//        }
//        else if (id == GuiIds.coalFurnace.ordinal())
//        {
//            TileEntityCoalFurnace coalFurnace = (TileEntityCoalFurnace)tileEntity;
//            return new GuiCoalFurnace(inventory, coalFurnace);
//        }
//        else if (id == GuiIds.glowstoneFurnace.ordinal())
//        {
//            TileEntityGlowstoneFurnace glowstoneFurnace = (TileEntityGlowstoneFurnace)tileEntity;
//            return new GuiGlowstoneFurnace(inventory, glowstoneFurnace);
//        }
//        else if (id == GuiIds.adamantiumFurnace.ordinal())
//        {
//            TileEntityAdamantiumFurnace adamantiumFurnace = (TileEntityAdamantiumFurnace)tileEntity;
//            return new GuiAdamantiumFurnace(inventory, adamantiumFurnace);
//        }
//        else if (id == GuiIds.silkFurnace.ordinal())
//        {
//            TileEntitySilkFurnace silkFurnace = (TileEntitySilkFurnace)tileEntity;
//            return new GuiSilkFurnace(inventory, silkFurnace);
//        }
//        else if (id == GuiIds.redstoneFurnace.ordinal())
//        {
//            TileEntityRedstoneFurnace redstoneFurnace = (TileEntityRedstoneFurnace)tileEntity;
//            return new GuiRedstoneFurnace(inventory, redstoneFurnace);
//        }
//        else if (id == GuiIds.macerator.ordinal())
//        {
//            TileEntityMacerator macerator = (TileEntityMacerator)tileEntity;
//            return new GuiMacerator(inventory, macerator);
//        }
//        else if (id == GuiIds.obsidianWorkbench.ordinal())
//        {
//            return new GuiObsidianWorkbench(inventory, world, x, y, z);
//        }
//        else if (id == GuiIds.emeraldWorkbench.ordinal())
//        {
//            return new GuiEmeraldWorkbench(inventory, world, x, y, z);
//        }
//        else if (id == GuiIds.lapisWorkbench.ordinal())
//        {
//            return new GuiLapisWorkbench(inventory, world, x, y, z);
//        }
//        else if (id == GuiIds.bronzeWorkbench.ordinal())
//        {
//            return new GuiBronzeWorkbench(inventory, world, x, y, z);
//        }
//        else if (id == GuiIds.coalWorkbench.ordinal())
//        {
//            return new GuiCoalWorkbench(inventory, world, x, y, z);
//        }
//        else if (id == GuiIds.glowstoneWorkbench.ordinal())
//        {
//            return new GuiGlowstoneWorkbench(inventory, world,x, y, z);
//        }
//        else if (id == GuiIds.adamantiumWorkbench.ordinal())
//        {
//            return new GuiAdamantiumWorkbench(inventory, world, x, y, z);
//        }
//        else if (id == GuiIds.silkWorkbench.ordinal())
//        {
//            return new GuiSilkWorkbench(inventory, world, x, y, z);
//        }
//        else if (id == GuiIds.redstoneWorkbench.ordinal())
//        {
//            return new GuiRedstoneWorkbench(inventory, world, x, y, z);
//        }
        return null;
    }
}

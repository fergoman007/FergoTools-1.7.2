package io.github.fergoman123.fergotools.common.handler;

import io.github.fergoman123.fergotools.common.gui.GuiMacerator;
import io.github.fergoman123.fergotools.common.gui.GuiQuartzFurnace;
import io.github.fergoman123.fergotools.common.inventory.ContainerMacerator;
import io.github.fergoman123.fergotools.common.inventory.ContainerQuartzFurnace;
import io.github.fergoman123.fergotools.common.tileentity.TileEntityMacerator;
import io.github.fergoman123.fergotools.common.tileentity.TileEntityQuartzFurnace;
import io.github.fergoman123.fergotools.info.GuiIds;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
    public static final GuiHandler instance = new GuiHandler();

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity entity = world.getTileEntity(pos);
        InventoryPlayer inventory = player.inventory;

        if (ID == GuiIds.quartzFurnace.ordinal())
        {
            TileEntityQuartzFurnace quartzFurnace = (TileEntityQuartzFurnace)entity;
            return new ContainerQuartzFurnace(inventory, quartzFurnace);
        }
        else if(ID == GuiIds.macerator.ordinal())
        {
            TileEntityMacerator macerator = (TileEntityMacerator)entity;
            return new ContainerMacerator(inventory, macerator);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity entity = world.getTileEntity(pos);
        InventoryPlayer inventory = player.inventory;

        if (ID == GuiIds.quartzFurnace.ordinal())
        {
            TileEntityQuartzFurnace quartzFurnace = (TileEntityQuartzFurnace)entity;
            return new GuiQuartzFurnace(inventory, quartzFurnace);
        }
        else if(ID == GuiIds.macerator.ordinal())
        {
            TileEntityMacerator macerator = (TileEntityMacerator)entity;
            return new GuiMacerator(inventory, macerator);
        }
        return null;
    }
}

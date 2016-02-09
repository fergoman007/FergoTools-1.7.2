package io.github.fergoman123.fergotools.handler;

import io.github.fergoman123.fergotools.client.gui.GuiQuartzFurnace;
import io.github.fergoman123.fergotools.inventory.ContainerQuartzFurnace;
import io.github.fergoman123.fergotools.reference.GuiIds;
import io.github.fergoman123.fergotools.tileentity.TileEntityQuartzFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity tileEntity = world.getTileEntity(pos);
        switch (ID){
            case GuiIds.quartzFurnace: return new ContainerQuartzFurnace(player.inventory, (TileEntityQuartzFurnace)tileEntity);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity tileEntity = world.getTileEntity(pos);
        switch (ID){
            case GuiIds.quartzFurnace: return new GuiQuartzFurnace(player.inventory, (TileEntityQuartzFurnace)tileEntity);
        }
        return null;
    }
}

package io.github.fergoman123.fergotools.common.handler;

import io.github.fergoman123.fergotools.common.gui.GuiMacerator;
import io.github.fergoman123.fergotools.common.gui.GuiQuartzFurnace;
import io.github.fergoman123.fergotools.common.inventory.ContainerMacerator;
import io.github.fergoman123.fergotools.common.inventory.ContainerQuartzFurnace;
import io.github.fergoman123.fergotools.common.tileentity.TileMacerator;
import io.github.fergoman123.fergotools.common.tileentity.TileQuartzFurnace;
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
            TileQuartzFurnace quartzFurnace = (TileQuartzFurnace)entity;
            return new ContainerQuartzFurnace(inventory, quartzFurnace);
        }
        else if (ID == GuiIds.obsidianFurnace.ordinal())
        {
            //TODO: obsidian furnace tile entity
            //TODO: obsidian furnace container
        }
        else if (ID == GuiIds.emeraldFurnace.ordinal())
        {
            //TODO: emerald furnace tile entity
            //TODO: emerald furnace container
        }
        else if (ID == GuiIds.lapisFurnace.ordinal())
        {
            //TODO: lapis furnace tile entity
            //TODO: lapis furnace container
        }
        else if (ID == GuiIds.bronzeFurnace.ordinal())
        {
            //TODO: bronze furnace tile entity
            //TODO: bronze furnace container
        }
        else if (ID == GuiIds.coalFurnace.ordinal())
        {
            //TODO: coal furnace tile entity
            //TODO: coal furnace container
        }
        else if (ID == GuiIds.glowstoneFurnace.ordinal())
        {
            //TODO: glowstone furnace tile entity
            //TODO: glowstone furnace container
        }
        else if (ID == GuiIds.adamantiumFurnace.ordinal())
        {
            //TODO: adamantium furnace tile entity
            //TODO: adamantium furnace container
        }
        else if (ID == GuiIds.silkFurnace.ordinal())
        {
            //TODO: silk furnace tile entity
            //TODO: silk furnace container
        }
        else if (ID == GuiIds.redstoneFurnace.ordinal())
        {
            //TODO: redstone furnace tile entity
            //TODO: redstone furnace container
        }
        else if(ID == GuiIds.macerator.ordinal())
        {
            TileMacerator macerator = (TileMacerator)entity;
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
            TileQuartzFurnace quartzFurnace = (TileQuartzFurnace)entity;
            return new GuiQuartzFurnace(inventory, quartzFurnace);
        }
        else if (ID == GuiIds.obsidianFurnace.ordinal())
        {
            //TODO: obsidian furnace tile entity
            //TODO: obsidian furnace gui
        }
        else if (ID == GuiIds.emeraldFurnace.ordinal())
        {
            //TODO: emerald furnace tile entity
            //TODO: emerald furnace gui
        }
        else if (ID == GuiIds.lapisFurnace.ordinal())
        {
            //TODO: lapis furnace tile entity
            //TODO: lapis furnace gui
        }
        else if (ID == GuiIds.bronzeFurnace.ordinal())
        {
            //TODO: bronze furnace tile entity
            //TODO: bronze furnace gui
        }
        else if (ID == GuiIds.coalFurnace.ordinal())
        {
            //TODO: coal furnace tile entity
            //TODO: coal furnace gui
        }
        else if (ID == GuiIds.glowstoneFurnace.ordinal())
        {
            //TODO: glowstone furnace tile entity
            //TODO: glowstone furnace gui
        }
        else if (ID == GuiIds.adamantiumFurnace.ordinal())
        {
            //TODO: adamantium furnace tile entity
            //TODO: adamantium furnace gui
        }
        else if (ID == GuiIds.silkFurnace.ordinal())
        {
            //TODO: silk furnace tile entity
            //TODO: silk furnace gui
        }
        else if (ID == GuiIds.redstoneFurnace.ordinal())
        {
            //TODO: redstone furnace tile entity
            //TODO: redstone furnace gui
        }
        else if(ID == GuiIds.macerator.ordinal())
        {
            TileMacerator macerator = (TileMacerator)entity;
            return new GuiMacerator(inventory, macerator);
        }
        return null;
    }
}

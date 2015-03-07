package io.github.fergoman123.fergotools.common.handler;

import io.github.fergoman123.fergotools.common.furnace.*;
import io.github.fergoman123.fergotools.info.GuiIds;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
    public static final GuiHandler instance = new GuiHandler();

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity entity = world.getTileEntity(pos);
        InventoryPlayer inventory = player.inventory;

        if(id == GuiIds.quartzFurnace.ordinal())
        {
            QuartzFurnace.TileQuartzFurnace quartzFurnace = (QuartzFurnace.TileQuartzFurnace)world.getTileEntity(pos);
            return new QuartzFurnace.ContainerQuartzFurnace(inventory, quartzFurnace);
        }
        else if (id == GuiIds.obsidianFurnace.ordinal())
        {
            ObsidianFurnace.TileObsidianFurnace obsidianFurnace = (ObsidianFurnace.TileObsidianFurnace)world.getTileEntity(pos);
            return new ObsidianFurnace.ContainerObsidianFurnace(inventory, obsidianFurnace);
        }
        else if (id == GuiIds.emeraldFurnace.ordinal())
        {
            EmeraldFurnace.TileEmeraldFurnace emeraldCrystalFurnace = (EmeraldFurnace.TileEmeraldFurnace)world.getTileEntity(pos);
            return new EmeraldFurnace.ContainerEmeraldFurnace(inventory, emeraldCrystalFurnace);
        }
        else if (id == GuiIds.lapisFurnace.ordinal())
        {
            LapisFurnace.TileLapisFurnace lapisCrystalFurnace = (LapisFurnace.TileLapisFurnace)world.getTileEntity(pos);
            return new LapisFurnace.ContainerLapisFurnace(inventory, lapisCrystalFurnace);
        }
        else if (id == GuiIds.bronzeFurnace.ordinal())
        {
            BronzeFurnace.TileBronzeFurnace bronzeFurnace = (BronzeFurnace.TileBronzeFurnace)world.getTileEntity(pos);
            return new BronzeFurnace.ContainerBronzeFurnace(inventory, bronzeFurnace);
        }
        else if (id == GuiIds.coalFurnace.ordinal())
        {
            CoalFurnace.TileCoalFurnace coalFurnace = (CoalFurnace.TileCoalFurnace)world.getTileEntity(pos);
            return new CoalFurnace.ContainerCoalFurnace(inventory, coalFurnace);
        }
        else if (id == GuiIds.glowstoneFurnace.ordinal())
        {
            GlowstoneFurnace.TileGlowstoneFurnace glowstoneFurnace = (GlowstoneFurnace.TileGlowstoneFurnace)world.getTileEntity(pos);
            return new GlowstoneFurnace.ContainerGlowstoneFurnace(inventory, glowstoneFurnace);
        }
        else if (id == GuiIds.adamantiumFurnace.ordinal())
        {
            AdamantiumFurnace.TileAdamantiumFurnace adamantiumFurnace = (AdamantiumFurnace.TileAdamantiumFurnace)world.getTileEntity(pos);
            return new AdamantiumFurnace.ContainerAdamantiumFurnace(inventory, adamantiumFurnace);
        }
        else if (id == GuiIds.silkFurnace.ordinal())
        {
            SilkFurnace.TileSilkFurnace silkFurnace = (SilkFurnace.TileSilkFurnace)world.getTileEntity(pos);
            return new SilkFurnace.ContainerSilkFurnace(inventory, silkFurnace);
        }
        else if (id == GuiIds.redstoneFurnace.ordinal())
        {
            RedstoneFurnace.TileRedstoneFurnace redstoneFurnace = (RedstoneFurnace.TileRedstoneFurnace)world.getTileEntity(pos);
            return new RedstoneFurnace.ContainerRedstoneFurnace(inventory, redstoneFurnace);
        }
        else if (id == GuiIds.macerator.ordinal())
        {
            Macerator.TileMacerator macerator = (Macerator.TileMacerator)world.getTileEntity(pos);
            return new Macerator.ContainerMacerator(inventory, macerator);
        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        InventoryPlayer inventory = player.inventory;

        if(id == GuiIds.quartzFurnace.ordinal())
        {
            QuartzFurnace.TileQuartzFurnace quartzFurnace = (QuartzFurnace.TileQuartzFurnace)world.getTileEntity(pos);
            return new QuartzFurnace.GuiQuartzFurnace(inventory, quartzFurnace);
        }
        else if (id == GuiIds.obsidianFurnace.ordinal())
        {
            ObsidianFurnace.TileObsidianFurnace obsidianFurnace = (ObsidianFurnace.TileObsidianFurnace)world.getTileEntity(pos);
            return new ObsidianFurnace.GuiObsidianFurnace(inventory, obsidianFurnace);
        }
        else if (id == GuiIds.emeraldFurnace.ordinal())
        {
            EmeraldFurnace.TileEmeraldFurnace emeraldCrystalFurnace = (EmeraldFurnace.TileEmeraldFurnace)world.getTileEntity(pos);
            return new EmeraldFurnace.GuiEmeraldFurnace(inventory, emeraldCrystalFurnace);
        }
        else if (id == GuiIds.lapisFurnace.ordinal())
        {
            LapisFurnace.TileLapisFurnace lapisCrystalFurnace = (LapisFurnace.TileLapisFurnace)world.getTileEntity(pos);
            return new LapisFurnace.GuiLapisFurnace(inventory, lapisCrystalFurnace);
        }
        else if (id == GuiIds.bronzeFurnace.ordinal())
        {
            BronzeFurnace.TileBronzeFurnace bronzeFurnace = (BronzeFurnace.TileBronzeFurnace)world.getTileEntity(pos);
            return new BronzeFurnace.GuiBronzeFurnace(inventory, bronzeFurnace);
        }
        else if (id == GuiIds.coalFurnace.ordinal())
        {
            CoalFurnace.TileCoalFurnace coalFurnace = (CoalFurnace.TileCoalFurnace)world.getTileEntity(pos);
            return new CoalFurnace.GuiCoalFurnace(inventory, coalFurnace);
        }
        else if (id == GuiIds.glowstoneFurnace.ordinal())
        {
            GlowstoneFurnace.TileGlowstoneFurnace glowstoneFurnace = (GlowstoneFurnace.TileGlowstoneFurnace)world.getTileEntity(pos);
            return new GlowstoneFurnace.GuiGlowstoneFurnace(inventory, glowstoneFurnace);
        }
        else if (id == GuiIds.adamantiumFurnace.ordinal())
        {
            AdamantiumFurnace.TileAdamantiumFurnace adamantiumFurnace = (AdamantiumFurnace.TileAdamantiumFurnace)world.getTileEntity(pos);
            return new AdamantiumFurnace.GuiAdamantiumFurnace(inventory, adamantiumFurnace);
        }
        else if (id == GuiIds.silkFurnace.ordinal())
        {
            SilkFurnace.TileSilkFurnace silkFurnace = (SilkFurnace.TileSilkFurnace)world.getTileEntity(pos);
            return new SilkFurnace.GuiSilkFurnace(inventory, silkFurnace);
        }
        else if (id == GuiIds.redstoneFurnace.ordinal())
        {
            RedstoneFurnace.TileRedstoneFurnace redstoneFurnace = (RedstoneFurnace.TileRedstoneFurnace)world.getTileEntity(pos);
            return new RedstoneFurnace.GuiRedstoneFurnace(inventory, redstoneFurnace);
        }
        else if (id == GuiIds.macerator.ordinal())
        {
            Macerator.TileMacerator macerator = (Macerator.TileMacerator)world.getTileEntity(pos);
            return new Macerator.GuiMacerator(inventory, macerator);
        }
        return null;
    }
}

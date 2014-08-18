package fergoman123.mods.fergotools.util;

import cpw.mods.fml.common.network.IGuiHandler;
import fergoman123.mods.fergotools.gui.*;
import fergoman123.mods.fergotools.gui.container.*;
import fergoman123.mods.fergotools.reference.GuiIds;
import fergoman123.mods.fergotools.tileentity.*;
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
            TileEntityEmeraldCrystalFurnace emeraldCrystalFurnace = (TileEntityEmeraldCrystalFurnace)world.getTileEntity(x, y, z);
            return new ContainerEmeraldCrystalFurnace(inventory, emeraldCrystalFurnace);
        }
        else if (id == GuiIds.lapisCrystalFurnace.ordinal())
        {
            TileEntityLapisCrystalFurnace lapisCrystalFurnace = (TileEntityLapisCrystalFurnace)world.getTileEntity(x, y, z);
            return new ContainerLapisCrystalFurnace(inventory, lapisCrystalFurnace);
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
            TileEntityEmeraldCrystalFurnace emeraldCrystalFurnace = (TileEntityEmeraldCrystalFurnace)world.getTileEntity(x, y, z);
            return new GuiEmeraldCrystalFurnace(inventory, emeraldCrystalFurnace);
        }
        else if (id == GuiIds.lapisCrystalFurnace.ordinal())
        {
            TileEntityLapisCrystalFurnace lapisCrystalFurnace = (TileEntityLapisCrystalFurnace)world.getTileEntity(x, y, z);
            return new GuiLapisCrystalFurnace(inventory, lapisCrystalFurnace);
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

package fergoman123.mods.fergotools.proxy;

import cpw.mods.fml.common.network.IGuiHandler;
import fergoman123.mods.fergotools.gui.*;
import fergoman123.mods.fergotools.gui.container.*;
import fergoman123.mods.fergotools.reference.GuiIds;
import fergoman123.mods.fergotools.tileentity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ClientProxy extends CommonProxy implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity entity = world.getTileEntity(x, y, z);
        InventoryPlayer inventory = player.inventory;

        switch (ID)
        {
            case GuiIds.quartzFurnaceId:return new ContainerQuartzFurnace(inventory, (TileEntityQuartzFurnace)entity);
            case GuiIds.obsidianFurnaceId:return new ContainerObsidianFurnace(inventory, (TileEntityObsidianFurnace) entity);
            case GuiIds.emeraldCrystalFurnaceId:return new ContainerEmeraldCrystalFurnace(inventory, (TileEntityEmeraldCrystalFurnace) entity);
            case GuiIds.lapisCrystalFurnaceId:return new ContainerLapisCrystalFurnace(inventory, (TileEntityLapisCrystalFurnace) entity);
            case GuiIds.bronzeFurnaceId:return new ContainerBronzeFurnace(inventory, (TileEntityBronzeFurnace) entity);
            case GuiIds.coalFurnaceId:return new ContainerCoalFurnace(inventory, (TileEntityCoalFurnace) entity);
            case GuiIds.glowstoneFurnaceId:return new ContainerGlowstoneFurnace(inventory, (TileEntityGlowstoneFurnace) entity);
            case GuiIds.adamantiumFurnaceId:return new ContainerAdamantiumFurnace(inventory, (TileEntityAdamantiumFurnace) entity);
            case GuiIds.silkFurnaceId:return new ContainerSilkFurnace(inventory, (TileEntitySilkFurnace) entity);
            case GuiIds.redstoneFurnace:return new ContainerRedstoneFurnace(inventory, (TileEntityRedstoneFurnace) entity);
            case GuiIds.maceratorId:return new ContainerMacerator(inventory, (TileEntityMacerator) entity);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity entity = world.getTileEntity(x, y, z);
        InventoryPlayer inventory = player.inventory;

        switch (ID)
        {
            case GuiIds.quartzFurnaceId:return new GuiQuartzFurnace(inventory, (TileEntityQuartzFurnace)entity);
            case GuiIds.obsidianFurnaceId:return new GuiObsidianFurnace(inventory, (TileEntityObsidianFurnace) entity);
            case GuiIds.emeraldCrystalFurnaceId:return new GuiEmeraldCrystalFurnace(inventory, (TileEntityEmeraldCrystalFurnace) entity);
            case GuiIds.lapisCrystalFurnaceId:return new GuiLapisCrystalFurnace(inventory, (TileEntityLapisCrystalFurnace) entity);
            case GuiIds.bronzeFurnaceId:return new GuiBronzeFurnace(inventory, (TileEntityBronzeFurnace) entity);
            case GuiIds.coalFurnaceId:return new GuiCoalFurnace(inventory, (TileEntityCoalFurnace) entity);
            case GuiIds.glowstoneFurnaceId:return new GuiGlowstoneFurnace(inventory, (TileEntityGlowstoneFurnace) entity);
            case GuiIds.adamantiumFurnaceId:return new GuiAdamantiumFurnace(inventory, (TileEntityAdamantiumFurnace) entity);
            case GuiIds.silkFurnaceId:return new GuiSilkFurnace(inventory, (TileEntitySilkFurnace) entity);
            case GuiIds.redstoneFurnace:return new GuiRedstoneFurnace(inventory, (TileEntityRedstoneFurnace) entity);
            case GuiIds.maceratorId:return new GuiMacerator(inventory, (TileEntityMacerator) entity);
        }
        return null;
    }
}

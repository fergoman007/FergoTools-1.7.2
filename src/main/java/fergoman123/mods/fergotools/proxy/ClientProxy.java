package fergoman123.mods.fergotools.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.network.IGuiHandler;
import fergoman123.mods.fergotools.gui.*;
import fergoman123.mods.fergotools.gui.container.*;
import fergoman123.mods.fergotools.tileentity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Fergoman123 on 03/04/2014.
 */
public class ClientProxy extends CommonProxy implements IGuiHandler{
    public int addArmor(String armor)
    {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }

    @Override
    public Object getServerGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity entity = world.getTileEntity(x, y, z);
        InventoryPlayer inventory = player.inventory;
        switch(guiId)
        {
            case 0: return new ContainerQuartzFurnace(inventory, (TileEntityQuartzFurnace)entity);
            case 1: return new ContainerObsidianFurnace(inventory, (TileEntityObsidianFurnace)entity);
            case 2: return new ContainerEmeraldCrystalFurnace(inventory, (TileEntityEmeraldCrystalFurnace)entity);
            case 3: return new ContainerLapisCrystalFurnace(inventory, (TileEntityLapisCrystalFurnace)entity);
            case 4: return new ContainerBronzeFurnace(inventory, (TileEntityBronzeFurnace)entity);
            case 5: return new ContainerCoalFurnace(inventory, (TileEntityCoalFurnace)entity);
            case 6: return new ContainerGlowstoneFurnace(inventory, (TileEntityGlowstoneFurnace)entity);
            case 7: return new ContainerAdamantiumFurnace(inventory, (TileEntityAdamantiumFurnace)entity);
            case 8: return new ContainerSilkFurnace(inventory, (TileEntitySilkFurnace)entity);
            case 9: return new ContainerRedstoneFurnace(inventory, (TileEntityRedstoneFurnace)entity);
            case 10: return new ContainerMacerator(inventory, (TileEntityMacerator)entity);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity entity = world.getTileEntity(x, y, z);
        InventoryPlayer inventory = player.inventory;
        switch(guiId)
        {
            case 0: return new GuiQuartzFurnace(inventory, (TileEntityQuartzFurnace)entity);
            case 1: return new GuiObsidianFurnace(inventory, (TileEntityObsidianFurnace)entity);
            case 2: return new GuiEmeraldCrystalFurnace(inventory, (TileEntityEmeraldCrystalFurnace)entity);
            case 3: return new GuiLapisCrystalFurnace(inventory, (TileEntityLapisCrystalFurnace)entity);
            case 4: return new GuiBronzeFurnace(inventory, (TileEntityBronzeFurnace)entity);
            case 5: return new GuiCoalFurnace(inventory, (TileEntityCoalFurnace)entity);
            case 6: return new GuiGlowstoneFurnace(inventory, (TileEntityGlowstoneFurnace)entity);
            case 7: return new GuiAdamantiumFurnace(inventory, (TileEntityAdamantiumFurnace)entity);
            case 8: return new GuiSilkFurnace(inventory, (TileEntitySilkFurnace)entity);
            case 9: return new GuiRedstoneFurnace(inventory, (TileEntityRedstoneFurnace)entity);
            case 10: return new GuiMacerator(inventory, (TileEntityMacerator)entity);
        }
        return null;
    }
}

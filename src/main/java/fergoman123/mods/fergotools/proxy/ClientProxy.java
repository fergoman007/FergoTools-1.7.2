package fergoman123.mods.fergotools.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.network.IGuiHandler;
import fergoman123.mods.fergotools.gui.*;
import fergoman123.mods.fergotools.gui.container.*;
import fergoman123.mods.fergotools.tileentity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

public class ClientProxy extends CommonProxy implements IGuiHandler{

    public int addArmor(String armor){return RenderingRegistry.addNewArmourRendererPrefix(armor);}
    public void initSounds(){}
    public void initRenderers(){}

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntityQuartzFurnace quartzFurnace = (TileEntityQuartzFurnace)world.getTileEntity(x, y, z);
        TileEntityObsidianFurnace obsidianFurnace = (TileEntityObsidianFurnace)world.getTileEntity(x, y, z);
        TileEntityEmeraldCrystalFurnace emeraldCrystalFurnace = (TileEntityEmeraldCrystalFurnace)world.getTileEntity(x, y, z);
        TileEntityLapisCrystalFurnace lapisCrystalFurnace = (TileEntityLapisCrystalFurnace)world.getTileEntity(x, y, z);
        TileEntityBronzeFurnace bronzeFurnace = (TileEntityBronzeFurnace)world.getTileEntity(x, y, z);
        TileEntityCoalFurnace coalFurnace = (TileEntityCoalFurnace)world.getTileEntity(x, y, z);
        TileEntityGlowstoneFurnace glowstoneFurnace = (TileEntityGlowstoneFurnace)world.getTileEntity(x, y, z);
        TileEntityAdamantiumFurnace adamantiumFurnace = (TileEntityAdamantiumFurnace)world.getTileEntity(x, y, z);
        TileEntitySilkFurnace silkFurnace = (TileEntitySilkFurnace)world.getTileEntity(x, y, z);
        TileEntityRedstoneFurnace redstoneFurnace = (TileEntityRedstoneFurnace)world.getTileEntity(x, y, z);
        TileEntityMacerator macerator = (TileEntityMacerator)world.getTileEntity(x, y, z);
        InventoryPlayer inventory = player.inventory;

            switch(ID) {
                case 0:return new ContainerQuartzFurnace(inventory, quartzFurnace);
                case 1:return new ContainerObsidianFurnace(inventory, obsidianFurnace);
                case 2:return new ContainerEmeraldCrystalFurnace(inventory, emeraldCrystalFurnace);
                case 3:return new ContainerLapisCrystalFurnace(inventory, lapisCrystalFurnace);
                case 4:return new ContainerBronzeFurnace(inventory, bronzeFurnace);
                case 5:return new ContainerCoalFurnace(inventory, coalFurnace);
                case 6:return new ContainerGlowstoneFurnace(inventory, glowstoneFurnace);
                case 7:return new ContainerAdamantiumFurnace(inventory, adamantiumFurnace);
                case 8:return new ContainerSilkFurnace(inventory, silkFurnace);
                case 9:return new ContainerRedstoneFurnace(inventory, redstoneFurnace);
                case 10:return new ContainerMacerator(inventory, macerator);
            }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntityQuartzFurnace quartzFurnace = (TileEntityQuartzFurnace)world.getTileEntity(x, y, z);
        TileEntityObsidianFurnace obsidianFurnace = (TileEntityObsidianFurnace)world.getTileEntity(x, y, z);
        TileEntityEmeraldCrystalFurnace emeraldCrystalFurnace = (TileEntityEmeraldCrystalFurnace)world.getTileEntity(x, y, z);
        TileEntityLapisCrystalFurnace lapisCrystalFurnace = (TileEntityLapisCrystalFurnace)world.getTileEntity(x, y, z);
        TileEntityBronzeFurnace bronzeFurnace = (TileEntityBronzeFurnace)world.getTileEntity(x, y, z);
        TileEntityCoalFurnace coalFurnace = (TileEntityCoalFurnace)world.getTileEntity(x, y, z);
        TileEntityGlowstoneFurnace glowstoneFurnace = (TileEntityGlowstoneFurnace)world.getTileEntity(x, y, z);
        TileEntityAdamantiumFurnace adamantiumFurnace = (TileEntityAdamantiumFurnace)world.getTileEntity(x, y, z);
        TileEntitySilkFurnace silkFurnace = (TileEntitySilkFurnace)world.getTileEntity(x, y, z);
        TileEntityRedstoneFurnace redstoneFurnace = (TileEntityRedstoneFurnace)world.getTileEntity(x, y, z);
        TileEntityMacerator macerator = (TileEntityMacerator)world.getTileEntity(x, y, z);
        InventoryPlayer inventory = player.inventory;
        switch (ID)
        {
            case 0: return new GuiQuartzFurnace(inventory, quartzFurnace);
            case 1: return new GuiObsidianFurnace(inventory, obsidianFurnace);
            case 2: return new GuiEmeraldCrystalFurnace(inventory, emeraldCrystalFurnace);
            case 3: return new GuiLapisCrystalFurnace(inventory, lapisCrystalFurnace);
            case 4: return new GuiBronzeFurnace(inventory, bronzeFurnace);
            case 5: return new GuiCoalFurnace(inventory, coalFurnace);
            case 6: return new GuiGlowstoneFurnace(inventory, glowstoneFurnace);
            case 7: return new GuiAdamantiumFurnace(inventory, adamantiumFurnace);
            case 8: return new GuiSilkFurnace(inventory, silkFurnace);
            case 9: return new GuiRedstoneFurnace(inventory, redstoneFurnace);
            case 10: return new GuiMacerator(inventory, macerator);
        }
        return null;
    }
}

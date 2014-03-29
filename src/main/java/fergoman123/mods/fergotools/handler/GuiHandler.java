package fergoman123.mods.fergotools.handler;

import java.awt.Container;

import cpw.mods.fml.common.network.IGuiHandler;
import fergoman123.mods.fergotools.lib.ints.GuiInts;
import fergoman123.mods.fergotools.gui.*;
import fergoman123.mods.fergotools.gui.container.*;
import fergoman123.mods.fergotools.tileentity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;


public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		 switch(ID)
		 {
		 case 0: return new ContainerQuartzFurnace(player.inventory, (TileEntityQuartzFurnace) entity);
		 case 1: return new ContainerObsidianFurnace(player.inventory, (TileEntityObsidianFurnace)entity);
		 case 2: return new ContainerEmeraldCrystalFurnace(player.inventory, (TileEntityEmeraldCrystalFurnace)entity);
		 case 3: return new ContainerLapisCrystalFurnace(player.inventory, (TileEntityLapisCrystalFurnace)entity);
		 case 4: return new ContainerBronzeFurnace(player.inventory, (TileEntityBronzeFurnace)entity);
		 case 5: return new ContainerCoalFurnace(player.inventory, (TileEntityCoalFurnace)entity);
		 case 6: return new ContainerGlowstoneFurnace(player.inventory, (TileEntityGlowstoneFurnace)entity);
		 case 7: return new ContainerAdamantiumFurnace(player.inventory, (TileEntityAdamantiumFurnace)entity);
		 }
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		switch(ID)
		{
		case 0: return new GuiQuartzFurnace(player.inventory, (TileEntityQuartzFurnace) entity);
		 case 1: return new GuiObsidianFurnace(player.inventory, (TileEntityObsidianFurnace)entity);
		 case 2: return new GuiEmeraldCrystalFurnace(player.inventory, (TileEntityEmeraldCrystalFurnace)entity);
		 case 3: return new GuiLapisCrystalFurnace(player.inventory, (TileEntityLapisCrystalFurnace)entity);
		 case 4: return new GuiBronzeFurnace(player.inventory, (TileEntityBronzeFurnace)entity);
		 case 5: return new GuiCoalFurnace(player.inventory, (TileEntityCoalFurnace)entity);
		 case 6: return new GuiGlowstoneFurnace(player.inventory, (TileEntityGlowstoneFurnace)entity);
		 case 7: return new GuiAdamantiumFurnace(player.inventory, (TileEntityAdamantiumFurnace)entity);
		}
		return null;
	}

}

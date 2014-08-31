package fergoman123.mods.fergotools.util.base;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergoutil.gui.IContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;

public abstract class ContainerFT extends Container implements IContainer {

    public abstract ItemStack transferStackInSlot(EntityPlayer player, int par2);

    public abstract boolean canInteractWith(EntityPlayer player);

    @SideOnly(Side.CLIENT)
    public abstract void updateProgressBar(int par1, int par2);
}

package io.github.fergoman123.fergotools.item.shovel;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemShovelFT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemAdamantiumShovel extends ItemShovelFT {

    public ItemAdamantiumShovel() {
        super(Materials.Tools.adamantium, Materials.Tools.adamantium.getMaxUses());
        this.setUnlocalizedName(Names.Items.adamantiumShovel);
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return par2ItemStack.isItemEqual(new ItemStack(ModItems.ingotAdamantium)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean useExtraInfo)
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(NameHelper.translateToLocal(Names.Locale.adamantiumToolTip));
            list.add(NameHelper.translateToLocal(Names.Locale.durabilityToolTip) + " Infinity");
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }

}

package io.github.fergoman123.fergotools.item.armor;

import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.fergoutil.item.ArmorType;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.util.item.Materials;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemArmorQuartz extends ItemArmorFT {

    public ItemArmorQuartz(ArmorType type)
    {
        super(ArmorNames.quartz, Materials.Armor.quartzArmor ,type);
    }

    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        return par2ItemStack.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ModItems.quartzHelmet || stack.getItem() == ModItems.quartzChestplate || stack.getItem() == ModItems.quartzBoots)
        {return Textures.quartzArmorLayer1;}

        if (stack.getItem() == ModItems.quartzLeggings)
        {return Textures.quartzArmorLayer2;}
        else{return null;}
    }

    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo)
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(NameHelper.translateToLocal(Names.ArmorTooltipLocale.reductAmount));
            for (int i = 0; i < Names.ArmorTooltipLocale.quartzArmor.length; i++)
            {
                list.add(NameHelper.translateToLocal(Names.ArmorTooltipLocale.quartzArmor[i]));
            }
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }
}

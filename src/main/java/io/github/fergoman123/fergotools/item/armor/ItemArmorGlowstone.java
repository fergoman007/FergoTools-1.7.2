package io.github.fergoman123.fergotools.item.armor;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.ArmorTooltipLocale;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemArmorGlowstone extends ItemArmorFT {

    public ItemArmorGlowstone(ArmorType type)
    {
        super(ArmorNames.glowstone, Materials.Armor.glowstoneArmor, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.glowstoneHelmet || stack.getItem() == ModItems.glowstoneChestplate || stack.getItem() == ModItems.glowstoneBoots)
        {
            return Textures.glowstoneArmorLayer1;
        }

        if(stack.getItem() == ModItems.glowstoneLeggings)
        {
            return Textures.glowstoneArmorLayer2;
        }
        else
        {
            return null;
        }
    }

    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo)
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount));

            for (int i = 0; i < ArmorTooltipLocale.glowstoneArmor.length; i++)
            {
                list.add(NameHelper.translateToLocal(ArmorTooltipLocale.glowstoneArmor[i]));
            }
        }
        else
        {
            list.add(NameHelper.translateToLocal(Locale.holdShiftMessage));
        }
    }

}
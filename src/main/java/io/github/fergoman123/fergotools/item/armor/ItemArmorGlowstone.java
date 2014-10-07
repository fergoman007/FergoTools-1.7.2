package io.github.fergoman123.fergotools.item.armor;

import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.reference.Textures;
import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.fergoutil.item.ArmorType;
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
            list.add(NameHelper.translateToLocal(Names.ArmorTooltipLocale.reductAmount));

            for (int i = 0; i < Names.ArmorTooltipLocale.glowstoneArmor.length; i++)
            {
                list.add(NameHelper.translateToLocal(Names.ArmorTooltipLocale.glowstoneArmor[i]));
            }
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }

}

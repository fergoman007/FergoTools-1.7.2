package io.github.fergoman123.fergotools.item.armor;

import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemArmorEmerald extends ItemArmorFT {

    public ItemArmorEmerald(ArmorType type)
    {
        super(ArmorNames.emerald,  Materials.Armor.emeraldArmor, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.emeraldHelmet || stack.getItem() == ModItems.emeraldChestplate || stack.getItem() == ModItems.emeraldBoots)
        {
            return Textures.emeraldArmorLayer1;
        }

        if(stack.getItem() == ModItems.emeraldLeggings)
        {
            return Textures.emeraldArmorLayer2;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo) {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(NameHelper.translateToLocal(Names.ArmorTooltipLocale.reductAmount));
            for (int i = 0; i < Names.ArmorTooltipLocale.emeraldArmor.length; i++)
            {
                list.add(NameHelper.translateToLocal(Names.ArmorTooltipLocale.emeraldArmor[i]));
            }
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }

}

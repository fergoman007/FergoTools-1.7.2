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
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemArmorObsidian extends ItemArmorFT {

    public ItemArmorObsidian(ArmorType type) {
        super(ArmorNames.obsidian, Materials.Armor.obsidianArmor, type);
    }

    public String getArmorTexture(ItemStack is, Entity entity, int slot, String type)
    {
        if(is.getItem() == ModItems.obsidianHelmet || is.getItem() == ModItems.obsidianChestplate || is.getItem() == ModItems.obsidianBoots)
        {return Textures.obsidianArmorLayer1;}

        if(is.getItem() == ModItems.obsidianLeggings)
        {return Textures.obsidianArmorLayer2;}
        else{return null;}
    }

    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo)
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(NameHelper.translateToLocal(Names.ArmorTooltipLocale.reductAmount));
            for (int i = 0; i < Names.ArmorTooltipLocale.obsidianArmor.length; i++)
            {
                list.add(NameHelper.translateToLocal(Names.ArmorTooltipLocale.obsidianArmor[i]));
            }
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }
}

package io.github.fergoman123.fergotools.core.item.armor;

import io.github.fergoman123.fergotools.core.FTContent;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.ArmorTooltipLocale;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Fergoman123.
 */
public final class ItemArmorBronze extends ItemArmorFT {
    public ItemArmorBronze(String armorName, ArmorMaterial material, ArmorType type) {
        super(armorName, material, type);
    }

    public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
    {
        return repairItem.isItemEqual(new ItemStack(FTContent.ingotBronze)) || super.getIsRepairable(itemToRepair, repairItem);
    }

    @Override
    public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
        if (armor.getItem() == FTContent.bronzeHelmet || armor.getItem() == FTContent.bronzeChestplate || armor.getItem() == FTContent.bronzeBoots)
        {
            return Textures.bronzeArmorLayer1;
        }

        if (armor.getItem() == FTContent.bronzeLeggings)
        {
            return Textures.bronzeArmorLayer2;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount));
        for(String string : ArmorTooltipLocale.bronzeArmor)
        {
            list.add(NameHelper.translateToLocal(string));
        }
    }
}

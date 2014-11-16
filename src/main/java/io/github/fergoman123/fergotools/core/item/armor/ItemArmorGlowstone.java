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
public final class ItemArmorGlowstone extends ItemArmorFT
{
    public ItemArmorGlowstone(String armorName, ArmorMaterial material, ArmorType type) {
        super(armorName, material, type);
    }

    public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
    {
        return repairItem.isItemEqual(new ItemStack(FTContent.ingotGlowstone)) || super.getIsRepairable(itemToRepair, repairItem);
    }

    @Override
    public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
        if (armor.getItem() == FTContent.glowstoneHelmet || armor.getItem() == FTContent.glowstoneChestplate || armor.getItem() == FTContent.glowstoneBoots)
        {
            return Textures.glowstoneArmorLayer1;
        }

        if (armor.getItem() == FTContent.glowstoneLeggings)
        {
            return Textures.glowstoneArmorLayer2;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount));
        for(String string : ArmorTooltipLocale.glowstoneArmor)
        {
            list.add(NameHelper.translateToLocal(string));
        }
    }
}

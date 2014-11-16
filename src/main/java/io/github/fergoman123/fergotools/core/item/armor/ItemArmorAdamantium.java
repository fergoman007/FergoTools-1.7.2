package io.github.fergoman123.fergotools.core.item.armor;

import io.github.fergoman123.fergotools.core.FTContent;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.ArmorTooltipLocale;
import io.github.fergoman123.fergotools.util.PotionList;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by Fergoman123.
 */
public final class ItemArmorAdamantium extends ItemArmorFT
{

    public ItemArmorAdamantium(String armorName, ArmorMaterial material, ArmorType type) {
        super(armorName, material, type);
    }

    public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
    {
        return repairItem.isItemEqual(new ItemStack(FTContent.ingotAdamantium)) || super.getIsRepairable(itemToRepair, repairItem);
    }

    @Override
    public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
        if (armor.getItem() == FTContent.adamantiumHelmet || armor.getItem() == FTContent.adamantiumChestplate || armor.getItem() == FTContent.adamantiumBoots)
        {
            return Textures.adamantiumArmorLayer1;
        }

        if (armor.getItem() == FTContent.adamantiumLeggings)
        {
            return Textures.adamantiumArmorLayer2;
        }
        else
        {
            return null;
        }
    }

    public void onArmorTick(World world, EntityPlayer player, ItemStack armor)
    {
        ItemStack helmet = player.getCurrentArmor(3);
        ItemStack chest = player.getCurrentArmor(2);
        ItemStack legs = player.getCurrentArmor(1);
        ItemStack boots = player.getCurrentArmor(0);

        if (helmet != null) {
            if (helmet.getItem() == FTContent.adamantiumHelmet) {
                player.addPotionEffect(PotionList.waterBreathing);
                player.addPotionEffect(PotionList.saturation);
            }
        }

        if (chest != null)
        {
            if (chest.getItem() == FTContent.adamantiumChestplate)
            {
                player.addPotionEffect(PotionList.absorption);
            }
        }

        if (legs != null)
        {
            if (legs.getItem() == FTContent.adamantiumLeggings)
            {
                player.addPotionEffect(PotionList.jump);
            }
        }

        if (boots != null)
        {
            if (boots.getItem() == FTContent.adamantiumBoots)
            {
                player.addPotionEffect(PotionList.moveSpeed);
            }
        }
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount));
        for(String string : ArmorTooltipLocale.adamantiumArmor)
        {
            list.add(NameHelper.translateToLocal(string));
        }
    }
}

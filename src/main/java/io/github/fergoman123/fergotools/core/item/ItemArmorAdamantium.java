package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ArmorTooltipLocale;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.PotionList;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.util.item.AM;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class ItemArmorAdamantium extends ItemArmorFT
{
    public ItemArmorAdamantium(ArmorType type) {
        super(AM.adamantiumArmor, type, FTContent.ingotAdamantium, "adamantium");
        if (type == ArmorType.HELMET)
        {
            this.setUnlocalizedName(ItemNames.adamantiumHelmet);
        }

        if(type == ArmorType.CHEST)
        {
            this.setUnlocalizedName(ItemNames.adamantiumChestplate);
        }

        if (type == ArmorType.LEGS)
        {
            this.setUnlocalizedName(ItemNames.adamantiumLeggings);
        }

        if (type == ArmorType.BOOTS)
        {
            this.setUnlocalizedName(ItemNames.adamantiumBoots);
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

    @SuppressWarnings("unchecked")
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        if (this.armorType == ArmorType.HELMET.ordinal())
        {
            list.add("Reduction Amount: " + this.getArmorMaterial().getDamageReductionAmount(0));
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.adamantiumAbilities[0]));
        }

        if (this.armorType == ArmorType.CHEST.ordinal())
        {
            list.add("Reduction Amount: " + this.getArmorMaterial().getDamageReductionAmount(1));
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.adamantiumAbilities[1]));
        }

        if (this.armorType == ArmorType.LEGS.ordinal())
        {
            list.add("Reduction Amount: " + this.getArmorMaterial().getDamageReductionAmount(2));
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.adamantiumAbilities[2]));
        }

        if (this.armorType == ArmorType.BOOTS.ordinal())
        {
            list.add("Reduction Amount: " + this.getArmorMaterial().getDamageReductionAmount(3));
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.adamantiumAbilities[3]));
        }
    }
}

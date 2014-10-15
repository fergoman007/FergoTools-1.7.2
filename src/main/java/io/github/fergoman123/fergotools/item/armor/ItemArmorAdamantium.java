package io.github.fergoman123.fergotools.item.armor;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.util.PotionList;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemArmorAdamantium extends ItemArmorFT{

    public ItemArmorAdamantium(ArmorType type)
    {
        super(ArmorNames.adamantium, Materials.Armor.adamantiumArmor, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ModItems.adamantiumHelmet || stack.getItem() == ModItems.adamantiumChestplate || stack.getItem() == ModItems.adamantiumBoots)
        {
            return Textures.adamantiumArmorLayer1;
        }

        if (stack.getItem() == ModItems.adamantiumLeggings)
        {
            return Textures.adamantiumArmorLayer2;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
        if ((player.getCurrentArmor(3) != null) && (player.getCurrentArmor(2) != null) && (player.getCurrentArmor(1) != null) && (player.getCurrentArmor(0) != null)) {

            ItemStack helmet = player.getCurrentArmor(3);
            ItemStack chestplate = player.getCurrentArmor(2);
            ItemStack leggings = player.getCurrentArmor(1);
            ItemStack boots = player.getCurrentArmor(0);

            if (player.getCurrentArmor(3).getItem() == ModItems.adamantiumHelmet) {
                player.addPotionEffect(PotionList.waterBreathing);
                player.addPotionEffect(PotionList.saturation);
            }

            if (player.getCurrentArmor(2).getItem() == ModItems.adamantiumChestplate) {
                player.capabilities.allowFlying = true;
                player.fallDistance = 0.0f;
                player.addPotionEffect(PotionList.absorption);
            }

            if (player.getCurrentArmor(1).getItem() == ModItems.adamantiumLeggings) {
                player.addPotionEffect(PotionList.jump);
            }

            if (player.getCurrentArmor(0).getItem() == ModItems.adamantiumBoots) {
                player.addPotionEffect(PotionList.moveSpeed);
            }
        } else if (!player.capabilities.isCreativeMode) {
            player.capabilities.allowFlying = false;
            player.capabilities.isFlying = false;
            player.fallDistance = 0.0F;
        }
    }


    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean useExtraInfo)
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(NameHelper.translateToLocal(Names.Locale.adamantiumToolTip));
            list.add(NameHelper.translateToLocal(Names.ArmorTooltipLocale.reductAmount));
            for (int i = 0; i < Names.ArmorTooltipLocale.adamantiumArmor.length; i++)
            {
                list.add(NameHelper.translateToLocal(Names.ArmorTooltipLocale.adamantiumArmor[i]));
            }

            list.add("");
            for (int i = 0; i < Names.ArmorTooltipLocale.adamantiumAbilities.length; i++) {
                list.add(NameHelper.translateToLocal(Names.ArmorTooltipLocale.adamantiumAbilities[i]));
            }
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }
}

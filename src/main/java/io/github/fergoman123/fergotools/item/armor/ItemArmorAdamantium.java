package io.github.fergoman123.fergotools.item.armor;

import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.reference.Textures;
import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.fergoutil.helper.PotionHelper;
import fergoman123.mods.fergoutil.item.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
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
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor)
    {

        if (player.getCurrentArmor(3) != null)
        {
            if(player.getCurrentArmor(3).getItem() == ModItems.adamantiumHelmet)
            {
                player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 1, 4));
                player.addPotionEffect(new PotionEffect(Potion.field_76443_y.id, 1, 4));
            }
        }

        if (player.getCurrentArmor(2) != null)
        {
            if (player.getCurrentArmor(2).getItem() == ModItems.adamantiumChestplate)
            {
                player.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 1, 4));
                player.capabilities.allowFlying = true;
                player.fallDistance = 0.0F;
            }
            else if (!player.capabilities.isCreativeMode)
            {
                player.capabilities.allowFlying = false;
                player.capabilities.isFlying = false;
                player.fallDistance = 0.0f;
            }
        }

        if (player.getCurrentArmor(1) != null)
        {
            if (player.getCurrentArmor(1).getItem() == ModItems.adamantiumLeggings)
            {
                player.addPotionEffect(new PotionEffect(Potion.jump.id, 1, 4));
            }
        }

        if (player.getCurrentArmor(0) != null)
        {
            if (player.getCurrentArmor(0).getItem() == ModItems.adamantiumBoots)
            {
                player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1, 4));
            }
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
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }
}

package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.reference.Textures;
import fergoman123.mods.fergotools.util.base.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.Materials;
import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.fergoutil.helper.PotionHelper;
import fergoman123.mods.fergoutil.item.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
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
        if ((player.getCurrentArmor(3) != null) && (player.getCurrentArmor(2) != null) && (player.getCurrentArmor(1) != null) && (player.getCurrentArmor(0) != null))
        {
            ItemStack helmet = player.getCurrentArmor(3);
            ItemStack chestplate = player.getCurrentArmor(2);
            ItemStack leggings = player.getCurrentArmor(1);
            ItemStack boots = player.getCurrentArmor(0);

//            if (((boots.getItem() == ModItems.adamantiumBoots ? 1 : 0) | (leggings.getItem() == ModItems.adamantiumLeggings ? 1 : 0) | (chestplate.getItem() == ModItems.adamantiumChestplate ? 1 : 0) | (helmet.getItem() == ModItems.adamantiumHelmet ? 1 : 0)) != 0)
//            {
//                player.capabilities.allowFlying = true;
//                player.fallDistance = 0.0F;
//                player.addPotionEffect(PotionHelper.getPotionEffect(Potion.field_76444_x.id, 1, 4));
//                player.addPotionEffect(PotionHelper.getPotionEffect(Potion.waterBreathing.id, 1, 4));
//                player.addPotionEffect(PotionHelper.getPotionEffect(Potion.resistance.id, 1, 4));
//                player.addPotionEffect(PotionHelper.getPotionEffect(Potion.moveSpeed.id, 1, 4));
//                player.addPotionEffect(PotionHelper.getPotionEffect(Potion.field_76443_y.id, 1, 4));
//            }
            if (player.getCurrentArmor(3).getItem() == ModItems.adamantiumHelmet)
            {
                PotionHelper.getPotionEffect(Potion.waterBreathing.id, 1, 4);
                PotionHelper.getPotionEffect(Potion.field_76443_y.id, 1, 4);
            }

            if (player.getCurrentArmor(2).getItem() == ModItems.adamantiumChestplate)
            {
                PotionHelper.getPotionEffect(Potion.moveSpeed.id, 1, 4);
                PotionHelper.getPotionEffect(Potion.field_76444_x.id, 1, 4);

            }

            if (player.getCurrentArmor(1).getItem() == ModItems.adamantiumLeggings)
            {
                PotionHelper.getPotionEffect(Potion.jump.id, 1, 4);
            }

            if (player.getCurrentArmor(0).getItem() == ModItems.adamantiumBoots)
            {
                player.capabilities.allowFlying = true;
                player.fallDistance = 0.0F;
            }
        }
        else if (!player.capabilities.isCreativeMode)
        {
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
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }
}

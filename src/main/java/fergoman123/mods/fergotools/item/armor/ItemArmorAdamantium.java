package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.lib.textures.ArmorTextures;
import fergoman123.mods.fergotools.util.base.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergoutil.helper.PotionHelper;
import fergoman123.mods.fergoutil.item.Armor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

import java.util.List;

public class ItemArmorAdamantium extends ItemArmorFT{

    public static Item instanceHelmet = new ItemArmorAdamantium(Armor.EnumArmorType.HELMET);
    public static Item instanceChest = new ItemArmorAdamantium(Armor.EnumArmorType.CHEST);
    public static Item instanceLegs = new ItemArmorAdamantium(Armor.EnumArmorType.LEGS);
    public static Item instanceBoots = new ItemArmorAdamantium(Armor.EnumArmorType.BOOTS);

    public ItemArmorAdamantium(Armor.EnumArmorType type)
    {
        super("adamantium", UtilToolArmor.adamantiumArmor, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == instanceHelmet || stack.getItem() == instanceChest || stack.getItem() == instanceBoots)
        {
            return ArmorTextures.adamantiumArmorRender1;
        }

        if (stack.getItem() == instanceLegs)
        {
            return ArmorTextures.redstoneArmorRender2;
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

            if (((boots.getItem() == instanceBoots ? 1 : 0) | (leggings.getItem() == instanceLegs ? 1 : 0) | (chestplate.getItem() == instanceChest ? 1 : 0) | (helmet.getItem() == instanceHelmet ? 1 : 0)) != 0)
            {
                player.capabilities.allowFlying = true;
                player.fallDistance = 0.0F;
                player.addPotionEffect(PotionHelper.getPotionEffect(Potion.field_76444_x.id, 20, 4));
                player.addPotionEffect(PotionHelper.getPotionEffect(Potion.waterBreathing.id, 20, 4));
                player.addPotionEffect(PotionHelper.getPotionEffect(Potion.resistance.id, 20, 4));
                player.addPotionEffect(PotionHelper.getPotionEffect(Potion.moveSpeed.id, 20, 4));
                player.addPotionEffect(PotionHelper.getPotionEffect(Potion.field_76443_y.id, 20, 4));
            }
        }
        else if (!player.capabilities.isCreativeMode)
        {
            player.capabilities.allowFlying = false;
        }
    }

    @Override
    public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {

    }
}

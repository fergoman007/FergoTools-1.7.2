package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Textures;
import fergoman123.mods.fergotools.util.base.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergoutil.item.Armor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmorAdamantium extends ItemArmorFT{

    public static ItemArmorAdamantium instanceHelmet = new ItemArmorAdamantium(Armor.EnumArmorType.HELMET);
    public static ItemArmorAdamantium instanceChest = new ItemArmorAdamantium(Armor.EnumArmorType.CHEST);
    public static ItemArmorAdamantium instanceLegs = new ItemArmorAdamantium(Armor.EnumArmorType.LEGS);
    public static ItemArmorAdamantium instanceBoots = new ItemArmorAdamantium(Armor.EnumArmorType.BOOTS);

    public ItemArmorAdamantium(Armor.EnumArmorType type)
    {
        super("adamantium", UtilToolArmor.adamantiumArmor, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == instanceHelmet || stack.getItem() == instanceChest || stack.getItem() == instanceBoots)
        {
            return Textures.ArmorTextures.adamantiumArmorRender1;
        }

        if (stack.getItem() == instanceLegs)
        {
            return Textures.ArmorTextures.redstoneArmorRender2;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
        if (this.armorType == Armor.getBoots())
        {
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 20, 4));
        }
        else if(this.armorType == Armor.getChestplate())
        {
            player.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 20, 4));
        }
        else if (this.armorType == Armor.getLeggings())
        {
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 20, 4));
        }
        else if (this.armorType == Armor.getHelmet())
        {
            player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 20, 4));
        }
    }
}

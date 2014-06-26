package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Textures.ArmorTextures;
import fergoman123.mods.fergotools.util.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergoutil.item.Armor;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemArmorObsidian extends ItemArmorFT {

    public static ItemArmorObsidian instanceHelmet = new ItemArmorObsidian(Armor.EnumArmorType.HELMET);
    public static ItemArmorObsidian instanceChest = new ItemArmorObsidian(Armor.EnumArmorType.CHEST);
    public static ItemArmorObsidian instanceLegs = new ItemArmorObsidian(Armor.EnumArmorType.LEGS);
    public static ItemArmorObsidian instanceBoots = new ItemArmorObsidian(Armor.EnumArmorType.BOOTS);

    public ItemArmorObsidian(Armor.EnumArmorType type) {
        super("obsidian", UtilToolArmor.obsidianArmor, type);
    }

    public String getArmorTexture(ItemStack is, Entity entity, int slot, String type)
    {
        if(is.getItem() == ModItems.obsidianHelmet || is.getItem() == ModItems.obsidianChestplate || is.getItem() == ModItems.obsidianBoots)
        {return ArmorTextures.obsidianArmorRender1;}

        if(is.getItem() == ModItems.obsidianLeggings)
        {return ArmorTextures.obsidianArmorRender2;}
        else{return null;}
    }
}

package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.reference.Textures;
import fergoman123.mods.fergotools.util.base.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergoutil.item.Armor;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemArmorObsidian extends ItemArmorFT {

    public ItemArmorObsidian(Armor.EnumArmorType type) {
        super("obsidian", ToolArmorMaterials.obsidianArmor, type);
    }

    public String getArmorTexture(ItemStack is, Entity entity, int slot, String type)
    {
        if(is.getItem() == ModItems.obsidianHelmet || is.getItem() == ModItems.obsidianChestplate || is.getItem() == ModItems.obsidianBoots)
        {return Textures.obsidianArmorLayer1;}

        if(is.getItem() == ModItems.obsidianLeggings)
        {return Textures.obsidianArmorLayer2;}
        else{return null;}
    }
}

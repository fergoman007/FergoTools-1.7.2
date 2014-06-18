package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Textures.ArmorTextures;
import fergoman123.mods.fergotools.util.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergoutil.item.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemArmorQuartz extends ItemArmorFT{

    public static ItemArmorQuartz instanceHelmet = new ItemArmorQuartz(ArmorType.HELMET);
    public static ItemArmorQuartz instanceChest = new ItemArmorQuartz(ArmorType.CHEST);
    public static ItemArmorQuartz instanceLegs = new ItemArmorQuartz(ArmorType.LEGS);
    public static ItemArmorQuartz instanceBoots = new ItemArmorQuartz(ArmorType.BOOTS);

    public ItemArmorQuartz(ArmorType type)
    {
        super("quartz", UtilToolArmor.quartzArmor ,type);
    }

    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        return par2ItemStack.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ModItems.quartzHelmet || stack.getItem() == ModItems.quartzChestplate || stack.getItem() == ModItems.quartzBoots)
        {return ArmorTextures.quartzArmorRender1;}

        if (stack.getItem() == ModItems.quartzLeggings)
        {return ArmorTextures.quartzArmorRender2;}
        else{return null;}
    }
}

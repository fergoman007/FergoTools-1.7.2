package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.lib.Textures.ArmorTextures;
import fergoman123.mods.fergotools.util.base.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergoutil.item.Armor;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemArmorQuartz extends ItemArmorFT{

    public static ItemArmorQuartz instanceHelmet = new ItemArmorQuartz(Armor.EnumArmorType.HELMET);
    public static ItemArmorQuartz instanceChest = new ItemArmorQuartz(Armor.EnumArmorType.CHEST);
    public static ItemArmorQuartz instanceLegs = new ItemArmorQuartz(Armor.EnumArmorType.LEGS);
    public static ItemArmorQuartz instanceBoots = new ItemArmorQuartz(Armor.EnumArmorType.BOOTS);

    public ItemArmorQuartz(Armor.EnumArmorType type)
    {
        super("quartz", UtilToolArmor.quartzArmor ,type);
    }

    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        return par2ItemStack.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == instanceHelmet || stack.getItem() == instanceChest || stack.getItem() == instanceBoots)
        {return ArmorTextures.quartzArmorRender1;}

        if (stack.getItem() == instanceLegs)
        {return ArmorTextures.quartzArmorRender2;}
        else{return null;}
    }
}

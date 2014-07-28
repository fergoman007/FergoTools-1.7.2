package fergoman123.mods.fergotools.item.armor;


import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.reference.Textures;
import fergoman123.mods.fergotools.util.base.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergoutil.item.Armor;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemArmorQuartz extends ItemArmorFT{

    public ItemArmorQuartz(Armor.EnumArmorType type)
    {
        super("quartz", ToolArmorMaterials.quartzArmor ,type);
    }

    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        return par2ItemStack.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ModItems.quartzHelmet || stack.getItem() == ModItems.quartzChestplate || stack.getItem() == ModItems.quartzBoots)
        {return Textures.quartzArmorLayer1;}

        if (stack.getItem() == ModItems.quartzLeggings)
        {return Textures.quartzArmorLayer2;}
        else{return null;}
    }
}

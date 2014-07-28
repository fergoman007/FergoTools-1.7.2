package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemSilkGem;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemPickaxeFT;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSilkPickaxe extends ItemPickaxeFT {

    public ItemSilkPickaxe()
    {
        super(ToolArmorMaterials.silk, ToolArmorMaterials.silk.getMaxUses());
        this.setUnlocalizedName(Names.Items.silkPickaxe);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.silkGem)) || super.getIsRepairable(stack1, stack2);
    }

    public void onCreated(ItemStack stack, World world, EntityPlayer player)
    {
        stack.addEnchantment(Enchantment.silkTouch, 1);
    }

}

package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.item.materials.ItemSilkGem;
import fergoman123.mods.fergotools.lib.strings.ToolStrings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.SwordGeneric;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSilkSword extends SwordGeneric {

    public static ItemSilkSword instance = new ItemSilkSword();

    public ItemSilkSword() {
        super(UtilToolArmor.silk);
        this.setUnlocalizedName(ToolStrings.silkSword);
        this.setMaxDamage(UtilToolArmor.getSilkMaxUses());
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ItemSilkGem.instance)) || super.getIsRepairable(stack1, stack2);
    }

    public void onCreated(ItemStack stack, World world, EntityPlayer player)
    {
        stack.addEnchantment(Enchantment.silkTouch, 1);
    }

}

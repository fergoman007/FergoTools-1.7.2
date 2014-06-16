package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.ShovelGeneric;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSilkShovel extends ShovelGeneric {

    public static ItemSilkShovel instance = new ItemSilkShovel();

    public ItemSilkShovel()
    {
        super(UtilToolArmor.silk);
        this.setUnlocalizedName(Strings.ToolStrings.silkShovel);
        this.setMaxDamage(UtilToolArmor.getSilkMaxUses());
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.silkGem)) || super.getIsRepairable(stack1, stack2);
    }

    /**
     *
     * @param stack the item
     * @param world the world
     * @param player the player
     */
    public void onCreated(ItemStack stack, World world, EntityPlayer player)
    {
        stack.addEnchantment(Enchantment.silkTouch, 1);
    }

}

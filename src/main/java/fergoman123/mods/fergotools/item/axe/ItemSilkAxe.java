package fergoman123.mods.fergotools.item.axe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.tool.AxeGeneric;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemSilkAxe extends AxeGeneric {

    public static ItemSilkAxe instance = new ItemSilkAxe();

    public ItemSilkAxe()
    {
        super(UtilToolArmor.silk);
        this.setUnlocalizedName(Strings.ToolStrings.silkAxe);
        this.setMaxDamage(UtilToolArmor.silk.getMaxUses());
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

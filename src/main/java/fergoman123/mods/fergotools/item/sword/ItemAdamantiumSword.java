package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import java.util.List;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemAdamantiumSword extends ItemSword {

    public ItemAdamantiumSword() {
        super(UtilToolArmor.adamantium);
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return par2ItemStack.isItemEqual(new ItemStack(ModItems.fergoMaterials, 1, 6)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    @SuppressWarnings({"unchecked"})
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean useExtraInfo)
    {
        list.add(Strings.adamantiumToolMessage);
    }

}

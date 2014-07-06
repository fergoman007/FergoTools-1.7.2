package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.item.materials.ItemAdamantiumIngot;
import fergoman123.mods.fergotools.lib.strings.ToolStrings;
import fergoman123.mods.fergotools.lib.strings.ToolTipStrings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.ShovelGeneric;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemAdamantiumShovel extends ShovelGeneric {

    public static ItemAdamantiumShovel instance = new ItemAdamantiumShovel();

    public ItemAdamantiumShovel() {
        super(UtilToolArmor.adamantium);
        this.setUnlocalizedName(ToolStrings.adamantiumShovel);
        this.setMaxDamage(UtilToolArmor.getAdamantiumMaxUses());
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return par2ItemStack.isItemEqual(new ItemStack(ItemAdamantiumIngot.instance)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    @SuppressWarnings({"unchecked"})
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean useExtraInfo)
    {
        list.add(ToolTipStrings.adamantiumToolMessage);
    }

}

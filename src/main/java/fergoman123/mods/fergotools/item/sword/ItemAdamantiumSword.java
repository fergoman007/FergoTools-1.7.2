package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.item.materials.ItemAdamantiumIngot;
import fergoman123.mods.fergotools.lib.strings.ToolStrings;
import fergoman123.mods.fergotools.lib.strings.ToolTipStrings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.SwordGeneric;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemAdamantiumSword extends SwordGeneric {

    public static ItemAdamantiumSword instance = new ItemAdamantiumSword();

    public ItemAdamantiumSword() {
        super(UtilToolArmor.adamantium);
        this.setUnlocalizedName(ToolStrings.adamantiumSword);
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

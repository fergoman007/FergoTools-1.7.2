package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.item.materials.ItemAdamantiumIngot;
import fergoman123.mods.fergotools.lib.strings.ToolStrings;
import fergoman123.mods.fergotools.lib.strings.ToolTipStrings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.HoeGeneric;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemAdamantiumHoe extends HoeGeneric {

    public static ItemAdamantiumHoe instance = new ItemAdamantiumHoe();

    public ItemAdamantiumHoe() {
        super(UtilToolArmor.adamantium);
        this.setUnlocalizedName(ToolStrings.adamantiumHoe);
        this.setMaxDamage(UtilToolArmor.adamantium.getMaxUses());
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

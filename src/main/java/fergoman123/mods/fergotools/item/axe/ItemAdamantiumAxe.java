package fergoman123.mods.fergotools.item.axe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.AxeGeneric;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemAdamantiumAxe extends AxeGeneric {

    public static ItemAdamantiumAxe instance = new ItemAdamantiumAxe();

    public ItemAdamantiumAxe()
    {
        super(UtilToolArmor.adamantium);
        this.setUnlocalizedName(Strings.ToolStrings.adamantiumAxe);
        this.setMaxDamage(UtilToolArmor.adamantium.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return par2ItemStack.isItemEqual(new ItemStack(ModItems.adamantiumIngot)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    @SuppressWarnings({"unchecked"})
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean useExtraInfo)
    {
        list.add(Strings.adamantiumToolMessage);
    }

}

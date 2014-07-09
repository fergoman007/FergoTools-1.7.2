package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.item.materials.ItemAdamantiumIngot;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.PickaxeGeneric;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemAdamantiumPickaxe extends PickaxeGeneric {

    public static ItemAdamantiumPickaxe instance = new ItemAdamantiumPickaxe();

    public ItemAdamantiumPickaxe() {
        super(UtilToolArmor.adamantium);
        this.setUnlocalizedName(Names.Items.adamantiumPickaxe);
        this.setMaxDamage(UtilToolArmor.getAdamantiumMaxUses());
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return par2ItemStack.isItemEqual(new ItemStack(ItemAdamantiumIngot.instance)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean useExtraInfo)
    {
        list.add(Names.Locale.adamantiumToolTip);
    }

}

package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemAdamantiumIngot;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemPickaxeFT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemAdamantiumPickaxe extends ItemPickaxeFT {

    public ItemAdamantiumPickaxe() {
        super(ToolArmorMaterials.adamantium, ToolArmorMaterials.adamantium.getMaxUses());
        this.setUnlocalizedName(Names.Items.adamantiumPickaxe);
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return par2ItemStack.isItemEqual(new ItemStack(ModItems.ingotAdamantium)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean useExtraInfo)
    {
        list.add(Names.Locale.adamantiumToolTip);
    }

}

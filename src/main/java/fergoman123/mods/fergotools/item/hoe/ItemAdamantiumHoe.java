package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemAdamantiumIngot;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemHoeFT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemAdamantiumHoe extends ItemHoeFT {

    public ItemAdamantiumHoe() {
        super(ToolArmorMaterials.adamantium, ToolArmorMaterials.adamantium.getMaxUses());
        this.setUnlocalizedName(Names.Items.adamantiumHoe);
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return par2ItemStack.isItemEqual(new ItemStack(ModItems.ingotAdamantium)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    @SuppressWarnings({"unchecked"})
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean useExtraInfo)
    {
        list.add(Names.Locale.adamantiumToolTip);
    }

}

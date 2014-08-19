package fergoman123.mods.fergotools.item.shears;

import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemShearsFT;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemObsidianShears extends ItemShearsFT
{
    public ItemObsidianShears()
    {
        super(ToolArmorMaterials.obsidian.getMaxUses());
        this.setUnlocalizedName(Names.Items.obsidianShears);
    }

    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo)
    {
        if (kb.isKeyDown(kb.KEY_LSHIFT) || kb.isKeyDown(kb.KEY_RSHIFT))
        {
            list.add("durability place holder");
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }


}

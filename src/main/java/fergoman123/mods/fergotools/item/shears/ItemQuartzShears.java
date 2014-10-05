package fergoman123.mods.fergotools.item.shears;

import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.Materials;
import fergoman123.mods.fergotools.util.tool.ItemShearsFT;
import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.fergoutil.item.ITooltipItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemQuartzShears extends ItemShearsFT implements ITooltipItem{


    public ItemQuartzShears() {
        super(Materials.Tools.quartz.getMaxUses());
        this.setUnlocalizedName(Names.Items.quartzShears);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo)
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(NameHelper.translateToLocal(Names.Locale.durabilityToolTip) + " " + stack.getItemDamageForDisplay() + "/ 1,000,000");
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }
}

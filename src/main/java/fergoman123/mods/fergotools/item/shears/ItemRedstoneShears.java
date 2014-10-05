package fergoman123.mods.fergotools.item.shears;

import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.Materials;
import fergoman123.mods.fergotools.util.tool.ItemShearsFT;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemRedstoneShears extends ItemShearsFT
{
    public ItemRedstoneShears()
    {
        super(Materials.Tools.redstone.getMaxUses());
        this.setUnlocalizedName(Names.Items.redstoneShears);
    }

    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo)
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add("durability place holder");
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }
}

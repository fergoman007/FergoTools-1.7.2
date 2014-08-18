package fergoman123.mods.fergotools.item;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.ItemFT;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemExpCollector extends ItemFT
{

    public ItemExpCollector() {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName(Names.Items.expCollector);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (player.experienceLevel > 0)
        {
            player.inventory.addItemStackToInventory(new ItemStack(ModItems.expShard, 1));
            player.addExperienceLevel(-1);
            --stack.stackSize;
        }

        return stack;
    }

    @Override
    public boolean hasEffect(ItemStack par1ItemStack, int pass) {return true;}

    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean useExtraInfo)
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(NameHelper.translateToLocal(Names.Locale.expCollectorToolTip));
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }
}

package fergoman123.mods.fergotools.item.block.furnaceactive;

import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.ItemBlockFT;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemBlockMaceratorActive extends ItemBlockFT
{
    public ItemBlockMaceratorActive(Block block)
    {
        super(ModBlocks.maceratorActive);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo) {
        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(NameHelper.translateToLocal(Names.Locale.maceratorSpeed));
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }
}

package io.github.fergoman123.fergotools.item.block.furnaceactive;

import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.ItemBlockFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemBlockLapisFurnaceActive extends ItemBlockFT
{
    public ItemBlockLapisFurnaceActive(Block block)
    {
        super(ModBlocks.lapisFurnaceActive);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo) {
        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(NameHelper.translateToLocal(Locale.lapisFurnaceSpeed));
        }
        else
        {
            list.add(NameHelper.translateToLocal(Locale.holdShiftMessage));
        }
    }
}
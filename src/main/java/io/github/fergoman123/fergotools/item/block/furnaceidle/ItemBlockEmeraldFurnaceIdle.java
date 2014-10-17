package io.github.fergoman123.fergotools.item.block.furnaceidle;

import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.ItemBlockFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemBlockEmeraldFurnaceIdle extends ItemBlockFT
{
    public ItemBlockEmeraldFurnaceIdle(Block block)
    {
        super(ModBlocks.emeraldFurnaceIdle);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo) {
        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(NameHelper.translateToLocal(Locale.emeraldFurnaceSpeed));
        }
        else
        {
            list.add(NameHelper.translateToLocal(Locale.holdShiftMessage));
        }
    }
}
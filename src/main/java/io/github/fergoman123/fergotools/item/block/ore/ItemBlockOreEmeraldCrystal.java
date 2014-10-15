package io.github.fergoman123.fergotools.item.block.ore;

import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.base.ItemBlockFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemBlockOreEmeraldCrystal extends ItemBlockFT
{
    public ItemBlockOreEmeraldCrystal(Block block)
    {
        super(ModBlocks.oreEmeraldCrystal);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo) {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(NameHelper.translateToLocal(Names.OreDict.oreDictName));
            list.add(NameHelper.translateToLocal(Names.OreDict.oreEmeraldCrystal));
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }
}

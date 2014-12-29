package io.github.fergoman123.fergotools.core.itemblock;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.util.base.ItemMultiTextureFT;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemBlockFergoWorkbench extends ItemMultiTextureFT
{
    public ItemBlockFergoWorkbench(Block block) {
        super(FTContent.fergoWorkbench, FTContent.fergoWorkbench, BlockNames.workbenches);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        if (stack.getItemDamage() == 0)
        {
            list.add("subtype Name is: " + BlockNames.workbenches[0]);
        }
        else if (stack.getItemDamage() == 1)
        {
            list.add("subtype Name is: " + BlockNames.workbenches[1]);
        }
        else if (stack.getItemDamage() == 2)
        {
            list.add("subtype Name is: " + BlockNames.workbenches[2]);
        }
        else if (stack.getItemDamage() == 3)
        {
            list.add("subtype Name is: " + BlockNames.workbenches[3]);
        }
        else if (stack.getItemDamage() == 4)
        {
            list.add("subtype Name is: " + BlockNames.workbenches[4]);
        }
        else if (stack.getItemDamage() == 5)
        {
            list.add("subtype Name is: " + BlockNames.workbenches[5]);
        }
        else if (stack.getItemDamage() == 6)
        {
            list.add("subtype Name is: " + BlockNames.workbenches[6]);
        }
        else if (stack.getItemDamage() == 7)
        {
            list.add("subtype Name is: " + BlockNames.workbenches[7]);
        }
        else if (stack.getItemDamage() == 8)
        {
            list.add("subtype Name is: " + BlockNames.workbenches[8]);
        }
    }
}

package io.github.fergoman123.fergotools.event;

import io.github.fergoman123.fergotools.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemToolTipEvent
{
    public static final ItemToolTipEvent instance = new ItemToolTipEvent();

    @SubscribeEvent
    public void onItemTooltip(ItemTooltipEvent evt)
    {
        Item item = evt.itemStack.getItem();
        Block block = Block.getBlockFromItem(item);
        List<String> list = evt.toolTip;

        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            if (block == ModBlocks.oreExperience)
            {
                list.add(StatCollector.translateToLocal("fergotools.tooltip.oredict"));
                list.add(StatCollector.translateToLocal("fergotools.tooltip.oredictname.oreexperience"));
            }

            if (block == ModBlocks.oreObsidian)
            {
                list.add(StatCollector.translateToLocal("fergotools.tooltip.oredict"));
                list.add(StatCollector.translateToLocal("fergotools.tooltip.oredictname.oreobsidian"));
            }

            if (block == ModBlocks.oreGemEmerald)
            {
                list.add(StatCollector.translateToLocal("fergotools.tooltip.oredict"));
                list.add(StatCollector.translateToLocal("fergotools.tooltip.oredictname.oregememerald"));
            }
        }
        else
        {
            list.add(StatCollector.translateToLocal("fergotools.tooltip.holdshift"));
        }
    }
}

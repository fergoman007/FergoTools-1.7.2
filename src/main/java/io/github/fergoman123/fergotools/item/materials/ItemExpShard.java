package io.github.fergoman123.fergotools.item.materials;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.base.ItemFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;

import java.util.List;
import java.util.Random;

public class ItemExpShard extends ItemFT
{

    private final Random rand = new Random();

    public ItemExpShard() {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName(Names.Items.shardExp);
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        player.inventory.addItemStackToInventory(new ItemStack(ModItems.expCollector, 1));
        --stack.stackSize;
        player.addExperienceLevel(1);
        return stack;
    }

    public boolean hasEffect(ItemStack stack, int pass)
    {
        return true;
    }

    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo)
    {
        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(NameHelper.translateToLocal(Names.Locale.expShardToolTip));
            list.add("");
            list.add(NameHelper.translateToLocal(Names.OreDict.oreDictName));
            list.add(NameHelper.translateToLocal(Names.OreDict.shardExp));
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }
}

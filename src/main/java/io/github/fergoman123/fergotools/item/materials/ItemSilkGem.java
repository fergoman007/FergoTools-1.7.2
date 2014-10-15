package io.github.fergoman123.fergotools.item.materials;

import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.base.ItemFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemSilkGem extends ItemFT{

    public ItemSilkGem()
    {
        super();
        this.setUnlocalizedName(Names.Items.gemSilk);
    }

    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b)
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(NameHelper.translateToLocal(Names.OreDict.oreDictName));
            list.add(NameHelper.translateToLocal(Names.OreDict.gemSilk));
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }
}

package io.github.fergoman123.fergotools.item.materials;

import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.base.ItemFT;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemCoalIngot extends ItemFT{

    public ItemCoalIngot()
    {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName(Names.Items.ingotCoal);
    }

    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo)
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(NameHelper.translateToLocal(Names.OreDict.oreDictName));
            list.add(NameHelper.translateToLocal(Names.OreDict.ingotCoal));
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }
}

package io.github.fergoman123.fergotools.item.materials;

import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.reference.names.OreDict;
import io.github.fergoman123.fergotools.util.base.ItemFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemLapisGem extends ItemFT{

    public ItemLapisGem()
    {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName(ItemNames.gemLapis);
    }

    @Override
    public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            p_77624_3_.add(NameHelper.translateToLocal(OreDict.oreDictName));
            p_77624_3_.add(NameHelper.translateToLocal(OreDict.gemLapis));
        }
        else
        {
            p_77624_3_.add(NameHelper.translateToLocal(Locale.holdShiftMessage));
        }
    }
}

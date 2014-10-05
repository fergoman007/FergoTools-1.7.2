package fergoman123.mods.fergotools.item.materials;

import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.ItemFT;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemLapisGem extends ItemFT{

    public ItemLapisGem()
    {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName(Names.Items.gemLapis);
    }

    @Override
    public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            p_77624_3_.add(NameHelper.translateToLocal(Names.OreDict.oreDictName));
            p_77624_3_.add(NameHelper.translateToLocal(Names.OreDict.gemLapis));
        }
        else
        {
            p_77624_3_.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }
}

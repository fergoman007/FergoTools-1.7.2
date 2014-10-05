package fergoman123.mods.fergotools.item.materials;

import cpw.mods.fml.common.registry.RegistryDelegate;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.ItemFT;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemRedstoneGem extends ItemFT{

    public ItemRedstoneGem()
    {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName(Names.Items.gemRedstone);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo)
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(NameHelper.translateToLocal(Names.OreDict.oreDictName));
            list.add(NameHelper.translateToLocal(Names.OreDict.gemRedstone));
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }
}

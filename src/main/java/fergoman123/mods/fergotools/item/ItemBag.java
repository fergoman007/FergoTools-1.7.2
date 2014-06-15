package fergoman123.mods.fergotools.item;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.util.ItemFT;
import fergoman123.mods.fergotools.helper.NBTHelper;
import fergoman123.mods.fergotools.lib.Strings.NBT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBag extends ItemFT {

    public ItemBag()
    {
        super();
        setUnlocalizedName("bag");
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        if (!world.isRemote)
        {
            NBTHelper.setUUID(stack);
            NBTHelper.setBoolean(stack, NBT.bagOpen, true);
            player.openGui(FergoTools.instance, 11, world, (int)player.posX, (int)player.posY, (int)player.posZ);
        }

        return stack;
    }


}

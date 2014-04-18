package fergoman123.mods.fergotools.item.materials;

import fergoman123.mods.fergotools.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemExpShard extends Item{

    public ItemExpShard()
    {
        super();
    }

    public boolean hasEffect(ItemStack stack, int pass){return true;}

    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
    {
        if (stack.getItem() == ModItems.expShard)
        {
            --stack.stackSize;
            ++player.experience;
        }
        return true;
    }


}

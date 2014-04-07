package fergoman123.mods.fergotools.util.item;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Fergoman123 on 05/04/2014.
 */
public interface IHammerBase {

   boolean onBlockDestroyed(ItemStack stack, World world, Block block, int x, int y, int z, EntityLivingBase entity);
}

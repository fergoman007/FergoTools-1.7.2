package fergoman123.mods.fergotools.item;

import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Fergoman123 on 29/05/2014.
 */
public class Hammer extends Item {

    public Hammer()
    {
        super();
        this.setUnlocalizedName("hammer");
        this.setMaxStackSize(1);
        this.setMaxDamage(UtilToolArmor.adamantium.getMaxUses());
        this.setHarvestLevel("pickaxe", 3);
    }

    public boolean onItemUse(ItemStack itemstack, EntityPlayer entity, World world, int x, int y, int z, int side, float hitx, float hity, float hitz) {
        super.onItemUse(itemstack, entity, world, x, y, z, side, hitx, hity, hitz);
        float var4 = 1.0F;

        world.createExplosion((Entity) null, x, y, y, 1.0F, true);

        itemstack.damageItem(1, entity);

        return true;
    }

    @Override
    public boolean doesSneakBypassUse(World world, int x, int y, int z, EntityPlayer player) {
        return true;
    }
}

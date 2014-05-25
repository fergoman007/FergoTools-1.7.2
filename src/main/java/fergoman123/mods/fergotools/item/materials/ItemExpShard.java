package fergoman123.mods.fergotools.item.materials;

import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.ItemFT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemExpShard extends ItemFT {

    private Random rand = new Random();

    public ItemExpShard() {
        super();
        this.setUnlocalizedName(Strings.ItemStrings.expShard);
        this.setMaxStackSize(64);
    }

    public boolean hasEffect(ItemStack stack, int pass){return true;}

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        player.addExperience(this.rand.nextInt(6));
        world.playSoundAtEntity(player, "random.orb", 0.1f, 0.5F * ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.7F + 1.8F));
        return stack;
    }
}

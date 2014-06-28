package fergoman123.mods.fergotools.item.materials;

import fergoman123.mods.fergotools.lib.Strings.ItemStrings;
import fergoman123.mods.fergotools.util.base.ItemFT;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class ItemExpShard extends ItemFT {

    public static ItemExpShard instance = new ItemExpShard();

    private final Random rand = new Random();

    public ItemExpShard() {
        super();
        this.setUnlocalizedName(ItemStrings.expShard);
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        EntityXPOrb orb = new EntityXPOrb(world, player.posX, player.posY, player.posZ, 1);

        --stack.stackSize;
        player.addExperience(3 + rand.nextInt(20));
        return stack;
    }

    public boolean hasEffect(ItemStack stack, int pass)
    {
        return true;
    }
}

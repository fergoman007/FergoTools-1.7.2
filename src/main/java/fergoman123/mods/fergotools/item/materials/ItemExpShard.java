package fergoman123.mods.fergotools.item.materials;

import fergoman123.mods.fergotools.item.ItemExpCollector;
import fergoman123.mods.fergotools.lib.strings.ItemStrings;
import fergoman123.mods.fergotools.util.base.ItemFT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class ItemExpShard extends ItemFT {

    public static ItemExpShard instance = new ItemExpShard();

    private final Random rand = new Random();

    public ItemExpShard() {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName(ItemStrings.expShard);
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        player.inventory.addItemStackToInventory(new ItemStack(ItemExpCollector.instance, 1));
        --stack.stackSize;
        player.addExperienceLevel(1);
        return stack;
    }

    public boolean hasEffect(ItemStack stack, int pass)
    {
        return true;
    }
}

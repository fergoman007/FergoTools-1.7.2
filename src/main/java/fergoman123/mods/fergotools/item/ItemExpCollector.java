package fergoman123.mods.fergotools.item;

import fergoman123.mods.fergotools.item.materials.ItemExpShard;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.ItemFT;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class ItemExpCollector extends ItemFT
{
    public static ItemExpCollector instance = new ItemExpCollector();
    public Item expShardInstance = ItemExpShard.instance;

    public ItemExpCollector() {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName(Names.Items.expCollector);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (player.experienceLevel > 0)
        {
            player.inventory.addItemStackToInventory(new ItemStack(expShardInstance, 1));
            player.addExperienceLevel(-1);
            --stack.stackSize;
        }

        return stack;
    }

    @Override
    public boolean hasEffect(ItemStack par1ItemStack, int pass) {return true;}


    public void addInformation(ItemStack stack, CreativeTabs tabs, List list)
    {
        list.add(Names.Locale.expCollectorToolTip);
    }
}

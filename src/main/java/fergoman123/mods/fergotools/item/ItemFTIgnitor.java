package fergoman123.mods.fergotools.item;

import fergoman123.mods.fergotools.block.BlockPortalFT;
import fergoman123.mods.fergotools.lib.Reference;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemFlintAndSteel;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFTIgnitor extends ItemFlintAndSteel {

    public static BlockPortalFT portal;

    public ItemFTIgnitor()
    {
        this.setCreativeTab(Tabs.tabFergoTools);
        this.setUnlocalizedName("ignitor");
        this.setMaxDamage(64);
        this.setMaxStackSize(1);
    }

    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
    {
        if (side == 0){y--;}
        if (side == 1){y++;}
        if (side == 2){z--;}
        if (side == 3){z++;}
        if (side == 4){x--;}
        if (side == 5){x++;}
        if (!player.canPlayerEdit(x, y, z, side, stack)){return false;}
        Block block = world.getBlock(x, y, z);
        if (block == Blocks.air)
        {
            world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
            this.portal.tryToCreatePortal(world, x, y, z);
        }
        stack.damageItem(1, player);
        return true;
    }

    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(stack)));
    }
}

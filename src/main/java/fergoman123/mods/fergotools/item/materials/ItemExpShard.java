package fergoman123.mods.fergotools.item.materials;

import fergoman123.mods.fergotools.lib.Strings.ItemStrings;
import fergoman123.mods.fergotools.lib.Textures.ItemTextures;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergotools.util.ItemFT;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemExpShard extends ItemFT {

    private final Random rand = new Random();

    public ItemExpShard() {
        super();
        this.setUnlocalizedName(ItemStrings.expShard);
        this.setTextureName(ItemTextures.expShard);
        this.setCreativeTab(Tabs.tabFergoItems);
    }

    @Override
    public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) {

        --stack.stackSize;
        world.playSoundAtEntity(player, "rand.burp", 0.5f, world.rand.nextFloat() * 0.1f + 0.9f);
        this.onFoodEaten(stack, world, player);
        return stack;
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
        return stack;
    }
    public void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        EntityXPOrb orb = new EntityXPOrb(world, player.posX, player.posY, player.posZ, 1);
        world.spawnEntityInWorld(orb);
        orb.isDead = true;
    }

    public boolean hasEffect(ItemStack stack, int pass)
    {
        return true;
    }
}

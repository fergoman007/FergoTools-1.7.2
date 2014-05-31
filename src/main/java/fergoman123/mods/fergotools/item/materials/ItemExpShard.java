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

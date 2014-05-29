package fergoman123.mods.fergotools.item.materials;

import fergoman123.mods.fergotools.lib.Strings.ItemStrings;
import fergoman123.mods.fergotools.lib.Textures.ItemTextures;
import fergoman123.mods.fergotools.tabs.Tabs;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemExpShardFood extends ItemFood {

    public ItemExpShardFood() {
        super(0, 10f, false);
        this.setUnlocalizedName("FergoTools:" + ItemStrings.expShard);
        this.setTextureName(ItemTextures.expShard);
        this.setCreativeTab(Tabs.tabFergoItems);
        this.setAlwaysEdible();
    }

    @Override
    public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) {

        --stack.stackSize;
        player.getFoodStats().func_151686_a(this, stack);
        world.playSoundAtEntity(player, "rand.burp", 0.5f, world.rand.nextFloat() * 0.1f + 0.9f);
        this.onFoodEaten(stack, world, player);
        return stack;
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
        return stack;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack) {
        return 32;
    }

    @Override
    public void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
    {
        EntityXPOrb orb = new EntityXPOrb(world, player.posX, player.posY, player.posZ, 1);
        world.spawnEntityInWorld(orb);
        orb.isDead = true;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack) {
        return EnumAction.eat;
    }
}

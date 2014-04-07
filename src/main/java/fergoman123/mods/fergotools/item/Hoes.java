package fergoman123.mods.fergotools.item;

import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Fergoman123 on 03/04/2014.
 */
public class Hoes {

    public static class ItemQuartzHoe extends ItemHoe {

        public ItemQuartzHoe() {
            super(ToolArmorMaterials.quartz);
        }


        public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
        {
            return itemstack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemstack1, itemstack2);
        }

    }

    public static class ItemObsidianHoe extends ItemHoe {

        public ItemObsidianHoe() {
            super(ToolArmorMaterials.obsidian);
        }

        public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
        {
            return itemstack2.isItemEqual(new ItemStack(ModItems.obsidianIngot)) || super.getIsRepairable(itemstack1, itemstack2);
        }

    }

    public static class ItemEmeraldHoe extends ItemHoe {

        public ItemEmeraldHoe() {
            super(ToolArmorMaterials.emerald);
        }

        public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
        {
            return itemstack2.isItemEqual(new ItemStack(ModItems.emeraldCrystal)) || super.getIsRepairable(itemstack1, itemstack2);
        }

    }

    public static class ItemLapisHoe extends ItemHoe {

        public ItemLapisHoe() {
            super(ToolArmorMaterials.lapis);
        }

        public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
        {
            return itemstack2.isItemEqual(new ItemStack(ModItems.lapisCrystal)) || super.getIsRepairable(itemstack1, itemstack2);
        }

    }

    public static class ItemBronzeHoe extends ItemHoe {

        public ItemBronzeHoe() {
            super(ToolArmorMaterials.bronze);
        }

        public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
        {
            return itemstack2.isItemEqual(new ItemStack(ModItems.bronzeIngot)) || super.getIsRepairable(itemstack1, itemstack2);
        }

    }

    public static class ItemCoalHoe extends ItemHoe {

        public ItemCoalHoe()
        {
            super(ToolArmorMaterials.coal);
        }

        public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
        {
            return itemstack2.isItemEqual(new ItemStack(ModItems.coalIngot)) || super.getIsRepairable(itemstack1, itemstack2);
        }

    }

    public static class ItemGlowstoneHoe extends ItemHoe {

        public ItemGlowstoneHoe() {
            super(ToolArmorMaterials.glowstone);
        }

        public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
        {
            return itemstack2.isItemEqual(new ItemStack(ModItems.glowstoneIngot)) || super.getIsRepairable(itemstack1, itemstack2);
        }

    }

    public static class ItemAdamantiumHoe extends ItemHoe{

        public ItemAdamantiumHoe() {
            super(ToolArmorMaterials.adamantium);
        }

        public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
        {
            return par2ItemStack.isItemEqual(new ItemStack(ModItems.adamantiumIngot)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
        }

    }

    public static class ItemSilkHoe extends ItemHoe{

        public ItemSilkHoe()
        {
            super(ToolArmorMaterials.silk);
        }

        public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
        {
            return stack2.isItemEqual(new ItemStack(ModItems.silkGem)) || super.getIsRepairable(stack1, stack2);
        }

        public void onCreated(ItemStack stack, World world, EntityPlayer player)
        {
            stack.addEnchantment(Enchantment.silkTouch, 1);
        }

    }

}

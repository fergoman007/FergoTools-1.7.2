package fergoman123.mods.fergotools.item;

import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Fergoman123 on 03/04/2014.
 */
public class Axes {

    public static class ItemQuartzAxe extends ItemAxe {

            public ItemQuartzAxe() {
                super(ToolArmorMaterials.quartz);
        }

        public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
        {
            return itemstack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemstack1, itemstack2);
        }

    }

    public static class ItemObsidianAxe extends ItemAxe {

        public ItemObsidianAxe() {
            super(ToolArmorMaterials.obsidian);
        }

        public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
        {
            return itemstack2.isItemEqual(new ItemStack(ModItems.obsidianIngot)) || super.getIsRepairable(itemstack1, itemstack2);
        }

    }

    public static class ItemEmeraldAxe extends ItemAxe {

        public ItemEmeraldAxe() {
            super(ToolArmorMaterials.emerald);
        }

        public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
        {
            return itemstack2.isItemEqual(new ItemStack(ModItems.emeraldCrystal)) || super.getIsRepairable(itemstack1, itemstack2);
        }

    }

    public static class ItemLapisAxe extends ItemAxe {

        public ItemLapisAxe() {
            super(ToolArmorMaterials.lapis);
        }

        public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
        {
            return itemstack2.isItemEqual(new ItemStack(ModItems.lapisCrystal)) || super.getIsRepairable(itemstack1, itemstack2);
        }

    }

    public static class ItemBronzeAxe extends ItemAxe {

        public ItemBronzeAxe() {
            super(ToolArmorMaterials.bronze);
        }

        public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
        {
            return itemstack2.isItemEqual(new ItemStack(ModItems.bronzeIngot)) || super.getIsRepairable(itemstack1, itemstack2);
        }

    }

    public static class ItemCoalAxe extends ItemAxe {

        public ItemCoalAxe() {
            super(ToolArmorMaterials.coal);
        }

        public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
        {
            return itemstack1.isItemEqual(new ItemStack(ModItems.coalIngot)) || super.getIsRepairable(itemstack1, itemstack2);
        }

    }

    public static class ItemGlowstoneAxe extends ItemAxe {

        public ItemGlowstoneAxe() {
            super(ToolArmorMaterials.glowstone);
        }

        public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
        {
            return itemstack2.isItemEqual(new ItemStack(ModItems.glowstoneIngot)) || super.getIsRepairable(itemstack1, itemstack2);
        }

    }

    public static class ItemAdamantiumAxe extends ItemAxe{

        public ItemAdamantiumAxe()
        {
            super(ToolArmorMaterials.adamantium);
        }

        public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
        {
            return par2ItemStack.isItemEqual(new ItemStack(ModItems.adamantiumIngot)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
        }

    }

    public static class ItemSilkAxe extends ItemAxe{

        public ItemSilkAxe()
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

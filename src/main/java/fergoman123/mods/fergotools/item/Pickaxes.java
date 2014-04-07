package fergoman123.mods.fergotools.item;

import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Fergoman123 on 03/04/2014.
 */
public class Pickaxes {

    public static class ItemQuartzPickaxe extends ItemPickaxe
    {
        public ItemQuartzPickaxe()
        {
            super(ToolArmorMaterials.quartz);
        }

        public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
        {
            return stack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(stack1, stack2);
        }
    }

    public static class ItemObsidianPickaxe extends ItemPickaxe
    {
        public ItemObsidianPickaxe()
        {
            super(ToolArmorMaterials.obsidian);
        }

        public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
        {
            return stack2.isItemEqual(new ItemStack(ModItems.obsidianIngot)) || super.getIsRepairable(stack1, stack2);
        }
    }

    public static class ItemEmeraldPickaxe extends ItemPickaxe
    {
        public ItemEmeraldPickaxe()
        {
            super(ToolArmorMaterials.emerald);
        }

        public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
        {
            return stack2.isItemEqual(new ItemStack(ModItems.emeraldCrystal)) || super.getIsRepairable(stack1, stack2);
        }
    }

    public static class ItemLapisPickaxe extends ItemPickaxe
    {
        public ItemLapisPickaxe()
        {
            super(ToolArmorMaterials.lapis);
        }

        public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
        {
            return stack2.isItemEqual(new ItemStack(ModItems.lapisCrystal)) || super.getIsRepairable(stack1, stack2);
        }
    }

    public static class ItemBronzePickaxe extends ItemPickaxe
    {
        public ItemBronzePickaxe()
        {
            super(ToolArmorMaterials.bronze);
        }

        public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
        {
            return stack2.isItemEqual(new ItemStack(ModItems.bronzeIngot)) || super.getIsRepairable(stack1, stack2);
        }
    }

    public static class ItemCoalPickaxe extends ItemPickaxe
    {
        public ItemCoalPickaxe()
        {
            super(ToolArmorMaterials.coal);
        }

        public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
        {
            return stack2.isItemEqual(new ItemStack(ModItems.coalIngot)) || super.getIsRepairable(stack1, stack2);
        }
    }

    public static class ItemGlowstonePickaxe extends ItemPickaxe
    {
        public ItemGlowstonePickaxe()
        {
            super(ToolArmorMaterials.glowstone);
        }

        public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
        {
            return stack2.isItemEqual(new ItemStack(ModItems.glowstoneIngot)) || super.getIsRepairable(stack1, stack2);
        }
    }

    public static class ItemAdamantiumPickaxe extends ItemPickaxe {

        public ItemAdamantiumPickaxe() {
            super(ToolArmorMaterials.adamantium);
        }

        public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
        {
            return par2ItemStack.isItemEqual(new ItemStack(ModItems.adamantiumIngot)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
        }

    }

    public static class ItemSilkPickaxe extends ItemPickaxe {

        public ItemSilkPickaxe()
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

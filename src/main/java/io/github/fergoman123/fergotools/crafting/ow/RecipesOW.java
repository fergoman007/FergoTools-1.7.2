package io.github.fergoman123.fergotools.crafting.ow;

import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapData;

import java.util.ArrayList;

/**
 * Created by Fergoman123.
 */
public class RecipesOW
{
    public static final RecipesArmorDyesOW armorDyes = new RecipesArmorDyesOW();
    public static final RecipeBookCloningOW bookCloning = new RecipeBookCloningOW();
    public static final RecipesMapCloningOW mapCloning = new RecipesMapCloningOW();
    public static final RecipesMapExtendingOW mapExtending = new RecipesMapExtendingOW();
    public static final RecipeFireworksOW fireworks = new RecipeFireworksOW();

    public static final class RecipesArmorDyesOW implements IRecipe
    {
        public boolean matches(InventoryCrafting p_77569_1_, World p_77569_2_)
        {
            ItemStack itemstack = null;
            ArrayList arraylist = new ArrayList();

            for (int i = 0; i < p_77569_1_.getSizeInventory(); ++i)
            {
                ItemStack itemstack1 = p_77569_1_.getStackInSlot(i);

                if (itemstack1 != null)
                {
                    if (itemstack1.getItem() instanceof ItemArmor)
                    {
                        ItemArmor itemarmor = (ItemArmor)itemstack1.getItem();

                        if (itemarmor.getArmorMaterial() != ItemArmor.ArmorMaterial.CLOTH || itemstack != null)
                        {
                            return false;
                        }

                        itemstack = itemstack1;
                    }
                    else
                    {
                        if (itemstack1.getItem() != Items.dye)
                        {
                            return false;
                        }

                        arraylist.add(itemstack1);
                    }
                }
            }

            return itemstack != null && !arraylist.isEmpty();
        }

        /**
         * Returns an Item that is the result of this recipe
         */
        public ItemStack getCraftingResult(InventoryCrafting p_77572_1_)
        {
            ItemStack itemstack = null;
            int[] aint = new int[3];
            int i = 0;
            int j = 0;
            ItemArmor itemarmor = null;
            int k;
            int l;
            float f;
            float f1;
            int l1;

            for (k = 0; k < p_77572_1_.getSizeInventory(); ++k)
            {
                ItemStack itemstack1 = p_77572_1_.getStackInSlot(k);

                if (itemstack1 != null)
                {
                    if (itemstack1.getItem() instanceof ItemArmor)
                    {
                        itemarmor = (ItemArmor)itemstack1.getItem();

                        if (itemarmor.getArmorMaterial() != ItemArmor.ArmorMaterial.CLOTH || itemstack != null)
                        {
                            return null;
                        }

                        itemstack = itemstack1.copy();
                        itemstack.stackSize = 1;

                        if (itemarmor.hasColor(itemstack1))
                        {
                            l = itemarmor.getColor(itemstack);
                            f = (float)(l >> 16 & 255) / 255.0F;
                            f1 = (float)(l >> 8 & 255) / 255.0F;
                            float f2 = (float)(l & 255) / 255.0F;
                            i = (int)((float)i + Math.max(f, Math.max(f1, f2)) * 255.0F);
                            aint[0] = (int)((float)aint[0] + f * 255.0F);
                            aint[1] = (int)((float)aint[1] + f1 * 255.0F);
                            aint[2] = (int)((float)aint[2] + f2 * 255.0F);
                            ++j;
                        }
                    }
                    else
                    {
                        if (itemstack1.getItem() != Items.dye)
                        {
                            return null;
                        }

                        float[] afloat = EntitySheep.fleeceColorTable[BlockColored.func_150032_b(itemstack1.getItemDamage())];
                        int j1 = (int)(afloat[0] * 255.0F);
                        int k1 = (int)(afloat[1] * 255.0F);
                        l1 = (int)(afloat[2] * 255.0F);
                        i += Math.max(j1, Math.max(k1, l1));
                        aint[0] += j1;
                        aint[1] += k1;
                        aint[2] += l1;
                        ++j;
                    }
                }
            }

            if (itemarmor == null)
            {
                return null;
            }
            else
            {
                k = aint[0] / j;
                int i1 = aint[1] / j;
                l = aint[2] / j;
                f = (float)i / (float)j;
                f1 = (float)Math.max(k, Math.max(i1, l));
                k = (int)((float)k * f / f1);
                i1 = (int)((float)i1 * f / f1);
                l = (int)((float)l * f / f1);
                l1 = (k << 8) + i1;
                l1 = (l1 << 8) + l;
                itemarmor.func_82813_b(itemstack, l1);
                return itemstack;
            }
        }

        /**
         * Returns the size of the recipe area
         */
        public int getRecipeSize()
        {
            return 10;
        }

        public ItemStack getRecipeOutput()
        {
            return null;
        }
    }

    public static final class RecipeBookCloningOW implements IRecipe
    {
        public boolean matches(InventoryCrafting p_77569_1_, World p_77569_2_)
        {
            int i = 0;
            ItemStack itemstack = null;

            for (int j = 0; j < p_77569_1_.getSizeInventory(); ++j)
            {
                ItemStack itemstack1 = p_77569_1_.getStackInSlot(j);

                if (itemstack1 != null)
                {
                    if (itemstack1.getItem() == Items.written_book)
                    {
                        if (itemstack != null)
                        {
                            return false;
                        }

                        itemstack = itemstack1;
                    }
                    else
                    {
                        if (itemstack1.getItem() != Items.writable_book)
                        {
                            return false;
                        }

                        ++i;
                    }
                }
            }

            return itemstack != null && i > 0;
        }

        /**
         * Returns an Item that is the result of this recipe
         */
        public ItemStack getCraftingResult(InventoryCrafting p_77572_1_)
        {
            int i = 0;
            ItemStack itemstack = null;

            for (int j = 0; j < p_77572_1_.getSizeInventory(); ++j)
            {
                ItemStack itemstack1 = p_77572_1_.getStackInSlot(j);

                if (itemstack1 != null)
                {
                    if (itemstack1.getItem() == Items.written_book)
                    {
                        if (itemstack != null)
                        {
                            return null;
                        }

                        itemstack = itemstack1;
                    }
                    else
                    {
                        if (itemstack1.getItem() != Items.writable_book)
                        {
                            return null;
                        }

                        ++i;
                    }
                }
            }

            if (itemstack != null && i >= 1)
            {
                ItemStack itemstack2 = new ItemStack(Items.written_book, i + 1);
                itemstack2.setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());

                if (itemstack.hasDisplayName())
                {
                    itemstack2.setStackDisplayName(itemstack.getDisplayName());
                }

                return itemstack2;
            }
            else
            {
                return null;
            }
        }

        /**
         * Returns the size of the recipe area
         */
        public int getRecipeSize()
        {
            return 9;
        }

        public ItemStack getRecipeOutput()
        {
            return null;
        }
    }

    public static final class RecipesMapCloningOW implements IRecipe
    {
        public boolean matches(InventoryCrafting p_77569_1_, World p_77569_2_)
        {
            int i = 0;
            ItemStack itemstack = null;

            for (int j = 0; j < p_77569_1_.getSizeInventory(); ++j)
            {
                ItemStack itemstack1 = p_77569_1_.getStackInSlot(j);

                if (itemstack1 != null)
                {
                    if (itemstack1.getItem() == Items.filled_map)
                    {
                        if (itemstack != null)
                        {
                            return false;
                        }

                        itemstack = itemstack1;
                    }
                    else
                    {
                        if (itemstack1.getItem() != Items.map)
                        {
                            return false;
                        }

                        ++i;
                    }
                }
            }

            return itemstack != null && i > 0;
        }

        /**
         * Returns an Item that is the result of this recipe
         */
        public ItemStack getCraftingResult(InventoryCrafting p_77572_1_)
        {
            int i = 0;
            ItemStack itemstack = null;

            for (int j = 0; j < p_77572_1_.getSizeInventory(); ++j)
            {
                ItemStack itemstack1 = p_77572_1_.getStackInSlot(j);

                if (itemstack1 != null)
                {
                    if (itemstack1.getItem() == Items.filled_map)
                    {
                        if (itemstack != null)
                        {
                            return null;
                        }

                        itemstack = itemstack1;
                    }
                    else
                    {
                        if (itemstack1.getItem() != Items.map)
                        {
                            return null;
                        }

                        ++i;
                    }
                }
            }

            if (itemstack != null && i >= 1)
            {
                ItemStack itemstack2 = new ItemStack(Items.filled_map, i + 1, itemstack.getItemDamage());

                if (itemstack.hasDisplayName())
                {
                    itemstack2.setStackDisplayName(itemstack.getDisplayName());
                }

                return itemstack2;
            }
            else
            {
                return null;
            }
        }

        /**
         * Returns the size of the recipe area
         */
        public int getRecipeSize()
        {
            return 9;
        }

        public ItemStack getRecipeOutput()
        {
            return null;
        }
    }

    public static final class RecipesMapExtendingOW extends ShapedRecipes
    {
        public RecipesMapExtendingOW()
        {
            super(3, 3, new ItemStack[] {new ItemStack(Items.paper), new ItemStack(Items.paper), new ItemStack(Items.paper), new ItemStack(Items.paper), new ItemStack(Items.filled_map, 0, 32767), new ItemStack(Items.paper), new ItemStack(Items.paper), new ItemStack(Items.paper), new ItemStack(Items.paper)}, new ItemStack(Items.map, 0, 0));
        }

        /**
         * Used to check if a recipe matches current crafting inventory
         */
        public boolean matches(InventoryCrafting p_77569_1_, World p_77569_2_)
        {
            if (!super.matches(p_77569_1_, p_77569_2_))
            {
                return false;
            }
            else
            {
                ItemStack itemstack = null;

                for (int i = 0; i < p_77569_1_.getSizeInventory() && itemstack == null; ++i)
                {
                    ItemStack itemstack1 = p_77569_1_.getStackInSlot(i);

                    if (itemstack1 != null && itemstack1.getItem() == Items.filled_map)
                    {
                        itemstack = itemstack1;
                    }
                }

                if (itemstack == null)
                {
                    return false;
                }
                else
                {
                    MapData mapdata = Items.filled_map.getMapData(itemstack, p_77569_2_);
                    return mapdata == null ? false : mapdata.scale < 4;
                }
            }
        }

        /**
         * Returns an Item that is the result of this recipe
         */
        public ItemStack getCraftingResult(InventoryCrafting p_77572_1_)
        {
            ItemStack itemstack = null;

            for (int i = 0; i < p_77572_1_.getSizeInventory() && itemstack == null; ++i)
            {
                ItemStack itemstack1 = p_77572_1_.getStackInSlot(i);

                if (itemstack1 != null && itemstack1.getItem() == Items.filled_map)
                {
                    itemstack = itemstack1;
                }
            }

            itemstack = itemstack.copy();
            itemstack.stackSize = 1;

            if (itemstack.getTagCompound() == null)
            {
                itemstack.setTagCompound(new NBTTagCompound());
            }

            itemstack.getTagCompound().setBoolean("map_is_scaling", true);
            return itemstack;
        }
    }

    public static final class RecipeFireworksOW implements IRecipe
    {
        private ItemStack field_92102_a;
        private static final String __OBFID = "CL_00000083";

        /**
         * Used to check if a recipe matches current crafting inventory
         */
        public boolean matches(InventoryCrafting p_77569_1_, World p_77569_2_)
        {
            this.field_92102_a = null;
            int i = 0;
            int j = 0;
            int k = 0;
            int l = 0;
            int i1 = 0;
            int j1 = 0;

            for (int k1 = 0; k1 < p_77569_1_.getSizeInventory(); ++k1)
            {
                ItemStack itemstack = p_77569_1_.getStackInSlot(k1);

                if (itemstack != null)
                {
                    if (itemstack.getItem() == Items.gunpowder)
                    {
                        ++j;
                    }
                    else if (itemstack.getItem() == Items.firework_charge)
                    {
                        ++l;
                    }
                    else if (itemstack.getItem() == Items.dye)
                    {
                        ++k;
                    }
                    else if (itemstack.getItem() == Items.paper)
                    {
                        ++i;
                    }
                    else if (itemstack.getItem() == Items.glowstone_dust)
                    {
                        ++i1;
                    }
                    else if (itemstack.getItem() == Items.diamond)
                    {
                        ++i1;
                    }
                    else if (itemstack.getItem() == Items.fire_charge)
                    {
                        ++j1;
                    }
                    else if (itemstack.getItem() == Items.feather)
                    {
                        ++j1;
                    }
                    else if (itemstack.getItem() == Items.gold_nugget)
                    {
                        ++j1;
                    }
                    else
                    {
                        if (itemstack.getItem() != Items.skull)
                        {
                            return false;
                        }

                        ++j1;
                    }
                }
            }

            i1 += k + j1;

            if (j <= 3 && i <= 1)
            {
                NBTTagCompound nbttagcompound;
                NBTTagCompound nbttagcompound1;

                if (j >= 1 && i == 1 && i1 == 0)
                {
                    this.field_92102_a = new ItemStack(Items.fireworks);

                    nbttagcompound = new NBTTagCompound();
                    if (l > 0)
                    {
                        nbttagcompound1 = new NBTTagCompound();
                        NBTTagList nbttaglist = new NBTTagList();

                        for (int k2 = 0; k2 < p_77569_1_.getSizeInventory(); ++k2)
                        {
                            ItemStack itemstack3 = p_77569_1_.getStackInSlot(k2);

                            if (itemstack3 != null && itemstack3.getItem() == Items.firework_charge && itemstack3.hasTagCompound() && itemstack3.getTagCompound().hasKey("Explosion", 10))
                            {
                                nbttaglist.appendTag(itemstack3.getTagCompound().getCompoundTag("Explosion"));
                            }
                        }

                        nbttagcompound1.setTag("Explosions", nbttaglist);
                        nbttagcompound1.setByte("Flight", (byte)j);
                        nbttagcompound.setTag("Fireworks", nbttagcompound1);
                    }
                    this.field_92102_a.setTagCompound(nbttagcompound); //Forge BugFix: NPE Protection

                    return true;
                }
                else if (j == 1 && i == 0 && l == 0 && k > 0 && j1 <= 1)
                {
                    this.field_92102_a = new ItemStack(Items.firework_charge);
                    nbttagcompound = new NBTTagCompound();
                    nbttagcompound1 = new NBTTagCompound();
                    byte b0 = 0;
                    ArrayList arraylist = new ArrayList();

                    for (int l1 = 0; l1 < p_77569_1_.getSizeInventory(); ++l1)
                    {
                        ItemStack itemstack2 = p_77569_1_.getStackInSlot(l1);

                        if (itemstack2 != null)
                        {
                            if (itemstack2.getItem() == Items.dye)
                            {
                                arraylist.add(Integer.valueOf(ItemDye.field_150922_c[itemstack2.getItemDamage()]));
                            }
                            else if (itemstack2.getItem() == Items.glowstone_dust)
                            {
                                nbttagcompound1.setBoolean("Flicker", true);
                            }
                            else if (itemstack2.getItem() == Items.diamond)
                            {
                                nbttagcompound1.setBoolean("Trail", true);
                            }
                            else if (itemstack2.getItem() == Items.fire_charge)
                            {
                                b0 = 1;
                            }
                            else if (itemstack2.getItem() == Items.feather)
                            {
                                b0 = 4;
                            }
                            else if (itemstack2.getItem() == Items.gold_nugget)
                            {
                                b0 = 2;
                            }
                            else if (itemstack2.getItem() == Items.skull)
                            {
                                b0 = 3;
                            }
                        }
                    }

                    int[] aint1 = new int[arraylist.size()];

                    for (int l2 = 0; l2 < aint1.length; ++l2)
                    {
                        aint1[l2] = ((Integer)arraylist.get(l2)).intValue();
                    }

                    nbttagcompound1.setIntArray("Colors", aint1);
                    nbttagcompound1.setByte("Type", b0);
                    nbttagcompound.setTag("Explosion", nbttagcompound1);
                    this.field_92102_a.setTagCompound(nbttagcompound);
                    return true;
                }
                else if (j == 0 && i == 0 && l == 1 && k > 0 && k == i1)
                {
                    ArrayList arraylist1 = new ArrayList();

                    for (int i2 = 0; i2 < p_77569_1_.getSizeInventory(); ++i2)
                    {
                        ItemStack itemstack1 = p_77569_1_.getStackInSlot(i2);

                        if (itemstack1 != null)
                        {
                            if (itemstack1.getItem() == Items.dye)
                            {
                                arraylist1.add(Integer.valueOf(ItemDye.field_150922_c[itemstack1.getItemDamage()]));
                            }
                            else if (itemstack1.getItem() == Items.firework_charge)
                            {
                                this.field_92102_a = itemstack1.copy();
                                this.field_92102_a.stackSize = 1;
                            }
                        }
                    }

                    int[] aint = new int[arraylist1.size()];

                    for (int j2 = 0; j2 < aint.length; ++j2)
                    {
                        aint[j2] = ((Integer)arraylist1.get(j2)).intValue();
                    }

                    if (this.field_92102_a != null && this.field_92102_a.hasTagCompound())
                    {
                        NBTTagCompound nbttagcompound2 = this.field_92102_a.getTagCompound().getCompoundTag("Explosion");

                        if (nbttagcompound2 == null)
                        {
                            return false;
                        }
                        else
                        {
                            nbttagcompound2.setIntArray("FadeColors", aint);
                            return true;
                        }
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }

        /**
         * Returns an Item that is the result of this recipe
         */
        public ItemStack getCraftingResult(InventoryCrafting p_77572_1_)
        {
            return this.field_92102_a.copy();
        }

        /**
         * Returns the size of the recipe area
         */
        public int getRecipeSize()
        {
            return 10;
        }

        public ItemStack getRecipeOutput()
        {
            return this.field_92102_a;
        }
    }
}

package fergoman123.mods.fergotools.tileentity;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.block.furnace.BlockBronzeFurnace;
import fergoman123.mods.fergotools.lib.ints.FurnaceInts;
import fergoman123.mods.fergotools.lib.Strings.GuiStrings;
import fergoman123.mods.fergotools.lib.Strings.TileStrings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.*;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class TileEntityBronzeFurnace extends TileEntity implements ISidedInventory {

    private static final int[] slots_top = new int[] { 0 };
    private static final int[] slots_bottom = new int[] { 2, 1 };
    private static final int[] slots_sides = new int[] { 1 };

    private ItemStack[] slots = new ItemStack[3];

    public int burnTime;
    public int currentItemBurnTime;
    public int cookTime;

    public String localizedName;

    public int getSizeInventory() {
        return this.slots.length;
    }

    public ItemStack getStackInSlot(int par1) {
        return this.slots[par1];
    }

    public ItemStack decrStackSize(int par1, int par2) {
        if (this.slots[par1] != null) {
            ItemStack itemstack;

            if (this.slots[par1].stackSize <= par2) {
                itemstack = this.slots[par1];
                this.slots[par1] = null;
                return itemstack;
            } else {
                itemstack = this.slots[par1].splitStack(par2);

                if (this.slots[par1].stackSize == 0) {
                    this.slots[par1] = null;
                }

                return itemstack;
            }
        } else {
            return null;
        }
    }

    public ItemStack getStackInSlotOnClosing(int par1) {
        if (this.slots[par1] != null) {
            ItemStack itemstack = this.slots[par1];
            this.slots[par1] = null;
            return itemstack;
        } else {
            return null;
        }
    }

    public void setInventorySlotContents(int par1, ItemStack itemstack) {
        this.slots[par1] = itemstack;

        if (itemstack != null
                && itemstack.stackSize > this.getInventoryStackLimit()) {
            itemstack.stackSize = this.getInventoryStackLimit();
        }
    }

    public String getInventoryName() {
        return this.hasCustomInventoryName() ? this.localizedName : GuiStrings.containerBronzeFurnace;
    }

    public boolean hasCustomInventoryName() {
        return this.localizedName != null && this.localizedName.length() > 0;
    }

    public void setGuiDisplayName(String displayName) {
        this.localizedName = displayName;
    }

    public void readFromNBT(NBTTagCompound tagCompound) {
        super.readFromNBT(tagCompound);
        NBTTagList list = tagCompound.getTagList(TileStrings.items, 10);
        this.slots = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < list.tagCount(); ++i) {
            NBTTagCompound compound = (NBTTagCompound) list.getCompoundTagAt(i);
            byte b0 = compound.getByte(TileStrings.slot);

            if (b0 >= 0 && b0 < this.slots.length) {
                this.slots[b0] = ItemStack.loadItemStackFromNBT(compound);
            }
        }

        this.burnTime = tagCompound.getShort(TileStrings.burnTime);
        this.cookTime = tagCompound.getShort(TileStrings.cookTime);
        this.currentItemBurnTime = getItemBurnTime(this.slots[1]);

        if (tagCompound.hasKey(TileStrings.customName)) {
            this.localizedName = tagCompound.getString(TileStrings.customName);
        }
    }

    public void writeToNBT(NBTTagCompound tagCompound) {
        super.writeToNBT(tagCompound);
        tagCompound.setShort(TileStrings.burnTime, (short) this.burnTime);
        tagCompound.setShort(TileStrings.cookTime, (short) this.cookTime);
        NBTTagList list = new NBTTagList();

        for (int i = 0; i < this.slots.length; ++i) {
            if (this.slots[i] != null) {
                NBTTagCompound compound = new NBTTagCompound();
                compound.setByte(TileStrings.slot, (byte) i);
                this.slots[i].writeToNBT(compound);
                list.appendTag(compound);
            }
        }

        tagCompound.setTag(TileStrings.items, list);
    }

    public int getInventoryStackLimit() {
        return 64;
    }

    @SideOnly(Side.CLIENT)
    public int getCookProgressScaled(int par1) {
        return this.cookTime * par1 / FurnaceInts.bronzeFurnaceSpeed;
    }

    @SideOnly(Side.CLIENT)
    public int getBurnTimeRemainingScaled(int par1) {
        if (this.currentItemBurnTime == 0) {
            this.currentItemBurnTime = 200;
        }

        return this.burnTime * par1 / this.currentItemBurnTime;
    }

    public boolean isBurning() {
        return this.burnTime > 0;
    }

    public void updateEntity() {
        boolean flag = this.burnTime > 0;
        boolean flag1 = false;

        if (this.burnTime > 0) {
            --this.burnTime;
        }

        if (!this.worldObj.isRemote) {
            if (this.burnTime == 0 && this.canSmelt()) {
                this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.slots[1]);

                if (this.burnTime > 0) {
                    flag1 = true;

                    if (this.slots[1] != null) {
                        --this.slots[1].stackSize;

                        if (this.slots[1].stackSize == 0) {
                            this.slots[1] = this.slots[1].getItem()
                                    .getContainerItem(slots[1]);
                        }
                    }
                }
            }

            if (this.isBurning() && this.canSmelt()) {
                ++this.cookTime;

                if (this.cookTime == 200) {
                    this.cookTime = 0;
                    this.smeltItem();
                    flag1 = true;
                }
            } else {
                this.cookTime = 0;
            }

            if (flag != this.burnTime > 0) {
                flag1 = true;
                BlockBronzeFurnace.updateFurnaceBlockState(this.isBurning(),
                        this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if (flag1) {
            this.markDirty();
        }
    }

    private boolean canSmelt() {
        if (this.slots[0] == null) {
            return false;
        } else {
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(
                    this.slots[0]);
            if (itemstack == null)
                return false;
            if (this.slots[2] == null)
                return true;
            if (!this.slots[2].isItemEqual(itemstack))
                return false;
            int result = slots[2].stackSize + itemstack.stackSize;
            return (result <= getInventoryStackLimit() && result <= itemstack
                    .getMaxStackSize());
        }
    }

    public void smeltItem() {
        if (this.canSmelt()) {
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(
                    this.slots[0]);

            if (this.slots[2] == null) {
                this.slots[2] = itemstack.copy();
            } else if (this.slots[2].isItemEqual(itemstack)) {
                slots[2].stackSize += itemstack.stackSize;
            }

            --this.slots[0].stackSize;

            if (this.slots[0].stackSize <= 0) {

                this.slots[0] = null;
            }
        }
    }

    public static int getItemBurnTime(ItemStack itemstack) {
        if (itemstack == null) {
            return 0;
        } else {
            Item item = itemstack.getItem();

            if (itemstack.getItem() instanceof ItemBlock && Block.getBlockFromItem(item) != null)
            {
                Block block = Block.getBlockFromItem(item);

                if (block == Blocks.wooden_slab)
                {
                    return 150;
                }

                if (block.getMaterial() == Material.wood)
                {
                    return 300;
                }

                if (block == Blocks.coal_block)
                {
                    return 16000;
                }
            }

            if (item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemSword && ((ItemSword) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemHoe && ((ItemHoe) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item == Items.stick)return 100;
            if (item == Items.coal) return 1600;
            if (item == Items.lava_bucket) return 20000;
            if (item == Item.getItemFromBlock(Blocks.sapling)) return 100;
            if (item == Items.blaze_rod) return 2400;
            return GameRegistry.getFuelValue(itemstack);



        }
    }

    public static boolean isItemFuel(ItemStack itemstack) {
        return getItemBurnTime(itemstack) > 0;
    }

    public boolean isUseableByPlayer(EntityPlayer player) {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : player.getDistanceSq((double) this.xCoord + 0.5D, (double) this.yCoord + 0.5D,(double) this.zCoord + 0.5D) <= 64.0D;
    }

    public void openInventory() {
    }

    public void closeInventory() {
    }

    public boolean isItemValidForSlot(int par1, ItemStack itemstack) {
        return par1 == 2 ? false : (par1 == 1 ? isItemFuel(itemstack) : true);
    }

    public int[] getAccessibleSlotsFromSide(int par1)
    {
        return par1 == 0 ? slots_bottom : (par1 == 1 ? slots_top : slots_sides);
    }

    public boolean canInsertItem(int par1, ItemStack itemstack, int par3)
    {
        return this.isItemValidForSlot(par1, itemstack);
    }

    public boolean canExtractItem(int par1, ItemStack itemstack, int par3)
    {
        return par3 != 0 || par1 != 1 || itemstack.getItem() == Items.bucket;
    }

}
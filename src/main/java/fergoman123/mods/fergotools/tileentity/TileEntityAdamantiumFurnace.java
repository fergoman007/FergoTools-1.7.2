package fergoman123.mods.fergotools.tileentity;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.block.furnace.BlockAdamantiumFurnace;
import fergoman123.mods.fergotools.lib.strings.GuiStrings;
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

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class TileEntityAdamantiumFurnace extends TileEntityQuartzFurnace implements ISidedInventory {
    private static final int[] slots_top = new int[]{0};
    private static final int[] slots_bottom = new int[]{2, 1};
    private static final int[] slots_sides = new int[]{1};

    public int furnaceSpeed = 10;

    private ItemStack[] slots = new ItemStack[3];

    public int burnTime;
    public int currentItemBurnTime;
    public int cookTime;

    private String localizedName;

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

    public void setInventorySlotContents(int par1, ItemStack par2ItemStack) {
        this.slots[par1] = par2ItemStack;

        if (par2ItemStack != null && par2ItemStack.stackSize > this.getInventoryStackLimit()) {
            par2ItemStack.stackSize = this.getInventoryStackLimit();
        }
    }

    public String getInventoryName() {
        return this.hasCustomInventoryName() ? this.localizedName : GuiStrings.containers[7];
    }

    public boolean hasCustomInventoryName() {
        return this.localizedName != null && this.localizedName.length() > 0;
    }

    public void setGuiDisplayName(String par1Str) {
        this.localizedName = par1Str;
    }

    public void readFromNBT(NBTTagCompound par1NBTTagCompound) {
        super.readFromNBT(par1NBTTagCompound);
        NBTTagList nbttaglist = par1NBTTagCompound.getTagList("Items", 10);
        this.slots = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < nbttaglist.tagCount(); ++i) {
            NBTTagCompound nbttagcompound1 = (NBTTagCompound) nbttaglist.getCompoundTagAt(i);
            byte b0 = nbttagcompound1.getByte("Slot");

            if (b0 >= 0 && b0 < this.slots.length) {
                this.slots[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }

        this.burnTime = par1NBTTagCompound.getShort("BurnTime");
        this.cookTime = par1NBTTagCompound.getShort("CookTime");
        this.currentItemBurnTime = getItemBurnTime(this.slots[1]);

        if (par1NBTTagCompound.hasKey("CustomName")) {
            this.localizedName = par1NBTTagCompound.getString("CustomName");
        }
    }

    public void writeToNBT(NBTTagCompound par1NBTTagCompound) {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("BurnTime", (short) this.burnTime);
        par1NBTTagCompound.setShort("CookTime", (short) this.cookTime);
        NBTTagList nbttaglist = new NBTTagList();

        for (int i = 0; i < this.slots.length; ++i) {
            if (this.slots[i] != null) {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte) i);
                this.slots[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }

        par1NBTTagCompound.setTag("Items", nbttaglist);

        if (this.hasCustomInventoryName()) {
            par1NBTTagCompound.setString("CustomName", this.localizedName);
        }
    }

    public int getInventoryStackLimit() {
        return 64;
    }

    @SideOnly(Side.CLIENT)
    public int getCookProgressScaled(int par1) {
        return this.cookTime * par1 / 200;
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
                            this.slots[1] = this.slots[1].getItem().getContainerItem(slots[1]);
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
                BlockAdamantiumFurnace.updateFurnaceBlockState(this.burnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
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
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);
            if (itemstack == null) return false;
            if (this.slots[2] == null) return true;
            if (!this.slots[2].isItemEqual(itemstack)) return false;
            int result = slots[2].stackSize + itemstack.stackSize;
            return (result <= getInventoryStackLimit() && result <= itemstack.getMaxStackSize());
        }
    }

    public void smeltItem() {
        if (this.canSmelt()) {
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);

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

    public static int getItemBurnTime(ItemStack par0ItemStack) {
        if (par0ItemStack == null) {
            return 0;
        } else {

            Item item = par0ItemStack.getItem();

            if (par0ItemStack.getItem() instanceof ItemBlock && Block.getBlockFromItem(item) != null) {
                Block block = Block.getBlockFromItem(item);

                if (block == Blocks.wooden_slab) {
                    return 300;
                }

                if (block.getMaterial() == Material.wood) {
                    return 600;
                }

                if (block == Blocks.coal_block) {
                    return 32000;
                }
            }

            if (item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("WOOD")) return 400;
            if (item instanceof ItemSword && ((ItemSword) item).getToolMaterialName().equals("WOOD")) return 400;
            if (item instanceof ItemHoe && ((ItemHoe) item).getToolMaterialName().equals("WOOD")) return 400;
            if (item == Items.stick) return 200;
            if (item == Items.coal) return 3200;
            if (item == Items.lava_bucket) return 40000;
            if (item == Item.getItemFromBlock(Blocks.sapling)) return 200;
            if (item == Items.blaze_rod) return 4800;
            return GameRegistry.getFuelValue(par0ItemStack);
        }
    }

    public static boolean isItemFuel(ItemStack par0ItemStack) {
        return getItemBurnTime(par0ItemStack) > 0;
    }

    public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer) {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : par1EntityPlayer.getDistanceSq((double) this.xCoord + 0.5D, (double) this.yCoord + 0.5D, (double) this.zCoord + 0.5D) <= 64.0D;
    }

    public void openInventory() {}

    public void closeInventory() {}

    public boolean isItemValidForSlot(int par1, ItemStack par2ItemStack) {return par1 == 2 ? false : (par1 == 1 ? isItemFuel(par2ItemStack) : true);}

    public int[] getAccessibleSlotsFromSide(int par1) {return par1 == 0 ? slots_bottom : (par1 == 1 ? slots_top : slots_sides);}

    public boolean canInsertItem(int par1, ItemStack par2ItemStack, int par3) {return this.isItemValidForSlot(par1, par2ItemStack);}

    public boolean canExtractItem(int par1, ItemStack par2ItemStack, int par3) {return par3 != 0 || par1 != 1 || par2ItemStack.getItem() == Items.bucket;}
}

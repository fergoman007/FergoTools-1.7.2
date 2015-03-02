package io.github.fergoman123.fergotools.common.tileentity;

import io.github.fergoman123.fergotools.common.blocks.BlockMacerator;
import io.github.fergoman123.fergotools.common.inventory.ContainerMacerator;
import io.github.fergoman123.fergotools.common.slot.SlotMaceratorFuel;
import io.github.fergoman123.fergotools.info.FurnaceConstants;
import io.github.fergoman123.fergotools.info.Locale;
import io.github.fergoman123.fergotools.item.crafting.MaceratorRecipes;
import io.github.fergoman123.fergoutil.tileentity.TileEntityFurnaceFergo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.MathHelper;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class TileEntityMacerator extends TileEntityFurnaceFergo {
    @Override
    public String getCommandSenderName() {
        return this.hasCustomName() ? this.customName : Locale.containerMacerator;
    }

    @Override
    public void update() {
        boolean flag = this.isBurning();
        boolean flag1 = false;

        if (this.isBurning()) {
            --this.burnTime;
        }

        if (!this.worldObj.isRemote) {
            if (!this.isBurning() && (this.slots[1] == null || this.slots[0] == null)) {
                if (!this.isBurning() && this.cookTime > 0) {
                    this.cookTime = MathHelper.clamp_int(this.cookTime - 2, 0, this.totalCookTime);
                }
            } else {
                if (!this.isBurning() && this.canSmelt()) {
                    this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.slots[1]);

                    if (this.isBurning()) {
                        flag1 = true;

                        if (this.slots[1] != null) {
                            --this.slots[1].stackSize;

                            if (this.slots[1].stackSize == 0) {
                                this.slots[1] = slots[1].getItem().getContainerItem(slots[1]);
                            }
                        }
                    }
                }

                if (this.isBurning() && this.canSmelt()) {
                    ++this.cookTime;

                    if (this.cookTime == this.totalCookTime) {
                        this.cookTime = 0;
                        this.totalCookTime = this.getFurnaceSpeed(this.slots[0]);
                        this.smeltItem();
                        flag1 = true;
                    }
                } else {
                    this.cookTime = 0;
                }
            }

            if (flag != this.isBurning()) {
                flag1 = true;
                BlockMacerator.setState(this.isBurning(), this.worldObj, this.pos);
            }
        }

        if (flag1) {
            this.markDirty();
        }
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        NBTTagList list = compound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
        this.slots = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < list.tagCount(); i++) {
            NBTTagCompound compound1 = list.getCompoundTagAt(i);
            byte b0 = compound1.getByte("Slot");

            if (b0 >= 0 && b0 < this.slots.length) {
                this.slots[b0] = ItemStack.loadItemStackFromNBT(compound1);
            }
        }

        this.burnTime = compound.getShort("BurnTime");
        this.cookTime = compound.getShort("CookTime");
        this.totalCookTime = compound.getShort("CoojTimeTotal");
        this.currentItemBurnTime = getItemBurnTime(this.slots[1]);

        if (compound.hasKey("CustomName", Constants.NBT.TAG_STRING)) {
            this.customName = compound.getString("CustomName");
        }
    }

    @Override
    public int getFurnaceSpeed(ItemStack stack) {
        return FurnaceConstants.Speed.macerator;
    }

    public boolean isOre(ItemStack stack) {
        String[] ores = OreDictionary.getOreNames();
        for (int i = 0; i < ores.length; i++) {
            if (ores[i].contains("ore")) {
                if (OreDictionary.getOres(ores[i]) != null) {
                    for (int j = 0; j < OreDictionary.getOres(ores[i]).size(); j++) {
                        if (OreDictionary.getOres(ores[i]).get(j).getItem() == stack.getItem()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean canSmelt() {
        if (this.slots[0] == null) {
            return false;
        } else {
            ItemStack stack = MaceratorRecipes.instance().getSmeltingResult(this.slots[0]);
            if (stack == null) return false;
            if (!this.isOre(this.slots[0])) return false;
            if (this.slots[2] == null) return true;
            if (!this.slots[2].isItemEqual(stack)) return false;
            int result = slots[2].stackSize + stack.stackSize;
            return (result <= getInventoryStackLimit() && result <= this.slots[2].getMaxStackSize());
        }
    }

    @Override
    public void smeltItem() {
        if (this.canSmelt()){
            ItemStack stack = MaceratorRecipes.instance().getSmeltingResult(this.slots[0]);

            if (this.slots[2] == null){
                this.slots[2] = stack.copy();
            }else if (this.slots[2].getItem() == stack.getItem()){
                this.slots[2].stackSize += stack.stackSize;
            }

            --this.slots[0].stackSize;

            if (this.slots[0].stackSize <= 0){
                this.slots[0] = null;
            }
        }
    }

    public static boolean isItemFuel(ItemStack stack) {
        return getItemBurnTime(stack) > 0;
    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return index == 2 ? false : (index != 1 ? true : isItemFuel(stack) || SlotMaceratorFuel.isBucket(stack));
    }

    @Override
    public String getGuiID() {
        return "fergotools:macerator";
    }

    @Override
    public Container createContainer(InventoryPlayer invPlayer, EntityPlayer player) {
        return new ContainerMacerator(invPlayer, this);
        //TODO: macerator container
    }

    public static int getItemBurnTime(ItemStack stack) {

        if (stack == null) {
            return 0;
        } else {
            Item item = stack.getItem();

            if (item == Items.redstone) return 150;
            if (item == Item.getItemFromBlock(Blocks.redstone_block)) return 1350;
            return GameRegistry.getFuelValue(stack);
        }
    }
}

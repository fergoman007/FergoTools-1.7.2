package io.github.fergoman123.fergotools.common.furnace;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.api.BlockFurnaceFT;
import io.github.fergoman123.fergotools.info.FurnaceConstants;
import io.github.fergoman123.fergotools.info.GuiIds;
import io.github.fergoman123.fergotools.info.Locale;
import io.github.fergoman123.fergotools.info.Textures;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergoutil.gui.ContainerFurnaceFergo;
import io.github.fergoman123.fergoutil.gui.GuiFurnaceFergo;
import io.github.fergoman123.fergoutil.helper.BlockStateHelper;
import io.github.fergoman123.fergoutil.helper.GuiHelper;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.tileentity.TileFurnaceFergo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import java.util.Random;

public class BronzeFurnace
{
    public static final class BlockBronzeFurnace extends BlockFurnaceFT
    {
        public BlockBronzeFurnace(boolean isActive, String name) {
            super(isActive, Material.rock, name);
        }

        @Override
        public Item getItemDropped(IBlockState state, Random rand, int fortune) {
            return Item.getItemFromBlock(ModBlocks.bronzeFurnaceIdle);
        }

        @Override
        public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
            if (!worldIn.isRemote && !playerIn.isSneaking())
            {
                TileBronzeFurnace furnace = (TileBronzeFurnace)worldIn.getTileEntity(pos);
                if (furnace != null)
                {
                    openGui(FergoTools.instance, GuiIds.bronzeFurnace.ordinal(), worldIn, pos, playerIn);
                    FergoTools.getLogger().info("Open Furnace"); //FIXME: for debugging
                }
                return true;
            }
            else
            {
                return false;
            }
        }

        public static void setState(boolean active, World world, BlockPos pos)
        {
            IBlockState state = world.getBlockState(pos);
            TileEntity tile = world.getTileEntity(pos);
            keepInventory = true;

            if (active)
            {
                world.setBlockState(pos, BlockStateHelper.getStateWithProps(ModBlocks.bronzeFurnaceActive, FACING, state.getValue(FACING)), 3);
                world.setBlockState(pos, BlockStateHelper.getStateWithProps(ModBlocks.bronzeFurnaceActive, FACING, state.getValue(FACING)), 3);
            }
            else
            {
                world.setBlockState(pos, BlockStateHelper.getStateWithProps(ModBlocks.bronzeFurnaceIdle, FACING, state.getValue(FACING)), 3);
                world.setBlockState(pos, BlockStateHelper.getStateWithProps(ModBlocks.bronzeFurnaceIdle, FACING, state.getValue(FACING)), 3);
            }

            keepInventory = false;

            if(tile != null)
            {
                tile.validate();
                world.setTileEntity(pos, tile);
            }
        }

        @Override
        public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
            if (!keepInventory)
            {
                TileBronzeFurnace furnace = (TileBronzeFurnace)worldIn.getTileEntity(pos);
                if (furnace != null)
                {
                    InventoryHelper.dropInventoryItems(worldIn, pos, furnace);
                    worldIn.updateComparatorOutputLevel(pos, this);
                }
            }
            super.breakBlock(worldIn, pos, state);
        }

        @Override
        public TileEntity createNewTileEntity(World world, int meta) {
            return new TileBronzeFurnace();
        }

        @Override
        public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
            worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);

            if (stack.hasDisplayName())
            {
                ((TileBronzeFurnace)worldIn.getTileEntity(pos)).setCustomInventoryName(stack.getDisplayName());
            }
        }

        @Override
        public Item getItem(World world, BlockPos pos) {
            return Item.getItemFromBlock(ModBlocks.bronzeFurnaceIdle);
        }
    }

    public static final class TileBronzeFurnace extends TileFurnaceFergo
    {
        @Override
        public String getCommandSenderName() {
            return this.hasCustomName() ? this.customName : Locale.containerBronzeFurnace;
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
                    BlockBronzeFurnace.setState(this.isBurning(), this.worldObj, this.pos);
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

                if (b0 >= 0 && b0 < this.slots.length)
                {
                    this.slots[b0] = ItemStack.loadItemStackFromNBT(compound1);
                }
            }

            this.burnTime = compound.getShort("BurnTime");
            this.cookTime = compound.getShort("CookTime");
            this.totalCookTime = compound.getShort("CookTimeTotal");
            this.currentItemBurnTime = getItemBurnTime(this.slots[1]);

            if (compound.hasKey("CustomName", Constants.NBT.TAG_STRING))
            {
                this.customName = compound.getString("CustomName");
            }
        }

        @Override
        public int getFurnaceSpeed(ItemStack stack) {
            return FurnaceConstants.Speed.bronzeFurnace;
        }

        @Override
        public boolean canSmelt() {
            if (this.slots[0] == null) {
                return false;
            } else {
                ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.slots[0]);
                if (itemstack == null) return false;
                if (this.slots[2] == null) return true;
                if (!this.slots[2].isItemEqual(itemstack)) return false;
                int result = slots[2].stackSize + itemstack.stackSize;
                return result <= getInventoryStackLimit() && result <= this.slots[2].getMaxStackSize();
            }
        }

        @Override
        public void smeltItem() {
            if (this.canSmelt()) {
                ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.slots[0]);

                if (this.slots[2] == null) {
                    this.slots[2] = itemstack.copy();
                } else if (this.slots[2].getItem() == itemstack.getItem()) {
                    this.slots[2].stackSize += itemstack.stackSize; // Forge BugFix: Results may have multiple items
                }

                if (this.slots[0].getItem() == Item.getItemFromBlock(Blocks.sponge) && this.slots[0].getMetadata() == 1 && this.slots[1] != null && this.slots[1].getItem() == Items.bucket) {
                    this.slots[1] = new ItemStack(Items.water_bucket);
                }

                --this.slots[0].stackSize;

                if (this.slots[0].stackSize <= 0) {
                    this.slots[0] = null;
                }
            }
        }

        public static int getItemBurnTime(ItemStack stack) {
            if (stack == null)
            {
                return 0;
            }
            else
            {
                Item item = stack.getItem();


                if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air)
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

                if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD")) return 200;
                if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD")) return 200;
                if (item instanceof ItemHoe && ((ItemHoe)item).getMaterialName().equals("WOOD")) return 200;
                if (item == Items.stick) return 100;
                if (item == Items.coal) return 1600;
                if (item == Items.lava_bucket) return 20000;
                if (item == Item.getItemFromBlock(Blocks.sapling)) return 100;
                if (item == Items.blaze_rod) return 2400;
                if (item == ModItems.ingotCoal)return 9 * 1600;
                if (item == Item.getItemFromBlock(ModBlocks.blockCoal))return 81 * 1600;
                return GameRegistry.getFuelValue(stack);
            }
        }

        public static boolean isItemFuel(ItemStack stack)
        {
            return getItemBurnTime(stack) > 0;
        }

        @Override
        public boolean isItemValidForSlot(int index, ItemStack stack) {
            return index == 2 ? false : (index != 1 ? true : isItemFuel(stack) || SlotFurnaceFuel.isBucket(stack));
        }

        @Override
        public String getGuiID() {
            return "fergotools:bronzefurnace";
        }

        @Override
        public Container createContainer(InventoryPlayer invPlayer, EntityPlayer player) {
            return new ContainerBronzeFurnace(invPlayer, this);
        }
    }

    public static final class ContainerBronzeFurnace extends ContainerFurnaceFergo
    {
        public ContainerBronzeFurnace(InventoryPlayer invPlayer, IInventory furnace)
        {
            super(invPlayer, furnace);
        }

        @Override
        public void addInventorySlots() {
            this.addSlotToContainer(new Slot(this.furnace, 0, 62, 22));
            this.addSlotToContainer(new SlotFurnaceFuel(this.furnace, 1, 42, 22));
            this.addSlotToContainer(new SlotFurnaceOutput(this.invPlayer.player, furnace, 2, 110, 22));
        }

        @Override
        public void addPlayerInventory() {
            for (int invRowIndex = 0; invRowIndex < playerInvRows; invRowIndex++) {
                for (int invColIndex = 0; invColIndex < playerInvCols; ++invColIndex)
                {
                    this.addSlotToContainer(new Slot(this.invPlayer, invColIndex + invRowIndex * 9 + 9, 8 + invColIndex * 18, 53 + invRowIndex * 18));
                }
            }

            for (int actionBarSlotIndex = 0; actionBarSlotIndex < playerInvCols; ++actionBarSlotIndex)
            {
                this.addSlotToContainer(new Slot(this.invPlayer, actionBarSlotIndex, 8 + actionBarSlotIndex * 18, 111));
            }
        }

        public void onCraftGuiOpened(ICrafting listener)
        {
            super.onCraftGuiOpened(listener);
            listener.func_175173_a(this, this.furnace);
        }

        @Override
        public void detectAndSendChanges() {
            super.detectAndSendChanges();

            for (int i = 0; i < this.crafters.size(); ++i)
            {
                ICrafting icrafting = (ICrafting)this.crafters.get(i);

                if (this.lastCookTime != this.furnace.getField(2))
                {
                    icrafting.sendProgressBarUpdate(this, 2, this.furnace.getField(2));
                }

                if (this.lastBurnTime != this.furnace.getField(0))
                {
                    icrafting.sendProgressBarUpdate(this, 0, this.furnace.getField(0));
                }

                if (this.lastItemBurnTime != this.furnace.getField(1))
                {
                    icrafting.sendProgressBarUpdate(this, 1, this.furnace.getField(1));
                }

                if (this.lastTotalCookTime != this.furnace.getField(3))
                {
                    icrafting.sendProgressBarUpdate(this, 3, this.furnace.getField(3));
                }
            }

            this.lastCookTime = this.furnace.getField(2);
            this.lastBurnTime = this.furnace.getField(0);
            this.lastItemBurnTime = this.furnace.getField(1);
            this.lastTotalCookTime = this.furnace.getField(3);
        }

        @SideOnly(Side.CLIENT)
        public void updateProgressBar(int id, int data) {
            this.furnace.setField(id, data);
        }

        public boolean canInteractWith(EntityPlayer playerIn) {
            return this.furnace.isUseableByPlayer(playerIn);
        }

        public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int slotIndex){
            ItemStack itemstack = null;
            Slot slot = (Slot)this.inventorySlots.get(slotIndex);
            if (slot != null && slot.getHasStack()){
                ItemStack itemstack1 = slot.getStack();
                itemstack = itemstack1.copy();
                if (slotIndex == 2){
                    if (!this.mergeItemStack(itemstack1, 3, 39, true)){return null;}
                    slot.onSlotChange(itemstack1, itemstack);
                }else if (slotIndex != 1 && slotIndex != 0){
                    if (FurnaceRecipes.instance().getSmeltingResult(itemstack1) != null){
                        if (!this.mergeItemStack(itemstack1, 0, 1, false)){return null;}
                    }else if (TileBronzeFurnace.isItemFuel(itemstack1)){
                        if (!this.mergeItemStack(itemstack1, 1, 2, false)){return null;}
                    }else if (slotIndex >= 3 && slotIndex < 30){
                        if (!this.mergeItemStack(itemstack1, 30, 39, false)){return null;}
                    }else if (slotIndex >= 30 && slotIndex < 39 && !this.mergeItemStack(itemstack1, 3, 30, false)){return null;
                    }} else if (!this.mergeItemStack(itemstack1, 3, 39, false)){return null;}

                if (itemstack1.stackSize == 0){slot.putStack((ItemStack)null);
                }else{slot.onSlotChanged();}
                if (itemstack1.stackSize == itemstack.stackSize){return null;}
                slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
            }
            return itemstack;
        }
    }

    public static final class GuiBronzeFurnace extends GuiFurnaceFergo
    {
        public GuiBronzeFurnace(InventoryPlayer invPlayer, IInventory furnace)
        {
            super(new ContainerBronzeFurnace(invPlayer, furnace), invPlayer, furnace);
        }

        public void drawGuiContainerForegroundLayer(int par1, int par2)
        {
            String s = NameHelper.translate(this.furnace.getDisplayName().getUnformattedText());
            fontRendererObj.drawString(s, xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
            fontRendererObj.drawString(I18n.format(this.invPlayer.getDisplayName().getUnformattedText()), 8, ySize - 126 + 2, 4210752);
        }

        public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GuiHelper.bindTexture(Textures.bronzeFurnaceGui);
            int startX = (width - xSize) / 2;
            int startY = (height - ySize) / 2;
            drawTexturedModalRect(startX, startY, 0, 0, xSize, ySize);

            if (TileBronzeFurnace.isBurning(this.furnace))
            {
                int cookTime = getBurnTimeRemainingScaled(12);
                drawTexturedModalRect(startX + 25, startY + 24 + 12 - cookTime, 176, 12 - cookTime, 14, cookTime + 2);
            }

            int scaleAdjustment = getCookProgressScaled(24);
            drawTexturedModalRect(startX + 80, startY + 21, 176, 14, scaleAdjustment + 1, 16);
        }
    }
}

package io.github.fergoman123.fergotools.common.furnace;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.api.BlockFurnaceFT;
import io.github.fergoman123.fergotools.info.FurnaceConstants;
import io.github.fergoman123.fergotools.info.GuiIds;
import io.github.fergoman123.fergotools.info.Locale;
import io.github.fergoman123.fergotools.info.Textures;
import io.github.fergoman123.fergotools.init.ModAchievements;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.item.crafting.MaceratorRecipes;
import io.github.fergoman123.fergoutil.gui.ContainerFurnaceFergo;
import io.github.fergoman123.fergoutil.gui.GuiFurnaceFergo;
import io.github.fergoman123.fergoutil.helper.BlockStateHelper;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.inventory.SlotFuelFergo;
import io.github.fergoman123.fergoutil.inventory.SlotOutputFergo;
import io.github.fergoman123.fergoutil.tileentity.TileFurnaceFergo;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
import net.minecraftforge.oredict.OreDictionary;

import java.util.Random;

public final class Macerator
{
    public static final class BlockMacerator extends BlockFurnaceFT
    {
        public BlockMacerator(boolean isActive, String name)
        {
            super(isActive, Material.rock, name);
        }

        @Override
        public Item getItemDropped(IBlockState state, Random rand, int fortune) {
            return Item.getItemFromBlock(ModBlocks.maceratorIdle);
        }

        @Override
        public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {

            if(!worldIn.isRemote && !playerIn.isSneaking())
            {
                TileMacerator furnace = (TileMacerator)worldIn.getTileEntity(pos);
                if (furnace != null)
                {
                    playerIn.openGui(FergoTools.instance, GuiIds.macerator.ordinal(), worldIn, pos.getX(), pos.getY(), pos.getZ());
                    FergoTools.getLogger().info("Open Macerator");
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
            TileEntity tileEntity = world.getTileEntity(pos);
            keepInventory = true;

            if (active)
            {
                world.setBlockState(pos, BlockStateHelper.getStateWithProps(ModBlocks.maceratorActive, FACING, state.getValue(FACING)), 3);
                world.setBlockState(pos, BlockStateHelper.getStateWithProps(ModBlocks.maceratorActive, FACING, state.getValue(FACING)), 3);
            }
            else
            {
                world.setBlockState(pos, BlockStateHelper.getStateWithProps(ModBlocks.maceratorIdle, FACING, state.getValue(FACING)), 3);
                world.setBlockState(pos, BlockStateHelper.getStateWithProps(ModBlocks.maceratorIdle, FACING, state.getValue(FACING)), 3);
            }

            keepInventory = false;

            if (tileEntity != null) {
                tileEntity.validate();
                world.setTileEntity(pos, tileEntity);
            }
        }

        @Override
        public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
            if (!keepInventory)
            {
                TileMacerator furnace = (TileMacerator)worldIn.getTileEntity(pos);
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
            return new TileMacerator();
        }

        @Override
        public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
            worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);

            if (stack.hasDisplayName())
            {
                ((TileMacerator)worldIn.getTileEntity(pos)).setCustomInventoryName(stack.getDisplayName());
            }
        }

        @Override
        public Item getItem(World world, BlockPos pos) {
            return Item.getItemFromBlock(ModBlocks.maceratorIdle);
        }
    }

    public static final class TileMacerator extends TileFurnaceFergo
    {
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

    public static final class ContainerMacerator extends ContainerFurnaceFergo
    {
        public ContainerMacerator(InventoryPlayer invPlayer, IInventory furnace)
        {
            super(invPlayer, furnace);
        }

        @Override
        public void addInventorySlots() {
            this.addSlotToContainer(new Slot(furnace, 0, 62, 22));
            this.addSlotToContainer(new SlotMaceratorFuel(furnace, 1, 42, 22));
            this.addSlotToContainer(new SlotMaceratorOutput(invPlayer.player, furnace, 2, 110, 22));
        }

        @Override
        public void addPlayerInventory() {
            for (int i = 0; i < 3; ++i)
            {
                for (int j = 0; j < 9; ++j)
                {
                    this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 53 + i * 18));
                }
            }

            for (int i = 0; i < 9; ++i)
            {
                this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 111));
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

        public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
        {
            ItemStack itemstack = null;
            Slot slot = (Slot)this.inventorySlots.get(index);

            if (slot != null && slot.getHasStack())
            {
                ItemStack itemstack1 = slot.getStack();
                itemstack = itemstack1.copy();

                if (index == 2)
                {
                    if (!this.mergeItemStack(itemstack1, 3, 39, true))
                    {
                        return null;
                    }

                    slot.onSlotChange(itemstack1, itemstack);
                }
                else if (index != 1 && index != 0)
                {
                    if (MaceratorRecipes.instance().getSmeltingResult(itemstack1) != null)
                    {
                        if (!this.mergeItemStack(itemstack1, 0, 1, false))
                        {
                            return null;
                        }
                    }
                    else if (TileMacerator.isItemFuel(itemstack1))
                    {
                        if (!this.mergeItemStack(itemstack1, 1, 2, false))
                        {
                            return null;
                        }
                    }
                    else if (index >= 3 && index < 30)
                    {
                        if (!this.mergeItemStack(itemstack1, 30, 39, false))
                        {
                            return null;
                        }
                    }
                    else if (index >= 30 && index < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
                    {
                        return null;
                    }
                }
                else if (!this.mergeItemStack(itemstack1, 3, 39, false))
                {
                    return null;
                }

                if (itemstack1.stackSize == 0)
                {
                    slot.putStack((ItemStack)null);
                }
                else
                {
                    slot.onSlotChanged();
                }

                if (itemstack1.stackSize == itemstack.stackSize)
                {
                    return null;
                }

                slot.onPickupFromSlot(playerIn, itemstack1);
            }

            return itemstack;
        }
    }

    public static final class GuiMacerator extends GuiFurnaceFergo
    {
        public GuiMacerator(InventoryPlayer invPlayer, IInventory furnace)
        {
            super(new ContainerMacerator(invPlayer, furnace), invPlayer, furnace);
        }

        @Override
        public void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
            String s = NameHelper.translate(this.furnace.getDisplayName().getUnformattedText());
            fontRendererObj.drawString(s, this.xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
            fontRendererObj.drawString(this.invPlayer.getDisplayName().getUnformattedText(), 8, this.ySize - 126 + 2, 4210752);
        }

        public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
        {
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Textures.maceratorGui);
            int k = (this.width - this.xSize) / 2;
            int l = (this.height - this.ySize) / 2;
            this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);

            if (TileMacerator.isBurning(this.furnace))
            {
                int cookTime = this.getBurnTimeRemainingScaled(13);
                this.drawTexturedModalRect(k + 25, l + 24 + 12 - cookTime, 176, 12 - cookTime, 13, cookTime + 1);
            }

            int scaleAdjustment = this.getCookProgressScaled(24);
            this.drawTexturedModalRect(k + 80, l + 21, 176, 14, scaleAdjustment + 1, 16);
        }
    }

    public static final class SlotMaceratorFuel extends SlotFuelFergo
    {
        public SlotMaceratorFuel(IInventory inventoryIn, int index, int xPosition, int yPosition) {
            super(inventoryIn, index, xPosition, yPosition);
        }

        @Override
        public boolean isItemValid(ItemStack stack) {
            return TileMacerator.isItemFuel(stack) || isBucket(stack);
        }

        @Override
        public int getItemStackLimit(ItemStack stack) {
            return isBucket(stack) ? 1 : super.getItemStackLimit(stack);
        }

        public static boolean isBucket(ItemStack stack) {
            return stack != null && stack.getItem() != null && stack.getItem() == Items.bucket;
        }
    }

    public static final class SlotMaceratorOutput extends SlotOutputFergo
    {
        private EntityPlayer player;
        private int field_75228_b;

        public SlotMaceratorOutput(EntityPlayer player, IInventory inventory, int slotIndex, int xPosition, int yPosition)
        {
            super(inventory, slotIndex, xPosition, yPosition);
            this.player = player;
        }

        public boolean isItemValid(ItemStack stack)
        {
            return false;
        }

        public ItemStack decrStackSize(int amount)
        {
            if (this.getHasStack())
            {
                this.field_75228_b += Math.min(amount, this.getStack().stackSize);
            }

            return super.decrStackSize(amount);
        }

        public void onPickupFromSlot(EntityPlayer playerIn, ItemStack stack)
        {
            this.onCrafting(stack);
            super.onPickupFromSlot(playerIn, stack);
        }

        public void onCrafting(ItemStack stack, int amount)
        {
            this.field_75228_b += amount;
            this.onCrafting(stack);
        }

        public void onCrafting(ItemStack stack)
        {
            stack.onCrafting(this.player.worldObj, this.player, this.field_75228_b);

            if (!this.player.worldObj.isRemote)
            {
                int i = this.field_75228_b;
                float f = MaceratorRecipes.instance().getSmeltingExperience(stack);
                int j;

                if (f == 0.0F)
                {
                    i = 0;
                }
                else if (f < 1.0F)
                {
                    j = MathHelper.floor_float((float) i * f);

                    if (j < MathHelper.ceiling_float_int((float)i * f) && Math.random() < (double)((float)i * f - (float)j))
                    {
                        ++j;
                    }

                    i = j;
                }

                while (i > 0)
                {
                    j = EntityXPOrb.getXPSplit(i);
                    i -= j;
                    this.player.worldObj.spawnEntityInWorld(new EntityXPOrb(this.player.worldObj, this.player.posX, this.player.posY + 0.5D, this.player.posZ + 0.5D, j));
                }
            }

            this.field_75228_b = 0;

            net.minecraftforge.fml.common.FMLCommonHandler.instance().firePlayerSmeltedEvent(player, stack);

            if (stack.getItem() == Items.coal)
            {
                this.player.triggerAchievement(ModAchievements.oreCoal);
            }

            if (stack.getItem() == Items.iron_ingot)
            {
                this.player.triggerAchievement(ModAchievements.oreIron);
            }

            if (stack.getItem() == Items.gold_ingot)
            {
                this.player.triggerAchievement(ModAchievements.oreGold);
            }

            if (stack.getItem() == Items.diamond)
            {
                this.player.triggerAchievement(ModAchievements.oreDiamond);
            }

            if (stack.getItem() == Items.emerald)
            {
                this.player.triggerAchievement(ModAchievements.oreGemEmerald);
            }

            if (stack.getItem() == new ItemStack(Items.dye, 1, 4).getItem())
            {
                this.player.triggerAchievement(ModAchievements.oreLapis);
            }

            if (stack.getItem() == ModItems.shardExp)
            {
                this.player.triggerAchievement(ModAchievements.oreExperience);
            }

            if (stack.getItem() == ModItems.ingotObsidian)
            {
                this.player.triggerAchievement(ModAchievements.oreObsidian);
            }

            if (stack.getItem() == ModItems.gemEmerald)
            {
                this.player.triggerAchievement(ModAchievements.oreGemEmerald);
            }

            if (stack.getItem() == ModItems.gemLapis)
            {
                this.player.triggerAchievement(ModAchievements.oreGemLapis);
            }

            if (stack.getItem() == ModItems.ingotBronze)
            {
                this.player.triggerAchievement(ModAchievements.oreBronze);
            }

            if (stack.getItem() == ModItems.ingotAdamantium)
            {
                this.player.triggerAchievement(ModAchievements.oreAdamantium);
            }

            if (stack.getItem() == ModItems.gemRedstone)
            {
                this.player.triggerAchievement(ModAchievements.oreGemRedstone);
            }
        }
    }
}

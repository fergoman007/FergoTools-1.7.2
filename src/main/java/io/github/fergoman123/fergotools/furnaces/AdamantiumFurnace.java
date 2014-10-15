package io.github.fergoman123.fergotools.furnaces;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.fergoman123.fergoutil.helper.GuiHelper;
import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.reference.*;
import io.github.fergoman123.fergotools.util.base.BlockFurnaceFT;
import io.github.fergoman123.fergotools.util.base.ContainerFT;
import io.github.fergoman123.fergotools.util.base.GuiFT;
import io.github.fergoman123.fergotools.util.base.TileEntityFurnaceFT;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
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
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import java.util.Random;

public class AdamantiumFurnace
{
    public static final class BlockAdamantiumFurnace extends BlockFurnaceFT
    {

        private static boolean keepInventory;

        public BlockAdamantiumFurnace(boolean isActive)
        {
            super(Material.iron, "adamantiumFurnace");
            this.isActive = isActive;
            this.setStepSound(soundTypePiston);
        }

        public Item getItemDropped(int par1, Random rand, int par3)
        {
            return Item.getItemFromBlock(ModBlocks.adamantiumFurnaceIdle);
        }

        public void onBlockAdded(World world, int x, int y, int z)
        {
            super.onBlockAdded(world, x, y, z);
            this.setDefaultDirection(world, x, y, z);
        }

        public void setDefaultDirection(World world, int x, int y, int z)
        {
            if (!world.isRemote) {
                Block a = world.getBlock(x, y, z - 1);
                Block b = world.getBlock(x, y, z + 1);
                Block c = world.getBlock(x - 1, y, z);
                Block d = world.getBlock(x + 1, y, z);
                byte b0 = 3;

                if (a.func_149730_j() && !b.func_149730_j()) {
                    b0 = 3;
                }

                if (b.func_149730_j() && !a.func_149730_j()) {
                    b0 = 2;
                }

                if (c.func_149730_j() && !d.func_149730_j()) {
                    b0 = 5;
                }

                if (d.func_149730_j() && !c.func_149730_j()) {
                    b0 = 4;
                }

                world.setBlockMetadataWithNotify(x, y, z, b0, 2);
            }
        }

        @SideOnly(Side.CLIENT)
        public IIcon getIcon(int par1, int par2)
        {
            if (par2 == 0)
                par2 = 3;
            return par1 == 1 ? this.icons[1] : (par1 == 0 ? this.icons[1] : (par1 != par2 ? this.blockIcon : this.icons[0]));
        }

        public void registerBlockIcons(IIconRegister register)
        {
            this.blockIcon = register.registerIcon(Textures.resourcePrefix + Names.Blocks.blockAdamantium);
            this.icons[0] = register.registerIcon(Reference.textureLoc + (this.isActive ? Names.Blocks.adamantiumFurnaceActive : Names.Blocks.adamantiumFurnaceIdle));
            this.icons[1] = register.registerIcon(Textures.resourcePrefix + Names.Blocks.blockAdamantium);
        }

        public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
        {
            if (world.isRemote)
            {
                return true;
            }
            else if (!player.isSneaking())
            {
                TileEntityAdamantiumFurnace furnace = (TileEntityAdamantiumFurnace)world.getTileEntity(x, y, z);
                if (furnace != null)
                {
                    player.openGui(FergoTools.instance, GuiIds.adamantiumFurnace.ordinal(), world, x, y, z);
                }
                return true;
            }
            else
            {
                return false;
            }
        }

        public static void updateAdamantiumFurnaceBlockState(boolean active, World world, int x, int y, int z)
        {
            int l = world.getBlockMetadata(x, y, z);
            TileEntity tile = world.getTileEntity(x, y, z);
            keepInventory = true;

            if (active)
            {
                world.setBlock(x, y, z, ModBlocks.adamantiumFurnaceActive);
            }
            else
            {
                world.setBlock(x, y, z, ModBlocks.adamantiumFurnaceIdle);
            }

            keepInventory = false;
            world.setBlockMetadataWithNotify(x, y, z, l, 2);

            if (tile != null)
            {
                tile.validate();
                world.setTileEntity(x, y, z, tile);
            }
        }

        public TileEntity createNewTileEntity(World world, int var)
        {
            return new TileEntityAdamantiumFurnace();
        }

        public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase elb, ItemStack stack)
        {
            int l = MathHelper.floor_double((double) (elb.rotationYaw * 4.0f / 360.0) + 0.5D) & 3;

            if (l == 0)
            {
                world.setBlockMetadataWithNotify(x, y, z, 2, 2);
            }

            if (l == 1)
            {
                world.setBlockMetadataWithNotify(x, y, z, 5, 2);
            }

            if (l == 2)
            {
                world.setBlockMetadataWithNotify(x, y, z, 3, 2);
            }

            if (l == 3)
            {
                world.setBlockMetadataWithNotify(x, y, z, 4, 2);
            }

            if (stack.hasDisplayName())
            {
                ((TileEntityAdamantiumFurnace)world.getTileEntity(x, y, z)).setGuiDisplayName(stack.getDisplayName());
            }
        }

        public void breakBlock(World world, int x, int y, int z, Block block, int oldBlock)
        {
            if (!keepInventory)
            {
                TileEntityAdamantiumFurnace furnace = (TileEntityAdamantiumFurnace)world.getTileEntity(x, y, z);

                if (furnace != null)
                {
                    for (int i = 0; i < furnace.getSizeInventory(); ++i)
                    {
                        ItemStack stack = furnace.getStackInSlot(i);

                        if (stack != null)
                        {
                            float f = this.rand.nextFloat() * 0.8F + 0.1F;
                            float f1 = this.rand.nextFloat() * 0.8F + 0.1F;
                            float f2 = this.rand.nextFloat() * 0.8F + 0.1F;

                            while (stack.stackSize > 0)
                            {
                                int j = this.rand.nextInt(21) + 10;

                                if (j > stack.stackSize)
                                {
                                    j = stack.stackSize;
                                }

                                stack.stackSize -= j;
                                EntityItem item = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(stack.getItem(), j, stack.getItemDamage()));

                                if (stack.hasTagCompound())
                                {
                                    item.getEntityItem().setTagCompound((NBTTagCompound)stack.getTagCompound().copy());
                                }

                                float f3 = 0.05F;
                                item.motionX = (double)((float)this.rand.nextGaussian() * f3);
                                item.motionY = (double)((float)this.rand.nextGaussian() * f3 + 0.2F);
                                item.motionZ = (double)((float)this.rand.nextGaussian() * f3);
                                world.spawnEntityInWorld(item);
                            }
                        }
                    }

                    world.func_147453_f(x, y, z, block);
                }
            }
            super.breakBlock(world, x, y, z, block, oldBlock);
        }

        @SideOnly(Side.CLIENT)
        public void randomDisplayTick(World world, int x, int y, int z, Random rand)
        {
            if (this.isActive)
            {
                int l = world.getBlockMetadata(x, y, z);
                float f = (float)x + 0.5F;
                float f1 = (float)y + 0.0F + rand.nextFloat() * 6.0F / 16.0F;
                float f2 = (float)z + 0.5F;
                float f3 = 0.52F;
                float f4 = rand.nextFloat() * 0.6F - 0.3F;

                if (l == 4)
                {
                    world.spawnParticle("smoke", (double) (f - f3), (double) f1, (double) (f2 + f4), 0.0D, 0.0D, 0.0D);
                    world.spawnParticle("flame", (double) (f - f3), (double) f1, (double) (f2 + f4), 0.0D, 0.0D, 0.0D);
                }
                else if (l == 5)
                {
                    world.spawnParticle("smoke", (double) (f + f3), (double) f1, (double) (f2 + f4), 0.0D, 0.0D, 0.0D);
                    world.spawnParticle("flame", (double) (f + f3), (double) f1, (double) (f2 + f4), 0.0D, 0.0D, 0.0D);
                }
                else if (l == 2)
                {
                    world.spawnParticle("smoke", (double) (f + f4), (double) f1, (double) (f2 - f3), 0.0D, 0.0D, 0.0D);
                    world.spawnParticle("flame", (double) (f + f4), (double) f1, (double) (f2 - f3), 0.0D, 0.0D, 0.0D);
                }
                else if (l == 3)
                {
                    world.spawnParticle("smoke", (double) (f + f4), (double) f1, (double) (f2 + f3), 0.0D, 0.0D, 0.0D);
                    world.spawnParticle("flame", (double) (f + f4), (double) f1, (double) (f2 + f3), 0.0D, 0.0D, 0.0D);
                }
            }
        }

        public boolean hasComparatorInputOverride(){return true;}

        public int getComparatorInputOverride(World world, int x, int y, int z, int par5)
        {
            return Container.calcRedstoneFromInventory((IInventory) world.getTileEntity(x, y, z));
        }

        public Item getItem(World world, int x, int y, int z)
        {
            return Item.getItemFromBlock(ModBlocks.adamantiumFurnaceIdle);
        }
    }

    public static final class TileEntityAdamantiumFurnace extends TileEntityFurnaceFT {

        @Override
        public int getSizeInventory(){return this.slots.length;}

        public ItemStack getStackInSlot(int slot){return this.slots[slot];}

        public ItemStack decrStackSize(int par1, int par2)
        {
            if (this.slots[par1] != null)
            {
                ItemStack stack;

                if (this.slots[par1].stackSize <= par2)
                {
                    stack = this.slots[par1];
                    this.slots[par1] = null;
                    return stack;
                }
                else
                {
                    stack = this.slots[par1].splitStack(par2);

                    if (this.slots[par1].stackSize == 0)
                    {
                        this.slots[par1] = null;
                    }

                    return stack;
                }
            }
            else
            {
                return null;
            }
        }

        public ItemStack getStackInSlotOnClosing(int slot)
        {
            if (this.slots[slot] != null)
            {
                ItemStack stack = this.slots[slot];
                this.slots[slot] = null;
                return stack;
            }
            else
            {
                return null;
            }
        }

        public void setInventorySlotContents(int slot, ItemStack stack)
        {
            this.slots[slot] = stack;

            if (stack != null && stack.stackSize > this.getInventoryStackLimit())
            {
                stack.stackSize = this.getInventoryStackLimit();
            }
        }

        public String getInventoryName()
        {
            return this.hasCustomInventoryName() ? this.localizedName : Names.Locale.containerAdamantiumFurnace;
        }

        public boolean hasCustomInventoryName()
        {
            return this.localizedName != null && this.localizedName.length() > 0;
        }

        public void setGuiDisplayName(String displayName)
        {
            this.localizedName = displayName;
        }

        @Override
        public void readFromNBT(NBTTagCompound compound) {
            super.readFromNBT(compound);
            NBTTagList list = compound.getTagList("Items", 10);
            this.slots = new ItemStack[this.getSizeInventory()];

            for (int i = 0; i < list.tagCount(); ++i)
            {
                NBTTagCompound compound1 = list.getCompoundTagAt(i);
                byte b0 = compound1.getByte("Slot");

                if (b0 >= 0 && b0 < this.slots.length)
                {
                    this.slots[b0] = ItemStack.loadItemStackFromNBT(compound1);
                }
            }

            this.burnTime = compound.getShort("BurnTime");
            this.cookTime = compound.getShort("CookTime");
            this.currentItemBurnTime = getItemBurnTime(this.slots[1]);

            if (compound.hasKey("CustomName", 8))
            {
                this.localizedName = compound.getString("CustomName");
            }
        }

        @Override
        public void writeToNBT(NBTTagCompound compound) {
            super.writeToNBT(compound);
            compound.setShort("BurnTime", (short)this.burnTime);
            compound.setShort("CookTime", (short)this.cookTime);
            NBTTagList list = new NBTTagList();

            for (int i = 0; i < this.slots.length; ++i)
            {
                if (this.slots[i] != null)
                {
                    NBTTagCompound compound1 = new NBTTagCompound();
                    compound1.setByte("Slot", (byte)i);
                    this.slots[i].writeToNBT(compound1);
                    list.appendTag(compound1);
                }
            }

            compound.setTag("Items", list);

            if (this.hasCustomInventoryName())
            {
                compound.setString("CustomName", this.localizedName);
            }
        }

        public int getInventoryStackLimit()
        {
            return inventoryStackLimit;
        }

        @SideOnly(Side.CLIENT)
        public int getCookProgressScaled(int speed)
        {
            return this.cookTime * speed / Ints.Furnace.adamantiumFurnaceSpeed;
        }

        @SideOnly(Side.CLIENT)
        public int getBurnTimeRemainingScaled(int speed)
        {
            if (this.currentItemBurnTime == 0)
            {
                this.currentItemBurnTime = Ints.Furnace.adamantiumFurnaceSpeed;
            }

            return this.burnTime * speed / this.currentItemBurnTime;
        }

        public boolean isBurning(){return this.burnTime > 0;}

        public void updateEntity()
        {
            boolean flag = this.burnTime > 0;
            boolean flag1 = false;

            if (this.burnTime > 0)
            {
                --this.burnTime;
            }

            if (!this.worldObj.isRemote)
            {
                if (this.burnTime == 0 && this.canSmelt())
                {
                    this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.slots[1]);

                    if (this.burnTime > 0)
                    {
                        flag1 = true;

                        if (this.slots[1] != null)
                        {
                            --this.slots[1].stackSize;

                            if (this.slots[1].stackSize == 0)
                            {
                                this.slots[1] = slots[1].getItem().getContainerItem(slots[1]);
                            }
                        }
                    }
                }

                if (this.isBurning() && this.canSmelt())
                {
                    ++this.cookTime;

                    if (this.cookTime == Ints.Furnace.adamantiumFurnaceSpeed)
                    {
                        this.cookTime = 0;
                        this.smeltItem();
                        flag1 = true;
                    }
                }
                else
                {
                    this.cookTime = 0;
                }

                if (flag != this.burnTime > 0)
                {
                    flag1 = true;
                    BlockAdamantiumFurnace.updateAdamantiumFurnaceBlockState(this.burnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
                }
            }

            if (flag1)
            {
                this.markDirty();
            }
        }

        public boolean canSmelt()
        {
            if (this.slots[0] == null)
            {
                return false;
            }
            else
            {
                ItemStack stack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);
                if (stack == null)return false;
                if (this.slots[2] == null)return true;
                if (!this.slots[2].isItemEqual(stack))return false;
                int result = slots[2].stackSize + stack.stackSize;
                return (result <= getInventoryStackLimit() && result <= this.slots[2].getMaxStackSize());
            }
        }

        public void smeltItem()
        {
            if (this.canSmelt())
            {
                ItemStack stack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);

                if (this.slots[2] == null)
                {
                    this.slots[2] = stack.copy();
                }
                else if (this.slots[2].getItem() == stack.getItem())
                {
                    this.slots[2].stackSize += stack.stackSize;
                }

                --this.slots[0].stackSize;

                if (this.slots[0].stackSize <= 0)
                {
                    this.slots[0] = null;
                }
            }
        }

        public static int getItemBurnTime(ItemStack stack)
        {
            if (stack == null)
            {
                return 0;
            }
            else
            {
                Item item = stack.getItem();

                if (item instanceof ItemBlock && Block.getBlockFromItem(item) != null)
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

                if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD"))return 200;
                if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD"))return 200;
                if (item instanceof ItemHoe && ((ItemHoe)item).getToolMaterialName().equals("WOOD"))return 200;
                if (item == Items.stick)return 100;
                if (item == Items.coal)return 1600;
                if (item == Items.lava_bucket)return 20000;
                if (item == Item.getItemFromBlock(Blocks.sapling))return 100;
                if (item == Items.blaze_rod)return 2400;
                return GameRegistry.getFuelValue(stack);
            }
        }

        public static boolean isItemFuel(ItemStack stack)
        {
            return getItemBurnTime(stack) > 0;
        }

        public boolean isUseableByPlayer(EntityPlayer player)
        {
            return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : player.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
        }

        public void openInventory(){}

        public void closeInventory(){}

        @Override
        public boolean isItemValidForSlot(int slot, ItemStack stack) {
            return slot == 2 ? false : (slot == 1 ? isItemFuel(stack) : true);
        }

        @Override
        public int[] getAccessibleSlotsFromSide(int slot) {
            return slot == 0 ? slotsBottom : (slot == 1 ? slotsTop : slotsSides);
        }

        @Override
        public boolean canInsertItem(int par1, ItemStack stack, int par3) {
            return this.isItemValidForSlot(par1, stack);
        }

        @Override
        public boolean canExtractItem(int par1, ItemStack stack, int par3) {
            return par3 != 0 || par1 != 1 || stack.getItem() == Items.bucket;
        }
    }

    @SideOnly(Side.CLIENT)
    public static final class GuiAdamantiumFurnace extends GuiFT
    {
        private TileEntityAdamantiumFurnace adamantiumFurnace;

        public GuiAdamantiumFurnace(InventoryPlayer par1InventoryPlayer, TileEntityAdamantiumFurnace par2TileEntityFurnace)
        {
            super(new ContainerAdamantiumFurnace(par1InventoryPlayer, par2TileEntityFurnace));
            adamantiumFurnace = par2TileEntityFurnace;
        }

        public void drawGuiContainerForegroundLayer(int par1, int par2)
        {
            String s = adamantiumFurnace.hasCustomInventoryName() ? adamantiumFurnace.getInventoryName() : GuiHelper.format(adamantiumFurnace.getInventoryName());
            fontRendererObj.drawString(s, xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
            fontRendererObj.drawString(GuiHelper.format(Names.Locale.containerInventory), 8, ySize - 96 + 2, 4210752);
        }

        public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GuiHelper.bindTexture(Textures.adamantiumFurnaceGuiTexture);
            int k = (width - xSize) / 2;
            int l = (height - ySize) / 2;
            drawTexturedModalRect(k, l, 0, 0, xSize, ySize);
            int i1;

            if (adamantiumFurnace.isBurning())
            {
                i1 = adamantiumFurnace.getBurnTimeRemainingScaled(12);
                drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
            }

            i1 = adamantiumFurnace.getCookProgressScaled(24);
            drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
        }
    }

    public static final class ContainerAdamantiumFurnace extends ContainerFT
    {
        private int lastCookTime;
        private int lastBurnTime;
        private int lastItemBurnTime;

        private TileEntityAdamantiumFurnace adamantiumFurnace;

        public ContainerAdamantiumFurnace(InventoryPlayer par1InventoryPlayer, TileEntityAdamantiumFurnace par2TileEntityFurnaceTutorial)
        {
            adamantiumFurnace = par2TileEntityFurnaceTutorial;
            this.addSlotToContainer(new Slot(par2TileEntityFurnaceTutorial, 0, 56, 17));
            this.addSlotToContainer(new Slot(par2TileEntityFurnaceTutorial, 1, 56, 53));
            this.addSlotToContainer(new SlotFurnace(par1InventoryPlayer.player, par2TileEntityFurnaceTutorial, 2, 116, 35));
            int i;

            for (i = 0; i < 3; ++i)
            {
                for (int j = 0; j < 9; ++j)
                {
                    this.addSlotToContainer(new Slot(par1InventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
                }
            }

            for (i = 0; i < 9; ++i)
            {
                this.addSlotToContainer(new Slot(par1InventoryPlayer, i, 8 + i * 18, 142));
            }
        }

        public void addCraftingToCrafters(ICrafting par1ICrafting)
        {
            super.addCraftingToCrafters(par1ICrafting);
            par1ICrafting.sendProgressBarUpdate(this, 0, this.adamantiumFurnace.cookTime);
            par1ICrafting.sendProgressBarUpdate(this, 1, this.adamantiumFurnace.burnTime);
            par1ICrafting.sendProgressBarUpdate(this, 2, this.adamantiumFurnace.currentItemBurnTime);
        }

        /**
         * Looks for changes made in the container, sends them to every listener.
         */
        public void detectAndSendChanges()
        {
            super.detectAndSendChanges();

            for (int i = 0; i < this.crafters.size(); ++i)
            {
                ICrafting icrafting = (ICrafting)this.crafters.get(i);

                if (this.lastCookTime != this.adamantiumFurnace.cookTime)
                {
                    icrafting.sendProgressBarUpdate(this, 0, this.adamantiumFurnace.cookTime);
                }

                if (this.lastBurnTime != this.adamantiumFurnace.burnTime)
                {
                    icrafting.sendProgressBarUpdate(this, 1, this.adamantiumFurnace.burnTime);
                }

                if (this.lastItemBurnTime != this.adamantiumFurnace.currentItemBurnTime)
                {
                    icrafting.sendProgressBarUpdate(this, 2, this.adamantiumFurnace.currentItemBurnTime);
                }
            }

            this.lastCookTime = this.adamantiumFurnace.cookTime;
            this.lastBurnTime = this.adamantiumFurnace.burnTime;
            this.lastItemBurnTime = this.adamantiumFurnace.currentItemBurnTime;
        }

        @SideOnly(Side.CLIENT)
        public void updateProgressBar(int par1, int par2)
        {
            if (par1 == 0)
            {
                this.adamantiumFurnace.cookTime = par2;
            }

            if (par1 == 1)
            {
                this.adamantiumFurnace.burnTime = par2;
            }

            if (par1 == 2)
            {
                this.adamantiumFurnace.currentItemBurnTime = par2;
            }
        }

        public boolean canInteractWith(EntityPlayer par1EntityPlayer)
        {
            return this.adamantiumFurnace.isUseableByPlayer(par1EntityPlayer);
        }

        /**
         * Called when a player shift-clicks on a slot. You must override this or you will crash when someone does that.
         */
        public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
        {
            ItemStack itemstack = null;
            Slot slot = (Slot)this.inventorySlots.get(par2);

            if (slot != null && slot.getHasStack())
            {
                ItemStack itemstack1 = slot.getStack();
                itemstack = itemstack1.copy();

                if (par2 == 2)
                {
                    if (!this.mergeItemStack(itemstack1, 3, 39, true))
                    {
                        return null;
                    }

                    slot.onSlotChange(itemstack1, itemstack);
                }
                else if (par2 != 1 && par2 != 0)
                {
                    if (FurnaceRecipes.smelting().getSmeltingResult(itemstack1) != null)
                    {
                        if (!this.mergeItemStack(itemstack1, 0, 1, false))
                        {
                            return null;
                        }
                    }
                    else if (TileEntityAdamantiumFurnace.isItemFuel(itemstack1))
                    {
                        if (!this.mergeItemStack(itemstack1, 1, 2, false))
                        {
                            return null;
                        }
                    }
                    else if (par2 >= 3 && par2 < 30)
                    {
                        if (!this.mergeItemStack(itemstack1, 30, 39, false))
                        {
                            return null;
                        }
                    }
                    else if (par2 >= 30 && par2 < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
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

                slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
            }

            return itemstack;
        }
    }

}

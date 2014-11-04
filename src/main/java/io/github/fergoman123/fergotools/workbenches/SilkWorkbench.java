package io.github.fergoman123.fergotools.workbenches;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.reference.GuiIds;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.ItemBlockFT;
import io.github.fergoman123.fergotools.util.base.workbench.BlockWorkbenchFT;
import io.github.fergoman123.fergotools.util.base.workbench.ContainerWorkbenchFT;
import io.github.fergoman123.fergotools.util.base.workbench.GuiWorkbenchFT;
import io.github.fergoman123.fergoutil.helper.GLHelper;
import io.github.fergoman123.fergoutil.helper.GuiHelper;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;

public class SilkWorkbench
{
    public static final class BlockSilkWorkbench extends BlockWorkbenchFT
    {

        public BlockSilkWorkbench(String blockName) {
            super(blockName);
        }

        public IIcon getIcon(int side, int meta)
        {
            return side == 1 ? this.topIcon : (side == 0 ? this.bottomIcon : (side != 2 && side != 4 ? this.blockIcon : this.frontIcon));
        }

        @Override
        public void registerBlockIcons(IIconRegister register) {
            this.blockIcon = register.registerIcon(Textures.silkWorkbenchTextures[0]);
            this.topIcon = register.registerIcon(Textures.silkWorkbenchTextures[1]);
            this.frontIcon = register.registerIcon(Textures.silkWorkbenchTextures[2]);
            this.bottomIcon = register.registerIcon(Textures.plankSilk);
        }

        @Override
        public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
            if (world.isRemote)
            {
                return true;
            }
            else if (!player.isSneaking())
            {
                player.openGui(FergoTools.getInstance(), GuiIds.silkWorkbench.ordinal(), world, x, y, z);
                return true;
            }
            else
            {
                return false;
            }
        }

        @Override
        public Item getItemDropped(int metadata, Random rand, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class ContainerSilkWorkbench extends ContainerWorkbenchFT implements ContainerWorkbenchFT.IContainerWorkbenchFT
    {
        public ContainerSilkWorkbench(InventoryPlayer inventory, World world, int x, int y, int z)
        {
            super(inventory, world, x, y, z);
            this.world = world;
            this.x = x;
            this.y = y;
            this.z = z;
            this.addSlotToContainer(new SlotCrafting(inventory.player, this.craftMatrix, this.craftResult, 0, 124, 35));
            int l;
            int i1;

            for (l = 0; l < 3; ++l) {
                for (i1 = 0; i1 < 3; ++i1) {
                    this.addSlotToContainer(new Slot(this.craftMatrix, i1 + l * 3, 30 + i1 * 18, 17 + l * 18));
                }
            }

            for (l = 0; l < 3; ++l) {
                for (i1 = 0; i1 < 9; ++i1) {
                    this.addSlotToContainer(new Slot(inventory, i1 + l * 9 + 9, 8 + i1 * 18, 84 + l * 18));
                }
            }

            for (l = 0; l < 9; ++l) {
                this.addSlotToContainer(new Slot(inventory, l, 8 + l * 18, 142));
            }

            this.onCraftMatrixChanged(this.craftMatrix);
        }

        public void onCraftMatrixChanged(IInventory inventory)
        {
            this.craftResult.setInventorySlotContents(0, CraftingManager.getInstance().findMatchingRecipe(this.craftMatrix, this.world));
        }

        public void onContainerClosed(EntityPlayer player)
        {
            super.onContainerClosed(player);

            if (!world.isRemote)
            {
                for (int i = 0; i < 9; ++i)
                {
                    ItemStack stack = this.craftMatrix.getStackInSlotOnClosing(i);
                    if (stack != null)
                    {
                        player.dropPlayerItemWithRandomChoice(stack, false);
                    }
                }
            }
        }

        public boolean canInteractWith(EntityPlayer player)
        {
            return true;
        }

        public ItemStack transferStackInSlot(EntityPlayer player, int slotIndex) {
            ItemStack itemstack = null;
            Slot slot = (Slot) this.inventorySlots.get(slotIndex);

            if (slot != null && slot.getHasStack()) {
                ItemStack itemstack1 = slot.getStack();
                itemstack = itemstack1.copy();

                if (slotIndex == 0) {
                    if (!this.mergeItemStack(itemstack1, 10, 46, true)) {
                        return null;
                    }

                    slot.onSlotChange(itemstack1, itemstack);
                } else if (slotIndex >= 10 && slotIndex < 37) {
                    if (!this.mergeItemStack(itemstack1, 37, 46, false)) {
                        return null;
                    }
                } else if (slotIndex >= 37 && slotIndex < 46) {
                    if (!this.mergeItemStack(itemstack1, 10, 37, false)) {
                        return null;
                    }
                } else if (!this.mergeItemStack(itemstack1, 10, 46, false)) {
                    return null;
                }

                if (itemstack1.stackSize == 0) {
                    slot.putStack((ItemStack) null);
                } else {
                    slot.onSlotChanged();
                }

                if (itemstack1.stackSize == itemstack.stackSize) {
                    return null;
                }

                slot.onPickupFromSlot(player, itemstack1);
            }

            return itemstack;
        }
    }

    public static final class GuiSilkWorkbench extends GuiWorkbenchFT
    {
        public GuiSilkWorkbench(InventoryPlayer inventory, World world, int x, int y, int z)
        {
            super(new ContainerSilkWorkbench(inventory, world, x, y, z));
        }

        @Override
        public void drawGuiContainerForegroundLayer(int par1, int par2) {
            this.fontRendererObj.drawString(I18n.format(Locale.containerSilkWorkbench, new Object[0]), 28, 6, 4210752);
            this.fontRendererObj.drawString(I18n.format(Locale.containerInventory, new Object[0]), 8, this.ySize - 96 + 2, 4210752);
        }

        @Override
        public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
            GLHelper.glColor4f(1f, 1f, 1f, 1f);
            GuiHelper.bindTexture(Textures.silkWorkbenchGuiTexture);
            int k = (width - xSize) / 2;
            int l = (height - ySize) / 2;
            drawTexturedModalRect(k, l, 0, 0, xSize, ySize);
        }
    }
}

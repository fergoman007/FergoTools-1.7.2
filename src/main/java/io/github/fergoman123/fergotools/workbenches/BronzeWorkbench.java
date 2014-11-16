package io.github.fergoman123.fergotools.workbenches;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.reference.GuiIds;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.workbench.BlockWorkbenchFT;
import io.github.fergoman123.fergotools.util.base.workbench.ContainerWorkbenchFT;
import io.github.fergoman123.fergotools.util.base.workbench.GuiWorkbenchFT;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import java.util.Random;

public class BronzeWorkbench
{
    public static final class BlockBronzeWorkbench extends BlockWorkbenchFT
    {

        public BlockBronzeWorkbench(String blockName) {
            super(blockName);
        }

        public IIcon getIcon(int side, int meta)
        {
            return side == 1 ? this.topIcon : (side == 0 ? this.bottomIcon : (side != 2 && side != 4 ? this.blockIcon : this.frontIcon));
        }

        public void registerBlockIcons(IIconRegister register)
        {
            this.blockIcon = register.registerIcon(Textures.bronzeWorkbenchTextures[0]);
            this.topIcon = register.registerIcon(Textures.bronzeWorkbenchTextures[1]);
            this.frontIcon = register.registerIcon(Textures.bronzeWorkbenchTextures[2]);
            this.bottomIcon = register.registerIcon(Textures.plankBronze);
        }

        @Override
        public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
            if (world.isRemote)
            {
                return true;
            }
            else if (!player.isSneaking())
            {
                player.openGui(FergoTools.getInstance(), GuiIds.bronzeWorkbench.ordinal(), world, x, y, z);
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

    public static final class ContainerBronzeWorkbench extends ContainerWorkbenchFT implements ContainerWorkbenchFT.IContainerWorkbenchFT
    {

        public ContainerBronzeWorkbench(InventoryPlayer inventory, World world, int x, int y, int z) {
            super(inventory, world, x, y, z);
            this.world = world;
            this.x = x;
            this.y = y;
            this.z = z;
            this.addSlotToContainer(new SlotCrafting(inventory.player, this.craftMatrix, this.craftResult, 0, 124, 35));
            int l;
            int i1;

            for (l = 0; l < 3; ++l)
            {
                for (i1 = 0; i1 < 3; ++i1)
                {
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

        @Override
        public void onCraftMatrixChanged(IInventory inventory) {
            this.craftResult.setInventorySlotContents(0, CraftingManager.getInstance().findMatchingRecipe(this.craftMatrix, this.world));
        }

        public void onContainerClosed(EntityPlayer player)
        {
            super.onContainerClosed(player);

            if (!this.world.isRemote)
            {
                for (int i = 0; i < 9; i++)
                {
                    ItemStack stack = this.craftMatrix.getStackInSlotOnClosing(i);
                    if (stack != null)
                    {
                        player.dropPlayerItemWithRandomChoice(stack, false);
                    }
                }
            }
        }

        @Override
        public boolean canInteractWith(EntityPlayer p_75145_1_) {
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

    public static final class GuiBronzeWorkbench extends GuiWorkbenchFT
    {
        public GuiBronzeWorkbench(InventoryPlayer inventory, World world, int x, int y, int z)
        {
            super(new ContainerBronzeWorkbench(inventory, world, x, y, z));
        }

        public void drawGuiContainerForegroundLayer(int par1, int par2)
        {
            this.fontRendererObj.drawString(I18n.format(Locale.containerBronzeWorkbench, new Object[0]), 28, 6, 4210752);
            this.fontRendererObj.drawString(I18n.format(Locale.containerInventory, new Object[0]), 8, this.ySize - 96 + 2, 4210752);
        }

        public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
        {
            GL11.glColor4f(1f, 1f, 1f, 1f);
            this.mc.getTextureManager().bindTexture(Textures.bronzeWorkbenchGuiTexture);
            int k = (this.width - this.xSize) / 2;
            int l = (this.height - this.ySize) / 2;
            drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        }
    }
}

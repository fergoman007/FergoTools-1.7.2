package io.github.fergoman123.fergotools.item.tool;

import com.google.common.collect.Multimap;
import io.github.fergoman123.fergotools.item.ItemFT;
import io.github.fergoman123.fergotools.tab.CTFT;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSwordFT extends ItemFT {
    private float attackDamage;
    private final ToolMaterial material;

    public ItemSwordFT(ToolMaterial material, String name) {
        super(CTFT.tabFergoTools, name);
        this.material = material;
        setMaxStackSize(1);
        setMaxDamage(material.getMaxUses());
        this.setCreativeTab(CTFT.tabFergoTools);
        this.attackDamage = 4.0f + material.getDamageVsEntity();
        this.setUnlocalizedName(name);
    }

    public float getDamageVsEntity() {
        return this.material.getDamageVsEntity();
    }

    public float getStrVsEntity(ItemStack stack, Block block) {
        if (block == Blocks.web) {
            return 15.0f;
        } else {
            Material material = block.getMaterial();
            return material != Material.plants && material != Material.vine && material != Material.coral && material != Material.leaves && material != Material.gourd ? 1.0f : 1.5f;
        }
    }

    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        stack.damageItem(1, attacker);
        return true;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, Block blockIn, BlockPos pos, EntityLivingBase playerIn) {
        if ((double) blockIn.getBlockHardness(worldIn, pos) != 0.0d) {
            stack.damageItem(2, playerIn);
        }
        return true;
    }

    @Override
    public boolean isFull3D() {
        return true;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.BLOCK;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return 72000;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
        playerIn.setItemInUse(itemStackIn, this.getMaxItemUseDuration(itemStackIn));
        return itemStackIn;
    }

    @Override
    public boolean canHarvestBlock(Block blockIn) {
        return blockIn == Blocks.web;
    }

    @Override
    public int getItemEnchantability() {
        return this.material.getEnchantability();
    }

    public String getToolMaterialName() {
        return this.material.toString();
    }

    public ToolMaterial getToolMaterial() {
        return this.material;
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = this.material.getRepairItemStack();
        return mat != null && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
    }

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(ItemStack stack) {
        Multimap<String, AttributeModifier> multimap = super.getAttributeModifiers(stack);
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(itemModifierUUID, "Weapon modifier", (double) this.attackDamage, 0));
        return multimap;
    }
}

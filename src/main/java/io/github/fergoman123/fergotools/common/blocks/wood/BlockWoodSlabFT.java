package io.github.fergoman123.fergotools.common.blocks.wood;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.api.content.WoodTypes;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergoutil.block.BlockSlabFergo;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public abstract class BlockWoodSlabFT extends BlockSlabFergo
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", WoodTypes.class);

    public BlockWoodSlabFT(String name) {
        super(Material.wood, 0, FergoTools.tabFergoTools, name);
        IBlockState state = this.blockState.getBaseState();

        if (!this.isDouble())
        {
            state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
        }

        this.setDefaultState(state.withProperty(VARIANT, WoodTypes.obsidian));
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(ModBlocks.singleSlabFT);
    }

    @Override
    public Item getItem(World worldIn, BlockPos pos) {
        return Item.getItemFromBlock(ModBlocks.singleSlabFT);
    }

    @Override
    public String getUnlocalizedName(int meta) {
        return super.getUnlocalizedName() + "." + WoodTypes.byMetadata(meta).getName();
    }

    @Override
    public IProperty getVariantProperty() {
        return VARIANT;
    }

    public Object getVariant(ItemStack stack) {
        return WoodTypes.byMetadata(stack.getItemDamage());
    }

    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        list.add(new ItemStack(itemIn, 1, WoodTypes.obsidian.getMeta()));
        list.add(new ItemStack(itemIn, 1, WoodTypes.emerald.getMeta()));
        list.add(new ItemStack(itemIn, 1, WoodTypes.lapis.getMeta()));
        list.add(new ItemStack(itemIn, 1, WoodTypes.bronze.getMeta()));
        list.add(new ItemStack(itemIn, 1, WoodTypes.coal.getMeta()));
        list.add(new ItemStack(itemIn, 1, WoodTypes.glowstone.getMeta()));
        list.add(new ItemStack(itemIn, 1, WoodTypes.adamantium.getMeta()));
        list.add(new ItemStack(itemIn, 1, WoodTypes.silk.getMeta()));
        list.add(new ItemStack(itemIn, 1, WoodTypes.redstone.getMeta()));
    }

    public int getMetaFromState(IBlockState state)
    {
        byte b0 = 0;
        int i = b0 | ((WoodTypes)state.getValue(VARIANT)).getMeta();

        if (!this.isDouble() && state.getValue(HALF) == EnumBlockHalf.TOP)
        {
            i |= 8;
        }

        return i;
    }

    @Override
    protected BlockState createBlockState() {
        return this.isDouble() ? new BlockState(this, VARIANT) : new BlockState(this, HALF, VARIANT);
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((WoodTypes)state.getValue(VARIANT)).getMeta();
    }
}

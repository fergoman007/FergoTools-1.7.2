package io.github.fergoman123.fergotools.common.blocks.wood;

import java.util.List;
import java.util.Random;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.api.content.WoodTypes;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.BlockSlab;
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

public abstract class BlockWoodSlabFT extends BlockSlab
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", WoodTypes.class);
    private String[] subNames;

    public BlockWoodSlabFT(String[] subNames, String name) {
    	super(Material.wood);
    	this.subNames = subNames;
    	this.setCreativeTab(FergoTools.tabFergoTools);
//        super(Material.wood, 0, FergoTools.tabFergoTools, name);
        IBlockState state = this.blockState.getBaseState();

        if (!this.isDouble())
        {
            state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
        }

        this.setDefaultState(state.withProperty(VARIANT, WoodTypes.obsidian));
        this.subNames = subNames;
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
    public IProperty getVariantProperty() {
        return VARIANT;
    }

    public Object getVariant(ItemStack stack) {
        return WoodTypes.byMetadata(stack.getItemDamage());
    }

    @Override
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        for (WoodTypes type : WoodTypes.values()){
            list.add(new ItemStack(itemIn, 1, type.getMeta()));
        }
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

    public String[] getSubNames() {
        return subNames;
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((WoodTypes)state.getValue(VARIANT)).getMeta();
    }
    
    public String getUnlocalizedName(){
    	return String.format("tile.ft.%s", NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }
}

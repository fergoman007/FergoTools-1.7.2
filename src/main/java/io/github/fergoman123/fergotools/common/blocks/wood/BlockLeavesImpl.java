package io.github.fergoman123.fergotools.common.blocks.wood;

import io.github.fergoman123.fergotools.api.base.BlockBases.BlockLeavesFT;
import io.github.fergoman123.fergotools.api.content.WoodTypes;
import net.minecraft.block.Block;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlockLeavesImpl extends BlockLeavesFT {

    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", WoodTypes.class);

    public BlockLeavesImpl(String name) {
        super(name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, WoodTypes.obsidian).withProperty(checkDecay, true).withProperty(decayable, true));
    }

    @SideOnly(Side.CLIENT)
    public int getRenderColor(IBlockState state) {
        if (state.getBlock() != this) {
            return super.getRenderColor(state);
        } else {
            return ColorizerFoliage.getFoliageColorBasic();
        }
    }

    @Override
    public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass) {
        return ColorizerFoliage.getFoliageColorBasic();
    }

    @Override
	public void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {
        if (worldIn.rand.nextInt(chance) == 0) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.apple, 1, 0));
        }
    }

    @Override
	public int getSaplingDropChance(IBlockState state) {
        return 20;
    }

    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        for (WoodTypes type : WoodTypes.values()) {
            list.add(new ItemStack(itemIn, 1, type.getMeta()));
        }
    }

    @Override
    protected BlockState createBlockState() {
        return new BlockState(this, VARIANT, checkDecay, decayable);
    }

    @Override
    protected ItemStack createStackedBlock(IBlockState state) {
        return new ItemStack(Item.getItemFromBlock(this), 1, ((WoodTypes) state.getValue(VARIANT)).getMeta());
    }

    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(VARIANT, this.getWoodType(meta)).withProperty(decayable, (meta & 4) == 0).withProperty(decayable, (meta & 8) > 0);
    }

    public int getMetaFromState(IBlockState state)
    {
        byte b0 = 0;
        int i = b0 | ((WoodTypes)state.getValue(VARIANT)).getMeta();

        if (!(Boolean)state.getValue(decayable))
        {
            i |= 4;
        }

        if ((Boolean)state.getValue(decayable))
        {
            i |= 8;
        }

        return i;
    }

    public WoodTypes getWoodType(int meta)
    {
        return WoodTypes.byMetadata(meta);
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((WoodTypes)state.getValue(VARIANT)).getMeta();
    }

    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te)
    {
        if (!worldIn.isRemote && player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == Items.shears)
        {
            player.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
            spawnAsEntity(worldIn, pos, new ItemStack(Item.getItemFromBlock(this), 1, ((WoodTypes)state.getValue(VARIANT)).getMeta()));
        }
        else
        {
            super.harvestBlock(worldIn, player, pos, state, te);
        }
    }

    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
        IBlockState state = world.getBlockState(pos);
        return new ArrayList(Arrays.asList(new ItemStack(this, 1, ((WoodTypes) state.getValue(VARIANT)).getMeta())));
    }

	@Override
	public Block getBlock() {
		// TODO Auto-generated method stub
		return null;
	}
}

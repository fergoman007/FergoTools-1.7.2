package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.block.BlockWorkbenchFT;
import io.github.fergoman123.fergotools.helper.FTHelper;
import io.github.fergoman123.fergotools.reference.GuiIds;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockGlowstoneWorkbench extends BlockWorkbenchFT {

	public BlockGlowstoneWorkbench(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumFacing side, float hitX, float hitY, float hitZ) {
		if(!worldIn.isRemote && !playerIn.isSneaking()){
			FTHelper.openGui(playerIn, GuiIds.glowstoneWorkbench, worldIn, pos);
			return true;
		} else {
			return false;
		}
	}

}

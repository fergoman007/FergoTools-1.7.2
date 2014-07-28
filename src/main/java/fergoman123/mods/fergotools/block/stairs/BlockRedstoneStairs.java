package fergoman123.mods.fergotools.block.stairs;

import fergoman123.mods.fergotools.block.storage.BlockRedstoneCrystal;
import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.reference.Reference;
import fergoman123.mods.fergotools.util.base.BlockStairsFT;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockRedstoneStairs extends BlockStairsFT
{
    public BlockRedstoneStairs() {
        super(ModBlocks.blockRedstoneCrystal);
        this.setBlockName(Names.Blocks.blockRedstoneStairs);
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        this.blockIcon = register.registerIcon(Reference.textureLoc + Names.Blocks.blockRedstoneCrystal);
    }
}

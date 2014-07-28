package fergoman123.mods.fergotools.block.stairs;

import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.reference.Reference;
import fergoman123.mods.fergotools.util.base.BlockStairsFT;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockLapisStairs extends BlockStairsFT
{
    public BlockLapisStairs()
    {
        super(ModBlocks.blockLapisCrystal);
        this.setBlockName(Names.Blocks.blockLapisStairs);
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        this.blockIcon = register.registerIcon(Reference.textureLoc + Names.Blocks.blockLapisCrystal);
    }
}

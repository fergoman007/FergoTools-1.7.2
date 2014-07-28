package fergoman123.mods.fergotools.block.stairs;

import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.BlockStairsFT;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockEmeraldStairs extends BlockStairsFT
{
    public BlockEmeraldStairs()
    {
        super(ModBlocks.blockEmeraldCrystal);
        this.setBlockName(Names.Blocks.blockEmeraldStairs);
    }

    public void registerBlockIcons(IIconRegister register)
    {
        this.blockIcon = register.registerIcon(Names.Blocks.blockEmeraldCrystal);
    }
}

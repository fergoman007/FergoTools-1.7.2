package fergoman123.mods.fergotools.util.base;

import fergoman123.mods.fergotools.creativetab.CreativeTabsFergoTools;
import fergoman123.mods.fergotools.reference.Reference;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IIconRegister;

public abstract class BlockStairsFT extends BlockStairs{

    public BlockStairsFT(Block block) {
        super(block, 1);
        this.setHardness(2.5f);
        this.setResistance(50f);
        this.setCreativeTab(CreativeTabsFergoTools.tabFergoBlocks);
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public abstract void registerBlockIcons(IIconRegister register);
}

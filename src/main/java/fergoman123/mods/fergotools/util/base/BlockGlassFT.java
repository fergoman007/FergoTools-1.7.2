package fergoman123.mods.fergotools.util.base;

import fergoman123.mods.fergotools.lib.Reference;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;

import java.util.Random;

public abstract class BlockGlassFT extends BlockBreakable
{
    public BlockGlassFT()
    {
        super("glass", Material.glass, false);
        setCreativeTab(Tabs.tabFergoBlocks);
        setHardness(0.3f);
        setResistance(50f);
        setStepSound(Block.soundTypeGlass);
    }

    public int quantityDropped(Random rand){
       return  1;
    }

    public boolean isOpaqueCube(){return false;}

    public boolean renderAsNormalBlock(){
        return false;
    }

    public String getUnlocalizedName()
    {
        return NameHelper.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
}

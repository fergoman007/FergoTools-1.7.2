package fergoman123.mods.fergotools.util.base;

import fergoman123.mods.fergotools.reference.Reference;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

import java.util.Random;

public abstract class BlockFurnaceFT extends BlockContainer
{
    public boolean isActive;

    public IIcon[] icons = new IIcon[2];
    public final Random rand = new Random();


    public BlockFurnaceFT(Material material, String furnaceType) {
        super(material);
        this.setBlockName(furnaceType);
        this.setHardness(2.5f);
        this.setResistance(2000f);
        this.setStepSound(Block.soundTypeMetal);
    }

    public String getUnlocalizedName()
    {
        return NameHelper.format("tile.%s%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()), NameHelper.getFurnaceType(this.isActive));
    }
}

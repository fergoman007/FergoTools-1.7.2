package fergoman123.mods.fergotools.util;

import fergoman123.mods.fergotools.lib.Reference;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public abstract class BlockFurnaceFT extends BlockContainer{


    public BlockFurnaceFT(Material material) {
        super(material);
        this.setHardness(3.5f);
        this.setResistance(2000f);
        this.setStepSound(Block.soundTypeMetal);
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
}

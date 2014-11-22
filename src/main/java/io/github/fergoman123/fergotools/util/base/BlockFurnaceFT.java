package io.github.fergoman123.fergotools.util.base;


import io.github.fergoman123.fergotools.reference.Reference;

import io.github.fergoman123.fergoutil.block.BlockFergoFurnace;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.material.Material;

public abstract class BlockFurnaceFT extends BlockFergoFurnace
{
    /**
     * base class for furnace
     * @param isActive whether or not the furnace is active
     * @param material the block material
     * @param furnaceType the name of the furnace
     */
    public BlockFurnaceFT(boolean isActive, Material material, String furnaceType) {
        super(isActive, material, furnaceType);
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()), NameHelper.getFurnaceType(this.isActive));
    }
}

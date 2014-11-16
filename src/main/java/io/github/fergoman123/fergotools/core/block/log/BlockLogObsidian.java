package io.github.fergoman123.fergotools.core.block.log;

import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.util.base.BlockRotatedPillarFT;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * Created by Fergoman123.
 */
public final class BlockLogObsidian extends BlockRotatedPillarFT
{

    public BlockLogObsidian(String blockName) {
        super(blockName);
    }

    @Override
    public IIcon getSideIcon(int meta) {
        return this.sideIcon;
    }

    @Override
    public IIcon getTopIcon(int meta) {
        return this.topIcon;
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        this.sideIcon = register.registerIcon(Textures.logObsidian);
        this.topIcon = register.registerIcon(Textures.logObsidianTop);
    }
}

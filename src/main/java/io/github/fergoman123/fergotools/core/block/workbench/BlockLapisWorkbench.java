package io.github.fergoman123.fergotools.core.block.workbench;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.reference.GuiIds;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.util.base.workbench.BlockWorkbenchFT;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by Fergoman123.
 */
public final class BlockLapisWorkbench extends BlockWorkbenchFT
{

    public BlockLapisWorkbench(String blockName) {
        super(blockName);
    }

    public IIcon getIcon(int side, int meta)
    {
        return side == 1 ? this.topIcon : (side == 0 ? this.bottomIcon : (side != 2 && side != 4 ? this.blockIcon : this.frontIcon));
    }

    public void registerBlockIcons(IIconRegister register)
    {
        this.blockIcon = register.registerIcon(Textures.lapisWorkbenchTextures[0]);
        this.topIcon = register.registerIcon(Textures.lapisWorkbenchTextures[1]);
        this.frontIcon = register.registerIcon(Textures.lapisWorkbenchTextures[2]);
        this.bottomIcon = register.registerIcon(Textures.plankLapis);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        if (world.isRemote)
        {
            return true;
        }
        else if (!player.isSneaking())
        {
            player.openGui(FergoTools.getInstance(), GuiIds.lapisWorkbench.ordinal(), world, x, y, z);
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }
}

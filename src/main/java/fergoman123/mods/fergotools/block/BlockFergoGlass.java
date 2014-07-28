package fergoman123.mods.fergotools.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.reference.Reference;
import fergoman123.mods.fergotools.reference.Textures;
import fergoman123.mods.fergotools.util.base.BlockGlassFT;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * glass Block adapted from tconstruct BlockGlassConnected
 * @author Fergoman123
 */
public class BlockFergoGlass extends BlockGlassFT {
    protected IIcon[] icons = new IIcon[16];
    private boolean shouldRenderSelectionBox = true;
    private int renderPass = 0;

    public BlockFergoGlass() {
        super();
        this.setBlockName(Names.Blocks.blockFergoGlass);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side) {
        Block b = world.getBlock(x, y, z);
        return b == (Block) this ? false : super.shouldSideBeRendered(world, x, y, z, side);
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        for (int i = 0; i < Textures.blockFergoGlassTex.length; i++) {
            icons[i] = register.registerIcon(Reference.textureLoc + Textures.ctmLocation + Textures.blockFergoGlassTex[i]);
        }
    }

    @Override
    public int getRenderBlockPass() {
        return renderPass;
    }

    public boolean shouldConnectToBlock(IBlockAccess world, int x, int y, int z, Block block, int side) {
        return block == (Block) this;
    }

    @Override
    public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
        return world.getBlockMetadata(x, y, z) == 15 ? icons[0] : getConnectedBlockTexture(world, x, y, z, side, icons);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getConnectedBlockTexture(IBlockAccess world, int x, int y, int z, int side, IIcon[] icons) {
        boolean isOpenUp = false, isOpenDown = false, isOpenLeft = false, isOpenRight = false;

        switch (side) {
            case 0:
                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x - 1, y, z), world.getBlockMetadata(x - 1, y, z))) {
                    isOpenDown = true;
                }

                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x + 1, y, z), world.getBlockMetadata(x + 1, y, z))) {
                    isOpenUp = true;
                }

                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y, z - 1), world.getBlockMetadata(x, y, z - 1))) {
                    isOpenLeft = true;
                }

                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y, z + 1), world.getBlockMetadata(x, y, z + 1))) {
                    isOpenRight = true;
                }

                if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) {
                    return icons[15];
                } else if (isOpenUp && isOpenDown && isOpenLeft) {
                    return icons[11];
                } else if (isOpenUp && isOpenDown && isOpenRight) {
                    return icons[12];
                } else if (isOpenUp && isOpenLeft && isOpenRight) {
                    return icons[13];
                } else if (isOpenDown && isOpenLeft && isOpenRight) {
                    return icons[14];
                } else if (isOpenDown && isOpenUp) {
                    return icons[5];
                } else if (isOpenLeft && isOpenRight) {
                    return icons[6];
                } else if (isOpenDown && isOpenLeft) {
                    return icons[8];
                } else if (isOpenDown && isOpenRight) {
                    return icons[10];
                } else if (isOpenUp && isOpenLeft) {
                    return icons[7];
                } else if (isOpenUp && isOpenRight) {
                    return icons[9];
                } else if (isOpenDown) {
                    return icons[3];
                } else if (isOpenUp) {
                    return icons[4];
                } else if (isOpenLeft) {
                    return icons[2];
                } else if (isOpenRight) {
                    return icons[1];
                }
                break;
            case 1:
                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x - 1, y, z), world.getBlockMetadata(x - 1, y, z))) {
                    isOpenDown = true;
                }

                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x + 1, y, z), world.getBlockMetadata(x + 1, y, z))) {
                    isOpenUp = true;
                }

                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y, z - 1), world.getBlockMetadata(x, y, z - 1))) {
                    isOpenLeft = true;
                }

                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y, z + 1), world.getBlockMetadata(x, y, z + 1))) {
                    isOpenRight = true;
                }

                if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) {
                    return icons[15];
                } else if (isOpenUp && isOpenDown && isOpenLeft) {
                    return icons[11];
                } else if (isOpenUp && isOpenDown && isOpenRight) {
                    return icons[12];
                } else if (isOpenUp && isOpenLeft && isOpenRight) {
                    return icons[13];
                } else if (isOpenDown && isOpenLeft && isOpenRight) {
                    return icons[14];
                } else if (isOpenDown && isOpenUp) {
                    return icons[5];
                } else if (isOpenLeft && isOpenRight) {
                    return icons[6];
                } else if (isOpenDown && isOpenLeft) {
                    return icons[8];
                } else if (isOpenDown && isOpenRight) {
                    return icons[10];
                } else if (isOpenUp && isOpenLeft) {
                    return icons[7];
                } else if (isOpenUp && isOpenRight) {
                    return icons[9];
                } else if (isOpenDown) {
                    return icons[3];
                } else if (isOpenUp) {
                    return icons[4];
                } else if (isOpenLeft) {
                    return icons[2];
                } else if (isOpenRight) {
                    return icons[1];
                }
                break;
            case 2:
                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y - 1, z), world.getBlockMetadata(x, y - 1, z))) {
                    isOpenDown = true;
                }

                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y + 1, z), world.getBlockMetadata(x, y + 1, z))) {
                    isOpenUp = true;
                }

                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x - 1, y, z), world.getBlockMetadata(x - 1, y, z))) {
                    isOpenLeft = true;
                }

                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x + 1, y, z), world.getBlockMetadata(x + 1, y, z))) {
                    isOpenRight = true;
                }

                if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) {
                    return icons[15];
                } else if (isOpenUp && isOpenDown && isOpenLeft) {
                    return icons[13];
                } else if (isOpenUp && isOpenDown && isOpenRight) {
                    return icons[14];
                } else if (isOpenUp && isOpenLeft && isOpenRight) {
                    return icons[11];
                } else if (isOpenDown && isOpenLeft && isOpenRight) {
                    return icons[12];
                } else if (isOpenDown && isOpenUp) {
                    return icons[6];
                } else if (isOpenLeft && isOpenRight) {
                    return icons[5];
                } else if (isOpenDown && isOpenLeft) {
                    return icons[9];
                } else if (isOpenDown && isOpenRight) {
                    return icons[10];
                } else if (isOpenUp && isOpenLeft) {
                    return icons[7];
                } else if (isOpenUp && isOpenRight) {
                    return icons[8];
                } else if (isOpenDown) {
                    return icons[1];
                } else if (isOpenUp) {
                    return icons[2];
                } else if (isOpenLeft) {
                    return icons[4];
                } else if (isOpenRight) {
                    return icons[3];
                }
                break;
            case 3:
                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y - 1, z), world.getBlockMetadata(x, y - 1, z))) {
                    isOpenDown = true;
                }

                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y + 1, z), world.getBlockMetadata(x, y + 1, z))) {
                    isOpenUp = true;
                }

                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x - 1, y, z), world.getBlockMetadata(x - 1, y, z))) {
                    isOpenLeft = true;
                }

                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x + 1, y, z), world.getBlockMetadata(x + 1, y, z))) {
                    isOpenRight = true;
                }

                if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) {
                    return icons[15];
                } else if (isOpenUp && isOpenDown && isOpenLeft) {
                    return icons[14];
                } else if (isOpenUp && isOpenDown && isOpenRight) {
                    return icons[13];
                } else if (isOpenUp && isOpenLeft && isOpenRight) {
                    return icons[11];
                } else if (isOpenDown && isOpenLeft && isOpenRight) {
                    return icons[12];
                } else if (isOpenDown && isOpenUp) {
                    return icons[6];
                } else if (isOpenLeft && isOpenRight) {
                    return icons[5];
                } else if (isOpenDown && isOpenLeft) {
                    return icons[10];
                } else if (isOpenDown && isOpenRight) {
                    return icons[9];
                } else if (isOpenUp && isOpenLeft) {
                    return icons[8];
                } else if (isOpenUp && isOpenRight) {
                    return icons[7];
                } else if (isOpenDown) {
                    return icons[1];
                } else if (isOpenUp) {
                    return icons[2];
                } else if (isOpenLeft) {
                    return icons[3];
                } else if (isOpenRight) {
                    return icons[4];
                }
                break;
            case 4:
                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y - 1, z), world.getBlockMetadata(x, y - 1, z))) {
                    isOpenDown = true;
                }

                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y + 1, z), world.getBlockMetadata(x, y + 1, z))) {
                    isOpenUp = true;
                }

                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y, z - 1), world.getBlockMetadata(x, y, z - 1))) {
                    isOpenLeft = true;
                }

                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y, z + 1), world.getBlockMetadata(x, y, z + 1))) {
                    isOpenRight = true;
                }

                if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) {
                    return icons[15];
                } else if (isOpenUp && isOpenDown && isOpenLeft) {
                    return icons[14];
                } else if (isOpenUp && isOpenDown && isOpenRight) {
                    return icons[13];
                } else if (isOpenUp && isOpenLeft && isOpenRight) {
                    return icons[11];
                } else if (isOpenDown && isOpenLeft && isOpenRight) {
                    return icons[12];
                } else if (isOpenDown && isOpenUp) {
                    return icons[6];
                } else if (isOpenLeft && isOpenRight) {
                    return icons[5];
                } else if (isOpenDown && isOpenLeft) {
                    return icons[10];
                } else if (isOpenDown && isOpenRight) {
                    return icons[9];
                } else if (isOpenUp && isOpenLeft) {
                    return icons[8];
                } else if (isOpenUp && isOpenRight) {
                    return icons[7];
                } else if (isOpenDown) {
                    return icons[1];
                } else if (isOpenUp) {
                    return icons[2];
                } else if (isOpenLeft) {
                    return icons[3];
                } else if (isOpenRight) {
                    return icons[4];
                }
                break;
            case 5:
                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y - 1, z), world.getBlockMetadata(x, y - 1, z))) {
                    isOpenDown = true;
                }

                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y + 1, z), world.getBlockMetadata(x, y + 1, z))) {
                    isOpenUp = true;
                }

                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y, z - 1), world.getBlockMetadata(x, y, z - 1))) {
                    isOpenLeft = true;
                }

                if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y, z + 1), world.getBlockMetadata(x, y, z + 1))) {
                    isOpenRight = true;
                }

                if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) {
                    return icons[15];
                } else if (isOpenUp && isOpenDown && isOpenLeft) {
                    return icons[13];
                } else if (isOpenUp && isOpenDown && isOpenRight) {
                    return icons[14];
                } else if (isOpenUp && isOpenLeft && isOpenRight) {
                    return icons[11];
                } else if (isOpenDown && isOpenLeft && isOpenRight) {
                    return icons[12];
                } else if (isOpenDown && isOpenUp) {
                    return icons[6];
                } else if (isOpenLeft && isOpenRight) {
                    return icons[5];
                } else if (isOpenDown && isOpenLeft) {
                    return icons[9];
                } else if (isOpenDown && isOpenRight) {
                    return icons[10];
                } else if (isOpenUp && isOpenLeft) {
                    return icons[7];
                } else if (isOpenUp && isOpenRight) {
                    return icons[8];
                } else if (isOpenDown) {
                    return icons[1];
                } else if (isOpenUp) {
                    return icons[2];
                } else if (isOpenLeft) {
                    return icons[4];
                } else if (isOpenRight) {
                    return icons[3];
                }
                break;
        }
        return icons[0];
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return icons[0];
    }

    @Override
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z) {
        if (shouldRenderSelectionBox) {
            return super.getSelectedBoundingBoxFromPool(world, x, y, z);
        } else {
            return AxisAlignedBB.getBoundingBox(0D, 0D, 0D, 0D, 0D, 0D);
        }
    }

    @Override
    public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
        return true;
    }


}

package fergoman123.mods.fergotools.util.base;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.lib.Reference;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import java.util.Random;

public abstract class BlockGlassFT extends BlockBreakable
{
    public BlockGlassFT()
    {
        super("glass", Material.glass, false);
        setCreativeTab(Tabs.tabFergoBlocks);
        setHardness(1.0f);
        setResistance(50f);

        // Todo connected textures
    }

    public int quantityDropped(Random rand){
       return  0;
    }

    public int getRenderBlockPass(){
        return 0;
    }

    public boolean renderAsNormalBlock(){
        return false;
    }

    public String getUnlocalizedName()
    {
        return NameHelper.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
        blockIcon = register.registerIcon(NameHelper.format("%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
}

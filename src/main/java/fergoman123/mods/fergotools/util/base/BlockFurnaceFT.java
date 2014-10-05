package fergoman123.mods.fergotools.util.base;

import fergoman123.mods.fergotools.creativetab.Tabs;
import fergoman123.mods.fergotools.reference.Reference;
import fergoman123.mods.fergoutil.block.FergoFurnaceBlock;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

import java.util.Random;

public abstract class BlockFurnaceFT extends FergoFurnaceBlock
{

    public BlockFurnaceFT(Material material, String furnaceType) {
        super(material, furnaceType, 1, Tabs.tabFergoFurnaces);
    }
}

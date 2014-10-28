package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.reference.Ints;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.util.base.BlockLeavesFT;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.World;

import java.util.List;

public final class FTLeaves extends BlockLeavesFT
{
    public static final FTLeaves instance = new FTLeaves();

    public static final String[][] leafTypes = new String[][]{Textures.leavesNormal, Textures.leavesOpaque};
    public static final String[] leaves = new String[]{"Obsidian", "Emerald", "Lapis", "Bronze", "Coal", "Glowstone", "Adamantium", "Silk", "Redstone"};

    public FTLeaves()
    {
        super();
        this.setBlockName(BlockNames.leavesFergo);
    }

    @Override
    public int getBlockColor()
    {
        double d0 = 4.5D;
        double d1 = 9.0D;
        getRenderColor((int)d0 + (int)d1);
        return ColorizerFoliage.getFoliageColor(d0, d1);
    }



    @Override
    public void registerBlockIcons(IIconRegister register) {
        for (int i = 0; i < leafTypes.length; ++i)
        {
            this.icons[i] = new IIcon[leafTypes[i].length];
            for(int j = 0; j < leafTypes[i].length; ++j)
            {
                this.icons[i][j] = register.registerIcon(leafTypes[i][j]);
            }
        }
    }

    @Override
    protected void func_150124_c(World world, int x, int y, int z, int side, int meta) {
        if ((side & 3) == 0 && world.rand.nextInt(meta) == 0)
        {
            this.dropBlockAsItem(world, x, y, z, new ItemStack(Items.apple, 1, 0));
        }
    }

    public int damageDropped(int damage)
    {
        return super.damageDropped(damage) + 4;
    }

    @Override
    public int getRenderColor(int meta) {
        switch (meta)
        {
            case 0: return Ints.Colors.renderColorObsidian;
        }
        return meta;
    }

    @Override
    public int getDamageValue(World world, int x, int y, int z) {
        return world.getBlockMetadata(x, y, z) & 3;
    }

    public void getSubBlocks(Item item, CreativeTabs tab, List list)
    {
        for (int i = 0; i < leaves.length; i++)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        return (meta & 3) == 1 ? this.icons[this.field_150127_b][1] : this.icons[this.field_150127_b][0];
    }

    @Override
    public String[] func_150125_e() {
        return leaves;
    }
}

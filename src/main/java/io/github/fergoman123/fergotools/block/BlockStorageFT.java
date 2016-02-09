package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.reference.BlockNames;
import io.github.fergoman123.fergotools.tab.CTFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

import java.util.List;
import java.util.Random;

public class BlockStorageFT extends Block {

    public static final PropertyEnum<EnumType> VARIANT = PropertyEnum.<EnumType>create("variant", EnumType.class);

    public BlockStorageFT() {
        super(Material.iron);
        this.setUnlocalizedName(BlockNames.blockStorageFT);
        this.setCreativeTab(CTFT.tabFergoBlocks);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.blockObsidian));
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }

    public int damageDropped(IBlockState state) {
        return ((EnumType)state.getValue(VARIANT)).meta();
    }

    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, EnumType.values()[meta]);
    }

    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
        for (int i = 0; i < BlockNames.blocks.length; i++) {
            list.add(new ItemStack(itemIn, 1, i));
        }
    }

    public int getMetaFromState(IBlockState state) {
        return ((EnumType)state.getValue(VARIANT)).meta();
    }

    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.fergotools.%s", NameHelper.getName(super.getUnlocalizedName()));
    }

    public enum EnumType implements IStringSerializable{
        blockObsidian(0, "blockObsidian"),
        blockGemEmerald(1, "blockGemEmerald"),
        blockGemLapis(2, "blockGemLapis"),
        blockBronze(3, "blockBronze"),
        blockCoal(4, "blockCoal"),
        blockGlowstone(5, "blockGlowstone"),
        blockAdamantium(6, "blockAdamantium"),
        blockGemSilk(7, "blockGemSilk"),
        blockGemRedstone(8, "blockGemRedstone"),
        blockExperience(9, "blockExperience"),
        blockExpCollector(10, "blockExpCollector");

        private int meta;
        private String name;

        EnumType(int meta, String name){
            this.meta = meta;
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public int meta(){
            return this.meta;
        }

        public static String[] getNames(){
            String[] names = new String[values().length];
            for (int i = 0; i < values().length; i++) {
                names[i] = values()[i].getName();
            }
            return names;
        }
    }
}

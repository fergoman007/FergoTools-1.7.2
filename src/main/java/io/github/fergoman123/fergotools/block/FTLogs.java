package io.github.fergoman123.fergotools.block;

import com.sun.prism.Texture;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.util.base.BlockLogFT;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import java.util.Random;

public class FTLogs
{
    public static final class BlockLogObsidian extends BlockLogFT
    {
        public BlockLogObsidian()
        {
            super();
            this.setBlockName(BlockNames.logObsidian);
        }

        @Override
        public void registerBlockIcons(IIconRegister register) {
            this.sideIcon = register.registerIcon(Textures.logObsidian);
            this.topIcon = register.registerIcon(Textures.logObsidianTop);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockLogEmerald extends BlockLogFT
    {
        public BlockLogEmerald()
        {
            super();
            this.setBlockName(BlockNames.logEmerald);
        }

        @Override
        public void registerBlockIcons(IIconRegister register) {
            this.sideIcon = register.registerIcon(Textures.logEmerald);
            this.topIcon = register.registerIcon(Textures.logEmeraldTop);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockLogLapis extends BlockLogFT
    {
        public BlockLogLapis()
        {
            super();
            this.setBlockName(BlockNames.logLapis);
        }

        @Override
        public void registerBlockIcons(IIconRegister register) {
            this.sideIcon = register.registerIcon(Textures.logLapis);
            this.topIcon = register.registerIcon(Textures.logLapisTop);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockLogBronze extends BlockLogFT
    {
        public BlockLogBronze()
        {
            super();
            this.setBlockName(BlockNames.logBronze);
        }

        @Override
        public void registerBlockIcons(IIconRegister register) {
            this.sideIcon = register.registerIcon(Textures.logBronze);
            this.topIcon = register.registerIcon(Textures.logBronzeTop);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockLogCoal extends BlockLogFT
    {
        public BlockLogCoal()
        {
            super();
            this.setBlockName(BlockNames.logCoal);
        }

        public void registerBlockIcons(IIconRegister register)
        {
            this.sideIcon = register.registerIcon(Textures.logCoal);
            this.topIcon = register.registerIcon(Textures.logCoalTop);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockLogGlowstone extends BlockLogFT
    {
        public BlockLogGlowstone()
        {
            super();
            this.setBlockName(BlockNames.logGlowstone);
        }

        @Override
        public void registerBlockIcons(IIconRegister register) {
            this.sideIcon = register.registerIcon(Textures.logGlowstone);
            this.topIcon = register.registerIcon(Textures.logGlowstoneTop);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockLogAdamantium extends BlockLogFT
    {
        public BlockLogAdamantium()
        {
            super();
            this.setBlockName(BlockNames.logAdamantium);
        }

        @Override
        public void registerBlockIcons(IIconRegister register) {
            this.sideIcon = register.registerIcon(Textures.logAdamantium);
            this.topIcon = register.registerIcon(Textures.logAdamantiumTop);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockLogSilk extends BlockLogFT
    {
        public BlockLogSilk()
        {
            super();
            this.setBlockName(BlockNames.logSilk);
        }

        public void registerBlockIcons(IIconRegister register)
        {
            this.sideIcon = register.registerIcon(Textures.logSilk);
            this.topIcon = register.registerIcon(Textures.logSilkTop);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockLogRedstone extends BlockLogFT
    {
        public BlockLogRedstone()
        {
            super();
            this.setBlockName(BlockNames.logRedstone);
        }

        @Override
        public void registerBlockIcons(IIconRegister register) {
            this.sideIcon = register.registerIcon(Textures.logRedstone);
            this.topIcon = register.registerIcon(Textures.logRedstoneTop);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }
}

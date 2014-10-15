package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.reference.Reference;
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
            this.setBlockName(Names.Blocks.logObsidian);
        }

        @Override
        public void registerBlockIcons(IIconRegister register) {
            this.sideIcon = register.registerIcon(Reference.textureLoc + "wood/" + Names.Blocks.logObsidian);
            this.topIcon = register.registerIcon(Reference.textureLoc + "wood/" + Names.Blocks.logObsidian + "Top");
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
            this.setBlockName(Names.Blocks.logEmerald);
        }

        @Override
        public void registerBlockIcons(IIconRegister register) {
            this.sideIcon = register.registerIcon(Reference.textureLoc + "wood/" + Names.Blocks.logEmerald);
            this.topIcon = register.registerIcon(Reference.textureLoc + "wood/" + Names.Blocks.logEmerald + "Top");
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
            this.setBlockName(Names.Blocks.logLapis);
        }

        @Override
        public void registerBlockIcons(IIconRegister register) {
            this.sideIcon = register.registerIcon(Reference.textureLoc + "wood/" + Names.Blocks.logLapis);
            this.topIcon = register.registerIcon(Reference.textureLoc + "wood/" + Names.Blocks.logLapis + "Top");
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
            this.setBlockName(Names.Blocks.logBronze);
        }

        @Override
        public void registerBlockIcons(IIconRegister register) {
            this.sideIcon = register.registerIcon(Reference.textureLoc + "wood/" + Names.Blocks.logBronze);
            this.topIcon = register.registerIcon(Reference.textureLoc + "wood/" + Names.Blocks.logBronze + "Top");
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
            this.setBlockName(Names.Blocks.logCoal);
        }

        public void registerBlockIcons(IIconRegister register)
        {
            this.sideIcon = register.registerIcon(Reference.textureLoc + "wood/" + Names.Blocks.logCoal);
            this.topIcon = register.registerIcon(Reference.textureLoc + "wood/" + Names.Blocks.logCoal + "Top");
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
            this.setBlockName(Names.Blocks.logGlowstone);
        }

        @Override
        public void registerBlockIcons(IIconRegister register) {
            this.sideIcon = register.registerIcon(Reference.textureLoc + "wood/" + Names.Blocks.logGlowstone);
            this.topIcon = register.registerIcon(Reference.textureLoc + "wood/" + Names.Blocks.logGlowstone + "Top");
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
            this.setBlockName(Names.Blocks.logAdamantium);
        }

        @Override
        public void registerBlockIcons(IIconRegister register) {
            this.sideIcon = register.registerIcon(Reference.textureLoc + "wood/" + Names.Blocks.logAdamantium);
            this.topIcon = register.registerIcon(Reference.textureLoc + "wood/" + Names.Blocks.logAdamantium + "Top");
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
            this.setBlockName(Names.Blocks.logSilk);
        }

        public void registerBlockIcons(IIconRegister register)
        {
            this.sideIcon = register.registerIcon(Reference.textureLoc + "wood/" + Names.Blocks.logSilk);
            this.topIcon = register.registerIcon(Reference.textureLoc + "wood/" + Names.Blocks.logSilk + "Top");
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
            this.setBlockName(Names.Blocks.logRedstone);
        }

        @Override
        public void registerBlockIcons(IIconRegister register) {
            this.sideIcon = register.registerIcon(Reference.textureLoc + "wood/" + Names.Blocks.logRedstone);
            this.topIcon = register.registerIcon(Reference.textureLoc + "wood/" + Names.Blocks.logRedstone + "Top");
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }
}

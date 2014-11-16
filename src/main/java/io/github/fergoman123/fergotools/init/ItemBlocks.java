/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.html
 */

package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.block.FTStairs;
import io.github.fergoman123.fergotools.furnaces.AdamantiumFurnace.BlockAdamantiumFurnace;
import io.github.fergoman123.fergotools.furnaces.BronzeFurnace.BlockBronzeFurnace;
import io.github.fergoman123.fergotools.furnaces.CoalFurnace.BlockCoalFurnace;
import io.github.fergoman123.fergotools.furnaces.EmeraldFurnace.BlockEmeraldFurnace;
import io.github.fergoman123.fergotools.furnaces.GlowstoneFurnace.BlockGlowstoneFurnace;
import io.github.fergoman123.fergotools.furnaces.LapisFurnace.BlockLapisFurnace;
import io.github.fergoman123.fergotools.furnaces.Macerator.BlockMacerator;
import io.github.fergoman123.fergotools.furnaces.ObsidianFurnace.BlockObsidianFurnace;
import io.github.fergoman123.fergotools.furnaces.QuartzFurnace.BlockQuartzFurnace;
import io.github.fergoman123.fergotools.furnaces.RedstoneFurnace.BlockRedstoneFurnace;
import io.github.fergoman123.fergotools.furnaces.SilkFurnace.BlockSilkFurnace;
import io.github.fergoman123.fergotools.init.FTBlocks.*;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.reference.names.OreDict;
import io.github.fergoman123.fergotools.util.base.ItemBlockFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemBlocks {

    public static final class ItemBlockOreObsidian extends ItemBlockFT
    {
        public ItemBlockOreObsidian(Block block){super(BlockOreObsidian.instance);}

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.oreObsidianArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockOreEmerald extends ItemBlockFT
    {
        public ItemBlockOreEmerald(Block block)
        {
            super(BlockOreEmeraldCrystal.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.oreEmeraldArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockOreLapis extends ItemBlockFT
    {
        public ItemBlockOreLapis(Block block)
        {
            super(BlockOreLapisCrystal.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.oreBronzeArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockOreBronze extends ItemBlockFT
    {
        public ItemBlockOreBronze(Block block)
        {
            super(BlockOreBronze.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.oreBronzeArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockOreAdamantium extends ItemBlockFT
    {
        public ItemBlockOreAdamantium(Block block)
        {
            super(BlockOreAdamantium.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.oreAdamantiumArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockOreCrystalRed extends ItemBlockFT
    {

        public ItemBlockOreCrystalRed(Block block) {
            super(BlockOreRedCrystal.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.oreCrystalRedArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }
    
    public static final class ItemBlockOreExperience extends ItemBlockFT
    {

        public ItemBlockOreExperience(Block block) {
            super(BlockOreExperience.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.oreExperienceArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockObsidian extends ItemBlockFT
    {
        public ItemBlockObsidian(Block block)
        {
            super(BlockObsidianStorage.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.blockObsidianArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockEmerald extends ItemBlockFT
    {
        public ItemBlockEmerald(Block block)
        {
            super(BlockEmeraldCrystal.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.blockEmeraldArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockLapis extends ItemBlockFT
    {
        public ItemBlockLapis(Block block)
        {
            super(BlockLapisCrystal.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.blockLapisArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockBronze extends ItemBlockFT
    {
        public ItemBlockBronze(Block block)
        {
            super(BlockBronze.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.blockBronzeArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockCoal extends ItemBlockFT {
        public ItemBlockCoal(Block block) {
            super(BlockCoalStorage.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.blockCoalArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockGlowstone extends ItemBlockFT {
        public ItemBlockGlowstone(Block block) {
            super(BlockGlowstoneStorage.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.blockGlowstoneArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockAdamantium extends ItemBlockFT {
        public ItemBlockAdamantium(Block block) {
            super(BlockAdamantium.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.blockAdamantiumArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockSilkGem extends ItemBlockFT {
        public ItemBlockSilkGem(Block block) {
            super(BlockSilkGem.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.blockSilkGemArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockRedstoneCrystal extends ItemBlockFT {
        public ItemBlockRedstoneCrystal(Block block) {
            super(BlockRedstoneCrystal.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.blockRedstoneCrystalArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockQuartzFurnaceIdle extends ItemBlockFT {
        public ItemBlockQuartzFurnaceIdle(Block block) {
            super(BlockQuartzFurnace.instanceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.quartzFurnaceSpeed));
        }
    }

    public static final class ItemBlockQuartzFurnaceActive extends ItemBlockFT {
        public ItemBlockQuartzFurnaceActive(Block block) {
            super(BlockQuartzFurnace.instanceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.quartzFurnaceSpeed));
        }
    }

    public static final class ItemBlockObsidianFurnaceIdle extends ItemBlockFT {
        public ItemBlockObsidianFurnaceIdle(Block block) {
            super(BlockObsidianFurnace.instanceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.obsidianFurnaceSpeed));
        }
    }

    public static final class ItemBlockObsidianFurnaceActive extends ItemBlockFT {
        public ItemBlockObsidianFurnaceActive(Block block) {
            super(BlockObsidianFurnace.instanceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.obsidianFurnaceSpeed));
        }
    }

    public static final class ItemBlockEmeraldFurnaceIdle extends ItemBlockFT {
        public ItemBlockEmeraldFurnaceIdle(Block block) {
            super(BlockEmeraldFurnace.instanceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.emeraldFurnaceSpeed));
        }
    }

    public static final class ItemBlockEmeraldFurnaceActive extends ItemBlockFT {
        public ItemBlockEmeraldFurnaceActive(Block block) {
            super(BlockEmeraldFurnace.instanceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.emeraldFurnaceSpeed));
        }
    }

    public static final class ItemBlockLapisFurnaceIdle extends ItemBlockFT {
        public ItemBlockLapisFurnaceIdle(Block block) {
            super(BlockLapisFurnace.instanceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.lapisFurnaceSpeed));
        }
    }

    public static final class ItemBlockLapisFurnaceActive extends ItemBlockFT {
        public ItemBlockLapisFurnaceActive(Block block) {
            super(BlockLapisFurnace.instanceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.lapisFurnaceSpeed));
        }
    }

    public static final class ItemBlockBronzeFurnaceIdle extends ItemBlockFT {
        public ItemBlockBronzeFurnaceIdle(Block block) {
            super(BlockBronzeFurnace.instanceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.bronzeFurnaceSpeed));
        }
    }

    public static final class ItemBlockBronzeFurnaceActive extends ItemBlockFT {
        public ItemBlockBronzeFurnaceActive(Block block) {
            super(BlockBronzeFurnace.instanceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.bronzeFurnaceSpeed));
        }
    }

    public static final class ItemBlockCoalFurnaceIdle extends ItemBlockFT {
        public ItemBlockCoalFurnaceIdle(Block block) {
            super(BlockCoalFurnace.instanceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.coalFurnaceSpeed));
        }
    }

    public static final class ItemBlockCoalFurnaceActive extends ItemBlockFT {
        public ItemBlockCoalFurnaceActive(Block block) {
            super(BlockCoalFurnace.instanceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.coalFurnaceSpeed));
        }
    }

    public static final class ItemBlockGlowstoneFurnaceIdle extends ItemBlockFT {
        public ItemBlockGlowstoneFurnaceIdle(Block block) {
            super(BlockGlowstoneFurnace.instanceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.glowstoneFurnaceSpeed));
        }
    }

    public static final class ItemBlockGlowstoneFurnaceActive extends ItemBlockFT {
        public ItemBlockGlowstoneFurnaceActive(Block block) {
            super(BlockGlowstoneFurnace.instanceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.glowstoneFurnaceSpeed));
        }
    }

    public static final class ItemBlockAdamantiumFurnaceIdle extends ItemBlockFT {
        public ItemBlockAdamantiumFurnaceIdle(Block block) {
            super(BlockAdamantiumFurnace.instanceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.adamantiumFurnaceSpeed));
        }
    }

    public static final class ItemBlockAdamantiumFurnaceActive extends ItemBlockFT {
        public ItemBlockAdamantiumFurnaceActive(Block block) {
            super(BlockAdamantiumFurnace.instanceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.adamantiumFurnaceSpeed));
        }
    }

    public static final class ItemBlockSilkFurnaceIdle extends ItemBlockFT {
        public ItemBlockSilkFurnaceIdle(Block block) {
            super(BlockSilkFurnace.instanceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.silkFurnaceSpeed));
        }
    }

    public static final class ItemBlockSilkFurnaceActive extends ItemBlockFT {
        public ItemBlockSilkFurnaceActive(Block block) {
            super(BlockSilkFurnace.instanceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.silkFurnaceSpeed));
        }
    }

    public static final class ItemBlockRedstoneFurnaceIdle extends ItemBlockFT {
        public ItemBlockRedstoneFurnaceIdle(Block block) {
            super(BlockRedstoneFurnace.instanceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.redstoneFurnaceSpeed));
        }
    }

    public static final class ItemBlockRedstoneFurnaceActive extends ItemBlockFT {
        public ItemBlockRedstoneFurnaceActive(Block block) {
            super(BlockRedstoneFurnace.instanceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.redstoneFurnaceSpeed));
        }
    }

    public static final class ItemBlockMaceratorIdle extends ItemBlockFT {
        public ItemBlockMaceratorIdle(Block block) {
            super(BlockMacerator.instanceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.maceratorSpeed));
        }
    }

    public static final class ItemBlockMaceratorActive extends ItemBlockFT {
        public ItemBlockMaceratorActive(Block block) {
            super(BlockMacerator.instanceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.maceratorSpeed));
        }
    }


    public static final class ItemBlockLogObsidian extends ItemBlockFT {
        public ItemBlockLogObsidian(Block block) {
            super(BlockLogObsidian.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.logWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockLogEmerald extends ItemBlockFT {
        public ItemBlockLogEmerald(Block block) {
            super(BlockLogEmerald.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.logWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockLogLapis extends ItemBlockFT {
        public ItemBlockLogLapis(Block block) {
            super(BlockLogLapis.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.logWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockLogBronze extends ItemBlockFT {
        public ItemBlockLogBronze(Block block) {
            super(BlockLogBronze.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.logWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockLogCoal extends ItemBlockFT {
        public ItemBlockLogCoal(Block block) {
            super(BlockLogCoal.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.logWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockLogGlowstone extends ItemBlockFT {
        public ItemBlockLogGlowstone(Block block) {
            super(BlockLogGlowstone.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.logWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockLogAdamantium extends ItemBlockFT {
        public ItemBlockLogAdamantium(Block block) {
            super(BlockLogAdamantium.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.logWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockLogSilk extends ItemBlockFT {
        public ItemBlockLogSilk(Block block) {
            super(BlockLogSilk.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.logWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockLogRedstone extends ItemBlockFT {
        public ItemBlockLogRedstone(Block block) {
            super(BlockLogRedstone.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.logWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockPlankObsidian extends ItemBlockFT {
        public ItemBlockPlankObsidian(Block block) {
            super(BlockPlankObsidian.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.plankWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockPlankEmerald extends ItemBlockFT {
        public ItemBlockPlankEmerald(Block block) {
            super(BlockPlankEmerald.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.plankWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockPlankLapis extends ItemBlockFT {
        public ItemBlockPlankLapis(Block block) {
            super(BlockPlankLapis.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.plankWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockPlankBronze extends ItemBlockFT {
        public ItemBlockPlankBronze(Block block) {
            super(BlockPlankBronze.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.plankWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockPlankCoal extends ItemBlockFT {
        public ItemBlockPlankCoal(Block block) {
            super(BlockPlankCoal.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.plankWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockPlankGlowstone extends ItemBlockFT {
        public ItemBlockPlankGlowstone(Block block) {
            super(BlockPlankGlowstone.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.plankWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockPlankAdamantium extends ItemBlockFT {
        public ItemBlockPlankAdamantium(Block block) {
            super(BlockPlankAdamantium.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.plankWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockPlankSilk extends ItemBlockFT {
        public ItemBlockPlankSilk(Block block) {
            super(BlockPlankSilk.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.plankWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockPlankRedstone extends ItemBlockFT {
        public ItemBlockPlankRedstone(Block block) {
            super(BlockPlankRedstone.instance);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.plankWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }


    public static final class ItemBlockStairObsidian extends ItemBlockFT {
        public ItemBlockStairObsidian(Block block) {
            super(FTStairs.stairObsidian);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.stairWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockStairEmerald extends ItemBlockFT {
        public ItemBlockStairEmerald(Block block) {
            super(FTStairs.stairEmerald);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.stairWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockStairLapis extends ItemBlockFT {
        public ItemBlockStairLapis(Block block) {
            super(FTStairs.stairLapis);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.stickWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockStairBronze extends ItemBlockFT {
        public ItemBlockStairBronze(Block block) {
            super(FTStairs.stairBronze);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.stairWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockStairCoal extends ItemBlockFT {
        public ItemBlockStairCoal(Block block) {
            super(FTStairs.stairCoal);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.stairWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockStairGlowstone extends ItemBlockFT {
        public ItemBlockStairGlowstone(Block block) {
            super(FTStairs.stairGlowstone);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.stairWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockStairAdamantium extends ItemBlockFT {
        public ItemBlockStairAdamantium(Block block) {
            super(FTStairs.stairAdamantium);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.stairWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockStairSilk extends ItemBlockFT {
        public ItemBlockStairSilk(Block block) {
            super(FTStairs.stairSilk);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.stairWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockStairRedstone extends ItemBlockFT {
        public ItemBlockStairRedstone(Block block) {
            super(FTStairs.stairRedstone);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.stairWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

}
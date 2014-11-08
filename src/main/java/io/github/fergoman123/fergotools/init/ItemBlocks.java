/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.html
 */

package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.core.FTContent;
import io.github.fergoman123.fergotools.init.FTBlocks.*;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.reference.names.OreDict;
import io.github.fergoman123.fergotools.util.base.ItemBlockFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

@SuppressWarnings("unchecked")
public class ItemBlocks {

    public static final class ItemBlockOreObsidian extends ItemBlockFT
    {
        public ItemBlockOreObsidian(Block block){super(FTContent.oreObsidian);}

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
            super(FTContent.oreGemEmerald);
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
            super(FTContent.oreGemLapis);
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
            super(FTContent.oreBronze);
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
            super(FTContent.oreAdamantium);
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
            super(FTContent.oreRedCrystal);
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
            super(FTContent.oreExperience);
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
            super(FTContent.blockObsidian);
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
            super(FTContent.blockEmerald);
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
            super(FTContent.blockLapis);
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
            super(FTContent.blockBronze);
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
            super(FTContent.blockCoal);
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
            super(FTContent.blockGlowstone);
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
            super(FTContent.blockAdamantium);
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
            super(FTContent.blockSilkGem);
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
            super(FTContent.blockRedstone);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.blockRedstoneCrystalArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockExperience extends ItemBlockFT
    {
        public ItemBlockExperience(Block block)
        {
            super(FTContent.blockExperience);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.blockExperienceArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemBlockExpCollector extends ItemBlockFT
    {

        public ItemBlockExpCollector(Block block) {
            super(FTContent.blockExpCollector);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add("Used to Store Experience Collectors");
        }
    }

    public static final class ItemBlockQuartzFurnaceIdle extends ItemBlockFT {
        public ItemBlockQuartzFurnaceIdle(Block block) {
            super(FTContent.quartzFurnaceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.quartzFurnaceSpeed));
        }
    }

    public static final class ItemBlockQuartzFurnaceActive extends ItemBlockFT {
        public ItemBlockQuartzFurnaceActive(Block block) {
            super(FTContent.quartzFurnaceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.quartzFurnaceSpeed));
        }
    }

    public static final class ItemBlockObsidianFurnaceIdle extends ItemBlockFT {
        public ItemBlockObsidianFurnaceIdle(Block block) {
            super(FTContent.obsidianFurnaceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.obsidianFurnaceSpeed));
        }
    }

    public static final class ItemBlockObsidianFurnaceActive extends ItemBlockFT {
        public ItemBlockObsidianFurnaceActive(Block block) {
            super(FTContent.obsidianFurnaceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.obsidianFurnaceSpeed));
        }
    }

    public static final class ItemBlockEmeraldFurnaceIdle extends ItemBlockFT {
        public ItemBlockEmeraldFurnaceIdle(Block block) {
            super(FTContent.emeraldFurnaceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.emeraldFurnaceSpeed));
        }
    }

    public static final class ItemBlockEmeraldFurnaceActive extends ItemBlockFT {
        public ItemBlockEmeraldFurnaceActive(Block block) {
            super(FTContent.emeraldFurnaceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.emeraldFurnaceSpeed));
        }
    }

    public static final class ItemBlockLapisFurnaceIdle extends ItemBlockFT {
        public ItemBlockLapisFurnaceIdle(Block block) {
            super(FTContent.lapisFurnaceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.lapisFurnaceSpeed));
        }
    }

    public static final class ItemBlockLapisFurnaceActive extends ItemBlockFT {
        public ItemBlockLapisFurnaceActive(Block block) {
            super(FTContent.lapisFurnaceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.lapisFurnaceSpeed));
        }
    }

    public static final class ItemBlockBronzeFurnaceIdle extends ItemBlockFT {
        public ItemBlockBronzeFurnaceIdle(Block block) {
            super(FTContent.bronzeFurnaceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.bronzeFurnaceSpeed));
        }
    }

    public static final class ItemBlockBronzeFurnaceActive extends ItemBlockFT {
        public ItemBlockBronzeFurnaceActive(Block block) {
            super(FTContent.bronzeFurnaceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.bronzeFurnaceSpeed));
        }
    }

    public static final class ItemBlockCoalFurnaceIdle extends ItemBlockFT {
        public ItemBlockCoalFurnaceIdle(Block block) {
            super(FTContent.coalFurnaceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.coalFurnaceSpeed));
        }
    }

    public static final class ItemBlockCoalFurnaceActive extends ItemBlockFT {
        public ItemBlockCoalFurnaceActive(Block block) {
            super(FTContent.coalFurnaceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.coalFurnaceSpeed));
        }
    }

    public static final class ItemBlockGlowstoneFurnaceIdle extends ItemBlockFT {
        public ItemBlockGlowstoneFurnaceIdle(Block block) {
            super(FTContent.glowstoneFurnaceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.glowstoneFurnaceSpeed));
        }
    }

    public static final class ItemBlockGlowstoneFurnaceActive extends ItemBlockFT {
        public ItemBlockGlowstoneFurnaceActive(Block block) {
            super(FTContent.glowstoneFurnaceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.glowstoneFurnaceSpeed));
        }
    }

    public static final class ItemBlockAdamantiumFurnaceIdle extends ItemBlockFT {
        public ItemBlockAdamantiumFurnaceIdle(Block block) {
            super(FTContent.adamantiumFurnaceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.adamantiumFurnaceSpeed));
        }
    }

    public static final class ItemBlockAdamantiumFurnaceActive extends ItemBlockFT {
        public ItemBlockAdamantiumFurnaceActive(Block block) {
            super(FTContent.adamantiumFurnaceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.adamantiumFurnaceSpeed));
        }
    }

    public static final class ItemBlockSilkFurnaceIdle extends ItemBlockFT {
        public ItemBlockSilkFurnaceIdle(Block block) {
            super(FTContent.silkFurnaceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.silkFurnaceSpeed));
        }
    }

    public static final class ItemBlockSilkFurnaceActive extends ItemBlockFT {
        public ItemBlockSilkFurnaceActive(Block block) {
            super(FTContent.silkFurnaceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.silkFurnaceSpeed));
        }
    }

    public static final class ItemBlockRedstoneFurnaceIdle extends ItemBlockFT {
        public ItemBlockRedstoneFurnaceIdle(Block block) {
            super(FTContent.redstoneFurnaceIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.redstoneFurnaceSpeed));
        }
    }

    public static final class ItemBlockRedstoneFurnaceActive extends ItemBlockFT {
        public ItemBlockRedstoneFurnaceActive(Block block) {
            super(FTContent.redstoneFurnaceActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.redstoneFurnaceSpeed));
        }
    }

    public static final class ItemBlockMaceratorIdle extends ItemBlockFT {
        public ItemBlockMaceratorIdle(Block block) {
            super(FTContent.maceratorIdle);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.maceratorSpeed));
        }
    }

    public static final class ItemBlockMaceratorActive extends ItemBlockFT {
        public ItemBlockMaceratorActive(Block block) {
            super(FTContent.maceratorActive);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.maceratorSpeed));
        }
    }


    public static final class ItemBlockLogObsidian extends ItemBlockFT {
        public ItemBlockLogObsidian(Block block) {
            super(FTContent.logObsidian);
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
            super(FTContent.logEmerald);
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
            super(FTContent.logLapis);
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
            super(FTContent.logBronze);
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
            super(FTContent.logCoal);
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
            super(FTContent.logGlowstone);
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
            super(FTContent.logAdamantium);
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
            super(FTContent.logSilk);
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
            super(FTContent.logRedstone);
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
            super(FTContent.plankObsidian);
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
            super(FTContent.plankEmerald);
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
            super(FTContent.plankLapis);
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
            super(FTContent.plankBronze);
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
            super(FTContent.plankCoal);
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
            super(FTContent.plankGlowstone);
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
            super(FTContent.plankAdamantium);
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
            super(FTContent.plankSilk);
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
            super(FTContent.plankRedstone);
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
            super(FTContent.stairObsidian);
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
            super(FTContent.stairEmerald);
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
            super(FTContent.stairLapis);
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
            super(FTContent.stairBronze);
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
            super(FTContent.stairCoal);
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
            super(FTContent.stairGlowstone);
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
            super(FTContent.stairAdamantium);
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
            super(FTContent.stairSilk);
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
            super(FTContent.stairRedstone);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String i : OreDict.stairWoodArray) {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

}
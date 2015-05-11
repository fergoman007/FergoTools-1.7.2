package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.api.base.BlockFurnaceFT;
import io.github.fergoman123.fergotools.api.base.BlockOreFT;
import io.github.fergoman123.fergotools.api.base.ItemBowFT;
import io.github.fergoman123.fergotools.api.base.ModelResLocFT;
import io.github.fergoman123.fergotools.common.Tiles;
import io.github.fergoman123.fergotools.reference.ModInfo;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergoutil.helper.GRHelper;
import io.github.fergoman123.fergoutil.model.ModelHelper;
import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

import javax.lang.model.element.Name;

import static io.github.fergoman123.fergotools.api.content.FTContent.*;

public class ModRegister {
    private static void registerBlocks() {
        registerBlock(oreExperience, BlockNames.oreExperience);
        registerBlock(oreObsidian, BlockNames.oreObsidian);
        registerBlock(oreGemEmerald, BlockNames.oreGemEmerald);
        registerBlock(oreGemLapis, BlockNames.oreGemLapis);
        registerBlock(oreBronze, BlockNames.oreBronze);
        registerBlock(oreAdamantium, BlockNames.oreAdamantium);
        registerBlock(oreGemRedstone, BlockNames.oreGemRedstone);

        registerBlock(blockExperience, BlockNames.blockExperience);
        registerBlock(blockExpCollector, BlockNames.blockExpCollector);
        registerBlock(blockObsidian, BlockNames.blockObsidian);
        registerBlock(blockGemEmerald, BlockNames.blockGemEmerald);
        registerBlock(blockGemLapis, BlockNames.blockGemLapis);
        registerBlock(blockBronze, BlockNames.blockBronze);
        registerBlock(blockCoal, BlockNames.blockCoal);
        registerBlock(blockGlowstone, BlockNames.blockGlowstone);
        registerBlock(blockAdamantium, BlockNames.blockAdamantium);
        registerBlock(blockGemSilk, BlockNames.blockGemSilk);
        registerBlock(blockGemRedstone, BlockNames.blockGemRedstone);

        registerFurnace(quartzFurnaceIdle, quartzFurnaceActive, Tiles.TileQuartzFurnace.class, "quartzFurnace", BlockNames.quartzFurnaceIdle, BlockNames.quartzFurnaceActive);

        registerBlock(logObsidian, BlockNames.logObsidian);
        registerBlock(logEmerald, BlockNames.logEmerald);
        registerBlock(logLapis, BlockNames.logLapis);
        registerBlock(logBronze, BlockNames.logBronze);
        registerBlock(logCoal, BlockNames.logCoal);
        registerBlock(logGlowstone, BlockNames.logGlowstone);
        registerBlock(logAdamantium, BlockNames.logAdamantium);
        registerBlock(logSilk, BlockNames.logSilk);
        registerBlock(logRedstone, BlockNames.logRedstone);

        registerBlock(plankObsidian, BlockNames.plankObsidian);
        registerBlock(plankEmerald, BlockNames.plankEmerald);
        registerBlock(plankLapis, BlockNames.plankLapis);
        registerBlock(plankBronze, BlockNames.plankBronze);
        registerBlock(plankCoal, BlockNames.plankCoal);
        registerBlock(plankGlowstone, BlockNames.plankGlowstone);
        registerBlock(plankAdamantium, BlockNames.plankAdamantium);
        registerBlock(plankSilk, BlockNames.plankSilk);
        registerBlock(plankRedstone, BlockNames.plankRedstone);

        registerBlock(stairObsidian, BlockNames.stairObsidian);
        registerBlock(stairEmerald, BlockNames.stairEmerald);
        registerBlock(stairLapis, BlockNames.stairLapis);
        registerBlock(stairBronze, BlockNames.stairBronze);
        registerBlock(stairCoal, BlockNames.stairCoal);
        registerBlock(stairGlowstone, BlockNames.stairGlowstone);
        registerBlock(stairAdamantium, BlockNames.stairAdamantium);
        registerBlock(stairSilk, BlockNames.stairSilk);
        registerBlock(stairRedstone, BlockNames.stairRedstone);

        registerBlock(slabObsidianSingle, BlockNames.slabSingle[0]);
        registerBlock(slabEmeraldSingle, BlockNames.slabSingle[1]);
        registerBlock(slabLapisSingle, BlockNames.slabSingle[2]);
        registerBlock(slabBronzeSingle, BlockNames.slabSingle[3]);
        registerBlock(slabCoalSingle, BlockNames.slabSingle[4]);
        registerBlock(slabGlowstoneSingle, BlockNames.slabSingle[5]);
        registerBlock(slabAdamantiumSingle, BlockNames.slabSingle[6]);
        registerBlock(slabSilkSingle, BlockNames.slabSingle[7]);
        registerBlock(slabRedstoneSingle, BlockNames.slabSingle[8]);

        registerBlock(slabObsidianDouble, BlockNames.slabDouble[0]);
        registerBlock(slabEmeraldDouble, BlockNames.slabDouble[1]);
        registerBlock(slabLapisDouble, BlockNames.slabDouble[2]);
        registerBlock(slabBronzeDouble, BlockNames.slabDouble[3]);
        registerBlock(slabCoalDouble, BlockNames.slabDouble[4]);
        registerBlock(slabGlowstoneDouble, BlockNames.slabDouble[5]);
        registerBlock(slabAdamantiumDouble, BlockNames.slabDouble[6]);
        registerBlock(slabSilkDouble, BlockNames.slabDouble[7]);
        registerBlock(slabRedstoneDouble, BlockNames.slabDouble[8]);

        registerBlock(leavesObsidian, BlockNames.leavesObsidian);
        registerBlock(leavesEmerald, BlockNames.leavesEmerald);
        registerBlock(leavesLapis, BlockNames.leavesLapis);
        registerBlock(leavesBronze, BlockNames.leavesBronze);
        registerBlock(leavesCoal, BlockNames.leavesCoal);
        registerBlock(leavesGlowstone, BlockNames.leavesGlowstone);
        registerBlock(leavesAdamantium, BlockNames.leavesAdamantium);
        registerBlock(leavesSilk, BlockNames.leavesSilk);
        registerBlock(leavesRedstone, BlockNames.leavesRedstone);

        registerBlock(saplingFT, BlockNames.saplingFT, BlockNames.saplings);
    }

    private static void registerItems() {
        registerItem(quartzPickaxe, ItemNames.quartzPickaxe);
        registerItem(quartzShovel, ItemNames.quartzShovel);
        registerItem(quartzAxe, ItemNames.quartzAxe);
        registerItem(quartzHoe, ItemNames.quartzHoe);
        registerItem(quartzSword, ItemNames.quartzSword);

        registerItem(obsidianPickaxe, ItemNames.obsidianPickaxe);
        registerItem(obsidianShovel, ItemNames.obsidianShovel);
        registerItem(obsidianAxe, ItemNames.obsidianAxe);
        registerItem(obsidianHoe, ItemNames.obsidianHoe);
        registerItem(obsidianSword, ItemNames.obsidianSword);

        registerItem(emeraldPickaxe, ItemNames.emeraldPickaxe);
        registerItem(emeraldShovel, ItemNames.emeraldShovel);
        registerItem(emeraldAxe, ItemNames.emeraldAxe);
        registerItem(emeraldHoe, ItemNames.emeraldHoe);
        registerItem(emeraldSword, ItemNames.emeraldSword);

        registerItem(lapisPickaxe, ItemNames.lapisPickaxe);
        registerItem(lapisShovel, ItemNames.lapisShovel);
        registerItem(lapisAxe, ItemNames.lapisAxe);
        registerItem(lapisHoe, ItemNames.lapisHoe);
        registerItem(lapisSword, ItemNames.lapisSword);

        registerItem(bronzePickaxe, ItemNames.bronzePickaxe);
        registerItem(bronzeShovel, ItemNames.bronzeShovel);
        registerItem(bronzeAxe, ItemNames.bronzeAxe);
        registerItem(bronzeHoe, ItemNames.bronzeHoe);
        registerItem(bronzeSword, ItemNames.bronzeSword);

        registerItem(coalPickaxe, ItemNames.coalPickaxe);
        registerItem(coalShovel, ItemNames.coalShovel);
        registerItem(coalAxe, ItemNames.coalAxe);
        registerItem(coalHoe, ItemNames.coalHoe);
        registerItem(coalSword, ItemNames.coalSword);

        registerItem(glowstonePickaxe, ItemNames.glowstonePickaxe);
        registerItem(glowstoneShovel, ItemNames.glowstoneShovel);
        registerItem(glowstoneAxe, ItemNames.glowstoneAxe);
        registerItem(glowstoneHoe, ItemNames.glowstoneHoe);
        registerItem(glowstoneSword, ItemNames.glowstoneSword);

        registerItem(adamantiumPickaxe, ItemNames.adamantiumPickaxe);
        registerItem(adamantiumShovel, ItemNames.adamantiumShovel);
        registerItem(adamantiumAxe, ItemNames.adamantiumAxe);
        registerItem(adamantiumHoe, ItemNames.adamantiumHoe);
        registerItem(adamantiumSword, ItemNames.adamantiumSword);

        registerItem(silkPickaxe, ItemNames.silkPickaxe);
        registerItem(silkShovel, ItemNames.silkShovel);
        registerItem(silkAxe, ItemNames.silkAxe);
        registerItem(silkHoe, ItemNames.silkHoe);
        registerItem(silkSword, ItemNames.silkSword);

        registerItem(redstonePickaxe, ItemNames.redstonePickaxe);
        registerItem(redstoneShovel, ItemNames.redstoneShovel);
        registerItem(redstoneAxe, ItemNames.redstoneAxe);
        registerItem(redstoneHoe, ItemNames.redstoneHoe);
        registerItem(redstoneSword, ItemNames.redstoneSword);

        registerItem(ingotObsidian, ItemNames.ingotObsidian);
        registerItem(gemEmerald, ItemNames.gemEmerald);
        registerItem(gemLapis, ItemNames.gemLapis);
        registerItem(ingotBronze, ItemNames.ingotBronze);
        registerItem(ingotCoal, ItemNames.ingotCoal);
        registerItem(ingotGlowstone, ItemNames.ingotGlowstone);
        registerItem(ingotAdamantium, ItemNames.ingotAdamantium);
        registerItem(gemSilk, ItemNames.gemSilk);
        registerItem(gemRedstone, ItemNames.gemRedstone);
        registerItem(gemExp, ItemNames.gemExp);
        registerItem(gemExp2, ItemNames.gemExp2);
        registerItem(gemExp3, ItemNames.gemExp3);

        registerItem(staffExp, ItemNames.staffExpVariants[0]);
        registerItem(staffExp2, ItemNames.staffExpVariants[1]);
        registerItem(staffExp3, ItemNames.staffExpVariants[2]);

        registerItem(shardExp, ItemNames.shardExp);
        registerItem(expCollector, ItemNames.expCollector);

        registerItem(quartzHelmet, ItemNames.quartzHelmet);
        registerItem(quartzChestplate, ItemNames.quartzChestplate);
        registerItem(quartzLeggings, ItemNames.quartzLeggings);
        registerItem(quartzBoots, ItemNames.quartzBoots);

        registerItem(obsidianHelmet, ItemNames.obsidianHelmet);
        registerItem(obsidianChestplate, ItemNames.obsidianChestplate);
        registerItem(obsidianLeggings, ItemNames.obsidianLeggings);
        registerItem(obsidianBoots, ItemNames.obsidianBoots);

        registerItem(emeraldHelmet, ItemNames.emeraldHelmet);
        registerItem(emeraldChestplate, ItemNames.emeraldChestplate);
        registerItem(emeraldLeggings, ItemNames.emeraldLeggings);
        registerItem(emeraldBoots, ItemNames.emeraldBoots);

        registerItem(lapisHelmet, ItemNames.lapisHelmet);
        registerItem(lapisChestplate, ItemNames.lapisChestplate);
        registerItem(lapisLeggings, ItemNames.lapisLeggings);
        registerItem(lapisBoots, ItemNames.lapisBoots);

        registerItem(bronzeHelmet, ItemNames.bronzeHelmet);
        registerItem(bronzeChestplate, ItemNames.bronzeChestplate);
        registerItem(bronzeLeggings, ItemNames.bronzeLeggings);
        registerItem(bronzeBoots, ItemNames.bronzeBoots);

        registerItem(coalHelmet, ItemNames.coalHelmet);
        registerItem(coalChestplate, ItemNames.coalChestplate);
        registerItem(coalLeggings, ItemNames.coalLeggings);
        registerItem(coalBoots, ItemNames.coalBoots);

        registerItem(glowstoneHelmet, ItemNames.glowstoneHelmet);
        registerItem(glowstoneChestplate, ItemNames.glowstoneChestplate);
        registerItem(glowstoneLeggings, ItemNames.glowstoneLeggings);
        registerItem(glowstoneBoots, ItemNames.glowstoneBoots);

        registerItem(adamantiumHelmet, ItemNames.adamantiumHelmet);
        registerItem(adamantiumChestplate, ItemNames.adamantiumChestplate);
        registerItem(adamantiumLeggings, ItemNames.adamantiumLeggings);
        registerItem(adamantiumBoots, ItemNames.adamantiumBoots);

        registerItem(redstoneHelmet, ItemNames.redstoneHelmet);
        registerItem(redstoneChestplate, ItemNames.redstoneChestplate);
        registerItem(redstoneLeggings, ItemNames.redstoneLeggings);
        registerItem(redstoneBoots, ItemNames.redstoneBoots);

        registerBow(bowQuartz, ItemNames.bowQuartz[0], ItemNames.bowQuartz);
        registerBow(bowObsidian, ItemNames.bowObsidian[0], ItemNames.bowObsidian);
        registerBow(bowEmerald, ItemNames.bowEmerald[0], ItemNames.bowEmerald);
        registerBow(bowLapis, ItemNames.bowLapis[0], ItemNames.bowLapis);
        registerBow(bowBronze, ItemNames.bowBronze[0], ItemNames.bowBronze);
        registerBow(bowCoal, ItemNames.bowCoal[0], ItemNames.bowCoal);
        registerBow(bowGlowstone, ItemNames.bowGlowstone[0], ItemNames.bowGlowstone);
        registerBow(bowAdamantium, ItemNames.bowAdamantium[0], ItemNames.bowGlowstone);
        registerBow(bowSilk, ItemNames.bowSilk[0], ItemNames.bowSilk);
        registerBow(bowRedstone, ItemNames.bowRedstone[0], ItemNames.bowRedstone);

        registerItem(quartzShears, ItemNames.quartzShears);
        registerItem(obsidianShears, ItemNames.obsidianShears);
        registerItem(emeraldShears, ItemNames.emeraldShears);
        registerItem(lapisShears, ItemNames.lapisShears);
        registerItem(bronzeShears, ItemNames.bronzeShears);
        registerItem(coalShears, ItemNames.coalShears);
        registerItem(glowstoneShears, ItemNames.glowstoneShears);
        registerItem(adamantiumShears, ItemNames.adamantiumShears);
        registerItem(silkShears, ItemNames.silkShears);
        registerItem(redstoneShears, ItemNames.redstoneShears);

        registerItem(stickFT, ItemNames.stickFT);
    }


    public static void init() {
        registerBlocks();
        registerItems();
    }

    public static void registerBlock(Block block, String name)
    {
        if (block instanceof BlockOreFT)
        {
            BlockOreFT ore = (BlockOreFT)block;
            GameRegistry.registerBlock(ore, name);
            ModelHelper.registerBlockModel(ore, ModInfo.modid, name);
        }
        else
        {
            GRHelper.registerBlock(block, ModInfo.modid, name);
        }
    }

    public static void registerFurnace(BlockFurnaceFT idle, BlockFurnaceFT active, Class<? extends TileEntity> tileClass, String tileName, String idleName, String activeName)
    {
        GameRegistry.registerBlock(idle, idleName);
        GameRegistry.registerBlock(active, activeName);
        GameRegistry.registerTileEntity(tileClass, tileName);
        ModelHelper.registerBlockModel(idle, ModInfo.modid, idleName);
        ModelHelper.registerBlockModel(active, ModInfo.modid, activeName);
    }

    public static void registerItem(Item item, String name)
    {
        GRHelper.registerItem(item, ModInfo.modid, name);
    }

    public static void registerBow(ItemBowFT bow, String name, String[] bowPull)
    {
        GameRegistry.registerItem(bow, name);
        for (String pull: bowPull)
        {
            ModelHelper.getItemModelMesher().register(bow, 0, new ModelResLocFT(pull));
            ModelBakery.addVariantName(bow, name);
        }
    }
}

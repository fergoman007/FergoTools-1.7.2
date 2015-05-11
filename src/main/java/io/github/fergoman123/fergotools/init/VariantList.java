package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergoutil.model.ModelHelper.BlockVariant;
import io.github.fergoman123.fergoutil.model.ModelHelper.ItemModel;
import io.github.fergoman123.fergoutil.model.ModelHelper.ItemVariant;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class VariantList {
    public static final BlockVariant oreExperience = getBlockVariant(FTContent.oreExperience, BlockNames.oreExperience);
    public static final BlockVariant oreObsidian = getBlockVariant(FTContent.oreObsidian, BlockNames.oreObsidian);
    public static final BlockVariant oreGemEmerald = getBlockVariant(FTContent.oreGemEmerald, BlockNames.oreGemEmerald);
    public static final BlockVariant oreGemLapis = getBlockVariant(FTContent.oreGemLapis, BlockNames.oreGemLapis);
    public static final BlockVariant oreBronze = getBlockVariant(FTContent.oreBronze, BlockNames.oreBronze);
    public static final BlockVariant oreAdamantium = getBlockVariant(FTContent.oreAdamantium, BlockNames.oreAdamantium);
    public static final BlockVariant oreGemRedstone = getBlockVariant(FTContent.oreGemRedstone, BlockNames.oreGemRedstone);

    public static final BlockVariant blockExperience = getBlockVariant(FTContent.blockExperience, BlockNames.blockExperience);
    public static final BlockVariant blockExpCollector = getBlockVariant(FTContent.blockExpCollector, BlockNames.blockExpCollector);
    public static final BlockVariant blockObsidian = getBlockVariant(FTContent.blockObsidian, BlockNames.blockObsidian);
    public static final BlockVariant blockGemEmerald = getBlockVariant(FTContent.blockGemEmerald, BlockNames.blockGemEmerald);
    public static final BlockVariant blockGemLapis = getBlockVariant(FTContent.blockGemLapis, BlockNames.blockGemLapis);
    public static final BlockVariant blockBronze = getBlockVariant(FTContent.blockBronze, BlockNames.blockBronze);
    public static final BlockVariant blockCoal = getBlockVariant(FTContent.blockCoal, BlockNames.blockCoal);
    public static final BlockVariant blockGlowstone = getBlockVariant(FTContent.blockGlowstone, BlockNames.blockGlowstone);
    public static final BlockVariant blockAdamantium = getBlockVariant(FTContent.blockAdamantium, BlockNames.blockAdamantium);
    public static final BlockVariant blockGemSilk = getBlockVariant(FTContent.blockGemSilk, BlockNames.blockGemSilk);
    public static final BlockVariant blockGemRedstone = getBlockVariant(FTContent.blockGemRedstone, BlockNames.blockGemRedstone);

    public static final BlockVariant quartzFurnaceIdle = getBlockVariant(FTContent.quartzFurnaceIdle, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant obsidianFurnaceIdle = getBlockVariant(FTContent.obsidianFurnaceIdle, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant emeraldFurnaceIdle = getBlockVariant(FTContent.emeraldFurnaceIdle, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant lapisFurnaceIdle = getBlockVariant(FTContent.lapisFurnaceIdle, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant bronzeFurnaceIdle = getBlockVariant(FTContent.bronzeFurnaceIdle, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant coalFurnaceIdle = getBlockVariant(FTContent.coalFurnaceIdle, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant glowstoneFurnaceIdle = getBlockVariant(FTContent.glowstoneFurnaceIdle, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant adamantiumFurnaceIdle = getBlockVariant(FTContent.adamantiumFurnaceIdle, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant silkFurnaceIdle = getBlockVariant(FTContent.silkFurnaceIdle, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant redstoneFurnaceIdle = getBlockVariant(FTContent.redstoneFurnaceIdle, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant maceratorIdle = getBlockVariant(FTContent.maceratorIdle, BlockNames.quartzFurnaceIdle);

    public static final BlockVariant quartzFurnaceActive = getBlockVariant(FTContent.quartzFurnaceActive, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant obsidianFurnaceActive = getBlockVariant(FTContent.obsidianFurnaceActive, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant emeraldFurnaceActive = getBlockVariant(FTContent.emeraldFurnaceActive, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant lapisFurnaceActive = getBlockVariant(FTContent.lapisFurnaceActive, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant bronzeFurnaceActive = getBlockVariant(FTContent.bronzeFurnaceActive, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant coalFurnaceActive = getBlockVariant(FTContent.coalFurnaceActive, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant glowstoneFurnaceActive = getBlockVariant(FTContent.glowstoneFurnaceActive, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant adamantiumFurnaceActive = getBlockVariant(FTContent.adamantiumFurnaceActive, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant silkFurnaceActive = getBlockVariant(FTContent.silkFurnaceActive, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant redstoneFurnaceActive = getBlockVariant(FTContent.redstoneFurnaceActive, BlockNames.quartzFurnaceIdle);
//    public static final BlockVariant maceratorActive = getBlockVariant(FTContent.maceratorActive, BlockNames.quartzFurnaceIdle);
    //todo furnaces
    public static final BlockVariant logObsidian = getBlockVariant(FTContent.logObsidian, BlockNames.logObsidian);
    public static final BlockVariant logEmerald = getBlockVariant(FTContent.logEmerald, BlockNames.logEmerald);
    public static final BlockVariant logLapis = getBlockVariant(FTContent.logLapis, BlockNames.logLapis);
    public static final BlockVariant logBronze = getBlockVariant(FTContent.logBronze, BlockNames.logBronze);
    public static final BlockVariant logCoal = getBlockVariant(FTContent.logCoal, BlockNames.logCoal);
    public static final BlockVariant logGlowstone = getBlockVariant(FTContent.logGlowstone, BlockNames.logGlowstone);
    public static final BlockVariant logAdamantium = getBlockVariant(FTContent.logAdamantium, BlockNames.logAdamantium);
    public static final BlockVariant logSilk = getBlockVariant(FTContent.logSilk, BlockNames.logSilk);
    public static final BlockVariant logRedstone = getBlockVariant(FTContent.logRedstone, BlockNames.logRedstone);

    public static final BlockVariant plankObsidian = getBlockVariant(FTContent.plankObsidian, BlockNames.plankObsidian);
    public static final BlockVariant plankEmerald = getBlockVariant(FTContent.plankEmerald, BlockNames.plankEmerald);
    public static final BlockVariant plankLapis = getBlockVariant(FTContent.plankLapis, BlockNames.plankLapis);
    public static final BlockVariant plankBronze = getBlockVariant(FTContent.plankBronze, BlockNames.plankBronze);
    public static final BlockVariant plankCoal = getBlockVariant(FTContent.plankCoal, BlockNames.plankCoal);
    public static final BlockVariant plankGlowstone = getBlockVariant(FTContent.plankGlowstone, BlockNames.plankGlowstone);
    public static final BlockVariant plankAdamantium = getBlockVariant(FTContent.plankAdamantium, BlockNames.plankAdamantium);
    public static final BlockVariant plankSilk = getBlockVariant(FTContent.plankSilk, BlockNames.plankSilk);
    public static final BlockVariant plankRedstone = getBlockVariant(FTContent.plankRedstone, BlockNames.plankRedstone);

    public static final BlockVariant stairObsidian = getBlockVariant(FTContent.stairObsidian, BlockNames.stairObsidian);
    public static final BlockVariant stairEmerald = getBlockVariant(FTContent.stairEmerald, BlockNames.stairEmerald);
    public static final BlockVariant stairLapis = getBlockVariant(FTContent.stairLapis, BlockNames.stairLapis);
    public static final BlockVariant stairBronze = getBlockVariant(FTContent.stairBronze, BlockNames.stairBronze);
    public static final BlockVariant stairCoal = getBlockVariant(FTContent.stairCoal, BlockNames.stairCoal);
    public static final BlockVariant stairGlowstone = getBlockVariant(FTContent.stairGlowstone, BlockNames.stairGlowstone);
    public static final BlockVariant stairAdamantium = getBlockVariant(FTContent.stairAdamantium, BlockNames.stairAdamantium);
    public static final BlockVariant stairSilk = getBlockVariant(FTContent.stairSilk, BlockNames.stairSilk);
    public static final BlockVariant stairRedstone = getBlockVariant(FTContent.stairRedstone, BlockNames.stairRedstone);

    public static final ItemVariant quartzPickaxe = getItemVariant(FTContent.quartzPickaxe, ItemNames.quartzPickaxe);
    public static final ItemVariant quartzShovel = getItemVariant(FTContent.quartzShovel, ItemNames.quartzShovel);
    public static final ItemVariant quartzAxe = getItemVariant(FTContent.quartzAxe, ItemNames.quartzAxe);
    public static final ItemVariant quartzHoe = getItemVariant(FTContent.quartzHoe, ItemNames.quartzHoe);
    public static final ItemVariant quartzSword = getItemVariant(FTContent.quartzSword, ItemNames.quartzSword);

    public static final ItemVariant obsidianPickaxe = getItemVariant(FTContent.obsidianPickaxe, ItemNames.obsidianPickaxe);
    public static final ItemVariant obsidianShovel = getItemVariant(FTContent.obsidianShovel, ItemNames.obsidianShovel);
    public static final ItemVariant obsidianAxe = getItemVariant(FTContent.obsidianAxe, ItemNames.obsidianAxe);
    public static final ItemVariant obsidianHoe = getItemVariant(FTContent.obsidianHoe, ItemNames.obsidianHoe);
    public static final ItemVariant obsidianSword = getItemVariant(FTContent.obsidianSword, ItemNames.obsidianSword);

    public static final ItemVariant emeraldPickaxe = getItemVariant(FTContent.emeraldPickaxe, ItemNames.emeraldPickaxe);
    public static final ItemVariant emeraldShovel = getItemVariant(FTContent.emeraldShovel, ItemNames.emeraldShovel);
    public static final ItemVariant emeraldAxe = getItemVariant(FTContent.emeraldAxe, ItemNames.emeraldAxe);
    public static final ItemVariant emeraldHoe = getItemVariant(FTContent.emeraldHoe, ItemNames.emeraldHoe);
    public static final ItemVariant emeraldSword = getItemVariant(FTContent.emeraldSword, ItemNames.emeraldSword);

    public static final ItemVariant lapisPickaxe = getItemVariant(FTContent.lapisPickaxe, ItemNames.lapisPickaxe);
    public static final ItemVariant lapisShovel = getItemVariant(FTContent.lapisShovel, ItemNames.lapisShovel);
    public static final ItemVariant lapisAxe = getItemVariant(FTContent.lapisAxe, ItemNames.lapisAxe);
    public static final ItemVariant lapisHoe = getItemVariant(FTContent.lapisHoe, ItemNames.lapisHoe);
    public static final ItemVariant lapisSword = getItemVariant(FTContent.lapisSword, ItemNames.lapisSword);

    public static final ItemVariant bronzePickaxe = getItemVariant(FTContent.bronzePickaxe, ItemNames.bronzePickaxe);
    public static final ItemVariant bronzeShovel = getItemVariant(FTContent.bronzeShovel, ItemNames.bronzeShovel);
    public static final ItemVariant bronzeAxe = getItemVariant(FTContent.bronzeAxe, ItemNames.bronzeAxe);
    public static final ItemVariant bronzeHoe = getItemVariant(FTContent.bronzeHoe, ItemNames.bronzeHoe);
    public static final ItemVariant bronzeSword = getItemVariant(FTContent.bronzeSword, ItemNames.bronzeSword);

    public static final ItemVariant coalPickaxe = getItemVariant(FTContent.coalPickaxe, ItemNames.coalPickaxe);
    public static final ItemVariant coalShovel = getItemVariant(FTContent.coalShovel, ItemNames.coalShovel);
    public static final ItemVariant coalAxe = getItemVariant(FTContent.coalAxe, ItemNames.coalAxe);
    public static final ItemVariant coalHoe = getItemVariant(FTContent.coalHoe, ItemNames.coalHoe);
    public static final ItemVariant coalSword = getItemVariant(FTContent.coalSword, ItemNames.coalSword);

    public static final ItemVariant glowstonePickaxe = getItemVariant(FTContent.glowstonePickaxe, ItemNames.glowstonePickaxe);
    public static final ItemVariant glowstoneShovel = getItemVariant(FTContent.glowstoneShovel, ItemNames.glowstoneShovel);
    public static final ItemVariant glowstoneAxe = getItemVariant(FTContent.glowstoneAxe, ItemNames.glowstoneAxe);
    public static final ItemVariant glowstoneHoe = getItemVariant(FTContent.glowstoneHoe, ItemNames.glowstoneHoe);
    public static final ItemVariant glowstoneSword = getItemVariant(FTContent.glowstoneSword, ItemNames.glowstoneSword);

    public static final ItemVariant adamantiumPickaxe = getItemVariant(FTContent.adamantiumPickaxe, ItemNames.adamantiumPickaxe);
    public static final ItemVariant adamantiumShovel = getItemVariant(FTContent.adamantiumShovel, ItemNames.adamantiumShovel);
    public static final ItemVariant adamantiumAxe = getItemVariant(FTContent.adamantiumAxe, ItemNames.adamantiumAxe);
    public static final ItemVariant adamantiumHoe = getItemVariant(FTContent.adamantiumHoe, ItemNames.adamantiumHoe);
    public static final ItemVariant adamantiumSword = getItemVariant(FTContent.adamantiumSword, ItemNames.adamantiumSword);

    public static final ItemVariant silkPickaxe = getItemVariant(FTContent.silkPickaxe, ItemNames.silkPickaxe);
    public static final ItemVariant silkShovel = getItemVariant(FTContent.silkShovel, ItemNames.silkShovel);
    public static final ItemVariant silkAxe = getItemVariant(FTContent.silkAxe, ItemNames.silkAxe);
    public static final ItemVariant silkHoe = getItemVariant(FTContent.silkHoe, ItemNames.silkHoe);
    public static final ItemVariant silkSword = getItemVariant(FTContent.silkSword, ItemNames.silkSword);

    public static final ItemVariant redstonePickaxe = getItemVariant(FTContent.redstonePickaxe, ItemNames.redstonePickaxe);
    public static final ItemVariant redstoneShovel = getItemVariant(FTContent.redstoneShovel, ItemNames.redstoneShovel);
    public static final ItemVariant redstoneAxe = getItemVariant(FTContent.redstoneAxe, ItemNames.redstoneAxe);
    public static final ItemVariant redstoneHoe = getItemVariant(FTContent.redstoneHoe, ItemNames.redstoneHoe);
    public static final ItemVariant redstoneSword = getItemVariant(FTContent.redstoneSword, ItemNames.redstoneSword);

    public static final ItemVariant[] bowQuartz = getItemVariantArray(FTContent.bowQuartz, ItemNames.bowQuartz);
    public static final ItemVariant[] bowObsidian = getItemVariantArray(FTContent.bowObsidian, ItemNames.bowObsidian);
    public static final ItemVariant[] bowEmerald = getItemVariantArray(FTContent.bowEmerald, ItemNames.bowEmerald);
    public static final ItemVariant[] bowLapis = getItemVariantArray(FTContent.bowLapis, ItemNames.bowLapis);
    public static final ItemVariant[] bowBronze = getItemVariantArray(FTContent.bowBronze, ItemNames.bowBronze);
    public static final ItemVariant[] bowCoal = getItemVariantArray(FTContent.bowCoal, ItemNames.bowCoal);
    public static final ItemVariant[] bowGlowstone = getItemVariantArray(FTContent.bowGlowstone, ItemNames.bowGlowstone);
    public static final ItemVariant[] bowAdamantium = getItemVariantArray(FTContent.bowAdamantium, ItemNames.bowAdamantium);
    public static final ItemVariant[] bowSilk = getItemVariantArray(FTContent.bowSilk, ItemNames.bowSilk);
    public static final ItemVariant[] bowRedstone = getItemVariantArray(FTContent.bowRedstone, ItemNames.bowRedstone);

    public static final ItemVariant[] stickFT = getItemVariantArray(FTContent.stickFT, ItemNames.sticks);

    public static ItemVariant getItemVariant(Item item, String name) {
        return new ItemVariant(item, name);
    }

    public static BlockVariant getBlockVariant(Block block, String name) {
        return new BlockVariant(block, name);
    }

    public static ItemVariant[] getItemVariantArray(Item item, String[] models) {
        ItemVariant[] itemVariants = new ItemVariant[models.length];
        for (int i = 0; i < itemVariants.length; i++) {
            itemVariants[i] = new ItemVariant(item, models[i]);
        }
        return itemVariants;
    }
}

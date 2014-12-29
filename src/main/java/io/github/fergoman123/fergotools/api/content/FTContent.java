package io.github.fergoman123.fergotools.api.content;

import io.github.fergoman123.fergotools.core.block.BlockFergoGlass;
import io.github.fergoman123.fergotools.core.block.BlockFergoWorkbench;
import io.github.fergoman123.fergotools.core.block.furnace.*;
import io.github.fergoman123.fergotools.core.block.log.*;
import io.github.fergoman123.fergotools.core.block.ore.*;
import io.github.fergoman123.fergotools.core.block.plank.*;
import io.github.fergoman123.fergotools.core.block.stair.*;
import io.github.fergoman123.fergotools.core.block.storage.*;
import io.github.fergoman123.fergotools.core.item.*;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.*;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemShearsFT;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;

public class FTContent
{
    public static final Block oreExperience = new BlockOreExperience().setBlockName(BlockNames.oreExperience);
    public static final Block oreObsidian = new BlockOreObsidian().setBlockName(BlockNames.oreObsidian);
    public static final Block oreGemEmerald = new BlockOreEmerald().setBlockName(BlockNames.oreGemEmerald);
    public static final Block oreGemLapis = new BlockOreLapis().setBlockName(BlockNames.oreGemLapis);
    public static final Block oreBronze = new BlockOreBronze().setBlockName(BlockNames.oreBronze);
    public static final Block oreAdamantium = new BlockOreAdamantium().setBlockName(BlockNames.oreAdamantium);
    public static final Block oreGemRedstone = new BlockOreRedstone().setBlockName(BlockNames.oreGemRedstone);

    public static final Block blockExperience = new BlockExperience().setBlockName(BlockNames.blockExperience);
    public static final Block blockExpCollector = new BlockExpCollector().setBlockName(BlockNames.blockExpCollector);
    public static final Block blockObsidian = new BlockObsidianStorage().setBlockName(BlockNames.blockObsidian);
    public static final Block blockEmerald = new BlockEmeraldCrystal().setBlockName(BlockNames.blockGemEmerald);
    public static final Block blockLapis = new BlockLapisCrystal().setBlockName(BlockNames.blockGemLapis);
    public static final Block blockBronze = new BlockBronze().setBlockName(BlockNames.blockBronze);
    public static final Block blockCoal = new BlockCoal().setBlockName(BlockNames.blockCoal);
    public static final Block blockGlowstone = new BlockGlowstoneStorage().setBlockName(BlockNames.blockGlowstone);
    public static final Block blockAdamantium = new BlockAdamantium().setBlockName(BlockNames.blockAdamantium);
    public static final Block blockGemSilk = new BlockSilkGem().setBlockName(BlockNames.blockGemSilk);
    public static final Block blockRedstone = new BlockRedstone().setBlockName(BlockNames.blockGemRedstone);

    public static final Block quartzFurnaceIdle = new BlockQuartzFurnace(false).setBlockName(BlockNames.quartzFurnaceIdle);
    public static final Block obsidianFurnaceIdle = new BlockObsidianFurnace(false).setBlockName(BlockNames.obsidianFurnaceIdle);
    public static final Block emeraldFurnaceIdle = new BlockEmeraldFurnace(false).setBlockName(BlockNames.emeraldFurnaceIdle);
    public static final Block lapisFurnaceIdle = new BlockLapisFurnace(false).setBlockName(BlockNames.lapisFurnaceIdle);
    public static final Block bronzeFurnaceIdle = new BlockBronzeFurnace(false).setBlockName(BlockNames.bronzeFurnaceIdle);
    public static final Block coalFurnaceIdle = new BlockCoalFurnace(false).setBlockName(BlockNames.coalFurnaceIdle);
    public static final Block glowstoneFurnaceIdle = new BlockGlowstoneFurnace(false).setBlockName(BlockNames.glowstoneFurnaceIdle);
    public static final Block adamantiumFurnaceIdle = new BlockAdamantiumFurnace(false).setBlockName(BlockNames.adamantiumFurnaceIdle);
    public static final Block silkFurnaceIdle = new BlockSilkFurnace(false).setBlockName(BlockNames.silkFurnaceIdle);
    public static final Block redstoneFurnaceIdle = new BlockRedstoneFurnace(false).setBlockName(BlockNames.redstoneFurnaceIdle);
    public static final Block maceratorIdle = new BlockMacerator(false).setBlockName(BlockNames.maceratorIdle);

    public static final Block quartzFurnaceActive = new BlockQuartzFurnace(true).setBlockName(BlockNames.quartzFurnaceActive);
    public static final Block obsidianFurnaceActive = new BlockObsidianFurnace(true).setBlockName(BlockNames.obsidianFurnaceActive);
    public static final Block emeraldFurnaceActive = new BlockEmeraldFurnace(true).setBlockName(BlockNames.emeraldFurnaceActive);
    public static final Block lapisFurnaceActive = new BlockLapisFurnace(true).setBlockName(BlockNames.lapisFurnaceActive);
    public static final Block bronzeFurnaceActive = new BlockBronzeFurnace(true).setBlockName(BlockNames.bronzeFurnaceActive);
    public static final Block coalFurnaceActive = new BlockCoalFurnace(true).setBlockName(BlockNames.coalFurnaceActive);
    public static final Block glowstoneFurnaceActive = new BlockGlowstoneFurnace(true).setBlockName(BlockNames.glowstoneFurnaceActive);
    public static final Block adamantiumFurnaceActive = new BlockAdamantiumFurnace(true).setBlockName(BlockNames.adamantiumFurnaceActive);
    public static final Block silkFurnaceActive = new BlockSilkFurnace(true).setBlockName(BlockNames.silkFurnaceActive);
    public static final Block redstoneFurnaceActive = new BlockRedstoneFurnace(true).setBlockName(BlockNames.redstoneFurnaceActive);
    public static final Block maceratorActive = new BlockMacerator(true).setBlockName(BlockNames.maceratorActive);

    public static final Block logObsidian = new BlockLogObsidian().setBlockName(BlockNames.logObsidian);
    public static final Block logEmerald = new BlockLogEmerald().setBlockName(BlockNames.logEmerald);
    public static final Block logLapis = new BlockLogLapis().setBlockName(BlockNames.logLapis);
    public static final Block logBronze = new BlockLogBronze().setBlockName(BlockNames.logBronze);
    public static final Block logCoal = new BlockLogCoal().setBlockName(BlockNames.logCoal);
    public static final Block logGlowstone = new BlockLogGlowstone().setBlockName(BlockNames.logGlowstone);
    public static final Block logAdamantium = new BlockLogAdamantium().setBlockName(BlockNames.logAdamantium);
    public static final Block logSilk = new BlockLogSilk().setBlockName(BlockNames.logSilk);
    public static final Block logRedstone = new BlockLogRedstone().setBlockName(BlockNames.logRedstone);

    public static final Block plankObsidian = new BlockPlankObsidian().setBlockName(BlockNames.plankObsidian);
    public static final Block plankEmerald = new BlockPlankEmerald().setBlockName(BlockNames.plankEmerald);
    public static final Block plankLapis = new BlockPlankLapis().setBlockName(BlockNames.plankLapis);
    public static final Block plankBronze = new BlockPlankBronze().setBlockName(BlockNames.plankBronze);
    public static final Block plankCoal = new BlockPlankCoal().setBlockName(BlockNames.plankCoal);
    public static final Block plankGlowstone = new BlockPlankGlowstone().setBlockName(BlockNames.plankGlowstone);
    public static final Block plankAdamantium = new BlockPlankAdamantium().setBlockName(BlockNames.plankAdamantium);
    public static final Block plankSilk = new BlockPlankSilk().setBlockName(BlockNames.plankSilk);
    public static final Block plankRedstone = new BlockPlankRedstone().setBlockName(BlockNames.plankRedstone);

    public static final Block stairObsidian = new BlockStairObsidian().setBlockName(BlockNames.stairObsidian);
    public static final Block stairEmerald = new BlockStairEmerald().setBlockName(BlockNames.stairEmerald);
    public static final Block stairLapis = new BlockStairLapis().setBlockName(BlockNames.stairLapis);
    public static final Block stairBronze = new BlockStairBronze().setBlockName(BlockNames.stairBronze);
    public static final Block stairCoal = new BlockStairCoal().setBlockName(BlockNames.stairCoal);
    public static final Block stairGlowstone = new BlockStairGlowstone().setBlockName(BlockNames.stairGlowstone);
    public static final Block stairAdamantium = new BlockStairAdamantium().setBlockName(BlockNames.stairAdamantium);
    public static final Block stairSilk = new BlockStairSilk().setBlockName(BlockNames.stairSilk);
    public static final Block stairRedstone = new BlockStairRedstone().setBlockName(BlockNames.stairRedstone);

    public static final Block slabObsidianSingle = new BlockSlabFT(false).setBlockName(BlockNames.slabSingle[0]);
    public static final Block slabEmeraldSingle = new BlockSlabFT(false).setBlockName(BlockNames.slabSingle[1]);
    public static final Block slabLapisSingle = new BlockSlabFT(false).setBlockName(BlockNames.slabSingle[2]);
    public static final Block slabBronzeSingle = new BlockSlabFT(false).setBlockName(BlockNames.slabSingle[3]);
    public static final Block slabCoalSingle = new BlockSlabFT(false).setBlockName(BlockNames.slabSingle[4]);
    public static final Block slabGlowstoneSingle = new BlockSlabFT(false).setBlockName(BlockNames.slabSingle[5]);
    public static final Block slabAdamantiumSingle = new BlockSlabFT(false).setBlockName(BlockNames.slabSingle[6]);
    public static final Block slabSilkSingle = new BlockSlabFT(false).setBlockName(BlockNames.slabSingle[7]);
    public static final Block slabRedstoneSingle = new BlockSlabFT(false).setBlockName(BlockNames.slabSingle[8]);

    public static final Block slabObsidianDouble = new BlockSlabFT(false).setBlockName(BlockNames.slabDouble[0]);
    public static final Block slabEmeraldDouble = new BlockSlabFT(false).setBlockName(BlockNames.slabDouble[1]);
    public static final Block slabLapisDouble = new BlockSlabFT(false).setBlockName(BlockNames.slabDouble[2]);
    public static final Block slabBronzeDouble = new BlockSlabFT(false).setBlockName(BlockNames.slabDouble[3]);
    public static final Block slabCoalDouble = new BlockSlabFT(false).setBlockName(BlockNames.slabDouble[4]);
    public static final Block slabGlowstoneDouble = new BlockSlabFT(false).setBlockName(BlockNames.slabDouble[5]);
    public static final Block slabAdamantiumDouble = new BlockSlabFT(false).setBlockName(BlockNames.slabDouble[6]);
    public static final Block slabSilkDouble = new BlockSlabFT(false).setBlockName(BlockNames.slabDouble[7]);
    public static final Block slabRedstoneDouble = new BlockSlabFT(false).setBlockName(BlockNames.slabDouble[8]);

    public static final Block leavesObsidian = new BlockLeavesFT(Locale.types[0]).setBlockName(BlockNames.leaves[0]);
    public static final Block leavesEmerald = new BlockLeavesFT(Locale.types[1]).setBlockName(BlockNames.leaves[1]);
    public static final Block leavesLapis = new BlockLeavesFT(Locale.types[2]).setBlockName(BlockNames.leaves[2]);
    public static final Block leavesBronze = new BlockLeavesFT(Locale.types[3]).setBlockName(BlockNames.leaves[3]);
    public static final Block leavesCoal = new BlockLeavesFT(Locale.types[4]).setBlockName(BlockNames.leaves[4]);
    public static final Block leavesGlowstone = new BlockLeavesFT(Locale.types[5]).setBlockName(BlockNames.leaves[5]);
    public static final Block leavesAdamantium = new BlockLeavesFT(Locale.types[6]).setBlockName(BlockNames.leaves[6]);
    public static final Block leavesSilk = new BlockLeavesFT(Locale.types[7]).setBlockName(BlockNames.leaves[7]);
    public static final Block leavesRedstone = new BlockLeavesFT(Locale.types[8]).setBlockName(BlockNames.leaves[8]);

    public static final Block saplingObsidian = new BlockSaplingFT(logObsidian, leavesObsidian).setBlockName(BlockNames.saplings[0]);
    public static final Block saplingEmerald = new BlockSaplingFT(logEmerald, leavesEmerald).setBlockName(BlockNames.saplings[0]);
    public static final Block saplingLapis = new BlockSaplingFT(logLapis, leavesLapis).setBlockName(BlockNames.saplings[0]);
    public static final Block saplingBronze = new BlockSaplingFT(logBronze, leavesBronze).setBlockName(BlockNames.saplings[0]);
    public static final Block saplingCoal = new BlockSaplingFT(logCoal, leavesCoal).setBlockName(BlockNames.saplings[0]);
    public static final Block saplingGlowstone = new BlockSaplingFT(logGlowstone, leavesGlowstone).setBlockName(BlockNames.saplings[0]);
    public static final Block saplingAdamantium = new BlockSaplingFT(logAdamantium, leavesAdamantium).setBlockName(BlockNames.saplings[0]);
    public static final Block saplingSilk = new BlockSaplingFT(logSilk, leavesSilk).setBlockName(BlockNames.saplings[0]);
    public static final Block saplingRedstone = new BlockSaplingFT(logRedstone, leavesRedstone).setBlockName(BlockNames.saplings[0]);

    public static final Block fergoWorkbench = new BlockFergoWorkbench().setBlockName(BlockNames.fergoWorkbench);

    public static final Block blockFergoGlass = new BlockFergoGlass().setBlockName(BlockNames.blockFergoGlass);

    public static final Item quartzPickaxe = new ItemQuartzPickaxe().setUnlocalizedName(ItemNames.quartzPickaxe);
    public static final Item quartzShovel = new ItemQuartzShovel().setUnlocalizedName(ItemNames.quartzShovel);
    public static final Item quartzAxe = new ItemQuartzAxe().setUnlocalizedName(ItemNames.quartzAxe);
    public static final Item quartzHoe = new ItemQuartzHoe().setUnlocalizedName(ItemNames.quartzHoe);
    public static final Item quartzSword = new ItemQuartzSword().setUnlocalizedName(ItemNames.quartzSword);

    public static final Item obsidianPickaxe = new ItemObsidianPickaxe().setUnlocalizedName(ItemNames.obsidianPickaxe);
    public static final Item obsidianShovel = new ItemObsidianShovel().setUnlocalizedName(ItemNames.obsidianShovel);
    public static final Item obsidianAxe = new ItemObsidianAxe().setUnlocalizedName(ItemNames.obsidianAxe);
    public static final Item obsidianHoe = new ItemObsidianHoe().setUnlocalizedName(ItemNames.obsidianHoe);
    public static final Item obsidianSword = new ItemObsidianSword().setUnlocalizedName(ItemNames.obsidianSword);

    public static final Item emeraldPickaxe = new ItemEmeraldPickaxe().setUnlocalizedName(ItemNames.emeraldPickaxe);
    public static final Item emeraldShovel = new ItemEmeraldShovel().setUnlocalizedName(ItemNames.emeraldShovel);
    public static final Item emeraldAxe = new ItemEmeraldAxe().setUnlocalizedName(ItemNames.emeraldAxe);
    public static final Item emeraldHoe = new ItemEmeraldHoe().setUnlocalizedName(ItemNames.emeraldHoe);
    public static final Item emeraldSword = new ItemEmeraldSword().setUnlocalizedName(ItemNames.emeraldSword);

    public static final Item lapisPickaxe = new ItemLapisPickaxe().setUnlocalizedName(ItemNames.lapisPickaxe);
    public static final Item lapisShovel = new ItemLapisShovel().setUnlocalizedName(ItemNames.lapisShovel);
    public static final Item lapisAxe = new ItemLapisAxe().setUnlocalizedName(ItemNames.lapisAxe);
    public static final Item lapisHoe = new ItemLapisHoe().setUnlocalizedName(ItemNames.lapisHoe);
    public static final Item lapisSword = new ItemLapisSword().setUnlocalizedName(ItemNames.lapisSword);

    public static final Item bronzePickaxe = new ItemBronzePickaxe().setUnlocalizedName(ItemNames.bronzePickaxe);
    public static final Item bronzeShovel = new ItemBronzeShovel().setUnlocalizedName(ItemNames.bronzeShovel);
    public static final Item bronzeAxe = new ItemBronzeAxe().setUnlocalizedName(ItemNames.bronzeAxe);
    public static final Item bronzeHoe = new ItemBronzeHoe().setUnlocalizedName(ItemNames.bronzeHoe);
    public static final Item bronzeSword = new ItemBronzeSword().setUnlocalizedName(ItemNames.bronzeSword);

    public static final Item coalPickaxe = new ItemCoalPickaxe().setUnlocalizedName(ItemNames.coalPickaxe);
    public static final Item coalShovel = new ItemCoalShovel().setUnlocalizedName(ItemNames.coalShovel);
    public static final Item coalAxe = new ItemCoalAxe().setUnlocalizedName(ItemNames.coalAxe);
    public static final Item coalHoe = new ItemCoalHoe().setUnlocalizedName(ItemNames.coalHoe);
    public static final Item coalSword = new ItemCoalSword().setUnlocalizedName(ItemNames.coalSword);

    public static final Item glowstonePickaxe = new ItemGlowstonePickaxe().setUnlocalizedName(ItemNames.glowstonePickaxe);
    public static final Item glowstoneShovel = new ItemGlowstoneShovel().setUnlocalizedName(ItemNames.glowstoneShovel);
    public static final Item glowstoneAxe = new ItemGlowstoneAxe().setUnlocalizedName(ItemNames.glowstoneAxe);
    public static final Item glowstoneHoe = new ItemGlowstoneHoe().setUnlocalizedName(ItemNames.glowstoneHoe);
    public static final Item glowstoneSword = new ItemGlowstoneSword().setUnlocalizedName(ItemNames.glowstoneSword);

    public static final Item adamantiumPickaxe = new ItemAdamantiumPickaxe().setUnlocalizedName(ItemNames.adamantiumPickaxe);
    public static final Item adamantiumShovel = new ItemAdamantiumShovel().setUnlocalizedName(ItemNames.adamantiumShovel);
    public static final Item adamantiumAxe = new ItemAdamantiumAxe().setUnlocalizedName(ItemNames.adamantiumAxe);
    public static final Item adamantiumHoe = new ItemAdamantiumHoe().setUnlocalizedName(ItemNames.adamantiumHoe);
    public static final Item adamantiumSword = new ItemAdamantiumSword().setUnlocalizedName(ItemNames.adamantiumSword);

    public static final Item silkPickaxe = new ItemSilkPickaxe().setUnlocalizedName(ItemNames.silkPickaxe);
    public static final Item silkShovel = new ItemSilkShovel().setUnlocalizedName(ItemNames.silkShovel);
    public static final Item silkAxe = new ItemSilkAxe().setUnlocalizedName(ItemNames.silkAxe);
    public static final Item silkHoe = new ItemSilkHoe().setUnlocalizedName(ItemNames.silkHoe);
    public static final Item silkSword = new ItemSilkSword().setUnlocalizedName(ItemNames.silkSword);

    public static final Item redstonePickaxe = new ItemRedstonePickaxe().setUnlocalizedName(ItemNames.redstonePickaxe);
    public static final Item redstoneShovel = new ItemRedstoneShovel().setUnlocalizedName(ItemNames.redstoneShovel);
    public static final Item redstoneAxe = new ItemRedstoneAxe().setUnlocalizedName(ItemNames.redstoneAxe);
    public static final Item redstoneHoe = new ItemRedstoneHoe().setUnlocalizedName(ItemNames.redstoneHoe);
    public static final Item redstoneSword = new ItemRedstoneSword().setUnlocalizedName(ItemNames.redstoneSword);

    public static final Item ingotObsidian = new ItemObsidianIngot().setUnlocalizedName(ItemNames.ingotObsidian);
    public static final Item gemEmerald = new ItemEmeraldGem().setUnlocalizedName(ItemNames.gemEmerald);
    public static final Item gemLapis = new ItemLapisGem().setUnlocalizedName(ItemNames.gemLapis);
    public static final Item ingotBronze = new ItemBronzeIngot().setUnlocalizedName(ItemNames.ingotBronze);
    public static final Item ingotCoal = new ItemCoalIngot().setUnlocalizedName(ItemNames.ingotCoal);
    public static final Item ingotGlowstone = new ItemGlowstoneIngot().setUnlocalizedName(ItemNames.ingotGlowstone);
    public static final Item ingotAdamantium = new ItemAdamantiumIngot().setUnlocalizedName(ItemNames.ingotAdamantium);
    public static final Item gemSilk = new ItemSilkGem().setUnlocalizedName(ItemNames.gemSilk);
    public static final Item gemRedstone = new ItemRedstoneGem().setUnlocalizedName(ItemNames.gemRedstone);
    public static final Item gemExp = new ItemGemExp().setUnlocalizedName(ItemNames.gemExp);
    public static final Item gemExp2 = new ItemGemExp2().setUnlocalizedName(ItemNames.gemExp2);
    public static final Item gemExp3 = new ItemGemExp3().setUnlocalizedName(ItemNames.gemExp3);

    public static final Item staffExp = new ItemStaffExp().setUnlocalizedName(ItemNames.staffExp);

    public static final Item shardExp = new ItemExpShard().setUnlocalizedName(ItemNames.shardExp);
    public static final Item expCollector = new ItemExpCollector().setUnlocalizedName(ItemNames.expCollector);

    public static final Item quartzHelmet = new ItemArmorQuartz(ArmorType.HELMET);
    public static final Item quartzChestplate = new ItemArmorQuartz(ArmorType.CHEST);
    public static final Item quartzLeggings = new ItemArmorQuartz(ArmorType.LEGS);
    public static final Item quartzBoots = new ItemArmorQuartz(ArmorType.BOOTS);

    public static final Item obsidianHelmet = new ItemArmorObsidian(ArmorType.HELMET);
    public static final Item obsidianChestplate = new ItemArmorObsidian(ArmorType.CHEST);
    public static final Item obsidianLeggings = new ItemArmorObsidian(ArmorType.LEGS);
    public static final Item obsidianBoots = new ItemArmorObsidian(ArmorType.BOOTS);

    public static final Item emeraldHelmet = new ItemArmorEmerald(ArmorType.HELMET);
    public static final Item emeraldChestplate = new ItemArmorEmerald(ArmorType.CHEST);
    public static final Item emeraldLeggings = new ItemArmorEmerald(ArmorType.LEGS);
    public static final Item emeraldBoots = new ItemArmorEmerald(ArmorType.BOOTS);

    public static final Item lapisHelmet = new ItemArmorLapis(ArmorType.HELMET);
    public static final Item lapisChestplate = new ItemArmorLapis(ArmorType.CHEST);
    public static final Item lapisLeggings = new ItemArmorLapis(ArmorType.LEGS);
    public static final Item lapisBoots = new ItemArmorLapis(ArmorType.BOOTS);

    public static final Item bronzeHelmet = new ItemArmorBronze(ArmorType.HELMET);
    public static final Item bronzeChestplate = new ItemArmorBronze(ArmorType.CHEST);
    public static final Item bronzeLeggings = new ItemArmorBronze(ArmorType.LEGS);
    public static final Item bronzeBoots = new ItemArmorBronze(ArmorType.BOOTS);

    public static final Item coalHelmet = new ItemArmorCoal(ArmorType.HELMET);
    public static final Item coalChestplate = new ItemArmorCoal(ArmorType.CHEST);
    public static final Item coalLeggings = new ItemArmorCoal(ArmorType.LEGS);
    public static final Item coalBoots = new ItemArmorCoal(ArmorType.BOOTS);

    public static final Item glowstoneHelmet = new ItemArmorGlowstone(ArmorType.HELMET);
    public static final Item glowstoneChestplate = new ItemArmorGlowstone(ArmorType.CHEST);
    public static final Item glowstoneLeggings = new ItemArmorGlowstone(ArmorType.LEGS);
    public static final Item glowstoneBoots = new ItemArmorGlowstone(ArmorType.BOOTS);

    public static final Item adamantiumHelmet = new ItemArmorAdamantium(ArmorType.HELMET);
    public static final Item adamantiumChestplate = new ItemArmorAdamantium(ArmorType.CHEST);
    public static final Item adamantiumLeggings = new ItemArmorAdamantium(ArmorType.LEGS);
    public static final Item adamantiumBoots = new ItemArmorAdamantium(ArmorType.BOOTS);

    public static final Item redstoneHelmet = new ItemArmorRedstone(ArmorType.HELMET);
    public static final Item redstoneChestplate = new ItemArmorRedstone(ArmorType.CHEST);
    public static final Item redstoneLeggings = new ItemArmorRedstone(ArmorType.LEGS);
    public static final Item redstoneBoots = new ItemArmorRedstone(ArmorType.BOOTS);

    public static final Item bowQuartz = new ItemBowFT(TM.quartz, Locale.types[0], Items.quartz).setUnlocalizedName(ItemNames.bowQuartz);
    public static final Item bowObsidian = new ItemBowFT(TM.obsidian, Locale.types[1], ingotObsidian).setUnlocalizedName(ItemNames.bowObsidian);
    public static final Item bowEmerald = new ItemBowFT(TM.emerald, Locale.types[2], gemEmerald).setUnlocalizedName(ItemNames.bowEmerald);
    public static final Item bowLapis = new ItemBowFT(TM.lapis, Locale.types[3], gemLapis).setUnlocalizedName(ItemNames.bowLapis);
    public static final Item bowBronze = new ItemBowFT(TM.bronze, Locale.types[4], ingotBronze).setUnlocalizedName(ItemNames.bowBronze);
    public static final Item bowCoal = new ItemBowFT(TM.coal, Locale.types[5], ingotCoal).setUnlocalizedName(ItemNames.bowCoal);
    public static final Item bowGlowstone = new ItemBowFT(TM.glowstone, Locale.types[5], ingotGlowstone).setUnlocalizedName(ItemNames.bowGlowstone);
    public static final Item bowAdamantium = new ItemBowFT(TM.adamantium, Locale.types[6], ingotAdamantium).setUnlocalizedName(ItemNames.bowAdamantium);

    public static final Item quartzShears = new ItemShearsFT(TM.quartz, Items.quartz).setUnlocalizedName(ItemNames.quartzShears);
    public static final Item obsidianShears = new ItemShearsFT(TM.obsidian, ingotObsidian).setUnlocalizedName(ItemNames.obsidianShears);
    public static final Item emeraldShears = new ItemShearsFT(TM.emerald, gemEmerald).setUnlocalizedName(ItemNames.emeraldShears);
    public static final Item lapisShears = new ItemShearsFT(TM.lapis, gemLapis).setUnlocalizedName(ItemNames.lapisShears);
    public static final Item bronzeShears = new ItemShearsFT(TM.bronze, ingotBronze).setUnlocalizedName(ItemNames.bronzeShears);
    public static final Item coalShears = new ItemShearsFT(TM.coal, ingotCoal).setUnlocalizedName(ItemNames.coalShears);
    public static final Item glowstoneShears = new ItemShearsFT(TM.glowstone, ingotGlowstone).setUnlocalizedName(ItemNames.glowstoneShears);
    public static final Item adamantiumShears = new ItemShearsFT(TM.adamantium, ingotAdamantium).setUnlocalizedName(ItemNames.adamantiumShears);
    public static final Item silkShears = new ItemShearsFT(TM.silk, gemSilk).setUnlocalizedName(ItemNames.silkShears);
    public static final Item redstoneShears = new ItemShearsFT(TM.redstone, gemRedstone).setUnlocalizedName(ItemNames.redstoneShears);

    public static final Item stickObsidian = new ItemStickFT().setUnlocalizedName(ItemNames.stickObsidian);
    public static final Item stickEmerald = new ItemStickFT().setUnlocalizedName(ItemNames.stickEmerald);
    public static final Item stickLapis = new ItemStickFT().setUnlocalizedName(ItemNames.stickLapis);
    public static final Item stickBronze = new ItemStickFT().setUnlocalizedName(ItemNames.stickBronze);
    public static final Item stickCoal = new ItemStickFT().setUnlocalizedName(ItemNames.stickCoal);
    public static final Item stickGlowstone = new ItemStickFT().setUnlocalizedName(ItemNames.stickGlowstone);
    public static final Item stickAdamantium = new ItemStickFT().setUnlocalizedName(ItemNames.stickAdamantium);
    public static final Item stickSilk = new ItemStickFT().setUnlocalizedName(ItemNames.stickSilk);
    public static final Item stickRedstone = new ItemStickFT().setUnlocalizedName(ItemNames.stickRedstone);
}
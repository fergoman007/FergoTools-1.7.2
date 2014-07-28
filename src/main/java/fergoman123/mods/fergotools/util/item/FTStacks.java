package fergoman123.mods.fergotools.util.item;

import fergoman123.mods.fergotools.block.storage.*;
import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.ItemExpCollector;
import fergoman123.mods.fergotools.item.armor.*;
import fergoman123.mods.fergotools.item.axe.*;
import fergoman123.mods.fergotools.item.bow.*;
import fergoman123.mods.fergotools.item.hoe.*;
import fergoman123.mods.fergotools.item.materials.*;
import fergoman123.mods.fergotools.item.pickaxe.*;
import fergoman123.mods.fergotools.item.shovel.*;
import fergoman123.mods.fergotools.item.sword.*;
import fergoman123.mods.fergoutil.helper.ItemStackHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class FTStacks {

    public static final ItemStack stickStack = new ItemStack(Items.stick);
    public static final ItemStack quartzStack = new ItemStack(Items.quartz);
    public static final ItemStack stringStack = new ItemStack(Items.string);
    public static final ItemStack quartzBlock = new ItemStack(Blocks.quartz_block);

    public static final ItemStack obsidianIngot9 = new ItemStack(ModItems.ingotObsidian, 9);
    public static final ItemStack emeraldCrystal9 = new ItemStack(ModItems.emeraldCrystal, 9);
    public static final ItemStack lapisCrystal9 = new ItemStack(ModItems.lapisCrystal, 9);
    public static final ItemStack bronzeIngot9 = new ItemStack(ModItems.ingotBronze, 9);
    public static final ItemStack adamantiumIngot9 = new ItemStack(ModItems.ingotAdamantium, 9);
    public static final ItemStack coalIngot9 = new ItemStack(ModItems.ingotCoal, 9);
    public static final ItemStack glowstoneIngot9 = new ItemStack(ModItems.ingotGlowstone, 9);
    public static final ItemStack silkGem9 = new ItemStack(ModItems.silkGem, 9);
    public static final ItemStack expShard9 = new ItemStack(ModItems.expShard);
    public static final ItemStack redstoneCrystal9 = new ItemStack(ModItems.redstoneCrystal, 9);

    public static final ItemStack expCollectorHalfStack = ItemStackHelper.getItemStackForItem(ModItems.expCollector, 32);

    public static final ItemStack expShard5 = new ItemStack(ModItems.expShard, 5);

    public static final ItemStack obsidianIngot = new ItemStack(ModItems.ingotObsidian);
    public static final ItemStack emeraldCrystal = new ItemStack(ModItems.emeraldCrystal);
    public static final ItemStack lapisCrystal = new ItemStack(ModItems.lapisCrystal);
    public static final ItemStack bronzeIngot = new ItemStack(ModItems.ingotBronze);
    public static final ItemStack coalIngot = new ItemStack(ModItems.ingotCoal);
    public static final ItemStack glowstoneIngot = new ItemStack(ModItems.ingotGlowstone);
    public static final ItemStack adamantiumIngot = new ItemStack(ModItems.ingotAdamantium);
    public static final ItemStack expShard = new ItemStack(ModItems.expShard);
    public static final ItemStack silkGem = new ItemStack(ModItems.silkGem);
    public static final ItemStack redstoneCrystal = new ItemStack(ModItems.redstoneCrystal);
    public static final ItemStack expCollector = new ItemStack(ModItems.expCollector);

    public static final ItemStack blockObsidian = new ItemStack(ModBlocks.blockObsidian);
    public static final ItemStack blockEmeraldCrystal = new ItemStack(ModBlocks.blockEmeraldCrystal);
    public static final ItemStack blockLapisCrystal = new ItemStack(ModBlocks.blockLapisCrystal);
    public static final ItemStack blockBronze = new ItemStack(ModBlocks.blockBronze);
    public static final ItemStack blockCoal = new ItemStack(ModBlocks.blockCoal);
    public static final ItemStack blockGlowstone = new ItemStack(ModBlocks.blockGlowstone);
    public static final ItemStack blockExperience = new ItemStack(ModBlocks.blockExperience);
    public static final ItemStack blockSilkGem = new ItemStack(ModBlocks.blockSilkGem);
    public static final ItemStack blockAdamantium = new ItemStack(ModBlocks.blockAdamantium);
    public static final ItemStack blockRedstone = new ItemStack(ModBlocks.blockRedstoneCrystal);

    public static final ItemStack oreObsidian = new ItemStack(ModBlocks.oreObsidian);
    public static final ItemStack oreEmeraldCrystal = new ItemStack(ModBlocks.oreEmeraldCrystal);
    public static final ItemStack oreLapisCrystal = new ItemStack(ModBlocks.oreLapisCrystal);
    public static final ItemStack oreBronze = new ItemStack(ModBlocks.oreBronze);
    public static final ItemStack oreExperience = new ItemStack(ModBlocks.oreExperience);
    public static final ItemStack oreAdamantium = new ItemStack(ModBlocks.oreAdamantium);
    public static final ItemStack oreRedstoneCrystal = new ItemStack(ModBlocks.oreRedstoneCrystal);

    public static final ItemStack quartzPickaxe = new ItemStack(ModItems.quartzPickaxe);
    public static final ItemStack quartzShovel = new ItemStack(ModItems.quartzShovel);
    public static final ItemStack quartzAxe = new ItemStack(ModItems.quartzAxe);
    public static final ItemStack quartzHoe = new ItemStack(ModItems.quartzHoe);
    public static final ItemStack quartzSword = new ItemStack(ModItems.quartzSword);

    public static final ItemStack obsidianPickaxe = new ItemStack(ModItems.obsidianPickaxe);
    public static final ItemStack obsidianShovel = new ItemStack(ModItems.obsidianHoe);
    public static final ItemStack obsidianAxe = new ItemStack(ModItems.obsidianAxe);
    public static final ItemStack obsidianHoe = new ItemStack(ModItems.obsidianHoe);
    public static final ItemStack obsidianSword = new ItemStack(ModItems.obsidianSword);

    public static final ItemStack emeraldPickaxe = new ItemStack(ModItems.emeraldPickaxe);
    public static final ItemStack emeraldShovel = new ItemStack(ModItems.emeraldShovel);
    public static final ItemStack emeraldAxe = new ItemStack(ModItems.emeraldAxe);
    public static final ItemStack emeraldHoe = new ItemStack(ModItems.emeraldHoe);
    public static final ItemStack emeraldSword = new ItemStack(ModItems.emeraldSword);

    public static final ItemStack lapisPickaxe = new ItemStack(ModItems.lapisPickaxe);
    public static final ItemStack lapisShovel = new ItemStack(ModItems.lapisShovel);
    public static final ItemStack lapisAxe = new ItemStack(ModItems.lapisAxe);
    public static final ItemStack lapisHoe = new ItemStack(ModItems.lapisHoe);
    public static final ItemStack lapisSword = new ItemStack(ModItems.lapisSword);

    public static final ItemStack bronzePickaxe = new ItemStack(ModItems.bronzePickaxe);
    public static final ItemStack bronzeShovel = new ItemStack(ModItems.bronzeShovel);
    public static final ItemStack bronzeAxe = new ItemStack(ModItems.bronzeAxe);
    public static final ItemStack bronzeHoe = new ItemStack(ModItems.bronzeHoe);
    public static final ItemStack bronzeSword = new ItemStack(ModItems.bronzeSword);

    public static final ItemStack coalPickaxe = new ItemStack(ModItems.coalPickaxe);
    public static final ItemStack coalShovel = new ItemStack(ModItems.coalShovel);
    public static final ItemStack coalAxe = new ItemStack(ModItems.coalAxe);
    public static final ItemStack coalHoe = new ItemStack(ModItems.coalHoe);
    public static final ItemStack coalSword = new ItemStack(ModItems.coalSword);

    public static final ItemStack glowstonePickaxe = new ItemStack(ModItems.glowstonePickaxe);
    public static final ItemStack glowstoneShovel = new ItemStack(ModItems.glowstoneShovel);
    public static final ItemStack glowstoneAxe = new ItemStack(ModItems.glowstoneAxe);
    public static final ItemStack glowstoneHoe = new ItemStack(ModItems.glowstoneHoe);
    public static final ItemStack glowstoneSword = new ItemStack(ModItems.glowstoneSword);

    public static final ItemStack adamantiumPickaxe = new ItemStack(ModItems.adamantiumPickaxe);
    public static final ItemStack adamantiumShovel = new ItemStack(ModItems.adamantiumShovel);
    public static final ItemStack adamantiumAxe = new ItemStack(ModItems.adamantiumAxe);
    public static final ItemStack adamantiumHoe = new ItemStack(ModItems.adamantiumHoe);
    public static final ItemStack adamantiumSword = new ItemStack(ModItems.adamantiumSword);

    public static final ItemStack silkPickaxe = new ItemStack(ModItems.silkPickaxe);
    public static final ItemStack silkShovel = new ItemStack(ModItems.silkShovel);
    public static final ItemStack silkAxe = new ItemStack(ModItems.silkAxe);
    public static final ItemStack silkHoe = new ItemStack(ModItems.silkHoe);
    public static final ItemStack silkSword = new ItemStack(ModItems.silkSword);

    public static final ItemStack redstonePickaxe = new ItemStack(ModItems.redstonePickaxe);
    public static final ItemStack redstoneShovel = new ItemStack(ModItems.redstoneShovel);
    public static final ItemStack redstoneAxe = new ItemStack(ModItems.redstoneAxe);
    public static final ItemStack redstoneHoe = new ItemStack(ModItems.redstoneHoe);
    public static final ItemStack redstoneSword = new ItemStack(ModItems.redstoneSword);

    public static final ItemStack quartzFurnaceIdle = new ItemStack(ModBlocks.quartzFurnaceIdle);
    public static final ItemStack obsidianFurnaceIdle = new ItemStack(ModBlocks.obsidianFurnaceIdle);
    public static final ItemStack emeraldCrystalFurnaceIdle = new ItemStack(ModBlocks.emeraldFurnaceIdle);
    public static final ItemStack lapisCrystalFurnaceIdle = new ItemStack(ModBlocks.lapisFurnaceIdle);
    public static final ItemStack bronzeFurnaceIdle = new ItemStack(ModBlocks.bronzeFurnaceIdle);
    public static final ItemStack coalFurnaceIdle = new ItemStack(ModBlocks.coalFurnaceIdle);
    public static final ItemStack glowstoneFurnaceIdle = new ItemStack(ModBlocks.glowstoneFurnaceIdle);
    public static final ItemStack adamantiumFurnaceIdle = new ItemStack(ModBlocks.adamantiumFurnaceIdle);
    public static final ItemStack silkFurnaceIdle = new ItemStack(ModBlocks.silkFurnaceIdle);
    public static final ItemStack redstoneFurnaceIdle = new ItemStack(ModBlocks.redstoneFurnaceIdle);
    public static final ItemStack maceratorIdle = new ItemStack(ModBlocks.maceratorIdle);

    public static final ItemStack quartzFurnaceActive = new ItemStack(ModBlocks.quartzFurnaceActive);
    public static final ItemStack obsidianFurnaceActive = new ItemStack(ModBlocks.obsidianFurnaceActive);
    public static final ItemStack emeraldCrystalFurnaceActive = new ItemStack(ModBlocks.emeraldFurnaceActive);
    public static final ItemStack lapisCrystalFurnaceActive = new ItemStack(ModBlocks.lapisFurnaceActive);
    public static final ItemStack bronzeFurnaceActive = new ItemStack(ModBlocks.bronzeFurnaceActive);
    public static final ItemStack coalFurnaceActive = new ItemStack(ModBlocks.coalFurnaceActive);
    public static final ItemStack glowstoneFurnaceActive = new ItemStack(ModBlocks.glowstoneFurnaceActive);
    public static final ItemStack adamantiumFurnaceActive = new ItemStack(ModBlocks.adamantiumFurnaceActive);
    public static final ItemStack silkFurnaceActive = new ItemStack(ModBlocks.silkFurnaceActive);
    public static final ItemStack redstoneFurnaceActive = new ItemStack(ModBlocks.redstoneFurnaceActive);
    public static final ItemStack maceratorActive = new ItemStack(ModBlocks.maceratorActive);

    public static final ItemStack quartzHelmet = new ItemStack(ModItems.quartzHelmet);
    public static final ItemStack quartzChestplate = new ItemStack(ModItems.quartzChestplate);
    public static final ItemStack quartzLeggings = new ItemStack(ModItems.quartzLeggings);
    public static final ItemStack quartzBoots = new ItemStack(ModItems.quartzBoots);

    public static final ItemStack obsidianHelmet = new ItemStack(ModItems.obsidianHelmet);
    public static final ItemStack obsidianChestplate = new ItemStack(ModItems.obsidianChestplate);
    public static final ItemStack obsidianLeggings = new ItemStack(ModItems.obsidianLeggings);
    public static final ItemStack obsidianBoots = new ItemStack(ModItems.obsidianBoots);

    public static final ItemStack emeraldHelmet = new ItemStack(ModItems.emeraldHelmet);
    public static final ItemStack emeraldChestplate = new ItemStack(ModItems.emeraldChestplate);
    public static final ItemStack emeraldLeggings = new ItemStack(ModItems.emeraldLeggings);
    public static final ItemStack emeraldBoots = new ItemStack(ModItems.emeraldBoots);

    public static final ItemStack lapisHelmet = new ItemStack(ModItems.lapisHelmet);
    public static final ItemStack lapisChestplate = new ItemStack(ModItems.lapisChestplate);
    public static final ItemStack lapisLeggings = new ItemStack(ModItems.lapisLeggings);
    public static final ItemStack lapisBoots = new ItemStack(ModItems.lapisBoots);

    public static final ItemStack bronzeHelmet = new ItemStack(ModItems.bronzeHelmet);
    public static final ItemStack bronzeChestplate = new ItemStack(ModItems.bronzeChestplate);
    public static final ItemStack bronzeLeggings = new ItemStack(ModItems.bronzeLeggings);
    public static final ItemStack bronzeBoots = new ItemStack(ModItems.bronzeBoots);

    public static final ItemStack coalHelmet = new ItemStack(ModItems.coalHelmet);
    public static final ItemStack coalChestplate = new ItemStack(ModItems.coalChestplate);
    public static final ItemStack coalLeggings = new ItemStack(ModItems.coalLeggings);
    public static final ItemStack coalBoots = new ItemStack(ModItems.coalBoots);

    public static final ItemStack glowstoneHelmet = new ItemStack(ModItems.glowstoneHelmet);
    public static final ItemStack glowstoneChestplate = new ItemStack(ModItems.glowstoneChestplate);
    public static final ItemStack glowstoneLeggings = new ItemStack(ModItems.glowstoneLeggings);
    public static final ItemStack glowstoneBoots = new ItemStack(ModItems.glowstoneBoots);

    public static final ItemStack redstoneHelmet = new ItemStack(ModItems.redstoneHelmet);
    public static final ItemStack redstoneChestplate = new ItemStack(ModItems.redstoneChestplate);
    public static final ItemStack redstoneLeggings = new ItemStack(ModItems.redstoneLeggings);
    public static final ItemStack redstoneBoots = new ItemStack(ModItems.redstoneBoots);

    public static final ItemStack quartzBow = new ItemStack(ModItems.bowQuartz);
    public static final ItemStack obsidianBow = new ItemStack(ModItems.bowObsidian);
    public static final ItemStack emeraldBow = new ItemStack(ModItems.bowEmerald);
    public static final ItemStack lapisBow = new ItemStack(ModItems.bowLapis);
    public static final ItemStack bronzeBow = new ItemStack(ModItems.bowBronze);
    public static final ItemStack coalBow = new ItemStack(ModItems.bowCoal);
    public static final ItemStack glowstoneBow = new ItemStack(ModItems.bowGlowstone);
    public static final ItemStack adamantiumBow = new ItemStack(ModItems.bowAdamantium);
}

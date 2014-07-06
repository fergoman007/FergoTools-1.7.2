package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.item.ItemExpCollector;
import fergoman123.mods.fergotools.item.armor.*;
import fergoman123.mods.fergotools.item.axe.*;
import fergoman123.mods.fergotools.item.bow.*;
import fergoman123.mods.fergotools.item.hoe.*;
import fergoman123.mods.fergotools.item.materials.*;
import fergoman123.mods.fergotools.item.pickaxe.*;
import fergoman123.mods.fergotools.item.shovel.*;
import fergoman123.mods.fergotools.item.sword.*;
import fergoman123.mods.fergotools.lib.strings.ArmorStrings;
import fergoman123.mods.fergotools.lib.strings.BowStrings;
import fergoman123.mods.fergotools.lib.strings.ItemStrings;
import fergoman123.mods.fergotools.lib.strings.ToolStrings;
import fergoman123.mods.fergoutil.helper.RegisterHelper;

public class ModItems{

    public static void init()
	{
        RegisterHelper.registerItem(ItemQuartzPickaxe.instance, ToolStrings.quartzPickaxe);
        RegisterHelper.registerItem(ItemQuartzShovel.instance, ToolStrings.quartzShovel);
        RegisterHelper.registerItem(ItemQuartzAxe.instance, ToolStrings.quartzAxe);
        RegisterHelper.registerItem(ItemQuartzHoe.instance, ToolStrings.quartzHoe);
        RegisterHelper.registerItem(ItemQuartzSword.instance, ToolStrings.quartzSword);

        RegisterHelper.registerItem(ItemObsidianPickaxe.instance, ToolStrings.obsidianPickaxe);
        RegisterHelper.registerItem(ItemObsidianShovel.instance, ToolStrings.obsidianShovel);
        RegisterHelper.registerItem(ItemObsidianAxe.instance, ToolStrings.obsidianAxe);
        RegisterHelper.registerItem(ItemObsidianHoe.instance, ToolStrings.obsidianHoe);
        RegisterHelper.registerItem(ItemObsidianSword.instance, ToolStrings.obsidianSword);

        RegisterHelper.registerItem(ItemEmeraldPickaxe.instance, ToolStrings.emeraldPickaxe);
        RegisterHelper.registerItem(ItemEmeraldShovel.instance, ToolStrings.emeraldShovel);
        RegisterHelper.registerItem(ItemEmeraldAxe.instance, ToolStrings.emeraldAxe);
        RegisterHelper.registerItem(ItemEmeraldHoe.instance, ToolStrings.emeraldHoe);
        RegisterHelper.registerItem(ItemEmeraldSword.instance, ToolStrings.emeraldSword);

        RegisterHelper.registerItem(ItemLapisPickaxe.instance, ToolStrings.lapisPickaxe);
        RegisterHelper.registerItem(ItemLapisShovel.instance, ToolStrings.lapisShovel);
        RegisterHelper.registerItem(ItemLapisAxe.instance, ToolStrings.lapisAxe);
        RegisterHelper.registerItem(ItemLapisHoe.instance, ToolStrings.lapisHoe);
        RegisterHelper.registerItem(ItemLapisSword.instance, ToolStrings.lapisSword);

        RegisterHelper.registerItem(ItemBronzePickaxe.instance, ToolStrings.bronzePickaxe);
        RegisterHelper.registerItem(ItemBronzeShovel.instance, ToolStrings.bronzeShovel);
        RegisterHelper.registerItem(ItemBronzeAxe.instance, ToolStrings.bronzeAxe);
        RegisterHelper.registerItem(ItemBronzeHoe.instance, ToolStrings.bronzeHoe);
        RegisterHelper.registerItem(ItemBronzeSword.instance, ToolStrings.bronzeSword);

        RegisterHelper.registerItem(ItemCoalPickaxe.instance, ToolStrings.coalPickaxe);
        RegisterHelper.registerItem(ItemCoalShovel.instance, ToolStrings.coalShovel);
        RegisterHelper.registerItem(ItemCoalAxe.instance, ToolStrings.coalAxe);
        RegisterHelper.registerItem(ItemCoalHoe.instance, ToolStrings.coalHoe);
        RegisterHelper.registerItem(ItemCoalSword.instance, ToolStrings.coalSword);

        RegisterHelper.registerItem(ItemGlowstonePickaxe.instance, ToolStrings.glowstonePickaxe);
        RegisterHelper.registerItem(ItemGlowstoneShovel.instance, ToolStrings.glowstoneShovel);
        RegisterHelper.registerItem(ItemGlowstoneAxe.instance, ToolStrings.glowstoneAxe);
        RegisterHelper.registerItem(ItemGlowstoneHoe.instance, ToolStrings.glowstoneHoe);
        RegisterHelper.registerItem(ItemGlowstoneSword.instance, ToolStrings.glowstoneSword);

        RegisterHelper.registerItem(ItemAdamantiumPickaxe.instance, ToolStrings.adamantiumPickaxe);
        RegisterHelper.registerItem(ItemAdamantiumShovel.instance, ToolStrings.adamantiumShovel);
        RegisterHelper.registerItem(ItemAdamantiumAxe.instance, ToolStrings.adamantiumAxe);
        RegisterHelper.registerItem(ItemAdamantiumHoe.instance, ToolStrings.adamantiumHoe);
        RegisterHelper.registerItem(ItemAdamantiumSword.instance, ToolStrings.adamantiumSword);

        RegisterHelper.registerItem(ItemSilkPickaxe.instance, ToolStrings.silkPickaxe);
        RegisterHelper.registerItem(ItemSilkShovel.instance, ToolStrings.silkShovel);
        RegisterHelper.registerItem(ItemSilkAxe.instance, ToolStrings.silkAxe);
        RegisterHelper.registerItem(ItemSilkHoe.instance, ToolStrings.silkHoe);
        RegisterHelper.registerItem(ItemSilkSword.instance, ToolStrings.silkSword);

        RegisterHelper.registerItem(ItemRedstonePickaxe.instance, ToolStrings.redstonePickaxe);
        RegisterHelper.registerItem(ItemRedstoneShovel.instance, ToolStrings.redstoneShovel);
        RegisterHelper.registerItem(ItemRedstoneAxe.instance, ToolStrings.redstoneAxe);
        RegisterHelper.registerItem(ItemRedstoneHoe.instance, ToolStrings.redstoneHoe);
        RegisterHelper.registerItem(ItemRedstoneSword.instance, ToolStrings.redstoneSword);

        RegisterHelper.registerItem(ItemObsidianIngot.instance, ItemStrings.ingotObsidian);
        RegisterHelper.registerItem(ItemEmeraldCrystal.instance, ItemStrings.emeraldCrystal);
        RegisterHelper.registerItem(ItemLapisCrystal.instance, ItemStrings.lapisCrystal);
        RegisterHelper.registerItem(ItemBronzeIngot.instance, ItemStrings.ingotBronze);
        RegisterHelper.registerItem(ItemCoalIngot.instance, ItemStrings.ingotCoal);
        RegisterHelper.registerItem(ItemGlowstoneIngot.instance, ItemStrings.ingotGlowstone);
        RegisterHelper.registerItem(ItemAdamantiumIngot.instance, ItemStrings.ingotAdamantium);
        RegisterHelper.registerItem(ItemSilkGem.instance, ItemStrings.silkGem);
        RegisterHelper.registerItem(ItemRedstoneCrystal.instance, ItemStrings.redstoneCrystal);
        RegisterHelper.registerItem(ItemExpShard.instance, ItemStrings.expShard);

        RegisterHelper.registerItem(ItemArmorQuartz.instanceHelmet, ArmorStrings.quartzHelmet);
        RegisterHelper.registerItem(ItemArmorQuartz.instanceChest, ArmorStrings.quartzChest);
        RegisterHelper.registerItem(ItemArmorQuartz.instanceLegs, ArmorStrings.quartzLegs);
        RegisterHelper.registerItem(ItemArmorQuartz.instanceBoots, ArmorStrings.quartzBoots);

        RegisterHelper.registerItem(ItemArmorObsidian.instanceHelmet, ArmorStrings.obsidianHelmet);
        RegisterHelper.registerItem(ItemArmorObsidian.instanceChest, ArmorStrings.obsidianChest);
        RegisterHelper.registerItem(ItemArmorObsidian.instanceLegs, ArmorStrings.obsidianLegs);
        RegisterHelper.registerItem(ItemArmorObsidian.instanceBoots, ArmorStrings.obsidianBoots);

        RegisterHelper.registerItem(ItemArmorEmerald.instanceHelmet, ArmorStrings.emeraldHelmet);
        RegisterHelper.registerItem(ItemArmorEmerald.instanceChest, ArmorStrings.emeraldChest);
        RegisterHelper.registerItem(ItemArmorEmerald.instanceLegs, ArmorStrings.emeraldLegs);
        RegisterHelper.registerItem(ItemArmorEmerald.instanceBoots, ArmorStrings.emeraldBoots);

        RegisterHelper.registerItem(ItemArmorLapis.instanceHelmet, ArmorStrings.lapisHelmet);
        RegisterHelper.registerItem(ItemArmorLapis.instanceChest, ArmorStrings.lapisChest);
        RegisterHelper.registerItem(ItemArmorLapis.instanceLegs, ArmorStrings.lapisLegs);
        RegisterHelper.registerItem(ItemArmorLapis.instanceBoots, ArmorStrings.lapisBoots);

        RegisterHelper.registerItem(ItemArmorBronze.instanceHelmet, ArmorStrings.bronzeHelmet);
        RegisterHelper.registerItem(ItemArmorBronze.instanceChest, ArmorStrings.bronzeChest);
        RegisterHelper.registerItem(ItemArmorBronze.instanceLegs, ArmorStrings.bronzeLegs);
        RegisterHelper.registerItem(ItemArmorBronze.instanceBoots, ArmorStrings.bronzeBoots);

        RegisterHelper.registerItem(ItemArmorCoal.instanceHelmet, ArmorStrings.coalHelmet);
        RegisterHelper.registerItem(ItemArmorCoal.instanceChest, ArmorStrings.coalChest);
        RegisterHelper.registerItem(ItemArmorCoal.instanceLegs, ArmorStrings.coalLegs);
        RegisterHelper.registerItem(ItemArmorCoal.instanceBoots, ArmorStrings.coalBoots);

        RegisterHelper.registerItem(ItemArmorGlowstone.instanceHelmet, ArmorStrings.glowstoneHelmet);
        RegisterHelper.registerItem(ItemArmorGlowstone.instanceChest, ArmorStrings.glowstoneChest);
        RegisterHelper.registerItem(ItemArmorGlowstone.instanceLegs, ArmorStrings.glowstoneLegs);
        RegisterHelper.registerItem(ItemArmorGlowstone.instanceBoots, ArmorStrings.glowstoneBoots);

        RegisterHelper.registerItem(ItemArmorRedstone.instanceHelmet, ArmorStrings.redstoneHelmet);
        RegisterHelper.registerItem(ItemArmorRedstone.instanceChest, ArmorStrings.redstoneChest);
        RegisterHelper.registerItem(ItemArmorRedstone.instanceLegs, ArmorStrings.redstoneLegs);
        RegisterHelper.registerItem(ItemArmorRedstone.instanceBoots, ArmorStrings.redstoneBoots);

        RegisterHelper.registerItem(ItemArmorAdamantium.instanceHelmet, ArmorStrings.adamantiumHelmet);
        RegisterHelper.registerItem(ItemArmorAdamantium.instanceChest, ArmorStrings.adamantiumChest);
        RegisterHelper.registerItem(ItemArmorAdamantium.instanceLegs, ArmorStrings.adamantiumLegs);
        RegisterHelper.registerItem(ItemArmorAdamantium.instanceBoots, ArmorStrings.adamantiumBoots);

        RegisterHelper.registerItem(ItemQuartzBow.instance, BowStrings.bowQuartz);
        RegisterHelper.registerItem(ItemObsidianBow.instance, BowStrings.bowObsidian);
        RegisterHelper.registerItem(ItemEmeraldBow.instance, BowStrings.bowEmerald);
        RegisterHelper.registerItem(ItemLapisBow.instance, BowStrings.bowLapis);
        RegisterHelper.registerItem(ItemBronzeBow.instance, BowStrings.bowBronze);
        RegisterHelper.registerItem(ItemCoalBow.instance, BowStrings.bowCoal);
        RegisterHelper.registerItem(ItemGlowstoneBow.instance, BowStrings.bowGlowstone);
        RegisterHelper.registerItem(ItemAdamantiumBow.instance, BowStrings.bowAdamantium);

        RegisterHelper.registerItem(ItemExpCollector.instance, ItemStrings.expCollector);
	}
}

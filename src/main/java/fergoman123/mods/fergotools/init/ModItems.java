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
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergoutil.helper.RegisterHelper;

public class ModItems
{
    public static void init()
	{
        RegisterHelper.registerItem(ItemQuartzPickaxe.instance, Names.Items.quartzPickaxe);
        RegisterHelper.registerItem(ItemQuartzShovel.instance, Names.Items.quartzShovel);
        RegisterHelper.registerItem(ItemQuartzAxe.instance, Names.Items.quartzAxe);
        RegisterHelper.registerItem(ItemQuartzHoe.instance, Names.Items.quartzHoe);
        RegisterHelper.registerItem(ItemQuartzSword.instance, Names.Items.quartzSword);

        RegisterHelper.registerItem(ItemObsidianPickaxe.instance, Names.Items.obsidianPickaxe);
        RegisterHelper.registerItem(ItemObsidianShovel.instance, Names.Items.obsidianShovel);
        RegisterHelper.registerItem(ItemObsidianAxe.instance, Names.Items.obsidianAxe);
        RegisterHelper.registerItem(ItemObsidianHoe.instance, Names.Items.obsidianHoe);
        RegisterHelper.registerItem(ItemObsidianSword.instance, Names.Items.obsidianSword);

        RegisterHelper.registerItem(ItemEmeraldPickaxe.instance, Names.Items.emeraldPickaxe);
        RegisterHelper.registerItem(ItemEmeraldShovel.instance, Names.Items.emeraldShovel);
        RegisterHelper.registerItem(ItemEmeraldAxe.instance, Names.Items.emeraldAxe);
        RegisterHelper.registerItem(ItemEmeraldHoe.instance, Names.Items.emeraldHoe);
        RegisterHelper.registerItem(ItemEmeraldSword.instance, Names.Items.emeraldSword);

        RegisterHelper.registerItem(ItemLapisPickaxe.instance, Names.Items.lapisPickaxe);
        RegisterHelper.registerItem(ItemLapisShovel.instance, Names.Items.lapisShovel);
        RegisterHelper.registerItem(ItemLapisAxe.instance, Names.Items.lapisAxe);
        RegisterHelper.registerItem(ItemLapisHoe.instance, Names.Items.lapisHoe);
        RegisterHelper.registerItem(ItemLapisSword.instance, Names.Items.lapisSword);

        RegisterHelper.registerItem(ItemBronzePickaxe.instance, Names.Items.bronzePickaxe);
        RegisterHelper.registerItem(ItemBronzeShovel.instance, Names.Items.bronzeShovel);
        RegisterHelper.registerItem(ItemBronzeAxe.instance, Names.Items.bronzeAxe);
        RegisterHelper.registerItem(ItemBronzeHoe.instance, Names.Items.bronzeHoe);
        RegisterHelper.registerItem(ItemBronzeSword.instance, Names.Items.bronzeSword);

        RegisterHelper.registerItem(ItemCoalPickaxe.instance, Names.Items.coalPickaxe);
        RegisterHelper.registerItem(ItemCoalShovel.instance, Names.Items.coalShovel);
        RegisterHelper.registerItem(ItemCoalAxe.instance, Names.Items.coalAxe);
        RegisterHelper.registerItem(ItemCoalHoe.instance, Names.Items.coalHoe);
        RegisterHelper.registerItem(ItemCoalSword.instance, Names.Items.coalSword);

        RegisterHelper.registerItem(ItemGlowstonePickaxe.instance, Names.Items.glowstonePickaxe);
        RegisterHelper.registerItem(ItemGlowstoneShovel.instance, Names.Items.glowstoneShovel);
        RegisterHelper.registerItem(ItemGlowstoneAxe.instance, Names.Items.glowstoneAxe);
        RegisterHelper.registerItem(ItemGlowstoneHoe.instance, Names.Items.glowstoneHoe);
        RegisterHelper.registerItem(ItemGlowstoneSword.instance, Names.Items.glowstoneSword);

        RegisterHelper.registerItem(ItemAdamantiumPickaxe.instance, Names.Items.adamantiumPickaxe);
        RegisterHelper.registerItem(ItemAdamantiumShovel.instance, Names.Items.adamantiumShovel);
        RegisterHelper.registerItem(ItemAdamantiumAxe.instance, Names.Items.adamantiumAxe);
        RegisterHelper.registerItem(ItemAdamantiumHoe.instance, Names.Items.adamantiumHoe);
        RegisterHelper.registerItem(ItemAdamantiumSword.instance, Names.Items.adamantiumSword);

        RegisterHelper.registerItem(ItemSilkPickaxe.instance, Names.Items.silkPickaxe);
        RegisterHelper.registerItem(ItemSilkShovel.instance, Names.Items.silkShovel);
        RegisterHelper.registerItem(ItemSilkAxe.instance, Names.Items.silkAxe);
        RegisterHelper.registerItem(ItemSilkHoe.instance, Names.Items.silkHoe);
        RegisterHelper.registerItem(ItemSilkSword.instance, Names.Items.silkSword);

        RegisterHelper.registerItem(ItemRedstonePickaxe.instance, Names.Items.redstonePickaxe);
        RegisterHelper.registerItem(ItemRedstoneShovel.instance, Names.Items.redstoneShovel);
        RegisterHelper.registerItem(ItemRedstoneAxe.instance, Names.Items.redstoneAxe);
        RegisterHelper.registerItem(ItemRedstoneHoe.instance, Names.Items.redstoneHoe);
        RegisterHelper.registerItem(ItemRedstoneSword.instance, Names.Items.redstoneSword);

        RegisterHelper.registerItem(ItemObsidianIngot.instance, Names.Items.ingotObsidian);
        RegisterHelper.registerItem(ItemEmeraldCrystal.instance, Names.Items.emeraldCrystal);
        RegisterHelper.registerItem(ItemLapisCrystal.instance, Names.Items.lapisCrystal);
        RegisterHelper.registerItem(ItemBronzeIngot.instance, Names.Items.ingotBronze);
        RegisterHelper.registerItem(ItemCoalIngot.instance, Names.Items.ingotCoal);
        RegisterHelper.registerItem(ItemGlowstoneIngot.instance, Names.Items.ingotGlowstone);
        RegisterHelper.registerItem(ItemAdamantiumIngot.instance, Names.Items.ingotAdamantium);
        RegisterHelper.registerItem(ItemSilkGem.instance, Names.Items.silkGem);
        RegisterHelper.registerItem(ItemRedstoneCrystal.instance, Names.Items.redstoneCrystal);
        RegisterHelper.registerItem(ItemExpShard.instance, Names.Items.expShard);
        RegisterHelper.registerItem(ItemExpCollector.instance, Names.Items.expCollector);

        RegisterHelper.registerItem(ItemArmorQuartz.instanceHelmet, Names.Items.quartzHelmet);
        RegisterHelper.registerItem(ItemArmorQuartz.instanceChest, Names.Items.quartzChest);
        RegisterHelper.registerItem(ItemArmorQuartz.instanceLegs, Names.Items.quartzLegs);
        RegisterHelper.registerItem(ItemArmorQuartz.instanceBoots, Names.Items.quartzBoots);

        RegisterHelper.registerItem(ItemArmorObsidian.instanceHelmet, Names.Items.obsidianHelmet);
        RegisterHelper.registerItem(ItemArmorObsidian.instanceChest, Names.Items.obsidianChest);
        RegisterHelper.registerItem(ItemArmorObsidian.instanceLegs, Names.Items.obsidianLegs);
        RegisterHelper.registerItem(ItemArmorObsidian.instanceBoots, Names.Items.obsidianBoots);

        RegisterHelper.registerItem(ItemArmorEmerald.instanceHelmet, Names.Items.emeraldHelmet);
        RegisterHelper.registerItem(ItemArmorEmerald.instanceChest, Names.Items.emeraldChest);
        RegisterHelper.registerItem(ItemArmorEmerald.instanceLegs, Names.Items.emeraldLegs);
        RegisterHelper.registerItem(ItemArmorEmerald.instanceBoots, Names.Items.emeraldBoots);

        RegisterHelper.registerItem(ItemArmorLapis.instanceHelmet, Names.Items.lapisHelmet);
        RegisterHelper.registerItem(ItemArmorLapis.instanceChest, Names.Items.lapisChest);
        RegisterHelper.registerItem(ItemArmorLapis.instanceLegs, Names.Items.lapisLegs);
        RegisterHelper.registerItem(ItemArmorLapis.instanceBoots, Names.Items.lapisBoots);

        RegisterHelper.registerItem(ItemArmorBronze.instanceHelmet, Names.Items.bronzeHelmet);
        RegisterHelper.registerItem(ItemArmorBronze.instanceChest, Names.Items.bronzeChest);
        RegisterHelper.registerItem(ItemArmorBronze.instanceLegs, Names.Items.bronzeLegs);
        RegisterHelper.registerItem(ItemArmorBronze.instanceBoots, Names.Items.bronzeBoots);

        RegisterHelper.registerItem(ItemArmorCoal.instanceHelmet, Names.Items.coalHelmet);
        RegisterHelper.registerItem(ItemArmorCoal.instanceChest, Names.Items.coalChest);
        RegisterHelper.registerItem(ItemArmorCoal.instanceLegs, Names.Items.coalLegs);
        RegisterHelper.registerItem(ItemArmorCoal.instanceBoots, Names.Items.coalBoots);

        RegisterHelper.registerItem(ItemArmorGlowstone.instanceHelmet, Names.Items.glowstoneHelmet);
        RegisterHelper.registerItem(ItemArmorGlowstone.instanceChest, Names.Items.glowstoneChest);
        RegisterHelper.registerItem(ItemArmorGlowstone.instanceLegs, Names.Items.glowstoneLegs);
        RegisterHelper.registerItem(ItemArmorGlowstone.instanceBoots, Names.Items.glowstoneBoots);

        RegisterHelper.registerItem(ItemArmorRedstone.instanceHelmet, Names.Items.redstoneHelmet);
        RegisterHelper.registerItem(ItemArmorRedstone.instanceChest, Names.Items.redstoneChest);
        RegisterHelper.registerItem(ItemArmorRedstone.instanceLegs, Names.Items.redstoneLegs);
        RegisterHelper.registerItem(ItemArmorRedstone.instanceBoots, Names.Items.redstoneBoots);

        RegisterHelper.registerItem(ItemArmorAdamantium.instanceHelmet, Names.Items.adamantiumHelmet);
        RegisterHelper.registerItem(ItemArmorAdamantium.instanceChest, Names.Items.adamantiumChest);
        RegisterHelper.registerItem(ItemArmorAdamantium.instanceLegs, Names.Items.adamantiumLegs);
        RegisterHelper.registerItem(ItemArmorAdamantium.instanceBoots, Names.Items.adamantiumBoots);

        RegisterHelper.registerItem(ItemQuartzBow.instance, Names.Items.bowQuartz);
        RegisterHelper.registerItem(ItemObsidianBow.instance, Names.Items.bowObsidian);
        RegisterHelper.registerItem(ItemEmeraldBow.instance, Names.Items.bowEmerald);
        RegisterHelper.registerItem(ItemLapisBow.instance, Names.Items.bowLapis);
        RegisterHelper.registerItem(ItemBronzeBow.instance, Names.Items.bowBronze);
        RegisterHelper.registerItem(ItemCoalBow.instance, Names.Items.bowCoal);
        RegisterHelper.registerItem(ItemGlowstoneBow.instance, Names.Items.bowGlowstone);
        RegisterHelper.registerItem(ItemAdamantiumBow.instance, Names.Items.bowAdamantium);
	}
}

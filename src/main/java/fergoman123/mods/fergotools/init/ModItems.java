package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.item.armor.*;
import fergoman123.mods.fergotools.item.axe.*;
import fergoman123.mods.fergotools.item.bow.*;
import fergoman123.mods.fergotools.item.hoe.*;
import fergoman123.mods.fergotools.item.materials.*;
import fergoman123.mods.fergotools.item.pickaxe.*;
import fergoman123.mods.fergotools.item.shovel.*;
import fergoman123.mods.fergotools.item.sword.*;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.lib.Strings.BowStrings;
import fergoman123.mods.fergotools.lib.Strings.ToolStrings;
import fergoman123.mods.fergotools.lib.Textures;
import fergoman123.mods.fergotools.lib.Textures.ToolTextures;
import fergoman123.mods.fergotools.lib.ints.ToolInts;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergoutil.item.ArmorType;
import net.minecraft.item.Item;

public class ModItems{

    public static Item quartzPickaxe;
    public static Item quartzShovel;
    public static Item quartzAxe;
    public static Item quartzHoe;
    public static Item quartzSword;

    // Obsidian
    public static Item obsidianPickaxe;
    public static Item obsidianShovel;
    public static Item obsidianAxe;
    public static Item obsidianHoe;
    public static Item obsidianSword;

    // Emerald
    public static Item emeraldPickaxe;
    public static Item emeraldShovel;
    public static Item emeraldAxe;
    public static Item emeraldHoe;
    public static Item emeraldSword;

    public static Item lapisPickaxe;
    public static Item lapisShovel;
    public static Item lapisAxe;
    public static Item lapisHoe;
    public static Item lapisSword;

    public static Item bronzePickaxe;
    public static Item bronzeShovel;
    public static Item bronzeAxe;
    public static Item bronzeHoe;
    public static Item bronzeSword;

    public static Item glowstonePickaxe;
    public static Item glowstoneShovel;
    public static Item glowstoneAxe;
    public static Item glowstoneHoe;
    public static Item glowstoneSword;

    public static Item coalPickaxe;
    public static Item coalShovel;
    public static Item coalAxe;
    public static Item coalHoe;
    public static Item coalSword;

    public static Item adamantiumPickaxe;
    public static Item adamantiumShovel;
    public static Item adamantiumAxe;
    public static Item adamantiumHoe;
    public static Item adamantiumSword;

    public static Item silkPickaxe;
    public static Item silkShovel;
    public static Item silkAxe;
    public static Item silkHoe;
    public static Item silkSword;

    public static Item redstonePickaxe;
    public static Item redstoneShovel;
    public static Item redstoneAxe;
    public static Item redstoneHoe;
    public static Item redstoneSword;

    public static Item obsidianIngot;
    public static Item emeraldCrystal;
    public static Item lapisCrystal;
    public static Item bronzeIngot;
    public static Item coalIngot;
    public static Item glowstoneIngot;
    public static Item adamantiumIngot;
    public static Item expShard;
    public static Item silkGem;
    public static Item redstoneCrystal;

//    public static Item fergoMaterials;

    public static Item quartzHelmet;
    public static Item quartzChestplate;
    public static Item quartzLeggings;
    public static Item quartzBoots;

    public static Item obsidianHelmet;
    public static Item obsidianChestplate;
    public static Item obsidianLeggings;
    public static Item obsidianBoots;

    public static Item emeraldHelmet;
    public static Item emeraldChestplate;
    public static Item emeraldLeggings;
    public static Item emeraldBoots;

    public static Item lapisHelmet;
    public static Item lapisChestplate;
    public static Item lapisLeggings;
    public static Item lapisBoots;

    public static Item bronzeHelmet;
    public static Item bronzeChestplate;
    public static Item bronzeLeggings;
    public static Item bronzeBoots;

    public static Item coalHelmet;
    public static Item coalChestplate;
    public static Item coalLeggings;
    public static Item coalBoots;

    public static Item glowstoneHelmet;
    public static Item glowstoneChestplate;
    public static Item glowstoneLeggings;
    public static Item glowstoneBoots;

    public static Item redstoneHelmet;
    public static Item redstoneChestplate;
    public static Item redstoneLeggings;
    public static Item redstoneBoots;

    public static Item quartzBow;
    public static Item obsidianBow;
    public static Item emeraldBow;
    public static Item lapisBow;
    public static Item bronzeBow;
    public static Item coalBow;
    public static Item glowstoneBow;
    public static Item adamantiumBow;

    public static ArmorType type;

    public static void init() {
        addItems();
        addArmor();
        addBows();
    }

    public static void addItems()
	{
		quartzPickaxe = new ItemQuartzPickaxe();
        quartzShovel = new ItemQuartzShovel();
        quartzAxe = new ItemQuartzAxe();
        quartzHoe = new ItemQuartzHoe().setUnlocalizedName(ToolStrings.quartzHoe).setMaxDamage(UtilToolArmor.quartz.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.quartzHoe);
        quartzSword = new ItemQuartzSword().setUnlocalizedName(ToolStrings.quartzSword).setMaxDamage(UtilToolArmor.quartz.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.quartzSword);
		
		obsidianPickaxe = new ItemObsidianPickaxe().setUnlocalizedName(ToolStrings.obsidianPickaxe).setMaxDamage(UtilToolArmor.obsidian.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.obsidianPickaxe);
        obsidianShovel = new ItemObsidianShovel().setUnlocalizedName(ToolStrings.obsidianShovel).setMaxDamage(UtilToolArmor.obsidian.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.obsidianShovel);
        obsidianAxe = new ItemObsidianAxe().setUnlocalizedName(ToolStrings.obsidianAxe).setMaxDamage(UtilToolArmor.obsidian.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.obsidianAxe);
        obsidianHoe = new ItemObsidianHoe().setUnlocalizedName(ToolStrings.obsidianHoe).setMaxDamage(UtilToolArmor.obsidian.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.obsidianHoe);
        obsidianSword = new ItemObsidianSword().setUnlocalizedName(ToolStrings.obsidianSword).setMaxDamage(UtilToolArmor.obsidian.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.obsidianSword);

        emeraldPickaxe = new ItemEmeraldPickaxe().setUnlocalizedName(ToolStrings.emeraldPickaxe).setMaxDamage(UtilToolArmor.emerald.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.emeraldPickaxe);
        emeraldShovel = new ItemEmeraldShovel().setUnlocalizedName(ToolStrings.emeraldShovel).setMaxDamage(UtilToolArmor.emerald.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.emeraldShovel);
        emeraldAxe = new ItemEmeraldAxe().setUnlocalizedName(ToolStrings.emeraldAxe).setMaxDamage(UtilToolArmor.emerald.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.emeraldAxe);
        emeraldHoe = new ItemEmeraldHoe().setUnlocalizedName(ToolStrings.emeraldHoe).setMaxDamage(UtilToolArmor.emerald.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.emeraldHoe);
        emeraldSword = new ItemEmeraldSword().setUnlocalizedName(ToolStrings.emeraldSword).setMaxDamage(UtilToolArmor.emerald.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.emeraldSword);

        lapisPickaxe = new ItemLapisPickaxe().setUnlocalizedName(ToolStrings.lapisPickaxe).setMaxDamage(UtilToolArmor.lapis.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.lapisPickaxe);
        lapisShovel = new ItemLapisShovel().setUnlocalizedName(ToolStrings.lapisShovel).setMaxDamage(UtilToolArmor.lapis.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.lapisShovel);
        lapisAxe = new ItemLapisAxe().setUnlocalizedName(ToolStrings.lapisAxe).setMaxDamage(UtilToolArmor.lapis.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.lapisAxe);
        lapisHoe = new ItemLapisHoe().setUnlocalizedName(ToolStrings.lapisHoe).setMaxDamage(UtilToolArmor.lapis.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.lapisHoe);
        lapisSword = new ItemLapisSword().setUnlocalizedName(ToolStrings.lapisSword).setMaxDamage(UtilToolArmor.lapis.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.lapisSword);

        bronzePickaxe = new ItemBronzePickaxe().setUnlocalizedName(ToolStrings.bronzePickaxe).setMaxDamage(UtilToolArmor.bronze.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.bronzePickaxe);
        bronzeShovel = new ItemBronzeShovel().setUnlocalizedName(ToolStrings.bronzeShovel).setMaxDamage(UtilToolArmor.bronze.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.bronzeShovel);
        bronzeAxe = new ItemBronzeAxe().setUnlocalizedName(ToolStrings.bronzeAxe).setMaxDamage(UtilToolArmor.bronze.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.bronzeAxe);
        bronzeHoe = new ItemBronzeHoe().setUnlocalizedName(ToolStrings.bronzeHoe).setMaxDamage(UtilToolArmor.bronze.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.bronzeHoe);
        bronzeSword = new ItemBronzeSword().setUnlocalizedName(ToolStrings.bronzeSword).setMaxDamage(UtilToolArmor.bronze.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.bronzeSword);
		
		coalPickaxe = new ItemCoalPickaxe().setUnlocalizedName(ToolStrings.coalPickaxe).setMaxDamage(UtilToolArmor.coal.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.coalPickaxe);
        coalShovel = new ItemCoalShovel().setUnlocalizedName(ToolStrings.coalShovel).setMaxDamage(UtilToolArmor.coal.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.coalShovel);
        coalAxe = new ItemCoalAxe().setUnlocalizedName(ToolStrings.coalAxe).setMaxDamage(UtilToolArmor.coal.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.coalAxe);
        coalHoe = new ItemCoalHoe().setUnlocalizedName(ToolStrings.coalHoe).setMaxDamage(UtilToolArmor.coal.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.coalHoe);
        coalSword = new ItemCoalSword().setUnlocalizedName(ToolStrings.coalSword).setMaxDamage(UtilToolArmor.coal.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.coalSword);

        glowstonePickaxe = new ItemGlowstonePickaxe().setUnlocalizedName(ToolStrings.glowstonePickaxe).setMaxDamage(UtilToolArmor.glowstone.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.glowstonePickaxe);
        glowstoneShovel = new ItemGlowstoneShovel().setUnlocalizedName(ToolStrings.glowstoneShovel).setMaxDamage(UtilToolArmor.glowstone.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.glowstoneShovel);
        glowstoneAxe = new ItemGlowstoneAxe().setUnlocalizedName(ToolStrings.glowstoneAxe).setMaxDamage(UtilToolArmor.glowstone.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.glowstoneAxe);
        glowstoneHoe = new ItemGlowstoneHoe().setUnlocalizedName(ToolStrings.glowstoneHoe).setMaxDamage(UtilToolArmor.glowstone.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.glowstoneHoe);
        glowstoneSword = new ItemGlowstoneSword().setUnlocalizedName(ToolStrings.glowstoneSword).setMaxDamage(UtilToolArmor.glowstone.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.glowstoneSword);

        adamantiumPickaxe = new ItemAdamantiumPickaxe().setUnlocalizedName(ToolStrings.adamantiumPickaxe).setMaxDamage(UtilToolArmor.adamantium.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.adamantiumPickaxe);
        adamantiumShovel = new  ItemAdamantiumShovel().setUnlocalizedName(ToolStrings.adamantiumShovel).setMaxDamage(UtilToolArmor.adamantium.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.adamantiumShovel);
        adamantiumAxe = new ItemAdamantiumAxe().setUnlocalizedName(ToolStrings.adamantiumAxe).setMaxDamage(UtilToolArmor.adamantium.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.adamantiumAxe);
        adamantiumHoe = new ItemAdamantiumHoe().setUnlocalizedName(ToolStrings.adamantiumHoe).setMaxDamage(UtilToolArmor.adamantium.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.adamantiumHoe);
        adamantiumSword = new ItemAdamantiumSword().setUnlocalizedName(ToolStrings.adamantiumSword).setMaxDamage(UtilToolArmor.adamantium.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.adamantiumSword);

        silkPickaxe = new ItemSilkPickaxe().setUnlocalizedName(ToolStrings.silkPickaxe).setMaxDamage(UtilToolArmor.silk.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.silkPickaxe);
        silkShovel = new ItemSilkShovel().setUnlocalizedName(ToolStrings.silkShovel).setMaxDamage(UtilToolArmor.silk.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.silkShovel);
        silkAxe = new ItemSilkAxe().setUnlocalizedName(ToolStrings.silkAxe).setMaxDamage(UtilToolArmor.silk.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.silkAxe);
        silkHoe = new ItemSilkHoe().setUnlocalizedName(ToolStrings.silkHoe).setMaxDamage(UtilToolArmor.silk.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.silkHoe);
        silkSword = new ItemSilkSword().setUnlocalizedName(ToolStrings.silkSword).setMaxDamage(UtilToolArmor.silk.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.silkSword);

        redstonePickaxe = new ItemRedstonePickaxe().setUnlocalizedName(ToolStrings.redstonePickaxe).setMaxDamage(UtilToolArmor.redstone.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.redstonePickaxe);
        redstoneShovel = new ItemRedstoneShovel().setUnlocalizedName(ToolStrings.redstoneShovel).setMaxDamage(UtilToolArmor.redstone.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.redstoneShovel);
        redstoneAxe = new ItemRedstoneAxe().setUnlocalizedName(ToolStrings.redstoneAxe).setMaxDamage(UtilToolArmor.redstone.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.redstoneAxe);
        redstoneHoe = new ItemRedstoneHoe().setUnlocalizedName(ToolStrings.redstoneHoe).setMaxDamage(UtilToolArmor.redstone.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.redstoneHoe);
        redstoneSword = new ItemRedstoneSword().setUnlocalizedName(ToolStrings.redstoneSword).setMaxDamage(UtilToolArmor.redstone.getMaxUses()).setCreativeTab(Tabs.tabFergoTools).setTextureName(ToolTextures.redstoneSword);

		obsidianIngot = new ItemObsidianIngot();
        emeraldCrystal = new ItemEmeraldCrystal().setUnlocalizedName(Strings.ItemStrings.emeraldCrystal).setCreativeTab(Tabs.tabFergoItems).setTextureName(Textures.ItemTextures.emeraldCrystal);
        lapisCrystal = new ItemLapisCrystal().setUnlocalizedName(Strings.ItemStrings.lapisCrystal).setCreativeTab(Tabs.tabFergoItems).setTextureName(Textures.ItemTextures.lapisCrystal);
        bronzeIngot = new ItemBronzeIngot().setUnlocalizedName(Strings.ItemStrings.ingotBronze).setCreativeTab(Tabs.tabFergoItems).setTextureName(Textures.ItemTextures.bronzeIngot);
        coalIngot = new ItemCoalIngot().setUnlocalizedName(Strings.ItemStrings.ingotCoal).setCreativeTab(Tabs.tabFergoItems).setTextureName(Textures.ItemTextures.coalIngot);
        glowstoneIngot = new ItemGlowstoneIngot().setUnlocalizedName(Strings.ItemStrings.ingotGlowstone).setCreativeTab(Tabs.tabFergoItems).setTextureName(Textures.ItemTextures.glowstoneIngot);
        adamantiumIngot = new ItemAdamantiumIngot().setUnlocalizedName(Strings.ItemStrings.ingotAdamantium).setCreativeTab(Tabs.tabFergoItems).setTextureName(Textures.ItemTextures.adamantiumIngot);
        expShard = new ItemExpShard();
        silkGem = new ItemSilkGem().setUnlocalizedName(Strings.ItemStrings.silkGem).setCreativeTab(Tabs.tabFergoItems).setTextureName(Textures.ItemTextures.silkGem);
        redstoneCrystal = new ItemRedstoneCrystal().setUnlocalizedName(Strings.ItemStrings.redstoneCrystal).setCreativeTab(Tabs.tabFergoItems).setTextureName(Textures.ItemTextures.redstoneCrystal);

//        fergoMaterials = new FergoMaterials();
	}

	public static void addArmor()
	{
		quartzHelmet = new ItemArmorQuartz(type.HELMET);
        quartzChestplate = new ItemArmorQuartz(type.CHEST);
        quartzLeggings = new ItemArmorQuartz(type.LEGS);
        quartzBoots = new ItemArmorQuartz(type.BOOTS);

        obsidianHelmet = new ItemArmorObsidian(type.HELMET);
        obsidianChestplate = new ItemArmorObsidian(type.CHEST);
        obsidianLeggings = new ItemArmorObsidian(type.LEGS);
        obsidianBoots = new ItemArmorObsidian(type.BOOTS);

        emeraldHelmet = new ItemArmorEmerald(type.HELMET);
        emeraldChestplate = new ItemArmorEmerald(type.CHEST);
        emeraldLeggings = new ItemArmorEmerald(type.LEGS);
        emeraldBoots = new ItemArmorEmerald(type.BOOTS);

        lapisHelmet = new ItemArmorLapis(type.HELMET);
        lapisChestplate = new ItemArmorLapis(type.CHEST);
        lapisLeggings = new ItemArmorLapis(type.LEGS);
        lapisBoots = new ItemArmorLapis(type.BOOTS);

        bronzeHelmet = new ItemArmorBronze(type.HELMET);
        bronzeChestplate = new ItemArmorBronze(type.CHEST);
        bronzeLeggings = new ItemArmorBronze(type.LEGS);
        bronzeBoots = new ItemArmorBronze(type.BOOTS);

        coalHelmet = new ItemArmorCoal(type.HELMET);
        coalChestplate = new ItemArmorCoal(type.CHEST);
        coalLeggings = new ItemArmorCoal(type.LEGS);
        coalBoots = new ItemArmorCoal(type.BOOTS);

        glowstoneHelmet = new ItemArmorGlowstone(ArmorType.HELMET);
        glowstoneChestplate = new ItemArmorGlowstone(ArmorType.CHEST);
        glowstoneLeggings = new ItemArmorGlowstone(ArmorType.LEGS);
        glowstoneBoots = new ItemArmorGlowstone(ArmorType.BOOTS);

        redstoneHelmet = new ItemArmorRedstone(ArmorType.HELMET);
        redstoneChestplate = new ItemArmorRedstone(ArmorType.CHEST);
        redstoneLeggings = new ItemArmorRedstone(ArmorType.LEGS);
        redstoneBoots = new ItemArmorRedstone(ArmorType.BOOTS);
	}

	public static void addBows() {
        quartzBow = new ItemQuartzBow().setUnlocalizedName(BowStrings.bowQuartz).setCreativeTab(Tabs.tabFergoBows).setMaxDamage(ToolInts.quartzMaxDamage).setMaxStackSize(1);
        obsidianBow = new ItemObsidianBow().setUnlocalizedName(BowStrings.bowObsidian).setCreativeTab(Tabs.tabFergoBows).setMaxDamage(ToolInts.obsidianMaxDamage).setMaxStackSize(1);
        emeraldBow = new ItemEmeraldBow().setUnlocalizedName(BowStrings.bowEmerald).setCreativeTab(Tabs.tabFergoBows).setMaxDamage(ToolInts.emeraldMaxDamage).setMaxStackSize(1);
        lapisBow = new ItemLapisBow().setUnlocalizedName(BowStrings.bowLapis).setCreativeTab(Tabs.tabFergoBows).setMaxDamage(ToolInts.lapisMaxDamage).setMaxStackSize(1);
        bronzeBow = new ItemBronzeBow().setUnlocalizedName(BowStrings.bowBronze).setCreativeTab(Tabs.tabFergoBows).setMaxDamage(ToolInts.bronzeMaxDamage).setMaxStackSize(1);
        coalBow = new ItemCoalBow().setUnlocalizedName(BowStrings.bowCoal).setCreativeTab(Tabs.tabFergoBows).setMaxDamage(ToolInts.coalMaxDamage).setMaxStackSize(1);
        glowstoneBow = new ItemGlowstoneBow().setUnlocalizedName(BowStrings.bowGlowstone).setCreativeTab(Tabs.tabFergoBows).setMaxDamage(ToolInts.glowstoneMaxDamage).setMaxStackSize(1);
        adamantiumBow = new ItemAdamantiumBow().setUnlocalizedName(BowStrings.bowAdamantium).setCreativeTab(Tabs.tabFergoBows).setMaxDamage(ToolInts.adamantiumMaxDamage).setMaxStackSize(1);
    }

}

package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.item.armor.*;
import fergoman123.mods.fergotools.item.axe.*;
import fergoman123.mods.fergotools.item.bow.*;
import fergoman123.mods.fergotools.item.hoe.*;
import fergoman123.mods.fergotools.item.materials.*;
import fergoman123.mods.fergotools.item.pickaxe.*;
import fergoman123.mods.fergotools.item.shovel.*;
import fergoman123.mods.fergotools.item.sword.*;
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
        quartzHoe = new ItemQuartzHoe();
        quartzSword = new ItemQuartzSword();

		obsidianPickaxe = new ItemObsidianPickaxe();
        obsidianShovel = new ItemObsidianShovel();
        obsidianAxe = new ItemObsidianAxe();
        obsidianHoe = new ItemObsidianHoe();
        obsidianSword = new ItemObsidianSword();

        emeraldPickaxe = new ItemEmeraldPickaxe();
        emeraldShovel = new ItemEmeraldShovel();
        emeraldAxe = new ItemEmeraldAxe();
        emeraldHoe = new ItemEmeraldHoe();
        emeraldSword = new ItemEmeraldSword();

        lapisPickaxe = new ItemLapisPickaxe();
        lapisShovel = new ItemLapisShovel();
        lapisAxe = new ItemLapisAxe();
        lapisHoe = new ItemLapisHoe();
        lapisSword = new ItemLapisSword();

        bronzePickaxe = new ItemBronzePickaxe();
        bronzeShovel = new ItemBronzeShovel();
        bronzeAxe = new ItemBronzeAxe();
        bronzeHoe = new ItemBronzeHoe();
        bronzeSword = new ItemBronzeSword();
		
		coalPickaxe = new ItemCoalPickaxe();
        coalShovel = new ItemCoalShovel();
        coalAxe = new ItemCoalAxe();
        coalHoe = new ItemCoalHoe();
        coalSword = new ItemCoalSword();

        glowstonePickaxe = new ItemGlowstonePickaxe();
        glowstoneShovel = new ItemGlowstoneShovel();
        glowstoneAxe = new ItemGlowstoneAxe();
        glowstoneHoe = new ItemGlowstoneHoe();
        glowstoneSword = new ItemGlowstoneSword();

        adamantiumPickaxe = new ItemAdamantiumPickaxe();
        adamantiumShovel = new  ItemAdamantiumShovel();
        adamantiumAxe = new ItemAdamantiumAxe();
        adamantiumHoe = new ItemAdamantiumHoe();
        adamantiumSword = new ItemAdamantiumSword();

        silkPickaxe = new ItemSilkPickaxe();
        silkShovel = new ItemSilkShovel();
        silkAxe = new ItemSilkAxe();
        silkHoe = new ItemSilkHoe();
        silkSword = new ItemSilkSword();

        redstonePickaxe = new ItemRedstonePickaxe();
        redstoneShovel = new ItemRedstoneShovel();
        redstoneAxe = new ItemRedstoneAxe();
        redstoneHoe = new ItemRedstoneHoe();
        redstoneSword = new ItemRedstoneSword();

		obsidianIngot = new ItemObsidianIngot();
        emeraldCrystal = new ItemEmeraldCrystal();
        lapisCrystal = new ItemLapisCrystal();
        bronzeIngot = new ItemBronzeIngot();
        coalIngot = new ItemCoalIngot();
        glowstoneIngot = new ItemGlowstoneIngot();
        adamantiumIngot = new ItemAdamantiumIngot();
        expShard = new ItemExpShard();
        silkGem = new ItemSilkGem();
        redstoneCrystal = new ItemRedstoneCrystal();

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
        quartzBow = new ItemQuartzBow();
        obsidianBow = new ItemObsidianBow();
        emeraldBow = new ItemEmeraldBow();
        lapisBow = new ItemLapisBow();
        bronzeBow = new ItemBronzeBow();
        coalBow = new ItemCoalBow();
        glowstoneBow = new ItemGlowstoneBow();
        adamantiumBow = new ItemAdamantiumBow();
    }

}

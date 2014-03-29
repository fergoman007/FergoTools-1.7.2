package fergoman123.mods.fergotools.item;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.item.tools.ItemQuartzPickaxe;
import fergoman123.mods.fergotools.lib.ints.ArmorInts;
import fergoman123.mods.fergotools.lib.ints.ToolInts;
import fergoman123.mods.fergotools.lib.strings.Strings;
import fergoman123.mods.fergotools.lib.textures.ArmorTextures;
import fergoman123.mods.fergotools.lib.textures.ItemTextures;
import fergoman123.mods.fergotools.lib.textures.ToolTextures;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import fergoman123.mods.fergotools.item.tools.*;
import fergoman123.mods.fergotools.item.armor.*;
import fergoman123.mods.fergotools.item.bow.ItemQuartzBow;

public class ModItems{
	
	public static Item quartzPickaxe;
    public static Item quartzShovel;
	public static Item quartzAxe;
	public static Item quartzHoe;
	public static Item quartzSword;
	
	public static Item obsidianPickaxe;
	public static Item obsidianShovel;
	public static Item obsidianAxe;
	public static Item obsidianHoe;
	public static Item obsidianSword;
	
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
	
	public static Item obsidianIngot;
	public static Item emeraldCrystal;
	public static Item lapisCrystal;
	public static Item bronzeIngot;
	public static Item coalIngot;
	public static Item glowstoneIngot;
	public static Item adamantiumIngot;
	public static Item expShard;
	
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
	
	public static Item quartzBow;
	public static Item obsidianBow;
	public static Item emeraldBow;
	public static Item lapisBow;
	public static Item bronzeBow;
	public static Item coalBow;
	public static Item glowstoneBow;
	public static Item adamantiumBow;
	
	public static ToolMaterial quartz;
    public static ToolMaterial obsidian;
    public static ToolMaterial emerald;
	public static ToolMaterial lapis;
	public static ToolMaterial bronze;
	public static ToolMaterial coal;
	public static ToolMaterial glowstone;
	public static ToolMaterial adamantium;
	
	public static ArmorMaterial quartzArmor;
	public static ArmorMaterial obsidianArmor;
	public static ArmorMaterial emeraldArmor;
	public static ArmorMaterial lapisArmor;
	public static ArmorMaterial bronzeArmor;
	public static ArmorMaterial coalArmor;
	public static ArmorMaterial glowstoneArmor;
	
	public static void addItems()
	{
		quartzPickaxe = new ItemQuartzPickaxe().setUnlocalizedName(Strings.quartzTool[0]).setMaxDamage(quartz.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.quartzPickaxe);
        quartzShovel = new ItemQuartzShovel().setUnlocalizedName(Strings.quartzTool[1]).setMaxDamage(quartz.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.quartzShovel);
		quartzAxe = new ItemQuartzAxe().setUnlocalizedName(Strings.quartzTool[2]).setMaxDamage(quartz.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.quartzAxe);
		quartzHoe = new ItemQuartzHoe().setUnlocalizedName(Strings.quartzTool[3]).setMaxDamage(quartz.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.quartzHoe);
		quartzSword = new ItemQuartzSword().setUnlocalizedName(Strings.quartzTool[4]).setMaxDamage(quartz.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.quartzSword);
		
		obsidianPickaxe = new ItemObsidianPickaxe().setUnlocalizedName(Strings.obsidianTool[0]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.obsidianPickaxe);
		obsidianShovel = new ItemObsidianShovel().setUnlocalizedName(Strings.obsidianTool[1]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.obsidianShovel);
		obsidianAxe = new ItemObsidianAxe().setUnlocalizedName(Strings.obsidianTool[2]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.obsidianAxe);
		obsidianHoe = new ItemObsidianHoe().setUnlocalizedName(Strings.obsidianTool[3]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.obsidianHoe);
		obsidianSword = new ItemObsidianSword().setUnlocalizedName(Strings.obsidianTool[4]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.obsidianSword);
		
		emeraldPickaxe = new ItemEmeraldPickaxe().setUnlocalizedName(Strings.emeraldTool[0]).setMaxDamage(emerald.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.emeraldPickaxe);
		emeraldShovel = new ItemEmeraldShovel().setUnlocalizedName(Strings.emeraldTool[1]).setMaxDamage(emerald.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.emeraldShovel);
		emeraldAxe = new ItemEmeraldAxe().setUnlocalizedName(Strings.emeraldTool[2]).setMaxDamage(emerald.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.emeraldAxe);
		emeraldHoe = new ItemEmeraldHoe().setUnlocalizedName(Strings.emeraldTool[3]).setMaxDamage(emerald.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.emeraldHoe);
		emeraldSword = new ItemEmeraldSword().setUnlocalizedName(Strings.emeraldTool[4]).setMaxDamage(emerald.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.emeraldSword);
		
		lapisPickaxe = new ItemLapisPickaxe().setUnlocalizedName(Strings.lapisTool[0]).setMaxDamage(lapis.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.lapisPickaxe);
		lapisShovel = new ItemLapisShovel().setUnlocalizedName(Strings.lapisTool[1]).setMaxDamage(lapis.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.lapisShovel);
		lapisAxe = new ItemLapisAxe().setUnlocalizedName(Strings.lapisTool[2]).setMaxDamage(lapis.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.lapisAxe);
		lapisHoe = new ItemLapisHoe().setUnlocalizedName(Strings.lapisTool[3]).setMaxDamage(lapis.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.lapisHoe);
		lapisSword = new ItemLapisSword().setUnlocalizedName(Strings.lapisTool[4]).setMaxDamage(lapis.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.lapisSword);
		
		bronzePickaxe = new ItemBronzePickaxe().setUnlocalizedName(Strings.bronzeTool[0]).setMaxDamage(bronze.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.bronzePickaxe);
		bronzeShovel = new ItemBronzeShovel().setUnlocalizedName(Strings.bronzeTool[1]).setMaxDamage(bronze.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.bronzeShovel);
		bronzeAxe = new ItemBronzeAxe().setUnlocalizedName(Strings.bronzeTool[2]).setMaxDamage(bronze.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.bronzeAxe);
		bronzeHoe = new ItemBronzeHoe().setUnlocalizedName(Strings.bronzeTool[3]).setMaxDamage(bronze.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.bronzeHoe);
		bronzeSword = new ItemBronzeSword().setUnlocalizedName(Strings.bronzeTool[4]).setMaxDamage(bronze.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.bronzeSword);
		
		coalPickaxe = new ItemCoalPickaxe().setUnlocalizedName(Strings.coalTool[0]).setMaxDamage(coal.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.coalPickaxe);
		coalShovel = new ItemCoalShovel().setUnlocalizedName(Strings.coalTool[1]).setMaxDamage(coal.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.coalShovel);
		coalAxe = new ItemCoalAxe().setUnlocalizedName(Strings.coalTool[2]).setMaxDamage(coal.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.coalAxe);
		coalHoe = new ItemCoalHoe().setUnlocalizedName(Strings.coalTool[3]).setMaxDamage(coal.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.coalHoe);
		coalSword = new ItemCoalSword().setUnlocalizedName(Strings.coalTool[4]).setMaxDamage(coal.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.coalSword);
		
		glowstonePickaxe = new ItemGlowstonePickaxe().setUnlocalizedName(Strings.glowstoneTool[0]).setMaxDamage(glowstone.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.glowstonePickaxe);
		glowstoneShovel = new ItemGlowstoneShovel().setUnlocalizedName(Strings.glowstoneTool[1]).setMaxDamage(glowstone.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.glowstoneShovel);
		glowstoneAxe = new ItemGlowstoneAxe().setUnlocalizedName(Strings.glowstoneTool[2]).setMaxDamage(glowstone.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.glowstoneAxe);
		glowstoneHoe = new ItemGlowstoneHoe().setUnlocalizedName(Strings.glowstoneTool[3]).setMaxDamage(glowstone.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.glowstoneHoe);
		glowstoneSword = new ItemGlowstoneSword().setUnlocalizedName(Strings.glowstoneTool[4]).setMaxDamage(glowstone.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.glowstoneSword);
		
		adamantiumPickaxe = new ItemAdamantiumPickaxe().setUnlocalizedName(Strings.obsidianTool[0]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.adamantiumPickaxe);
		adamantiumShovel = new  ItemAdamantiumShovel().setUnlocalizedName(Strings.obsidianTool[1]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.adamantiumShovel);
		adamantiumAxe = new ItemAdamantiumAxe().setUnlocalizedName(Strings.obsidianTool[2]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.adamantiumAxe);
		adamantiumHoe = new ItemAdamantiumHoe().setUnlocalizedName(Strings.obsidianTool[3]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.adamantiumHoe);
		adamantiumSword = new ItemAdamantiumSword().setUnlocalizedName(Strings.obsidianTool[4]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.adamantiumSword);
	
		obsidianIngot = new ItemObsidianIngot().setUnlocalizedName(Strings.modItems[0]).setCreativeTab(FergoTools.tabFergoItems).setTextureName(ItemTextures.obsidianIngot);
		emeraldCrystal = new ItemEmeraldCrystal().setUnlocalizedName(Strings.modItems[1]).setCreativeTab(FergoTools.tabFergoItems).setTextureName(ItemTextures.emeraldCrystal);
		lapisCrystal = new ItemLapisCrystal().setUnlocalizedName(Strings.modItems[2]).setCreativeTab(FergoTools.tabFergoItems).setTextureName(ItemTextures.lapisCrystal);
		bronzeIngot = new ItemBronzeIngot().setUnlocalizedName(Strings.modItems[3]).setCreativeTab(FergoTools.tabFergoItems).setTextureName(ItemTextures.bronzeIngot);
		coalIngot = new ItemCoalIngot().setUnlocalizedName(Strings.modItems[4]).setCreativeTab(FergoTools.tabFergoItems).setTextureName(ItemTextures.coalIngot);
		glowstoneIngot = new ItemGlowstoneIngot().setUnlocalizedName(Strings.modItems[5]).setCreativeTab(FergoTools.tabFergoItems).setTextureName(ItemTextures.glowstoneIngot);
		adamantiumIngot = new ItemAdamantiumIngot().setUnlocalizedName(Strings.modItems[6]).setCreativeTab(FergoTools.tabFergoItems).setTextureName(ItemTextures.adamantiumIngot);
		expShard = new ItemExpShard().setUnlocalizedName(Strings.modItems[7]).setCreativeTab(FergoTools.tabFergoItems).setTextureName(ItemTextures.expShard);
	}
	
	public static void addArmor()
	{
		quartzHelmet = new ItemArmorQuartz(0).setUnlocalizedName(Strings.quartzArmorKey[0]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.quartzHelmet);
		quartzChestplate = new ItemArmorQuartz(1).setUnlocalizedName(Strings.quartzArmorKey[1]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.quartzChestplate);
		quartzLeggings = new ItemArmorQuartz(2).setUnlocalizedName(Strings.quartzArmorKey[2]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.quartzLeggings);
		quartzBoots = new ItemArmorQuartz(3).setUnlocalizedName(Strings.quartzArmorKey[3]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.quartzBoots);

        obsidianHelmet = new ItemArmorObsidian(0).setUnlocalizedName(Strings.obsidianArmorKey[0]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.obsidianHelmet);
		obsidianChestplate = new ItemArmorObsidian(1).setUnlocalizedName(Strings.obsidianArmorKey[1]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.obsidianChestplate);
		obsidianLeggings = new ItemArmorObsidian(3).setUnlocalizedName(Strings.obsidianArmorKey[2]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.obsidianLeggings);
		obsidianBoots = new ItemArmorObsidian(3).setUnlocalizedName(Strings.obsidianArmorKey[3]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.obsidianBoots);
		
		emeraldHelmet = new ItemArmorEmerald(0).setUnlocalizedName(Strings.emeraldArmorKey[0]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.emeraldHelmet);
		emeraldChestplate = new ItemArmorEmerald(1).setUnlocalizedName(Strings.emeraldArmorKey[1]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.emeraldChestplate);
		emeraldLeggings = new ItemArmorEmerald(2).setUnlocalizedName(Strings.emeraldArmorKey[2]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.emeraldLeggings);
		emeraldBoots = new ItemArmorEmerald(3).setUnlocalizedName(Strings.emeraldArmorKey[3]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.emeraldBoots);
		
		lapisHelmet = new ItemArmorLapis(0).setUnlocalizedName(Strings.lapisArmorKey[0]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.lapisHelmet);
		lapisChestplate = new ItemArmorLapis(1).setUnlocalizedName(Strings.lapisArmorKey[1]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.lapisChestplate);
		lapisLeggings = new ItemArmorLapis(2).setUnlocalizedName(Strings.lapisArmorKey[2]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.lapisLeggings);
		lapisBoots = new ItemArmorLapis(3).setUnlocalizedName(Strings.lapisArmorKey[3]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.lapisBoots);
		
		bronzeHelmet = new ItemArmorBronze(0).setUnlocalizedName(Strings.bronzeArmorKey[0]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.bronzeHelmet);
		bronzeChestplate = new ItemArmorBronze(1).setUnlocalizedName(Strings.bronzeArmorKey[1]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.bronzeChestplate);
		bronzeLeggings = new ItemArmorBronze(2).setUnlocalizedName(Strings.bronzeArmorKey[2]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.bronzeLeggings);
		bronzeBoots = new ItemArmorBronze(3).setUnlocalizedName(Strings.bronzeArmorKey[3]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.bronzeBoots);
		
		coalHelmet = new ItemArmorCoal(0).setUnlocalizedName(Strings.coalArmorKey[0]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.coalHelmet);
		coalChestplate = new ItemArmorCoal(1).setUnlocalizedName(Strings.coalArmorKey[1]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.coalChestplate);
		coalLeggings = new ItemArmorCoal(2).setUnlocalizedName(Strings.coalArmorKey[2]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.coalLeggings);
		coalBoots = new ItemArmorCoal(3).setUnlocalizedName(Strings.coalArmorKey[3]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.coalBoots);
		
		glowstoneHelmet = new ItemArmorGlowstone(0).setUnlocalizedName(Strings.glowstoneArmorKey[0]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.glowstoneHelmet);
		glowstoneChestplate = new ItemArmorGlowstone(1).setUnlocalizedName(Strings.glowstoneArmorKey[1]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.glowstoneChestplate);
		glowstoneLeggings = new ItemArmorGlowstone(2).setUnlocalizedName(Strings.glowstoneArmorKey[2]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.glowstoneLeggings);
		glowstoneBoots = new ItemArmorGlowstone(3).setUnlocalizedName(Strings.glowstoneArmorKey[3]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.glowstoneBoots);
	}
	
	public static void addBows()
	{
		quartzBow = new ItemQuartzBow().setUnlocalizedName(Strings.bows[0]).setCreativeTab(FergoTools.tabFergoBows).setMaxDamage(ToolInts.quartzMaxDamage);
	}
	


	public static void addToolMaterials()
	{
		quartz = EnumHelper.addToolMaterial(Strings.toolMaterials[0], ToolInts.harvestLvl, ToolInts.quartzMaxDamage, ToolInts.quartzEff, ToolInts.quartzDamage, ToolInts.enchantability);
        obsidian = EnumHelper.addToolMaterial(Strings.toolMaterials[1], ToolInts.harvestLvl, ToolInts.obsidianMaxDamage, ToolInts.obsidianEff, ToolInts.obsidianDamage, ToolInts.enchantability);
		emerald = EnumHelper.addToolMaterial(Strings.toolMaterials[2], ToolInts.harvestLvl, ToolInts.emeraldMaxDamage, ToolInts.emeraldEff, ToolInts.emeraldDamage, ToolInts.enchantability);
		lapis = EnumHelper.addToolMaterial(Strings.toolMaterials[3], ToolInts.harvestLvl, ToolInts.lapisMaxDamage, ToolInts.lapisEff, ToolInts.lapisDamage, ToolInts.enchantability);
		bronze = EnumHelper.addToolMaterial(Strings.toolMaterials[4], ToolInts.harvestLvl, ToolInts.bronzeMaxDamage, ToolInts.bronzeEff, ToolInts.bronzeDamage, ToolInts.enchantability);
		coal = EnumHelper.addToolMaterial(Strings.toolMaterials[5], ToolInts.harvestLvl, ToolInts.coalMaxDamage, ToolInts.coalEff, ToolInts.coalDamage, ToolInts.enchantability);
        glowstone = EnumHelper.addToolMaterial(Strings.toolMaterials[6], ToolInts.harvestLvl, ToolInts.glowstoneMaxDamage, ToolInts.glowstoneEff, ToolInts.glowstoneDamage, ToolInts.enchantability);
        adamantium = EnumHelper.addToolMaterial(Strings.toolMaterials[7], ToolInts.harvestLvl, ToolInts.adamantiumMaxDamage, ToolInts.adamantiumEff, ToolInts.adamantiumDamage, ToolInts.enchantability);
	}
	
	public static void addArmorMaterials()
	{
		quartzArmor = EnumHelper.addArmorMaterial(Strings.armorMaterials[0], ArmorInts.quartzArmorMaxDamage, ArmorInts.quartzReduct, ArmorInts.enchantability);
		obsidianArmor = EnumHelper.addArmorMaterial(Strings.armorMaterials[1], ArmorInts.obsidianArmorMaxDamage, ArmorInts.obsidianReduct, ArmorInts.enchantability);
		emeraldArmor = EnumHelper.addArmorMaterial(Strings.armorMaterials[2], ArmorInts.obsidianArmorMaxDamage, ArmorInts.emeraldReduct, ArmorInts.enchantability);
		lapisArmor = EnumHelper.addArmorMaterial(Strings.armorMaterials[3], ArmorInts.lapisArmorMaxDamage, ArmorInts.lapisReduct, ArmorInts.enchantability);
		bronzeArmor = EnumHelper.addArmorMaterial(Strings.armorMaterials[4], ArmorInts.bronzeArmorMaxDamage, ArmorInts.bronzeReduct, ArmorInts.enchantability);
		coalArmor = EnumHelper.addArmorMaterial(Strings.armorMaterials[5], ArmorInts.coalArmorMaxDamage, ArmorInts.coalReduct, ArmorInts.enchantability);
		glowstoneArmor = EnumHelper.addArmorMaterial(Strings.armorMaterials[6], ArmorInts.glowstoneArmorMaxDamage, ArmorInts.glowstoneReduct, ArmorInts.enchantability);
	}

}

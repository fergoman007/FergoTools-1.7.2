package fergoman123.mods.fergotools.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.item.armor.ItemArmorBronze;
import fergoman123.mods.fergotools.item.armor.ItemArmorCoal;
import fergoman123.mods.fergotools.item.armor.ItemArmorEmerald;
import fergoman123.mods.fergotools.item.armor.ItemArmorGlowstone;
import fergoman123.mods.fergotools.item.armor.ItemArmorLapis;
import fergoman123.mods.fergotools.item.armor.ItemArmorObsidian;
import fergoman123.mods.fergotools.item.armor.ItemArmorQuartz;
import fergoman123.mods.fergotools.item.bow.ItemAdamantiumBow;
import fergoman123.mods.fergotools.item.bow.ItemBronzeBow;
import fergoman123.mods.fergotools.item.bow.ItemEmeraldBow;
import fergoman123.mods.fergotools.item.bow.ItemGlowstoneBow;
import fergoman123.mods.fergotools.item.bow.ItemLapisBow;
import fergoman123.mods.fergotools.item.bow.ItemObsidianBow;
import fergoman123.mods.fergotools.item.bow.ItemQuartzBow;
import fergoman123.mods.fergotools.item.bow.ItemCoalBow;
import fergoman123.mods.fergotools.item.tools.ItemAdamantiumAxe;
import fergoman123.mods.fergotools.item.tools.ItemAdamantiumHoe;
import fergoman123.mods.fergotools.item.tools.ItemAdamantiumPickaxe;
import fergoman123.mods.fergotools.item.tools.ItemAdamantiumShovel;
import fergoman123.mods.fergotools.item.tools.ItemAdamantiumSword;
import fergoman123.mods.fergotools.item.tools.ItemBronzeAxe;
import fergoman123.mods.fergotools.item.tools.ItemBronzeHoe;
import fergoman123.mods.fergotools.item.tools.ItemBronzePickaxe;
import fergoman123.mods.fergotools.item.tools.ItemBronzeShovel;
import fergoman123.mods.fergotools.item.tools.ItemBronzeSword;
import fergoman123.mods.fergotools.item.tools.ItemCoalAxe;
import fergoman123.mods.fergotools.item.tools.ItemCoalHoe;
import fergoman123.mods.fergotools.item.tools.ItemCoalPickaxe;
import fergoman123.mods.fergotools.item.tools.ItemCoalShovel;
import fergoman123.mods.fergotools.item.tools.ItemCoalSword;
import fergoman123.mods.fergotools.item.tools.ItemEmeraldAxe;
import fergoman123.mods.fergotools.item.tools.ItemEmeraldHoe;
import fergoman123.mods.fergotools.item.tools.ItemEmeraldPickaxe;
import fergoman123.mods.fergotools.item.tools.ItemEmeraldShovel;
import fergoman123.mods.fergotools.item.tools.ItemEmeraldSword;
import fergoman123.mods.fergotools.item.tools.ItemGlowstoneAxe;
import fergoman123.mods.fergotools.item.tools.ItemGlowstoneHoe;
import fergoman123.mods.fergotools.item.tools.ItemGlowstonePickaxe;
import fergoman123.mods.fergotools.item.tools.ItemGlowstoneShovel;
import fergoman123.mods.fergotools.item.tools.ItemGlowstoneSword;
import fergoman123.mods.fergotools.item.tools.ItemLapisAxe;
import fergoman123.mods.fergotools.item.tools.ItemLapisHoe;
import fergoman123.mods.fergotools.item.tools.ItemLapisPickaxe;
import fergoman123.mods.fergotools.item.tools.ItemLapisShovel;
import fergoman123.mods.fergotools.item.tools.ItemLapisSword;
import fergoman123.mods.fergotools.item.tools.ItemObsidianAxe;
import fergoman123.mods.fergotools.item.tools.ItemObsidianHoe;
import fergoman123.mods.fergotools.item.tools.ItemObsidianPickaxe;
import fergoman123.mods.fergotools.item.tools.ItemObsidianShovel;
import fergoman123.mods.fergotools.item.tools.ItemObsidianSword;
import fergoman123.mods.fergotools.item.tools.ItemQuartzAxe;
import fergoman123.mods.fergotools.item.tools.ItemQuartzHoe;
import fergoman123.mods.fergotools.item.tools.ItemQuartzPickaxe;
import fergoman123.mods.fergotools.item.tools.ItemQuartzShovel;
import fergoman123.mods.fergotools.item.tools.ItemQuartzSword;
import fergoman123.mods.fergotools.item.tools.ItemSilkAxe;
import fergoman123.mods.fergotools.item.tools.ItemSilkHoe;
import fergoman123.mods.fergotools.item.tools.ItemSilkPickaxe;
import fergoman123.mods.fergotools.item.tools.ItemSilkShovel;
import fergoman123.mods.fergotools.item.tools.ItemSilkSword;
import fergoman123.mods.fergotools.lib.ints.ArmorInts;
import fergoman123.mods.fergotools.lib.ints.ToolInts;
import fergoman123.mods.fergotools.lib.strings.ArmorStrings;
import fergoman123.mods.fergotools.lib.strings.BowStrings;
import fergoman123.mods.fergotools.lib.strings.ItemStrings;
import fergoman123.mods.fergotools.lib.strings.MaterialStrings;
import fergoman123.mods.fergotools.lib.strings.ToolStrings;
import fergoman123.mods.fergotools.lib.textures.ArmorTextures;
import fergoman123.mods.fergotools.lib.textures.ItemTextures;
import fergoman123.mods.fergotools.lib.textures.ToolTextures;

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
	
	public static Item silkPickaxe;
	public static Item silkShovel;
	public static Item silkAxe;
	public static Item silkHoe;
	public static Item silkSword;
	
	public static Item obsidianIngot;
	public static Item emeraldCrystal;
	public static Item lapisCrystal;
	public static Item bronzeIngot;
	public static Item coalIngot;
	public static Item glowstoneIngot;
	public static Item adamantiumIngot;
	public static Item expShard;
	public static Item silkGem;
	
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
	public static ToolMaterial donator;
	public static ToolMaterial silk;
	
	public static ArmorMaterial quartzArmor;
	public static ArmorMaterial obsidianArmor;
	public static ArmorMaterial emeraldArmor;
	public static ArmorMaterial lapisArmor;
	public static ArmorMaterial bronzeArmor;
	public static ArmorMaterial coalArmor;
	public static ArmorMaterial glowstoneArmor;
	
	public static void addItems()
	{
		quartzPickaxe = new ItemQuartzPickaxe().setUnlocalizedName(ToolStrings.quartzTool[0]).setMaxDamage(quartz.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.quartzPickaxe);
        quartzShovel = new ItemQuartzShovel().setUnlocalizedName(ToolStrings.quartzTool[1]).setMaxDamage(quartz.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.quartzShovel);
		quartzAxe = new ItemQuartzAxe().setUnlocalizedName(ToolStrings.quartzTool[2]).setMaxDamage(quartz.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.quartzAxe);
		quartzHoe = new ItemQuartzHoe().setUnlocalizedName(ToolStrings.quartzTool[3]).setMaxDamage(quartz.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.quartzHoe);
		quartzSword = new ItemQuartzSword().setUnlocalizedName(ToolStrings.quartzTool[4]).setMaxDamage(quartz.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.quartzSword);
		
		obsidianPickaxe = new ItemObsidianPickaxe().setUnlocalizedName(ToolStrings.obsidianTool[0]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.obsidianPickaxe);
		obsidianShovel = new ItemObsidianShovel().setUnlocalizedName(ToolStrings.obsidianTool[1]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.obsidianShovel);
		obsidianAxe = new ItemObsidianAxe().setUnlocalizedName(ToolStrings.obsidianTool[2]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.obsidianAxe);
		obsidianHoe = new ItemObsidianHoe().setUnlocalizedName(ToolStrings.obsidianTool[3]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.obsidianHoe);
		obsidianSword = new ItemObsidianSword().setUnlocalizedName(ToolStrings.obsidianTool[4]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.obsidianSword);
		
		emeraldPickaxe = new ItemEmeraldPickaxe().setUnlocalizedName(ToolStrings.emeraldTool[0]).setMaxDamage(emerald.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.emeraldPickaxe);
		emeraldShovel = new ItemEmeraldShovel().setUnlocalizedName(ToolStrings.emeraldTool[1]).setMaxDamage(emerald.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.emeraldShovel);
		emeraldAxe = new ItemEmeraldAxe().setUnlocalizedName(ToolStrings.emeraldTool[2]).setMaxDamage(emerald.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.emeraldAxe);
		emeraldHoe = new ItemEmeraldHoe().setUnlocalizedName(ToolStrings.emeraldTool[3]).setMaxDamage(emerald.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.emeraldHoe);
		emeraldSword = new ItemEmeraldSword().setUnlocalizedName(ToolStrings.emeraldTool[4]).setMaxDamage(emerald.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.emeraldSword);
		
		lapisPickaxe = new ItemLapisPickaxe().setUnlocalizedName(ToolStrings.lapisTool[0]).setMaxDamage(lapis.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.lapisPickaxe);
		lapisShovel = new ItemLapisShovel().setUnlocalizedName(ToolStrings.lapisTool[1]).setMaxDamage(lapis.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.lapisShovel);
		lapisAxe = new ItemLapisAxe().setUnlocalizedName(ToolStrings.lapisTool[2]).setMaxDamage(lapis.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.lapisAxe);
		lapisHoe = new ItemLapisHoe().setUnlocalizedName(ToolStrings.lapisTool[3]).setMaxDamage(lapis.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.lapisHoe);
		lapisSword = new ItemLapisSword().setUnlocalizedName(ToolStrings.lapisTool[4]).setMaxDamage(lapis.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.lapisSword);
		
		bronzePickaxe = new ItemBronzePickaxe().setUnlocalizedName(ToolStrings.bronzeTool[0]).setMaxDamage(bronze.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.bronzePickaxe);
		bronzeShovel = new ItemBronzeShovel().setUnlocalizedName(ToolStrings.bronzeTool[1]).setMaxDamage(bronze.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.bronzeShovel);
		bronzeAxe = new ItemBronzeAxe().setUnlocalizedName(ToolStrings.bronzeTool[2]).setMaxDamage(bronze.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.bronzeAxe);
		bronzeHoe = new ItemBronzeHoe().setUnlocalizedName(ToolStrings.bronzeTool[3]).setMaxDamage(bronze.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.bronzeHoe);
		bronzeSword = new ItemBronzeSword().setUnlocalizedName(ToolStrings.bronzeTool[4]).setMaxDamage(bronze.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.bronzeSword);
		
		coalPickaxe = new ItemCoalPickaxe().setUnlocalizedName(ToolStrings.coalTool[0]).setMaxDamage(coal.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.coalPickaxe);
		coalShovel = new ItemCoalShovel().setUnlocalizedName(ToolStrings.coalTool[1]).setMaxDamage(coal.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.coalShovel);
		coalAxe = new ItemCoalAxe().setUnlocalizedName(ToolStrings.coalTool[2]).setMaxDamage(coal.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.coalAxe);
		coalHoe = new ItemCoalHoe().setUnlocalizedName(ToolStrings.coalTool[3]).setMaxDamage(coal.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.coalHoe);
		coalSword = new ItemCoalSword().setUnlocalizedName(ToolStrings.coalTool[4]).setMaxDamage(coal.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.coalSword);
		
		glowstonePickaxe = new ItemGlowstonePickaxe().setUnlocalizedName(ToolStrings.glowstoneTool[0]).setMaxDamage(glowstone.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.glowstonePickaxe);
		glowstoneShovel = new ItemGlowstoneShovel().setUnlocalizedName(ToolStrings.glowstoneTool[1]).setMaxDamage(glowstone.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.glowstoneShovel);
		glowstoneAxe = new ItemGlowstoneAxe().setUnlocalizedName(ToolStrings.glowstoneTool[2]).setMaxDamage(glowstone.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.glowstoneAxe);
		glowstoneHoe = new ItemGlowstoneHoe().setUnlocalizedName(ToolStrings.glowstoneTool[3]).setMaxDamage(glowstone.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.glowstoneHoe);
		glowstoneSword = new ItemGlowstoneSword().setUnlocalizedName(ToolStrings.glowstoneTool[4]).setMaxDamage(glowstone.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.glowstoneSword);
		
		adamantiumPickaxe = new ItemAdamantiumPickaxe().setUnlocalizedName(ToolStrings.adamantiumTool[0]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.adamantiumPickaxe);
		adamantiumShovel = new  ItemAdamantiumShovel().setUnlocalizedName(ToolStrings.adamantiumTool[1]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.adamantiumShovel);
		adamantiumAxe = new ItemAdamantiumAxe().setUnlocalizedName(ToolStrings.adamantiumTool[2]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.adamantiumAxe);
		adamantiumHoe = new ItemAdamantiumHoe().setUnlocalizedName(ToolStrings.adamantiumTool[3]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.adamantiumHoe);
		adamantiumSword = new ItemAdamantiumSword().setUnlocalizedName(ToolStrings.adamantiumTool[4]).setMaxDamage(obsidian.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.adamantiumSword);
		
		silkPickaxe = new ItemSilkPickaxe().setUnlocalizedName(ToolStrings.silkTool[0]).setMaxDamage(silk.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.silkPickaxe);
		silkShovel = new ItemSilkShovel().setUnlocalizedName(ToolStrings.silkTool[1]).setMaxDamage(silk.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.silkShovel);
		silkAxe = new ItemSilkAxe().setUnlocalizedName(ToolStrings.silkTool[2]).setMaxDamage(silk.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.silkAxe);
		silkHoe = new ItemSilkHoe().setUnlocalizedName(ToolStrings.silkTool[3]).setMaxDamage(silk.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.silkHoe);
		silkSword = new ItemSilkSword().setUnlocalizedName(ToolStrings.silkTool[4]).setMaxDamage(silk.getMaxUses()).setCreativeTab(FergoTools.tabFergoTools).setTextureName(ToolTextures.silkSword);
	
		obsidianIngot = new ItemObsidianIngot().setUnlocalizedName(ItemStrings.modItems[0]).setCreativeTab(FergoTools.tabFergoItems).setTextureName(ItemTextures.obsidianIngot);
		emeraldCrystal = new ItemEmeraldCrystal().setUnlocalizedName(ItemStrings.modItems[1]).setCreativeTab(FergoTools.tabFergoItems).setTextureName(ItemTextures.emeraldCrystal);
		lapisCrystal = new ItemLapisCrystal().setUnlocalizedName(ItemStrings.modItems[2]).setCreativeTab(FergoTools.tabFergoItems).setTextureName(ItemTextures.lapisCrystal);
		bronzeIngot = new ItemBronzeIngot().setUnlocalizedName(ItemStrings.modItems[3]).setCreativeTab(FergoTools.tabFergoItems).setTextureName(ItemTextures.bronzeIngot);
		coalIngot = new ItemCoalIngot().setUnlocalizedName(ItemStrings.modItems[4]).setCreativeTab(FergoTools.tabFergoItems).setTextureName(ItemTextures.coalIngot);
		glowstoneIngot = new ItemGlowstoneIngot().setUnlocalizedName(ItemStrings.modItems[5]).setCreativeTab(FergoTools.tabFergoItems).setTextureName(ItemTextures.glowstoneIngot);
		adamantiumIngot = new ItemAdamantiumIngot().setUnlocalizedName(ItemStrings.modItems[6]).setCreativeTab(FergoTools.tabFergoItems).setTextureName(ItemTextures.adamantiumIngot);
		expShard = new ItemExpShard().setUnlocalizedName(ItemStrings.modItems[7]).setCreativeTab(FergoTools.tabFergoItems).setTextureName(ItemTextures.expShard);
		silkGem = new ItemSilkGem().setUnlocalizedName(ItemStrings.modItems[8]).setCreativeTab(FergoTools.tabFergoItems).setTextureName(ItemTextures.silkGem);
	}
	
	public static void addArmor()
	{
		quartzHelmet = new ItemArmorQuartz(0).setUnlocalizedName(ArmorStrings.quartzArmorKey[0]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.quartzHelmet);
		quartzChestplate = new ItemArmorQuartz(1).setUnlocalizedName(ArmorStrings.quartzArmorKey[1]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.quartzChestplate);
		quartzLeggings = new ItemArmorQuartz(2).setUnlocalizedName(ArmorStrings.quartzArmorKey[2]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.quartzLeggings);
		quartzBoots = new ItemArmorQuartz(3).setUnlocalizedName(ArmorStrings.quartzArmorKey[3]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.quartzBoots);

        obsidianHelmet = new ItemArmorObsidian(0).setUnlocalizedName(ArmorStrings.obsidianArmorKey[0]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.obsidianHelmet);
		obsidianChestplate = new ItemArmorObsidian(1).setUnlocalizedName(ArmorStrings.obsidianArmorKey[1]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.obsidianChestplate);
		obsidianLeggings = new ItemArmorObsidian(3).setUnlocalizedName(ArmorStrings.obsidianArmorKey[2]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.obsidianLeggings);
		obsidianBoots = new ItemArmorObsidian(3).setUnlocalizedName(ArmorStrings.obsidianArmorKey[3]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.obsidianBoots);
		
		emeraldHelmet = new ItemArmorEmerald(0).setUnlocalizedName(ArmorStrings.emeraldArmorKey[0]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.emeraldHelmet);
		emeraldChestplate = new ItemArmorEmerald(1).setUnlocalizedName(ArmorStrings.emeraldArmorKey[1]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.emeraldChestplate);
		emeraldLeggings = new ItemArmorEmerald(2).setUnlocalizedName(ArmorStrings.emeraldArmorKey[2]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.emeraldLeggings);
		emeraldBoots = new ItemArmorEmerald(3).setUnlocalizedName(ArmorStrings.emeraldArmorKey[3]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.emeraldBoots);
		
		lapisHelmet = new ItemArmorLapis(0).setUnlocalizedName(ArmorStrings.lapisArmorKey[0]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.lapisHelmet);
		lapisChestplate = new ItemArmorLapis(1).setUnlocalizedName(ArmorStrings.lapisArmorKey[1]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.lapisChestplate);
		lapisLeggings = new ItemArmorLapis(2).setUnlocalizedName(ArmorStrings.lapisArmorKey[2]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.lapisLeggings);
		lapisBoots = new ItemArmorLapis(3).setUnlocalizedName(ArmorStrings.lapisArmorKey[3]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.lapisBoots);
		
		bronzeHelmet = new ItemArmorBronze(0).setUnlocalizedName(ArmorStrings.bronzeArmorKey[0]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.bronzeHelmet);
		bronzeChestplate = new ItemArmorBronze(1).setUnlocalizedName(ArmorStrings.bronzeArmorKey[1]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.bronzeChestplate);
		bronzeLeggings = new ItemArmorBronze(2).setUnlocalizedName(ArmorStrings.bronzeArmorKey[2]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.bronzeLeggings);
		bronzeBoots = new ItemArmorBronze(3).setUnlocalizedName(ArmorStrings.bronzeArmorKey[3]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.bronzeBoots);
		
		coalHelmet = new ItemArmorCoal(0).setUnlocalizedName(ArmorStrings.coalArmorKey[0]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.coalHelmet);
		coalChestplate = new ItemArmorCoal(1).setUnlocalizedName(ArmorStrings.coalArmorKey[1]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.coalChestplate);
		coalLeggings = new ItemArmorCoal(2).setUnlocalizedName(ArmorStrings.coalArmorKey[2]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.coalLeggings);
		coalBoots = new ItemArmorCoal(3).setUnlocalizedName(ArmorStrings.coalArmorKey[3]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.coalBoots);
		
		glowstoneHelmet = new ItemArmorGlowstone(0).setUnlocalizedName(ArmorStrings.glowstoneArmorKey[0]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.glowstoneHelmet);
		glowstoneChestplate = new ItemArmorGlowstone(1).setUnlocalizedName(ArmorStrings.glowstoneArmorKey[1]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.glowstoneChestplate);
		glowstoneLeggings = new ItemArmorGlowstone(2).setUnlocalizedName(ArmorStrings.glowstoneArmorKey[2]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.glowstoneLeggings);
		glowstoneBoots = new ItemArmorGlowstone(3).setUnlocalizedName(ArmorStrings.glowstoneArmorKey[3]).setCreativeTab(FergoTools.tabFergoArmor).setTextureName(ArmorTextures.glowstoneBoots);
	}
	
	public static void addBows()
	{
		quartzBow = new ItemQuartzBow().setUnlocalizedName(BowStrings.bows[0]).setCreativeTab(FergoTools.tabFergoBows).setMaxDamage(ToolInts.quartzMaxDamage).setMaxStackSize(1);
		obsidianBow = new ItemObsidianBow().setUnlocalizedName(BowStrings.bows[1]).setCreativeTab(FergoTools.tabFergoBows).setMaxDamage(ToolInts.obsidianMaxDamage).setMaxStackSize(1);
		emeraldBow = new ItemEmeraldBow().setUnlocalizedName(BowStrings.bows[2]).setCreativeTab(FergoTools.tabFergoBows).setMaxDamage(ToolInts.emeraldMaxDamage).setMaxStackSize(1);
		lapisBow = new ItemLapisBow().setUnlocalizedName(BowStrings.bows[3]).setCreativeTab(FergoTools.tabFergoBows).setMaxDamage(ToolInts.lapisMaxDamage).setMaxStackSize(1);
		bronzeBow = new ItemBronzeBow().setUnlocalizedName(BowStrings.bows[4]).setCreativeTab(FergoTools.tabFergoBows).setMaxDamage(ToolInts.bronzeMaxDamage).setMaxStackSize(1);
		coalBow = new ItemCoalBow().setUnlocalizedName(BowStrings.bows[5]).setCreativeTab(FergoTools.tabFergoBows).setMaxDamage(ToolInts.coalMaxDamage).setMaxStackSize(1);
		glowstoneBow = new ItemGlowstoneBow().setUnlocalizedName(BowStrings.bows[6]).setCreativeTab(FergoTools.tabFergoBows).setMaxDamage(ToolInts.glowstoneMaxDamage).setMaxStackSize(1);
		adamantiumBow = new ItemAdamantiumBow().setUnlocalizedName(BowStrings.bows[7]).setCreativeTab(FergoTools.tabFergoBows).setMaxDamage(ToolInts.adamantiumMaxDamage).setMaxStackSize(1);
		
	}
	


	public static void addToolMaterials()
	{
		quartz = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[0], ToolInts.harvestLvl, ToolInts.quartzMaxDamage, ToolInts.quartzEff, ToolInts.quartzDamage, ToolInts.enchantability);
        obsidian = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[1], ToolInts.harvestLvl, ToolInts.obsidianMaxDamage, ToolInts.obsidianEff, ToolInts.obsidianDamage, ToolInts.enchantability);
		emerald = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[2], ToolInts.harvestLvl, ToolInts.emeraldMaxDamage, ToolInts.emeraldEff, ToolInts.emeraldDamage, ToolInts.enchantability);
		lapis = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[3], ToolInts.harvestLvl, ToolInts.lapisMaxDamage, ToolInts.lapisEff, ToolInts.lapisDamage, ToolInts.enchantability);
		bronze = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[4], ToolInts.harvestLvl, ToolInts.bronzeMaxDamage, ToolInts.bronzeEff, ToolInts.bronzeDamage, ToolInts.enchantability);
		coal = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[5], ToolInts.harvestLvl, ToolInts.coalMaxDamage, ToolInts.coalEff, ToolInts.coalDamage, ToolInts.enchantability);
        glowstone = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[6], ToolInts.harvestLvl, ToolInts.glowstoneMaxDamage, ToolInts.glowstoneEff, ToolInts.glowstoneDamage, ToolInts.enchantability);
        adamantium = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[7], ToolInts.harvestLvl, ToolInts.adamantiumMaxDamage, ToolInts.adamantiumEff, ToolInts.adamantiumDamage, ToolInts.enchantability);
        donator = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[8], 3, 20000, 10f, 10, 30);
        silk = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[9], 3, 2500, 5f, 5, 30);
	}
	
	public static void addArmorMaterials()
	{
		quartzArmor = EnumHelper.addArmorMaterial(MaterialStrings.armorMaterials[0], ArmorInts.quartzArmorMaxDamage, ArmorInts.quartzReduct, ArmorInts.enchantability);
		obsidianArmor = EnumHelper.addArmorMaterial(MaterialStrings.armorMaterials[1], ArmorInts.obsidianArmorMaxDamage, ArmorInts.obsidianReduct, ArmorInts.enchantability);
		emeraldArmor = EnumHelper.addArmorMaterial(MaterialStrings.armorMaterials[2], ArmorInts.obsidianArmorMaxDamage, ArmorInts.emeraldReduct, ArmorInts.enchantability);
		lapisArmor = EnumHelper.addArmorMaterial(MaterialStrings.armorMaterials[3], ArmorInts.lapisArmorMaxDamage, ArmorInts.lapisReduct, ArmorInts.enchantability);
		bronzeArmor = EnumHelper.addArmorMaterial(MaterialStrings.armorMaterials[4], ArmorInts.bronzeArmorMaxDamage, ArmorInts.bronzeReduct, ArmorInts.enchantability);
		coalArmor = EnumHelper.addArmorMaterial(MaterialStrings.armorMaterials[5], ArmorInts.coalArmorMaxDamage, ArmorInts.coalReduct, ArmorInts.enchantability);
		glowstoneArmor = EnumHelper.addArmorMaterial(MaterialStrings.armorMaterials[6], ArmorInts.glowstoneArmorMaxDamage, ArmorInts.glowstoneReduct, ArmorInts.enchantability);
	}

}

package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.api.ItemFT;
import io.github.fergoman123.fergotools.api.ItemPickaxeFT;
import io.github.fergoman123.fergotools.common.items.ItemExpShard;
import io.github.fergoman123.fergotools.common.items.ItemStaffExp;
import io.github.fergoman123.fergotools.info.ArmorConstants;
import io.github.fergoman123.fergotools.info.ItemNames;
import io.github.fergoman123.fergotools.info.ModInfo;
import io.github.fergoman123.fergotools.info.ToolConstants.Damage;
import io.github.fergoman123.fergotools.info.ToolConstants.Eff;
import io.github.fergoman123.fergotools.info.ToolConstants.MaxDamage;
import io.github.fergoman123.fergotools.info.ToolConstants.Types;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergoutil.item.ItemFergo;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.terraingen.OreGenEvent;

public class ModItems
{
    public static Item ingotObsidian;
    public static Item gemEmerald;
    public static Item gemLapis;
    public static Item ingotBronze;
    public static Item ingotCoal;
    public static Item ingotGlowstone;
    public static Item ingotAdamantium;
    public static Item gemSilk;
    public static Item gemRedstone;
    public static Item shardExp;
    public static Item expCollector;
    public static Item staffExp;
    public static Item gemExp;
    public static Item gemExp2;
    public static Item gemExp3;

    public static Item quartzPickaxe;
    public static Item quartzShovel;
    public static Item quartzAxe;
    public static Item quartzHoe;
    public static Item quartzSword;


    public static void init()
    {
        ingotObsidian = new ItemFT(ItemNames.ingotObsidian);
        gemEmerald = new ItemFT(ItemNames.gemEmerald);
        gemLapis = new ItemFT(ItemNames.gemLapis);
        ingotBronze = new ItemFT(ItemNames.ingotBronze);
        ingotCoal = new ItemFT(ItemNames.ingotCoal);
        ingotGlowstone = new ItemFT(ItemNames.ingotGlowstone);
        ingotAdamantium = new ItemFT(ItemNames.ingotAdamantium);
        gemSilk = new ItemFT(ItemNames.gemSilk);
        gemRedstone = new ItemFT(ItemNames.gemRedstone);
        shardExp = new ItemExpShard(ItemNames.shardExp);
        expCollector = new ItemFT(ItemNames.expCollector);
        staffExp = new ItemStaffExp(ItemNames.staffExp);
        gemExp = new ItemFT(ItemNames.gemExp);
        gemExp2 = new ItemFT(ItemNames.gemExp2);
        gemExp3 = new ItemFT(ItemNames.gemExp3);

        quartzPickaxe = new ItemPickaxeFT(Materials.quartz, ItemNames.quartzPickaxe);
    }

    public static void register()
    {
        registerItem(ingotObsidian, ItemNames.ingotObsidian);
        registerItem(gemEmerald, ItemNames.gemEmerald);
        registerItem(gemLapis, ItemNames.gemLapis);
        registerItem(ingotBronze, ItemNames.ingotBronze);
        registerItem(ingotCoal, ItemNames.ingotCoal);
        registerItem(ingotGlowstone, ItemNames.ingotGlowstone);
        registerItem(ingotAdamantium, ItemNames.ingotAdamantium);
        registerItem(gemSilk, ItemNames.gemSilk);
        registerItem(gemRedstone, ItemNames.gemRedstone);
        registerItem(shardExp, ItemNames.shardExp);
        registerItem(expCollector, ItemNames.expCollector);
        registerItem(staffExp, ItemNames.staffExp, ItemNames.staffExpVariants);
        registerItem(gemExp, ItemNames.gemExp);
        registerItem(gemExp2, ItemNames.gemExp2);
        registerItem(gemExp3, ItemNames.gemExp3);

        registerItem(quartzPickaxe, ItemNames.quartzPickaxe);
    }

    public static void registerItem(Item item, String name)
    {
        RegisterHelper.registerItem(item, ModInfo.modid, name);
    }

    public static void registerItem(Item item, String name, String[] modelNames)
    {
        RegisterHelper.registerItem(item, ModInfo.modid, name, modelNames);
    }

    public static final class Materials
    {
        public static final ToolMaterial quartz = addToolMaterial(Types.quartz, 3, MaxDamage.quartzMaxDamage, Eff.quartzEff, Damage.quartzDamage, 30, Items.quartz);
        public static final ToolMaterial obsidian = addToolMaterial(Types.obsidian, 3, MaxDamage.obsidianMaxDamage, Eff.obsidianEff, Damage.obsidianDamage, 30, ModItems.ingotObsidian);
        public static final ToolMaterial emerald = addToolMaterial(Types.emerald, 3, MaxDamage.emeraldMaxDamage, Eff.emeraldEff, Damage.emeraldDamage, 30, ModItems.gemEmerald);
        public static final ToolMaterial lapis = addToolMaterial(Types.lapis, 3, MaxDamage.lapisMaxDamage, Eff.lapisEff, Damage.lapisDamage, 30, ModItems.gemLapis);
        public static final ToolMaterial bronze = addToolMaterial(Types.bronze, 3, MaxDamage.bronzeMaxDamage, Eff.bronzeEff, Damage.bronzeDamage, 30, ModItems.ingotBronze);
        public static final ToolMaterial coal = addToolMaterial(Types.coal, 3, MaxDamage.coalMaxDamage, Eff.coalEff, Damage.coalDamage, 30, ModItems.ingotCoal);
        public static final ToolMaterial glowstone = addToolMaterial(Types.glowstone, 3, MaxDamage.glowstoneMaxDamage, Eff.glowstoneEff, Damage.glowstoneDamage, 30, ModItems.ingotGlowstone);
        public static final ToolMaterial adamantium = addToolMaterial(Types.adamantium, 3, MaxDamage.adamantiumMaxDamage, Eff.adamantiumEff, Damage.adamantiumDamage, 30, ModItems.ingotAdamantium);
        public static final ToolMaterial silk = addToolMaterial(Types.silk, 3, MaxDamage.silkMaxDamage, Eff.silkEff, Damage.silkDamage, 30, ModItems.gemSilk);
        public static final ToolMaterial redstone = addToolMaterial(Types.redstone, 3, MaxDamage.redstoneMaxDamage, Eff.redstoneEff, Damage.redstoneDamage, 30, ModItems.gemRedstone);
        public static final ToolMaterial donator = addToolMaterial(Types.donator, 3, MaxDamage.donatorMaxDamage, Eff.donatorEff, Damage.donatorDamage, 30, Items.diamond);

        public static final ArmorMaterial quartzArmor = addArmorMaterial(ArmorConstants.Types.quartzArmor, ArmorConstants.MaxDamage.quartzArmorMaxDamage, ArmorConstants.Reduction.quartzReduct, 30);
        public static final ArmorMaterial obsidianArmor = addArmorMaterial(ArmorConstants.Types.obsidianArmor, ArmorConstants.MaxDamage.obsidianArmorMaxDamage, ArmorConstants.Reduction.obsidianReduct, 30);
        public static final ArmorMaterial emeraldArmor = addArmorMaterial(ArmorConstants.Types.emeraldArmor, ArmorConstants.MaxDamage.emeraldArmorMaxDamage, ArmorConstants.Reduction.emeraldReduct, 30);
        public static final ArmorMaterial lapisArmor = addArmorMaterial(ArmorConstants.Types.lapisArmor, ArmorConstants.MaxDamage.lapisArmorMaxDamage, ArmorConstants.Reduction.lapisReduct, 30);
        public static final ArmorMaterial bronzeArmor = addArmorMaterial(ArmorConstants.Types.bronzeArmor, ArmorConstants.MaxDamage.bronzeArmorMaxDamage, ArmorConstants.Reduction.bronzeReduct, 30);
        public static final ArmorMaterial coalArmor = addArmorMaterial(ArmorConstants.Types.coalArmor, ArmorConstants.MaxDamage.coalArmorMaxDamage, ArmorConstants.Reduction.coalReduct, 30);
        public static final ArmorMaterial glowstoneArmor = addArmorMaterial(ArmorConstants.Types.glowstoneArmor, ArmorConstants.MaxDamage.glowstoneArmorMaxDamage, ArmorConstants.Reduction.glowstoneReduct, 30);
        public static final ArmorMaterial redstoneArmor = addArmorMaterial(ArmorConstants.Types.redstoneArmor, ArmorConstants.MaxDamage.redstoneArmorMaxDamage, ArmorConstants.Reduction.redstoneReduct, 30);
        public static final ArmorMaterial adamantiumArmor = addArmorMaterial(ArmorConstants.Types.adamantiumArmor, ArmorConstants.MaxDamage.adamantiumArmorMaxDamage, ArmorConstants.Reduction.adamantiumReduct, 30);

        public static Item getArmorRepairItem(ArmorMaterial material)
        {
            if (material == quartzArmor)
            {
                return Items.quartz;
            }
            else if(material == obsidianArmor)
            {
                return ModItems.ingotObsidian;
            }
            else if(material == emeraldArmor)
            {
                return ModItems.gemEmerald;
            }
            else if (material == lapisArmor)
            {
                return ModItems.gemLapis;
            }
            else if (material == bronzeArmor)
            {
                return ModItems.ingotBronze;
            }
            else if (material == coalArmor)
            {
                return ModItems.ingotCoal;
            }
            else if (material == glowstoneArmor)
            {
                return ModItems.ingotGlowstone;
            }
            else if (material == redstoneArmor)
            {
                return ModItems.gemRedstone;
            }
            else if (material == adamantiumArmor)
            {
                return ModItems.ingotAdamantium;
            }
            else
            {
                return null;
            }
        }

        public static ToolMaterial addToolMaterial(String name, int harvestLevel, int maxDamage, float eff, float damage, int enchantability, Item repairItem)
        {
            return EnumHelper.addToolMaterial(name, harvestLevel, maxDamage, eff, damage, enchantability).setRepairItem(new ItemStack(repairItem));
        }

        public static ArmorMaterial addArmorMaterial(String name, int durability, int[] reduct, int enchantability)
        {
            return EnumHelper.addArmorMaterial(name, name, durability, reduct, enchantability);
        }
    }
}

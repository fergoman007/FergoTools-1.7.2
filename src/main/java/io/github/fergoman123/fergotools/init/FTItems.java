package io.github.fergoman123.fergotools.init;

import cpw.mods.fml.relauncher.SideOnly;
import io.github.fergoman123.fergotools.core.FTContent;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.ArmorTooltipLocale;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.reference.names.OreDict;
import io.github.fergoman123.fergotools.util.PotionList;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.util.base.ItemBowFT;
import io.github.fergoman123.fergotools.util.base.ItemFT;
import io.github.fergoman123.fergotools.util.base.ItemStickFT;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.*;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

import java.util.List;

import static cpw.mods.fml.relauncher.Side.CLIENT;
@SuppressWarnings("unchecked")
public class FTItems
{
    public static final class ItemQuartzPickaxe extends ItemPickaxeFT
    {

        public ItemQuartzPickaxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean advancedTooltip) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemQuartzShovel extends ItemShovelFT
    {

        public ItemQuartzShovel(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemQuartzAxe extends ItemAxeFT
    {

        public ItemQuartzAxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemQuartzHoe extends ItemHoeFT
    {

        public ItemQuartzHoe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemQuartzSword extends ItemSwordFT
    {

        public ItemQuartzSword(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemObsidianPickaxe extends ItemPickaxeFT
    {

        public ItemObsidianPickaxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemObsidianShovel extends ItemShovelFT
    {

        public ItemObsidianShovel(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemObsidianAxe extends ItemAxeFT
    {

        public ItemObsidianAxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemObsidianHoe extends ItemHoeFT
    {

        public ItemObsidianHoe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemObsidianSword extends ItemSwordFT
    {

        public ItemObsidianSword(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemEmeraldPickaxe extends ItemPickaxeFT
    {

        public ItemEmeraldPickaxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemEmeraldShovel extends ItemShovelFT
    {

        public ItemEmeraldShovel(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemEmeraldAxe extends ItemAxeFT
    {

        public ItemEmeraldAxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemEmeraldHoe extends ItemHoeFT
    {

        public ItemEmeraldHoe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemEmeraldSword extends ItemSwordFT
    {

        public ItemEmeraldSword(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemLapisPickaxe extends ItemPickaxeFT
    {

        public ItemLapisPickaxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
    }
}

    public static final class ItemLapisShovel extends ItemShovelFT
    {

        public ItemLapisShovel(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemLapisAxe extends ItemAxeFT
    {

        public ItemLapisAxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemLapisHoe extends ItemHoeFT
    {

        public ItemLapisHoe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemLapisSword extends ItemSwordFT
    {

        public ItemLapisSword(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemBronzePickaxe extends ItemPickaxeFT
    {

        public ItemBronzePickaxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemBronzeShovel extends ItemShovelFT
    {

        public ItemBronzeShovel(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemBronzeAxe extends ItemAxeFT
    {

        public ItemBronzeAxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemBronzeHoe extends ItemHoeFT
    {

        public ItemBronzeHoe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemBronzeSword extends ItemSwordFT
    {

        public ItemBronzeSword(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemCoalPickaxe extends ItemPickaxeFT
    {

        public ItemCoalPickaxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemCoalShovel extends ItemShovelFT
    {

        public ItemCoalShovel(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemCoalAxe extends ItemAxeFT
    {

        public ItemCoalAxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemCoalHoe extends ItemHoeFT
    {

        public ItemCoalHoe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemCoalSword extends ItemSwordFT
    {

        public ItemCoalSword(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemGlowstonePickaxe extends ItemPickaxeFT
    {

        public ItemGlowstonePickaxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemGlowstoneShovel extends ItemShovelFT
    {

        public ItemGlowstoneShovel(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemGlowstoneAxe extends ItemAxeFT
    {

        public ItemGlowstoneAxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemGlowstoneHoe extends ItemHoeFT
    {

        public ItemGlowstoneHoe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemGlowstoneSword extends ItemSwordFT
    {
        public ItemGlowstoneSword(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemAdamantiumPickaxe extends ItemPickaxeFT
    {
        public ItemAdamantiumPickaxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemAdamantiumShovel extends ItemShovelFT
    {
        public ItemAdamantiumShovel(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemAdamantiumAxe extends ItemAxeFT
    {
        public ItemAdamantiumAxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemAdamantiumHoe extends ItemHoeFT
    {
        public ItemAdamantiumHoe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemAdamantiumSword extends ItemSwordFT
    {
        public ItemAdamantiumSword(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemSilkPickaxe extends ItemPickaxeFT
    {

        public ItemSilkPickaxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemSilkShovel extends ItemShovelFT
    {
        public ItemSilkShovel(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemSilkAxe extends ItemAxeFT
    {
        public ItemSilkAxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemSilkHoe extends ItemHoeFT
    {
        public ItemSilkHoe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemSilkSword extends ItemSwordFT
    {
        public ItemSilkSword(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemRedstonePickaxe extends ItemPickaxeFT
    {

        public ItemRedstonePickaxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemRedstoneShovel extends ItemShovelFT
    {

        public ItemRedstoneShovel(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemRedstoneAxe extends ItemAxeFT
    {
        public ItemRedstoneAxe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemRedstoneHoe extends ItemHoeFT
    {

        public ItemRedstoneHoe(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemRedstoneSword extends ItemSwordFT
    {

        public ItemRedstoneSword(ToolMaterial material, int maxUses, String itemName) {
            super(material, maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemQuartzShears extends ItemShearsFT
    {

        public ItemQuartzShears(int maxUses, String itemName) {
            super(maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemObsidianShears extends ItemShearsFT
    {

        public ItemObsidianShears(int maxUses, String itemName) {
            super(maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemEmeraldShears extends ItemShearsFT
    {

        public ItemEmeraldShears(int maxUses, String itemName) {
            super(maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemLapisShears extends ItemShearsFT
    {

        public ItemLapisShears(int maxUses, String itemName) {
            super(maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemBronzeShears extends ItemShearsFT
    {

        public ItemBronzeShears(int maxUses, String itemName) {
            super(maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemCoalShears extends ItemShearsFT
    {

        public ItemCoalShears(int maxUses, String itemName) {
            super(maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemGlowstoneShears extends ItemShearsFT
    {

        public ItemGlowstoneShears(int maxUses, String itemName) {
            super(maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemAdamantiumShears extends ItemShearsFT
    {

        public ItemAdamantiumShears(int maxUses, String itemName) {
            super(maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemSilkShears extends ItemShearsFT
    {

        public ItemSilkShears(int maxUses, String itemName) {
            super(maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemRedstoneShears extends ItemShearsFT
    {

        public ItemRedstoneShears(int maxUses, String itemName) {
            super(maxUses, itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemQuartzBow extends ItemBowFT {

        public static final String[] pullArray = new String[]{"_1", "_2", "_3"};

        public ItemQuartzBow(int maxUses, String itemName) {
            super(maxUses, itemName);
        }


        public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
        {
            return stack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(stack1, stack2);
        }

        public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int par4)
        {
            int j = this.getMaxItemUseDuration(stack) - par4;

            ArrowLooseEvent event = new ArrowLooseEvent(player, stack, j);
            MinecraftForge.EVENT_BUS.post(event);
            if (event.isCanceled())
            {
                return;
            }
            j = event.charge;

            boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

            if (flag || player.inventory.hasItem(Items.arrow))
            {
                float f = (float)j / 20.0F;
                f = (f * f + f * 2.0F) / 3.0F;

                if ((double)f < 0.1D)
                {
                    return;
                }

                if (f > 1.0F)
                {
                    f = 1.0F;
                }

                EntityArrow entityarrow = new EntityArrow(world, player, f * 2.0F);

                if (f == 1.0F)
                {
                    entityarrow.setIsCritical(true);
                }

                int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

                if (k > 0)
                {
                    entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
                }

                int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

                if (l > 0)
                {
                    entityarrow.setKnockbackStrength(l);
                }

                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
                {
                    entityarrow.setFire(100);
                }

                stack.damageItem(1, player);
                world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                if (flag)
                {
                    entityarrow.canBePickedUp = 2;
                }
                else
                {
                    player.inventory.consumeInventoryItem(Items.arrow);
                }

                if (!world.isRemote)
                {
                    world.spawnEntityInWorld(entityarrow);
                }
            }
        }

        public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
        {
            return stack;
        }

        public int getMaxItemUseDuration(ItemStack stack)
        {
            return 72000;
        }

        public EnumAction getItemUseAction(ItemStack stack)
        {
            return EnumAction.bow;
        }

        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
        {
            ArrowNockEvent event = new ArrowNockEvent(player, stack);
            MinecraftForge.EVENT_BUS.post(event);
            if(!event.isCancelable())
            {
                return event.result;
            }

            if(player.capabilities.isCreativeMode || player.inventory.hasItem(Items.arrow))
            {
                player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
            }
            return stack;
        }

        @Override
        public int getItemEnchantability() {
            return Materials.Tools.quartz.getEnchantability();
        }

        public void registerIcons(IIconRegister register)
        {
            this.itemIcon = register.registerIcon(Textures.quartzBowStandy);
            this.textures = new IIcon[pullArray.length];

            for (int i = 0; i < pullArray.length; i++)
            {
                this.textures[i] = register.registerIcon(Reference.textureLoc + ItemNames.bowQuartz + pullArray[i]);
            }
        }

        public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
        {
            if(player.getItemInUse() == null) return this.itemIcon;
            int pulling = stack.getMaxItemUseDuration() - useRemaining;
            if(pulling >= 18)
            {
                return textures[2];
            }
            else if(pulling > 13)
            {
                return textures[1];
            }
            else if(pulling > 0)
            {
                return textures[0];
            }
            return this.itemIcon;
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemObsidianBow extends ItemBowFT {

        public static final String[] pullArray = new String [] {"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture;

        public ItemObsidianBow(int maxUses, String itemName) {
            super(maxUses, itemName);
        }

        public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int par4)
        {
            int j = this.getMaxItemUseDuration(stack) - par4;

            ArrowLooseEvent event = new ArrowLooseEvent(player, stack, j);
            MinecraftForge.EVENT_BUS.post(event);
            if (event.isCanceled())
            {
                return;
            }
            j = event.charge;

            boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

            if (flag || player.inventory.hasItem(Items.arrow))
            {
                float f = (float)j / 20.0F;
                f = (f * f + f * 2.0F) / 3.0F;

                if ((double)f < 0.1D)
                {
                    return;
                }

                if (f > 1.0F)
                {
                    f = 1.0F;
                }

                EntityArrow entityarrow = new EntityArrow(world, player, f * 2.0F);

                if (f == 1.0F)
                {
                    entityarrow.setIsCritical(true);
                }

                int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

                if (k > 0)
                {
                    entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
                }

                int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

                if (l > 0)
                {
                    entityarrow.setKnockbackStrength(l);
                }

                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
                {
                    entityarrow.setFire(100);
                }

                stack.damageItem(1, player);
                world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                if (flag)
                {
                    entityarrow.canBePickedUp = 2;
                }
                else
                {
                    player.inventory.consumeInventoryItem(Items.arrow);
                }

                if (!world.isRemote)
                {
                    world.spawnEntityInWorld(entityarrow);
                }
            }
        }

        public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
        {
            return stack;
        }

        public int getMaxItemUseDuration(ItemStack stack)
        {
            return 72000;
        }

        public EnumAction getItemUseAction(ItemStack stack)
        {
            return EnumAction.bow;
        }

        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
        {
            ArrowNockEvent event = new ArrowNockEvent(player, stack);
            MinecraftForge.EVENT_BUS.post(event);
            if(!event.isCancelable())
            {
                return event.result;
            }

            if(player.capabilities.isCreativeMode || player.inventory.hasItem(Items.arrow))
            {
                player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
            }
            return stack;
        }

        @Override
        public int getItemEnchantability() {
            return Materials.Tools.obsidian.getEnchantability();
        }

        public void registerIcons(IIconRegister register)
        {
            this.itemIcon = register.registerIcon(Textures.obsidianBowStandy);
            this.texture = new IIcon[pullArray.length];

            for (int i = 0; i < pullArray.length; i++)
            {
                this.texture[i] = register.registerIcon(Reference.textureLoc + ItemNames.bowObsidian + pullArray[i]);
            }
        }

        public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
        {
            if(player.getItemInUse() == null) return this.itemIcon;
            int pulling = stack.getMaxItemUseDuration() - useRemaining;
            if(pulling >= 18)
            {
                return texture[2];
            }
            else if(pulling > 13)
            {
                return texture[1];
            }
            else if(pulling > 0)
            {
                return texture[0];
            }
            return this.itemIcon;
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemEmeraldBow extends ItemBowFT {

        public static final String[] pullArray = new String[] {"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture;

        public ItemEmeraldBow(int maxUses, String itemName) {
            super(maxUses, itemName);
        }

        public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int par4)
        {
            int j = this.getMaxItemUseDuration(stack) - par4;

            ArrowLooseEvent event = new ArrowLooseEvent(player, stack, j);
            MinecraftForge.EVENT_BUS.post(event);
            if (event.isCanceled())
            {
                return;
            }
            j = event.charge;

            boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

            if (flag || player.inventory.hasItem(Items.arrow))
            {
                float f = (float)j / 20.0F;
                f = (f * f + f * 2.0F) / 3.0F;

                if ((double)f < 0.1D)
                {
                    return;
                }

                if (f > 1.0F)
                {
                    f = 1.0F;
                }

                EntityArrow entityarrow = new EntityArrow(world, player, f * 2.0F);

                if (f == 1.0F)
                {
                    entityarrow.setIsCritical(true);
                }

                int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

                if (k > 0)
                {
                    entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
                }

                int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

                if (l > 0)
                {
                    entityarrow.setKnockbackStrength(l);
                }

                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
                {
                    entityarrow.setFire(100);
                }

                stack.damageItem(1, player);
                world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                if (flag)
                {
                    entityarrow.canBePickedUp = 2;
                }
                else
                {
                    player.inventory.consumeInventoryItem(Items.arrow);
                }

                if (!world.isRemote)
                {
                    world.spawnEntityInWorld(entityarrow);
                }
            }
        }

        public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
        {
            return stack;
        }

        public int getMaxItemUseDuration(ItemStack stack)
        {
            return 72000;
        }

        public EnumAction getItemUseAction(ItemStack stack)
        {
            return EnumAction.bow;
        }

        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
        {
            ArrowNockEvent event = new ArrowNockEvent(player, stack);
            MinecraftForge.EVENT_BUS.post(event);
            if(!event.isCancelable())
            {
                return event.result;
            }

            if(player.capabilities.isCreativeMode || player.inventory.hasItem(Items.arrow))
            {
                player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
            }
            return stack;
        }

        @Override
        public int getItemEnchantability() {
            return Materials.Tools.emerald.getEnchantability();
        }

        public void registerIcons(IIconRegister register)
        {
            this.itemIcon = register.registerIcon(Textures.emeraldBowStandy);
            this.texture = new IIcon[pullArray.length];

            for (int i = 0; i < pullArray.length; i++)
            {
                this.texture[i] = register.registerIcon(Reference.textureLoc + ItemNames.bowEmerald + pullArray[i]);
            }
        }

        public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
        {
            if(player.getItemInUse() == null) return this.itemIcon;
            int pulling = stack.getMaxItemUseDuration() - useRemaining;
            if(pulling >= 18)
            {
                return texture[2];
            }
            else if(pulling > 13)
            {
                return texture[1];
            }
            else if(pulling > 0)
            {
                return texture[0];
            }
            return this.itemIcon;
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemLapisBow extends ItemBowFT {

        public static final String[] pullArray = new String[]{"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture;

        public ItemLapisBow(int maxUses, String itemName) {
            super(maxUses, itemName);
        }

        public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int par4)
        {
            int j = this.getMaxItemUseDuration(stack) - par4;

            ArrowLooseEvent event = new ArrowLooseEvent(player, stack, j);
            MinecraftForge.EVENT_BUS.post(event);
            if (event.isCanceled())
            {
                return;
            }
            j = event.charge;

            boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

            if (flag || player.inventory.hasItem(Items.arrow))
            {
                float f = (float)j / 20.0F;
                f = (f * f + f * 2.0F) / 3.0F;

                if ((double)f < 0.1D)
                {
                    return;
                }

                if (f > 1.0F)
                {
                    f = 1.0F;
                }

                EntityArrow entityarrow = new EntityArrow(world, player, f * 2.0F);

                if (f == 1.0F)
                {
                    entityarrow.setIsCritical(true);
                }

                int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

                if (k > 0)
                {
                    entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
                }

                int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

                if (l > 0)
                {
                    entityarrow.setKnockbackStrength(l);
                }

                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
                {
                    entityarrow.setFire(100);
                }

                stack.damageItem(1, player);
                world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                if (flag)
                {
                    entityarrow.canBePickedUp = 2;
                }
                else
                {
                    player.inventory.consumeInventoryItem(Items.arrow);
                }

                if (!world.isRemote)
                {
                    world.spawnEntityInWorld(entityarrow);
                }
            }
        }

        public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
        {
            return stack;
        }

        public int getMaxItemUseDuration(ItemStack stack)
        {
            return 72000;
        }

        public EnumAction getItemUseAction(ItemStack stack)
        {
            return EnumAction.bow;
        }

        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
        {
            ArrowNockEvent event = new ArrowNockEvent(player, stack);
            MinecraftForge.EVENT_BUS.post(event);
            if(!event.isCancelable())
            {
                return event.result;
            }

            if(player.capabilities.isCreativeMode || player.inventory.hasItem(Items.arrow))
            {
                player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
            }
            return stack;
        }

        @Override
        public int getItemEnchantability() {
            return Materials.Tools.lapis.getEnchantability();
        }

        public void registerIcons(IIconRegister register)
        {
            this.itemIcon = register.registerIcon(Textures.lapisBowStandy);
            this.texture = new IIcon[pullArray.length];

            for (int i = 0; i < pullArray.length; i++)
            {
                this.texture[i] = register.registerIcon(Reference.textureLoc + ItemNames.bowLapis + pullArray[i]);
            }
        }

        public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
        {
            if(player.getItemInUse() == null) return this.itemIcon;
            int pulling = stack.getMaxItemUseDuration() - useRemaining;
            if(pulling >= 18)
            {
                return texture[2];
            }
            else if(pulling > 13)
            {
                return texture[1];
            }
            else if(pulling > 0)
            {
                return texture[0];
            }
            return this.itemIcon;
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemBronzeBow extends ItemBowFT {

        public static final String[] pullArray = new String[]{"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture;

        public ItemBronzeBow(int maxUses, String itemName) {
            super(maxUses, itemName);
        }

        public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int par4)
        {
            int j = this.getMaxItemUseDuration(stack) - par4;

            ArrowLooseEvent event = new ArrowLooseEvent(player, stack, j);
            MinecraftForge.EVENT_BUS.post(event);
            if (event.isCanceled())
            {
                return;
            }
            j = event.charge;

            boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

            if (flag || player.inventory.hasItem(Items.arrow))
            {
                float f = (float)j / 20.0F;
                f = (f * f + f * 2.0F) / 3.0F;

                if ((double)f < 0.1D)
                {
                    return;
                }

                if (f > 1.0F)
                {
                    f = 1.0F;
                }

                EntityArrow entityarrow = new EntityArrow(world, player, f * 2.0F);

                if (f == 1.0F)
                {
                    entityarrow.setIsCritical(true);
                }

                int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

                if (k > 0)
                {
                    entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
                }

                int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

                if (l > 0)
                {
                    entityarrow.setKnockbackStrength(l);
                }

                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
                {
                    entityarrow.setFire(100);
                }

                stack.damageItem(1, player);
                world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                if (flag)
                {
                    entityarrow.canBePickedUp = 2;
                }
                else
                {
                    player.inventory.consumeInventoryItem(Items.arrow);
                }

                if (!world.isRemote)
                {
                    world.spawnEntityInWorld(entityarrow);
                }
            }
        }

        public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
        {
            return stack;
        }

        public int getMaxItemUseDuration(ItemStack stack)
        {
            return 72000;
        }

        public EnumAction getItemUseAction(ItemStack stack)
        {
            return EnumAction.bow;
        }

        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
        {
            ArrowNockEvent event = new ArrowNockEvent(player, stack);
            MinecraftForge.EVENT_BUS.post(event);
            if(!event.isCancelable())
            {
                return event.result;
            }

            if(player.capabilities.isCreativeMode || player.inventory.hasItem(Items.arrow))
            {
                player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
            }
            return stack;
        }

        @Override
        public int getItemEnchantability() {
            return Materials.Tools.bronze.getEnchantability();
        }

        public void registerIcons(IIconRegister register)
        {
            this.itemIcon = register.registerIcon(Textures.bronzeBowStandy);
            this.texture = new IIcon[pullArray.length];

            for (int i = 0; i < pullArray.length; i++)
            {
                this.texture[i] = register.registerIcon(Reference.textureLoc + ItemNames.bowBronze + pullArray[i]);
            }
        }

        public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
        {
            if(player.getItemInUse() == null) return this.itemIcon;
            int pulling = stack.getMaxItemUseDuration() - useRemaining;
            if(pulling >= 18)
            {
                return texture[2];
            }
            else if(pulling > 13)
            {
                return texture[1];
            }
            else if(pulling > 0)
            {
                return texture[0];
            }
            return this.itemIcon;
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemCoalBow extends ItemBowFT {

        public static final String[] pullArray = new String[]{"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture;

        public ItemCoalBow(int maxUses, String itemName) {
            super(maxUses, itemName);
        }

        public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int par4)
        {
            int j = this.getMaxItemUseDuration(stack) - par4;

            ArrowLooseEvent event = new ArrowLooseEvent(player, stack, j);
            MinecraftForge.EVENT_BUS.post(event);
            if (event.isCanceled())
            {
                return;
            }
            j = event.charge;

            boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

            if (flag || player.inventory.hasItem(Items.arrow))
            {
                float f = (float)j / 20.0F;
                f = (f * f + f * 2.0F) / 3.0F;

                if ((double)f < 0.1D)
                {
                    return;
                }

                if (f > 1.0F)
                {
                    f = 1.0F;
                }

                EntityArrow entityarrow = new EntityArrow(world, player, f * 2.0F);

                if (f == 1.0F)
                {
                    entityarrow.setIsCritical(true);
                }

                int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

                if (k > 0)
                {
                    entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
                }

                int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

                if (l > 0)
                {
                    entityarrow.setKnockbackStrength(l);
                }

                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
                {
                    entityarrow.setFire(100);
                }

                stack.damageItem(1, player);
                world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                if (flag)
                {
                    entityarrow.canBePickedUp = 2;
                }
                else
                {
                    player.inventory.consumeInventoryItem(Items.arrow);
                }

                if (!world.isRemote)
                {
                    world.spawnEntityInWorld(entityarrow);
                }
            }
        }

        public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
        {
            return stack;
        }

        public int getMaxItemUseDuration(ItemStack stack)
        {
            return 72000;
        }

        public EnumAction getItemUseAction(ItemStack stack)
        {
            return EnumAction.bow;
        }

        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
        {
            ArrowNockEvent event = new ArrowNockEvent(player, stack);
            MinecraftForge.EVENT_BUS.post(event);
            if(!event.isCancelable())
            {
                return event.result;
            }

            if(player.capabilities.isCreativeMode || player.inventory.hasItem(Items.arrow))
            {
                player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
            }
            return stack;
        }

        @Override
        public int getItemEnchantability() {
            return Materials.Tools.coal.getEnchantability();
        }

        public void registerIcons(IIconRegister register)
        {
            this.itemIcon = register.registerIcon(Textures.coalBowStandy);
            this.texture = new IIcon[pullArray.length];

            for (int i = 0; i < pullArray.length; i++)
            {
                this.texture[i] = register.registerIcon(Reference.textureLoc + ItemNames.bowCoal + pullArray[i]);
            }
        }

        public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
        {
            if(player.getItemInUse() == null) return this.itemIcon;
            int pulling = stack.getMaxItemUseDuration() - useRemaining;
            if(pulling >= 18)
            {
                return texture[2];
            }
            else if(pulling > 13)
            {
                return texture[1];
            }
            else if(pulling > 0)
            {
                return texture[0];
            }
            return this.itemIcon;
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemGlowstoneBow extends ItemBowFT {

        public static final String[] pullArray = new String[]{"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture;

        public ItemGlowstoneBow(int maxUses, String itemName) {
            super(maxUses, itemName);
        }


        public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int par4)
        {
            int j = this.getMaxItemUseDuration(stack) - par4;

            ArrowLooseEvent event = new ArrowLooseEvent(player, stack, j);
            MinecraftForge.EVENT_BUS.post(event);
            if (event.isCanceled())
            {
                return;
            }
            j = event.charge;

            boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

            if (flag || player.inventory.hasItem(Items.arrow))
            {
                float f = (float)j / 20.0F;
                f = (f * f + f * 2.0F) / 3.0F;

                if ((double)f < 0.1D)
                {
                    return;
                }

                if (f > 1.0F)
                {
                    f = 1.0F;
                }

                EntityArrow entityarrow = new EntityArrow(world, player, f * 2.0F);

                if (f == 1.0F)
                {
                    entityarrow.setIsCritical(true);
                }

                int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

                if (k > 0)
                {
                    entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
                }

                int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

                if (l > 0)
                {
                    entityarrow.setKnockbackStrength(l);
                }

                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
                {
                    entityarrow.setFire(100);
                }

                stack.damageItem(1, player);
                world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                if (flag)
                {
                    entityarrow.canBePickedUp = 2;
                }
                else
                {
                    player.inventory.consumeInventoryItem(Items.arrow);
                }

                if (!world.isRemote)
                {
                    world.spawnEntityInWorld(entityarrow);
                }
            }
        }

        public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
        {
            return stack;
        }

        public int getMaxItemUseDuration(ItemStack stack)
        {
            return 72000;
        }

        public EnumAction getItemUseAction(ItemStack stack)
        {
            return EnumAction.bow;
        }

        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
        {
            ArrowNockEvent event = new ArrowNockEvent(player, stack);
            MinecraftForge.EVENT_BUS.post(event);
            if(!event.isCancelable())
            {
                return event.result;
            }

            if(player.capabilities.isCreativeMode || player.inventory.hasItem(Items.arrow))
            {
                player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
            }
            return stack;
        }

        @Override
        public int getItemEnchantability() {
            return Materials.Tools.glowstone.getEnchantability();
        }

        public void registerIcons(IIconRegister register)
        {
            this.itemIcon = register.registerIcon(Textures.glowstoneBowStandy);
            this.texture = new IIcon[pullArray.length];

            for (int i = 0; i < pullArray.length; i++)
            {
                this.texture[i] = register.registerIcon(Reference.textureLoc + ItemNames.bowGlowstone + pullArray[i]);
            }
        }

        public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
        {
            if(player.getItemInUse() == null) return this.itemIcon;
            int pulling = stack.getMaxItemUseDuration() - useRemaining;
            if(pulling >= 18)
            {
                return texture[2];
            }
            else if(pulling > 13)
            {
                return texture[1];
            }
            else if(pulling > 0)
            {
                return texture[0];
            }
            return this.itemIcon;
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }
    public static final class ItemAdamantiumBow extends ItemBowFT {

        public static final String[] pullArray = new String[]{"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture;

        public ItemAdamantiumBow(int maxUses, String itemName) {
            super(maxUses, itemName);
        }


        public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int par4)
        {
            int j = this.getMaxItemUseDuration(stack) - par4;

            ArrowLooseEvent event = new ArrowLooseEvent(player, stack, j);
            MinecraftForge.EVENT_BUS.post(event);
            if (event.isCanceled())
            {
                return;
            }
            j = event.charge;

            boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

            if (flag)
            {
                float f = (float)j / 20.0F;
                f = (f * f + f * 2.0F) / 3.0F;

                if ((double)f < 0.1D)
                {
                    return;
                }

                if (f > 1.0F)
                {
                    f = 1.0F;
                }

                EntityArrow entityarrow = new EntityArrow(world, player, f * 2.0F);

                if (f == 1.0F)
                {
                    entityarrow.setIsCritical(true);
                }

                int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

                if (k > 0)
                {
                    entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
                }

                int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

                if (l > 0)
                {
                    entityarrow.setKnockbackStrength(l);
                }

                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
                {
                    entityarrow.setFire(100);
                }

                stack.damageItem(1, player);
                world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                if (flag)
                {
                    entityarrow.canBePickedUp = 2;
                }
                else
                {
                    player.inventory.consumeInventoryItem(Items.arrow);
                }

                if (!world.isRemote)
                {
                    world.spawnEntityInWorld(entityarrow);
                }
            }
        }

        public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
        {
            return stack;
        }

        public int getMaxItemUseDuration(ItemStack stack)
        {
            return 72000;
        }

        public EnumAction getItemUseAction(ItemStack stack)
        {
            return EnumAction.bow;
        }

        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
        {
            ArrowNockEvent event = new ArrowNockEvent(player, stack);
            MinecraftForge.EVENT_BUS.post(event);
            if(!event.isCancelable())
            {
                return event.result;
            }

            if(player.capabilities.isCreativeMode || player.inventory.hasItem(Items.arrow))
            {
                player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
            }
            return stack;
        }

        public void registerIcons(IIconRegister register)
        {
            this.itemIcon = register.registerIcon(Textures.adamantiumBowStandy);
            this.texture = new IIcon[pullArray.length];

            for (int i = 0; i < pullArray.length; i++)
            {
                this.texture[i] = register.registerIcon(Reference.textureLoc + ItemNames.bowAdamantium + pullArray[i]);
            }
        }

        public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
        {
            if(player.getItemInUse() == null) return this.itemIcon;
            int pulling = stack.getMaxItemUseDuration() - useRemaining;
            if(pulling >= 18)
            {
                return texture[2];
            }
            else if(pulling > 13)
            {
                return texture[1];
            }
            else if(pulling > 0)
            {
                return texture[0];
            }
            return this.itemIcon;
        }

        @SuppressWarnings("unchecked")
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean useExtraInfo)
        {
                list.add(NameHelper.translateToLocal(Locale.adamantiumToolTip));
                list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + " Infinity");
        }

        @Override
        public int getItemEnchantability() {
            return Materials.Tools.adamantium.getEnchantability();
        }
    }

    public static final class ItemObsidianIngot extends ItemFT
    {

        public ItemObsidianIngot(String itemName) {
            super(itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo)
        {
            list.add(NameHelper.translateToLocal(OreDict.oreDictName));
            list.add(NameHelper.translateToLocal(OreDict.ingotObsidian));
        }
    }

    public static final class ItemEmeraldGem extends ItemFT
    {

        public ItemEmeraldGem(String itemName) {
            super(itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for (String anOreDict : OreDict.gemEmeraldArray) {
                list.add(NameHelper.translateToLocal(anOreDict));
            }
        }
    }

    public static final class ItemLapisGem extends ItemFT
    {

        public ItemLapisGem(String itemName) {
            super(itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            String[] oreDict = {OreDict.oreDictName, OreDict.gemLapis};
            for (int i = 0; i < oreDict.length; i++)
            {
                list.add(NameHelper.translateToLocal(oreDict[i]));
            }
//            list.add("");
//            list.add("Stack Size: " + String.format("%s", stack.stackSize));
        }
    }

    public static final class ItemBronzeIngot extends ItemFT
    {

        public ItemBronzeIngot(String itemName) {
            super(itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            String[] oreDict = {OreDict.oreDictName, OreDict.ingotBronze};
            for (String anOreDict : oreDict) {
                list.add(NameHelper.translateToLocal(anOreDict));
            }
        }
    }

    public static final class ItemCoalIngot extends ItemFT
    {

        public ItemCoalIngot(String itemName) {
            super(itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            String[] oreDict = {OreDict.oreDictName, OreDict.ingotCoal};
            for (String oreDictList : oreDict) {
                list.add(NameHelper.translateToLocal(oreDictList));
            }
        }
    }

    public static final class ItemGlowstoneIngot extends ItemFT
    {

        public ItemGlowstoneIngot(String itemName) {
            super(itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            String[] oreDictNames = {OreDict.oreDictName, OreDict.ingotGlowstone};
            for (String oreDict : oreDictNames)
            {
                list.add(NameHelper.translateToLocal(oreDict));
            }
        }
    }

    public static final class ItemAdamantiumIngot extends ItemFT
    {

        public ItemAdamantiumIngot(String itemName) {
            super(itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            String[] oreDictNames = {OreDict.oreDictName, OreDict.ingotAdamantium};
            for(String string : oreDictNames)
            {
                list.add(NameHelper.translateToLocal(string));
            }
        }
    }

    public static final class ItemSilkGem extends ItemFT
    {

        public ItemSilkGem(String itemName) {
            super(itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String string : new String[]{OreDict.oreDictName, OreDict.gemSilk})
            {
                list.add(NameHelper.translateToLocal(string));
            }
        }
    }

    public static final class ItemRedstoneGem extends ItemFT
    {

        public ItemRedstoneGem(String itemName) {
            super(itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String string : new String[]{OreDict.oreDictName, OreDict.gemRedstone})
            {
                list.add(NameHelper.translateToLocal(string));
            }
        }
    }

    public static final class ItemExpShard extends ItemFT
    {

        public ItemExpShard(String itemName) {
            super(itemName);
            this.setMaxStackSize(64);
        }

        @Override
        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
            player.addExperienceLevel(1);
            stack.stackSize--;
            return stack;
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String string : new String[]{OreDict.oreDictName, OreDict.shardExp, "", Locale.expShardToolTip})
            {
                list.add(NameHelper.translateToLocal(string));
            }
        }
    }

    public static final class ItemExpCollector extends ItemFT
    {

        public ItemExpCollector(String itemName) {
            super(itemName);
            this.setMaxDamage(52);
        }

        @Override
        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
            if (stack.getItemDamage() > 1 && stack.getItemDamage() < 51)
            {
                if (player.experienceLevel > 0)
                {
                    player.addExperienceLevel(-1);
                    stack.setItemDamage(stack.getItemDamage() - 1);
                }
            }

            if (stack.getItemDamage() > 1 && stack.getItemDamage() < 51)
            {
                if (player.isSneaking())
                {
                    player.addExperienceLevel(1);
                    stack.setItemDamage(stack.getItemDamage() + 1);
                }
            }


            return stack;
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.expCollectorToolTip));
        }
    }

    public static final class ItemArmorQuartz extends ItemArmorFT
    {
        public ItemArmorQuartz(String armorName, ArmorMaterial material, ArmorType type) {
            super(armorName, material, type);
        }

        public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
        {
            return repairItem.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemToRepair, repairItem);
        }

        @Override
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            if (armor.getItem() == FTContent.quartzHelmet || armor.getItem() == FTContent.quartzChestplate || armor.getItem() == FTContent.quartzBoots)
            {
                return Textures.quartzArmorLayer1;
            }

            if (armor.getItem() == FTContent.quartzLeggings)
            {
                return Textures.quartzArmorLayer2;
            }
            else
            {
                return null;
            }
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
           list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount));
           for(String string : ArmorTooltipLocale.quartzArmor)
           {
               list.add(NameHelper.translateToLocal(string));
           }
        }
    }

    public static final class ItemArmorObsidian extends ItemArmorFT
    {
        public ItemArmorObsidian(String armorName, ArmorMaterial material, ArmorType type) {
            super(armorName, material, type);
        }

        public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
        {
            return repairItem.isItemEqual(new ItemStack(FTContent.ingotObsidian)) || super.getIsRepairable(itemToRepair, repairItem);
        }

        @Override
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            if (armor.getItem() == FTContent.obsidianHelmet || armor.getItem() == FTContent.obsidianChestplate || armor.getItem() == FTContent.obsidianBoots)
            {
                return Textures.obsidianArmorLayer1;
            }

            if (armor.getItem() == FTContent.obsidianLeggings)
            {
                return Textures.obsidianArmorLayer2;
            }
            else
            {
                return null;
            }
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount));
            for(String string : ArmorTooltipLocale.obsidianArmor)
            {
                list.add(NameHelper.translateToLocal(string));
            }
        }
    }

    public static final class ItemArmorEmerald extends ItemArmorFT
    {
        public ItemArmorEmerald(String armorName, ArmorMaterial material, ArmorType type) {
            super(armorName, material, type);
        }

        public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
        {
            return repairItem.isItemEqual(new ItemStack(FTContent.gemEmerald)) || super.getIsRepairable(itemToRepair, repairItem);
        }

        @Override
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            if (armor.getItem() == FTContent.emeraldHelmet || armor.getItem() == FTContent.emeraldChestplate || armor.getItem() == FTContent.emeraldBoots)
            {
                return Textures.emeraldArmorLayer1;
            }

            if (armor.getItem() == FTContent.emeraldChestplate)
            {
                return Textures.emeraldArmorLayer2;
            }
            else
            {
                return null;
            }
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount));
            for(String string : ArmorTooltipLocale.emeraldArmor)
            {
                list.add(NameHelper.translateToLocal(string));
            }
        }
    }

    public static final class ItemArmorLapis extends ItemArmorFT
    {
        public ItemArmorLapis(String armorName, ArmorMaterial material, ArmorType type) {
            super(armorName, material, type);
        }

        public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
        {
            return repairItem.isItemEqual(new ItemStack(FTContent.gemLapis)) || super.getIsRepairable(itemToRepair, repairItem);
        }

        @Override
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            if (armor.getItem() == FTContent.lapisHelmet || armor.getItem() == FTContent.lapisChestplate || armor.getItem() == FTContent.lapisBoots)
            {
                return Textures.lapisArmorLayer1;
            }

            if (armor.getItem() == FTContent.lapisLeggings)
            {
                return Textures.lapisArmorLayer2;
            }
            else
            {
                return null;
            }
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount));
            for(String string : ArmorTooltipLocale.lapisArmor)
            {
                list.add(NameHelper.translateToLocal(string));
            }
        }
    }

    public static final class ItemArmorBronze extends ItemArmorFT{
        public ItemArmorBronze(String armorName, ArmorMaterial material, ArmorType type) {
            super(armorName, material, type);
        }

        public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
        {
            return repairItem.isItemEqual(new ItemStack(FTContent.ingotBronze)) || super.getIsRepairable(itemToRepair, repairItem);
        }

        @Override
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            if (armor.getItem() == FTContent.bronzeHelmet || armor.getItem() == FTContent.bronzeChestplate || armor.getItem() == FTContent.bronzeBoots)
            {
                return Textures.bronzeArmorLayer1;
            }

            if (armor.getItem() == FTContent.bronzeLeggings)
            {
                return Textures.bronzeArmorLayer2;
            }
            else
            {
                return null;
            }
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount));
            for(String string : ArmorTooltipLocale.bronzeArmor)
            {
                list.add(NameHelper.translateToLocal(string));
            }
        }
    }

    public static final class ItemArmorCoal extends ItemArmorFT
    {
        public ItemArmorCoal(String armorName, ArmorMaterial material, ArmorType type) {
            super(armorName, material, type);
        }

        public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
        {
            return repairItem.isItemEqual(new ItemStack(FTContent.ingotCoal)) || super.getIsRepairable(itemToRepair, repairItem);
        }

        @Override
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            if (armor.getItem() == FTContent.coalHelmet || armor.getItem() == FTContent.coalChestplate || armor.getItem() == FTContent.coalBoots)
            {
                return Textures.coalArmorLayer1;
            }

            if (armor.getItem() == FTContent.coalLeggings)
            {
                return Textures.coalArmorLayer2;
            }
            else
            {
                return null;
            }
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount));
            for(String string : ArmorTooltipLocale.coalArmor)
            {
                list.add(NameHelper.translateToLocal(string));
            }
        }
    }

    public static final class ItemArmorGlowstone extends ItemArmorFT
    {
        public ItemArmorGlowstone(String armorName, ArmorMaterial material, ArmorType type) {
            super(armorName, material, type);
        }

        public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
        {
            return repairItem.isItemEqual(new ItemStack(FTContent.ingotGlowstone)) || super.getIsRepairable(itemToRepair, repairItem);
        }

        @Override
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            if (armor.getItem() == FTContent.glowstoneHelmet || armor.getItem() == FTContent.glowstoneChestplate || armor.getItem() == FTContent.glowstoneBoots)
            {
                return Textures.glowstoneArmorLayer1;
            }

            if (armor.getItem() == FTContent.glowstoneLeggings)
            {
                return Textures.glowstoneArmorLayer2;
            }
            else
            {
                return null;
            }
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount));
            for(String string : ArmorTooltipLocale.glowstoneArmor)
            {
                list.add(NameHelper.translateToLocal(string));
            }
        }
    }

    public static final class ItemArmorAdamantium extends ItemArmorFT
    {

        public ItemArmorAdamantium(String armorName, ArmorMaterial material, ArmorType type) {
            super(armorName, material, type);
        }

        public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
        {
            return repairItem.isItemEqual(new ItemStack(FTContent.ingotAdamantium)) || super.getIsRepairable(itemToRepair, repairItem);
        }

        @Override
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            if (armor.getItem() == FTContent.adamantiumHelmet || armor.getItem() == FTContent.adamantiumChestplate || armor.getItem() == FTContent.adamantiumBoots)
            {
                return Textures.adamantiumArmorLayer1;
            }

            if (armor.getItem() == FTContent.adamantiumLeggings)
            {
                return Textures.adamantiumArmorLayer2;
            }
            else
            {
                return null;
            }
        }

        public void onArmorTick(World world, EntityPlayer player, ItemStack armor)
        {
            ItemStack helmet = player.getCurrentArmor(3);
            ItemStack chest = player.getCurrentArmor(2);
            ItemStack legs = player.getCurrentArmor(1);
            ItemStack boots = player.getCurrentArmor(0);

            if (helmet != null) {
                if (helmet.getItem() == FTContent.adamantiumHelmet) {
                    player.addPotionEffect(PotionList.waterBreathing);
                    player.addPotionEffect(PotionList.saturation);
                }
            }

            if (chest != null)
            {
                if (chest.getItem() == FTContent.adamantiumChestplate)
                {
                    player.addPotionEffect(PotionList.absorption);
                }
            }

            if (legs != null)
            {
                if (legs.getItem() == FTContent.adamantiumLeggings)
                {
                    player.addPotionEffect(PotionList.jump);
                }
            }

            if (boots != null)
            {
                if (boots.getItem() == FTContent.adamantiumBoots)
                {
                    player.addPotionEffect(PotionList.moveSpeed);
                }
            }
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount));
            for(String string : ArmorTooltipLocale.adamantiumArmor)
            {
                list.add(NameHelper.translateToLocal(string));
            }
        }
    }

    public static final class ItemArmorRedstone extends ItemArmorFT
    {
        public ItemArmorRedstone(String armorName, ArmorMaterial material, ArmorType type) {
            super(armorName, material, type);
        }

        public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
        {
            return repairItem.isItemEqual(new ItemStack(FTContent.gemRedstone)) || super.getIsRepairable(itemToRepair, repairItem);
        }

        @Override
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            if (armor.getItem() == FTContent.redstoneHelmet || armor.getItem() == FTContent.redstoneChestplate || armor.getItem() == FTContent.redstoneBoots)
            {
                return Textures.redstoneArmorLayer1;
            }

            if (armor.getItem() == FTContent.redstoneLeggings)
            {
                return Textures.redstoneArmorLayer2;
            }
            else
            {
                return null;
            }
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount));
            for(String string : ArmorTooltipLocale.redstoneArmor)
            {
                list.add(NameHelper.translateToLocal(string));
            }
        }
    }

    public static final class ItemStickObsidian extends ItemStickFT{

        public ItemStickObsidian(String itemName) {
            super(itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.stickWoodArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemStickEmerald extends ItemStickFT{

        public ItemStickEmerald(String itemName) {
            super(itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.stickWoodArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemStickLapis extends ItemStickFT{

        public ItemStickLapis(String itemName) {
            super(itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.stickWoodArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemStickBronze extends ItemStickFT{

        public ItemStickBronze(String itemName) {
            super(itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.stickWoodArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemStickCoal extends ItemStickFT{

        public ItemStickCoal(String itemName) {
            super(itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.stickWoodArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemStickGlowstone extends ItemStickFT{

        public ItemStickGlowstone(String itemName) {
            super(itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.stickWoodArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemStickAdamantium extends ItemStickFT{

        public ItemStickAdamantium(String itemName) {
            super(itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.stickWoodArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemStickSilk extends ItemStickFT{

        public ItemStickSilk(String itemName) {
            super(itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.stickWoodArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }

    public static final class ItemStickRedstone extends ItemStickFT{

        public ItemStickRedstone(String itemName) {
            super(itemName);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            for(String i : OreDict.stickWoodArray)
            {
                list.add(NameHelper.translateToLocal(i));
            }
        }
    }
}
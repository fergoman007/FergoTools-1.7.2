package io.github.fergoman123.fergotools.init;

import cpw.mods.fml.relauncher.SideOnly;
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
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

import java.util.List;

import static cpw.mods.fml.relauncher.Side.CLIENT;

public class FergoItems
{
    public static final class ItemQuartzPickaxe extends ItemPickaxeFT
    {
        public static final ItemQuartzPickaxe instance = new ItemQuartzPickaxe();

        public ItemQuartzPickaxe()
        {
            super(Materials.Tools.quartz, Materials.Tools.quartz.getMaxUses());
            this.setUnlocalizedName(ItemNames.quartzPickaxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean advancedTooltip) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemQuartzShovel extends ItemShovelFT
    {
        public static final ItemQuartzShovel instance = new ItemQuartzShovel();

        public ItemQuartzShovel()
        {
            super(Materials.Tools.quartz, Materials.Tools.quartz.getMaxUses());
            this.setUnlocalizedName(ItemNames.quartzShovel);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemQuartzAxe extends ItemAxeFT
    {
        public static final ItemQuartzAxe instance = new ItemQuartzAxe();

        public ItemQuartzAxe()
        {
            super(Materials.Tools.quartz, Materials.Tools.quartz.getMaxUses());
            this.setUnlocalizedName(ItemNames.quartzAxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemQuartzHoe extends ItemHoeFT
    {
        public static final ItemQuartzHoe instance = new ItemQuartzHoe();

        public ItemQuartzHoe()
        {
            super(Materials.Tools.quartz, Materials.Tools.quartz.getMaxUses());
            this.setUnlocalizedName(ItemNames.quartzHoe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemQuartzSword extends ItemSwordFT
    {
        public static final ItemQuartzSword instance = new ItemQuartzSword();

        public ItemQuartzSword()
        {
            super(Materials.Tools.quartz, Materials.Tools.quartz.getMaxUses());
            this.setUnlocalizedName(ItemNames.quartzSword);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemObsidianPickaxe extends ItemPickaxeFT
    {
        public static final ItemObsidianPickaxe instance = new ItemObsidianPickaxe();

        public ItemObsidianPickaxe()
        {
            super(Materials.Tools.quartz, Materials.Tools.quartz.getMaxUses());
            this.setUnlocalizedName(ItemNames.obsidianPickaxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemObsidianShovel extends ItemShovelFT
    {
        public static final ItemObsidianShovel instance = new ItemObsidianShovel();

        public ItemObsidianShovel()
        {
            super(Materials.Tools.obsidian, Materials.Tools.obsidian.getMaxUses());
            this.setUnlocalizedName(ItemNames.obsidianShovel);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemObsidianAxe extends ItemAxeFT
    {
        public static final ItemObsidianAxe instance = new ItemObsidianAxe();

        public ItemObsidianAxe()
        {
            super(Materials.Tools.obsidian, Materials.Tools.obsidian.getMaxUses());
            this.setUnlocalizedName(ItemNames.obsidianAxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemObsidianHoe extends ItemHoeFT
    {
        public static final ItemObsidianHoe instance = new ItemObsidianHoe();

        public ItemObsidianHoe()
        {
            super(Materials.Tools.obsidian, Materials.Tools.obsidian.getMaxUses());
            this.setUnlocalizedName(ItemNames.obsidianHoe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemObsidianSword extends ItemSwordFT
    {
        public static final ItemObsidianSword instance = new ItemObsidianSword();

        public ItemObsidianSword()
        {
            super(Materials.Tools.obsidian, Materials.Tools.obsidian.getMaxUses());
            this.setUnlocalizedName(ItemNames.obsidianSword);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemEmeraldPickaxe extends ItemPickaxeFT
    {
        public static final ItemEmeraldPickaxe instance = new ItemEmeraldPickaxe();

        public ItemEmeraldPickaxe()
        {
            super(Materials.Tools.emerald, Materials.Tools.emerald.getMaxUses());
            this.setUnlocalizedName(ItemNames.emeraldPickaxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemEmeraldShovel extends ItemShovelFT
    {
        public static final ItemEmeraldShovel instance = new ItemEmeraldShovel();

        public ItemEmeraldShovel()
        {
            super(Materials.Tools.emerald, Materials.Tools.emerald.getMaxUses());
            this.setUnlocalizedName(ItemNames.emeraldShovel);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemEmeraldAxe extends ItemAxeFT
    {
        public static final ItemEmeraldAxe instance = new ItemEmeraldAxe();

        public ItemEmeraldAxe()
        {
            super(Materials.Tools.emerald, Materials.Tools.emerald.getMaxUses());
            this.setUnlocalizedName(ItemNames.emeraldAxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemEmeraldHoe extends ItemHoeFT
    {
        public static final ItemEmeraldHoe instance = new ItemEmeraldHoe();

        public ItemEmeraldHoe()
        {
            super(Materials.Tools.emerald, Materials.Tools.emerald.getMaxUses());
            this.setUnlocalizedName(ItemNames.emeraldHoe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemEmeraldSword extends ItemSwordFT
    {
        public static final ItemEmeraldSword instance = new ItemEmeraldSword();

        public ItemEmeraldSword()
        {
            super(Materials.Tools.emerald, Materials.Tools.emerald.getMaxUses());
            this.setUnlocalizedName(ItemNames.emeraldSword);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemLapisPickaxe extends ItemPickaxeFT
    {
    public static final ItemLapisPickaxe instance = new ItemLapisPickaxe();

    public ItemLapisPickaxe()
    {
        super(Materials.Tools.lapis, Materials.Tools.lapis.getMaxUses());
        this.setUnlocalizedName(ItemNames.lapisPickaxe);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
    }
}

    public static final class ItemLapisShovel extends ItemShovelFT
    {
        public static final ItemLapisShovel instance = new ItemLapisShovel();

        public ItemLapisShovel()
        {
            super(Materials.Tools.lapis, Materials.Tools.lapis.getMaxUses());
            this.setUnlocalizedName(ItemNames.lapisShovel);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemLapisAxe extends ItemAxeFT
    {
        public static final ItemLapisAxe instance = new ItemLapisAxe();

        public ItemLapisAxe()
        {
            super(Materials.Tools.lapis, Materials.Tools.lapis.getMaxUses());
            this.setUnlocalizedName(ItemNames.lapisAxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemLapisHoe extends ItemHoeFT
    {
        public static final ItemLapisHoe instance = new ItemLapisHoe();

        public ItemLapisHoe()
        {
            super(Materials.Tools.lapis, Materials.Tools.lapis.getMaxUses());
            this.setUnlocalizedName(ItemNames.lapisHoe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemLapisSword extends ItemSwordFT
    {
        public static final ItemLapisSword instance = new ItemLapisSword();

        public ItemLapisSword()
        {
            super(Materials.Tools.lapis, Materials.Tools.lapis.getMaxUses());
            this.setUnlocalizedName(ItemNames.lapisSword);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemBronzePickaxe extends ItemPickaxeFT
    {
        public static final ItemBronzePickaxe instance = new ItemBronzePickaxe();

        public ItemBronzePickaxe()
        {
            super(Materials.Tools.bronze, Materials.Tools.bronze.getMaxUses());
            this.setUnlocalizedName(ItemNames.bronzePickaxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemBronzeShovel extends ItemShovelFT
    {
        public static final ItemBronzeShovel instance = new ItemBronzeShovel();

        public ItemBronzeShovel()
        {
            super(Materials.Tools.bronze, Materials.Tools.bronze.getMaxUses());
            this.setUnlocalizedName(ItemNames.bronzeShovel);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemBronzeAxe extends ItemAxeFT
    {
        public static final ItemBronzeAxe instance = new ItemBronzeAxe();

        public ItemBronzeAxe()
        {
            super(Materials.Tools.bronze, Materials.Tools.bronze.getMaxUses());
            this.setUnlocalizedName(ItemNames.bronzeAxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemBronzeHoe extends ItemHoeFT
    {
        public static final ItemBronzeHoe instance = new ItemBronzeHoe();

        public ItemBronzeHoe()
        {
            super(Materials.Tools.bronze, Materials.Tools.bronze.getMaxUses());
            this.setUnlocalizedName(ItemNames.bronzeHoe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemBronzeSword extends ItemSwordFT
    {
        public static final ItemBronzeSword instance = new ItemBronzeSword();

        public ItemBronzeSword()
        {
            super(Materials.Tools.bronze, Materials.Tools.bronze.getMaxUses());
            this.setUnlocalizedName(ItemNames.bronzeSword);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemCoalPickaxe extends ItemPickaxeFT
    {
        public static final ItemCoalPickaxe instance = new ItemCoalPickaxe();

        public ItemCoalPickaxe()
        {
            super(Materials.Tools.coal, Materials.Tools.coal.getMaxUses());
            this.setUnlocalizedName(ItemNames.coalPickaxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemCoalShovel extends ItemShovelFT
    {
        public static final ItemCoalShovel instance = new ItemCoalShovel();

        public ItemCoalShovel()
        {
            super(Materials.Tools.coal, Materials.Tools.coal.getMaxUses());
            this.setUnlocalizedName(ItemNames.coalShovel);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemCoalAxe extends ItemAxeFT
    {
        public static final ItemCoalAxe instance = new ItemCoalAxe();

        public ItemCoalAxe()
        {
            super(Materials.Tools.coal, Materials.Tools.coal.getMaxUses());
            this.setUnlocalizedName(ItemNames.coalAxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemCoalHoe extends ItemHoeFT
    {
        public static final ItemCoalHoe instance = new ItemCoalHoe();

        public ItemCoalHoe()
        {
            super(Materials.Tools.coal, Materials.Tools.coal.getMaxUses());
            this.setUnlocalizedName(ItemNames.coalHoe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemCoalSword extends ItemSwordFT
    {
        public static final ItemCoalSword instance = new ItemCoalSword();

        public ItemCoalSword()
        {
            super(Materials.Tools.coal, Materials.Tools.coal.getMaxUses());
            this.setUnlocalizedName(ItemNames.coalSword);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemGlowstonePickaxe extends ItemPickaxeFT
    {
        public static final ItemGlowstonePickaxe instance = new ItemGlowstonePickaxe();

        public ItemGlowstonePickaxe()
        {
            super(Materials.Tools.glowstone, Materials.Tools.glowstone.getMaxUses());
            this.setUnlocalizedName(ItemNames.glowstonePickaxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemGlowstoneShovel extends ItemShovelFT
    {
        public static final ItemGlowstoneShovel instance = new ItemGlowstoneShovel();

        public ItemGlowstoneShovel()
        {
            super(Materials.Tools.glowstone, Materials.Tools.glowstone.getMaxUses());
            this.setUnlocalizedName(ItemNames.glowstoneShovel);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemGlowstoneAxe extends ItemAxeFT
    {
        public static final ItemGlowstoneAxe instance = new ItemGlowstoneAxe();

        public ItemGlowstoneAxe()
        {
            super(Materials.Tools.glowstone, Materials.Tools.glowstone.getMaxUses());
            this.setUnlocalizedName(ItemNames.glowstoneAxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemGlowstoneHoe extends ItemHoeFT
    {
        public static final ItemGlowstoneHoe instance = new ItemGlowstoneHoe();

        public ItemGlowstoneHoe()
        {
            super(Materials.Tools.glowstone, Materials.Tools.glowstone.getMaxUses());
            this.setUnlocalizedName(ItemNames.glowstoneHoe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemGlowstoneSword extends ItemSwordFT
    {
        public static final ItemGlowstoneSword instance = new ItemGlowstoneSword();

        public ItemGlowstoneSword()
        {
            super(Materials.Tools.glowstone, Materials.Tools.glowstone.getMaxUses());
            this.setUnlocalizedName(ItemNames.glowstoneSword);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemAdamantiumPickaxe extends ItemPickaxeFT
    {
        public static final ItemAdamantiumPickaxe instance = new ItemAdamantiumPickaxe();

        public ItemAdamantiumPickaxe()
        {
            super(Materials.Tools.adamantium, Materials.Tools.adamantium.getMaxUses());
            this.setUnlocalizedName(ItemNames.adamantiumPickaxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemAdamantiumShovel extends ItemShovelFT
    {
        public static final ItemAdamantiumShovel instance = new ItemAdamantiumShovel();

        public ItemAdamantiumShovel()
        {
            super(Materials.Tools.adamantium, Materials.Tools.adamantium.getMaxUses());
            this.setUnlocalizedName(ItemNames.adamantiumShovel);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemAdamantiumAxe extends ItemAxeFT
    {
        public static final ItemAdamantiumAxe instance = new ItemAdamantiumAxe();

        public ItemAdamantiumAxe()
        {
            super(Materials.Tools.adamantium, Materials.Tools.adamantium.getMaxUses());
            this.setUnlocalizedName(ItemNames.adamantiumAxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemAdamantiumHoe extends ItemHoeFT
    {
        public static final ItemAdamantiumHoe instance = new ItemAdamantiumHoe();

        public ItemAdamantiumHoe()
        {
            super(Materials.Tools.adamantium, Materials.Tools.adamantium.getMaxUses());
            this.setUnlocalizedName(ItemNames.adamantiumHoe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemAdamantiumSword extends ItemSwordFT
    {
        public static final ItemAdamantiumSword instance = new ItemAdamantiumSword();

        public ItemAdamantiumSword()
        {
            super(Materials.Tools.adamantium, Materials.Tools.adamantium.getMaxUses());
            this.setUnlocalizedName(ItemNames.adamantiumSword);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemSilkPickaxe extends ItemPickaxeFT
    {
        public static final ItemSilkPickaxe instance = new ItemSilkPickaxe();

        public ItemSilkPickaxe(){
            super(Materials.Tools.silk, Materials.Tools.silk.getMaxUses());
            this.setUnlocalizedName(ItemNames.silkPickaxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemSilkShovel extends ItemShovelFT
    {
        public static final ItemSilkShovel instance = new ItemSilkShovel();

        public ItemSilkShovel(){
            super(Materials.Tools.silk, Materials.Tools.silk.getMaxUses());
            this.setUnlocalizedName(ItemNames.silkShovel);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemSilkAxe extends ItemAxeFT
    {
        public static final ItemSilkAxe instance = new ItemSilkAxe();

        public ItemSilkAxe(){
            super(Materials.Tools.silk, Materials.Tools.silk.getMaxUses());
            this.setUnlocalizedName(ItemNames.silkAxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemSilkHoe extends ItemHoeFT
    {
        public static final ItemSilkHoe instance = new ItemSilkHoe();

        public ItemSilkHoe(){
            super(Materials.Tools.silk, Materials.Tools.silk.getMaxUses());
            this.setUnlocalizedName(ItemNames.silkHoe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemSilkSword extends ItemSwordFT
    {
        public static final ItemSilkSword instance = new ItemSilkSword();

        public ItemSilkSword()
        {
            super(Materials.Tools.silk, Materials.Tools.silk.getMaxUses());
            this.setUnlocalizedName(ItemNames.silkSword);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemRedstonePickaxe extends ItemPickaxeFT
    {
        public static final ItemRedstonePickaxe instance = new ItemRedstonePickaxe();

        public ItemRedstonePickaxe(){
            super(Materials.Tools.redstone, Materials.Tools.redstone.getMaxUses());
            this.setUnlocalizedName(ItemNames.redstonePickaxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemRedstoneShovel extends ItemShovelFT
    {
        public static final ItemRedstoneShovel instance = new ItemRedstoneShovel();

        public ItemRedstoneShovel(){
            super(Materials.Tools.redstone, Materials.Tools.redstone.getMaxUses());
            this.setUnlocalizedName(ItemNames.redstoneShovel);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemRedstoneAxe extends ItemAxeFT
    {
        public static final ItemRedstoneAxe instance = new ItemRedstoneAxe();

        public ItemRedstoneAxe(){
            super(Materials.Tools.redstone, Materials.Tools.redstone.getMaxUses());
            this.setUnlocalizedName(ItemNames.redstoneAxe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemRedstoneHoe extends ItemHoeFT
    {
        public static final ItemRedstoneHoe instance = new ItemRedstoneHoe();

        public ItemRedstoneHoe(){
            super(Materials.Tools.redstone, Materials.Tools.redstone.getMaxUses());
            this.setUnlocalizedName(ItemNames.redstoneHoe);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemRedstoneSword extends ItemSwordFT
    {
        public static final ItemRedstoneSword instance = new ItemRedstoneSword();

        public ItemRedstoneSword()
        {
            super(Materials.Tools.redstone, Materials.Tools.redstone.getMaxUses());
            this.setUnlocalizedName(ItemNames.redstoneSword);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemQuartzShears extends ItemShearsFT
    {
        public static final ItemQuartzShears instance = new ItemQuartzShears();
        public ItemQuartzShears()
        {
            super(Materials.Tools.quartz.getMaxUses());
            this.setUnlocalizedName(ItemNames.quartzShears);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemObsidianShears extends ItemShearsFT
    {
        public static final ItemObsidianShears instance = new ItemObsidianShears();

        public ItemObsidianShears()
        {
            super(Materials.Tools.obsidian.getMaxUses());
            this.setUnlocalizedName(ItemNames.obsidianShears);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemEmeraldShears extends ItemShearsFT
    {
        public static final ItemEmeraldShears instance = new ItemEmeraldShears();

        public ItemEmeraldShears()
        {
            super(Materials.Tools.emerald.getMaxUses());
            this.setUnlocalizedName(ItemNames.emeraldShears);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemLapisShears extends ItemShearsFT
    {
        public static final ItemLapisShears instance = new ItemLapisShears();

        public ItemLapisShears()
        {
            super(Materials.Tools.lapis.getMaxUses());
            this.setUnlocalizedName(ItemNames.lapisShears);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemBronzeShears extends ItemShearsFT
    {
        public static final ItemBronzeShears instance = new ItemBronzeShears();

        public ItemBronzeShears()
        {
            super(Materials.Tools.bronze.getMaxUses());
            this.setUnlocalizedName(ItemNames.bronzeShears);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemCoalShears extends ItemShearsFT
    {
        public static final ItemCoalShears instance = new ItemCoalShears();

        public ItemCoalShears()
        {
            super(Materials.Tools.coal.getMaxUses());
            this.setUnlocalizedName(ItemNames.coalShears);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemGlowstoneShears extends ItemShearsFT
    {
        public static final ItemGlowstoneShears instance = new ItemGlowstoneShears();

        public ItemGlowstoneShears()
        {
            super(Materials.Tools.glowstone.getMaxUses());
            this.setUnlocalizedName(ItemNames.glowstoneShears);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemAdamantiumShears extends ItemShearsFT
    {
        public static final ItemAdamantiumShears instance = new ItemAdamantiumShears();

        public ItemAdamantiumShears()
        {
            super(Materials.Tools.adamantium.getMaxUses());
            this.setUnlocalizedName(ItemNames.adamantiumShears);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemSilkShears extends ItemShearsFT
    {
        public static final ItemSilkShears instance = new ItemSilkShears();

        public ItemSilkShears()
        {
            super(Materials.Tools.silk.getMaxUses());
            this.setUnlocalizedName(ItemNames.silkShears);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemRedstoneShears extends ItemShearsFT
    {
        public static final ItemRedstoneShears instance = new ItemRedstoneShears();

        public ItemRedstoneShears()
        {
            super(Materials.Tools.redstone.getMaxUses());
            this.setUnlocalizedName(ItemNames.redstoneShears);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }

    public static final class ItemQuartzBow extends ItemBowFT {

        public static final ItemQuartzBow instance = new ItemQuartzBow();

        public static final String[] pullArray = new String[]{"_1", "_2", "_3"};
        public ItemQuartzBow()
        {
            super(Materials.Tools.quartz.getMaxUses());
            this.setUnlocalizedName(ItemNames.bowQuartz);
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

        public static final ItemObsidianBow instance = new ItemObsidianBow();

        public static final String[] pullArray = new String [] {"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture;


        public ItemObsidianBow()
        {
            super(Materials.Tools.obsidian.getMaxUses());
            this.setUnlocalizedName(ItemNames.bowObsidian);
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

        public static final ItemEmeraldBow instance = new ItemEmeraldBow();

        public static final String[] pullArray = new String[] {"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture;

        public ItemEmeraldBow()
        {
            super(Materials.Tools.emerald.getMaxUses());
            this.setUnlocalizedName(ItemNames.bowEmerald);
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

        public static final ItemLapisBow instance = new ItemLapisBow();

        public static final String[] pullArray = new String[]{"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture;
        public ItemLapisBow()
        {
            super(Materials.Tools.lapis.getMaxUses());
            this.setUnlocalizedName(ItemNames.bowLapis);
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

        public static final ItemBronzeBow instance = new ItemBronzeBow();

        public static final String[] pullArray = new String[]{"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture;
        public ItemBronzeBow()
        {
            super(Materials.Tools.bronze.getMaxUses());
            this.setUnlocalizedName(ItemNames.bowBronze);
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

        public static final ItemCoalBow instance = new ItemCoalBow();

        public static final String[] pullArray = new String[]{"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture;
        public ItemCoalBow()
        {
            super(Materials.Tools.coal.getMaxUses());
            this.setUnlocalizedName(ItemNames.bowCoal);
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

        public static final ItemGlowstoneBow instance = new ItemGlowstoneBow();

        public static final String[] pullArray = new String[]{"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture;
        public ItemGlowstoneBow()
        {
            super(Materials.Tools.glowstone.getMaxUses());
            this.setUnlocalizedName(ItemNames.bowGlowstone);
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

        public static final ItemAdamantiumBow instance = new ItemAdamantiumBow();

        public static final String[] pullArray = new String[]{"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture;
        public ItemAdamantiumBow()
        {
            super(Materials.Tools.adamantium.getMaxUses());
            this.setUnlocalizedName(ItemNames.bowAdamantium);
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
        public static final ItemObsidianIngot instance = new ItemObsidianIngot();

        public ItemObsidianIngot(){
            super();
            this.setUnlocalizedName(ItemNames.ingotObsidian);
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
        public static final ItemEmeraldGem instance = new ItemEmeraldGem();

        public ItemEmeraldGem()
        {
            super();
            this.setUnlocalizedName(ItemNames.gemEmerald);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            String[] oreDict = {OreDict.oreDictName, OreDict.gemEmerald};
            for (int i = 0; i < oreDict.length; i++)
            {
                list.add(NameHelper.translateToLocal(oreDict[i]));
            }
        }
    }

    public static final class ItemLapisGem extends ItemFT
    {
        public static final ItemLapisGem instance = new ItemLapisGem();

        public ItemLapisGem()
        {
            super();
            this.setUnlocalizedName(ItemNames.gemLapis);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            String[] oreDict = {OreDict.oreDictName, OreDict.gemLapis};
            for (int i = 0; i < oreDict.length; i++)
            {
                list.add(NameHelper.translateToLocal(oreDict[i]));
            }
        }
    }

    public static final class ItemBronzeIngot extends ItemFT
    {
        public static final ItemBronzeIngot instance = new ItemBronzeIngot();

        public ItemBronzeIngot()
        {
            super();
            this.setUnlocalizedName(ItemNames.ingotBronze);
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
        public static final ItemCoalIngot instance = new ItemCoalIngot();

        public ItemCoalIngot()
        {
            super();
            this.setUnlocalizedName(ItemNames.ingotCoal);
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
        public static final ItemGlowstoneIngot instance = new ItemGlowstoneIngot();

        public ItemGlowstoneIngot()
        {
            super();
            this.setUnlocalizedName(ItemNames.ingotGlowstone);
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
        public static final ItemAdamantiumIngot instance = new ItemAdamantiumIngot();

        public ItemAdamantiumIngot()
        {
            super();
            this.setUnlocalizedName(ItemNames.ingotAdamantium);
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
        public static final ItemSilkGem instance = new ItemSilkGem();

        public ItemSilkGem()
        {
            super();
            this.setUnlocalizedName(ItemNames.gemSilk);
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
        public static final ItemRedstoneGem instance = new ItemRedstoneGem();

        public ItemRedstoneGem()
        {
            super();
            this.setUnlocalizedName(ItemNames.gemRedstone);
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
        public static final ItemExpShard instance = new ItemExpShard();

        public ItemExpShard()
        {
            super();
            this.setUnlocalizedName(ItemNames.shardExp);
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
        public static final ItemExpCollector instance = new ItemExpCollector();

        public ItemExpCollector()
        {
            super();
            this.setUnlocalizedName(ItemNames.expCollector);
        }

        @Override
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
            list.add(NameHelper.translateToLocal(Locale.expCollectorToolTip));
        }
    }

    public static final class ItemArmorQuartz extends ItemArmorFT
    {
        public static final ItemArmorQuartz instanceHelmet = new ItemArmorQuartz(ArmorType.HELMET);
        public static final ItemArmorQuartz instanceChest = new ItemArmorQuartz(ArmorType.CHEST);
        public static final ItemArmorQuartz instanceLegs = new ItemArmorQuartz(ArmorType.LEGS);
        public static final ItemArmorQuartz instanceBoots = new ItemArmorQuartz(ArmorType.BOOTS);

        public ItemArmorQuartz(ArmorType type)
        {
            super(ArmorNames.quartz, Materials.Armor.quartzArmor, type);
        }

        public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
        {
            return repairItem.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemToRepair, repairItem);
        }

        @Override
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            if (armor.getItem() == instanceHelmet || armor.getItem() == instanceChest || armor.getItem() == instanceBoots)
            {
                return Textures.quartzArmorLayer1;
            }

            if (armor.getItem() == instanceLegs)
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
        public static final ItemArmorObsidian instanceHelmet = new ItemArmorObsidian(ArmorType.HELMET);
        public static final ItemArmorObsidian instanceChest = new ItemArmorObsidian(ArmorType.CHEST);
        public static final ItemArmorObsidian instanceLegs = new ItemArmorObsidian(ArmorType.LEGS);
        public static final ItemArmorObsidian instanceBoots = new ItemArmorObsidian(ArmorType.BOOTS);

        public ItemArmorObsidian(ArmorType type)
        {
            super(ArmorNames.obsidian, Materials.Armor.obsidianArmor, type);
        }

        public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
        {
            return repairItem.isItemEqual(new ItemStack(ItemObsidianIngot.instance)) || super.getIsRepairable(itemToRepair, repairItem);
        }

        @Override
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            if (armor.getItem() == instanceHelmet || armor.getItem() == instanceChest || armor.getItem() == instanceBoots)
            {
                return Textures.obsidianArmorLayer1;
            }

            if (armor.getItem() == instanceLegs)
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
        public static final ItemArmorEmerald instanceHelmet = new ItemArmorEmerald(ArmorType.HELMET);
        public static final ItemArmorEmerald instanceChest = new ItemArmorEmerald(ArmorType.CHEST);
        public static final ItemArmorEmerald instanceLegs = new ItemArmorEmerald(ArmorType.LEGS);
        public static final ItemArmorEmerald instanceBoots = new ItemArmorEmerald(ArmorType.BOOTS);

        public ItemArmorEmerald(ArmorType type)
        {
            super(ArmorNames.emerald, Materials.Armor.emeraldArmor, type);
        }

        public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
        {
            return repairItem.isItemEqual(new ItemStack(ItemEmeraldGem.instance)) || super.getIsRepairable(itemToRepair, repairItem);
        }

        @Override
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            if (armor.getItem() == instanceHelmet || armor.getItem() == instanceChest || armor.getItem() == instanceBoots)
            {
                return Textures.emeraldArmorLayer1;
            }

            if (armor.getItem() == instanceLegs)
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
        public static final ItemArmorLapis instanceHelmet = new ItemArmorLapis(ArmorType.HELMET);
        public static final ItemArmorLapis instanceChest = new ItemArmorLapis(ArmorType.CHEST);
        public static final ItemArmorLapis instanceLegs = new ItemArmorLapis(ArmorType.LEGS);
        public static final ItemArmorLapis instanceBoots = new ItemArmorLapis(ArmorType.BOOTS);

        public ItemArmorLapis(ArmorType type)
        {
            super(ArmorNames.lapis, Materials.Armor.lapisArmor, type);
        }

        public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
        {
            return repairItem.isItemEqual(new ItemStack(ItemLapisGem.instance)) || super.getIsRepairable(itemToRepair, repairItem);
        }

        @Override
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            if (armor.getItem() == instanceHelmet || armor.getItem() == instanceChest || armor.getItem() == instanceBoots)
            {
                return Textures.lapisArmorLayer1;
            }

            if (armor.getItem() == instanceLegs)
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

    public static final class ItemArmorBronze extends ItemArmorFT
    {
        public static final ItemArmorBronze instanceHelmet = new ItemArmorBronze(ArmorType.HELMET);
        public static final ItemArmorBronze instanceChest = new ItemArmorBronze(ArmorType.CHEST);
        public static final ItemArmorBronze instanceLegs = new ItemArmorBronze(ArmorType.LEGS);
        public static final ItemArmorBronze instanceBoots = new ItemArmorBronze(ArmorType.BOOTS);

        public ItemArmorBronze(ArmorType type)
        {
            super(ArmorNames.bronze, Materials.Armor.bronzeArmor, type);
        }

        public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
        {
            return repairItem.isItemEqual(new ItemStack(ItemBronzeIngot.instance)) || super.getIsRepairable(itemToRepair, repairItem);
        }

        @Override
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            if (armor.getItem() == instanceHelmet || armor.getItem() == instanceChest || armor.getItem() == instanceBoots)
            {
                return Textures.bronzeArmorLayer1;
            }

            if (armor.getItem() == instanceLegs)
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
        public static final ItemArmorCoal instanceHelmet = new ItemArmorCoal(ArmorType.HELMET);
        public static final ItemArmorCoal instanceChest = new ItemArmorCoal(ArmorType.CHEST);
        public static final ItemArmorCoal instanceLegs = new ItemArmorCoal(ArmorType.LEGS);
        public static final ItemArmorCoal instanceBoots = new ItemArmorCoal(ArmorType.BOOTS);

        public ItemArmorCoal(ArmorType type)
        {
            super(ArmorNames.coal, Materials.Armor.coalArmor, type);
        }

        public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
        {
            return repairItem.isItemEqual(new ItemStack(Items.coal)) || super.getIsRepairable(itemToRepair, repairItem);
        }

        @Override
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            if (armor.getItem() == instanceHelmet || armor.getItem() == instanceChest || armor.getItem() == instanceBoots)
            {
                return Textures.coalArmorLayer1;
            }

            if (armor.getItem() == instanceLegs)
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
        public static final ItemArmorGlowstone instanceHelmet = new ItemArmorGlowstone(ArmorType.HELMET);
        public static final ItemArmorGlowstone instanceChest = new ItemArmorGlowstone(ArmorType.CHEST);
        public static final ItemArmorGlowstone instanceLegs = new ItemArmorGlowstone(ArmorType.LEGS);
        public static final ItemArmorGlowstone instanceBoots = new ItemArmorGlowstone(ArmorType.BOOTS);

        public ItemArmorGlowstone(ArmorType type)
        {
            super(ArmorNames.glowstone, Materials.Armor.glowstoneArmor, type);
        }

        public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
        {
            return repairItem.isItemEqual(new ItemStack(ItemGlowstoneIngot.instance)) || super.getIsRepairable(itemToRepair, repairItem);
        }

        @Override
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            if (armor.getItem() == instanceHelmet || armor.getItem() == instanceChest || armor.getItem() == instanceBoots)
            {
                return Textures.glowstoneArmorLayer1;
            }

            if (armor.getItem() == instanceLegs)
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
        public static final ItemArmorAdamantium instanceHelmet = new ItemArmorAdamantium(ArmorType.HELMET);
        public static final ItemArmorAdamantium instanceChest = new ItemArmorAdamantium(ArmorType.CHEST);
        public static final ItemArmorAdamantium instanceLegs = new ItemArmorAdamantium(ArmorType.LEGS);
        public static final ItemArmorAdamantium instanceBoots = new ItemArmorAdamantium(ArmorType.BOOTS);

        public ItemArmorAdamantium(ArmorType type)
        {
            super(ArmorNames.adamantium, Materials.Armor.adamantiumArmor, type);
        }

        public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
        {
            return repairItem.isItemEqual(new ItemStack(ItemAdamantiumIngot.instance)) || super.getIsRepairable(itemToRepair, repairItem);
        }

        @Override
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            if (armor.getItem() == instanceHelmet || armor.getItem() == instanceChest || armor.getItem() == instanceBoots)
            {
                return Textures.adamantiumArmorLayer1;
            }

            if (armor.getItem() == instanceLegs)
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
                if (helmet.getItem() == instanceHelmet) {
                    player.addPotionEffect(PotionList.waterBreathing);
                    player.addPotionEffect(PotionList.saturation);
                }
            }

            if (chest != null)
            {
                if (chest.getItem() == instanceChest)
                {
                    player.addPotionEffect(PotionList.absorption);
                }
            }

            if (legs != null)
            {
                if (legs.getItem() == instanceLegs)
                {
                    player.addPotionEffect(PotionList.jump);
                }
            }

            if (boots != null)
            {
                if (boots.getItem() == instanceBoots)
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
        public static final ItemArmorRedstone instanceHelmet = new ItemArmorRedstone(ArmorType.HELMET);
        public static final ItemArmorRedstone instanceChest = new ItemArmorRedstone(ArmorType.CHEST);
        public static final ItemArmorRedstone instanceLegs = new ItemArmorRedstone(ArmorType.LEGS);
        public static final ItemArmorRedstone instanceBoots = new ItemArmorRedstone(ArmorType.BOOTS);

        public ItemArmorRedstone(ArmorType type)
        {
            super(ArmorNames.redstone, Materials.Armor.redstoneArmor, type);
        }

        public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
        {
            return repairItem.isItemEqual(new ItemStack(ItemRedstoneGem.instance)) || super.getIsRepairable(itemToRepair, repairItem);
        }

        @Override
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            if (armor.getItem() == instanceHelmet || armor.getItem() == instanceChest || armor.getItem() == instanceBoots)
            {
                return Textures.redstoneArmorLayer1;
            }

            if (armor.getItem() == instanceLegs)
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

        public static final ItemStickObsidian instance = new ItemStickObsidian();
        public ItemStickObsidian()
        {
            super();
            this.setUnlocalizedName(ItemNames.stickObsidian);
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

        public static final ItemStickEmerald instance = new ItemStickEmerald();
        public ItemStickEmerald()
        {
            super();
            this.setUnlocalizedName(ItemNames.stickEmerald);
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
        public static final ItemStickLapis instance = new ItemStickLapis();
        public ItemStickLapis()
        {
            super();
            this.setUnlocalizedName(ItemNames.stickLapis);
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
        public static final ItemStickBronze instance = new ItemStickBronze();
        public ItemStickBronze()
        {
            super();
            this.setUnlocalizedName(ItemNames.stickBronze);
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

        public static final ItemStickCoal instance = new ItemStickCoal();
        public ItemStickCoal()
        {
            super();
            this.setUnlocalizedName(ItemNames.stickCoal);
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
        public static final ItemStickGlowstone instance = new ItemStickGlowstone();
        public ItemStickGlowstone()
        {
            super();
            this.setUnlocalizedName(ItemNames.stickGlowstone);
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
        public static final ItemStickAdamantium instance = new ItemStickAdamantium();
        public ItemStickAdamantium()
        {
            super();
            this.setUnlocalizedName(ItemNames.stickAdamantium);
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
        public static final ItemStickSilk instance = new ItemStickSilk();
        public ItemStickSilk()
        {
            super();
            this.setUnlocalizedName(ItemNames.stickSilk);
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
        public static final ItemStickRedstone instance = new ItemStickRedstone();
        public ItemStickRedstone()
        {
            super();
            this.setUnlocalizedName(ItemNames.stickRedstone);
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
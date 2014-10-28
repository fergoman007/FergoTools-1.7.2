package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.util.base.BlockLogFT;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;
import java.util.Random;

public final class FTLogs extends BlockLogFT
{
    public static final FTLogs instance = new FTLogs();

        public static final String[] subTypes = new String[]{"Obsidian", "Emerald", "Lapis", "Bronze", "Coal", "Glowstone", "Adamantium", "Silk", "Redstone"};

        public FTLogs()
        {
            super();
            this.setBlockName(BlockNames.logFergo);
            this.setCreativeTab(Tabs.tabFergoWood);
        }

        public void getSubBlocks(Item item, CreativeTabs tab, List list)
        {
            for (int i = 0; i < BlockNames.logs.length; i++) {
                list.add(new ItemStack(item, 1, i));
            }
        }

        public void registerBlockIcons(IIconRegister register)
        {
            this.topIcon = new IIcon[subTypes.length];
            this.sideIcon = new IIcon[subTypes.length];

            for (int i = 0; i < sideIcon.length; ++i)
            {
                this.sideIcon[i] = register.registerIcon(Reference.textureLoc + Textures.woodLoc + "log" + subTypes[i]);
                this.topIcon[i] = register.registerIcon(Reference.textureLoc + Textures.woodLoc + "log" + subTypes[i] + "Top");
            }
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }

        public int damageDropped(int damage)
        {
            return damage;
        }
    }
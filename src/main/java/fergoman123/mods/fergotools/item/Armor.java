package fergoman123.mods.fergotools.item;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.lib.strings.ArmorStrings;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 03/04/2014.
 */
public class Armor {

    public static class ItemArmorQuartz extends ItemArmor {

        public ItemArmorQuartz(int type)
        {
            super(ToolArmorMaterials.quartzArmor, FergoTools.proxy.addArmor("quartz"), type);
        }

        public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
        {
            if(stack.getItem() == ModItems.quartzHelmet || stack.getItem() == ModItems.quartzChestplate || stack.getItem() == ModItems.quartzBoots)
            {
                return ArmorStrings.quartzArmorRender[0];
            }


            if(stack.getItem() == ModItems.quartzLeggings)
            {
                return ArmorStrings.quartzArmorRender[1];
            }
            else
            {
                return null;
            }
        }

    }

    public static class ItemArmorObsidian extends ItemArmor{

        public ItemArmorObsidian(int type)
        {
            super(ToolArmorMaterials.obsidianArmor, FergoTools.proxy.addArmor("obsidian"), type);
        }

        public String getArmorTexture(ItemStack is, Entity entity, int slot, String type)
        {
            if(is.getItem() == ModItems.obsidianHelmet || is.getItem() == ModItems.obsidianChestplate || is.getItem() == ModItems.obsidianBoots)
            {
                return ArmorStrings.obsidianArmorRender[0];
            }

            if(is.getItem() == ModItems.obsidianLeggings)
            {
                return ArmorStrings.obsidianArmorRender[1];
            }
            else
            {
                return null;
            }
        }

    }

    public static class ItemArmorEmerald extends ItemArmor{

        public ItemArmorEmerald(int type)
        {
            super(ToolArmorMaterials.emeraldArmor, FergoTools.proxy.addArmor("emerald"), type);
        }

        public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
        {
            if(stack.getItem() == ModItems.emeraldHelmet || stack.getItem() == ModItems.emeraldChestplate || stack.getItem() == ModItems.emeraldBoots)
            {
                return ArmorStrings.emeraldArmorRender[0];
            }

            if(stack.getItem() == ModItems.emeraldLeggings)
            {
                return ArmorStrings.emeraldArmorRender[1];
            }
            else
            {
                return null;
            }
        }

    }

    public static class ItemArmorLapis extends  ItemArmor{

        public ItemArmorLapis(int type)
        {
            super(ToolArmorMaterials.lapisArmor, FergoTools.proxy.addArmor("lapis"), type);
        }

        public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
        {
            if(stack.getItem() == ModItems.lapisHelmet || stack.getItem() == ModItems.lapisChestplate || stack.getItem() == ModItems.lapisBoots)
            {
                return ArmorStrings.lapisArmorRender[0];
            }

            if(stack.getItem() == ModItems.lapisLeggings)
            {
                return ArmorStrings.lapisArmorRender[1];
            }
            else
            {
                return null;
            }
        }

    }

    public static class ItemArmorBronze extends ItemArmor{

        public ItemArmorBronze(int type)
        {
            super(ToolArmorMaterials.bronzeArmor, FergoTools.proxy.addArmor("bronze"), type);
        }

        public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
        {
            if(stack.getItem() == ModItems.bronzeHelmet || stack.getItem() == ModItems.bronzeChestplate || stack.getItem() == ModItems.bronzeBoots)
            {
                return ArmorStrings.bronzeArmorRender[0];
            }

            if(stack.getItem() == ModItems.bronzeLeggings)
            {
                return ArmorStrings.bronzeArmorRender[1];
            }
            else
            {
                return null;
            }
        }

    }

    public static class ItemArmorCoal extends ItemArmor{

        public ItemArmorCoal(int type)
        {
            super(ToolArmorMaterials.coalArmor, FergoTools.proxy.addArmor("coal"), type);
        }

        public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
        {
            if(stack.getItem() == ModItems.coalHelmet || stack.getItem() == ModItems.coalChestplate || stack.getItem() == ModItems.coalBoots)
            {
                return ArmorStrings.coalArmorRender[0];
            }

            if(stack.getItem() == ModItems.coalLeggings)
            {
                return ArmorStrings.coalArmorRender[1];
            }
            else
            {
                return null;
            }
        }

    }

    public static class ItemArmorGlowstone extends ItemArmor {

        public ItemArmorGlowstone(int type)
        {
            super(ToolArmorMaterials.glowstoneArmor, FergoTools.proxy.addArmor("glowstone"), type);
        }

        public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
        {
            if(stack.getItem() == ModItems.glowstoneHelmet || stack.getItem() == ModItems.glowstoneChestplate || stack.getItem() == ModItems.glowstoneBoots)
            {
                return ArmorStrings.glowstoneArmorRender[0];
            }

            if(stack.getItem() == ModItems.glowstoneLeggings)
            {
                return ArmorStrings.glowstoneArmorRender[1];
            }
            else
            {
                return null;
            }
        }

    }


}

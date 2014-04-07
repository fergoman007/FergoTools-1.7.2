package fergoman123.mods.fergotools.item;

import fergoman123.mods.fergotools.block.ModBlocks;
import fergoman123.mods.fergotools.lib.Reference;
import fergoman123.mods.fergotools.lib.strings.ToolStrings;
import fergoman123.mods.fergotools.util.block.BlockUtil;
import fergoman123.mods.fergotools.util.item.IHammerBase;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

public class Hammers {

    public static class ItemQuartzHammer extends ItemTool implements IHammerBase
    {
        private float damVsEntity;
        public ItemQuartzHammer(float damVsEntity, ToolMaterial toolMaterial) {
            super(damVsEntity, toolMaterial, BlockUtil.blocksHammerSet);
            this.setUnlocalizedName(ToolStrings.hammers[0]);
            this.setMaxStackSize(1);
            this.setMaxDamage(ToolArmorMaterials.quartz.getMaxUses());
            this.setTextureName(Reference.textureLoc + ToolStrings.hammers[0]);
            this.setHarvestLevel("pickaxe", 3);
            this.damVsEntity = damVsEntity;
        }

        public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int x, int y, int z, EntityLivingBase entity)
        {
            boolean isCobble =  world.getBlock(x, y, z) == Blocks.cobblestone;
            boolean isStone = world.getBlock(x, y, z) == Blocks.stone;
            boolean isStoneBrick = world.getBlock(x, y, z) == Blocks.stonebrick;
            boolean isSandtone = world.getBlock(x, y, z) == Blocks.sandstone;

            boolean isOreExperience = world.getBlock(x, y, z) == ModBlocks.oreExperience;
            boolean isOreObsidian = world.getBlock(x, y, z) == ModBlocks.oreObsidian;
            boolean isOreEmeraldCrystal = world.getBlock(x, y, z) == ModBlocks.oreEmeraldCrystal;
            boolean isOreLapisCrystal = world.getBlock(x, y, z) == ModBlocks.oreLapisCrystal;
            boolean isOreBronze = world.getBlock(x, y, z) == ModBlocks.oreBronze;
            boolean isOreAdamantium = world.getBlock(x, y, z) == ModBlocks.oreAdamantium;

            if(isCobble || isStone || isStoneBrick || isSandtone || isOreExperience || isOreObsidian || isOreEmeraldCrystal || isOreLapisCrystal || isOreBronze || isOreAdamantium)
            {
                world.func_147480_a(x-1, y, z, true);
                world.func_147480_a(x-1, y+1, z, true);
                world.func_147480_a(x-1, y-1, z, true);
                world.func_147480_a(x+1, y, z, true);
                world.func_147480_a(x+1, y+1, z, true);
                world.func_147480_a(x+1, y-1, z, true);
                world.func_147480_a(x, y + 1, z, true);
                world.func_147480_a(x, y - 1, z,true);
//                for(int ix = -1; ix < 2; ++ix)
//                {
//                    for (int iy = -1; iy < 2; ++iy)
//                    {
//                        for (int iz = -1; iz < 2; ++iz)
//                        {
//                            world.func_147480_a(x + ix, y, z + iz, true);
//                            stack.setItemDamage(stack.getItemDamage() - 9);
//                        }
//                    }
//                }
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public static class ItemObsidianHammer extends ItemTool implements IHammerBase
    {
        private float damVsEntity;
        public ItemObsidianHammer(float damVsEntity, ToolMaterial material)
        {
            super(damVsEntity, material, BlockUtil.blocksHammerSet);
            this.setUnlocalizedName(ToolStrings.hammers[1]);
            this.setMaxStackSize(1);
            this.setMaxDamage(ToolArmorMaterials.obsidian.getMaxUses());
            this.setTextureName(Reference.textureLoc + ToolStrings.hammers[1]);
            this.setHarvestLevel("pickaxe", 3);
            this.damVsEntity = damVsEntity;
        }

        public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int x, int y, int z, EntityLivingBase base)
        {
            boolean isCobble =  world.getBlock(x, y, z) == Blocks.cobblestone;
            boolean isStone = world.getBlock(x, y, z) == Blocks.stone;
            boolean isStoneBrick = world.getBlock(x, y, z) == Blocks.stonebrick;
            boolean isSandtone = world.getBlock(x, y, z) == Blocks.sandstone;

            boolean isOreExperience = world.getBlock(x, y, z) == ModBlocks.oreExperience;
            boolean isOreObsidian = world.getBlock(x, y, z) == ModBlocks.oreObsidian;
            boolean isOreEmeraldCrystal = world.getBlock(x, y, z) == ModBlocks.oreEmeraldCrystal;
            boolean isOreLapisCrystal = world.getBlock(x, y, z) == ModBlocks.oreLapisCrystal;
            boolean isOreBronze = world.getBlock(x, y, z) == ModBlocks.oreBronze;
            boolean isOreAdamantium = world.getBlock(x, y, z) == ModBlocks.oreAdamantium;

            if(isCobble || isStone || isStoneBrick || isSandtone || isOreExperience || isOreObsidian || isOreEmeraldCrystal || isOreLapisCrystal || isOreBronze || isOreAdamantium)
            {
                for(int ix = -1; ix < 2; ++ix)
                {
                    for (int iy = -1; iy < 2; ++iy)
                    {
                        for (int iz = -1; iz < 2; ++iz)
                        {
                            world.func_147480_a(x + ix, y + iy, z + iz, true);
                            stack.setItemDamage(stack.getItemDamage() - 9);
                        }
                    }
                }
                return true;
            }else {
                return false;
            }
        }
    }
}

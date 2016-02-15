package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.block.*;
import io.github.fergoman123.fergotools.item.ItemBlockStorageFT;
import io.github.fergoman123.fergotools.reference.BlockNames;
import io.github.fergoman123.fergotools.reference.ItemNames;
import io.github.fergoman123.fergotools.resloc.ModelResLocFT;
import io.github.fergoman123.fergotools.resloc.ResLocFT;
import io.github.fergoman123.fergotools.tileentity.TileEntityQuartzFurnace;
import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import io.github.fergoman123.fergoutil.item.ItemMultiFergo;
import io.github.fergoman123.fergoutil.model.ModelHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockQuartz;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

public class ModBlocks {

    public static Block oreExperience;
    public static Block oreObsidian;
    public static Block oreGemEmerald;
    public static Block oreGemLapis;
    public static Block oreBronze;
    public static Block oreAdamantium;
    public static Block oreGemRedstone;

    public static Block storageFT;

    public static void addBlocks(){
        oreExperience = new BlockOreExperience();
        oreObsidian = new BlockOreObsidian();
        oreGemEmerald = new BlockOreGemEmerald();
        oreGemLapis = new BlockOreGemLapis();
        oreBronze = new BlockOreBronze();
        oreAdamantium = new BlockOreAdamantium();
        oreGemRedstone = new BlockOreGemRedstone();

        storageFT = new BlockStorageFT();
    }

    public static void registerBlocks(){
        GameRegistry.registerBlock(oreExperience, BlockNames.oreExperience);
        GameRegistry.registerBlock(oreObsidian, BlockNames.oreObsidian);
        GameRegistry.registerBlock(oreGemEmerald, BlockNames.oreGemEmerald);
        GameRegistry.registerBlock(oreGemLapis, BlockNames.oreGemLapis);
        GameRegistry.registerBlock(oreBronze, BlockNames.oreBronze);
        GameRegistry.registerBlock(oreAdamantium, BlockNames.oreAdamantium);
        GameRegistry.registerBlock(oreGemRedstone, BlockNames.oreGemRedstone);

        GameRegistry.registerBlock(storageFT, ItemBlockStorageFT.class, BlockNames.blockStorageFT);

        GameRegistry.registerBlock(BlockQuartzFurnace.idle, BlockNames.quartzFurnaceIdle);

        GameRegistry.registerBlock(BlockQuartzFurnace.active, BlockNames.quartzFurnaceActive);

        register(oreExperience, 0, BlockNames.oreExperience);
        register(oreObsidian, 0, BlockNames.oreObsidian);
        register(oreGemEmerald, 0, BlockNames.oreGemEmerald);
        register(oreGemLapis, 0, BlockNames.oreGemLapis);
        register(oreBronze, 0, BlockNames.oreBronze);
        register(oreAdamantium, 0, BlockNames.oreAdamantium);
        register(oreGemRedstone, 0, BlockNames.oreGemRedstone);

        for (BlockStorageFT.EnumType storageBlock : BlockStorageFT.EnumType.values()) {
            register(storageFT, storageBlock.meta(), storageBlock.getName());
        }

        register(BlockQuartzFurnace.idle, 0, BlockNames.quartzFurnaceIdle);

        register(BlockQuartzFurnace.active, 0, BlockNames.quartzFurnaceActive);

        variant(oreExperience, BlockNames.oreExperience);
        variant(oreObsidian, BlockNames.oreObsidian);
        variant(oreGemEmerald, BlockNames.oreGemEmerald);
        variant(oreGemLapis, BlockNames.oreGemLapis);
        variant(oreBronze, BlockNames.oreBronze);
        variant(oreAdamantium, BlockNames.oreAdamantium);
        variant(oreGemRedstone, BlockNames.oreGemRedstone);

        for (BlockStorageFT.EnumType storageBlock : BlockStorageFT.EnumType.values()){
            variant(storageFT, storageBlock.getName());
        }

        variant(BlockQuartzFurnace.idle, BlockNames.quartzFurnaceIdle);

        variant(BlockQuartzFurnace.active, BlockNames.quartzFurnaceActive);

        GameRegistry.registerTileEntity(TileEntityQuartzFurnace.class, "quartzFurnace");
    }

    private static void register(Block block, int meta, String name){
        ModelHelper.register(block, meta, new ModelResLocFT(name));
    }

    private static void variant(Block block, String name){
        ModelHelper.variant(block, new ResLocFT(name));
    }
}

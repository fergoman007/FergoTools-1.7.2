package io.github.fergoman123.fergotools.model;

import io.github.fergoman123.fergotools.api.content.StorageTypes;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.reference.BlockNames;
import io.github.fergoman123.fergoutil.model.ModelEntry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Models {
	
	public static final ModelEntry oreExperience = createBlockModel(ModBlocks.oreExperience, BlockNames.oreExperience);
	public static final ModelEntry oreObsidian = createBlockModel(ModBlocks.oreObsidian, BlockNames.oreObsidian);
	public static final ModelEntry oreGemEmerald = createBlockModel(ModBlocks.oreGemEmerald, BlockNames.oreGemEmerald);
	public static final ModelEntry oreGemLapis = createBlockModel(ModBlocks.oreGemLapis, BlockNames.oreGemLapis);
	public static final ModelEntry oreBronze = createBlockModel(ModBlocks.oreBronze, BlockNames.oreBronze);
	public static final ModelEntry oreAdamantium = createBlockModel(ModBlocks.oreAdamantium, BlockNames.oreAdamantium);
	public static final ModelEntry oreGemRedstone = createBlockModel(ModBlocks.oreGemRedstone, BlockNames.oreGemRedstone);
	
	public static final ModelEntry blockExperience = createStorageBlockModel(StorageTypes.blockExperience);
	public static final ModelEntry blockExpCollector = createStorageBlockModel(StorageTypes.blockExpCollector);
	public static final ModelEntry blockObsidian = createStorageBlockModel(StorageTypes.blockObsidian);
	public static final ModelEntry blockGemEmerald = createStorageBlockModel(StorageTypes.blockGemEmerald);
	public static final ModelEntry blockGemLapis = createStorageBlockModel(StorageTypes.blockGemLapis);
	public static final ModelEntry blockBronze = createStorageBlockModel(StorageTypes.blockBronze);
	public static final ModelEntry blockCoal = createStorageBlockModel(StorageTypes.blockCoal);
	public static final ModelEntry blockGlowstone = createStorageBlockModel(StorageTypes.blockGlowstone);
	public static final ModelEntry blockAdamantium = createStorageBlockModel(StorageTypes.blockAdamantium);
	public static final ModelEntry blockGemSilk = createStorageBlockModel(StorageTypes.blockGemSilk);
	public static final ModelEntry blockGemRedstone = createStorageBlockModel(StorageTypes.blockGemRedstone);
	
	private static ModelEntry createBlockModel(Block block, int meta, String name){
		return new ModelEntry(Item.getItemFromBlock(block), meta, "fergotools:" + name);
	}
	
	private static ModelEntry createBlockModel(Block block, String name){
		return createBlockModel(block, 0, name);
	}
	
	private static ModelEntry createStorageBlockModel(StorageTypes type){
		return createBlockModel(ModBlocks.storageFT, type.getMeta(), type.getName());
	}
}

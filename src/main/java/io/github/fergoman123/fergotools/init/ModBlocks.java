package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.api.content.*;
import io.github.fergoman123.fergotools.block.*;
import io.github.fergoman123.fergotools.block.BlockPlankFT.*;
import io.github.fergoman123.fergotools.common.blocks.wood.*;
import io.github.fergoman123.fergotools.common.blocks.wood.BlockWoodLogFT;
import io.github.fergoman123.fergotools.common.itemblock.*;
import io.github.fergoman123.fergotools.item.*;
import io.github.fergoman123.fergotools.reference.*;
import io.github.fergoman123.fergoutil.helper.*;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.registry.*;

public class ModBlocks {

	public static final BlockOreFT oreExperience = new BlockOreExperience(BlockNames.oreExperience);
    public static final BlockOreFT oreObsidian = new BlockOreObsidian(BlockNames.oreObsidian);
    public static final BlockOreFT oreGemEmerald = new BlockOreEmerald(BlockNames.oreGemEmerald);
    public static final BlockOreFT oreGemLapis = new BlockOreLapis(BlockNames.oreGemLapis);
    public static final BlockOreFT oreBronze = new BlockOreBronze(BlockNames.oreBronze);
    public static final BlockOreFT oreAdamantium = new BlockOreAdamantium(BlockNames.oreAdamantium);
    public static final BlockOreFT oreGemRedstone = new BlockOreRedstone(BlockNames.oreGemRedstone);

    public static final BlockMultiFT storageFT = new BlockStorageFT(BlockNames.storageFT);

    public static final BlockFurnaceFT quartzFurnaceIdle = new BlockQuartzFurnace(false, BlockNames.quartzFurnaceIdle);
    public static final BlockFurnaceFT obsidianFurnaceIdle = new BlockObsidianFurnace(false, BlockNames.obsidianFurnaceIdle);
    public static final BlockFurnaceFT emeraldFurnaceIdle = new BlockEmeraldFurnace(false, BlockNames.emeraldFurnaceIdle);
    public static final BlockFurnaceFT lapisFurnaceIdle = new BlockLapisFurnace(false, BlockNames.lapisFurnaceIdle);
    public static final BlockFurnaceFT bronzeFurnaceIdle = new BlockBronzeFurnace(false, BlockNames.bronzeFurnaceIdle);
    public static final BlockFurnaceFT coalFurnaceIdle = new BlockCoalFurnace(false, BlockNames.coalFurnaceIdle);
    public static final BlockFurnaceFT glowstoneFurnaceIdle = new BlockGlowstoneFurnace(false, BlockNames.glowstoneFurnaceIdle);
    public static final BlockFurnaceFT adamantiumFurnaceIdle = new BlockAdamantiumFurnace(false, BlockNames.adamantiumFurnaceIdle);
    public static final BlockFurnaceFT silkFurnaceIdle = new BlockSilkFurnace(false, BlockNames.silkFurnaceIdle);
    public static final BlockFurnaceFT redstoneFurnaceIdle = new BlockRedstoneFurnace(false, BlockNames.redstoneFurnaceIdle);
    public static final BlockFurnaceFT maceratorIdle = new BlockMacerator(false, BlockNames.maceratorIdle);

    public static final BlockFurnaceFT quartzFurnaceActive = new BlockQuartzFurnace(true, BlockNames.quartzFurnaceActive);
    public static final BlockFurnaceFT obsidianFurnaceActive = new BlockObsidianFurnace(true, BlockNames.obsidianFurnaceActive);
    public static final BlockFurnaceFT emeraldFurnaceActive = new BlockEmeraldFurnace(true, BlockNames.emeraldFurnaceActive);
    public static final BlockFurnaceFT lapisFurnaceActive = new BlockLapisFurnace(true, BlockNames.lapisFurnaceActive);
    public static final BlockFurnaceFT bronzeFurnaceActive = new BlockBronzeFurnace(true, BlockNames.bronzeFurnaceActive);
    public static final BlockFurnaceFT coalFurnaceActive = new BlockCoalFurnace(true, BlockNames.coalFurnaceActive);
    public static final BlockFurnaceFT glowstoneFurnaceActive = new BlockGlowstoneFurnace(true, BlockNames.glowstoneFurnaceActive);
    public static final BlockFurnaceFT adamantiumFurnaceActive = new BlockAdamantiumFurnace(true, BlockNames.adamantiumFurnaceActive);
    public static final BlockFurnaceFT silkFurnaceActive = new BlockSilkFurnace(true, BlockNames.silkFurnaceActive);
    public static final BlockFurnaceFT redstoneFurnaceActive = new BlockRedstoneFurnace(true, BlockNames.redstoneFurnaceActive);
    public static final BlockFurnaceFT maceratorActive = new BlockMacerator(true, BlockNames.maceratorActive);

    public static final BlockWoodLogFT logFT = new BlockWoodLogFT(BlockNames.logFT);
    public static final BlockMultiFT plankFT = new BlockPlankFT(BlockNames.plankFT);
    public static final BlockLeavesImpl leavesFT = new BlockLeavesImpl(BlockNames.leavesFT);
    public static final BlockSaplingFT saplingFT = new BlockSaplingFT(BlockNames.saplingFT);

    public static final BlockStairsFT stairObsidian = new BlockStairsFT(BlockStates.obsidian, BlockNames.stairObsidian);
    public static final BlockStairsFT stairEmerald = new BlockStairsFT(BlockStates.emerald, BlockNames.stairEmerald);
    public static final BlockStairsFT stairLapis = new BlockStairsFT(BlockStates.lapis, BlockNames.stairLapis);
    public static final BlockStairsFT stairBronze = new BlockStairsFT(BlockStates.bronze, BlockNames.stairBronze);
    public static final BlockStairsFT stairCoal = new BlockStairsFT(BlockStates.coal, BlockNames.stairCoal);
    public static final BlockStairsFT stairGlowstone = new BlockStairsFT(BlockStates.glowstone, BlockNames.stairGlowstone);
    public static final BlockStairsFT stairAdamantium = new BlockStairsFT(BlockStates.adamantium, BlockNames.stairAdamantium);
    public static final BlockStairsFT stairSilk = new BlockStairsFT(BlockStates.silk, BlockNames.stairSilk);
    public static final BlockStairsFT stairRedstone = new BlockStairsFT(BlockStates.redstone, BlockNames.stairRedstone);

    public static final BlockWoodSlabFT singleSlabFT = new BlockHSFT(BlockNames.slabSingleFT);
    public static final BlockWoodSlabFT doubleSlabFT = new BlockDSFT(BlockNames.slabDoubleFT);

    public static final BlockWorkbenchFT obsidianWorkbench = new BlockObsidianWorkbench(BlockNames.obsidianWorkbench);
    public static final BlockWorkbenchFT emeraldWorkbench = new BlockEmeraldWorkbench(BlockNames.emeraldWorkbench);
    public static final BlockWorkbenchFT lapisWorkbench = new BlockLapisWorkbench(BlockNames.lapisWorkbench);
    public static final BlockWorkbenchFT bronzeWorkbench = new BlockBronzeWorkbench(BlockNames.bronzeWorkbench);
    public static final BlockWorkbenchFT coalWorkbench = new BlockCoalWorkbench(BlockNames.coalWorkbench);
    public static final BlockWorkbenchFT glowstoneWorkbench = new BlockGlowstoneWorkbench(BlockNames.glowstoneWorkbench);
    public static final BlockWorkbenchFT adamantiumWorkbench = new BlockAdamantiumWorkbench(BlockNames.adamantiumWorkbench);
    public static final BlockWorkbenchFT silkWorkbench = new BlockSilkWorkbench(BlockNames.silkWorkbench);
    public static final BlockWorkbenchFT redstoneWorkbench = new BlockRedstoneWorkbench(BlockNames.redstoneWorkbench);

    public void register(){
    	GameRegistry.registerBlock(oreExperience, BlockNames.oreExperience);
    	registerModel(oreExperience, 0, BlockNames.oreExperience);
    	addVariant(oreExperience, BlockNames.oreExperience);
    	GameRegistry.registerBlock(oreObsidian, BlockNames.oreObsidian);
    	registerModel(oreObsidian, 0, BlockNames.oreObsidian);
    	addVariant(oreObsidian, BlockNames.oreObsidian);
    	GameRegistry.registerBlock(oreGemEmerald, BlockNames.oreGemEmerald);
    	registerModel(oreGemEmerald, 0, BlockNames.oreGemEmerald);
    	addVariant(oreGemEmerald, BlockNames.oreGemEmerald);
    	GameRegistry.registerBlock(oreGemLapis, BlockNames.oreGemLapis);
    	registerModel(oreGemLapis, 0, BlockNames.oreGemLapis);
    	addVariant(oreGemLapis, BlockNames.oreGemLapis);
    	GameRegistry.registerBlock(oreBronze, BlockNames.oreBronze);
    	registerModel(oreBronze, 0, BlockNames.oreBronze);
    	addVariant(oreBronze, BlockNames.oreBronze);
    	GameRegistry.registerBlock(oreAdamantium, BlockNames.oreAdamantium);
    	registerModel(oreAdamantium, 0, BlockNames.oreAdamantium);
    	addVariant(oreAdamantium, BlockNames.oreAdamantium);
    	GameRegistry.registerBlock(oreGemRedstone, BlockNames.oreGemRedstone);
    	registerModel(oreGemRedstone, 0, BlockNames.oreGemRedstone);
    	addVariant(oreGemRedstone, BlockNames.oreGemRedstone);
    	
    	GameRegistry.registerBlock(storageFT, BlockNames.storageFT);
    	for(StorageTypes type : StorageTypes.values()){
    		registerModel(storageFT, type.getMeta(), type.getName());
    		addVariant(storageFT, type.getName());
    	}
    	
    	Block[] idle = new Block[]{quartzFurnaceIdle,obsidianFurnaceIdle,emeraldFurnaceIdle,lapisFurnaceIdle,bronzeFurnaceIdle,coalFurnaceIdle,glowstoneFurnaceIdle,adamantiumFurnaceIdle,silkFurnaceIdle,redstoneFurnaceIdle,maceratorIdle};
    	
    	for (int i = 0; i < idle.length; i++) {
			GameRegistry.registerBlock(idle[i], BlockNames.furnaceIdle[i]);
			registerModel(idle[i], 0, BlockNames.furnaceIdle[i]);
			addVariant(idle[i], BlockNames.furnaceIdle[i]);
		}
    	
    	Block[] active = new Block[]{quartzFurnaceActive,obsidianFurnaceActive,emeraldFurnaceActive,lapisFurnaceActive,bronzeFurnaceActive,coalFurnaceActive,glowstoneFurnaceActive,adamantiumFurnaceActive,silkFurnaceActive,redstoneFurnaceActive,maceratorActive};
    	
    	for (int i = 0; i < active.length; i++) {
			GameRegistry.registerBlock(active[i], BlockNames.furnaceActive[i]);
			registerModel(active[i], 0, BlockNames.furnaceActive[i]);
			addVariant(active[i], BlockNames.furnaceActive[i]);
		}
    	
    	GameRegistry.registerBlock(logFT, ItemBlockLogFT.class, BlockNames.logFT);
    	GameRegistry.registerBlock(plankFT, ItemBlockPlankFT.class, BlockNames.logFT);
    	for(WoodTypes type : WoodTypes.values()){
    		registerModel(logFT, type.getMeta(), WoodTypes.getLogName(type.getMeta()));
    		registerModel(plankFT, type.getMeta(), WoodTypes.getPlankName(type.getMeta()));
    		registerModel(leavesFT, type.getMeta(), WoodTypes.getLeavesName(type.getMeta()));
    		registerModel(saplingFT, type.getMeta(), WoodTypes.getSaplingName(type.getMeta()));
    		registerModel(singleSlabFT, type.getMeta(), WoodTypes.getSlabName(type.getMeta(), false));
    		registerModel(doubleSlabFT, type.getMeta(), WoodTypes.getSlabName(type.getMeta(), true));
    	}
    }
    
    private static void registerModel(Block block, int meta, String name){
    	RegisterHelper.registerModel(Item.getItemFromBlock(block), meta, "fergotools:" + name);
    }
    
    private static void addVariant(Block block, String name){
    	RegisterHelper.addVariant(Item.getItemFromBlock(block), "fergotools:" + name);
    }
}

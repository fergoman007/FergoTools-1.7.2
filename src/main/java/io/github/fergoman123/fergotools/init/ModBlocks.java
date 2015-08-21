package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.api.content.WoodTypes;
import io.github.fergoman123.fergotools.block.BlockAdamantiumFurnace;
import io.github.fergoman123.fergotools.block.BlockAdamantiumWorkbench;
import io.github.fergoman123.fergotools.block.BlockBronzeFurnace;
import io.github.fergoman123.fergotools.block.BlockBronzeWorkbench;
import io.github.fergoman123.fergotools.block.BlockCoalFurnace;
import io.github.fergoman123.fergotools.block.BlockCoalWorkbench;
import io.github.fergoman123.fergotools.block.BlockEmeraldFurnace;
import io.github.fergoman123.fergotools.block.BlockEmeraldWorkbench;
import io.github.fergoman123.fergotools.block.BlockFT;
import io.github.fergoman123.fergotools.block.BlockFurnaceFT;
import io.github.fergoman123.fergotools.block.BlockGlowstoneFurnace;
import io.github.fergoman123.fergotools.block.BlockGlowstoneWorkbench;
import io.github.fergoman123.fergotools.block.BlockLapisFurnace;
import io.github.fergoman123.fergotools.block.BlockLapisWorkbench;
import io.github.fergoman123.fergotools.block.BlockLeavesImpl;
import io.github.fergoman123.fergotools.block.BlockMacerator;
import io.github.fergoman123.fergotools.block.BlockMultiFT;
import io.github.fergoman123.fergotools.block.BlockObsidianFurnace;
import io.github.fergoman123.fergotools.block.BlockObsidianWorkbench;
import io.github.fergoman123.fergotools.block.BlockOreAdamantium;
import io.github.fergoman123.fergotools.block.BlockOreBronze;
import io.github.fergoman123.fergotools.block.BlockOreEmerald;
import io.github.fergoman123.fergotools.block.BlockOreExperience;
import io.github.fergoman123.fergotools.block.BlockOreFT;
import io.github.fergoman123.fergotools.block.BlockOreLapis;
import io.github.fergoman123.fergotools.block.BlockOreObsidian;
import io.github.fergoman123.fergotools.block.BlockOreRedstone;
import io.github.fergoman123.fergotools.block.BlockPlankFT;
import io.github.fergoman123.fergotools.block.BlockPlankFT.BlockStates;
import io.github.fergoman123.fergotools.block.BlockQuartzFurnace;
import io.github.fergoman123.fergotools.block.BlockRedstoneFurnace;
import io.github.fergoman123.fergotools.block.BlockRedstoneWorkbench;
import io.github.fergoman123.fergotools.block.BlockSaplingFT;
import io.github.fergoman123.fergotools.block.BlockSilkFurnace;
import io.github.fergoman123.fergotools.block.BlockSilkWorkbench;
import io.github.fergoman123.fergotools.block.BlockStairFT;
import io.github.fergoman123.fergotools.block.BlockStorageFT;
import io.github.fergoman123.fergotools.block.BlockWorkbenchFT;
import io.github.fergoman123.fergotools.common.blocks.wood.BlockDSFT;
import io.github.fergoman123.fergotools.common.blocks.wood.BlockHSFT;
import io.github.fergoman123.fergotools.common.blocks.wood.BlockWoodLogFT;
import io.github.fergoman123.fergotools.common.blocks.wood.BlockWoodSlabFT;
import io.github.fergoman123.fergotools.common.itemblock.ItemBlockLeavesFT;
import io.github.fergoman123.fergotools.common.itemblock.ItemBlockLogFT;
import io.github.fergoman123.fergotools.common.itemblock.ItemBlockSaplingFT;
import io.github.fergoman123.fergotools.common.itemblock.ItemBlockSlabDouble;
import io.github.fergoman123.fergotools.common.itemblock.ItemBlockSlabSingle;
import io.github.fergoman123.fergotools.model.Models;
import io.github.fergoman123.fergotools.reference.BlockNames;
import io.github.fergoman123.fergoutil.item.ItemBlockVariants;
import io.github.fergoman123.fergoutil.model.ModelEntry;
import io.github.fergoman123.fergoutil.model.ModelVariant;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

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

    public static final BlockStairFT stairObsidian = new BlockStairFT(BlockStates.obsidian, BlockNames.stairObsidian);
    public static final BlockStairFT stairEmerald = new BlockStairFT(BlockStates.emerald, BlockNames.stairEmerald);
    public static final BlockStairFT stairLapis = new BlockStairFT(BlockStates.lapis, BlockNames.stairLapis);
    public static final BlockStairFT stairBronze = new BlockStairFT(BlockStates.bronze, BlockNames.stairBronze);
    public static final BlockStairFT stairCoal = new BlockStairFT(BlockStates.coal, BlockNames.stairCoal);
    public static final BlockStairFT stairGlowstone = new BlockStairFT(BlockStates.glowstone, BlockNames.stairGlowstone);
    public static final BlockStairFT stairAdamantium = new BlockStairFT(BlockStates.adamantium, BlockNames.stairAdamantium);
    public static final BlockStairFT stairSilk = new BlockStairFT(BlockStates.silk, BlockNames.stairSilk);
    public static final BlockStairFT stairRedstone = new BlockStairFT(BlockStates.redstone, BlockNames.stairRedstone);

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
    	GameRegistry.registerBlock(oreObsidian, BlockNames.oreObsidian);
    	GameRegistry.registerBlock(oreGemEmerald, BlockNames.oreGemEmerald);
    	GameRegistry.registerBlock(oreGemLapis, BlockNames.oreGemLapis);
    	GameRegistry.registerBlock(oreBronze, BlockNames.oreBronze);
    	GameRegistry.registerBlock(oreAdamantium, BlockNames.oreAdamantium);
    	GameRegistry.registerBlock(oreGemRedstone, BlockNames.oreGemRedstone);
    	
    	GameRegistry.registerBlock(storageFT, ItemBlockVariants.class, BlockNames.storageFT);
    	
    	GameRegistry.registerBlock(quartzFurnaceIdle, BlockNames.quartzFurnaceIdle);
    	GameRegistry.registerBlock(obsidianFurnaceIdle, BlockNames.obsidianFurnaceIdle);
    	GameRegistry.registerBlock(emeraldFurnaceIdle, BlockNames.emeraldFurnaceIdle);
    	GameRegistry.registerBlock(lapisFurnaceIdle, BlockNames.lapisFurnaceIdle);
    	GameRegistry.registerBlock(bronzeFurnaceIdle, BlockNames.bronzeFurnaceIdle);
    	GameRegistry.registerBlock(coalFurnaceIdle, BlockNames.coalFurnaceIdle);
    	GameRegistry.registerBlock(glowstoneFurnaceIdle, BlockNames.glowstoneFurnaceIdle);
    	GameRegistry.registerBlock(adamantiumFurnaceIdle, BlockNames.adamantiumFurnaceIdle);
    	GameRegistry.registerBlock(silkFurnaceIdle, BlockNames.silkFurnaceIdle);
    	GameRegistry.registerBlock(redstoneFurnaceIdle, BlockNames.redstoneFurnaceIdle);
    	GameRegistry.registerBlock(maceratorIdle, BlockNames.maceratorIdle);
    	
    	GameRegistry.registerBlock(quartzFurnaceActive, BlockNames.quartzFurnaceActive);
    	GameRegistry.registerBlock(obsidianFurnaceActive, BlockNames.obsidianFurnaceActive);
    	GameRegistry.registerBlock(emeraldFurnaceActive, BlockNames.emeraldFurnaceActive);
    	GameRegistry.registerBlock(lapisFurnaceActive, BlockNames.lapisFurnaceActive);
    	GameRegistry.registerBlock(bronzeFurnaceActive, BlockNames.bronzeFurnaceActive);
    	GameRegistry.registerBlock(coalFurnaceActive, BlockNames.coalFurnaceActive);
    	GameRegistry.registerBlock(glowstoneFurnaceActive, BlockNames.glowstoneFurnaceIdle);
    	GameRegistry.registerBlock(adamantiumFurnaceActive, BlockNames.adamantiumFurnaceActive);
    	GameRegistry.registerBlock(silkFurnaceActive, BlockNames.silkFurnaceActive);
    	GameRegistry.registerBlock(redstoneFurnaceActive, BlockNames.redstoneFurnaceActive);
    	GameRegistry.registerBlock(maceratorActive, BlockNames.maceratorIdle);
    	
    	GameRegistry.registerBlock(logFT, ItemBlockLogFT.class, BlockNames.logFT);
    	GameRegistry.registerBlock(plankFT, ItemBlockVariants.class, BlockNames.plankFT);
    	GameRegistry.registerBlock(leavesFT, ItemBlockLeavesFT.class, BlockNames.leavesFT);
    	GameRegistry.registerBlock(saplingFT, ItemBlockSaplingFT.class, BlockNames.saplingFT);
    	
    	GameRegistry.registerBlock(stairObsidian, BlockNames.stairObsidian);
    	GameRegistry.registerBlock(stairEmerald, BlockNames.stairEmerald);
    	GameRegistry.registerBlock(stairLapis, BlockNames.stairLapis);
    	GameRegistry.registerBlock(stairBronze, BlockNames.stairBronze);
    	GameRegistry.registerBlock(stairCoal, BlockNames.stairCoal);
    	GameRegistry.registerBlock(stairGlowstone, BlockNames.stairGlowstone);
    	GameRegistry.registerBlock(stairAdamantium, BlockNames.stairAdamantium);
    	GameRegistry.registerBlock(stairSilk, BlockNames.stairSilk);
    	GameRegistry.registerBlock(stairRedstone, BlockNames.stairRedstone);
    	
    	GameRegistry.registerBlock(singleSlabFT, ItemBlockSlabSingle.class, BlockNames.slabSingleFT);
    	GameRegistry.registerBlock(doubleSlabFT, ItemBlockSlabDouble.class, BlockNames.slabDoubleFT);
    	
        GameRegistry.registerBlock(obsidianWorkbench, BlockNames.obsidianWorkbench);
        GameRegistry.registerBlock(emeraldWorkbench, BlockNames.emeraldWorkbench);
        GameRegistry.registerBlock(lapisWorkbench, BlockNames.lapisWorkbench);
        GameRegistry.registerBlock(bronzeWorkbench, BlockNames.bronzeWorkbench);
        GameRegistry.registerBlock(coalWorkbench, BlockNames.coalWorkbench);
        GameRegistry.registerBlock(glowstoneWorkbench, BlockNames.glowstoneWorkbench);
        GameRegistry.registerBlock(adamantiumWorkbench, BlockNames.adamantiumWorkbench);
        GameRegistry.registerBlock(silkWorkbench, BlockNames.silkWorkbench);
        GameRegistry.registerBlock(redstoneWorkbench, BlockNames.redstoneWorkbench);
    	
    	registerModels();
    	addVariants();
    }
    
    private void registerModels(){
    	registerModel(Models.oreExperience);
    	registerModel(Models.oreObsidian);
    	registerModel(Models.oreGemEmerald);
    	registerModel(Models.oreGemLapis);
    	registerModel(Models.oreBronze);
    	registerModel(Models.oreAdamantium);
    	registerModel(Models.oreGemRedstone);
    	
    	registerModel(Models.blockExperience);
    	registerModel(Models.blockExpCollector);
    	registerModel(Models.blockObsidian);
    	registerModel(Models.blockGemEmerald);
    	registerModel(Models.blockGemLapis);
    	registerModel(Models.blockBronze);
    	registerModel(Models.blockCoal);
    	registerModel(Models.blockGlowstone);
    	registerModel(Models.blockAdamantium);
    	registerModel(Models.blockGemSilk);
    	registerModel(Models.blockGemRedstone);
    	
    	addModel(Models.quartzFurnaceIdle));
    	addModel(Models.obsidianFurnaceIdle));
    	addModel(emeraldFurnaceIdle, createModel(BlockNames.emeraldFurnaceIdle));
    	addModel(lapisFurnaceIdle, createModel(BlockNames.lapisFurnaceIdle));
    	addModel(bronzeFurnaceIdle, createModel(BlockNames.bronzeFurnaceIdle));
    	addModel(coalFurnaceIdle, createModel(BlockNames.coalFurnaceIdle));
    	addModel(glowstoneFurnaceIdle, createModel(BlockNames.glowstoneFurnaceIdle));
    	addModel(adamantiumFurnaceIdle, createModel(BlockNames.adamantiumFurnaceIdle));
    	addModel(silkFurnaceIdle, createModel(BlockNames.silkFurnaceIdle));
    	addModel(redstoneFurnaceIdle, createModel(BlockNames.redstoneFurnaceIdle));
    	addModel(maceratorIdle, createModel(BlockNames.maceratorIdle));
    	
    	addModel(quartzFurnaceActive, createModel(BlockNames.quartzFurnaceActive));
    	addModel(obsidianFurnaceActive, createModel(BlockNames.obsidianFurnaceActive));
    	addModel(emeraldFurnaceActive, createModel(BlockNames.emeraldFurnaceActive));
    	addModel(lapisFurnaceActive, createModel(BlockNames.lapisFurnaceActive));
    	addModel(bronzeFurnaceActive, createModel(BlockNames.bronzeFurnaceActive));
    	addModel(coalFurnaceActive, createModel(BlockNames.coalFurnaceActive));
    	addModel(glowstoneFurnaceActive, createModel(BlockNames.glowstoneFurnaceActive));
    	addModel(adamantiumFurnaceActive, createModel(BlockNames.adamantiumFurnaceActive));
    	addModel(silkFurnaceActive, createModel(BlockNames.silkFurnaceActive));
    	addModel(redstoneFurnaceActive, createModel(BlockNames.redstoneFurnaceActive));
    	addModel(maceratorActive, createModel(BlockNames.maceratorActive));
    	
    	for(WoodTypes type : WoodTypes.values()){
    		addModel(logFT, type.getMeta(),  createModel("log" + type.getName()));
    		addModel(plankFT, type.getMeta(), createModel("plank" + type.getName()));
    		addModel(leavesFT, type.getMeta(), createModel("leaves" + type.getName()));
    		addModel(saplingFT, type.getMeta(), createModel("sapling" + type.getName()));
    	}
    	
    	addModel(stairObsidian, createModel(BlockNames.stairObsidian));
    	addModel(stairEmerald, createModel(BlockNames.stairEmerald));
    	addModel(stairLapis, createModel(BlockNames.stairLapis));
    	addModel(stairBronze, createModel(BlockNames.stairBronze));
    	addModel(stairCoal, createModel(BlockNames.stairCoal));
    	addModel(stairGlowstone, createModel(BlockNames.stairGlowstone));
    	addModel(stairAdamantium, createModel(BlockNames.stairAdamantium));
    	addModel(stairSilk, createModel(BlockNames.stairSilk));
    	addModel(stairRedstone, createModel(BlockNames.stairRedstone));
    	
    	for (WoodTypes type : WoodTypes.values()) {
			addModel(singleSlabFT, type.getMeta(), createModel("slab" + type.getName() + "Single"));
			addModel(doubleSlabFT, type.getMeta(), createModel("slab" + type.getName() + "Double"));
		}
    	
    	addModel(obsidianWorkbench, createModel(BlockNames.obsidianWorkbench));
    	addModel(emeraldWorkbench, createModel(BlockNames.emeraldWorkbench));
    	addModel(lapisWorkbench, createModel(BlockNames.lapisWorkbench));
    	addModel(bronzeWorkbench, createModel(BlockNames.bronzeWorkbench));
    	addModel(coalWorkbench, createModel(BlockNames.coalWorkbench));
    	addModel(glowstoneWorkbench, createModel(BlockNames.glowstoneWorkbench));
    	addModel(adamantiumWorkbench, createModel(BlockNames.adamantiumWorkbench));
    	addModel(silkWorkbench, createModel(BlockNames.silkWorkbench));
    	addModel(redstoneWorkbench, createModel(BlockNames.redstoneWorkbench));
    }
    
    private void addVariants(){
    	addVariant(oreExperience, createModel(BlockNames.oreExperience));
    	addVariant(oreObsidian, createModel(BlockNames.oreObsidian));
    	addVariant(oreGemEmerald, createModel(BlockNames.oreGemEmerald));
    	addVariant(oreGemLapis, createModel(BlockNames.oreGemLapis));
    	addVariant(oreBronze, createModel(BlockNames.oreBronze));
    	addVariant(oreAdamantium, createModel(BlockNames.oreAdamantium));
    	addVariant(oreGemRedstone, createModel(BlockNames.oreGemRedstone));
    	
    	addVariant(storageFT, createModel(BlockNames.blockExperience));
    	addVariant(storageFT, createModel(BlockNames.blockExpCollector));
    	addVariant(storageFT, createModel(BlockNames.blockObsidian));
    	addVariant(storageFT, createModel(BlockNames.blockGemEmerald));
    	addVariant(storageFT, createModel(BlockNames.blockGemLapis));
    	addVariant(storageFT, createModel(BlockNames.blockBronze));
    	addVariant(storageFT, createModel(BlockNames.blockCoal));
    	addVariant(storageFT, createModel(BlockNames.blockGlowstone));
    	addVariant(storageFT, createModel(BlockNames.blockAdamantium));
    	addVariant(storageFT, createModel(BlockNames.blockGemSilk));
    	addVariant(storageFT, createModel(BlockNames.blockGemRedstone));
    	
    	addVariant(quartzFurnaceIdle, createModel(BlockNames.quartzFurnaceIdle));
    	addVariant(obsidianFurnaceIdle, createModel(BlockNames.obsidianFurnaceIdle));
    	addVariant(emeraldFurnaceIdle, createModel(BlockNames.emeraldFurnaceIdle));
    	addVariant(lapisFurnaceIdle, createModel(BlockNames.lapisFurnaceIdle));
    	addVariant(bronzeFurnaceIdle, createModel(BlockNames.bronzeFurnaceIdle));
    	addVariant(coalFurnaceIdle, createModel(BlockNames.coalFurnaceIdle));
    	addVariant(glowstoneFurnaceIdle, createModel(BlockNames.glowstoneFurnaceIdle));
    	addVariant(adamantiumFurnaceIdle, createModel(BlockNames.adamantiumFurnaceIdle));
    	addVariant(silkFurnaceIdle, createModel(BlockNames.silkFurnaceIdle));
    	addVariant(redstoneFurnaceIdle, createModel(BlockNames.redstoneFurnaceIdle));
    	addVariant(maceratorIdle, createModel(BlockNames.maceratorIdle));
    	
    	addVariant(quartzFurnaceActive, createModel(BlockNames.quartzFurnaceActive));
    	addVariant(obsidianFurnaceActive, createModel(BlockNames.obsidianFurnaceActive));
    	addVariant(emeraldFurnaceActive, createModel(BlockNames.emeraldFurnaceActive));
    	addVariant(lapisFurnaceActive, createModel(BlockNames.lapisFurnaceActive));
    	addVariant(bronzeFurnaceActive, createModel(BlockNames.bronzeFurnaceActive));
    	addVariant(coalFurnaceActive, createModel(BlockNames.coalFurnaceActive));
    	addVariant(glowstoneFurnaceActive, createModel(BlockNames.glowstoneFurnaceActive));
    	addVariant(adamantiumFurnaceActive, createModel(BlockNames.adamantiumFurnaceActive));
    	addVariant(silkFurnaceActive, createModel(BlockNames.silkFurnaceActive));
    	addVariant(redstoneFurnaceActive, createModel(BlockNames.redstoneFurnaceActive));
    	addVariant(maceratorActive, createModel(BlockNames.maceratorActive));
    	
    	for(WoodTypes type : WoodTypes.values()){
    		addVariant(logFT,  createModel("log" + type.getName()));
    		addVariant(plankFT, createModel("plank" + type.getName()));
    		addVariant(leavesFT, createModel("leaves" + type.getName()));
    		addVariant(saplingFT, createModel("sapling" + type.getName()));
    	}
    	
    	addVariant(stairObsidian, createModel(BlockNames.stairObsidian));
    	addVariant(stairEmerald, createModel(BlockNames.stairEmerald));
    	addVariant(stairLapis, createModel(BlockNames.stairLapis));
    	addVariant(stairBronze, createModel(BlockNames.stairBronze));
    	addVariant(stairCoal, createModel(BlockNames.stairCoal));
    	addVariant(stairGlowstone, createModel(BlockNames.stairGlowstone));
    	addVariant(stairAdamantium, createModel(BlockNames.stairAdamantium));
    	addVariant(stairSilk, createModel(BlockNames.stairSilk));
    	addVariant(stairRedstone, createModel(BlockNames.stairRedstone));
    	
    	for (WoodTypes type : WoodTypes.values()) {
			addVariant(singleSlabFT, createModel("slab" + type.getName() + "Single"));
			addVariant(doubleSlabFT, createModel("slab" + type.getName() + "Double"));
		}
    	
    	addVariant(obsidianWorkbench, createModel(BlockNames.obsidianWorkbench));
    	addVariant(emeraldWorkbench, createModel(BlockNames.emeraldWorkbench));
    	addVariant(lapisWorkbench, createModel(BlockNames.lapisWorkbench));
    	addVariant(bronzeWorkbench, createModel(BlockNames.bronzeWorkbench));
    	addVariant(coalWorkbench, createModel(BlockNames.coalWorkbench));
    	addVariant(glowstoneWorkbench, createModel(BlockNames.glowstoneWorkbench));
    	addVariant(adamantiumWorkbench, createModel(BlockNames.adamantiumWorkbench));
    	addVariant(silkWorkbench, createModel(BlockNames.silkWorkbench));
    	addVariant(redstoneWorkbench, createModel(BlockNames.redstoneWorkbench));
    }
    
    public static void registerModel(ModelEntry entry){
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(entry.item, entry.meta, new ModelResourceLocation(entry.name, "inventory"));
    }
}

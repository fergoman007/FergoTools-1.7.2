package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.api.content.*;
import io.github.fergoman123.fergotools.block.*;
import io.github.fergoman123.fergotools.block.BlockPlankFT.*;
import io.github.fergoman123.fergotools.common.blocks.wood.*;
import io.github.fergoman123.fergotools.common.blocks.wood.BlockWoodLogFT;
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
    	registerModel(Item.getItemFromBlock(oreExperience), 0, BlockNames.oreExperience);
    	addVariant(Item.getItemFromBlock(ModBlocks.oreExperience), BlockNames.oreExperience);
    	GameRegistry.registerBlock(oreObsidian, BlockNames.oreObsidian);
    	registerModel(Item.getItemFromBlock(oreObsidian), 0, BlockNames.oreObsidian);
    	addVariant(Item.getItemFromBlock(oreObsidian), BlockNames.oreObsidian);
    	GameRegistry.registerBlock(oreGemEmerald, BlockNames.oreGemEmerald);
    	registerModel(Item.getItemFromBlock(oreGemEmerald), 0, BlockNames.oreGemEmerald);
    	addVariant(Item.getItemFromBlock(oreGemEmerald), BlockNames.oreGemEmerald);
    	GameRegistry.registerBlock(oreGemLapis, BlockNames.oreGemLapis);
    	registerModel(Item.getItemFromBlock(oreGemLapis), 0, BlockNames.oreGemLapis);
    	addVariant(Item.getItemFromBlock(oreGemLapis), BlockNames.oreGemLapis);
    	GameRegistry.registerBlock(oreBronze, BlockNames.oreBronze);
    	registerModel(Item.getItemFromBlock(oreBronze), 0, BlockNames.oreBronze);
    	addVariant(Item.getItemFromBlock(oreBronze), BlockNames.oreBronze);
    	GameRegistry.registerBlock(oreAdamantium, BlockNames.oreAdamantium);
    	registerModel(Item.getItemFromBlock(oreAdamantium), 0, BlockNames.oreAdamantium);
    	addVariant(Item.getItemFromBlock(oreAdamantium), BlockNames.oreAdamantium);
    	GameRegistry.registerBlock(oreGemRedstone, BlockNames.oreGemRedstone);
    	registerModel(Item.getItemFromBlock(oreGemRedstone), 0, BlockNames.oreGemRedstone);
    	addVariant(Item.getItemFromBlock(oreGemRedstone), BlockNames.oreGemRedstone);
    	
    	GameRegistry.registerBlock(storageFT, BlockNames.storageFT);
    	for(StorageTypes type : StorageTypes.values()){
    		registerModel(Item.getItemFromBlock(storageFT), type.getMeta(), type.getName());
    		addVariant(Item.getItemFromBlock(storageFT), type.getName());
    	}
    	
    	Block[] idle = new Block[]{quartzFurnaceIdle,obsidianFurnaceIdle,emeraldFurnaceIdle,lapisFurnaceIdle,bronzeFurnaceIdle,coalFurnaceIdle,glowstoneFurnaceIdle,adamantiumFurnaceIdle,silkFurnaceIdle,redstoneFurnaceIdle,maceratorIdle};
    	
    	for (int i = 0; i < idle.length; i++) {
			GameRegistry.registerBlock(idle[i], BlockNames.furnaceIdle[i]);
			registerModel(Item.getItemFromBlock(idle[i]), 0, BlockNames.furnaceIdle[i]);
			addVariant(Item.getItemFromBlock(idle[i]), BlockNames.furnaceIdle[i]);
		}
    	
    	Block[] active = new Block[]{quartzFurnaceActive,obsidianFurnaceActive,emeraldFurnaceActive,lapisFurnaceActive,bronzeFurnaceActive,coalFurnaceActive,glowstoneFurnaceActive,adamantiumFurnaceActive,silkFurnaceActive,redstoneFurnaceActive,maceratorActive};
    	
    	for (int i = 0; i < active.length; i++) {
			GameRegistry.registerBlock(active[i], BlockNames.furnaceActive[i]);
			registerModel(Item.getItemFromBlock(active[i]), 0, BlockNames.furnaceActive[i]);
			addVariant(Item.getItemFromBlock(active[i]), BlockNames.furnaceActive[i]);
		}
    }
    
    private static void registerModel(Item item, int meta, String name){
    	RegisterHelper.registerModel(item, meta, "fergotools:" + name);
    }
    
    private static void addVariant(Item item, String name){
    	RegisterHelper.addVariant(item, "fergotools:" + name);
    }
}

package fergoman123.mods.fergotools.handler;

import cpw.mods.fml.common.IWorldGenerator;
import fergoman123.mods.fergotools.block.ModBlocks;
import fergoman123.mods.fergotools.gen.WorldGen.WorldGenEndMinable;
import fergoman123.mods.fergotools.gen.WorldGen.WorldGenNetherMinable;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class EventHandler implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId)
		{
		case -1:generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateEnd(World world, Random random, int x, int z) {
		for(int i = 0; i < 5; i++)
		{
		int xCoord = x + random.nextInt(16);
		int yCoord = 40 + random.nextInt(60);
		int zCoord = z + random.nextInt(16);
		new WorldGenEndMinable(ModBlocks.oreObsidian, 5).generate(world, random, xCoord, yCoord, zCoord);
		new WorldGenEndMinable(ModBlocks.oreEmeraldCrystal, 5).generate(world, random, xCoord, yCoord, zCoord);
		new WorldGenEndMinable(ModBlocks.oreLapisCrystal, 5).generate(world, random, xCoord, yCoord, zCoord);
		new WorldGenEndMinable(ModBlocks.oreBronze, 5).generate(world, random, xCoord, yCoord, zCoord);
		new WorldGenEndMinable(ModBlocks.oreAdamantium, 5).generate(world, random, xCoord, yCoord, zCoord);
		new WorldGenEndMinable(ModBlocks.oreExperience, 5).generate(world, random, xCoord, yCoord, zCoord);
		}
	}

	private void generateSurface(World world, Random random, int x, int z) 
	{
		for(int i = 0; i < 5; i++)
		{
		int xCoord = x + random.nextInt(16);
		int yCoord = 10 + random.nextInt(60);
		int zCoord = z + random.nextInt(16);
		
		new WorldGenMinable(ModBlocks.oreObsidian, 5).generate(world, random, xCoord, yCoord, zCoord);
		new WorldGenMinable(ModBlocks.oreEmeraldCrystal, 5).generate(world, random, xCoord, yCoord, zCoord);
		new WorldGenMinable(ModBlocks.oreLapisCrystal, 5).generate(world, random, xCoord, yCoord, zCoord);
		new WorldGenMinable(ModBlocks.oreBronze, 5).generate(world, random, xCoord, yCoord, zCoord);
		new WorldGenMinable(ModBlocks.oreAdamantium, 5).generate(world, random, xCoord, yCoord, zCoord);
		new WorldGenMinable(ModBlocks.oreExperience, 5).generate(world, random, xCoord, yCoord, zCoord);
		}
	}

	private void generateNether(World world, Random random, int x, int z) 
	{
		for(int i = 0; i < 5; i++)
		{
		int xCoord = x + random.nextInt(16);
		int yCoord = 10 + random.nextInt(60);
		int zCoord = z + random.nextInt(16);
		new WorldGenNetherMinable(ModBlocks.oreObsidian ,5).generate(world, random, xCoord, yCoord, zCoord);
		new WorldGenNetherMinable(ModBlocks.oreEmeraldCrystal, 5).generate(world, random, xCoord, yCoord, zCoord);
		new WorldGenNetherMinable(ModBlocks.oreLapisCrystal, 5).generate(world, random, xCoord, yCoord, zCoord);
		new WorldGenNetherMinable(ModBlocks.oreBronze, 5).generate(world, random, xCoord, yCoord, zCoord);
		new WorldGenNetherMinable(ModBlocks.oreAdamantium, 5).generate(world, random, xCoord, yCoord, zCoord);
		new WorldGenNetherMinable(ModBlocks.oreExperience, 5).generate(world, random, xCoord, yCoord, zCoord);
		}
	}

}

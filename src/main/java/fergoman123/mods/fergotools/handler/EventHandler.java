package fergoman123.mods.fergotools.handler;

import cpw.mods.fml.common.IWorldGenerator;
import fergoman123.mods.fergotools.block.ore.*;
import fergoman123.mods.fergoutil.helper.GenerationHelper;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

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
		    int yCoord = random.nextInt(256);
		    int zCoord = z + random.nextInt(16);

            GenerationHelper.addEndOreSpawn(BlockOreObsidian.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addEndOreSpawn(BlockOreEmeraldCrystal.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addEndOreSpawn(BlockOreLapisCrystal.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addEndOreSpawn(BlockOreBronze.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addEndOreSpawn(BlockOreAdamantium.instance, world, random, x, z, 16, 16, 1, 1, 11, 62);
            GenerationHelper.addEndOreSpawn(BlockOreExperience.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
		}
	}

	private void generateSurface(World world, Random random, int x, int z) 
	{
		for(int i = 0; i < 5; i++)
		{
		    int xCoord = x + random.nextInt(16);
		    int yCoord = random.nextInt(256);
		    int zCoord = z + random.nextInt(16);

            GenerationHelper.addOverWorldOreSpawn(BlockOreObsidian.instance, world, random, x, z, 16, 16, 5, 4, 10, 64);
            GenerationHelper.addOverWorldOreSpawn(BlockOreEmeraldCrystal.instance, world, random, x, z, 16, 16, 5, 4, 10, 64);
            GenerationHelper.addOverWorldOreSpawn(BlockOreLapisCrystal.instance, world, random, x, z, 16, 16, 5, 4, 10, 64);
            GenerationHelper.addOverWorldOreSpawn(BlockOreBronze.instance, world, random, x, z, 16, 16, 5, 4, 10, 64);
            GenerationHelper.addOverWorldOreSpawn(BlockOreAdamantium.instance, world, random, x, z, 16, 16, 1, 1, 10, 64);
            GenerationHelper.addOverWorldOreSpawn(BlockOreExperience.instance, world, random, x, z, 16, 16, 5, 4, 10, 64);
		}
	}

	private void generateNether(World world, Random random, int x, int z) 
	{
		for(int i = 0; i < 5; i++)
		{
		    int xCoord = x + random.nextInt(16);
		    int yCoord = random.nextInt(256);
		    int zCoord = z + random.nextInt(16);

            GenerationHelper.addNetherOreSpawn(BlockOreObsidian.instance, world, random, x, z, 16, 16, 5, 4, 10, 64);
            GenerationHelper.addNetherOreSpawn(BlockOreEmeraldCrystal.instance, world, random, x, z, 16, 16, 5, 4, 10, 64);
            GenerationHelper.addNetherOreSpawn(BlockOreLapisCrystal.instance, world, random, x, z, 16, 16, 5, 4, 10, 64);
            GenerationHelper.addNetherOreSpawn(BlockOreBronze.instance, world, random, x, z, 16, 16, 5, 4, 10, 64);
            GenerationHelper.addNetherOreSpawn(BlockOreAdamantium.instance, world, random, x, z, 16, 16, 1, 1, 10, 64);
            GenerationHelper.addNetherOreSpawn(BlockOreExperience.instance, world, random, x, z, 16, 16, 5, 4, 10, 64);
		}
	}



}

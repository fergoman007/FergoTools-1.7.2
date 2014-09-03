 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.fergotools.handler;

 import cpw.mods.fml.common.IWorldGenerator;
 import fergoman123.mods.fergotools.init.ModBlocks;
 import fergoman123.mods.fergoutil.helper.GenerationHelper;
 import net.minecraft.world.World;
 import net.minecraft.world.chunk.IChunkProvider;

 import java.util.Random;

public class WorldGenerationHandler implements IWorldGenerator
{

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

            GenerationHelper.addEndOreSpawn(ModBlocks.oreObsidian, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addEndOreSpawn(ModBlocks.oreEmeraldCrystal, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addEndOreSpawn(ModBlocks.oreLapisCrystal, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addEndOreSpawn(ModBlocks.oreBronze, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addEndOreSpawn(ModBlocks.oreAdamantium, world, random, x, z, 16, 16, 1, 1, 11, 62);
            GenerationHelper.addEndOreSpawn(ModBlocks.oreExperience, world, random, x, z, 16, 16, 5, 4, 11, 62);
		}
	}

	private void generateSurface(World world, Random random, int x, int z) 
	{
		for(int i = 0; i < 5; i++)
		{
		    int xCoord = x + random.nextInt(16);
		    int yCoord = random.nextInt(256);
		    int zCoord = z + random.nextInt(16);

            GenerationHelper.addOverWorldOreSpawn(ModBlocks.oreObsidian, world, random, x, z, 16, 16, 5, 4, 10, 64);
            GenerationHelper.addOverWorldOreSpawn(ModBlocks.oreEmeraldCrystal, world, random, x, z, 16, 16, 5, 4, 10, 64);
            GenerationHelper.addOverWorldOreSpawn(ModBlocks.oreLapisCrystal, world, random, x, z, 16, 16, 5, 4, 10, 64);
            GenerationHelper.addOverWorldOreSpawn(ModBlocks.oreBronze, world, random, x, z, 16, 16, 5, 4, 10, 64);
            GenerationHelper.addOverWorldOreSpawn(ModBlocks.oreAdamantium, world, random, x, z, 16, 16, 1, 1, 10, 64);
            GenerationHelper.addOverWorldOreSpawn(ModBlocks.oreExperience, world, random, x, z, 16, 16, 5, 4, 10, 64);
		}
	}

	private void generateNether(World world, Random random, int x, int z) 
	{
		for(int i = 0; i < 5; i++)
		{
		    int xCoord = x + random.nextInt(16);
		    int yCoord = random.nextInt(256);
		    int zCoord = z + random.nextInt(16);

            GenerationHelper.addNetherOreSpawn(ModBlocks.oreObsidian, world, random, x, z, 16, 16, 5, 4, 10, 64);
            GenerationHelper.addNetherOreSpawn(ModBlocks.oreEmeraldCrystal, world, random, x, z, 16, 16, 5, 4, 10, 64);
            GenerationHelper.addNetherOreSpawn(ModBlocks.oreLapisCrystal, world, random, x, z, 16, 16, 5, 4, 10, 64);
            GenerationHelper.addNetherOreSpawn(ModBlocks.oreBronze, world, random, x, z, 16, 16, 5, 4, 10, 64);
            GenerationHelper.addNetherOreSpawn(ModBlocks.oreAdamantium, world, random, x, z, 16, 16, 1, 1, 10, 64);
            GenerationHelper.addNetherOreSpawn(ModBlocks.oreExperience, world, random, x, z, 16, 16, 5, 4, 10, 64);
		}
	}



}

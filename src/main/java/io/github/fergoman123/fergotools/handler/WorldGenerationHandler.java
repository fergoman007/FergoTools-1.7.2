 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.handler;

 import cpw.mods.fml.common.IWorldGenerator;
 import io.github.fergoman123.fergotools.core.FTContent;
 import io.github.fergoman123.fergoutil.helper.GenerationHelper;
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

            GenerationHelper.addEndOreSpawn(FTContent.oreObsidian, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addEndOreSpawn(FTContent.oreGemEmerald, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addEndOreSpawn(FTContent.oreGemLapis, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addEndOreSpawn(FTContent.oreBronze, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addEndOreSpawn(FTContent.oreAdamantium, world, random, x, z, 16, 16, 1, 1, 11, 62);
            GenerationHelper.addEndOreSpawn(FTContent.oreExperience, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addEndOreSpawn(FTContent.oreRedstone, world, random, x, z, 16, 16, 5, 4, 11, 62);
		}
	}

	private void generateSurface(World world, Random random, int x, int z) 
	{
		for(int i = 0; i < 5; i++)
		{
		    int xCoord = x + random.nextInt(16);
		    int yCoord = random.nextInt(256);
		    int zCoord = z + random.nextInt(16);

            GenerationHelper.addOverWorldOreSpawn(FTContent.oreObsidian, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addOverWorldOreSpawn(FTContent.oreGemEmerald, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addOverWorldOreSpawn(FTContent.oreGemLapis, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addOverWorldOreSpawn(FTContent.oreBronze, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addOverWorldOreSpawn(FTContent.oreAdamantium, world, random, x, z, 16, 16, 1, 1, 11, 62);
            GenerationHelper.addOverWorldOreSpawn(FTContent.oreExperience, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addOverWorldOreSpawn(FTContent.oreRedstone, world, random, x, z, 16, 16, 5, 4, 11, 62);
		}
	}

	private void generateNether(World world, Random random, int x, int z) 
	{
		for(int i = 0; i < 5; i++)
		{
		    int xCoord = x + random.nextInt(16);
		    int yCoord = random.nextInt(256);
		    int zCoord = z + random.nextInt(16);

            GenerationHelper.addNetherOreSpawn(FTContent.oreObsidian, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addNetherOreSpawn(FTContent.oreGemEmerald, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addNetherOreSpawn(FTContent.oreGemLapis, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addNetherOreSpawn(FTContent.oreBronze, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addNetherOreSpawn(FTContent.oreAdamantium, world, random, x, z, 16, 16, 1, 1, 11, 62);
            GenerationHelper.addNetherOreSpawn(FTContent.oreExperience, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addNetherOreSpawn(FTContent.oreRedstone, world, random, x, z, 16, 16, 5, 4, 11, 62);
		}
	}



}

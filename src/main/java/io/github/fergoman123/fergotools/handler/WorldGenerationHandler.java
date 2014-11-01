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
 import io.github.fergoman123.fergoutil.helper.GenerationHelper;
 import net.minecraft.world.World;
 import net.minecraft.world.chunk.IChunkProvider;
 import io.github.fergoman123.fergotools.init.FTBlocks.*;

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

            GenerationHelper.addEndOreSpawn(BlockOreObsidian.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addEndOreSpawn(BlockOreEmeraldCrystal.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addEndOreSpawn(BlockOreLapisCrystal.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addEndOreSpawn(BlockOreBronze.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addEndOreSpawn(BlockOreAdamantium.instance, world, random, x, z, 16, 16, 1, 1, 11, 62);
            GenerationHelper.addEndOreSpawn(BlockOreExperience.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addEndOreSpawn(BlockOreRedCrystal.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
		}
	}

	private void generateSurface(World world, Random random, int x, int z) 
	{
		for(int i = 0; i < 5; i++)
		{
		    int xCoord = x + random.nextInt(16);
		    int yCoord = random.nextInt(256);
		    int zCoord = z + random.nextInt(16);

            GenerationHelper.addOverWorldOreSpawn(BlockOreObsidian.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addOverWorldOreSpawn(BlockOreEmeraldCrystal.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addOverWorldOreSpawn(BlockOreLapisCrystal.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addOverWorldOreSpawn(BlockOreBronze.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addOverWorldOreSpawn(BlockOreAdamantium.instance, world, random, x, z, 16, 16, 1, 1, 11, 62);
            GenerationHelper.addOverWorldOreSpawn(BlockOreExperience.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addOverWorldOreSpawn(BlockOreRedCrystal.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
		}
	}

	private void generateNether(World world, Random random, int x, int z) 
	{
		for(int i = 0; i < 5; i++)
		{
		    int xCoord = x + random.nextInt(16);
		    int yCoord = random.nextInt(256);
		    int zCoord = z + random.nextInt(16);

            GenerationHelper.addNetherOreSpawn(BlockOreObsidian.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addNetherOreSpawn(BlockOreEmeraldCrystal.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addNetherOreSpawn(BlockOreLapisCrystal.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addNetherOreSpawn(BlockOreBronze.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addNetherOreSpawn(BlockOreAdamantium.instance, world, random, x, z, 16, 16, 1, 1, 11, 62);
            GenerationHelper.addNetherOreSpawn(BlockOreExperience.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
            GenerationHelper.addNetherOreSpawn(BlockOreRedCrystal.instance, world, random, x, z, 16, 16, 5, 4, 11, 62);
		}
	}



}

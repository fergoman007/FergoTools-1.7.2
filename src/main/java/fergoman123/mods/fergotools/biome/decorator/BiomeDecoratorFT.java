package fergoman123.mods.fergotools.biome.decorator;

import fergoman123.mods.fergotools.config.DimConfiguration;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenLiquids;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

import java.util.Random;

public class BiomeDecoratorFT extends BiomeDecorator {

    public void genDecoration(BiomeGenBase base) {
        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z));

        generateOres();

        if (DimConfiguration.generateLakes) {
            for (int j = 0; j < 50; j++) {
                int k = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
                int l = this.randomGenerator.nextInt(this.randomGenerator.nextInt(240) + 8);
                int i1 = this.chunk_Z = this.randomGenerator.nextInt(16) + 8;
                new WorldGenLiquids(Blocks.flowing_water).generate(this.currentWorld, this.randomGenerator, k, l, i1);
            }

            for (int j = 0; j < 20; j++) {
                int k = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
                int l = this.randomGenerator.nextInt(this.randomGenerator.nextInt(this.randomGenerator.nextInt(240) + 8) + 8);

                int i1 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
                new WorldGenLiquids(Blocks.flowing_lava).generate(this.currentWorld, this.randomGenerator, k, l, i1);
            }
        }

        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z));
    }

    public void generateOres() {
        for (int i = 0; i < DimConfiguration.oreDensity; i++) {
            Random randomGenerator = new Random(this.currentWorld.getSeed() + i);
            MinecraftForge.ORE_GEN_BUS.post(new OreGenEvent.Pre(this.currentWorld, randomGenerator, this.chunk_X, this.chunk_Z));

            if (TerrainGen.generateOre(this.currentWorld, randomGenerator, this.coalGen, this.chunk_X, this.chunk_Z, OreGenEvent.GenerateMinable.EventType.COAL)) {
                genStandardOre1(20, this.coalGen, 0, 128);
            }
            if (TerrainGen.generateOre(this.currentWorld, randomGenerator, this.ironGen, this.chunk_X, this.chunk_Z, OreGenEvent.GenerateMinable.EventType.IRON)) {
                genStandardOre1(20, this.ironGen, 0, 64);
            }
            if (TerrainGen.generateOre(this.currentWorld, randomGenerator, this.goldGen, this.chunk_X, this.chunk_Z, OreGenEvent.GenerateMinable.EventType.GOLD)) {
                genStandardOre1(2, this.goldGen, 0, 32);
            }
            if (TerrainGen.generateOre(this.currentWorld, randomGenerator, this.redstoneGen, this.chunk_X, this.chunk_Z, OreGenEvent.GenerateMinable.EventType.REDSTONE)) {
                genStandardOre1(8, this.redstoneGen, 0, 16);
            }
            if (TerrainGen.generateOre(this.currentWorld, randomGenerator, this.diamondGen, this.chunk_X, this.chunk_Z, OreGenEvent.GenerateMinable.EventType.DIAMOND)) {
                genStandardOre1(1, this.diamondGen, 0, 16);
            }
            if (TerrainGen.generateOre(this.currentWorld, randomGenerator, this.lapisGen, this.chunk_X, this.chunk_Z, OreGenEvent.GenerateMinable.EventType.LAPIS)) {
                genStandardOre2(1, this.lapisGen, 16, 16);
            }
            MinecraftForge.ORE_GEN_BUS.post(new OreGenEvent.Post(this.currentWorld, randomGenerator, this.chunk_X, this.chunk_Z));
        }

        if (TerrainGen.generateOre(this.currentWorld, this.randomGenerator, this.dirtGen, this.chunk_X, this.chunk_Z, OreGenEvent.GenerateMinable.EventType.DIRT)) {
            genStandardOre1(20, this.dirtGen, 0, 256);
        }
        if (TerrainGen.generateOre(this.currentWorld, this.randomGenerator, this.gravelGen, this.chunk_X, this.chunk_Z, OreGenEvent.GenerateMinable.EventType.GRAVEL)) {
            genStandardOre1(10, this.gravelGen, 0, 256);
        }
    }
}


package fergoman123.mods.fergotools.util.base;

import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.structure.MapGenMineshaft;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraft.world.gen.structure.MapGenStronghold;
import net.minecraft.world.gen.structure.MapGenVillage;

import java.util.List;
import java.util.Random;

public abstract class ChunkProviderFT implements IChunkProvider {

    public Random rand;

    public NoiseGeneratorOctaves noiseGen1;
    public NoiseGeneratorOctaves noiseGen2;
    public NoiseGeneratorOctaves noiseGen3;
    public NoiseGeneratorPerlin noiseGen4;
    public NoiseGeneratorOctaves noiseGen5;
    public NoiseGeneratorOctaves noiseGen6;
    public NoiseGeneratorOctaves mobSpawnerNoise;

    public World world;
    public WorldType type;
    public final boolean mapFeaturesEnabled;
    public final double[] field_147434_q;
    public final float[] parabolicField;
    public double[] stoneNoise = new double[256];
    public MapGenBase caveGenerator = new MapGenCaves();

    public MapGenStronghold strongholdGenerator = new MapGenStronghold();

    public MapGenVillage villageGenerator = new MapGenVillage();

    public MapGenMineshaft mineshaftGenerator = new MapGenMineshaft();
    public MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();

    public MapGenBase ravineGenerator = new MapGenRavine();

    public BiomeGenBase[] biomesForGeneration;
    double[] field_147427_d;
    double[] field_147428_e;
    double[] field_147425_f;
    double[] field_147426_g;
    int[][] field_73219_j = new int[32][32];

    public ChunkProviderFT(World world, long seed)
    {
        this.world = world;
        this.mapFeaturesEnabled = false;
        this.type = world.getWorldInfo().getTerrainType();
        this.rand = new Random(seed);
        this.noiseGen1 = new NoiseGeneratorOctaves(this.rand, 16);
        this.noiseGen2 = new NoiseGeneratorOctaves(this.rand, 16);
        this.noiseGen3 = new NoiseGeneratorOctaves(this.rand, 8);
        this.noiseGen4 = new NoiseGeneratorPerlin(this.rand, 4);
        this.noiseGen5 = new NoiseGeneratorOctaves(this.rand, 10);
        this.noiseGen6 = new NoiseGeneratorOctaves(this.rand, 16);
        this.mobSpawnerNoise = new NoiseGeneratorOctaves(this.rand, 8);
        this.field_147434_q = new double[825];
        this.parabolicField = new float[25];
    }

    public abstract void func_147424_a(int par1, int par2, Block[] par3);

    public abstract void replaceBlocksForBiome(int par1, int par2, Block[] par3, byte[] par4, BiomeGenBase[] par5);

    public abstract Chunk loadChunk(int par1, int par2);

    public abstract Chunk provideChunk(int par1, int par2);

    public abstract void func_147423_a(int par1, int par2, int par3);

    public abstract boolean chunkExists(int par1, int par2);

    public abstract void populate(IChunkProvider par1, int par2, int par3);

    public abstract boolean saveChunks(boolean par1, IProgressUpdate par2);

    public abstract void saveExtraData();

    public abstract boolean unloadQueuedChunks();

    public abstract boolean canSave();

    public abstract String makeString();

    public abstract List getPossibleCreatures(EnumCreatureType par1, int par2, int par3, int par4);

    public abstract ChunkPosition func_147416_a(World par1, String par2, int par3, int par4, int par5);

    public abstract int getLoadedChunkContent();

    public abstract void recreateStructures(int par1, int par2);
}

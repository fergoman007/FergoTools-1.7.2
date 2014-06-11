package fergoman123.mods.fergotools.world.chunk.manager;

import net.minecraft.world.ChunkPosition;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WorldChunkManagerFT extends WorldChunkManager{

    private BiomeGenBase biomeGenerator;
    private float rainfall;

    public WorldChunkManagerFT(BiomeGenBase base, float rainfall)
    {
        this.biomeGenerator = base;
        this.rainfall = rainfall;
    }

    public BiomeGenBase getBiomeGenAt(int par1, int par2){return this.biomeGenerator;}

    public BiomeGenBase[] getBiomesForGeneration(BiomeGenBase[] biomeArray, int par2, int par3, int par4, int par5)
    {
        if (biomeArray == null || biomeArray.length < par4 * par5)
        {
            biomeArray = new BiomeGenBase[par4 * par5];
        }
        Arrays.fill(biomeArray, 0, par4 * par5, this.biomeGenerator);
        return biomeArray;
    }

    public float[] getRainfall(float[] floatArray, int par2, int par3, int par4, int par5)
    {
        if (floatArray == null || floatArray.length < par4 * par5)
        {
            floatArray = new float[par4 * par5];
        }

        Arrays.fill(floatArray, 0, par4 * par5, this.rainfall);
        return floatArray;
    }

    public BiomeGenBase[] loadBlockGeneratorData(BiomeGenBase[] biomeArray, int par2, int par3, int par4, int par5)
    {
        if (biomeArray == null || biomeArray.length < par4 * par5)
        {
            biomeArray = new BiomeGenBase[par4 * par5];
        }

        Arrays.fill(biomeArray, 0, par4 * par5, this.biomeGenerator);
        return biomeArray;
    }

    public BiomeGenBase[] getBiomeGenAt(BiomeGenBase[] par1ArrayOfBiomeGenBase, int par2, int par3, int par4, int par5, boolean par6)
    {
        return this.loadBlockGeneratorData(par1ArrayOfBiomeGenBase, par2, par3, par4, par5);
    }

    public ChunkPosition findBiomePosition(int x, int y, int z, List list, Random rand)
    {
        return list.contains(this.biomeGenerator) ? new ChunkPosition(x - z + rand.nextInt(z * 2 + 1), 0, y - z + rand.nextInt(z * 2 + 1)) : null;
    }

    public boolean areBiomesViable(int x, int y, int z, List list)
    {
        return list.contains(this.biomeGenerator);
    }
}

package fergoman123.mods.fergotools.biome;

import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.world.biome.BiomeGenBase;

/**
 * Created by Fergoman123 on 04/04/2014.
 */
public class Biomes {

    public static BiomeGenBase genBaseFergoTools;

    public static void addBiomes()
    {

    }

    public static class BiomeGenFergoTools extends BiomeGenBase
    {

        public BiomeGenFergoTools() {
            super(40);
            this.setTemperatureRainfall(0.8f, 0.4f);
            this.setHeight(height_LowPlains);
            this.spawnableCaveCreatureList.add(new SpawnListEntry(EntityHorse.class, 5, 2, 6));
            this.theBiomeDecorator.treesPerChunk = -999;
        }
    }
}

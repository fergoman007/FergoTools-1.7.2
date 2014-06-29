package fergoman123.mods.fergotools.util.base;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;

import java.util.List;
import java.util.Random;

public abstract class BiomeGenFT extends BiomeGenBase
{
    public int color = 2900485;
    public String biomeName;
    public float rainfall1 = 0.8F, rainfall2 = 0.0F;
    public Height height = new Height(0.0F, 0.0F);
    public int treesPerChunk;
    public int flowersPerChunk;
    public int bigMushroomsPerChunk;
    public int clayPerChunk;
    public int deadBushPerChunk;
    public int mushroomsPerChunk;
    public int reedsPerChunk;
    public int sandPerChunk;
    public int sandPerChunk2;
    public int waterlilyPerChunk;
    public boolean generateLakes = false;

    public BiomeGenFT(int biomeId, String biomeName)
    {
        super(biomeId);
        this.setColor(color);
        this.setBiomeName(biomeName);
        this.setDisableRain();
        this.setTemperatureRainfall(rainfall1, rainfall2);
        this.setHeight(height);
        this.theBiomeDecorator.treesPerChunk = treesPerChunk;
        this.theBiomeDecorator.flowersPerChunk = flowersPerChunk;
        this.theBiomeDecorator.bigMushroomsPerChunk = bigMushroomsPerChunk;
        this.theBiomeDecorator.clayPerChunk = clayPerChunk;
        this.theBiomeDecorator.deadBushPerChunk = deadBushPerChunk;
        this.theBiomeDecorator.mushroomsPerChunk = mushroomsPerChunk;
        this.theBiomeDecorator.reedsPerChunk = reedsPerChunk;
        this.theBiomeDecorator.sandPerChunk = sandPerChunk;
        this.theBiomeDecorator.sandPerChunk2 = sandPerChunk2;
        this.theBiomeDecorator.treesPerChunk = treesPerChunk;
        this.theBiomeDecorator.waterlilyPerChunk = waterlilyPerChunk;
        this.theBiomeDecorator.generateLakes = generateLakes;
    }

    public abstract void decorate(World par1, Random par2, int par3, int par4);

    public abstract float getSpawningChance();

    public abstract List getSpawnableList(EnumCreatureType par1);

    public abstract BiomeDecorator createBiomeDecorator();
}

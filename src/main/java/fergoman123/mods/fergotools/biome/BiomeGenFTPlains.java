package fergoman123.mods.fergotools.biome;

import fergoman123.mods.fergotools.biome.decorator.BiomeDecoratorFT;
import fergoman123.mods.fergotools.config.DimConfiguration;
import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BiomeGenFTPlains extends BiomeGenBase {

    protected boolean field_150628_aC;
    private static final String __OBFID = "CL_00000180";

    public Height height = new Height(0.0F, 0.0F);
    public float rainfall = 0.0F;

    public BiomeGenFTPlains(int par1)
    {
        super(par1);
        this.setColor(2900485);
        this.setBiomeName("Fergoman123's Dense Plains");
        this.setDisableRain();
        this.setTemperatureRainfall(rainfall, rainfall);
        this.setHeight(height);
        this.topBlock = Blocks.grass;
        this.fillerBlock = Blocks.stone;
        this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.flowersPerChunk = -999;
        this.theBiomeDecorator.bigMushroomsPerChunk = -999;
        this.theBiomeDecorator.clayPerChunk = -999;
        this.theBiomeDecorator.deadBushPerChunk = -999;
        this.theBiomeDecorator.mushroomsPerChunk = -999;
        this.theBiomeDecorator.reedsPerChunk = -999;
        this.theBiomeDecorator.sandPerChunk = -999;
        this.theBiomeDecorator.sandPerChunk2 = -999;
        this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.waterlilyPerChunk = -999;
        this.theBiomeDecorator.generateLakes = DimConfiguration.generateLakes;
    }

    public void decorate(World world, Random rand, int par3, int par4)
    {
        super.decorate(world, rand, par3, par4);
        int var5 = rand.nextInt(2);

        for (int var6 = 0; var6 < var5; var6++)
        {
            int var7 = par3 + rand.nextInt(16);
            int var8 = rand.nextInt(28) + 4;
            int var9 = par4 + rand.nextInt(16);
                Block var10 = world.getBlock(var7, var8, var9);

            if (var10 == Blocks.stone)
            {
                world.setBlock(var7, var8, var9, Blocks.emerald_ore, 0, 2);
            }
        }
    }

    public void clearMonsters()
    {
        if (!DimConfiguration.spawnMonsters)
        {
            this.spawnableMonsterList.clear();
            this.spawnableCaveCreatureList.clear();
        }

        if (!DimConfiguration.spawnAnimals)
        {
            this.spawnableCreatureList.clear();
            this.spawnableWaterCreatureList.clear();
        }
    }

    public float getSpawningChance()
    {
        if ((!DimConfiguration.spawnAnimals) && (!DimConfiguration.spawnMonsters))
        {
            return 0.0F;
        }

        return super.getSpawningChance();
    }

    public List getSpawnableList(EnumCreatureType creatureType)
    {
        if ((!DimConfiguration.spawnAnimals) && (!DimConfiguration.spawnMonsters))
        {
            return new ArrayList();
        }

        return super.getSpawnableList(creatureType);
    }

    public BiomeDecorator createBiomeDecorator(){return new BiomeDecoratorFT();}
}

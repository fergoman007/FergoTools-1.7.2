package fergoman123.mods.fergotools.util.base;

import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;

public abstract class BiomeDecoratorFT extends BiomeDecorator
{
    public abstract void genDecorations(BiomeGenBase biomeGenBase);

    public abstract void generateOres();
}

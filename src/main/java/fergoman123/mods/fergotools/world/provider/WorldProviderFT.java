package fergoman123.mods.fergotools.world.provider;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.handler.WorldHandler;
import fergoman123.mods.fergotools.world.chunk.provider.ChunkProviderFT;
import fergoman123.mods.fergotools.world.chunk.manager.WorldChunkManagerFT;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderFT extends WorldProvider{

    @Override
    public void registerWorldChunkManager() {
        this.worldChunkMgr = new WorldChunkManagerFT(WorldHandler.ftDensePlains, 0.0F);
        this.isHellWorld = false;
        this.hasNoSky = false;
        this.dimensionId = WorldHandler.dimId;
    }

    public Vec3 getFogColor(float par1, float par2)
    {
        return this.worldObj.getWorldVec3Pool().getVecFromPool(1.0D, 1.0D, 1.0D);
    }

    public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderFT(this.worldObj, this.worldObj.getSeed()-10945);
    }

    public boolean isSurfaceWorld(){return true;}

    public boolean canCoordinateBeSpawn(int par1, int par2){return true;}

    public boolean canRespawnHere(){return true;}

    @SideOnly(Side.CLIENT)
    public boolean doesXZShowFog(int par1, int par2){return false;}

    public String getDimensionName(){return "FergoTools Dense Plains";}
}

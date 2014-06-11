package fergoman123.mods.fergotools.world.position;

import net.minecraft.util.ChunkCoordinates;

public class PortalPositionFT extends ChunkCoordinates{

    public long lastUpdateTime;

    public PortalPositionFT(int par2, int par3, int par4, long par5)
    {
        super(par2, par3, par4);
        this.lastUpdateTime = par5;
    }
}

package fergoman123.mods.fergotools.util.base;

import net.minecraft.entity.Entity;
import net.minecraft.util.LongHashMap;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@SuppressWarnings("unchecked")
public abstract class TeleporterFT extends Teleporter
{
    public final WorldServer worldServer;
    public final Random rand;
    public final LongHashMap field_85191_c = new LongHashMap();

    public final List<Long> field_85190_d = new ArrayList();

    public TeleporterFT(WorldServer worldServer)
    {
        super(worldServer);
        this.worldServer = worldServer;
        this.rand = new Random(worldServer.getSeed());
    }

    public abstract void func_85189_a(long par1);

    public abstract boolean makePortal(Entity entity);

    public abstract boolean placeInExistingPortal(Entity entity, double par2, double par4, double par6, float par8);

    public abstract void placeInPortal(Entity entity, double par2, double par4, double par6, float par8);
}

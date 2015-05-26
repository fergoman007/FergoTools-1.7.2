package io.github.fergoman123.fergotools.helper;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.helper.GuiHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class FTHelper
{
    public static void openGui(EntityPlayer player, int ID, World world, BlockPos pos)
    {
        GuiHelper.openGui(player, FergoTools.getInstance(), ID, world, pos);
    }

    public static void logInfo(String message)
    {
        FergoTools.getLogger().info(message);
    }
}

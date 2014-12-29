package io.github.fergoman123.fergotools.util.base;

import net.minecraft.nbt.NBTTagCompound;

public interface ITileEntityFurnace
{
    void readFromNBT(NBTTagCompound compound);

    void writeToNBT(NBTTagCompound compound);
}

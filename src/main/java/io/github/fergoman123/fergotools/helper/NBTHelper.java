/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.helper;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class NBTHelper {

    private static void initNBTTagCompound(ItemStack stack)
    {
        if (stack.getTagCompound() == null)
        {
            stack.setTagCompound(new NBTTagCompound());
        }
    }

    public static boolean hasTag(ItemStack stack, String keyName)
    {
        return stack != null && stack.getTagCompound() != null && stack.getTagCompound().hasKey(keyName);
    }

    public static void removeTag(ItemStack stack, String keyName)
    {
        if (stack.getTagCompound() != null)
        {
            stack.getTagCompound().removeTag(keyName);
        }
    }

    public static String getString(ItemStack stack, String keyName)
    {
        initNBTTagCompound(stack);

        if (!stack.getTagCompound().hasKey(keyName))
        {
            setString(stack, keyName, "");
        }

        return stack.getTagCompound().getString(keyName);
    }

    public static void setString(ItemStack stack, String keyName, String keyValue)
    {
        initNBTTagCompound(stack);

        stack.getTagCompound().setString(keyName, keyValue);
    }

    public static boolean getBoolean(ItemStack stack, String keyName)
    {
        initNBTTagCompound(stack);

        if (!stack.getTagCompound().hasKey(keyName))
        {
            setBoolean(stack, keyName, false);
        }

        return stack.getTagCompound().getBoolean(keyName);
    }

    public static void setBoolean(ItemStack stack, String keyName, boolean keyValue)
    {
        initNBTTagCompound(stack);

        stack.getTagCompound().setBoolean(keyName, keyValue);
    }

    public static byte getByte(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if (!itemStack.getTagCompound().hasKey(keyName))
        {
            setByte(itemStack, keyName, (byte) 0);
        }

        return itemStack.getTagCompound().getByte(keyName);
    }

    public static void setByte(ItemStack itemStack, String keyName, byte keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.getTagCompound().setByte(keyName, keyValue);
    }

    public static short getShort(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if (!itemStack.getTagCompound().hasKey(keyName))
        {
            setShort(itemStack, keyName, (short) 0);
        }

        return itemStack.getTagCompound().getShort(keyName);
    }

    public static void setShort(ItemStack itemStack, String keyName, short keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.getTagCompound().setShort(keyName, keyValue);
    }

    public static int getInt(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if (!itemStack.getTagCompound().hasKey(keyName))
        {
            setInteger(itemStack, keyName, 0);
        }

        return itemStack.getTagCompound().getInteger(keyName);
    }

    public static void setInteger(ItemStack itemStack, String keyName, int keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.getTagCompound().setInteger(keyName, keyValue);
    }

    public static long getLong(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if (!itemStack.getTagCompound().hasKey(keyName))
        {
            setLong(itemStack, keyName, 0);
        }

        return itemStack.getTagCompound().getLong(keyName);
    }

    public static void setLong(ItemStack itemStack, String keyName, long keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.getTagCompound().setLong(keyName, keyValue);
    }

    public static float getFloat(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if (!itemStack.getTagCompound().hasKey(keyName))
        {
            setFloat(itemStack, keyName, 0);
        }

        return itemStack.getTagCompound().getFloat(keyName);
    }

    public static void setFloat(ItemStack itemStack, String keyName, float keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.getTagCompound().setFloat(keyName, keyValue);
    }

    public static double getDouble(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if (!itemStack.getTagCompound().hasKey(keyName))
        {
            setDouble(itemStack, keyName, 0);
        }

        return itemStack.getTagCompound().getDouble(keyName);
    }

    public static void setDouble(ItemStack itemStack, String keyName, double keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.getTagCompound().setDouble(keyName, keyValue);
    }

}

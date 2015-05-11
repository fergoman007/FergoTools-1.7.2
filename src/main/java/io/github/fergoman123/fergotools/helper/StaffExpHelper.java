package io.github.fergoman123.fergotools.helper;

public class StaffExpHelper
{
    public static final int[] levelMaxes = new int[]{50, 150, 300};

    public static int getMaxExp(int type)
    {
        return levelMaxes[type];
    }
}

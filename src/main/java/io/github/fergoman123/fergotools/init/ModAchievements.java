/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergotools.init;

import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class ModAchievements
{
    public static final Achievement macerated = (new Achievement("fergotools.achievement.macerated", "macerated", 0, 0, Items.iron_ingot, (Achievement)null)).setIndependent().registerAchievement();

    public static void init(){
        AchievementPage.registerAchievementPage(new AchievementPage("fergotools.achievements", macerated));
    }
}

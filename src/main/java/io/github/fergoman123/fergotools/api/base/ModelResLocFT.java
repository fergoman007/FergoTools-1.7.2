package io.github.fergoman123.fergotools.api.base;

import net.minecraft.client.resources.model.ModelResourceLocation;

public class ModelResLocFT extends ModelResourceLocation
{

    public ModelResLocFT(String name) {
        super("fergotools:" + name, "inventory");
    }
}

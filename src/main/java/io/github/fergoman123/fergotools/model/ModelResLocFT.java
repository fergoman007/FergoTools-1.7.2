package io.github.fergoman123.fergotools.model;

import net.minecraft.client.resources.model.ModelResourceLocation;

public class ModelResLocFT extends ModelResourceLocation{
    public ModelResLocFT(String model) {
        super("fergotools:" + model, "inventory");
    }
}

package io.github.fergoman123.fergotools.resloc;

import net.minecraft.client.resources.model.ModelResourceLocation;

public class ModelResLocFT extends ModelResourceLocation{
    public ModelResLocFT(String name) {
        super("fergotools:" + name, "inventory");
    }
}

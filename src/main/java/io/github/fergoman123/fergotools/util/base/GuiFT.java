package io.github.fergoman123.fergotools.util.base;

import io.github.fergoman123.fergoutil.client.gui.FergoGuiContainer;
import net.minecraft.inventory.Container;

public abstract class GuiFT extends FergoGuiContainer{

    /**
     * main constuctor
     * @param container the containe that the gui
     *                  is connected to.
     */
    public GuiFT(Container container) {
        super(container);
    }
}

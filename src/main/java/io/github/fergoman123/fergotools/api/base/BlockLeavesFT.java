package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.block.BlockLeavesFergo;

public abstract class BlockLeavesFT extends BlockLeavesFergo{
    public BlockLeavesFT(String name) {
        super(0, FergoTools.tabFergoTools, name);
    }
}

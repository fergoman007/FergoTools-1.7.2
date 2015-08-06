package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import net.minecraft.block.material.Material;

public abstract class BlockMultiFT extends BlockMultiFergo {

	public BlockMultiFT(Material material, String[] subNames, String name) {
		super(material, "ft", FergoTools.tabFergoTools, subNames, name);
	}

}

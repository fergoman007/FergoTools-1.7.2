package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.block.BlockFergo;
import net.minecraft.block.material.Material;

public class BlockFT extends BlockFergo{

	protected BlockFT(Material material, String name) {
		super(material, "ft", FergoTools.tabFergoTools, name);
	}

}

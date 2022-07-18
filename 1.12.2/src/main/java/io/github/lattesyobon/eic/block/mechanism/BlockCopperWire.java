package io.github.lattesyobon.eic.block.mechanism;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCopperWire extends Block {
    public BlockCopperWire() {
        super(Material.IRON);
        this.setRegistryName(EIC.MODID,"copper_wire");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("copper_wire");
    }
}

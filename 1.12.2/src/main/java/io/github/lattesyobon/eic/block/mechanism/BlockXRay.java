package io.github.lattesyobon.eic.block.mechanism;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockXRay extends Block {
    public BlockXRay() {
        super(Material.IRON);
        this.setRegistryName(EIC.MODID,"x_ray");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("x_ray");
    }
}

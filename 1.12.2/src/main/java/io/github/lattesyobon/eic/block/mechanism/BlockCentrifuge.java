package io.github.lattesyobon.eic.block.mechanism;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCentrifuge extends Block {
    public BlockCentrifuge() {
        super(Material.IRON);
        this.setRegistryName(EIC.MODID,"centrifuge");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("centrifuge");
    }
}

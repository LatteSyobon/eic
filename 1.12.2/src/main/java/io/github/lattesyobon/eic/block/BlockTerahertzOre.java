package io.github.lattesyobon.eic.block;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTerahertzOre extends Block {
    public BlockTerahertzOre() {
        super(Material.IRON);
        this.setRegistryName(EIC.MODID,"terahertz_ore");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("terahertz_ore");
    }
}

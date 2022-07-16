package io.github.lattesyobon.eic.block;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCopperOre extends Block {
    public BlockCopperOre() {
        super(Material.IRON);
        this.setRegistryName(EIC.MODID,"copper_ore");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("copper_ore");
    }
}

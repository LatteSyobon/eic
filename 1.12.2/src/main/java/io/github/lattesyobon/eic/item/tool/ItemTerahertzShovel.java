package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.ItemSpade;

public class ItemTerahertzShovel extends ItemSpade {
    public ItemTerahertzShovel() {
        super(ToolMaterial.DIAMOND);
        this.setRegistryName(EIC.MODID, "terahertz_shovel");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("terahertz_shovel");
    }
}

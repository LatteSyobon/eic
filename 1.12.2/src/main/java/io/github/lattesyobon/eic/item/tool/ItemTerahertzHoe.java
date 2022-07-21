package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.ItemHoe;

public class ItemTerahertzHoe extends ItemHoe {
    public ItemTerahertzHoe() {
        super(ToolMaterial.DIAMOND);
        this.setRegistryName(EIC.MODID, "terahertz_hoe");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("terahertz_hoe");
    }
}

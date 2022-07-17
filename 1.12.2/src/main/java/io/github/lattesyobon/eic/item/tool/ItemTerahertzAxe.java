package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.ItemAxe;

public class ItemTerahertzAxe extends ItemAxe {
    public ItemTerahertzAxe() {
        super(ToolMaterial.DIAMOND);
        this.setRegistryName(EIC.MODID, "terahertz_axe");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("terahertz_axe");
    }
}

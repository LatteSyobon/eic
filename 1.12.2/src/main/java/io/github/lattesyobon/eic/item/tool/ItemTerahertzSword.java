package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.ItemSword;

public class ItemTerahertzSword extends ItemSword {
    public ItemTerahertzSword() {
        super(ToolMaterial.DIAMOND);
        this.setRegistryName(EIC.MODID, "terahertz_sword");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("terahertz_sword");
    }
}

package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.ItemPickaxe;

public class ItemTerahertzPickaxe extends ItemPickaxe {
    public ItemTerahertzPickaxe() {
        super(ToolMaterial.DIAMOND);
        this.setRegistryName(EIC.MODID, "terahertz_pickaxe");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("terahertz_pickaxe");
    }
}

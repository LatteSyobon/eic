package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.Item;

public class ItemSiliconWafer extends Item {
    public ItemSiliconWafer() {
        super();
        this.setRegistryName(EIC.MODID, "silicon_wafer");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("silicon_wafer");
    }
}

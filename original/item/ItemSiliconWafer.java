package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.Item;

public class ItemSiliconWafer extends Item {
    public ItemSiliconWafer() {
        super(new Properties().group(EIC.EIC_TAB));
        this.setRegistryName("silicon_wafer");
    }
}

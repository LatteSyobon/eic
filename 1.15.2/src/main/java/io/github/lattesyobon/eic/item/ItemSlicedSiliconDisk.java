package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.Item;

public class ItemSlicedSiliconDisk extends Item {
    public ItemSlicedSiliconDisk() {
        super(new Properties().group(EIC.EIC_TAB));
        this.setRegistryName("sliced_silicon_disk");
    }
}

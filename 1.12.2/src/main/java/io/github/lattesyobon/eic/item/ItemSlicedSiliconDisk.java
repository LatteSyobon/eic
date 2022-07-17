package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.Item;

public class ItemSlicedSiliconDisk extends Item {
    public ItemSlicedSiliconDisk() {
        super();
        this.setRegistryName(EIC.MODID, "sliced_silicon_disk");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("sliced_silicon_disk");
    }
}

package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.Item;

public class ItemSilicon extends Item {
    public ItemSilicon() {
        super(new Properties().group(EIC.EIC_TAB));
        this.setRegistryName("silicon");
    }
}

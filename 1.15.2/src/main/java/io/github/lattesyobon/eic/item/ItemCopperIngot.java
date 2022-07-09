package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.Item;

public class ItemCopperIngot extends Item {
    public ItemCopperIngot() {
        super(new Properties().group(EIC.EIC_TAB));
        this.setRegistryName("copper_ingot");
    }
}

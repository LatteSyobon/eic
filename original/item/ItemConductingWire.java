package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.Item;

public class ItemConductingWire extends Item {
    public ItemConductingWire() {
        super(new Properties().group(EIC.EIC_TAB));
        this.setRegistryName("conducting_wire");
    }
}

package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.Item;

public class ItemStoneCuttingEdge extends Item {
    public ItemStoneCuttingEdge() {
        super(new Properties().group(EIC.EIC_TAB));
        this.setRegistryName("stone_cutting_edge");
    }
}

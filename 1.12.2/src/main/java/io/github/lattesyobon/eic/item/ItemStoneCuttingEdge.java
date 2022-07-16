package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.Item;

public class ItemStoneCuttingEdge extends Item {
    public ItemStoneCuttingEdge() {
        super();
        this.setRegistryName(EIC.MODID, "stone_cutting_edge");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("stone_cutting_edge");
    }
}

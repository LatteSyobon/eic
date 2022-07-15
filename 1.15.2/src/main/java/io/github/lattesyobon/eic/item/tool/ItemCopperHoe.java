package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;

public class ItemCopperHoe extends HoeItem {
    public ItemCopperHoe() {
        super(new ItemTierTerahertz(),-3.2F,new Properties().group(EIC.EIC_TAB));
        this.setRegistryName("copper_hoe");
    }
}

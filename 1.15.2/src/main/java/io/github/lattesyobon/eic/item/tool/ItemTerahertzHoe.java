package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;

public class ItemTerahertzHoe extends HoeItem {
    public ItemTerahertzHoe() {
        super(new ItemTierTerahertz(),7,new Properties().group(EIC.EIC_TAB));
        this.setRegistryName("terahertz_hoe");
    }
}

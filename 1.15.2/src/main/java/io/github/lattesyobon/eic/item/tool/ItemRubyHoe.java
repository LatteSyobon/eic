package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;

public class ItemRubyHoe extends HoeItem {
    public ItemRubyHoe() {
        super(new ItemTierRuby(),-3.2F,new Properties().group(EIC.EIC_TOOL_TAB));
        this.setRegistryName("ruby_hoe");
    }
}

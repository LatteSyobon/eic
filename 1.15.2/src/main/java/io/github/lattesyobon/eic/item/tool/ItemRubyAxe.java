package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;

public class ItemRubyAxe extends AxeItem {
    public ItemRubyAxe() {
        super(new ItemTierRuby(),7,-3.2F,new Properties().group(EIC.EIC_TOOL_TAB));
        this.setRegistryName("ruby_axe");
    }
}

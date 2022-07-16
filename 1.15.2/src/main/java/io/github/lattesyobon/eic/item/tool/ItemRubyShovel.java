package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ShovelItem;

public class ItemRubyShovel extends ShovelItem {
    public ItemRubyShovel() {
        super(new ItemTierRuby(),7,-3.2F,new Properties().group(EIC.EIC_TOOL_TAB));
        this.setRegistryName("ruby_shovel");
    }
}

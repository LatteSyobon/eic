package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class ItemRubySword extends SwordItem {
    public ItemRubySword() {
        super(new ItemTierRuby(),7,-3.2F,new Properties().group(EIC.EIC_TOOL_TAB));
        this.setRegistryName("ruby_sword");
    }
}

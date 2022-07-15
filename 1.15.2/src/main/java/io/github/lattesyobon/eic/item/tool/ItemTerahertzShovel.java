package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.ShovelItem;

public class ItemTerahertzShovel extends ShovelItem {
    public ItemTerahertzShovel() {
        super(new ItemTierTerahertz(),7,-3.2F,new Properties().group(EIC.EIC_TOOL_TAB));
        this.setRegistryName("terahertz_shovel");
    }
}

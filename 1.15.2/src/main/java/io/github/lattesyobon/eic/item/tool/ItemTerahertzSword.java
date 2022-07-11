package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class ItemTerahertzSword extends SwordItem {
    public ItemTerahertzSword() {
        super(new ItemTierTerahertz(),7,-3.2F,new Properties().group(EIC.EIC_TAB));
        this.setRegistryName("terahertz_sword");
    }
}

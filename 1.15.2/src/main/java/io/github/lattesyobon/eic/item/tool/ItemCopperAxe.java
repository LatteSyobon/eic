package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;

public class ItemCopperAxe extends AxeItem {
    public ItemCopperAxe() {
        super(new ItemTierTerahertz(),7,-3.2F,new Properties().group(EIC.EIC_TAB));
        this.setRegistryName("copper_axe");
    }
}

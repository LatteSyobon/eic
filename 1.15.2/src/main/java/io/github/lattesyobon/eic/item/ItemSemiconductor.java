package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import io.github.lattesyobon.eic.init.EICTab;
import net.minecraft.item.Item;

public class ItemSemiconductor extends Item {
    public ItemSemiconductor() {
        super(new Properties().group(EIC.EIC_TAB));
        this.setRegistryName("semi_conductor");
    }
}

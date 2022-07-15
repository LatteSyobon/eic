package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.Item;

public class ItemRuby extends Item {
    public ItemRuby() {
        super(new Properties().group(EIC.EIC_TAB));
        this.setRegistryName("ruby");
    }
}

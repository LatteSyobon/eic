package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.Item;

public class ItemStoneStick extends Item {
    public ItemStoneStick() {
        super(new Properties().group(EIC.EIC_TAB));
        this.setRegistryName("stone_stick");
    }
}

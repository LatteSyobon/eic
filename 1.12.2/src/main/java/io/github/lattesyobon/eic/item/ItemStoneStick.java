package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.Item;

public class ItemStoneStick extends Item {
    public ItemStoneStick() {
        super();
        this.setRegistryName(EIC.MODID, "stone_stick");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("stone_stick");
    }
}

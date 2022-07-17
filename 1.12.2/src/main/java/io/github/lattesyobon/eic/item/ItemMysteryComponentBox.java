package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import io.github.lattesyobon.eic.init.EICItems;

public class ItemMysteryComponentBox extends ItemBox {
    public ItemMysteryComponentBox() {
        super(EICItems.SEMI_CONDUCTOR);
        this.setRegistryName(EIC.MODID, "mystery_component_box");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("mystery_component_box");
    }
}

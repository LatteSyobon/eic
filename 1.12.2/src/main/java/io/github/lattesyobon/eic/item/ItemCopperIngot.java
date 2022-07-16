package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.Item;

public class ItemCopperIngot extends Item {
    public ItemCopperIngot() {
        super();
        this.setRegistryName(EIC.MODID, "copper_ingot");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("copper_ingot");
    }
}

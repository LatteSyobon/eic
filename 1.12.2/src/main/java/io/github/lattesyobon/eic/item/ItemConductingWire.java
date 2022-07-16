package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.Item;

public class ItemConductingWire extends Item {
    public ItemConductingWire() {
        super();
        this.setRegistryName(EIC.MODID, "conducting_wire");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("conducting_wire");
    }
}

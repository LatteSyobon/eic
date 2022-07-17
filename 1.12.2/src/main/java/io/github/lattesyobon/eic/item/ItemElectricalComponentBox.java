package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.Item;

public class ItemElectricalComponentBox extends Item {
    public ItemElectricalComponentBox() {
        super();
        this.setRegistryName(EIC.MODID, "electrical_component_box");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("electrical_component_box");
    }
}

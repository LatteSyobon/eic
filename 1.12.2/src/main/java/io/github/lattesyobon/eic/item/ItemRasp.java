package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.Item;

public class ItemRasp extends Item {
    public ItemRasp() {
        super();
        this.setRegistryName(EIC.MODID, "rasp");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("rasp");
    }
}

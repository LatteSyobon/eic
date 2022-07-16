package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.Item;

public class ItemSemiConductor extends Item {
    public ItemSemiConductor() {
        super();
        this.setRegistryName(EIC.MODID, "semi_conductor");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("semi_conductor");
    }
}

package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSilicon extends Item {
    public ItemSilicon() {
        super();
        this.setRegistryName(EIC.MODID, "silicon");
        this.setCreativeTab(CreativeTabs.MATERIALS);
        this.setUnlocalizedName("silicon");
    }
}

package io.github.lattesyobon.eic.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EICTab extends CreativeTabs {
    public EICTab() {
        super("eic");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(EICItems.SILICON);
    }
}

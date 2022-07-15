package io.github.lattesyobon.eic.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EICToolsTab extends ItemGroup {
    public EICToolsTab(String MOD_ID) {
        super(MOD_ID);
    }

    @Override
    public ItemStack createIcon() {
        ItemStack itemStack = new ItemStack(EICItems.TERAHERTZ_AXE);
        return itemStack;
    }
}

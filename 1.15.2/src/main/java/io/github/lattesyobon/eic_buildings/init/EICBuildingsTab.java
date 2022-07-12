package io.github.lattesyobon.eic_buildings.init;

import io.github.lattesyobon.eic.init.EICItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EICBuildingsTab extends ItemGroup {
    public EICBuildingsTab(String MOD_ID) {
        super(MOD_ID);
    }

    @Override
    public ItemStack createIcon() {
        ItemStack itemStack = new ItemStack(EICItems.SILICON_WAFER);
        return itemStack;
    }
}

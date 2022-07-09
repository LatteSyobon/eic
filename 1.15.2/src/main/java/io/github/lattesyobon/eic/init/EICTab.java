package io.github.lattesyobon.eic.init;

import io.github.lattesyobon.eic.EIC;
import io.github.lattesyobon.eic.item.ItemSemiconductor;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EICTab extends ItemGroup {

    public EICTab(String MOD_ID) {
        super(MOD_ID);
    }

    @Override
    public ItemStack createIcon() {
        ItemStack itemStack = new ItemStack(new ItemSemiconductor());
        return itemStack;
    }
}

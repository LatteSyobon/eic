package io.github.lattesyobon.eic.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EICMechanismTab extends ItemGroup {
    public EICMechanismTab(String MOD_ID) {
        super(MOD_ID);
    }

    @Override
    public ItemStack createIcon() {
        ItemStack itemStack = new ItemStack(EICBlocks.CENTRIFUGE);
        return itemStack;
    }
}

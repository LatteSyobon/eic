package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class ItemCopperSword extends SwordItem {
    public ItemCopperSword() {
        super(new ItemTierTerahertz(),7,-3.2F,new Properties().group(EIC.EIC_TOOL_TAB));
        this.setRegistryName("copper_sword");
    }
}

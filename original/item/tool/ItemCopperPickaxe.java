package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class ItemCopperPickaxe extends PickaxeItem {
    public ItemCopperPickaxe() {
        super(new ItemTierCopper(),7,-3.2F,new Properties().group(EIC.EIC_TOOL_TAB));
        this.setRegistryName("copper_pickaxe");
    }
}

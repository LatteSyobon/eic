package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.ItemPickaxe;

public class ItemCopperPickaxe extends ItemPickaxe {
    public ItemCopperPickaxe() {
        super(ToolMaterial.IRON);
        this.setRegistryName(EIC.MODID, "copper_pickaxe");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("copper_pickaxe");
    }
}

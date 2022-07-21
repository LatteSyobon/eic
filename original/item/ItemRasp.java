package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class ItemRasp extends Item {
    public ItemRasp() {
        super(new Properties().group(EIC.EIC_TAB).addToolType(ToolType.PICKAXE,20));
        this.setRegistryName("rasp");
    }
}

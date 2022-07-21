package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;

public class ItemElectricalComponentBox extends Item {
    public ItemElectricalComponentBox() {
        super(new Properties().group(EIC.EIC_TAB));
        this.setRegistryName("electrical_component_box");
    }
}

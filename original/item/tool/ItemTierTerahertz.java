package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.item.ItemCopperIngot;
import io.github.lattesyobon.eic.item.ItemSilicon;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemTier;
import net.minecraft.item.crafting.Ingredient;

public class ItemTierTerahertz implements IItemTier {
    @Override
    public int getMaxUses() {
        return ItemTier.IRON.getMaxUses();
    }

    @Override
    public float getEfficiency() {
        return ItemTier.IRON.getEfficiency();
    }

    @Override
    public float getAttackDamage() {
        return ItemTier.IRON.getAttackDamage();
    }

    @Override
    public int getHarvestLevel() {
        return ItemTier.DIAMOND.getHarvestLevel();
    }

    @Override
    public int getEnchantability() {
        return ItemTier.IRON.getEnchantability();
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(new ItemSilicon());
    }
}

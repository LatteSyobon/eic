package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.item.ItemRuby;
import io.github.lattesyobon.eic.item.ItemSilicon;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemTier;
import net.minecraft.item.crafting.Ingredient;

public class ItemTierRuby implements IItemTier {
    @Override
    public int getMaxUses() {
        return ItemTier.DIAMOND.getMaxUses();
    }

    @Override
    public float getEfficiency() {
        return ItemTier.DIAMOND.getEfficiency();
    }

    @Override
    public float getAttackDamage() {
        return ItemTier.DIAMOND.getAttackDamage();
    }

    @Override
    public int getHarvestLevel() {
        return ItemTier.DIAMOND.getHarvestLevel();
    }

    @Override
    public int getEnchantability() {
        return ItemTier.DIAMOND.getEnchantability();
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(new ItemRuby());
    }
}

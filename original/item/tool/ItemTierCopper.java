package io.github.lattesyobon.eic.item.tool;

import io.github.lattesyobon.eic.item.ItemCopperIngot;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemTier;
import net.minecraft.item.crafting.Ingredient;

public class ItemTierCopper implements IItemTier {
    @Override
    public int getMaxUses() {
        return ItemTier.STONE.getMaxUses();
    }

    @Override
    public float getEfficiency() {
        return ItemTier.STONE.getEfficiency();
    }

    @Override
    public float getAttackDamage() {
        return ItemTier.STONE.getAttackDamage();
    }

    @Override
    public int getHarvestLevel() {
        return ItemTier.STONE.getHarvestLevel();
    }

    @Override
    public int getEnchantability() {
        return ItemTier.STONE.getEnchantability();
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(new ItemCopperIngot());
    }
}

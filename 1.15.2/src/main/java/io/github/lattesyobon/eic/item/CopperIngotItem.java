
package io.github.lattesyobon.eic.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import io.github.lattesyobon.eic.itemgroup.EicItemGroup;
import io.github.lattesyobon.eic.EicModElements;

@EicModElements.ModElement.Tag
public class CopperIngotItem extends EicModElements.ModElement {
	@ObjectHolder("eic:copper_ingot")
	public static final Item block = null;
	public CopperIngotItem(EicModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(EicItemGroup.tab).maxStackSize(64));
			setRegistryName("copper_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}

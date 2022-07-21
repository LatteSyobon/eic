package io.github.lattesyobon.eic.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import io.github.lattesyobon.eic.item.ItemSiliconWaferBox;
import io.github.lattesyobon.eic.item.ItemSiliconWafer;
import io.github.lattesyobon.eic.ElementsEic;

@ElementsEic.ModElement.Tag
public class ProcedureSiliconWaferBoxRightClickedInAir extends ElementsEic.ModElement {
	public ProcedureSiliconWaferBoxRightClickedInAir(ElementsEic instance) {
		super(instance, 12);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SiliconWaferBoxRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemSiliconWafer.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemSiliconWaferBox.block, (int) (1)).getItem(), -1, (int) 1, null);
	}
}

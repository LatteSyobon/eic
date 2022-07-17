package io.github.lattesyobon.eic.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemBox extends Item {

    private static Item RETURNS = new Item();

    public ItemBox(Item returns) {
        super();
        RETURNS = returns;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.inventory.addItemStackToInventory(new ItemStack(RETURNS));
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    public static <T> T Null() {
        return null;
    }
}

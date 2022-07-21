package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.init.EICItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemBox extends Item {

    private static Item RETURNS = Null();

    public ItemBox(Properties properties,Item returns) {
        super(properties);
        RETURNS = returns;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
        p_77659_2_.inventory.addItemStackToInventory(new ItemStack(RETURNS, 1));
        return super.onItemRightClick(p_77659_1_, p_77659_2_, p_77659_3_);
    }

    public static <T> T Null() {
        return null;
    }
}

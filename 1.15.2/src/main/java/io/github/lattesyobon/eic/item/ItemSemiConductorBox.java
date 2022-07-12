package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import io.github.lattesyobon.eic.init.EICItems;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class ItemSemiConductorBox extends Item {

    public ItemSemiConductorBox() {
        super(new Properties().group(EIC.EIC_TAB));
        this.setRegistryName("semi_conductor_box");
    }

    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(this.getRecordDescription().applyTextStyle(TextFormatting.GRAY));
    }

    @OnlyIn(Dist.CLIENT)
    public ITextComponent getRecordDescription() {
        return new TranslationTextComponent(this.getTranslationKey() + ".desc");
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
        p_77659_2_.inventory.addItemStackToInventory(new ItemStack(EICItems.SEMI_CONDUCTOR, 1));
        return super.onItemRightClick(p_77659_1_, p_77659_2_, p_77659_3_);
    }
}

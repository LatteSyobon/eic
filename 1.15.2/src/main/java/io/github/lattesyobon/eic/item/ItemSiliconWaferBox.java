package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import io.github.lattesyobon.eic.init.EICItems;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class ItemSiliconWaferBox extends ItemBox {
    public ItemSiliconWaferBox() {
        super(new Properties().group(EIC.EIC_TAB), EICItems.SILICON_WAFER);
        this.setRegistryName("silicon_wafer_box");
    }
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(this.getRecordDescription().applyTextStyle(TextFormatting.GRAY));
    }

    @OnlyIn(Dist.CLIENT)
    public ITextComponent getRecordDescription() {
        return new TranslationTextComponent(this.getTranslationKey() + ".desc");
    }

}

package io.github.lattesyobon.eic.item;

import io.github.lattesyobon.eic.EIC;
import io.github.lattesyobon.eic.init.EICItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemSiliconWaferBox extends Item {
    public ItemSiliconWaferBox() {
        super();
        this.setRegistryName(EIC.MODID, "silicon_wafer_box");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("silicon_wafer_box");
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.inventory.addItemStackToInventory(new ItemStack(EICItems.SILICON_WAFER));
        playerIn.inventory.clearMatchingItems(EICItems.SILICON_WAFER_BOX,0,1,new NBTTagCompound());
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}

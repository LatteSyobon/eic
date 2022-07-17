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

public class ItemSemiConductorBox extends Item {
    public ItemSemiConductorBox() {
        super();
        this.setRegistryName(EIC.MODID, "semi_conductor_box");
        this.setCreativeTab(EIC.EIC_TAB);
        this.setUnlocalizedName("semi_conductor_box");
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.inventory.addItemStackToInventory(new ItemStack(EICItems.SEMI_CONDUCTOR));
        playerIn.inventory.clearMatchingItems(EICItems.SEMI_CONDUCTOR_BOX,1,1,new NBTTagCompound());
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}

package io.github.lattesyobon.eic.init;

import io.github.lattesyobon.eic.EIC;
import io.github.lattesyobon.eic.item.ItemSilicon;
import io.github.lattesyobon.eic.item.ItemStoneStick;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EICItems {

    public static final Item SILICON = new ItemSilicon();
    public static final Item STONE_STICK = new ItemStoneStick();
}

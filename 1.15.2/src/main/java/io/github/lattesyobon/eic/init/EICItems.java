package io.github.lattesyobon.eic.init;

import io.github.lattesyobon.eic.EIC;
import io.github.lattesyobon.eic.item.*;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(EIC.MOD_ID)
public class EICItems {
    @Mod.EventBusSubscriber(modid = EIC.MOD_ID, bus = Bus.MOD)
    public static class Register {
        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            final Item[] item = {
                    new ItemSemiconductor(),
                    new ItemSilicon(),
                    new ItemCopperIngot()
            };

            event.getRegistry().registerAll(item);
        }
    }
}
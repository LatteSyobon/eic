package io.github.lattesyobon.eic.init;

import io.github.lattesyobon.eic.EIC;
import io.github.lattesyobon.eic.item.*;
import io.github.lattesyobon.eic.item.tool.*;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(EIC.MOD_ID)
public class EICItems {

    // Electrical components
    public static Item SEMI_CONDUCTOR = new ItemSemiconductor();
    // Boxes
    public static Item SEMI_CONDUCTOR_BOX = new ItemSemiConductorBox();
    public static Item MYSTERY_COMPONENT_BOX = new ItemMysteryComponentBox();

    @Mod.EventBusSubscriber(modid = EIC.MOD_ID, bus = Bus.MOD)
    public static class Register {
        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            final Item[] item = {
                    SEMI_CONDUCTOR,
                    new ItemSilicon(),
                    new ItemCopperIngot(),
                    new ItemConductingWire(),
                    new ItemStoneStick(),
                    new ItemRasp(),
                    new ItemStoneCuttingEdge(),
                    new ItemTerahertzPickaxe(),
                    new ItemElectricalComponentBox(),
                    new ItemSlicedSiliconDisk(),
                    new ItemSiliconWafer(),
                    SEMI_CONDUCTOR_BOX,
                    MYSTERY_COMPONENT_BOX
            };

            event.getRegistry().registerAll(item);
        }
    }
}
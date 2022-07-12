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
    public static final Item STONE_STICK = new ItemStoneStick();
    public static final Item SEMI_CONDUCTOR = new ItemSemiconductor();
    public static final Item CONDUCTING_WIRE = new ItemConductingWire();
    public static final Item STONE_CUTTING_EDGE = new ItemStoneCuttingEdge();
    public static final Item SLICED_STONE_DISK = new ItemSlicedSiliconDisk();
    public static final Item SILICON_WAFER = new ItemSiliconWafer();
    //Ores
    public static final Item SILICON = new ItemSilicon();
    public static final Item COPPER_INGOT = new ItemCopperIngot();
    //Tools
    public static final Item TERAHERTZ_PICKAXE = new ItemTerahertzPickaxe();
    public static final Item TERAHERTZ_SWORD = new ItemTerahertzSword();
    public static final Item TERAHERTZ_SHOVEL = new ItemTerahertzShovel();
    public static final Item TERAHERTZ_AXE = new ItemTerahertzAxe();
    public static final Item TERAHERTZ_HOE = new ItemTerahertzHoe();

    public static final Item COPPER_PICKAXE = new ItemCopperPickaxe();
    public static final Item RASP = new ItemRasp();
    // Boxes
    public static final Item ELECTRICAL_COMPONENT_BOX = new ItemElectricalComponentBox();
    public static final Item SEMI_CONDUCTOR_BOX = new ItemSemiConductorBox();
    public static final Item MYSTERY_COMPONENT_BOX = new ItemMysteryComponentBox();
    public static final Item SILICON_WAFER_BOX = new ItemSiliconWaferBox();

    @Mod.EventBusSubscriber(modid = EIC.MOD_ID, bus = Bus.MOD)
    public static class Register {
        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            final Item[] item = {
                    //Electrical Component
                    STONE_STICK,
                    SEMI_CONDUCTOR,
                    CONDUCTING_WIRE,
                    STONE_CUTTING_EDGE,
                    SLICED_STONE_DISK,
                    SILICON_WAFER,
                    //Ores
                    SILICON,
                    COPPER_INGOT,
                    //Tools
                    TERAHERTZ_PICKAXE,
                    TERAHERTZ_SWORD,
                    TERAHERTZ_SHOVEL,
                    TERAHERTZ_AXE,
                    TERAHERTZ_HOE,

                    COPPER_PICKAXE,
                    RASP,
                    //Boxes
                    ELECTRICAL_COMPONENT_BOX,
                    SEMI_CONDUCTOR_BOX,
                    MYSTERY_COMPONENT_BOX,
                    SILICON_WAFER_BOX
            };

            event.getRegistry().registerAll(item);
        }
    }
}
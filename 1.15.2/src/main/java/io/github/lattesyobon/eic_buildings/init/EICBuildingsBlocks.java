package io.github.lattesyobon.eic_buildings.init;

import com.google.common.base.Preconditions;
import io.github.lattesyobon.eic_buildings.EICBuildings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(EICBuildings.MOD_ID)
public class EICBuildingsBlocks {

    @Mod.EventBusSubscriber(modid = EICBuildings.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register {

        @SubscribeEvent
        public static void registerBlock(final RegistryEvent.Register<Block> event) {
            final Block[] blocks = {
            };

            event.getRegistry().registerAll(blocks);
        }

        @SubscribeEvent
        public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
            final BlockItem[] items = {
            };

            for(final BlockItem item : items) {
                final Block block = item.getBlock();
                final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(), "Block %s has a null registry name", block);
                event.getRegistry().register(item.setRegistryName(registryName));
            }
        }
    }

    public static <T> T Null() {
        return null;
    }
}

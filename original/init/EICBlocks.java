package io.github.lattesyobon.eic.init;

import com.google.common.base.Preconditions;

import io.github.lattesyobon.eic.EIC;
import io.github.lattesyobon.eic.block.*;
import io.github.lattesyobon.eic.block.mechanism.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(EIC.MOD_ID)
public class EICBlocks {

    public static final BlockTerahertzOre TERAHERTZ_ORE = Null();
    public static final BlockCopperOre COPPER_ORE = Null();
    public static final BlockRubyOre RUBY_ORE = Null();

    public static final BlockCentrifuge CENTRIFUGE = Null();
    public static final BlockXRay X_RAY = Null();

    public static final BlockCopperWire COPPER_WIRE = Null();

    @Mod.EventBusSubscriber(modid = EIC.MOD_ID, bus = Bus.MOD)
    public static class Register {

        @SubscribeEvent
        public static void registerBlock(final RegistryEvent.Register<Block> event) {
            final Block[] blocks = {
                    new BlockTerahertzOre(),
                    new BlockCopperOre(),
                    new BlockRubyOre(),
                    new BlockCentrifuge(),
                    new BlockCopperWire(),
                    new BlockXRay()
            };

            event.getRegistry().registerAll(blocks);
        }

        @SubscribeEvent
        public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
            final BlockItem[] items = {
                    new BlockItem(TERAHERTZ_ORE,new Properties().group(EIC.EIC_TAB)),
                    new BlockItem(COPPER_ORE,new Properties().group(EIC.EIC_TAB)),
                    new BlockItem(RUBY_ORE,new Properties().group(EIC.EIC_TAB)),
                    new BlockItem(CENTRIFUGE,new Properties().group(EIC.EIC_MECHANISM_TAB)),
                    new BlockItem(COPPER_WIRE,new Properties().group(EIC.EIC_MECHANISM_TAB)),
                    new BlockItem(X_RAY,new Properties().group(EIC.EIC_MECHANISM_TAB))
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
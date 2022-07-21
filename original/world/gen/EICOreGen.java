package io.github.lattesyobon.eic.world.gen;

import io.github.lattesyobon.eic.EIC;
import io.github.lattesyobon.eic.init.EICBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(EIC.MOD_ID)
public class EICOreGen {
    @Mod.EventBusSubscriber(modid = EIC.MOD_ID, bus = Bus.MOD)
    public static class Register {
        @SubscribeEvent
        public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
            for(Biome biome : ForgeRegistries.BIOMES) {
                ConfiguredPlacement<CountRangeConfig> customConfig_terahertz = Placement.COUNT_RANGE
                        .configure(new CountRangeConfig(20,0,0,32));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, EICBlocks.TERAHERTZ_ORE.getDefaultState(), 9))
                        .withPlacement(customConfig_terahertz));
                ConfiguredPlacement<CountRangeConfig> customConfig_copper = Placement.COUNT_RANGE
                        .configure(new CountRangeConfig(20,0,0,64));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, EICBlocks.COPPER_ORE.getDefaultState(), 9))
                        .withPlacement(customConfig_copper));
                ConfiguredPlacement<CountRangeConfig> customConfig_ruby = Placement.COUNT_RANGE
                        .configure(new CountRangeConfig(4,0,0,8));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, EICBlocks.RUBY_ORE.getDefaultState(), 9))
                        .withPlacement(customConfig_ruby));
            }
        }
    }
}

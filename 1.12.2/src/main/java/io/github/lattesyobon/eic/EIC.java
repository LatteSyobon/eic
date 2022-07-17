package io.github.lattesyobon.eic;


import io.github.lattesyobon.eic.block.BlockCopperOre;
import io.github.lattesyobon.eic.handlers.RegistryHandler;
import io.github.lattesyobon.eic.init.EICTab;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.Logger;

import static io.github.lattesyobon.eic.init.EICBlocks.*;
import static io.github.lattesyobon.eic.init.EICItems.*;

import org.apache.logging.log4j.Logger;


@Mod(modid = io.github.lattesyobon.eic.EIC.MODID, name = io.github.lattesyobon.eic.EIC.NAME, version = io.github.lattesyobon.eic.EIC.VERSION)
public class EIC
{
    public static final String MODID = "eic";
    public static final String NAME = "Electric Industry Craft";
    public static final String VERSION = "0.2.0";

    private static Logger logger;

    public static final CreativeTabs EIC_TAB = new EICTab();

    @Mod.Metadata(MODID)
    public static ModMetadata meta;

    @Mod.EventHandler
    public void construct(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        ModInfo.loadInfo(meta);
        RegistryHandler.Common();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {

        final Item[] item = {
                STONE_STICK,
                SEMI_CONDUCTOR,
                CONDUCTING_WIRE,
                STONE_CUTTING_EDGE,

                SILICON,
                COPPER_INGOT,

                RASP,


                new ItemBlock(COPPER_ORE).setRegistryName(EIC.MODID, "copper_ore"),
                new ItemBlock(TERAHERTZ_ORE).setRegistryName(EIC.MODID, "terahertz_ore")
        };
        event.getRegistry().registerAll(item);
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        final Block[] block = {
                COPPER_ORE,
                TERAHERTZ_ORE
        };
        event.getRegistry().registerAll(block);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {

        //Items
        ModelLoader.setCustomModelResourceLocation(STONE_STICK, 0, new ModelResourceLocation(new ResourceLocation(EIC.MODID, "stone_stick"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SEMI_CONDUCTOR, 0, new ModelResourceLocation(new ResourceLocation(EIC.MODID, "semi_conductor"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CONDUCTING_WIRE, 0, new ModelResourceLocation(new ResourceLocation(EIC.MODID, "conducting_wire"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(STONE_CUTTING_EDGE, 0, new ModelResourceLocation(new ResourceLocation(EIC.MODID, "stone_cutting_edge"), "inventory"));

        ModelLoader.setCustomModelResourceLocation(SILICON, 0, new ModelResourceLocation(new ResourceLocation(EIC.MODID, "silicon"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(COPPER_INGOT, 0, new ModelResourceLocation(new ResourceLocation(EIC.MODID, "copper_ingot"), "inventory"));

        ModelLoader.setCustomModelResourceLocation(RASP,0,new ModelResourceLocation(new ResourceLocation(EIC.MODID,"rasp"),"inventory"));
        //Blocks
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(COPPER_ORE), 0, new ModelResourceLocation(new ResourceLocation(EIC.MODID, "copper_ore"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(TERAHERTZ_ORE), 0, new ModelResourceLocation(new ResourceLocation(EIC.MODID, "terahertz_ore"), "inventory"));
    }
}

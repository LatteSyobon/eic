package io.github.lattesyobon.eic;

<<<<<<< Updated upstream
=======
import io.github.lattesyobon.eic.init.EICTab;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
>>>>>>> Stashed changes
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

<<<<<<< Updated upstream
=======
import static io.github.lattesyobon.eic.init.EICItems.*;

>>>>>>> Stashed changes
@Mod(modid = io.github.lattesyobon.eic.EIC.MODID, name = io.github.lattesyobon.eic.EIC.NAME, version = io.github.lattesyobon.eic.EIC.VERSION)
public class EIC
{
    public static final String MODID = "eic";
    public static final String NAME = "Electric Industry Craft";
    public static final String VERSION = "1.0";

    private static Logger logger;

<<<<<<< Updated upstream
=======
    public static final CreativeTabs EIC_TAB = new EICTab();

    @Mod.Metadata(MODID)
    public static ModMetadata meta;

    @Mod.EventHandler
    public void construct(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

>>>>>>> Stashed changes
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
<<<<<<< Updated upstream
=======

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(SILICON);
        event.getRegistry().register(STONE_STICK);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(SILICON, 0, new ModelResourceLocation(new ResourceLocation(EIC.MODID, "silicon"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(STONE_STICK, 0, new ModelResourceLocation(new ResourceLocation(EIC.MODID, "stone_stick"), "inventory"));
    }
>>>>>>> Stashed changes
}

package io.github.lattesyobon.eic.handlers;

import io.github.lattesyobon.eic.gen.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHandler {

    public static void Common() {
        GameRegistry.registerWorldGenerator(new CopperOreGen(), 0);
        GameRegistry.registerWorldGenerator(new TerahertzOreGen(), 0);
    }
}

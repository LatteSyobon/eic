package io.github.lattesyobon.eic;

import net.minecraftforge.fml.common.ModMetadata;

public class ModInfo {
    public static void loadInfo(ModMetadata meta) {
        meta.modId = EIC.MODID;
        meta.name = EIC.NAME;
        meta.description ="";
        meta.version =EIC.VERSION ;
        meta.url = "https://github.com/LatteSyobon/eic";
        meta.updateJSON = "https://raw.githubusercontent.com/LatteSyobon/eic/main/version/EICVersionCheck.json";
        meta.authorList.add("Lattex");
        meta.credits = "";
        meta.logoFile ="assets/eic/";
        meta.autogenerated = false;
    }
}

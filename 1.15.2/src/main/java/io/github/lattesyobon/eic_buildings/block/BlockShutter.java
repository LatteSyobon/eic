package io.github.lattesyobon.eic_buildings.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockShutter extends Block {
    public BlockShutter() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(3F,6.0F));
        this.setRegistryName("shutter");
    }

    @Override
    public int getHarvestLevel(BlockState state) {
        return 0;
    }
    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.PICKAXE;
    }
}

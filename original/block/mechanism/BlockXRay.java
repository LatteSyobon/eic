package io.github.lattesyobon.eic.block.mechanism;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockXRay extends Block {
    public BlockXRay() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(1F,6.0F));
        this.setRegistryName("x_ray");
    }

    @Override
    public int getHarvestLevel(BlockState state) {
        return 1;
    }
    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.PICKAXE;
    }
}

package io.github.lattesyobon.eic.block.mechanism;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.material.Material;
import net.minecraft.state.DirectionProperty;
import net.minecraft.util.Direction;
import net.minecraftforge.common.ToolType;

public class BlockCopperWire extends Block {


    public BlockCopperWire() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(1F,6.0F));
        this.setRegistryName("copper_wire");
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

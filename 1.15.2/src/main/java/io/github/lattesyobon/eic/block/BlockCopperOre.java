package io.github.lattesyobon.eic.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockCopperOre extends Block {
    public BlockCopperOre() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(3F,6.0F));
        this.setRegistryName("copper_ore");
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

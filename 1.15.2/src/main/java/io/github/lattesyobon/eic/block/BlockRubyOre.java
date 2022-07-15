package io.github.lattesyobon.eic.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.ToolType;

public class BlockRubyOre extends Block {
    public BlockRubyOre() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(20F,6.0F));
        this.setRegistryName("ruby_ore");
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? 1 + RANDOM.nextInt(5) : 0;
    }

    @Override
    public int getHarvestLevel(BlockState state) {
        return 3;
    }

    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.PICKAXE;
    }
}

package io.github.lattesyobon.eic.block.mechanism;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class BlockCentrifuge extends Block {

    public BlockCentrifuge() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(8F,6.0F));
        this.setRegistryName("centrifuge");
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity playerIn, Hand handIn, BlockRayTraceResult hit) {
        // Code

        return super.onBlockActivated(state, worldIn, pos, playerIn, handIn, hit);
    }
}

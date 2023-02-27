package com.starfish_studios.delightful_decor.block;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.List;
import java.util.Optional;

import static net.minecraft.world.level.block.CampfireBlock.LIT;

public class ShitBlock extends Block implements SimpleWaterloggedBlock {

    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final int MIN_SHITS = 1;
    public static final int MAX_SHITS = 3;
    public static final IntegerProperty SHITS;
    private static final VoxelShape ONE_AABB;
    private static final VoxelShape TWO_AABB;
    private static final VoxelShape THREE_AABB;

    public ShitBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if ((Boolean)state.getValue(LIT)) {
            if (this.spawnParticles && random.nextInt(5) == 0) {
                for(int i = 0; i < random.nextInt(1) + 1; ++i) {
                    level.addParticle(ParticleTypes.CLOUD, (double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5, (double)(random.nextFloat() / 2.0F), 5.0E-5, (double)(random.nextFloat() / 2.0F));
                }
            }

        }
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext useContext) {
        return !useContext.isSecondaryUseActive() && useContext.getItemInHand().getItem() == this.asItem() && (Integer)state.getValue(SHITS) < 3 ? true : super.canBeReplaced(state, useContext);
    }


    public boolean spawnParticles;

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState blockState = context.getLevel().getBlockState(context.getClickedPos());
        if (blockState.is(this)) {
            return (BlockState)blockState.cycle(SHITS);
        } else {
            FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());
            boolean bl = fluidState.getType() == Fluids.WATER;
            return (BlockState)super.getStateForPlacement(context).setValue(WATERLOGGED, bl);
        }
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch ((Integer)state.getValue(SHITS)) {
            case 1:
            default:
                return ONE_AABB;
            case 2:
                return TWO_AABB;
            case 3:
                return THREE_AABB;
        }
    }

    static {
        SHITS = BlockStateProperties.CANDLES;
        ONE_AABB = Block.box(4.0, 0.0, 4.0, 12.0, 2.0, 12.0);
        TWO_AABB = Block.box(3.0, 0.0, 3.0, 13.0, 5.0, 13.0);
        THREE_AABB = Shapes.or(Block.box(1.0, 0.0, 1.0, 15.0, 4.0, 15.0), Block.box(3.0, 4.0, 3.0, 13.0, 9.0, 13.0));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{SHITS, WATERLOGGED, LIT});
    }

    @Override
    public boolean canPlaceLiquid(BlockGetter level, BlockPos pos, BlockState state, Fluid fluid) {
        return SimpleWaterloggedBlock.super.canPlaceLiquid(level, pos, state, fluid);
    }

    @Override
    public boolean placeLiquid(LevelAccessor level, BlockPos pos, BlockState state, FluidState fluidState) {
        return SimpleWaterloggedBlock.super.placeLiquid(level, pos, state, fluidState);
    }

    @Override
    public ItemStack pickupBlock(LevelAccessor level, BlockPos pos, BlockState state) {
        return SimpleWaterloggedBlock.super.pickupBlock(level, pos, state);
    }

    @Override
    public Optional<SoundEvent> getPickupSound() {
        return SimpleWaterloggedBlock.super.getPickupSound();
    }
}

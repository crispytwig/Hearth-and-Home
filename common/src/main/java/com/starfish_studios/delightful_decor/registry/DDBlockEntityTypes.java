package com.starfish_studios.delightful_decor.registry;

import com.starfish_studios.delightful_decor.block.entity.StockingBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

public class DDBlockEntityTypes {

    public static final Supplier<BlockEntityType<StockingBlockEntity>> STOCKING = DDRegistry.registerBlockEntityType("stocking",
            () -> DDRegistry.createBlockEntityType(StockingBlockEntity::new,
                    DDBlocks.WHITE_STOCKING.get(),
                    DDBlocks.ORANGE_STOCKING.get(),
                    DDBlocks.MAGENTA_STOCKING.get(),
                    DDBlocks.LIGHT_BLUE_STOCKING.get(),
                    DDBlocks.YELLOW_STOCKING.get(),
                    DDBlocks.LIME_STOCKING.get(),
                    DDBlocks.PINK_STOCKING.get(),
                    DDBlocks.GRAY_STOCKING.get(),
                    DDBlocks.LIGHT_GRAY_STOCKING.get(),
                    DDBlocks.CYAN_STOCKING.get(),
                    DDBlocks.PURPLE_STOCKING.get(),
                    DDBlocks.BLUE_STOCKING.get(),
                    DDBlocks.BROWN_STOCKING.get(),
                    DDBlocks.GREEN_STOCKING.get(),
                    DDBlocks.RED_STOCKING.get(),
                    DDBlocks.BLACK_STOCKING.get()
            ));

    public static void init() {}
}

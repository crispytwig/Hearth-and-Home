package com.starfish_studios.delightful_decor.registry;

import com.starfish_studios.delightful_decor.DelightfulDecor;
import com.starfish_studios.delightful_decor.block.ShitBlock;
import com.starfish_studios.delightful_decor.block.StockingBlock;
import com.starfish_studios.delightful_decor.block.WreathBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

import java.util.function.Supplier;

public class DDBlocks {

    public static final Supplier<Block> SHIT = registerBlock("shit", () -> new ShitBlock(Block.Properties.of(Material.FROGSPAWN).strength(0.8F).sound(SoundType.HONEY_BLOCK).noOcclusion()));

    // Wreaths
    public static final Supplier<Block> WHITE_WREATHE = registerBlock("white_wreath", () -> new WreathBlock(Block.Properties.of(Material.LEAVES).strength(0.1F).sound(SoundType.GRASS).noOcclusion().noCollission()));
    public static final Supplier<Block> ORANGE_WREATHE = registerBlock("orange_wreath", () -> new WreathBlock(Block.Properties.of(Material.LEAVES).strength(0.1F).sound(SoundType.GRASS).noOcclusion().noCollission()));
    public static final Supplier<Block> MAGENTA_WREATHE = registerBlock("magenta_wreath", () -> new WreathBlock(Block.Properties.of(Material.LEAVES).strength(0.1F).sound(SoundType.GRASS).noOcclusion().noCollission()));
    public static final Supplier<Block> LIGHT_BLUE_WREATHE = registerBlock("light_blue_wreath", () -> new WreathBlock(Block.Properties.of(Material.LEAVES).strength(0.1F).sound(SoundType.GRASS).noOcclusion().noCollission()));
    public static final Supplier<Block> YELLOW_WREATHE = registerBlock("yellow_wreath", () -> new WreathBlock(Block.Properties.of(Material.LEAVES).strength(0.1F).sound(SoundType.GRASS).noOcclusion().noCollission()));
    public static final Supplier<Block> LIME_WREATHE = registerBlock("lime_wreath", () -> new WreathBlock(Block.Properties.of(Material.LEAVES).strength(0.1F).sound(SoundType.GRASS).noOcclusion().noCollission()));
    public static final Supplier<Block> PINK_WREATHE = registerBlock("pink_wreath", () -> new WreathBlock(Block.Properties.of(Material.LEAVES).strength(0.1F).sound(SoundType.GRASS).noOcclusion().noCollission()));
    public static final Supplier<Block> GRAY_WREATHE = registerBlock("gray_wreath", () -> new WreathBlock(Block.Properties.of(Material.LEAVES).strength(0.1F).sound(SoundType.GRASS).noOcclusion().noCollission()));
    public static final Supplier<Block> LIGHT_GRAY_WREATHE = registerBlock("light_gray_wreath", () -> new WreathBlock(Block.Properties.of(Material.LEAVES).strength(0.1F).sound(SoundType.GRASS).noOcclusion().noCollission()));
    public static final Supplier<Block> CYAN_WREATHE = registerBlock("cyan_wreath", () -> new WreathBlock(Block.Properties.of(Material.LEAVES).strength(0.1F).sound(SoundType.GRASS).noOcclusion().noCollission()));
    public static final Supplier<Block> PURPLE_WREATHE = registerBlock("purple_wreath", () -> new WreathBlock(Block.Properties.of(Material.LEAVES).strength(0.1F).sound(SoundType.GRASS).noOcclusion().noCollission()));
    public static final Supplier<Block> BLUE_WREATHE = registerBlock("blue_wreath", () -> new WreathBlock(Block.Properties.of(Material.LEAVES).strength(0.1F).sound(SoundType.GRASS).noOcclusion().noCollission()));
    public static final Supplier<Block> BROWN_WREATHE = registerBlock("brown_wreath", () -> new WreathBlock(Block.Properties.of(Material.LEAVES).strength(0.1F).sound(SoundType.GRASS).noOcclusion().noCollission()));
    public static final Supplier<Block> GREEN_WREATHE = registerBlock("green_wreath", () -> new WreathBlock(Block.Properties.of(Material.LEAVES).strength(0.1F).sound(SoundType.GRASS).noOcclusion().noCollission()));
    public static final Supplier<Block> RED_WREATHE = registerBlock("red_wreath", () -> new WreathBlock(Block.Properties.of(Material.LEAVES).strength(0.1F).sound(SoundType.GRASS).noOcclusion().noCollission()));
    public static final Supplier<Block> BLACK_WREATHE = registerBlock("black_wreath", () -> new WreathBlock(Block.Properties.of(Material.LEAVES).strength(0.1F).sound(SoundType.GRASS).noOcclusion().noCollission()));

    // Stockings
    public static final Supplier<Block> WHITE_STOCKING = registerBlock("white_stocking", () -> new StockingBlock(Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion().noCollission()));
    public static final Supplier<Block> ORANGE_STOCKING = registerBlock("orange_stocking", () -> new StockingBlock(Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion().noCollission()));
    public static final Supplier<Block> MAGENTA_STOCKING = registerBlock("magenta_stocking", () -> new StockingBlock(Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion().noCollission()));
    public static final Supplier<Block> LIGHT_BLUE_STOCKING = registerBlock("light_blue_stocking", () -> new StockingBlock(Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion().noCollission()));
    public static final Supplier<Block> YELLOW_STOCKING = registerBlock("yellow_stocking", () -> new StockingBlock(Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion().noCollission()));
    public static final Supplier<Block> LIME_STOCKING = registerBlock("lime_stocking", () -> new StockingBlock(Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion().noCollission()));
    public static final Supplier<Block> PINK_STOCKING = registerBlock("pink_stocking", () -> new StockingBlock(Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion().noCollission()));
    public static final Supplier<Block> GRAY_STOCKING = registerBlock("gray_stocking", () -> new StockingBlock(Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion().noCollission()));
    public static final Supplier<Block> LIGHT_GRAY_STOCKING = registerBlock("light_gray_stocking", () -> new StockingBlock(Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion().noCollission()));
    public static final Supplier<Block> CYAN_STOCKING = registerBlock("cyan_stocking", () -> new StockingBlock(Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion().noCollission()));
    public static final Supplier<Block> PURPLE_STOCKING = registerBlock("purple_stocking", () -> new StockingBlock(Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion().noCollission()));
    public static final Supplier<Block> BLUE_STOCKING = registerBlock("blue_stocking", () -> new StockingBlock(Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion().noCollission()));
    public static final Supplier<Block> BROWN_STOCKING = registerBlock("brown_stocking", () -> new StockingBlock(Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion().noCollission()));
    public static final Supplier<Block> GREEN_STOCKING = registerBlock("green_stocking", () -> new StockingBlock(Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion().noCollission()));
    public static final Supplier<Block> RED_STOCKING = registerBlock("red_stocking", () -> new StockingBlock(Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion().noCollission()));
    public static final Supplier<Block> BLACK_STOCKING = registerBlock("black_stocking", () -> new StockingBlock(Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion().noCollission()));


    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> supplier = DDRegistry.registerBlock(name, block);
        DDRegistry.registerItem(name, () -> new BlockItem(supplier.get(), new Item.Properties().tab(DelightfulDecor.TAB)));
        return supplier;
    }

    public static <T extends Block> Supplier<T> registerBlockHidden(String name, Supplier<T> block) {
        Supplier<T> supplier = DDRegistry.registerBlock(name, block);
        DDRegistry.registerItem(name, () -> new BlockItem(supplier.get(), new Item.Properties()));
        return supplier;
    }

    public static <T extends Block> Supplier<T> registerBlockOnly(String name, Supplier<T> block) {
        return DDRegistry.registerBlock(name, block);
    }

    public static void init() {}
}

package com.starfish_studios.delightful_decor.registry;

import com.starfish_studios.delightful_decor.DelightfulDecor;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class DDBlockTags {



    private static TagKey<Block> blockTag(String name) {
        return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(DelightfulDecor.MOD_ID, name));
    }
}

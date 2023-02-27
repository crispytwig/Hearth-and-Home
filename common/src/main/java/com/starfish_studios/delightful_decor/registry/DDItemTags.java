package com.starfish_studios.delightful_decor.registry;

import com.starfish_studios.delightful_decor.DelightfulDecor;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class DDItemTags {



    private static TagKey<Item> itemTag(String name) {
        return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(DelightfulDecor.MOD_ID, name));
    }
}

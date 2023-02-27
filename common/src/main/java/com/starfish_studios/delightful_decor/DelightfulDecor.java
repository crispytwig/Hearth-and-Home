package com.starfish_studios.delightful_decor;

import com.starfish_studios.delightful_decor.registry.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DelightfulDecor {
    public static final String MOD_ID = "delightful_decor";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final CreativeModeTab TAB = DDRegistry.registerCreativeModeTab(new ResourceLocation(MOD_ID, "tab"), () -> new ItemStack(DDBlocks.RED_WREATHE.get()));

    public static void init() {
        DDBlocks.init();
        DDItems.init();
        DDSoundEvents.init();
        DDEntityTypes.init();
        DDBlockEntityTypes.init();
    }

    public static void registerFlammables() {

    }
}
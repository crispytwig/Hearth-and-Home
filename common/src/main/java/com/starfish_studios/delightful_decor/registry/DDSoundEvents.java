package com.starfish_studios.delightful_decor.registry;

import com.starfish_studios.delightful_decor.DelightfulDecor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class DDSoundEvents {


    public static Supplier<SoundEvent> register(String name) {
        return DDRegistry.registerSoundEvent(name, () -> new SoundEvent(new ResourceLocation(DelightfulDecor.MOD_ID, name)));
    }

    public static void init() {}
}

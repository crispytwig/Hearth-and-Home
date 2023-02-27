package com.starfish_studios.delightful_decor.fabric;

import com.starfish_studios.delightful_decor.DelightfulDecor;
import net.fabricmc.api.ModInitializer;

public class DelightfulDecorFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        DelightfulDecor.init();
        DelightfulDecor.registerFlammables();
    }

}
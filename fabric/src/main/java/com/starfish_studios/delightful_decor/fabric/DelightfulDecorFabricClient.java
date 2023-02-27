package com.starfish_studios.delightful_decor.fabric;

import com.starfish_studios.delightful_decor.client.DelightfulDecorClient;
import net.fabricmc.api.ClientModInitializer;

public class DelightfulDecorFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        DelightfulDecorClient.init();
//        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(),
//                AFBlocks.OAK_TABLE.get(),
//        );
    }
}

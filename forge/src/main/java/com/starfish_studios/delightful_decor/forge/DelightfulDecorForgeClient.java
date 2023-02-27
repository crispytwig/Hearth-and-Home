package com.starfish_studios.delightful_decor.forge;

import com.starfish_studios.delightful_decor.DelightfulDecor;
import com.starfish_studios.delightful_decor.client.DelightfulDecorClient;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = DelightfulDecor.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DelightfulDecorForgeClient {

    @SubscribeEvent
    public static void init(FMLClientSetupEvent event) {
        DelightfulDecorClient.init();
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {

    }


}

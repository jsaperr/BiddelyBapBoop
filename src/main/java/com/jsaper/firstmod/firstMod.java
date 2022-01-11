package com.jsaper.firstmod;

import com.jsaper.firstmod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class firstMod implements ModInitializer {

    public static final String MOD_ID = "first";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}

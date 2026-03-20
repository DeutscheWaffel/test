package com.githubuser.nativefsr;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NativeFSRMod implements ModInitializer {
    public static final String MOD_ID = "native-fsr-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Native FSR Mod initialized for Minecraft 1.20.1");
        LOGGER.info("AMD FidelityFX Super Resolution support enabled");
    }
}
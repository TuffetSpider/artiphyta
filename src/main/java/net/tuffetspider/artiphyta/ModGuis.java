package net.tuffetspider.artiphyta;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.tuffetspider.artiphyta.gui.MortarPestleScreenHandler;

public class ModGuis {

    public static ScreenHandlerType<MortarPestleScreenHandler> MORTAR_PESTLE;

    public static void initializeGuis(){
        MORTAR_PESTLE= Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Artiphyta.MOD_ID,"mortar_and_pestle"),new ScreenHandlerType<>(MortarPestleScreenHandler::new, FeatureFlags.VANILLA_FEATURES));

    }
}

package net.xanthian.expert_weapons;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import net.xanthian.expert_weapons.compat.TRToolsCompat;
import net.xanthian.expert_weapons.compat.TRWeaponsCompat;
import net.xanthian.expert_weapons.item.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Initialize_Mod implements ModInitializer {

    public static final String MOD_ID = "expert_weapons";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ExpertWeapons.registerModItems();
        ExpertTools.registerModItems();
        DullWeapons.registerModItems();
        DullToolParts.registerModItems();
        DullTools.registerModItems();

       // if (FabricLoader.getInstance().isModLoaded("gobber2")) {
            //Gobber2WeaponsCompat.registerModItems();
            //FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
               // ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("gobber2", "gobcompat"),
                //        modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
          //  });
        //}

        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            TRWeaponsCompat.registerModItems();
            TRToolsCompat.registerModItems();
            FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
                ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("techreborn", "trcompat"),
                        modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
                LOGGER.info("Tech Reborn detected, amending recipes for Expert Weapons & Tools");
            });
        }
    }
}
package net.xanthian.expert_weapons;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import net.xanthian.expert_weapons.compat.*;
import net.xanthian.expert_weapons.item.*;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;


public class Initialize_Mod implements ModInitializer {

    public static final String MOD_ID = "expert_weapons";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final List<Pair<String, String[]>> woodTypes = Arrays.asList(
            Pair.of("acacia", new String[]{"vsas"}),
            Pair.of("birch", new String[]{"vsas"}),
            Pair.of("crimson", new String[]{"vsas"}),
            Pair.of("dark_oak", new String[]{"vsas"}),
            Pair.of("jungle", new String[]{"vsas"}),
            Pair.of("oak", new String[]{"vsas"}),
            Pair.of("spruce", new String[]{"vsas"}),
            Pair.of("warped", new String[]{"vsas"}));

    @Override
    public void onInitialize() {

        ExpertWeapons.registerModItems();
        ExpertTools.registerModItems();
        DullWeapons.registerModItems();
        DullToolParts.registerModItems();
        DullTools.registerModItems();

        if (FabricLoader.getInstance().isModLoaded("gobber2")) {
            Gobber2WeaponsCompat.registerModItems();
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("gobcompat"), FabricLoader.getInstance().getModContainer(Initialize_Mod.MOD_ID).orElseThrow(), ResourcePackActivationType.ALWAYS_ENABLED);
                LOGGER.info("Gobber 2 detected, amending recipes for Expert Weapons & Tools");
        }

        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            TRWeaponsCompat.registerModItems();
            TRToolsCompat.registerModItems();
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("trcompat"), FabricLoader.getInstance().getModContainer(Initialize_Mod.MOD_ID).orElseThrow(), ResourcePackActivationType.ALWAYS_ENABLED);
                LOGGER.info("Tech Reborn detected, amending recipes for Expert Weapons & Tools");
        }

        if (FabricLoader.getInstance().isModLoaded("vsas")) {
            VsasWeaponsCompat.registerModItems();
            VsasToolsCompat.registerModItems();
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("vsascompat"), FabricLoader.getInstance().getModContainer(Initialize_Mod.MOD_ID).orElseThrow(), ResourcePackActivationType.ALWAYS_ENABLED);
            LOGGER.info("Variant Sticks & Stuff detected, amending recipes for Expert Weapons & Tools");
        }
    }
}
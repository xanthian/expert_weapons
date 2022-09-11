package net.xanthian.expert_weapons;

import com.google.common.collect.Lists;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.xanthian.expert_weapons.compat.*;
import net.xanthian.expert_weapons.item.*;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class Initialize_Mod implements ModInitializer {

    public static final String MOD_ID = "expert_weapons";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final ItemGroup EXPERT_WEAPONS = FabricItemGroupBuilder.build(new Identifier(Initialize_Mod.MOD_ID, "expert_weapons"),
            () -> new ItemStack(ExpertWeapons.SHARPENED_DIAMOND_BLADE));
    public static final ItemGroup EXPERT_TOOLS = FabricItemGroupBuilder.build(new Identifier(Initialize_Mod.MOD_ID, "expert_tools"),
            () -> new ItemStack(ExpertTools.SHARPENED_DIAMOND_AXE_HEAD));

    public static List<Pair<String, String[]>> materialTypes = Lists.newArrayList();

    @Override
    public void onInitialize() {

        ExpertWeapons.registerModItems();
        ExpertTools.registerModItems();
        ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("ewmodcompat"),
                FabricLoader.getInstance().getModContainer(Initialize_Mod.MOD_ID).orElseThrow(), ResourcePackActivationType.ALWAYS_ENABLED);

        if (FabricLoader.getInstance().isModLoaded("gobber2")) {
            Gobber2WeaponsCompat.registerModItems();
        }

        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            TRWeaponsCompat.registerModItems();
            TRToolsCompat.registerModItems();
        }

        if (FabricLoader.getInstance().isModLoaded("dirtmonds")) {
            DirtmondsCompat.registerModItems();
        }

        if (FabricLoader.getInstance().isModLoaded("vsas")) {
            materialTypes.add(Pair.of("acacia", new String[]{"vsas"}));
            materialTypes.add(Pair.of("birch", new String[]{"vsas"}));
            materialTypes.add(Pair.of("crimson", new String[]{"vsas"}));
            materialTypes.add(Pair.of("dark_oak", new String[]{"vsas"}));
            materialTypes.add(Pair.of("jungle", new String[]{"vsas"}));
            materialTypes.add(Pair.of("oak", new String[]{"vsas"}));
            materialTypes.add(Pair.of("spruce", new String[]{"vsas"}));
            materialTypes.add(Pair.of("warped", new String[]{"vsas"}));
            VsasWeaponsCompat.registerModItems();
            VsasToolsCompat.registerModItems();
        }

        if (FabricLoader.getInstance().isModLoaded("advancednetherite")) {
            AdvNetheriteCompat.registerModItems();
        }

        if (FabricLoader.getInstance().isModLoaded("indrev")) {
            IndustrialRevolution.registerModItems();
        }
    }
}
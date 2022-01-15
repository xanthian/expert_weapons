package net.xanthian.expert_weapons;

import net.fabricmc.api.ModInitializer;

import net.xanthian.expert_weapons.item.*;

public class Initialize_Mod implements ModInitializer {

    public static final String MOD_ID = "expert_weapons";

    @Override
    public void onInitialize() {

        ExpertWeapons.registerModItems();
        ExpertTools.registerModItems();
        DullWeapons.registerModItems();
        DullToolParts.registerModItems();
        DullTools.registerModItems();

    }
}
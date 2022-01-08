package net.xanthian.expert_weapons;

import net.fabricmc.api.ModInitializer;
import net.xanthian.expert_weapons.item.ExpertWeapons;
import net.xanthian.expert_weapons.item.DullWeapons;

public class Initialize_Mod implements ModInitializer {

    public static final String MOD_ID = "expert_weapons";

    @Override
    public void onInitialize() {

        ExpertWeapons.registerModItems();
        DullWeapons.registerModItems();

    }
}
package net.xanthian.expert_weapons.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.expert_weapons.Initialize_Mod;
import net.xanthian.expert_weapons.item.ExpertGroup;

public class VsasWeaponsCompat {

    //Generic Parts
    public static final Item ACACIA_SWORD_HILT = registerItem("vsascompat/acacia_sword_hilt",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_WEAPONS)));

    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {}
}
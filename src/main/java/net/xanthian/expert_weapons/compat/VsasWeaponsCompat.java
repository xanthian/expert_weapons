package net.xanthian.expert_weapons.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.xanthian.expert_weapons.Initialize_Mod;
import net.xanthian.expert_weapons.item.DullItems.DullSwordItem;

public class VsasWeaponsCompat {

    //Generic Parts
    public static final Item ACACIA_SWORD_HILT = registerItem("vsascompat/acacia_sword_hilt",
            new Item(new FabricItemSettings()));
    public static final Item BIRCH_SWORD_HILT = registerItem("vsascompat/birch_sword_hilt",
            new Item(new FabricItemSettings()));
    public static final Item CRIMSON_SWORD_HILT = registerItem("vsascompat/crimson_sword_hilt",
            new Item(new FabricItemSettings()));
    public static final Item DARK_OAK_SWORD_HILT = registerItem("vsascompat/dark_oak_sword_hilt",
            new Item(new FabricItemSettings()));
    public static final Item JUNGLE_SWORD_HILT = registerItem("vsascompat/jungle_sword_hilt",
            new Item(new FabricItemSettings()));
    public static final Item MANGROVE_SWORD_HILT = registerItem("vsascompat/mangrove_sword_hilt",
            new Item(new FabricItemSettings()));
    public static final Item OAK_SWORD_HILT = registerItem("vsascompat/oak_sword_hilt",
            new Item(new FabricItemSettings()));
    public static final Item SPRUCE_SWORD_HILT = registerItem("vsascompat/spruce_sword_hilt",
            new Item(new FabricItemSettings()));
    public static final Item WARPED_SWORD_HILT = registerItem("vsascompat/warped_sword_hilt",
            new Item(new FabricItemSettings()));

    // Acacia
    public static final Item DULL_ACACIA_IRON_SWORD = registerItem("vsascompat/dull_acacia_iron_sword", 
            new DullSwordItem(ToolMaterials.IRON,3,-2.4f));
    public static final Item DULL_ACACIA_GOLDEN_SWORD = registerItem("vsascompat/dull_acacia_golden_sword", 
            new DullSwordItem(ToolMaterials.GOLD,3,-2.4f));
    public static final Item DULL_ACACIA_DIAMOND_SWORD = registerItem("vsascompat/dull_acacia_diamond_sword",  
            new DullSwordItem(ToolMaterials.DIAMOND,3,-2.4f));
    public static final Item DULL_ACACIA_NETHERITE_SWORD = registerItem("vsascompat/dull_acacia_netherite_sword", 
            new DullSwordItem(ToolMaterials.NETHERITE,3,-2.4f));

    // Birch
    public static final Item DULL_BIRCH_IRON_SWORD = registerItem("vsascompat/dull_birch_iron_sword", 
            new DullSwordItem(ToolMaterials.IRON,3,-2.4f));
    public static final Item DULL_BIRCH_GOLDEN_SWORD = registerItem("vsascompat/dull_birch_golden_sword", 
            new DullSwordItem(ToolMaterials.GOLD,3,-2.4f));
    public static final Item DULL_BIRCH_DIAMOND_SWORD = registerItem("vsascompat/dull_birch_diamond_sword",
            new DullSwordItem(ToolMaterials.DIAMOND,3,-2.4f));
    public static final Item DULL_BIRCH_NETHERITE_SWORD = registerItem("vsascompat/dull_birch_netherite_sword",
            new DullSwordItem(ToolMaterials.NETHERITE,3,-2.4f));

    // Crimson
    public static final Item DULL_CRIMSON_IRON_SWORD = registerItem("vsascompat/dull_crimson_iron_sword",
            new DullSwordItem(ToolMaterials.IRON,3,-2.4f));
    public static final Item DULL_CRIMSON_GOLDEN_SWORD = registerItem("vsascompat/dull_crimson_golden_sword",
            new DullSwordItem(ToolMaterials.GOLD,3,-2.4f));
    public static final Item DULL_CRIMSON_DIAMOND_SWORD = registerItem("vsascompat/dull_crimson_diamond_sword",
            new DullSwordItem(ToolMaterials.DIAMOND,3,-2.4f));
    public static final Item DULL_CRIMSON_NETHERITE_SWORD = registerItem("vsascompat/dull_crimson_netherite_sword",
            new DullSwordItem(ToolMaterials.NETHERITE,3,-2.4f));

    // Dark_oak
    public static final Item DULL_DARK_OAK_IRON_SWORD = registerItem("vsascompat/dull_dark_oak_iron_sword",
            new DullSwordItem(ToolMaterials.IRON,3,-2.4f));
    public static final Item DULL_DARK_OAK_GOLDEN_SWORD = registerItem("vsascompat/dull_dark_oak_golden_sword",
            new DullSwordItem(ToolMaterials.GOLD,3,-2.4f));
    public static final Item DULL_DARK_OAK_DIAMOND_SWORD = registerItem("vsascompat/dull_dark_oak_diamond_sword",
            new DullSwordItem(ToolMaterials.DIAMOND,3,-2.4f));
    public static final Item DULL_DARK_OAK_NETHERITE_SWORD = registerItem("vsascompat/dull_dark_oak_netherite_sword",
            new DullSwordItem(ToolMaterials.NETHERITE,3,-2.4f));

    // Jungle
    public static final Item DULL_JUNGLE_IRON_SWORD = registerItem("vsascompat/dull_jungle_iron_sword",
            new DullSwordItem(ToolMaterials.IRON,3,-2.4f));
    public static final Item DULL_JUNGLE_GOLDEN_SWORD = registerItem("vsascompat/dull_jungle_golden_sword",
            new DullSwordItem(ToolMaterials.GOLD,3,-2.4f));
    public static final Item DULL_JUNGLE_DIAMOND_SWORD = registerItem("vsascompat/dull_jungle_diamond_sword",
            new DullSwordItem(ToolMaterials.DIAMOND,3,-2.4f));
    public static final Item DULL_JUNGLE_NETHERITE_SWORD = registerItem("vsascompat/dull_jungle_netherite_sword",
            new DullSwordItem(ToolMaterials.NETHERITE,3,-2.4f));

    // Mangrove
    public static final Item DULL_MANGROVE_IRON_SWORD = registerItem("vsascompat/dull_mangrove_iron_sword",
            new DullSwordItem(ToolMaterials.IRON,3,-2.4f));
    public static final Item DULL_MANGROVE_GOLDEN_SWORD = registerItem("vsascompat/dull_mangrove_golden_sword",
            new DullSwordItem(ToolMaterials.GOLD,3,-2.4f));
    public static final Item DULL_MANGROVE_DIAMOND_SWORD = registerItem("vsascompat/dull_mangrove_diamond_sword",
            new DullSwordItem(ToolMaterials.DIAMOND,3,-2.4f));
    public static final Item DULL_MANGROVE_NETHERITE_SWORD = registerItem("vsascompat/dull_mangrove_netherite_sword",
            new DullSwordItem(ToolMaterials.NETHERITE,3,-2.4f));
    
    // Oak
    public static final Item DULL_OAK_IRON_SWORD = registerItem("vsascompat/dull_oak_iron_sword",
            new DullSwordItem(ToolMaterials.IRON,3,-2.4f));
    public static final Item DULL_OAK_GOLDEN_SWORD = registerItem("vsascompat/dull_oak_golden_sword",
            new DullSwordItem(ToolMaterials.GOLD,3,-2.4f));
    public static final Item DULL_OAK_DIAMOND_SWORD = registerItem("vsascompat/dull_oak_diamond_sword",
            new DullSwordItem(ToolMaterials.DIAMOND,3,-2.4f));
    public static final Item DULL_OAK_NETHERITE_SWORD = registerItem("vsascompat/dull_oak_netherite_sword",
            new DullSwordItem(ToolMaterials.NETHERITE,3,-2.4f));

    // Spruce
    public static final Item DULL_SPRUCE_IRON_SWORD = registerItem("vsascompat/dull_spruce_iron_sword",
            new DullSwordItem(ToolMaterials.IRON,3,-2.4f));
    public static final Item DULL_SPRUCE_GOLDEN_SWORD = registerItem("vsascompat/dull_spruce_golden_sword",
            new DullSwordItem(ToolMaterials.GOLD,3,-2.4f));
    public static final Item DULL_SPRUCE_DIAMOND_SWORD = registerItem("vsascompat/dull_spruce_diamond_sword",
            new DullSwordItem(ToolMaterials.DIAMOND,3,-2.4f));
    public static final Item DULL_SPRUCE_NETHERITE_SWORD = registerItem("vsascompat/dull_spruce_netherite_sword",
            new DullSwordItem(ToolMaterials.NETHERITE,3,-2.4f));

    // Warped
    public static final Item DULL_WARPED_IRON_SWORD = registerItem("vsascompat/dull_warped_iron_sword",
            new DullSwordItem(ToolMaterials.IRON,3,-2.4f));
    public static final Item DULL_WARPED_GOLDEN_SWORD = registerItem("vsascompat/dull_warped_golden_sword",
            new DullSwordItem(ToolMaterials.GOLD,3,-2.4f));
    public static final Item DULL_WARPED_DIAMOND_SWORD = registerItem("vsascompat/dull_warped_diamond_sword",
            new DullSwordItem(ToolMaterials.DIAMOND,3,-2.4f));
    public static final Item DULL_WARPED_NETHERITE_SWORD = registerItem("vsascompat/dull_warped_netherite_sword",
            new DullSwordItem(ToolMaterials.NETHERITE,3,-2.4f));

    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup(ACACIA_SWORD_HILT);
        addToItemGroup(BIRCH_SWORD_HILT);
        addToItemGroup(CRIMSON_SWORD_HILT);
        addToItemGroup(DARK_OAK_SWORD_HILT);
        addToItemGroup(JUNGLE_SWORD_HILT);
        addToItemGroup(MANGROVE_SWORD_HILT);
        addToItemGroup(OAK_SWORD_HILT);
        addToItemGroup(SPRUCE_SWORD_HILT);
        addToItemGroup(WARPED_SWORD_HILT);
        addToItemGroup(DULL_ACACIA_IRON_SWORD);
        addToItemGroup(DULL_ACACIA_GOLDEN_SWORD);
        addToItemGroup(DULL_ACACIA_DIAMOND_SWORD);
        addToItemGroup(DULL_ACACIA_NETHERITE_SWORD);
        addToItemGroup(DULL_BIRCH_IRON_SWORD);
        addToItemGroup(DULL_BIRCH_GOLDEN_SWORD);
        addToItemGroup(DULL_BIRCH_DIAMOND_SWORD);
        addToItemGroup(DULL_BIRCH_NETHERITE_SWORD);
        addToItemGroup(DULL_CRIMSON_IRON_SWORD);
        addToItemGroup(DULL_CRIMSON_GOLDEN_SWORD);
        addToItemGroup(DULL_CRIMSON_DIAMOND_SWORD);
        addToItemGroup(DULL_CRIMSON_NETHERITE_SWORD);
        addToItemGroup(DULL_DARK_OAK_IRON_SWORD);
        addToItemGroup(DULL_DARK_OAK_GOLDEN_SWORD);
        addToItemGroup(DULL_DARK_OAK_DIAMOND_SWORD);
        addToItemGroup(DULL_DARK_OAK_NETHERITE_SWORD);
        addToItemGroup(DULL_JUNGLE_IRON_SWORD);
        addToItemGroup(DULL_JUNGLE_GOLDEN_SWORD);
        addToItemGroup(DULL_JUNGLE_DIAMOND_SWORD);
        addToItemGroup(DULL_JUNGLE_NETHERITE_SWORD);
        addToItemGroup(DULL_MANGROVE_IRON_SWORD);
        addToItemGroup(DULL_MANGROVE_GOLDEN_SWORD);
        addToItemGroup(DULL_MANGROVE_DIAMOND_SWORD);
        addToItemGroup(DULL_MANGROVE_NETHERITE_SWORD);
        addToItemGroup(DULL_OAK_IRON_SWORD);
        addToItemGroup(DULL_OAK_GOLDEN_SWORD);
        addToItemGroup(DULL_OAK_DIAMOND_SWORD);
        addToItemGroup(DULL_OAK_NETHERITE_SWORD);
        addToItemGroup(DULL_SPRUCE_IRON_SWORD);
        addToItemGroup(DULL_SPRUCE_GOLDEN_SWORD);
        addToItemGroup(DULL_SPRUCE_DIAMOND_SWORD);
        addToItemGroup(DULL_SPRUCE_NETHERITE_SWORD);
        addToItemGroup(DULL_WARPED_IRON_SWORD);
        addToItemGroup(DULL_WARPED_GOLDEN_SWORD);
        addToItemGroup(DULL_WARPED_DIAMOND_SWORD);
        addToItemGroup(DULL_WARPED_NETHERITE_SWORD);
    }

    private static void addToItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(Initialize_Mod.EXPERT_WEAPONS).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}
package net.xanthian.expert_weapons.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xanthian.expert_weapons.Initialise;
import net.xanthian.expert_weapons.util.ModCreativeModeTab;


public class SharpenedToolParts {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Initialise.MOD_ID);

    // IRON
    public static final RegistryObject<Item> SHARPENED_IRON_AXE_HEAD = ITEMS.register("sharpened_iron_axe_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> SHARPENED_IRON_HOE_HEAD = ITEMS.register("sharpened_iron_hoe_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> SHARPENED_IRON_PICKAXE_HEAD = ITEMS.register("sharpened_iron_pickaxe_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> SHARPENED_IRON_SHOVEL_HEAD = ITEMS.register("sharpened_iron_shovel_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    // GOLDEN
    public static final RegistryObject<Item> SHARPENED_GOLDEN_AXE_HEAD = ITEMS.register("sharpened_golden_axe_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> SHARPENED_GOLDEN_HOE_HEAD = ITEMS.register("sharpened_golden_hoe_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> SHARPENED_GOLDEN_PICKAXE_HEAD = ITEMS.register("sharpened_golden_pickaxe_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> SHARPENED_GOLDEN_SHOVEL_HEAD = ITEMS.register("sharpened_golden_shovel_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    // DIAMOND
    public static final RegistryObject<Item> SHARPENED_DIAMOND_AXE_HEAD = ITEMS.register("sharpened_diamond_axe_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> SHARPENED_DIAMOND_HOE_HEAD = ITEMS.register("sharpened_diamond_hoe_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> SHARPENED_DIAMOND_PICKAXE_HEAD = ITEMS.register("sharpened_diamond_pickaxe_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> SHARPENED_DIAMOND_SHOVEL_HEAD = ITEMS.register("sharpened_diamond_shovel_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    // NETHERITE
    public static final RegistryObject<Item> SHARPENED_NETHERITE_AXE_HEAD = ITEMS.register("sharpened_netherite_axe_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> SHARPENED_NETHERITE_HOE_HEAD = ITEMS.register("sharpened_netherite_hoe_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> SHARPENED_NETHERITE_PICKAXE_HEAD = ITEMS.register("sharpened_netherite_pickaxe_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> SHARPENED_NETHERITE_SHOVEL_HEAD = ITEMS.register("sharpened_netherite_shovel_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

}
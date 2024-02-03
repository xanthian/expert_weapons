package net.xanthian.expert_weapons.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xanthian.expert_weapons.Initialise;
import net.xanthian.expert_weapons.util.ModCreativeModeTab;

public class GenericWeaponParts {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Initialise.MOD_ID);

    public static final RegistryObject<Item> SWORD_HILT = ITEMS.register("sword_hilt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> IRON_GUARD = ITEMS.register("iron_guard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> GOLDEN_GUARD = ITEMS.register("golden_guard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> DIAMOND_GUARD = ITEMS.register("diamond_guard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> NETHERITE_GUARD = ITEMS.register("netherite_guard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));
}


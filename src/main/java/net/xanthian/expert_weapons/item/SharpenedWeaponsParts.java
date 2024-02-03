package net.xanthian.expert_weapons.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xanthian.expert_weapons.Initialise;
import net.xanthian.expert_weapons.util.ModCreativeModeTab;

public class SharpenedWeaponsParts {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Initialise.MOD_ID);

    public static final RegistryObject<Item> SHARPENED_IRON_BLADE = ITEMS.register("sharpened_iron_blade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> SHARPENED_GOLDEN_BLADE = ITEMS.register("sharpened_golden_blade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> SHARPENED_DIAMOND_BLADE = ITEMS.register("sharpened_diamond_blade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

    public static final RegistryObject<Item> SHARPENED_NETHERITE_BLADE = ITEMS.register("sharpened_netherite_blade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

}
package net.xanthian.expert_weapons.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xanthian.expert_weapons.Initialise;
import net.xanthian.expert_weapons.item.DullItems.DullAxeItem;
import net.xanthian.expert_weapons.item.DullItems.DullHoeItem;
import net.xanthian.expert_weapons.item.DullItems.DullPickaxeItem;
import net.xanthian.expert_weapons.item.DullItems.DullShovelItem;

public class DullTools {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Initialise.MOD_ID);

    // IRON
    public static final RegistryObject<Item> DULL_IRON_AXE = ITEMS.register("dull_iron_axe",
            () -> new DullAxeItem(Tiers.IRON, 6, -3.1f));

    public static final RegistryObject<Item> DULL_IRON_HOE = ITEMS.register("dull_iron_hoe",
            () -> new DullHoeItem(Tiers.IRON, -2, -1f));

    public static final RegistryObject<Item> DULL_IRON_PICKAXE = ITEMS.register("dull_iron_pickaxe",
            () -> new DullPickaxeItem(Tiers.IRON, 1, -2.8f));

    public static final RegistryObject<Item> DULL_IRON_SHOVEL = ITEMS.register("dull_iron_shovel",
            () -> new DullShovelItem(Tiers.IRON, 1.5f, -3f));

    // GOLDEN
    public static final RegistryObject<Item> DULL_GOLDEN_AXE = ITEMS.register("dull_golden_axe",
            () -> new DullAxeItem(Tiers.GOLD, 6, -3f));

    public static final RegistryObject<Item> DULL_GOLDEN_HOE = ITEMS.register("dull_golden_hoe",
            () -> new DullHoeItem(Tiers.GOLD, 0, -3f));

    public static final RegistryObject<Item> DULL_GOLDEN_PICKAXE = ITEMS.register("dull_golden_pickaxe",
            () -> new DullPickaxeItem(Tiers.GOLD, 1, -2.8f));

    public static final RegistryObject<Item> DULL_GOLDEN_SHOVEL = ITEMS.register("dull_golden_shovel",
            () -> new DullShovelItem(Tiers.GOLD, 1.5f, -3f));

    // DIAMOND
    public static final RegistryObject<Item> DULL_DIAMOND_AXE = ITEMS.register("dull_diamond_axe",
            () -> new DullAxeItem(Tiers.DIAMOND, 5, -3f));

    public static final RegistryObject<Item> DULL_DIAMOND_HOE = ITEMS.register("dull_diamond_hoe",
            () -> new DullHoeItem(Tiers.DIAMOND, -3, 0f));

    public static final RegistryObject<Item> DULL_DIAMOND_PICKAXE = ITEMS.register("dull_diamond_pickaxe",
            () -> new DullPickaxeItem(Tiers.DIAMOND, 1, -2.8f));

    public static final RegistryObject<Item> DULL_DIAMOND_SHOVEL = ITEMS.register("dull_diamond_shovel",
            () -> new DullShovelItem(Tiers.DIAMOND, 1.5f, -3f));

    // NETHERITE
    public static final RegistryObject<Item> DULL_NETHERITE_AXE = ITEMS.register("dull_netherite_axe",
            () -> new DullAxeItem(Tiers.NETHERITE, 5, -3f));

    public static final RegistryObject<Item> DULL_NETHERITE_HOE = ITEMS.register("dull_netherite_hoe",
            () -> new DullHoeItem(Tiers.NETHERITE, -4, 0f));

    public static final RegistryObject<Item> DULL_NETHERITE_PICKAXE = ITEMS.register("dull_netherite_pickaxe",
            () -> new DullPickaxeItem(Tiers.NETHERITE, 1, -2.8f));

    public static final RegistryObject<Item> DULL_NETHERITE_SHOVEL = ITEMS.register("dull_netherite_shovel",
            () -> new DullShovelItem(Tiers.NETHERITE, 1.5f, -3f));

}
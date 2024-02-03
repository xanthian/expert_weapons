package net.xanthian.expert_weapons.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xanthian.expert_weapons.Initialise;
import net.xanthian.expert_weapons.item.DullItems.DullItem;

public class DullToolParts {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Initialise.MOD_ID);

    // IRON
    public static final RegistryObject<Item> DULL_IRON_AXE_HEAD = ITEMS.register("dull_iron_axe_head",
            DullItem::new);

    public static final RegistryObject<Item> DULL_IRON_HOE_HEAD = ITEMS.register("dull_iron_hoe_head",
            DullItem::new);

    public static final RegistryObject<Item> DULL_IRON_PICKAXE_HEAD = ITEMS.register("dull_iron_pickaxe_head",
            DullItem::new);

    public static final RegistryObject<Item> DULL_IRON_SHOVEL_HEAD = ITEMS.register("dull_iron_shovel_head",
            DullItem::new);

    // GOLDEN
    public static final RegistryObject<Item> DULL_GOLDEN_AXE_HEAD = ITEMS.register("dull_golden_axe_head",
            DullItem::new);

    public static final RegistryObject<Item> DULL_GOLDEN_HOE_HEAD = ITEMS.register("dull_golden_hoe_head",
            DullItem::new);

    public static final RegistryObject<Item> DULL_GOLDEN_PICKAXE_HEAD = ITEMS.register("dull_golden_pickaxe_head",
            DullItem::new);

    public static final RegistryObject<Item> DULL_GOLDEN_SHOVEL_HEAD = ITEMS.register("dull_golden_shovel_head",
            DullItem::new);

    // DIAMOND
    public static final RegistryObject<Item> DULL_DIAMOND_AXE_HEAD = ITEMS.register("dull_diamond_axe_head",
            DullItem::new);

    public static final RegistryObject<Item> DULL_DIAMOND_HOE_HEAD = ITEMS.register("dull_diamond_hoe_head",
            DullItem::new);

    public static final RegistryObject<Item> DULL_DIAMOND_PICKAXE_HEAD = ITEMS.register("dull_diamond_pickaxe_head",
            DullItem::new);

    public static final RegistryObject<Item> DULL_DIAMOND_SHOVEL_HEAD = ITEMS.register("dull_diamond_shovel_head",
            DullItem::new);

    // NETHERITE
    public static final RegistryObject<Item> DULL_NETHERITE_AXE_HEAD = ITEMS.register("dull_netherite_axe_head",
            DullItem::new);

    public static final RegistryObject<Item> DULL_NETHERITE_HOE_HEAD = ITEMS.register("dull_netherite_hoe_head",
            DullItem::new);

    public static final RegistryObject<Item> DULL_NETHERITE_PICKAXE_HEAD = ITEMS.register("dull_netherite_pickaxe_head",
            DullItem::new);

    public static final RegistryObject<Item> DULL_NETHERITE_SHOVEL_HEAD = ITEMS.register("dull_netherite_shovel_head",
            DullItem::new);

}
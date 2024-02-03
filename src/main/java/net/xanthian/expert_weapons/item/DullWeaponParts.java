package net.xanthian.expert_weapons.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xanthian.expert_weapons.Initialise;
import net.xanthian.expert_weapons.item.DullItems.DullItem;

public class DullWeaponParts {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Initialise.MOD_ID);

    public static final RegistryObject<Item> DULL_IRON_BLADE = ITEMS.register("dull_iron_blade",
            DullItem::new);

    public static final RegistryObject<Item> DULL_GOLDEN_BLADE = ITEMS.register("dull_golden_blade",
            DullItem::new);

    public static final RegistryObject<Item> DULL_DIAMOND_BLADE = ITEMS.register("dull_diamond_blade",
            DullItem::new);

    public static final RegistryObject<Item> DULL_NETHERITE_BLADE = ITEMS.register("dull_netherite_blade",
            DullItem::new);

}
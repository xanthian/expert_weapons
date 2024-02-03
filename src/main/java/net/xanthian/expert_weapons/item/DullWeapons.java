package net.xanthian.expert_weapons.item;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xanthian.expert_weapons.Initialise;
import net.xanthian.expert_weapons.item.DullItems.DullSwordItem;

public class DullWeapons {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Initialise.MOD_ID);

    public static final RegistryObject<Item> DULL_IRON_SWORD = ITEMS.register("dull_iron_sword",
            () -> new DullSwordItem(Tiers.IRON, 3, -2.4f));

    public static final RegistryObject<Item> DULL_GOLDEN_SWORD = ITEMS.register("dull_golden_sword",
            () -> new DullSwordItem(Tiers.GOLD, 3, -2.4f));

    public static final RegistryObject<Item> DULL_DIAMOND_SWORD = ITEMS.register("dull_diamond_sword",
            () -> new DullSwordItem(Tiers.DIAMOND, 3, -2.4f));

    public static final RegistryObject<Item> DULL_NETHERITE_SWORD = ITEMS.register("dull_netherite_sword",
            () -> new DullSwordItem(Tiers.NETHERITE, 3, -2.4f));

}
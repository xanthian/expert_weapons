package net.xanthian.expert_weapons.materials;

import com.autovw.advancednetheritefabric.core.registry.ModItems;
import techreborn.init.TRContent;
import com.kwpugh.gobber2.init.ItemInit;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum DullMaterials implements ToolMaterial {

    DULL_IRON(3, 125, 5.0F, 1.0F, 0, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    DULL_GOLDEN(3, 32, 11.0F, -1F, 0, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    DULL_DIAMOND(3, 781, 7.0F, 2.0F, 0, () -> Ingredient.ofItems(Items.DIAMOND)),
    DULL_NETHERITE(4, 1015, 8.0F, 3.0F, 0, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    //Gobber2
    DULL_GOBBER2(4, 1900, 8.0F, 8.0F, 0, () -> Ingredient.ofItems(ItemInit.GOBBER2_INGOT)),
    DULL_GOBBER2_END(5, 4000, 13.0F, 8.0F, 0, () -> Ingredient.ofItems(ItemInit.GOBBER2_INGOT_END)),
    DULL_GOBBER2_NETHER(5, 2600, 11.0F, 8.0F, 0, () -> Ingredient.ofItems(ItemInit.GOBBER2_INGOT_NETHER)),

    //Tech Reborn
    DULL_BRONZE(2, 187, 7.0F, 2.25f, 0, () -> Ingredient.ofItems(TRContent.Ingots.BRONZE)),
    DULL_RUBY(2, 375, 6.0F, 1F, 0, () -> Ingredient.ofItems(TRContent.Gems.RUBY)),
    DULL_SAPPHIRE(3, 500, 7.0F, 1F, 0, () -> Ingredient.ofItems(TRContent.Gems.SAPPHIRE)),
    DULL_PERIDOT(2, 375, 7.0F, 1F, 0, () -> Ingredient.ofItems(TRContent.Gems.PERIDOT)),

    //Dirtmonds
    DULL_DIRTMOND(3, 781, 7.0F, 2.0F, 0, () -> Ingredient.ofItems(com.dmcpacks.dirtmonds.item.ModItems.DIRTMOND)),

    //Advanced Netherite
    DULL_NETHERITE_IRON(4, 1140, 11.0F, 4.0F,0, () -> Ingredient.ofItems(ModItems.NETHERITE_IRON_INGOT)),
    DULL_NETHERITE_GOLD(4, 1156, 13.0F, 4.0F,0, () -> Ingredient.ofItems(ModItems.NETHERITE_GOLD_INGOT)),
    DULL_NETHERITE_EMERALD(4, 1325, 15.0F, 5.0F,0, () -> Ingredient.ofItems(ModItems.NETHERITE_EMERALD_INGOT)),
    DULL_NETHERITE_DIAMOND(4, 1546, 17.0F, 5.0F,0, () -> Ingredient.ofItems(ModItems.NETHERITE_DIAMOND_INGOT));



    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private DullMaterials(int miningLevel, int itemDurability,
                          float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }
    void Materials(int i, int i1, float v, float v1, int i2, Object o) {
    }
    public int getDurability() {
        return this.itemDurability;
    }
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }
    public float getAttackDamage() {
        return this.attackDamage;
    }
    public int getMiningLevel() {
        return this.miningLevel;
    }
    public int getEnchantability() {
        return this.enchantability;
    }
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }

}
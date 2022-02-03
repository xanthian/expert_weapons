package net.xanthian.expert_weapons.materials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;
import techreborn.init.TRContent;

import java.util.function.Supplier;

public enum DullMaterials implements ToolMaterial {

    DULL_IRON(3, 125, 8.0F, 2.0F, 0, () -> {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }),
    DULL_GOLDEN(3, 32, 8.0F, 2.0F, 0, () -> {
        return Ingredient.ofItems(Items.GOLD_INGOT);
    }),
   DULL_DIAMOND(3, 781, 8.0F, 2.0F, 0, () -> {
       return Ingredient.ofItems(Items.DIAMOND);
       }),
    DULL_NETHERITE(3, 1015, 8.0F, 2.0F, 0, () -> {
        return Ingredient.ofItems(Items.NETHERITE_INGOT);
    }),

    //Gobber2
    DULL_GOBBER2(3, 1900, 8.0F, 5.0F, 0, () -> {
        return Ingredient.ofItems(Items.DIAMOND);    }),
    DULL_GOBBER2_END(3, 4000, 8.0F, 5.0F, 0, () -> {
        return Ingredient.ofItems(Items.DIAMOND);
    }),
    DULL_GOBBER2_NETHER(3, 2600, 8.0F, 5.0F, 0, () -> {
        return Ingredient.ofItems(Items.DIAMOND);
    }),

    //Tech Reborn
    DULL_BRONZE(2, 187, 7.0F, 2.25f, 0, () -> {
        return Ingredient.ofItems(TRContent.Ingots.BRONZE.asItem());
    }),
    DULL_RUBY(2, 375, 6.0F, 1F, 0, () -> {
        return Ingredient.ofItems(TRContent.Gems.RUBY.asItem());
    }),
    DULL_SAPPHIRE(3, 500, 7.0F, 1F, 0, () -> {
        return Ingredient.ofItems(TRContent.Gems.SAPPHIRE.asItem());
    }),
    DULL_PERIDOT(2, 375, 7.0F, 1F, 0, () -> {
        return Ingredient.ofItems(TRContent.Gems.PERIDOT.asItem());
    });

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
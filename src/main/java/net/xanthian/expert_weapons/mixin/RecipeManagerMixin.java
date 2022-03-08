package net.xanthian.expert_weapons.mixin;

import com.google.gson.JsonElement;

import net.fabricmc.loader.api.FabricLoader;

import net.minecraft.recipe.RecipeManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;

import net.xanthian.expert_weapons.Initialize_Mod;
import net.xanthian.expert_weapons.util.DullRecipes;
import net.xanthian.expert_weapons.util.Recipes;

import org.apache.commons.lang3.tuple.Pair;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(RecipeManager.class)
public abstract class RecipeManagerMixin {

    @Inject(method = "apply", at = @At("HEAD"))
    public void interceptApply(Map<Identifier, JsonElement> map, ResourceManager resourceManager, Profiler profiler, CallbackInfo info) {
        for (Pair<String, String[]> woodType : Initialize_Mod.woodTypes) {
            if (FabricLoader.getInstance().isModLoaded("vsas")) {
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_iron_axe"), Recipes.createIronAxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_iron_hoe"), Recipes.createIronHoeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_iron_pickaxe"), Recipes.createIronPickaxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_iron_shovel"), Recipes.createIronShovelRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_iron_sword"), Recipes.createIronSwordRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_golden_axe"), Recipes.createGoldenAxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_golden_hoe"), Recipes.createGoldenHoeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_golden_pickaxe"), Recipes.createGoldenPickaxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_golden_shovel"), Recipes.createGoldenShovelRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_golden_sword"), Recipes.createGoldenSwordRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_diamond_axe"), Recipes.createDiamondAxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_diamond_hoe"), Recipes.createDiamondHoeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_diamond_pickaxe"), Recipes.createDiamondPickaxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_diamond_shovel"), Recipes.createDiamondShovelRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_diamond_sword"), Recipes.createDiamondSwordRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_netherite_axe"), Recipes.createNetheriteAxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_netherite_hoe"), Recipes.createNetheriteHoeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_netherite_pickaxe"), Recipes.createNetheritePickaxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_netherite_shovel"), Recipes.createNetheriteShovelRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, woodType.getLeft() + "_netherite_sword"), Recipes.createNetheriteSwordRecipeJson(woodType.getLeft(), woodType.getRight()));
                // Dull
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_iron_axe"), DullRecipes.createDullIronAxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_iron_hoe"), DullRecipes.createDullIronHoeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_iron_pickaxe"), DullRecipes.createDullIronPickaxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_iron_shovel"), DullRecipes.createDullIronShovelRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_iron_sword"), DullRecipes.createDullIronSwordRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_golden_axe"), DullRecipes.createDullGoldenAxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_golden_hoe"), DullRecipes.createDullGoldenHoeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_golden_pickaxe"), DullRecipes.createDullGoldenPickaxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_golden_shovel"), DullRecipes.createDullGoldenShovelRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_golden_sword"), DullRecipes.createDullGoldenSwordRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_diamond_axe"), DullRecipes.createDullDiamondAxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_diamond_hoe"), DullRecipes.createDullDiamondHoeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_diamond_pickaxe"), DullRecipes.createDullDiamondPickaxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_diamond_shovel"), DullRecipes.createDullDiamondShovelRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_diamond_sword"), DullRecipes.createDullDiamondSwordRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_netherite_axe"), DullRecipes.createDullNetheriteAxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_netherite_hoe"), DullRecipes.createDullNetheriteHoeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_netherite_pickaxe"), DullRecipes.createDullNetheritePickaxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_netherite_shovel"), DullRecipes.createDullNetheriteShovelRecipeJson(woodType.getLeft(), woodType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ woodType.getLeft() + "_netherite_sword"), DullRecipes.createDullNetheriteSwordRecipeJson(woodType.getLeft(), woodType.getRight()));
            }
        }
    }
}
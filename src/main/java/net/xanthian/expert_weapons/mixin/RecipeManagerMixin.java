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

import net.xanthian.expert_weapons.util.UpgradeRecipes;
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
        for (Pair<String, String[]> materialType : Initialize_Mod.materialTypes) {
            if (FabricLoader.getInstance().isModLoaded("vsas")) {
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_iron_axe"), Recipes.createIronAxeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_iron_hoe"), Recipes.createIronHoeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_iron_pickaxe"), Recipes.createIronPickaxeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_iron_shovel"), Recipes.createIronShovelRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_iron_sword"), Recipes.createIronSwordRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_golden_axe"), Recipes.createGoldenAxeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_golden_hoe"), Recipes.createGoldenHoeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_golden_pickaxe"), Recipes.createGoldenPickaxeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_golden_shovel"), Recipes.createGoldenShovelRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_golden_sword"), Recipes.createGoldenSwordRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_diamond_axe"), Recipes.createDiamondAxeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_diamond_hoe"), Recipes.createDiamondHoeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_diamond_pickaxe"), Recipes.createDiamondPickaxeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_diamond_shovel"), Recipes.createDiamondShovelRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_diamond_sword"), Recipes.createDiamondSwordRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_netherite_axe"), Recipes.createNetheriteAxeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_netherite_hoe"), Recipes.createNetheriteHoeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_netherite_pickaxe"), Recipes.createNetheritePickaxeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_netherite_shovel"), Recipes.createNetheriteShovelRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, materialType.getLeft() + "_netherite_sword"), Recipes.createNetheriteSwordRecipeJson(materialType.getLeft(), materialType.getRight()));
                // Dull
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_iron_axe"), DullRecipes.createDullIronAxeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_iron_hoe"), DullRecipes.createDullIronHoeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_iron_pickaxe"), DullRecipes.createDullIronPickaxeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_iron_shovel"), DullRecipes.createDullIronShovelRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_iron_sword"), DullRecipes.createDullIronSwordRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_golden_axe"), DullRecipes.createDullGoldenAxeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_golden_hoe"), DullRecipes.createDullGoldenHoeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_golden_pickaxe"), DullRecipes.createDullGoldenPickaxeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_golden_shovel"), DullRecipes.createDullGoldenShovelRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_golden_sword"), DullRecipes.createDullGoldenSwordRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_diamond_axe"), DullRecipes.createDullDiamondAxeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_diamond_hoe"), DullRecipes.createDullDiamondHoeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_diamond_pickaxe"), DullRecipes.createDullDiamondPickaxeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_diamond_shovel"), DullRecipes.createDullDiamondShovelRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_diamond_sword"), DullRecipes.createDullDiamondSwordRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_netherite_axe"), DullRecipes.createDullNetheriteAxeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_netherite_hoe"), DullRecipes.createDullNetheriteHoeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_netherite_pickaxe"), DullRecipes.createDullNetheritePickaxeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_netherite_shovel"), DullRecipes.createDullNetheriteShovelRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "dull_"+ materialType.getLeft() + "_netherite_sword"), DullRecipes.createDullNetheriteSwordRecipeJson(materialType.getLeft(), materialType.getRight()));
                // Upgrades
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_iron_axe"), UpgradeRecipes.createDullIronAxeUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_iron_hoe"), UpgradeRecipes.createDullIronHoeUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_iron_pickaxe"), UpgradeRecipes.createDullIronPickaxeUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_iron_shovel"), UpgradeRecipes.createDullIronShovelUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_iron_sword"), UpgradeRecipes.createDullIronSwordUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_golden_axe"), UpgradeRecipes.createDullGoldenAxeUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_golden_hoe"), UpgradeRecipes.createDullGoldenHoeUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_golden_pickaxe"), UpgradeRecipes.createDullGoldenPickaxeUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_golden_shovel"), UpgradeRecipes.createDullGoldenShovelUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_golden_sword"), UpgradeRecipes.createDullGoldenSwordUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_diamond_axe"), UpgradeRecipes.createDullDiamondAxeUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_diamond_hoe"), UpgradeRecipes.createDullDiamondHoeUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_diamond_pickaxe"), UpgradeRecipes.createDullDiamondPickaxeUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_diamond_shovel"), UpgradeRecipes.createDullDiamondShovelUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_diamond_sword"), UpgradeRecipes.createDullDiamondSwordUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_netherite_axe"), UpgradeRecipes.createDullNetheriteAxeUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_netherite_hoe"), UpgradeRecipes.createDullNetheriteHoeUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_netherite_pickaxe"), UpgradeRecipes.createDullNetheritePickaxeUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_netherite_shovel"), UpgradeRecipes.createDullNetheriteShovelUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
                map.put(new Identifier(Initialize_Mod.MOD_ID, "upgrade_dull_"+ materialType.getLeft() + "_netherite_sword"), UpgradeRecipes.createDullNetheriteSwordUpgradeRecipeJson(materialType.getLeft(), materialType.getRight()));
            }
        }
    }
}
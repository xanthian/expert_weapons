package net.xanthian.expert_weapons.util;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import static net.xanthian.vsas.Init.MOD_ID;

public class UpgradeRecipes {

    // Iron Axe
    public static JsonObject createDullIronAxeUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_iron_axe");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:iron_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":axes/" + material + "_iron_axe");
        json.add("result", result);
        return json;
    }

    // Iron Sword
    public static JsonObject createDullIronSwordUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_iron_sword");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:iron_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":swords/" + material + "_iron_sword");
        json.add("result", result);
        return json;
    }

    // Iron Pickaxe
    public static JsonObject createDullIronPickaxeUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_iron_pickaxe");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:iron_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":pickaxes/" + material + "_iron_pickaxe");
        json.add("result", result);
        return json;
    }

    // Iron Shovel
    public static JsonObject createDullIronShovelUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_iron_shovel");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:iron_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":shovels/" + material + "_iron_shovel");
        json.add("result", result);
        return json;
    }

    // Iron Hoe
    public static JsonObject createDullIronHoeUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_iron_hoe");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:iron_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":hoes/" + material + "_iron_hoe");
        json.add("result", result);
        return json;
    }

    // Golden Axe
    public static JsonObject createDullGoldenAxeUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_golden_axe");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:golden_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":axes/" + material + "_golden_axe");
        json.add("result", result);
        return json;
    }

    // Golden Sword
    public static JsonObject createDullGoldenSwordUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_golden_sword");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:golden_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":swords/" + material + "_golden_sword");
        json.add("result", result);
        return json;
    }

    // Golden Pickaxe
    public static JsonObject createDullGoldenPickaxeUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_golden_pickaxe");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:golden_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":pickaxes/" + material + "_golden_pickaxe");
        json.add("result", result);
        return json;
    }

    // Golden Shovel
    public static JsonObject createDullGoldenShovelUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_golden_shovel");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:golden_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":shovels/" + material + "_golden_shovel");
        json.add("result", result);
        return json;
    }

    // Golden Hoe
    public static JsonObject createDullGoldenHoeUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_golden_hoe");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:golden_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":hoes/" + material + "_golden_hoe");
        json.add("result", result);
        return json;
    }

    // Diamond Axe
    public static JsonObject createDullDiamondAxeUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_diamond_axe");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:diamond_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":axes/" + material + "_diamond_axe");
        json.add("result", result);
        return json;
    }

    // Diamond Sword
    public static JsonObject createDullDiamondSwordUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_diamond_sword");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:diamond_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":swords/" + material + "_diamond_sword");
        json.add("result", result);
        return json;
    }

    // Diamond Pickaxe
    public static JsonObject createDullDiamondPickaxeUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_diamond_pickaxe");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:diamond_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":pickaxes/" + material + "_diamond_pickaxe");
        json.add("result", result);
        return json;
    }

    // Diamond Shovel
    public static JsonObject createDullDiamondShovelUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_diamond_shovel");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:diamond_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":shovels/" + material + "_diamond_shovel");
        json.add("result", result);
        return json;
    }

    // Diamond Hoe
    public static JsonObject createDullDiamondHoeUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_diamond_hoe");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:diamond_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":hoes/" + material + "_diamond_hoe");
        json.add("result", result);
        return json;
    }

    // Netherite Axe
    public static JsonObject createDullNetheriteAxeUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_netherite_axe");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:netherite_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":axes/" + material + "_netherite_axe");
        json.add("result", result);
        return json;
    }

    // Netherite Sword
    public static JsonObject createDullNetheriteSwordUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_netherite_sword");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:netherite_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":swords/" + material + "_netherite_sword");
        json.add("result", result);
        return json;
    }

    // Netherite Pickaxe
    public static JsonObject createDullNetheritePickaxeUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_netherite_pickaxe");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:netherite_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":pickaxes/" + material + "_netherite_pickaxe");
        json.add("result", result);
        return json;
    }

    // Netherite Shovel
    public static JsonObject createDullNetheriteShovelUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_netherite_shovel");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:netherite_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":shovels/" + material + "_netherite_shovel");
        json.add("result", result);
        return json;
    }

    // Netherite Hoe
    public static JsonObject createDullNetheriteHoeUpgradeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject base = new JsonObject();
        base.addProperty("item", "expert_weapons:vsascompat/dull_" + material + "_netherite_hoe");
        json.add("base", base);
        JsonObject addition = new JsonObject();
        addition.addProperty("item", "expert_weapons:netherite_whetstone");
        json.add("addition", addition);
        JsonObject result = new JsonObject();
        result.addProperty("item",MOD_ID + ":hoes/" + material + "_netherite_hoe");
        json.add("result", result);
        return json;
    }
}
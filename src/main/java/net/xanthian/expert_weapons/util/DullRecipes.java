package net.xanthian.expert_weapons.util;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import static net.xanthian.vsas.Init.MOD_ID;

public class DullRecipes {

    // Iron Axe
    public static JsonObject createDullIronAxeRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  H");
        pattern.add(" N ");
        pattern.add("T  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_iron_axe_head");
        keyList.add("H", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:tool_fastener");
        keyList.add("N", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_tool_handle");
        keyList.add("T", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_" + material + "_iron_axe");
        json.add("result", result);
        return json;
    }

    // Iron Sword
    public static JsonObject createDullIronSwordRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  B");
        pattern.add(" G ");
        pattern.add("H  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_iron_blade");
        keyList.add("B", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:iron_guard");
        keyList.add("G", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_sword_hilt");
        keyList.add("H", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_"  + material + "_iron_sword");
        json.add("result", result);
        return json;
    }

    // Iron Pickaxe
    public static JsonObject createDullIronPickaxeRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  H");
        pattern.add(" N ");
        pattern.add("T  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_iron_pickaxe_head");
        keyList.add("H", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:tool_fastener");
        keyList.add("N", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_tool_handle");
        keyList.add("T", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_" + material + "_iron_pickaxe");
        json.add("result", result);
        return json;
    }

    // Iron Shovel
    public static JsonObject createDullIronShovelRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  H");
        pattern.add(" N ");
        pattern.add("T  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_iron_shovel_head");
        keyList.add("H", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:tool_fastener");
        keyList.add("N", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_tool_handle");
        keyList.add("T", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_"  + material + "_iron_shovel");
        json.add("result", result);
        return json;
    }

    // Iron Hoe
    public static JsonObject createDullIronHoeRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  H");
        pattern.add(" N ");
        pattern.add("T  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_iron_hoe_head");
        keyList.add("H", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:tool_fastener");
        keyList.add("N", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_tool_handle");
        keyList.add("T", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_"  + material + "_iron_hoe");
        json.add("result", result);
        return json;
    }

    // Golden Axe
    public static JsonObject createDullGoldenAxeRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  H");
        pattern.add(" N ");
        pattern.add("T  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_golden_axe_head");
        keyList.add("H", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:tool_fastener");
        keyList.add("N", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_tool_handle");
        keyList.add("T", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_"  + material + "_golden_axe");
        json.add("result", result);
        return json;
    }

    // Golden Sword
    public static JsonObject createDullGoldenSwordRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  B");
        pattern.add(" G ");
        pattern.add("H  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_golden_blade");
        keyList.add("B", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:golden_guard");
        keyList.add("G", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_sword_hilt");
        keyList.add("H", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_"  + material + "_golden_sword");
        json.add("result", result);
        return json;
    }

    // Golden Pickaxe
    public static JsonObject createDullGoldenPickaxeRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  H");
        pattern.add(" N ");
        pattern.add("T  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_golden_pickaxe_head");
        keyList.add("H", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:tool_fastener");
        keyList.add("N", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_tool_handle");
        keyList.add("T", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_"  + material + "_golden_pickaxe");
        json.add("result", result);
        return json;
    }

    // Golden Shovel
    public static JsonObject createDullGoldenShovelRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  H");
        pattern.add(" N ");
        pattern.add("T  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_golden_shovel_head");
        keyList.add("H", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:tool_fastener");
        keyList.add("N", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_tool_handle");
        keyList.add("T", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_" + material + "_golden_shovel");
        json.add("result", result);
        return json;
    }

    // Golden Hoe
    public static JsonObject createDullGoldenHoeRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  H");
        pattern.add(" N ");
        pattern.add("T  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_golden_hoe_head");
        keyList.add("H", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:tool_fastener");
        keyList.add("N", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_tool_handle");
        keyList.add("T", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_" + material + "_golden_hoe");
        json.add("result", result);
        return json;
    }

    // Diamond Axe
    public static JsonObject createDullDiamondAxeRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  H");
        pattern.add(" N ");
        pattern.add("T  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_diamond_axe_head");
        keyList.add("H", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:tool_fastener");
        keyList.add("N", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_tool_handle");
        keyList.add("T", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_"  + material + "_diamond_axe");
        json.add("result", result);
        return json;
    }

    // Diamond Sword
    public static JsonObject createDullDiamondSwordRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  B");
        pattern.add(" G ");
        pattern.add("H  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_diamond_blade");
        keyList.add("B", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:diamond_guard");
        keyList.add("G", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_sword_hilt");
        keyList.add("H", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_" + material + "_diamond_sword");
        json.add("result", result);
        return json;
    }

    // Diamond Pickaxe
    public static JsonObject createDullDiamondPickaxeRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  H");
        pattern.add(" N ");
        pattern.add("T  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_diamond_pickaxe_head");
        keyList.add("H", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:tool_fastener");
        keyList.add("N", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_tool_handle");
        keyList.add("T", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_"  + material + "_diamond_pickaxe");
        json.add("result", result);
        return json;
    }

    // Diamond Shovel
    public static JsonObject createDullDiamondShovelRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  H");
        pattern.add(" N ");
        pattern.add("T  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_diamond_shovel_head");
        keyList.add("H", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:tool_fastener");
        keyList.add("N", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_tool_handle");
        keyList.add("T", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_" + material + "_diamond_shovel");
        json.add("result", result);
        return json;
    }

    // Diamond Hoe
    public static JsonObject createDullDiamondHoeRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  H");
        pattern.add(" N ");
        pattern.add("T  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_diamond_hoe_head");
        keyList.add("H", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:tool_fastener");
        keyList.add("N", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_tool_handle");
        keyList.add("T", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_"  + material + "_diamond_hoe");
        json.add("result", result);
        return json;
    }

    // Netherite Axe
    public static JsonObject createDullNetheriteAxeRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  H");
        pattern.add(" N ");
        pattern.add("T  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_netherite_axe_head");
        keyList.add("H", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:tool_fastener");
        keyList.add("N", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_tool_handle");
        keyList.add("T", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_"  + material + "_netherite_axe");
        json.add("result", result);
        return json;
    }

    // Netherite Sword
    public static JsonObject createDullNetheriteSwordRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  B");
        pattern.add(" G ");
        pattern.add("H  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_netherite_blade");
        keyList.add("B", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:netherite_guard");
        keyList.add("G", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_sword_hilt");
        keyList.add("H", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_"  + material + "_netherite_sword");
        json.add("result", result);
        return json;
    }

    // Netherite Pickaxe
    public static JsonObject createDullNetheritePickaxeRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  H");
        pattern.add(" N ");
        pattern.add("T  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_netherite_pickaxe_head");
        keyList.add("H", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:tool_fastener");
        keyList.add("N", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_tool_handle");
        keyList.add("T", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_"  + material + "_netherite_pickaxe");
        json.add("result", result);
        return json;
    }

    // Netherite Shovel
    public static JsonObject createDullNetheriteShovelRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  H");
        pattern.add(" N ");
        pattern.add("T  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_netherite_shovel_head");
        keyList.add("H", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:tool_fastener");
        keyList.add("N", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_tool_handle");
        keyList.add("T", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_"  + material + "_netherite_shovel");
        json.add("result", result);
        return json;
    }

    // Netherite Hoe
    public static JsonObject createDullNetheriteHoeRecipeJson(String material, String[] mods) {
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
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  H");
        pattern.add(" N ");
        pattern.add("T  ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:dull_netherite_hoe_head");
        keyList.add("H", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:tool_fastener");
        keyList.add("N", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "expert_weapons:vsascompat/" +material + "_tool_handle");
        keyList.add("T", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item","expert_weapons:vsascompat/dull_"  + material + "_netherite_hoe");
        json.add("result", result);
        return json;
    }
}
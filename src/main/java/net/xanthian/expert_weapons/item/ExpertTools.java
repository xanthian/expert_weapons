package net.xanthian.expert_weapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import net.xanthian.expert_weapons.Initialize_Mod;

import java.util.List;


public class ExpertTools {

    //Generic Parts
    public static final Item TOOL_FASTENER = registerItem("tool_fastener",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)){
    //Tooltip
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.export_weapons.nail_duh").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
});
    public static final Item TOOL_HANDLE = registerItem("tool_handle",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));

    //IRON Tools
    public static final Item SHARPENED_IRON_AXE_HEAD = registerItem("sharpened_iron_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item SHARPENED_IRON_HOE_HEAD = registerItem("sharpened_iron_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item SHARPENED_IRON_PICKAXE_HEAD = registerItem("sharpened_iron_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item SHARPENED_IRON_SHOVEL_HEAD = registerItem("sharpened_iron_shovel_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));

    //GOLDEN Tools
    public static final Item SHARPENED_GOLDEN_AXE_HEAD = registerItem("sharpened_golden_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item SHARPENED_GOLDEN_HOE_HEAD = registerItem("sharpened_golden_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item SHARPENED_GOLDEN_PICKAXE_HEAD = registerItem("sharpened_golden_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item SHARPENED_GOLDEN_SHOVEL_HEAD = registerItem("sharpened_golden_shovel_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));

    //DIAMOND Tools
    public static final Item SHARPENED_DIAMOND_AXE_HEAD = registerItem("sharpened_diamond_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item SHARPENED_DIAMOND_HOE_HEAD = registerItem("sharpened_diamond_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item SHARPENED_DIAMOND_PICKAXE_HEAD = registerItem("sharpened_diamond_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item SHARPENED_DIAMOND_SHOVEL_HEAD = registerItem("sharpened_diamond_shovel_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));

    //NETHERITE Tools
    public static final Item SHARPENED_NETHERITE_AXE_HEAD = registerItem("sharpened_netherite_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item SHARPENED_NETHERITE_HOE_HEAD = registerItem("sharpened_netherite_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item SHARPENED_NETHERITE_PICKAXE_HEAD = registerItem("sharpened_netherite_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item SHARPENED_NETHERITE_SHOVEL_HEAD = registerItem("sharpened_netherite_shovel_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));

    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {}
}
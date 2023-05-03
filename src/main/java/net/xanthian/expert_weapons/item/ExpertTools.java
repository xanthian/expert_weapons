package net.xanthian.expert_weapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.world.World;

import net.xanthian.expert_weapons.Initialize_Mod;
import net.xanthian.expert_weapons.item.DullItems.*;


import java.util.List;


public class ExpertTools {

    //Generic Parts
    public static final Item TOOL_FASTENER = registerItem("tool_fastener",
            new Item(new FabricItemSettings()){
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.nail_duh").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item TOOL_HANDLE = registerItem("tool_handle",
            new Item(new FabricItemSettings()));

    //IRON Tools
    public static final Item DULL_IRON_AXE_HEAD = registerItem("dull_iron_axe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_IRON_AXE_HEAD = registerItem("sharpened_iron_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_IRON_AXE = registerItem("dull_iron_axe",
            new DullAxeItem(ToolMaterials.IRON,6,-3.1f));

    public static final Item DULL_IRON_HOE_HEAD = registerItem("dull_iron_hoe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_IRON_HOE_HEAD = registerItem("sharpened_iron_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_IRON_HOE = registerItem("dull_iron_hoe",
            new DullHoeItem(ToolMaterials.IRON,-2,-1f));

    public static final Item DULL_IRON_PICKAXE_HEAD = registerItem("dull_iron_pickaxe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_IRON_PICKAXE_HEAD = registerItem("sharpened_iron_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_IRON_PICKAXE = registerItem("dull_iron_pickaxe",
            new DullPickaxeItem(ToolMaterials.IRON,1,-2.8f));

    public static final Item DULL_IRON_SHOVEL_HEAD = registerItem("dull_iron_shovel_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_IRON_SHOVEL_HEAD = registerItem("sharpened_iron_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_IRON_SHOVEL = registerItem("dull_iron_shovel",
            new DullShovelItem(ToolMaterials.IRON,1.5f,-3f));


    //GOLDEN Tools
    public static final Item DULL_GOLDEN_AXE_HEAD = registerItem("dull_golden_axe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_GOLDEN_AXE_HEAD = registerItem("sharpened_golden_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_GOLDEN_AXE = registerItem("dull_golden_axe",
            new DullAxeItem(ToolMaterials.GOLD,6,-3f));

    public static final Item DULL_GOLDEN_HOE_HEAD = registerItem("dull_golden_hoe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_GOLDEN_HOE_HEAD = registerItem("sharpened_golden_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_GOLDEN_HOE = registerItem("dull_golden_hoe",
            new DullHoeItem(ToolMaterials.GOLD,0,-3f));

    public static final Item DULL_GOLDEN_PICKAXE_HEAD = registerItem("dull_golden_pickaxe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_GOLDEN_PICKAXE_HEAD = registerItem("sharpened_golden_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_GOLDEN_PICKAXE = registerItem("dull_golden_pickaxe",
            new DullPickaxeItem(ToolMaterials.GOLD,1,-2.8f));

    public static final Item DULL_GOLDEN_SHOVEL_HEAD = registerItem("dull_golden_shovel_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_GOLDEN_SHOVEL_HEAD = registerItem("sharpened_golden_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_GOLDEN_SHOVEL = registerItem("dull_golden_shovel",
            new DullShovelItem(ToolMaterials.GOLD,1.5f,-3f));

    //DIAMOND Tools
    public static final Item DULL_DIAMOND_AXE_HEAD = registerItem("dull_diamond_axe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_DIAMOND_AXE_HEAD = registerItem("sharpened_diamond_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_DIAMOND_AXE = registerItem("dull_diamond_axe",
            new DullAxeItem(ToolMaterials.DIAMOND,5,-3f));

    public static final Item DULL_DIAMOND_HOE_HEAD = registerItem("dull_diamond_hoe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_DIAMOND_HOE_HEAD = registerItem("sharpened_diamond_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_DIAMOND_HOE = registerItem("dull_diamond_hoe",
            new DullHoeItem(ToolMaterials.DIAMOND,-3,0f));

    public static final Item DULL_DIAMOND_PICKAXE_HEAD = registerItem("dull_diamond_pickaxe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_DIAMOND_PICKAXE_HEAD = registerItem("sharpened_diamond_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_DIAMOND_PICKAXE = registerItem("dull_diamond_pickaxe",
            new DullPickaxeItem(ToolMaterials.DIAMOND,1,-2.8f));

    public static final Item DULL_DIAMOND_SHOVEL_HEAD = registerItem("dull_diamond_shovel_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_DIAMOND_SHOVEL_HEAD = registerItem("sharpened_diamond_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_DIAMOND_SHOVEL = registerItem("dull_diamond_shovel",
            new DullShovelItem(ToolMaterials.DIAMOND,1.5f,-3f));

    //NETHERITE Tools
    public static final Item DULL_NETHERITE_AXE_HEAD = registerItem("dull_netherite_axe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_NETHERITE_AXE_HEAD = registerItem("sharpened_netherite_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_AXE = registerItem("dull_netherite_axe",
            new DullAxeItem(ToolMaterials.NETHERITE,5,-3f));

    public static final Item DULL_NETHERITE_HOE_HEAD = registerItem("dull_netherite_hoe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_NETHERITE_HOE_HEAD = registerItem("sharpened_netherite_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_HOE = registerItem("dull_netherite_hoe",
            new DullHoeItem(ToolMaterials.NETHERITE,-4,0f));

    public static final Item DULL_NETHERITE_PICKAXE_HEAD = registerItem("dull_netherite_pickaxe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_NETHERITE_PICKAXE_HEAD = registerItem("sharpened_netherite_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_PICKAXE = registerItem("dull_netherite_pickaxe",
            new DullPickaxeItem(ToolMaterials.NETHERITE,1,-2.8f));

    public static final Item DULL_NETHERITE_SHOVEL_HEAD = registerItem("dull_netherite_shovel_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_NETHERITE_SHOVEL_HEAD = registerItem("sharpened_netherite_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_SHOVEL = registerItem("dull_netherite_shovel",
            new DullShovelItem(ToolMaterials.NETHERITE,1.5f,-3f));

    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup(TOOL_FASTENER);
        addToItemGroup(TOOL_HANDLE);
        addToItemGroup(DULL_IRON_AXE_HEAD);
        addToItemGroup(SHARPENED_IRON_AXE_HEAD);
        addToItemGroup(DULL_IRON_AXE);
        addToItemGroup(DULL_IRON_HOE_HEAD);
        addToItemGroup(SHARPENED_IRON_HOE_HEAD);
        addToItemGroup(DULL_IRON_HOE);
        addToItemGroup(DULL_IRON_PICKAXE_HEAD);
        addToItemGroup(SHARPENED_IRON_PICKAXE_HEAD);
        addToItemGroup(DULL_IRON_PICKAXE);
        addToItemGroup(DULL_IRON_SHOVEL_HEAD);
        addToItemGroup(SHARPENED_IRON_SHOVEL_HEAD);
        addToItemGroup(DULL_IRON_SHOVEL);
        addToItemGroup(DULL_GOLDEN_AXE_HEAD);
        addToItemGroup(SHARPENED_GOLDEN_AXE_HEAD);
        addToItemGroup(DULL_GOLDEN_AXE);
        addToItemGroup(DULL_GOLDEN_HOE_HEAD);
        addToItemGroup(SHARPENED_NETHERITE_PICKAXE_HEAD);
        addToItemGroup(SHARPENED_GOLDEN_HOE_HEAD);
        addToItemGroup(DULL_GOLDEN_HOE);
        addToItemGroup(DULL_GOLDEN_PICKAXE_HEAD);
        addToItemGroup(SHARPENED_GOLDEN_PICKAXE_HEAD);
        addToItemGroup(DULL_GOLDEN_PICKAXE);
        addToItemGroup(DULL_GOLDEN_SHOVEL_HEAD);
        addToItemGroup(SHARPENED_GOLDEN_SHOVEL_HEAD);
        addToItemGroup(DULL_GOLDEN_SHOVEL);
        addToItemGroup(DULL_DIAMOND_AXE_HEAD);
        addToItemGroup(SHARPENED_DIAMOND_AXE_HEAD);
        addToItemGroup(DULL_DIAMOND_AXE);
        addToItemGroup(DULL_DIAMOND_HOE_HEAD);
        addToItemGroup(SHARPENED_DIAMOND_HOE_HEAD);
        addToItemGroup(DULL_DIAMOND_HOE);
        addToItemGroup(DULL_DIAMOND_PICKAXE_HEAD);
        addToItemGroup(SHARPENED_DIAMOND_PICKAXE_HEAD);
        addToItemGroup(DULL_DIAMOND_PICKAXE);
        addToItemGroup(DULL_DIAMOND_SHOVEL_HEAD);
        addToItemGroup(SHARPENED_DIAMOND_SHOVEL_HEAD);
        addToItemGroup(DULL_DIAMOND_SHOVEL);
        addToItemGroup(DULL_NETHERITE_AXE_HEAD);
        addToItemGroup(SHARPENED_NETHERITE_AXE_HEAD);
        addToItemGroup(DULL_NETHERITE_AXE);
        addToItemGroup(DULL_NETHERITE_HOE_HEAD);
        addToItemGroup(SHARPENED_NETHERITE_HOE_HEAD);
        addToItemGroup(DULL_NETHERITE_HOE);
        addToItemGroup(DULL_NETHERITE_PICKAXE_HEAD);
        addToItemGroup(DULL_NETHERITE_PICKAXE);
        addToItemGroup(DULL_NETHERITE_SHOVEL_HEAD);
        addToItemGroup(SHARPENED_NETHERITE_SHOVEL_HEAD);
        addToItemGroup(DULL_NETHERITE_SHOVEL);
    }

    private static void addToItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(Initialize_Mod.EXPERT_TOOLS).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}
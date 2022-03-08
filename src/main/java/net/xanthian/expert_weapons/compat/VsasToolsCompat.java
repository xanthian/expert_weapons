package net.xanthian.expert_weapons.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.xanthian.expert_weapons.Initialize_Mod;
import net.xanthian.expert_weapons.item.Custom.AxeItem;
import net.xanthian.expert_weapons.item.Custom.HoeItem;
import net.xanthian.expert_weapons.item.Custom.PickaxeItem;
import net.xanthian.expert_weapons.item.ExpertGroup;
import net.xanthian.expert_weapons.materials.DullMaterials;

import java.util.List;

public class VsasToolsCompat {

    //Generic Parts
    public static final Item ACACIA_TOOL_HANDLE = registerItem("vsascompat/acacia_tool_handle",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS)));
    public static final Item BIRCH_TOOL_HANDLE = registerItem("vsascompat/birch_tool_handle",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS)));
    public static final Item CRIMSON_TOOL_HANDLE = registerItem("vsascompat/crimson_tool_handle",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS)));
    public static final Item DARK_OAK_TOOL_HANDLE = registerItem("vsascompat/dark_oak_tool_handle",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS)));
    public static final Item JUNGLE_TOOL_HANDLE = registerItem("vsascompat/jungle_tool_handle",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS)));
    public static final Item OAK_TOOL_HANDLE = registerItem("vsascompat/oak_tool_handle",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS)));
    public static final Item SPRUCE_TOOL_HANDLE = registerItem("vsascompat/spruce_tool_handle",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS)));
    public static final Item WARPED_TOOL_HANDLE = registerItem("vsascompat/warped_tool_handle",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS)));

    // Acacia
    public static final Item DULL_ACACIA_IRON_AXE = registerItem("vsascompat/dull_acacia_iron_axe",
            new AxeItem(DullMaterials.DULL_IRON,6,-3.1f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_ACACIA_IRON_HOE = registerItem("vsascompat/dull_acacia_iron_hoe",
            new HoeItem(DullMaterials.DULL_IRON,-2,-1f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_ACACIA_IRON_PICKAXE = registerItem("vsascompat/dull_acacia_iron_pickaxe",
            new PickaxeItem(DullMaterials.DULL_IRON,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_ACACIA_IRON_SHOVEL = registerItem("vsascompat/dull_acacia_iron_shovel",
            new ShovelItem(DullMaterials.DULL_IRON,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_ACACIA_GOLDEN_AXE = registerItem("vsascompat/dull_acacia_golden_axe",
            new AxeItem(DullMaterials.DULL_GOLDEN,6,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_ACACIA_GOLDEN_HOE = registerItem("vsascompat/dull_acacia_golden_hoe",
            new HoeItem(DullMaterials.DULL_GOLDEN,0,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_ACACIA_GOLDEN_PICKAXE = registerItem("vsascompat/dull_acacia_golden_pickaxe",
            new PickaxeItem(DullMaterials.DULL_GOLDEN,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_ACACIA_GOLDEN_SHOVEL = registerItem("vsascompat/dull_acacia_golden_shovel",
            new ShovelItem(DullMaterials.DULL_GOLDEN,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_ACACIA_DIAMOND_AXE = registerItem("vsascompat/dull_acacia_diamond_axe",
            new AxeItem(DullMaterials.DULL_DIAMOND,5,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_ACACIA_DIAMOND_HOE = registerItem("vsascompat/dull_acacia_diamond_hoe",
            new HoeItem(DullMaterials.DULL_DIAMOND,-3,0f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_ACACIA_DIAMOND_PICKAXE = registerItem("vsascompat/dull_acacia_diamond_pickaxe",
            new PickaxeItem(DullMaterials.DULL_DIAMOND,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_ACACIA_DIAMOND_SHOVEL = registerItem("vsascompat/dull_acacia_diamond_shovel",
            new ShovelItem(DullMaterials.DULL_DIAMOND,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_ACACIA_NETHERITE_AXE = registerItem("vsascompat/dull_acacia_netherite_axe",
            new AxeItem(DullMaterials.DULL_NETHERITE,5,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_ACACIA_NETHERITE_HOE = registerItem("vsascompat/dull_acacia_netherite_hoe",
            new HoeItem(DullMaterials.DULL_NETHERITE,-4,0f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_ACACIA_NETHERITE_PICKAXE = registerItem("vsascompat/dull_acacia_netherite_pickaxe",
            new PickaxeItem(DullMaterials.DULL_NETHERITE,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_ACACIA_NETHERITE_SHOVEL = registerItem("vsascompat/dull_acacia_netherite_shovel",
            new ShovelItem(DullMaterials.DULL_NETHERITE,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    // Birch
    public static final Item DULL_BIRCH_IRON_AXE = registerItem("vsascompat/dull_birch_iron_axe",
            new AxeItem(DullMaterials.DULL_IRON,6,-3.1f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_BIRCH_IRON_HOE = registerItem("vsascompat/dull_birch_iron_hoe",
            new HoeItem(DullMaterials.DULL_IRON,-2,-1f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_BIRCH_IRON_PICKAXE = registerItem("vsascompat/dull_birch_iron_pickaxe",
            new PickaxeItem(DullMaterials.DULL_IRON,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_BIRCH_IRON_SHOVEL = registerItem("vsascompat/dull_birch_iron_shovel",
            new ShovelItem(DullMaterials.DULL_IRON,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_BIRCH_GOLDEN_AXE = registerItem("vsascompat/dull_birch_golden_axe",
            new AxeItem(DullMaterials.DULL_GOLDEN,6,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_BIRCH_GOLDEN_HOE = registerItem("vsascompat/dull_birch_golden_hoe",
            new HoeItem(DullMaterials.DULL_GOLDEN,0,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_BIRCH_GOLDEN_PICKAXE = registerItem("vsascompat/dull_birch_golden_pickaxe",
            new PickaxeItem(DullMaterials.DULL_GOLDEN,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_BIRCH_GOLDEN_SHOVEL = registerItem("vsascompat/dull_birch_golden_shovel",
            new ShovelItem(DullMaterials.DULL_GOLDEN,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_BIRCH_DIAMOND_AXE = registerItem("vsascompat/dull_birch_diamond_axe",
            new AxeItem(DullMaterials.DULL_DIAMOND,5,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_BIRCH_DIAMOND_HOE = registerItem("vsascompat/dull_birch_diamond_hoe",
            new HoeItem(DullMaterials.DULL_DIAMOND,-3,0f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_BIRCH_DIAMOND_PICKAXE = registerItem("vsascompat/dull_birch_diamond_pickaxe",
            new PickaxeItem(DullMaterials.DULL_DIAMOND,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_BIRCH_DIAMOND_SHOVEL = registerItem("vsascompat/dull_birch_diamond_shovel",
            new ShovelItem(DullMaterials.DULL_DIAMOND,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_BIRCH_NETHERITE_AXE = registerItem("vsascompat/dull_birch_netherite_axe",
            new AxeItem(DullMaterials.DULL_NETHERITE,5,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_BIRCH_NETHERITE_HOE = registerItem("vsascompat/dull_birch_netherite_hoe",
            new HoeItem(DullMaterials.DULL_NETHERITE,-4,0f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_BIRCH_NETHERITE_PICKAXE = registerItem("vsascompat/dull_birch_netherite_pickaxe",
            new PickaxeItem(DullMaterials.DULL_NETHERITE,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_BIRCH_NETHERITE_SHOVEL = registerItem("vsascompat/dull_birch_netherite_shovel",
            new ShovelItem(DullMaterials.DULL_NETHERITE,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    // Crimson
    public static final Item DULL_CRIMSON_IRON_AXE = registerItem("vsascompat/dull_crimson_iron_axe",
            new AxeItem(DullMaterials.DULL_IRON,6,-3.1f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_CRIMSON_IRON_HOE = registerItem("vsascompat/dull_crimson_iron_hoe",
            new HoeItem(DullMaterials.DULL_IRON,-2,-1f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_CRIMSON_IRON_PICKAXE = registerItem("vsascompat/dull_crimson_iron_pickaxe",
            new PickaxeItem(DullMaterials.DULL_IRON,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_CRIMSON_IRON_SHOVEL = registerItem("vsascompat/dull_crimson_iron_shovel",
            new ShovelItem(DullMaterials.DULL_IRON,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_CRIMSON_GOLDEN_AXE = registerItem("vsascompat/dull_crimson_golden_axe",
            new AxeItem(DullMaterials.DULL_GOLDEN,6,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_CRIMSON_GOLDEN_HOE = registerItem("vsascompat/dull_crimson_golden_hoe",
            new HoeItem(DullMaterials.DULL_GOLDEN,0,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_CRIMSON_GOLDEN_PICKAXE = registerItem("vsascompat/dull_crimson_golden_pickaxe",
            new PickaxeItem(DullMaterials.DULL_GOLDEN,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_CRIMSON_GOLDEN_SHOVEL = registerItem("vsascompat/dull_crimson_golden_shovel",
            new ShovelItem(DullMaterials.DULL_GOLDEN,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_CRIMSON_DIAMOND_AXE = registerItem("vsascompat/dull_crimson_diamond_axe",
            new AxeItem(DullMaterials.DULL_DIAMOND,5,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_CRIMSON_DIAMOND_HOE = registerItem("vsascompat/dull_crimson_diamond_hoe",
            new HoeItem(DullMaterials.DULL_DIAMOND,-3,0f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_CRIMSON_DIAMOND_PICKAXE = registerItem("vsascompat/dull_crimson_diamond_pickaxe",
            new PickaxeItem(DullMaterials.DULL_DIAMOND,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_CRIMSON_DIAMOND_SHOVEL = registerItem("vsascompat/dull_crimson_diamond_shovel",
            new ShovelItem(DullMaterials.DULL_DIAMOND,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_CRIMSON_NETHERITE_AXE = registerItem("vsascompat/dull_crimson_netherite_axe",
            new AxeItem(DullMaterials.DULL_NETHERITE,5,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_CRIMSON_NETHERITE_HOE = registerItem("vsascompat/dull_crimson_netherite_hoe",
            new HoeItem(DullMaterials.DULL_NETHERITE,-4,0f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_CRIMSON_NETHERITE_PICKAXE = registerItem("vsascompat/dull_crimson_netherite_pickaxe",
            new PickaxeItem(DullMaterials.DULL_NETHERITE,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_CRIMSON_NETHERITE_SHOVEL = registerItem("vsascompat/dull_crimson_netherite_shovel",
            new ShovelItem(DullMaterials.DULL_NETHERITE,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    // Dark_oak
    public static final Item DULL_DARK_OAK_IRON_AXE = registerItem("vsascompat/dull_dark_oak_iron_axe",
            new AxeItem(DullMaterials.DULL_IRON,6,-3.1f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DARK_OAK_IRON_HOE = registerItem("vsascompat/dull_dark_oak_iron_hoe",
            new HoeItem(DullMaterials.DULL_IRON,-2,-1f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DARK_OAK_IRON_PICKAXE = registerItem("vsascompat/dull_dark_oak_iron_pickaxe",
            new PickaxeItem(DullMaterials.DULL_IRON,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DARK_OAK_IRON_SHOVEL = registerItem("vsascompat/dull_dark_oak_iron_shovel",
            new ShovelItem(DullMaterials.DULL_IRON,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_DARK_OAK_GOLDEN_AXE = registerItem("vsascompat/dull_dark_oak_golden_axe",
            new AxeItem(DullMaterials.DULL_GOLDEN,6,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DARK_OAK_GOLDEN_HOE = registerItem("vsascompat/dull_dark_oak_golden_hoe",
            new HoeItem(DullMaterials.DULL_GOLDEN,0,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DARK_OAK_GOLDEN_PICKAXE = registerItem("vsascompat/dull_dark_oak_golden_pickaxe",
            new PickaxeItem(DullMaterials.DULL_GOLDEN,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DARK_OAK_GOLDEN_SHOVEL = registerItem("vsascompat/dull_dark_oak_golden_shovel",
            new ShovelItem(DullMaterials.DULL_GOLDEN,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_DARK_OAK_DIAMOND_AXE = registerItem("vsascompat/dull_dark_oak_diamond_axe",
            new AxeItem(DullMaterials.DULL_DIAMOND,5,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DARK_OAK_DIAMOND_HOE = registerItem("vsascompat/dull_dark_oak_diamond_hoe",
            new HoeItem(DullMaterials.DULL_DIAMOND,-3,0f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DARK_OAK_DIAMOND_PICKAXE = registerItem("vsascompat/dull_dark_oak_diamond_pickaxe",
            new PickaxeItem(DullMaterials.DULL_DIAMOND,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DARK_OAK_DIAMOND_SHOVEL = registerItem("vsascompat/dull_dark_oak_diamond_shovel",
            new ShovelItem(DullMaterials.DULL_DIAMOND,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DARK_OAK_NETHERITE_AXE = registerItem("vsascompat/dull_dark_oak_netherite_axe",
            new AxeItem(DullMaterials.DULL_NETHERITE,5,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DARK_OAK_NETHERITE_HOE = registerItem("vsascompat/dull_dark_oak_netherite_hoe",
            new HoeItem(DullMaterials.DULL_NETHERITE,-4,0f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DARK_OAK_NETHERITE_PICKAXE = registerItem("vsascompat/dull_dark_oak_netherite_pickaxe",
            new PickaxeItem(DullMaterials.DULL_NETHERITE,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DARK_OAK_NETHERITE_SHOVEL = registerItem("vsascompat/dull_dark_oak_netherite_shovel",
            new ShovelItem(DullMaterials.DULL_NETHERITE,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    // Jungle
    public static final Item DULL_JUNGLE_IRON_AXE = registerItem("vsascompat/dull_jungle_iron_axe",
            new AxeItem(DullMaterials.DULL_IRON,6,-3.1f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_JUNGLE_IRON_HOE = registerItem("vsascompat/dull_jungle_iron_hoe",
            new HoeItem(DullMaterials.DULL_IRON,-2,-1f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_JUNGLE_IRON_PICKAXE = registerItem("vsascompat/dull_jungle_iron_pickaxe",
            new PickaxeItem(DullMaterials.DULL_IRON,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_JUNGLE_IRON_SHOVEL = registerItem("vsascompat/dull_jungle_iron_shovel",
            new ShovelItem(DullMaterials.DULL_IRON,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_JUNGLE_GOLDEN_AXE = registerItem("vsascompat/dull_jungle_golden_axe",
            new AxeItem(DullMaterials.DULL_GOLDEN,6,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_JUNGLE_GOLDEN_HOE = registerItem("vsascompat/dull_jungle_golden_hoe",
            new HoeItem(DullMaterials.DULL_GOLDEN,0,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_JUNGLE_GOLDEN_PICKAXE = registerItem("vsascompat/dull_jungle_golden_pickaxe",
            new PickaxeItem(DullMaterials.DULL_GOLDEN,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_JUNGLE_GOLDEN_SHOVEL = registerItem("vsascompat/dull_jungle_golden_shovel",
            new ShovelItem(DullMaterials.DULL_GOLDEN,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_JUNGLE_DIAMOND_AXE = registerItem("vsascompat/dull_jungle_diamond_axe",
            new AxeItem(DullMaterials.DULL_DIAMOND,5,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_JUNGLE_DIAMOND_HOE = registerItem("vsascompat/dull_jungle_diamond_hoe",
            new HoeItem(DullMaterials.DULL_DIAMOND,-3,0f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_JUNGLE_DIAMOND_PICKAXE = registerItem("vsascompat/dull_jungle_diamond_pickaxe",
            new PickaxeItem(DullMaterials.DULL_DIAMOND,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_JUNGLE_DIAMOND_SHOVEL = registerItem("vsascompat/dull_jungle_diamond_shovel",
            new ShovelItem(DullMaterials.DULL_DIAMOND,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_JUNGLE_NETHERITE_AXE = registerItem("vsascompat/dull_jungle_netherite_axe",
            new AxeItem(DullMaterials.DULL_NETHERITE,5,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_JUNGLE_NETHERITE_HOE = registerItem("vsascompat/dull_jungle_netherite_hoe",
            new HoeItem(DullMaterials.DULL_NETHERITE,-4,0f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_JUNGLE_NETHERITE_PICKAXE = registerItem("vsascompat/dull_jungle_netherite_pickaxe",
            new PickaxeItem(DullMaterials.DULL_NETHERITE,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_JUNGLE_NETHERITE_SHOVEL = registerItem("vsascompat/dull_jungle_netherite_shovel",
            new ShovelItem(DullMaterials.DULL_NETHERITE,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    // Oak
    public static final Item DULL_OAK_IRON_AXE = registerItem("vsascompat/dull_oak_iron_axe",
            new AxeItem(DullMaterials.DULL_IRON,6,-3.1f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_OAK_IRON_HOE = registerItem("vsascompat/dull_oak_iron_hoe",
            new HoeItem(DullMaterials.DULL_IRON,-2,-1f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_OAK_IRON_PICKAXE = registerItem("vsascompat/dull_oak_iron_pickaxe",
            new PickaxeItem(DullMaterials.DULL_IRON,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_OAK_IRON_SHOVEL = registerItem("vsascompat/dull_oak_iron_shovel",
            new ShovelItem(DullMaterials.DULL_IRON,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_OAK_GOLDEN_AXE = registerItem("vsascompat/dull_oak_golden_axe",
            new AxeItem(DullMaterials.DULL_GOLDEN,6,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_OAK_GOLDEN_HOE = registerItem("vsascompat/dull_oak_golden_hoe",
            new HoeItem(DullMaterials.DULL_GOLDEN,0,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_OAK_GOLDEN_PICKAXE = registerItem("vsascompat/dull_oak_golden_pickaxe",
            new PickaxeItem(DullMaterials.DULL_GOLDEN,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_OAK_GOLDEN_SHOVEL = registerItem("vsascompat/dull_oak_golden_shovel",
            new ShovelItem(DullMaterials.DULL_GOLDEN,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_OAK_DIAMOND_AXE = registerItem("vsascompat/dull_oak_diamond_axe",
            new AxeItem(DullMaterials.DULL_DIAMOND,5,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_OAK_DIAMOND_HOE = registerItem("vsascompat/dull_oak_diamond_hoe",
            new HoeItem(DullMaterials.DULL_DIAMOND,-3,0f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_OAK_DIAMOND_PICKAXE = registerItem("vsascompat/dull_oak_diamond_pickaxe",
            new PickaxeItem(DullMaterials.DULL_DIAMOND,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_OAK_DIAMOND_SHOVEL = registerItem("vsascompat/dull_oak_diamond_shovel",
            new ShovelItem(DullMaterials.DULL_DIAMOND,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_OAK_NETHERITE_AXE = registerItem("vsascompat/dull_oak_netherite_axe",
            new AxeItem(DullMaterials.DULL_NETHERITE,5,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_OAK_NETHERITE_HOE = registerItem("vsascompat/dull_oak_netherite_hoe",
            new HoeItem(DullMaterials.DULL_NETHERITE,-4,0f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_OAK_NETHERITE_PICKAXE = registerItem("vsascompat/dull_oak_netherite_pickaxe",
            new PickaxeItem(DullMaterials.DULL_NETHERITE,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_OAK_NETHERITE_SHOVEL = registerItem("vsascompat/dull_oak_netherite_shovel",
            new ShovelItem(DullMaterials.DULL_NETHERITE,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    // Spruce
    public static final Item DULL_SPRUCE_IRON_AXE = registerItem("vsascompat/dull_spruce_iron_axe",
            new AxeItem(DullMaterials.DULL_IRON,6,-3.1f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_SPRUCE_IRON_HOE = registerItem("vsascompat/dull_spruce_iron_hoe",
            new HoeItem(DullMaterials.DULL_IRON,-2,-1f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_SPRUCE_IRON_PICKAXE = registerItem("vsascompat/dull_spruce_iron_pickaxe",
            new PickaxeItem(DullMaterials.DULL_IRON,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_SPRUCE_IRON_SHOVEL = registerItem("vsascompat/dull_spruce_iron_shovel",
            new ShovelItem(DullMaterials.DULL_IRON,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_SPRUCE_GOLDEN_AXE = registerItem("vsascompat/dull_spruce_golden_axe",
            new AxeItem(DullMaterials.DULL_GOLDEN,6,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_SPRUCE_GOLDEN_HOE = registerItem("vsascompat/dull_spruce_golden_hoe",
            new HoeItem(DullMaterials.DULL_GOLDEN,0,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_SPRUCE_GOLDEN_PICKAXE = registerItem("vsascompat/dull_spruce_golden_pickaxe",
            new PickaxeItem(DullMaterials.DULL_GOLDEN,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_SPRUCE_GOLDEN_SHOVEL = registerItem("vsascompat/dull_spruce_golden_shovel",
            new ShovelItem(DullMaterials.DULL_GOLDEN,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_SPRUCE_DIAMOND_AXE = registerItem("vsascompat/dull_spruce_diamond_axe",
            new AxeItem(DullMaterials.DULL_DIAMOND,5,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_SPRUCE_DIAMOND_HOE = registerItem("vsascompat/dull_spruce_diamond_hoe",
            new HoeItem(DullMaterials.DULL_DIAMOND,-3,0f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_SPRUCE_DIAMOND_PICKAXE = registerItem("vsascompat/dull_spruce_diamond_pickaxe",
            new PickaxeItem(DullMaterials.DULL_DIAMOND,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_SPRUCE_DIAMOND_SHOVEL = registerItem("vsascompat/dull_spruce_diamond_shovel",
            new ShovelItem(DullMaterials.DULL_DIAMOND,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_SPRUCE_NETHERITE_AXE = registerItem("vsascompat/dull_spruce_netherite_axe",
            new AxeItem(DullMaterials.DULL_NETHERITE,5,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_SPRUCE_NETHERITE_HOE = registerItem("vsascompat/dull_spruce_netherite_hoe",
            new HoeItem(DullMaterials.DULL_NETHERITE,-4,0f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_SPRUCE_NETHERITE_PICKAXE = registerItem("vsascompat/dull_spruce_netherite_pickaxe",
            new PickaxeItem(DullMaterials.DULL_NETHERITE,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_SPRUCE_NETHERITE_SHOVEL = registerItem("vsascompat/dull_spruce_netherite_shovel",
            new ShovelItem(DullMaterials.DULL_NETHERITE,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    // Warped
    public static final Item DULL_WARPED_IRON_AXE = registerItem("vsascompat/dull_warped_iron_axe",
            new AxeItem(DullMaterials.DULL_IRON,6,-3.1f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_WARPED_IRON_HOE = registerItem("vsascompat/dull_warped_iron_hoe",
            new HoeItem(DullMaterials.DULL_IRON,-2,-1f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_WARPED_IRON_PICKAXE = registerItem("vsascompat/dull_warped_iron_pickaxe",
            new PickaxeItem(DullMaterials.DULL_IRON,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_WARPED_IRON_SHOVEL = registerItem("vsascompat/dull_warped_iron_shovel",
            new ShovelItem(DullMaterials.DULL_IRON,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_WARPED_GOLDEN_AXE = registerItem("vsascompat/dull_warped_golden_axe",
            new AxeItem(DullMaterials.DULL_GOLDEN,6,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_WARPED_GOLDEN_HOE = registerItem("vsascompat/dull_warped_golden_hoe",
            new HoeItem(DullMaterials.DULL_GOLDEN,0,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_WARPED_GOLDEN_PICKAXE = registerItem("vsascompat/dull_warped_golden_pickaxe",
            new PickaxeItem(DullMaterials.DULL_GOLDEN,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_WARPED_GOLDEN_SHOVEL = registerItem("vsascompat/dull_warped_golden_shovel",
            new ShovelItem(DullMaterials.DULL_GOLDEN,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_WARPED_DIAMOND_AXE = registerItem("vsascompat/dull_warped_diamond_axe",
            new AxeItem(DullMaterials.DULL_DIAMOND,5,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_WARPED_DIAMOND_HOE = registerItem("vsascompat/dull_warped_diamond_hoe",
            new HoeItem(DullMaterials.DULL_DIAMOND,-3,0f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_WARPED_DIAMOND_PICKAXE = registerItem("vsascompat/dull_warped_diamond_pickaxe",
            new PickaxeItem(DullMaterials.DULL_DIAMOND,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_WARPED_DIAMOND_SHOVEL = registerItem("vsascompat/dull_warped_diamond_shovel",
            new ShovelItem(DullMaterials.DULL_DIAMOND,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_WARPED_NETHERITE_AXE = registerItem("vsascompat/dull_warped_netherite_axe",
            new AxeItem(DullMaterials.DULL_NETHERITE,5,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_WARPED_NETHERITE_HOE = registerItem("vsascompat/dull_warped_netherite_hoe",
            new HoeItem(DullMaterials.DULL_NETHERITE,-4,0f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_WARPED_NETHERITE_PICKAXE = registerItem("vsascompat/dull_warped_netherite_pickaxe",
            new PickaxeItem(DullMaterials.DULL_NETHERITE,1,-2.8f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_WARPED_NETHERITE_SHOVEL = registerItem("vsascompat/dull_warped_netherite_shovel",
            new ShovelItem(DullMaterials.DULL_NETHERITE,1.5f,-3f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {}
}
package net.xanthian.expert_weapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import net.xanthian.expert_weapons.Initialize_Mod;

import java.util.List;


public class DullToolParts {

    //Dull Iron Tool Parts
    public static final Item DULL_IRON_PICKAXE_HEAD = registerItem("dull_iron_pickaxe_head",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_IRON_AXE_HEAD = registerItem("dull_iron_axe_head",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_IRON_SHOVEL_HEAD = registerItem("dull_iron_shovel_head",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_IRON_HOE_HEAD = registerItem("dull_iron_hoe_head",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });


    //Dull Golden Tool Parts
    public static final Item DULL_GOLDEN_PICKAXE_HEAD = registerItem("dull_golden_pickaxe_head",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_GOLDEN_AXE_HEAD = registerItem("dull_golden_axe_head",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_GOLDEN_SHOVEL_HEAD = registerItem("dull_golden_shovel_head",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_GOLDEN_HOE_HEAD = registerItem("dull_golden_hoe_head",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    //Dull Diamond Tool Parts
    public static final Item DULL_DIAMOND_PICKAXE_HEAD = registerItem("dull_diamond_pickaxe_head",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DIAMOND_AXE_HEAD = registerItem("dull_diamond_axe_head",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DIAMOND_SHOVEL_HEAD = registerItem("dull_diamond_shovel_head",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DIAMOND_HOE_HEAD = registerItem("dull_diamond_hoe_head",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    //Dull Netherite Tool Parts
    public static final Item DULL_NETHERITE_PICKAXE_HEAD = registerItem("dull_netherite_pickaxe_head",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_NETHERITE_AXE_HEAD = registerItem("dull_netherite_axe_head",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_NETHERITE_SHOVEL_HEAD = registerItem("dull_netherite_shovel_head",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_NETHERITE_HOE_HEAD = registerItem("dull_netherite_hoe_head",
            new Item(new FabricItemSettings().group(ExpertGroup.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {}
}
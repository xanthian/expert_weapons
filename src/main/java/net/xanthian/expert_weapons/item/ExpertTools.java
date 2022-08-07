package net.xanthian.expert_weapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import net.xanthian.expert_weapons.Initialize_Mod;
import net.xanthian.expert_weapons.item.Custom.AxeItem;
import net.xanthian.expert_weapons.item.Custom.HoeItem;
import net.xanthian.expert_weapons.item.Custom.PickaxeItem;
import net.xanthian.expert_weapons.materials.DullMaterials;

import java.util.List;


public class ExpertTools {

    //Generic Parts
    public static final Item TOOL_FASTENER = registerItem("tool_fastener",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)){
    //Tooltip
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.nail_duh").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
});
    public static final Item TOOL_HANDLE = registerItem("tool_handle",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));

    //IRON Tools
    public static final Item DULL_IRON_AXE_HEAD = registerItem("dull_iron_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_IRON_AXE_HEAD = registerItem("sharpened_iron_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_IRON_AXE = registerItem("dull_iron_axe",
            new AxeItem(DullMaterials.DULL_IRON,6,-3.1f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_IRON_HOE_HEAD = registerItem("dull_iron_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_IRON_HOE_HEAD = registerItem("sharpened_iron_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_IRON_HOE = registerItem("dull_iron_hoe",
            new HoeItem(DullMaterials.DULL_IRON,-2,-1f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_IRON_PICKAXE_HEAD = registerItem("dull_iron_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_IRON_PICKAXE_HEAD = registerItem("sharpened_iron_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_IRON_PICKAXE = registerItem("dull_iron_pickaxe",
            new PickaxeItem(DullMaterials.DULL_IRON,1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_IRON_SHOVEL_HEAD = registerItem("dull_iron_shovel_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_IRON_SHOVEL_HEAD = registerItem("sharpened_iron_shovel_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_IRON_SHOVEL = registerItem("dull_iron_shovel",
            new ShovelItem(DullMaterials.DULL_IRON,1.5f,-3f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });


    //GOLDEN Tools
    public static final Item DULL_GOLDEN_AXE_HEAD = registerItem("dull_golden_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_GOLDEN_AXE_HEAD = registerItem("sharpened_golden_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_GOLDEN_AXE = registerItem("dull_golden_axe",
            new AxeItem(DullMaterials.DULL_GOLDEN,6,-3f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_GOLDEN_HOE_HEAD = registerItem("dull_golden_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_GOLDEN_HOE_HEAD = registerItem("sharpened_golden_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_GOLDEN_HOE = registerItem("dull_golden_hoe",
            new HoeItem(DullMaterials.DULL_GOLDEN,0,-3f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_GOLDEN_PICKAXE_HEAD = registerItem("dull_golden_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_GOLDEN_PICKAXE_HEAD = registerItem("sharpened_golden_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_GOLDEN_PICKAXE = registerItem("dull_golden_pickaxe",
            new PickaxeItem(DullMaterials.DULL_GOLDEN,1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_GOLDEN_SHOVEL_HEAD = registerItem("dull_golden_shovel_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_GOLDEN_SHOVEL_HEAD = registerItem("sharpened_golden_shovel_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_GOLDEN_SHOVEL = registerItem("dull_golden_shovel",
            new ShovelItem(DullMaterials.DULL_GOLDEN,1.5f,-3f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    //DIAMOND Tools
    public static final Item DULL_DIAMOND_AXE_HEAD = registerItem("dull_diamond_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_DIAMOND_AXE_HEAD = registerItem("sharpened_diamond_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_DIAMOND_AXE = registerItem("dull_diamond_axe",
            new AxeItem(DullMaterials.DULL_DIAMOND,5,-3f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_DIAMOND_HOE_HEAD = registerItem("dull_diamond_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_DIAMOND_HOE_HEAD = registerItem("sharpened_diamond_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_DIAMOND_HOE = registerItem("dull_diamond_hoe",
            new HoeItem(DullMaterials.DULL_DIAMOND,-3,0f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_DIAMOND_PICKAXE_HEAD = registerItem("dull_diamond_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_DIAMOND_PICKAXE_HEAD = registerItem("sharpened_diamond_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_DIAMOND_PICKAXE = registerItem("dull_diamond_pickaxe",
            new PickaxeItem(DullMaterials.DULL_DIAMOND,1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_DIAMOND_SHOVEL_HEAD = registerItem("dull_diamond_shovel_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_DIAMOND_SHOVEL_HEAD = registerItem("sharpened_diamond_shovel_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_DIAMOND_SHOVEL = registerItem("dull_diamond_shovel",
            new ShovelItem(DullMaterials.DULL_DIAMOND,1.5f,-3f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    //NETHERITE Tools
    public static final Item DULL_NETHERITE_AXE_HEAD = registerItem("dull_netherite_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_NETHERITE_AXE_HEAD = registerItem("sharpened_netherite_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_NETHERITE_AXE = registerItem("dull_netherite_axe",
            new AxeItem(DullMaterials.DULL_NETHERITE,5,-3f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_NETHERITE_HOE_HEAD = registerItem("dull_netherite_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_NETHERITE_HOE_HEAD = registerItem("sharpened_netherite_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_NETHERITE_HOE = registerItem("dull_netherite_hoe",
            new HoeItem(DullMaterials.DULL_NETHERITE,-4,0f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_NETHERITE_PICKAXE_HEAD = registerItem("dull_netherite_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_NETHERITE_PICKAXE_HEAD = registerItem("sharpened_netherite_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_NETHERITE_PICKAXE = registerItem("dull_netherite_pickaxe",
            new PickaxeItem(DullMaterials.DULL_NETHERITE,1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    public static final Item DULL_NETHERITE_SHOVEL_HEAD = registerItem("dull_netherite_shovel_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_NETHERITE_SHOVEL_HEAD = registerItem("sharpened_netherite_shovel_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_NETHERITE_SHOVEL = registerItem("dull_netherite_shovel",
            new ShovelItem(DullMaterials.DULL_NETHERITE,1.5f,-3f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {}
}
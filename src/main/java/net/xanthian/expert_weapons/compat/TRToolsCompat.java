package net.xanthian.expert_weapons.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import net.xanthian.expert_weapons.Initialize_Mod;
import net.xanthian.expert_weapons.item.Custom.PickaxeItem;
import net.xanthian.expert_weapons.materials.DullMaterials;

import java.util.List;

public class TRToolsCompat {

    //Bronze
    //Axe
    public static final Item SHARPENED_BRONZE_AXE_HEAD = registerItem("trcompat/sharpened_bronze_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_BRONZE_AXE_HEAD = registerItem("trcompat/dull_bronze_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_BRONZE_AXE = registerItem("trcompat/dull_bronze_axe",
            new PickaxeItem(DullMaterials.DULL_BRONZE,1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    //Hoe
    public static final Item SHARPENED_BRONZE_HOE_HEAD = registerItem("trcompat/sharpened_bronze_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_BRONZE_HOE_HEAD = registerItem("trcompat/dull_bronze_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_BRONZE_HOE = registerItem("trcompat/dull_bronze_hoe",
            new PickaxeItem(DullMaterials.DULL_BRONZE,-1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    //Pickaxe
    public static final Item SHARPENED_BRONZE_PICKAXE_HEAD = registerItem("trcompat/sharpened_bronze_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_BRONZE_PICKAXE_HEAD = registerItem("trcompat/dull_bronze_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_BRONZE_PICKAXE = registerItem("trcompat/dull_bronze_pickaxe",
            new PickaxeItem(DullMaterials.DULL_BRONZE,0,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    //Shovel
    public static final Item SHARPENED_BRONZE_SPADE_HEAD = registerItem("trcompat/sharpened_bronze_spade_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_BRONZE_SPADE_HEAD = registerItem("trcompat/dull_bronze_spade_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_BRONZE_SPADE = registerItem("trcompat/dull_bronze_spade",
            new PickaxeItem(DullMaterials.DULL_BRONZE,0,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    //Peridot
    //Axe
    public static final Item SHARPENED_PERIDOT_AXE_HEAD = registerItem("trcompat/sharpened_peridot_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_PERIDOT_AXE_HEAD = registerItem("trcompat/dull_peridot_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_PERIDOT_AXE = registerItem("trcompat/dull_peridot_axe",
            new PickaxeItem(DullMaterials.DULL_PERIDOT,1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    //Hoe
    public static final Item SHARPENED_PERIDOT_HOE_HEAD = registerItem("trcompat/sharpened_peridot_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_PERIDOT_HOE_HEAD = registerItem("trcompat/dull_peridot_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_PERIDOT_HOE = registerItem("trcompat/dull_peridot_hoe",
            new PickaxeItem(DullMaterials.DULL_PERIDOT,-1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    //Pickaxe
    public static final Item SHARPENED_PERIDOT_PICKAXE_HEAD = registerItem("trcompat/sharpened_peridot_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_PERIDOT_PICKAXE_HEAD = registerItem("trcompat/dull_peridot_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_PERIDOT_PICKAXE = registerItem("trcompat/dull_peridot_pickaxe",
            new PickaxeItem(DullMaterials.DULL_PERIDOT, 1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    //Shovel
    public static final Item SHARPENED_PERIDOT_SPADE_HEAD = registerItem("trcompat/sharpened_peridot_spade_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_PERIDOT_SPADE_HEAD = registerItem("trcompat/dull_peridot_spade_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_PERIDOT_SPADE = registerItem("trcompat/dull_peridot_spade",
            new PickaxeItem(DullMaterials.DULL_PERIDOT,1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    //Ruby
    //Pickaxe
    //Axe
    public static final Item SHARPENED_RUBY_AXE_HEAD = registerItem("trcompat/sharpened_ruby_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_RUBY_AXE_HEAD = registerItem("trcompat/dull_ruby_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_RUBY_AXE = registerItem("trcompat/dull_ruby_axe",
            new PickaxeItem(DullMaterials.DULL_RUBY,1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    //Hoe
    public static final Item SHARPENED_RUBY_HOE_HEAD = registerItem("trcompat/sharpened_ruby_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_RUBY_HOE_HEAD = registerItem("trcompat/dull_ruby_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_RUBY_HOE = registerItem("trcompat/dull_ruby_hoe",
            new PickaxeItem(DullMaterials.DULL_RUBY,-1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_RUBY_PICKAXE_HEAD = registerItem("trcompat/sharpened_ruby_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_RUBY_PICKAXE_HEAD = registerItem("trcompat/dull_ruby_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_RUBY_PICKAXE = registerItem("trcompat/dull_ruby_pickaxe",
            new PickaxeItem(DullMaterials.DULL_RUBY,1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    //Shovel
    public static final Item SHARPENED_RUBY_SPADE_HEAD = registerItem("trcompat/sharpened_ruby_spade_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_RUBY_SPADE_HEAD = registerItem("trcompat/dull_ruby_spade_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_RUBY_SPADE = registerItem("trcompat/dull_ruby_spade",
            new PickaxeItem(DullMaterials.DULL_RUBY,1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    //Sapphire
      //Axe
    public static final Item SHARPENED_SAPPHIRE_AXE_HEAD = registerItem("trcompat/sharpened_sapphire_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_SAPPHIRE_AXE_HEAD = registerItem("trcompat/dull_sapphire_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_SAPPHIRE_AXE = registerItem("trcompat/dull_sapphire_axe",
            new PickaxeItem(DullMaterials.DULL_SAPPHIRE,1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    //Hoe
    public static final Item SHARPENED_SAPPHIRE_HOE_HEAD = registerItem("trcompat/sharpened_sapphire_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_SAPPHIRE_HOE_HEAD = registerItem("trcompat/dull_sapphire_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_SAPPHIRE_HOE = registerItem("trcompat/dull_sapphire_hoe",
            new PickaxeItem(DullMaterials.DULL_SAPPHIRE,-1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    //Pickaxe
    public static final Item SHARPENED_SAPPHIRE_PICKAXE_HEAD = registerItem("trcompat/sharpened_sapphire_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_SAPPHIRE_PICKAXE_HEAD = registerItem("trcompat/dull_sapphire_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_SAPPHIRE_PICKAXE = registerItem("trcompat/dull_sapphire_pickaxe",
            new PickaxeItem(DullMaterials.DULL_SAPPHIRE,1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    //Shovel
    public static final Item SHARPENED_SAPPHIRE_SPADE_HEAD = registerItem("trcompat/sharpened_sapphire_spade_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item DULL_SAPPHIRE_SPADE_HEAD = registerItem("trcompat/dull_sapphire_spade_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_SAPPHIRE_SPADE = registerItem("trcompat/dull_sapphire_spade",
            new PickaxeItem(DullMaterials.DULL_SAPPHIRE,1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
    }
}
package net.xanthian.expert_weapons.compat;

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
import techreborn.init.TRToolTier;

import java.util.List;

public class TRToolsCompat {

    //Bronze
    //Axe

    public static final Item DULL_BRONZE_AXE_HEAD = registerItem("trcompat/dull_bronze_axe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_BRONZE_AXE_HEAD = registerItem("trcompat/sharpened_bronze_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_BRONZE_AXE = registerItem("trcompat/dull_bronze_axe",
            new DullAxeItem(TRToolTier.BRONZE,1,-2.8f));
    //Hoe

    public static final Item DULL_BRONZE_HOE_HEAD = registerItem("trcompat/dull_bronze_hoe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_BRONZE_HOE_HEAD = registerItem("trcompat/sharpened_bronze_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_BRONZE_HOE = registerItem("trcompat/dull_bronze_hoe",
            new DullHoeItem(TRToolTier.BRONZE,-1,-2.8f));
    //Pickaxe

    public static final Item DULL_BRONZE_PICKAXE_HEAD = registerItem("trcompat/dull_bronze_pickaxe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_BRONZE_PICKAXE_HEAD = registerItem("trcompat/sharpened_bronze_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_BRONZE_PICKAXE = registerItem("trcompat/dull_bronze_pickaxe",
            new DullPickaxeItem(TRToolTier.BRONZE,0,-2.8f));
    //Shovel

    public static final Item DULL_BRONZE_SPADE_HEAD = registerItem("trcompat/dull_bronze_spade_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_BRONZE_SPADE_HEAD = registerItem("trcompat/sharpened_bronze_spade_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_BRONZE_SPADE = registerItem("trcompat/dull_bronze_spade",
            new DullShovelItem(TRToolTier.BRONZE,0,-2.8f));

    //Peridot
    //Axe

    public static final Item DULL_PERIDOT_AXE_HEAD = registerItem("trcompat/dull_peridot_axe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_PERIDOT_AXE_HEAD = registerItem("trcompat/sharpened_peridot_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_PERIDOT_AXE = registerItem("trcompat/dull_peridot_axe",
            new DullAxeItem(TRToolTier.PERIDOT,1,-2.8f));
    //Hoe

    public static final Item DULL_PERIDOT_HOE_HEAD = registerItem("trcompat/dull_peridot_hoe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_PERIDOT_HOE_HEAD = registerItem("trcompat/sharpened_peridot_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_PERIDOT_HOE = registerItem("trcompat/dull_peridot_hoe",
            new DullHoeItem(TRToolTier.PERIDOT,-1,-2.8f));
    //Pickaxe

    public static final Item DULL_PERIDOT_PICKAXE_HEAD = registerItem("trcompat/dull_peridot_pickaxe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_PERIDOT_PICKAXE_HEAD = registerItem("trcompat/sharpened_peridot_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_PERIDOT_PICKAXE = registerItem("trcompat/dull_peridot_pickaxe",
            new DullPickaxeItem(TRToolTier.PERIDOT, 1,-2.8f));
    //Shovel

    public static final Item DULL_PERIDOT_SPADE_HEAD = registerItem("trcompat/dull_peridot_spade_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_PERIDOT_SPADE_HEAD = registerItem("trcompat/sharpened_peridot_spade_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_PERIDOT_SPADE = registerItem("trcompat/dull_peridot_spade",
            new DullShovelItem(TRToolTier.PERIDOT,1,-2.8f));

    //Ruby
    //Axe

    public static final Item DULL_RUBY_AXE_HEAD = registerItem("trcompat/dull_ruby_axe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_RUBY_AXE_HEAD = registerItem("trcompat/sharpened_ruby_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_RUBY_AXE = registerItem("trcompat/dull_ruby_axe",
            new DullAxeItem(TRToolTier.RUBY,1,-2.8f));
    //Hoe

    public static final Item DULL_RUBY_HOE_HEAD = registerItem("trcompat/dull_ruby_hoe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_RUBY_HOE_HEAD = registerItem("trcompat/sharpened_ruby_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_RUBY_HOE = registerItem("trcompat/dull_ruby_hoe",
            new DullHoeItem(TRToolTier.RUBY,-1,-2.8f));
    //Pickaxe

    public static final Item DULL_RUBY_PICKAXE_HEAD = registerItem("trcompat/dull_ruby_pickaxe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_RUBY_PICKAXE_HEAD = registerItem("trcompat/sharpened_ruby_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_RUBY_PICKAXE = registerItem("trcompat/dull_ruby_pickaxe",
            new DullPickaxeItem(TRToolTier.RUBY,1,-2.8f));
    //Shovel

    public static final Item DULL_RUBY_SPADE_HEAD = registerItem("trcompat/dull_ruby_spade_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_RUBY_SPADE_HEAD = registerItem("trcompat/sharpened_ruby_spade_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_RUBY_SPADE = registerItem("trcompat/dull_ruby_spade",
            new DullShovelItem(TRToolTier.RUBY,1,-2.8f));
    //Sapphire
    //Axe

    public static final Item DULL_SAPPHIRE_AXE_HEAD = registerItem("trcompat/dull_sapphire_axe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_SAPPHIRE_AXE_HEAD = registerItem("trcompat/sharpened_sapphire_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_SAPPHIRE_AXE = registerItem("trcompat/dull_sapphire_axe",
            new DullAxeItem(TRToolTier.SAPPHIRE,1,-2.8f));
    //Hoe

    public static final Item DULL_SAPPHIRE_HOE_HEAD = registerItem("trcompat/dull_sapphire_hoe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_SAPPHIRE_HOE_HEAD = registerItem("trcompat/sharpened_sapphire_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_SAPPHIRE_HOE = registerItem("trcompat/dull_sapphire_hoe",
            new DullHoeItem(TRToolTier.SAPPHIRE,-1,-2.8f));
    //Pickaxe

    public static final Item DULL_SAPPHIRE_PICKAXE_HEAD = registerItem("trcompat/dull_sapphire_pickaxe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_SAPPHIRE_PICKAXE_HEAD = registerItem("trcompat/sharpened_sapphire_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_SAPPHIRE_PICKAXE = registerItem("trcompat/dull_sapphire_pickaxe",
            new DullPickaxeItem(TRToolTier.SAPPHIRE,1,-2.8f));
    //Shovel

    public static final Item DULL_SAPPHIRE_SPADE_HEAD = registerItem("trcompat/dull_sapphire_spade_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_SAPPHIRE_SPADE_HEAD = registerItem("trcompat/sharpened_sapphire_spade_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_SAPPHIRE_SPADE = registerItem("trcompat/dull_sapphire_spade",
            new DullShovelItem(TRToolTier.SAPPHIRE,1,-2.8f));

    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup(DULL_BRONZE_AXE_HEAD);
        addToItemGroup(SHARPENED_BRONZE_AXE_HEAD);
        addToItemGroup(DULL_BRONZE_AXE);
        addToItemGroup(DULL_BRONZE_HOE_HEAD);
        addToItemGroup(SHARPENED_BRONZE_HOE_HEAD);
        addToItemGroup(DULL_BRONZE_HOE);
        addToItemGroup(DULL_BRONZE_PICKAXE_HEAD);
        addToItemGroup(SHARPENED_BRONZE_PICKAXE_HEAD);
        addToItemGroup(DULL_BRONZE_PICKAXE);
        addToItemGroup(DULL_BRONZE_SPADE_HEAD);
        addToItemGroup(SHARPENED_BRONZE_SPADE_HEAD);
        addToItemGroup(DULL_BRONZE_SPADE);
        addToItemGroup(DULL_PERIDOT_AXE_HEAD);
        addToItemGroup(SHARPENED_PERIDOT_AXE_HEAD);
        addToItemGroup(DULL_PERIDOT_AXE);
        addToItemGroup(DULL_PERIDOT_HOE_HEAD);
        addToItemGroup(SHARPENED_PERIDOT_HOE_HEAD);
        addToItemGroup(DULL_PERIDOT_HOE);
        addToItemGroup(DULL_PERIDOT_PICKAXE_HEAD);
        addToItemGroup(SHARPENED_PERIDOT_PICKAXE_HEAD);
        addToItemGroup(DULL_PERIDOT_PICKAXE);
        addToItemGroup(DULL_PERIDOT_SPADE_HEAD);
        addToItemGroup(SHARPENED_PERIDOT_SPADE_HEAD);
        addToItemGroup(DULL_PERIDOT_SPADE);
        addToItemGroup(DULL_RUBY_AXE_HEAD);
        addToItemGroup(SHARPENED_RUBY_AXE_HEAD);
        addToItemGroup(DULL_RUBY_AXE);
        addToItemGroup(DULL_RUBY_HOE_HEAD);
        addToItemGroup(SHARPENED_RUBY_HOE_HEAD);
        addToItemGroup(DULL_RUBY_HOE);
        addToItemGroup(DULL_RUBY_PICKAXE_HEAD);
        addToItemGroup(SHARPENED_RUBY_PICKAXE_HEAD);
        addToItemGroup(DULL_RUBY_PICKAXE);
        addToItemGroup(DULL_RUBY_SPADE_HEAD);
        addToItemGroup(SHARPENED_RUBY_SPADE_HEAD);
        addToItemGroup(DULL_RUBY_SPADE);
        addToItemGroup(DULL_SAPPHIRE_AXE_HEAD);
        addToItemGroup(SHARPENED_SAPPHIRE_AXE_HEAD);
        addToItemGroup(DULL_SAPPHIRE_AXE);
        addToItemGroup(DULL_SAPPHIRE_HOE_HEAD);
        addToItemGroup(SHARPENED_SAPPHIRE_HOE_HEAD);
        addToItemGroup(DULL_SAPPHIRE_HOE);
        addToItemGroup(DULL_SAPPHIRE_PICKAXE_HEAD);
        addToItemGroup(SHARPENED_SAPPHIRE_PICKAXE_HEAD);
        addToItemGroup(DULL_SAPPHIRE_PICKAXE);
        addToItemGroup(DULL_SAPPHIRE_SPADE_HEAD);
        addToItemGroup(SHARPENED_SAPPHIRE_SPADE_HEAD);
        addToItemGroup(DULL_SAPPHIRE_SPADE);
    }

    private static void addToItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(Initialize_Mod.EXPERT_TOOLS).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}
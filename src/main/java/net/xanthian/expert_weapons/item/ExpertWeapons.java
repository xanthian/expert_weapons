package net.xanthian.expert_weapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.item.*;
import net.minecraft.registry.Registry;
import net.minecraft.world.World;

import net.xanthian.expert_weapons.Initialize_Mod;
import net.xanthian.expert_weapons.item.DullItems.DullSwordItem;


import java.util.List;

public class ExpertWeapons {

	//Generic Parts
	public static final Item SWORD_HILT = registerItem("sword_hilt", new Item(new FabricItemSettings()));

	//Wood Parts
//	public static final Item WOOD_GUARD = registerItem("wood_guard", new Item(new FabricItemSettings()));
//	public static final Item WOOD_BLADE = registerItem("wood_blade", new Item(new FabricItemSettings()));
//	public static final Item WOOD_SWORD = registerItem("wood_sword",
//			new DullSwordItem(ToolMaterials.WOOD,2,-3.0f));

	//Iron Parts
	public static final Item IRON_GUARD = registerItem("iron_guard", new Item(new FabricItemSettings()));

	public static final Item DULL_IRON_BLADE = registerItem("dull_iron_blade",
			new Item(new FabricItemSettings())			{
				@Override
				public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
					tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
				}
			});
	public static final Item SHARPENED_IRON_BLADE = registerItem("sharpened_iron_blade",
			new Item(new FabricItemSettings()));

	public static final Item DULL_IRON_SWORD = registerItem("dull_iron_sword",
			new DullSwordItem(ToolMaterials.IRON,3,-2.4f));

	public static final Item IRON_WHETSTONE = registerItem("iron_whetstone",
			new Item(new FabricItemSettings())			{
				@Override
				public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
					tooltip.add(Text.translatable("tooltip.expert_weapons.iron_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
					tooltip.add(Text.translatable("tooltip.expert_weapons.iron_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
				}
			});

	//Golden Parts
	public static final Item GOLDEN_GUARD = registerItem("golden_guard",
			new Item(new FabricItemSettings()));

	public static final Item DULL_GOLDEN_BLADE = registerItem("dull_golden_blade",
			new Item(new FabricItemSettings()){
				@Override
				public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
					tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
				}
			});
	public static final Item SHARPENED_GOLDEN_BLADE = registerItem("sharpened_golden_blade",
			new Item(new FabricItemSettings()));

	public static final Item DULL_GOLDEN_SWORD = registerItem("dull_golden_sword",
			new DullSwordItem(ToolMaterials.GOLD,3,-2.4f));

	public static final Item GOLDEN_WHETSTONE = registerItem("golden_whetstone",
			new Item(new FabricItemSettings()){
				@Override
				public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
					tooltip.add(Text.translatable("tooltip.expert_weapons.golden_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
					tooltip.add(Text.translatable("tooltip.expert_weapons.golden_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
				}
			});

	//Diamond Parts
	public static final Item DIAMOND_GUARD = registerItem("diamond_guard",
			new Item(new FabricItemSettings()));

	public static final Item DULL_DIAMOND_BLADE = registerItem("dull_diamond_blade",
			new Item(new FabricItemSettings())
			{
				@Override
				public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
					tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
				}
			});
	public static final Item SHARPENED_DIAMOND_BLADE = registerItem("sharpened_diamond_blade",
			new Item(new FabricItemSettings()));

	public static final Item DULL_DIAMOND_SWORD = registerItem("dull_diamond_sword",
			new DullSwordItem(ToolMaterials.DIAMOND,3,-2.4f));

	public static final Item DIAMOND_WHETSTONE = registerItem("diamond_whetstone",
			new Item(new FabricItemSettings()){
				@Override
				public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
					tooltip.add(Text.translatable("tooltip.expert_weapons.diamond_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
					tooltip.add(Text.translatable("tooltip.expert_weapons.diamond_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
				}
			});

	//Netherite Parts
	public static final Item NETHERITE_GUARD = registerItem("netherite_guard",
			new Item(new FabricItemSettings()));

		public static final Item DULL_NETHERITE_BLADE = registerItem("dull_netherite_blade",
			new Item(new FabricItemSettings())			{
				@Override
				public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
					tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
				}
			});
	public static final Item SHARPENED_NETHERITE_BLADE = registerItem("sharpened_netherite_blade",
			new Item(new FabricItemSettings()));

	public static final Item DULL_NETHERITE_SWORD = registerItem("dull_netherite_sword",
			new DullSwordItem(ToolMaterials.NETHERITE,3,-2.4f));

	public static final Item NETHERITE_WHETSTONE = registerItem("netherite_whetstone",
			new Item(new FabricItemSettings())			{
				@Override
				public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
					tooltip.add(Text.translatable("tooltip.expert_weapons.netherite_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
					tooltip.add(Text.translatable("tooltip.expert_weapons.netherite_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
				}
			});

	//Register Items
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
	}

	private static void addItemsToItemGroup() {
		addToItemGroup(SWORD_HILT);
//		addToItemGroup(WOOD_GUARD);
//		addToItemGroup(WOOD_BLADE);
//		addToItemGroup(WOOD_SWORD);
		addToItemGroup(IRON_GUARD);
		addToItemGroup(DULL_IRON_BLADE);
		addToItemGroup(SHARPENED_IRON_BLADE);
		addToItemGroup(DULL_IRON_SWORD);
		addToItemGroup(IRON_WHETSTONE);
		addToItemGroup(GOLDEN_GUARD);
		addToItemGroup(DULL_GOLDEN_BLADE);
		addToItemGroup(SHARPENED_GOLDEN_BLADE);
		addToItemGroup(DULL_GOLDEN_SWORD);
		addToItemGroup(GOLDEN_WHETSTONE);
		addToItemGroup(DIAMOND_GUARD);
		addToItemGroup(DULL_DIAMOND_BLADE);
		addToItemGroup(SHARPENED_DIAMOND_BLADE);
		addToItemGroup(DULL_DIAMOND_SWORD);
		addToItemGroup(DIAMOND_WHETSTONE);
		addToItemGroup(NETHERITE_GUARD);
		addToItemGroup(DULL_NETHERITE_BLADE);
		addToItemGroup(SHARPENED_NETHERITE_BLADE);
		addToItemGroup(DULL_NETHERITE_SWORD);
		addToItemGroup(NETHERITE_WHETSTONE);
	}

	private static void addToItemGroup(Item item) {
		ItemGroupEvents.modifyEntriesEvent(Initialize_Mod.EXPERT_WEAPONS).register(entries -> entries.add(item));
	}

	public static void registerModItems() {
		addItemsToItemGroup();
	}
}
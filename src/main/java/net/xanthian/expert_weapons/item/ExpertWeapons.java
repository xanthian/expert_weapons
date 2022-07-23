package net.xanthian.expert_weapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import net.xanthian.expert_weapons.Initialize_Mod;

import java.util.List;

public class ExpertWeapons {

	//Generic Parts
	public static final Item SWORD_HILT = registerItem("sword_hilt",
			new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));

	//Iron Parts
	public static final Item IRON_GUARD = registerItem("iron_guard",
			new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
	public static final Item DULL_IRON_BLADE = registerItem("dull_iron_blade",
			new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
			{
				//Tooltip
				@Override
				public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
					tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
				}
			});
	public static final Item SHARPENED_IRON_BLADE = registerItem("sharpened_iron_blade",
			new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));

	//Golden Parts
	public static final Item GOLDEN_GUARD = registerItem("golden_guard",
			new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
	public static final Item DULL_GOLDEN_BLADE = registerItem("dull_golden_blade",
			new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
			{
				//Tooltip
				@Override
				public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
					tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
				}
			});
	public static final Item SHARPENED_GOLDEN_BLADE = registerItem("sharpened_golden_blade",
			new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));

	//Diamond Parts
	public static final Item DIAMOND_GUARD = registerItem("diamond_guard",
			new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
	public static final Item DULL_DIAMOND_BLADE = registerItem("dull_diamond_blade",
			new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
			{
				//Tooltip
				@Override
				public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
					tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
				}
			});
	public static final Item SHARPENED_DIAMOND_BLADE = registerItem("sharpened_diamond_blade",
			new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));

	//Netherite Parts
	public static final Item NETHERITE_GUARD = registerItem("netherite_guard",
			new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
		public static final Item DULL_NETHERITE_BLADE = registerItem("dull_netherite_blade",
			new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
			{
				//Tooltip
				@Override
				public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
					tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
				}
			});
	public static final Item SHARPENED_NETHERITE_BLADE = registerItem("sharpened_netherite_blade",
			new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));

	//Whetstones
	public static final Item IRON_WHETSTONE = registerItem("iron_whetstone",
			new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
			{	//Tooltip
				@Override
				public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
					tooltip.add(Text.translatable("tooltip.expert_weapons.iron_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
					tooltip.add(Text.translatable("tooltip.expert_weapons.iron_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
				}
			});

	public static final Item GOLDEN_WHETSTONE = registerItem("golden_whetstone",
			new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
			{	//Tooltip
				@Override
				public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
					tooltip.add(Text.translatable("tooltip.expert_weapons.golden_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
					tooltip.add(Text.translatable("tooltip.expert_weapons.golden_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
				}
			});

	public static final Item DIAMOND_WHETSTONE = registerItem("diamond_whetstone",
			new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
			{	//Tooltip
				@Override
				public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
					tooltip.add(Text.translatable("tooltip.expert_weapons.diamond_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
					tooltip.add(Text.translatable("tooltip.expert_weapons.diamond_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
				}
			});

	public static final Item NETHERITE_WHETSTONE = registerItem("netherite_whetstone",
			new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
			{	//Tooltip
				@Override
				public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
					tooltip.add(Text.translatable("tooltip.expert_weapons.netherite_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
					tooltip.add(Text.translatable("tooltip.expert_weapons.netherite_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
				}
			});

	//Register Items
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
	}
	public static void registerModItems() {}
}
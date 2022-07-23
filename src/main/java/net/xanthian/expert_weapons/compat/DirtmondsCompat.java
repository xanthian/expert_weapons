package net.xanthian.expert_weapons.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
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

public class DirtmondsCompat {

    //Dull Dirtmond Parts
    public static final Item DIRTMOND_GUARD = registerItem("dmcompat/dirtmond_guard",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
    );
    public static final Item DULL_DIRTMOND_AXE_HEAD = registerItem("dmcompat/dull_dirtmond_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DIRTMOND_HOE_HEAD = registerItem("dmcompat/dull_dirtmond_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DIRTMOND_PICKAXE_HEAD = registerItem("dmcompat/dull_dirtmond_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DIRTMOND_SHOVEL_HEAD = registerItem("dmcompat/dull_dirtmond_shovel_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DIRTMOND_BLADE = registerItem("dmcompat/dull_dirtmond_blade",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
            {
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    //Dull Dirtmond Tools/Weapons
    public static final Item DULL_DIRTMOND_AXE = registerItem("dmcompat/dull_dirtmond_axe",
            new AxeItem(DullMaterials.DULL_DIRTMOND,3,-2.9f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DIRTMOND_HOE = registerItem("dmcompat/dull_dirtmond_hoe",
            new HoeItem(DullMaterials.DULL_DIRTMOND,-2,-1f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DIRTMOND_PICKAXE = registerItem("dmcompat/dull_dirtmond_pickaxe",
            new PickaxeItem(DullMaterials.DULL_DIRTMOND,-1,-2.8f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DIRTMOND_SHOVEL = registerItem("dmcompat/dull_dirtmond_shovel",
            new ShovelItem(DullMaterials.DULL_DIRTMOND,-2,-2.9f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DIRTMOND_SWORD = registerItem("dmcompat/dull_dirtmond_sword",
            new SwordItem(DullMaterials.DULL_DIRTMOND,1,-2.4f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    
    //Sharpened Parts
    public static final Item SHARPENED_DIRTMOND_BLADE = registerItem("dmcompat/sharpened_dirtmond_blade",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item SHARPENED_DIRTMOND_AXE_HEAD = registerItem("dmcompat/sharpened_dirtmond_axe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item SHARPENED_DIRTMOND_HOE_HEAD = registerItem("dmcompat/sharpened_dirtmond_hoe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item SHARPENED_DIRTMOND_PICKAXE_HEAD = registerItem("dmcompat/sharpened_dirtmond_pickaxe_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));
    public static final Item SHARPENED_DIRTMOND_SHOVEL_HEAD = registerItem("dmcompat/sharpened_dirtmond_shovel_head",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_TOOLS)));

    //Whetstone
    public static final Item DIRTMOND_WHETSTONE = registerItem("dmcompat/dirtmond_whetstone",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
            {	//Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.dirtmond_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.dirtmond_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });
    
    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
    }
}
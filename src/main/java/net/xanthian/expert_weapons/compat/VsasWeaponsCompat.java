package net.xanthian.expert_weapons.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.xanthian.expert_weapons.Initialize_Mod;
import net.xanthian.expert_weapons.materials.DullMaterials;

import java.util.List;

public class VsasWeaponsCompat {

    //Generic Parts
    public static final Item ACACIA_SWORD_HILT = registerItem("vsascompat/acacia_sword_hilt",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item BIRCH_SWORD_HILT = registerItem("vsascompat/birch_sword_hilt",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item CRIMSON_SWORD_HILT = registerItem("vsascompat/crimson_sword_hilt",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item DARK_OAK_SWORD_HILT = registerItem("vsascompat/dark_oak_sword_hilt",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item JUNGLE_SWORD_HILT = registerItem("vsascompat/jungle_sword_hilt",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item OAK_SWORD_HILT = registerItem("vsascompat/oak_sword_hilt",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item SPRUCE_SWORD_HILT = registerItem("vsascompat/spruce_sword_hilt",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item WARPED_SWORD_HILT = registerItem("vsascompat/warped_sword_hilt",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));

    // Acacia
    public static final Item DULL_ACACIA_IRON_SWORD = registerItem("vsascompat/dull_acacia_iron_sword", new SwordItem(DullMaterials.DULL_IRON,3,-2.4f, new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_ACACIA_GOLDEN_SWORD = registerItem("vsascompat/dull_acacia_golden_sword", new SwordItem(DullMaterials.DULL_GOLDEN,3,-2.4f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_ACACIA_DIAMOND_SWORD = registerItem("vsascompat/dull_acacia_diamond_sword",  new SwordItem(DullMaterials.DULL_DIAMOND,3,-2.4f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_ACACIA_NETHERITE_SWORD = registerItem("vsascompat/dull_acacia_netherite_sword", new SwordItem(DullMaterials.DULL_NETHERITE,3,-2.4f,
                    new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    // Birch
    public static final Item DULL_BIRCH_IRON_SWORD = registerItem("vsascompat/dull_birch_iron_sword", new SwordItem(DullMaterials.DULL_IRON,3,-2.4f, new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_BIRCH_GOLDEN_SWORD = registerItem("vsascompat/dull_birch_golden_sword", new SwordItem(DullMaterials.DULL_GOLDEN,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_BIRCH_DIAMOND_SWORD = registerItem("vsascompat/dull_birch_diamond_sword",  new SwordItem(DullMaterials.DULL_DIAMOND,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_BIRCH_NETHERITE_SWORD = registerItem("vsascompat/dull_birch_netherite_sword", new SwordItem(DullMaterials.DULL_NETHERITE,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });

    // Crimson
    public static final Item DULL_CRIMSON_IRON_SWORD = registerItem("vsascompat/dull_crimson_iron_sword", new SwordItem(DullMaterials.DULL_IRON,3,-2.4f, new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_CRIMSON_GOLDEN_SWORD = registerItem("vsascompat/dull_crimson_golden_sword", new SwordItem(DullMaterials.DULL_GOLDEN,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_CRIMSON_DIAMOND_SWORD = registerItem("vsascompat/dull_crimson_diamond_sword",  new SwordItem(DullMaterials.DULL_DIAMOND,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_CRIMSON_NETHERITE_SWORD = registerItem("vsascompat/dull_crimson_netherite_sword", new SwordItem(DullMaterials.DULL_NETHERITE,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });

    // Dark_oak
    public static final Item DULL_DARK_OAK_IRON_SWORD = registerItem("vsascompat/dull_dark_oak_iron_sword", new SwordItem(DullMaterials.DULL_IRON,3,-2.4f, new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_DARK_OAK_GOLDEN_SWORD = registerItem("vsascompat/dull_dark_oak_golden_sword", new SwordItem(DullMaterials.DULL_GOLDEN,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_DARK_OAK_DIAMOND_SWORD = registerItem("vsascompat/dull_dark_oak_diamond_sword",  new SwordItem(DullMaterials.DULL_DIAMOND,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_DARK_OAK_NETHERITE_SWORD = registerItem("vsascompat/dull_dark_oak_netherite_sword", new SwordItem(DullMaterials.DULL_NETHERITE,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });

    // Jungle
    public static final Item DULL_JUNGLE_IRON_SWORD = registerItem("vsascompat/dull_jungle_iron_sword", new SwordItem(DullMaterials.DULL_IRON,3,-2.4f, new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_JUNGLE_GOLDEN_SWORD = registerItem("vsascompat/dull_jungle_golden_sword", new SwordItem(DullMaterials.DULL_GOLDEN,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_JUNGLE_DIAMOND_SWORD = registerItem("vsascompat/dull_jungle_diamond_sword",  new SwordItem(DullMaterials.DULL_DIAMOND,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_JUNGLE_NETHERITE_SWORD = registerItem("vsascompat/dull_jungle_netherite_sword", new SwordItem(DullMaterials.DULL_NETHERITE,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });

    // Oak
    public static final Item DULL_OAK_IRON_SWORD = registerItem("vsascompat/dull_oak_iron_sword", new SwordItem(DullMaterials.DULL_IRON,3,-2.4f, new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_OAK_GOLDEN_SWORD = registerItem("vsascompat/dull_oak_golden_sword", new SwordItem(DullMaterials.DULL_GOLDEN,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_OAK_DIAMOND_SWORD = registerItem("vsascompat/dull_oak_diamond_sword",  new SwordItem(DullMaterials.DULL_DIAMOND,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_OAK_NETHERITE_SWORD = registerItem("vsascompat/dull_oak_netherite_sword", new SwordItem(DullMaterials.DULL_NETHERITE,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });

    // Spruce
    public static final Item DULL_SPRUCE_IRON_SWORD = registerItem("vsascompat/dull_spruce_iron_sword", new SwordItem(DullMaterials.DULL_IRON,3,-2.4f, new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_SPRUCE_GOLDEN_SWORD = registerItem("vsascompat/dull_spruce_golden_sword", new SwordItem(DullMaterials.DULL_GOLDEN,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_SPRUCE_DIAMOND_SWORD = registerItem("vsascompat/dull_spruce_diamond_sword",  new SwordItem(DullMaterials.DULL_DIAMOND,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_SPRUCE_NETHERITE_SWORD = registerItem("vsascompat/dull_spruce_netherite_sword", new SwordItem(DullMaterials.DULL_NETHERITE,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });

    // Warped
    public static final Item DULL_WARPED_IRON_SWORD = registerItem("vsascompat/dull_warped_iron_sword", new SwordItem(DullMaterials.DULL_IRON,3,-2.4f, new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_WARPED_GOLDEN_SWORD = registerItem("vsascompat/dull_warped_golden_sword", new SwordItem(DullMaterials.DULL_GOLDEN,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_WARPED_DIAMOND_SWORD = registerItem("vsascompat/dull_warped_diamond_sword",  new SwordItem(DullMaterials.DULL_DIAMOND,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    public static final Item DULL_WARPED_NETHERITE_SWORD = registerItem("vsascompat/dull_warped_netherite_sword", new SwordItem(DullMaterials.DULL_NETHERITE,3,-2.4f,
            new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
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
    public static void registerModItems() {}
}
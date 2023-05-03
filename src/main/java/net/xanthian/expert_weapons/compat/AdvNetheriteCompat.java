package net.xanthian.expert_weapons.compat;

import com.autovw.advancednetheritefabric.core.util.ModToolTiers;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.xanthian.expert_weapons.Initialize_Mod;
import net.xanthian.expert_weapons.item.DullItems.*;
import net.minecraft.registry.Registry;

import java.util.List;

public class AdvNetheriteCompat {

    // Netherite-Iron
    public static final Item DULL_NETHERITE_IRON_AXE_HEAD = registerItem("ancompat/dull_netherite_iron_axe_head",
            new Item(new FabricItemSettings()){
        @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));}});
    public static final Item SHARPENED_NETHERITE_IRON_AXE_HEAD = registerItem("ancompat/sharpened_netherite_iron_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_IRON_AXE = registerItem("ancompat/dull_netherite_iron_axe",
            new DullAxeItem(ModToolTiers.NETHERITE_IRON,4,-3.0F));

    public static final Item DULL_NETHERITE_IRON_HOE_HEAD = registerItem("ancompat/dull_netherite_iron_hoe_head",
            new Item(new FabricItemSettings())
            {   @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }
            });
    public static final Item SHARPENED_NETHERITE_IRON_HOE_HEAD = registerItem("ancompat/sharpened_netherite_iron_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_IRON_HOE = registerItem("ancompat/dull_netherite_iron_hoe",
            new DullHoeItem(ModToolTiers.NETHERITE_IRON,-5,0f));


    public static final Item DULL_NETHERITE_IRON_PICKAXE_HEAD = registerItem("ancompat/dull_netherite_iron_pickaxe_head",
            new Item(new FabricItemSettings())
            {   @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }
            });
    public static final Item SHARPENED_NETHERITE_IRON_PICKAXE_HEAD = registerItem("ancompat/sharpened_netherite_iron_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_IRON_PICKAXE = registerItem("ancompat/dull_netherite_iron_pickaxe",
            new DullPickaxeItem(ModToolTiers.NETHERITE_IRON,0,-2.8f));

    public static final Item DULL_NETHERITE_IRON_SHOVEL_HEAD = registerItem("ancompat/dull_netherite_iron_shovel_head",
            new Item(new FabricItemSettings())
            {   @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }
            });
    public static final Item SHARPENED_NETHERITE_IRON_SHOVEL_HEAD = registerItem("ancompat/sharpened_netherite_iron_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_IRON_SHOVEL = registerItem("ancompat/dull_netherite_iron_shovel",
            new DullShovelItem(ModToolTiers.NETHERITE_IRON,0.5F,-3.0f));

    public static final Item NETHERITE_IRON_GUARD = registerItem("ancompat/netherite_iron_guard",
            new Item(new FabricItemSettings())
    );
    public static final Item DULL_NETHERITE_IRON_BLADE = registerItem("ancompat/dull_netherite_iron_blade",
            new Item(new FabricItemSettings())
            {   @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }
            });
    public static final Item SHARPENED_NETHERITE_IRON_BLADE = registerItem("ancompat/sharpened_netherite_iron_blade",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_IRON_SWORD = registerItem("ancompat/dull_netherite_iron_sword",
            new DullSwordItem(ModToolTiers.NETHERITE_IRON,2,-2.4f));

    public static final Item NETHERITE_IRON_WHETSTONE = registerItem("ancompat/netherite_iron_whetstone",
            new Item(new FabricItemSettings()){
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.advnetherite_iron_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.advnetherite_iron_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }});

    // Netherite-Gold
    public static final Item DULL_NETHERITE_GOLD_AXE_HEAD = registerItem("ancompat/dull_netherite_gold_axe_head",
            new Item(new FabricItemSettings()){
                @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }});
    public static final Item SHARPENED_NETHERITE_GOLD_AXE_HEAD = registerItem("ancompat/sharpened_netherite_gold_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_GOLD_AXE = registerItem("ancompat/dull_netherite_gold_axe",
            new DullAxeItem(ModToolTiers.NETHERITE_GOLD,5,-3.0F));

    public static final Item DULL_NETHERITE_GOLD_HOE_HEAD = registerItem("ancompat/dull_netherite_gold_hoe_head",
            new Item(new FabricItemSettings()){
                @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }});
    public static final Item SHARPENED_NETHERITE_GOLD_HOE_HEAD = registerItem("ancompat/sharpened_netherite_gold_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_GOLD_HOE = registerItem("ancompat/dull_netherite_gold_hoe",
            new DullHoeItem(ModToolTiers.NETHERITE_GOLD,-5,0f)	{
            });

    public static final Item DULL_NETHERITE_GOLD_PICKAXE_HEAD = registerItem("ancompat/dull_netherite_gold_pickaxe_head",
            new Item(new FabricItemSettings())
            {   @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }
            });
    public static final Item SHARPENED_NETHERITE_GOLD_PICKAXE_HEAD = registerItem("ancompat/sharpened_netherite_gold_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_GOLD_PICKAXE = registerItem("ancompat/dull_netherite_gold_pickaxe",
            new DullPickaxeItem(ModToolTiers.NETHERITE_GOLD,0,-2.8f));

    public static final Item DULL_NETHERITE_GOLD_SHOVEL_HEAD = registerItem("ancompat/dull_netherite_gold_shovel_head",
            new Item(new FabricItemSettings())
            {   @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }
            });
    public static final Item SHARPENED_NETHERITE_GOLD_SHOVEL_HEAD = registerItem("ancompat/sharpened_netherite_gold_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_GOLD_SHOVEL = registerItem("ancompat/dull_netherite_gold_shovel",
            new DullShovelItem(ModToolTiers.NETHERITE_GOLD,0.5F,-3.0f));

    public static final Item NETHERITE_GOLD_GUARD = registerItem("ancompat/netherite_gold_guard",
            new Item(new FabricItemSettings()));

    public static final Item DULL_NETHERITE_GOLD_BLADE = registerItem("ancompat/dull_netherite_gold_blade",
            new Item(new FabricItemSettings())
            {   @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }
            });
    public static final Item SHARPENED_NETHERITE_GOLD_BLADE = registerItem("ancompat/sharpened_netherite_gold_blade",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_GOLD_SWORD = registerItem("ancompat/dull_netherite_gold_sword",
            new DullSwordItem(ModToolTiers.NETHERITE_GOLD,3,-2.4f));

    public static final Item NETHERITE_GOLD_WHETSTONE = registerItem("ancompat/netherite_gold_whetstone",
            new Item(new FabricItemSettings())
            {
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.advnetherite_gold_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.advnetherite_gold_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });

    // Netherite-Emerald
    public static final Item DULL_NETHERITE_EMERALD_AXE_HEAD = registerItem("ancompat/dull_netherite_emerald_axe_head",
            new Item(new FabricItemSettings())
            {   @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }
            });
    public static final Item SHARPENED_NETHERITE_EMERALD_AXE_HEAD = registerItem("ancompat/sharpened_netherite_emerald_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_EMERALD_AXE = registerItem("ancompat/dull_netherite_emerald_axe",
            new DullAxeItem(ModToolTiers.NETHERITE_EMERALD,5,-3.0F));

    public static final Item DULL_NETHERITE_EMERALD_HOE_HEAD = registerItem("ancompat/dull_netherite_emerald_hoe_head",
            new Item(new FabricItemSettings())
            {   @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }
            });
    public static final Item SHARPENED_NETHERITE_EMERALD_HOE_HEAD = registerItem("ancompat/sharpened_netherite_emerald_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_EMERALD_HOE = registerItem("ancompat/dull_netherite_emerald_hoe",
            new DullHoeItem(ModToolTiers.NETHERITE_EMERALD,-6,0f));

    public static final Item DULL_NETHERITE_EMERALD_PICKAXE_HEAD = registerItem("ancompat/dull_netherite_emerald_pickaxe_head",
            new Item(new FabricItemSettings())
            {   @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }
            });
    public static final Item SHARPENED_NETHERITE_EMERALD_PICKAXE_HEAD = registerItem("ancompat/sharpened_netherite_emerald_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_EMERALD_PICKAXE = registerItem("ancompat/dull_netherite_emerald_pickaxe",
            new DullPickaxeItem(ModToolTiers.NETHERITE_EMERALD,0,-2.8f));

    public static final Item DULL_NETHERITE_EMERALD_SHOVEL_HEAD = registerItem("ancompat/dull_netherite_emerald_shovel_head",
            new Item(new FabricItemSettings())
            {   @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }
            });
    public static final Item SHARPENED_NETHERITE_EMERALD_SHOVEL_HEAD = registerItem("ancompat/sharpened_netherite_emerald_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_EMERALD_SHOVEL = registerItem("ancompat/dull_netherite_emerald_shovel",
            new DullShovelItem(ModToolTiers.NETHERITE_EMERALD,0,-3.0f));

    public static final Item NETHERITE_EMERALD_GUARD = registerItem("ancompat/netherite_emerald_guard",
            new Item(new FabricItemSettings())
    );
    public static final Item DULL_NETHERITE_EMERALD_BLADE = registerItem("ancompat/dull_netherite_emerald_blade",
            new Item(new FabricItemSettings())
            {   @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }
            });

    public static final Item DULL_NETHERITE_EMERALD_SWORD = registerItem("ancompat/dull_netherite_emerald_sword",
            new DullSwordItem(ModToolTiers.NETHERITE_EMERALD,3,-2.4f)
    );
    public static final Item SHARPENED_NETHERITE_EMERALD_BLADE = registerItem("ancompat/sharpened_netherite_emerald_blade",
            new Item(new FabricItemSettings()));

    public static final Item NETHERITE_EMERALD_WHETSTONE = registerItem("ancompat/netherite_emerald_whetstone",
            new Item(new FabricItemSettings())
            {
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.advnetherite_emerald_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.advnetherite_emerald_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });

    // Netherite-Diamond

    public static final Item DULL_NETHERITE_DIAMOND_AXE_HEAD = registerItem("ancompat/dull_netherite_diamond_axe_head",
            new Item(new FabricItemSettings())
            {   @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }
            });
    public static final Item SHARPENED_NETHERITE_DIAMOND_AXE_HEAD = registerItem("ancompat/sharpened_netherite_diamond_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_DIAMOND_AXE = registerItem("ancompat/dull_netherite_diamond_axe",
            new DullAxeItem(ModToolTiers.NETHERITE_DIAMOND,6,-3.0F));


    public static final Item DULL_NETHERITE_DIAMOND_HOE_HEAD = registerItem("ancompat/dull_netherite_diamond_hoe_head",
            new Item(new FabricItemSettings())
            {   @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }
            });
    public static final Item SHARPENED_NETHERITE_DIAMOND_HOE_HEAD = registerItem("ancompat/sharpened_netherite_diamond_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_DIAMOND_HOE = registerItem("ancompat/dull_netherite_diamond_hoe",
            new DullHoeItem(ModToolTiers.NETHERITE_DIAMOND,-6,0f));


    public static final Item DULL_NETHERITE_DIAMOND_PICKAXE_HEAD = registerItem("ancompat/dull_netherite_diamond_pickaxe_head",
            new Item(new FabricItemSettings())
            {   @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }
            });
    public static final Item SHARPENED_NETHERITE_DIAMOND_PICKAXE_HEAD = registerItem("ancompat/sharpened_netherite_diamond_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_DIAMOND_PICKAXE = registerItem("ancompat/dull_netherite_diamond_pickaxe",
            new DullPickaxeItem(ModToolTiers.NETHERITE_DIAMOND,0,-2.8f));

    public static final Item SHARPENED_NETHERITE_DIAMOND_SHOVEL_HEAD = registerItem("ancompat/sharpened_netherite_diamond_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_DIAMOND_SHOVEL_HEAD = registerItem("ancompat/dull_netherite_diamond_shovel_head",
            new Item(new FabricItemSettings())
            {   @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }
            });
    public static final Item DULL_NETHERITE_DIAMOND_SHOVEL = registerItem("ancompat/dull_netherite_diamond_shovel",
            new DullShovelItem(ModToolTiers.NETHERITE_DIAMOND,0,-3.0f));

    public static final Item NETHERITE_DIAMOND_GUARD = registerItem("ancompat/netherite_diamond_guard",
            new Item(new FabricItemSettings())
    );
    public static final Item DULL_NETHERITE_DIAMOND_BLADE = registerItem("ancompat/dull_netherite_diamond_blade",
            new Item(new FabricItemSettings())
            {   @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
            }
            });
    public static final Item SHARPENED_NETHERITE_DIAMOND_BLADE = registerItem("ancompat/sharpened_netherite_diamond_blade",
            new Item(new FabricItemSettings()));
    public static final Item DULL_NETHERITE_DIAMOND_SWORD = registerItem("ancompat/dull_netherite_diamond_sword",
            new DullSwordItem(ModToolTiers.NETHERITE_DIAMOND,4,-2.4f));

    public static final Item NETHERITE_DIAMOND_WHETSTONE = registerItem("ancompat/netherite_diamond_whetstone",
            new Item(new FabricItemSettings())
            {
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.advnetherite_diamond_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.advnetherite_diamond_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });
    
    
    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_IRON_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_NETHERITE_IRON_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_IRON_AXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_IRON_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_NETHERITE_IRON_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_IRON_HOE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_NETHERITE_IRON_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_IRON_PICKAXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_IRON_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_NETHERITE_IRON_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_IRON_SHOVEL);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, NETHERITE_IRON_GUARD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_NETHERITE_IRON_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, SHARPENED_NETHERITE_IRON_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_NETHERITE_IRON_SWORD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, NETHERITE_IRON_WHETSTONE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_GOLD_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_NETHERITE_GOLD_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_GOLD_AXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_GOLD_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_NETHERITE_GOLD_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_GOLD_HOE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_GOLD_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_NETHERITE_GOLD_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_GOLD_PICKAXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_GOLD_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_NETHERITE_GOLD_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_GOLD_SHOVEL);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, NETHERITE_GOLD_GUARD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_NETHERITE_GOLD_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, SHARPENED_NETHERITE_GOLD_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_NETHERITE_GOLD_SWORD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, NETHERITE_GOLD_WHETSTONE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_EMERALD_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_NETHERITE_EMERALD_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_EMERALD_AXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_EMERALD_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_NETHERITE_EMERALD_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_EMERALD_HOE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_EMERALD_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_NETHERITE_EMERALD_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_EMERALD_PICKAXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_EMERALD_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_NETHERITE_EMERALD_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_EMERALD_SHOVEL);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, NETHERITE_EMERALD_GUARD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_NETHERITE_EMERALD_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_NETHERITE_EMERALD_SWORD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, SHARPENED_NETHERITE_EMERALD_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, NETHERITE_EMERALD_WHETSTONE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_DIAMOND_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_NETHERITE_DIAMOND_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_DIAMOND_AXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_DIAMOND_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_NETHERITE_DIAMOND_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_DIAMOND_HOE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_DIAMOND_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_NETHERITE_DIAMOND_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_DIAMOND_PICKAXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_NETHERITE_DIAMOND_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_DIAMOND_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_NETHERITE_DIAMOND_SHOVEL);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, NETHERITE_DIAMOND_GUARD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_NETHERITE_DIAMOND_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, SHARPENED_NETHERITE_DIAMOND_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_NETHERITE_DIAMOND_SWORD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, NETHERITE_DIAMOND_WHETSTONE);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}
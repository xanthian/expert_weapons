package net.xanthian.expert_weapons.compat;

import com.dmcpacks.dirtmonds.item.ModToolMaterial;
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
import net.minecraft.registry.Registry;
import net.minecraft.world.World;
import net.xanthian.expert_weapons.Initialize_Mod;
import net.xanthian.expert_weapons.item.DullItems.*;

import java.util.List;

public class DirtmondsCompat {

    //Tools
    public static final Item DULL_DIRTMOND_AXE_HEAD = registerItem("dmcompat/dull_dirtmond_axe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_DIRTMOND_AXE_HEAD = registerItem("dmcompat/sharpened_dirtmond_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_DIRTMOND_AXE = registerItem("dmcompat/dull_dirtmond_axe",
            new DullAxeItem(ModToolMaterial.DIRTMOND,3,-2.9F)
            );
    public static final Item DULL_DIRTMOND_HOE_HEAD = registerItem("dmcompat/dull_dirtmond_hoe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_DIRTMOND_HOE_HEAD = registerItem("dmcompat/sharpened_dirtmond_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_DIRTMOND_HOE = registerItem("dmcompat/dull_dirtmond_hoe",
            new DullHoeItem(ModToolMaterial.DIRTMOND,-2,-1f));

    public static final Item DULL_DIRTMOND_PICKAXE_HEAD = registerItem("dmcompat/dull_dirtmond_pickaxe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_DIRTMOND_PICKAXE_HEAD = registerItem("dmcompat/sharpened_dirtmond_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_DIRTMOND_PICKAXE = registerItem("dmcompat/dull_dirtmond_pickaxe",
            new DullPickaxeItem(ModToolMaterial.DIRTMOND,-1,-2.8f));

    public static final Item DULL_DIRTMOND_SHOVEL_HEAD = registerItem("dmcompat/dull_dirtmond_shovel_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_DIRTMOND_SHOVEL_HEAD = registerItem("dmcompat/sharpened_dirtmond_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_DIRTMOND_SHOVEL = registerItem("dmcompat/dull_dirtmond_shovel",
            new DullShovelItem(ModToolMaterial.DIRTMOND,-2,-2.9f));

    //Weapons
    public static final Item DIRTMOND_GUARD = registerItem("dmcompat/dirtmond_guard",
            new Item(new FabricItemSettings())
    );
    public static final Item DULL_DIRTMOND_BLADE = registerItem("dmcompat/dull_dirtmond_blade",
            new Item(new FabricItemSettings())            {
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_DIRTMOND_BLADE = registerItem("dmcompat/sharpened_dirtmond_blade",
            new Item(new FabricItemSettings()));
    public static final Item DULL_DIRTMOND_SWORD = registerItem("dmcompat/dull_dirtmond_sword",
            new DullSwordItem(ModToolMaterial.DIRTMOND,1,-2.4f));

    public static final Item DIRTMOND_WHETSTONE = registerItem("dmcompat/dirtmond_whetstone",
            new Item(new FabricItemSettings())            {
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.dirtmond_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.dirtmond_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });

    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_DIRTMOND_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_DIRTMOND_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_DIRTMOND_AXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_DIRTMOND_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_DIRTMOND_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_DIRTMOND_HOE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_DIRTMOND_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_DIRTMOND_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_DIRTMOND_PICKAXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_DIRTMOND_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_DIRTMOND_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_DIRTMOND_SHOVEL);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DIRTMOND_GUARD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_DIRTMOND_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, SHARPENED_DIRTMOND_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_DIRTMOND_SWORD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DIRTMOND_WHETSTONE);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}
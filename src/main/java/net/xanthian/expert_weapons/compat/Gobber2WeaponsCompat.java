package net.xanthian.expert_weapons.compat;

import com.kwpugh.gobber2.init.ItemInit;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.world.World;
import net.xanthian.expert_weapons.Initialize_Mod;
import net.xanthian.expert_weapons.item.DullItems.DullSwordItem;

import java.util.List;

public class Gobber2WeaponsCompat {

    //Gobber2 Sword
    public static final Item GOBBER2_GUARD = registerItem("gobcompat/gobber2_guard",new Item(new FabricItemSettings()));
    public static final Item SHARPENED_GOBBER2_SWORD_BLADE = registerItem("gobcompat/sharpened_gobber2_blade",new Item(new FabricItemSettings()));
    public static final Item DULL_GOBBER2_BLADE = registerItem("gobcompat/dull_gobber2_blade",new Item(new FabricItemSettings()){
        @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
    });
    public static final Item DULL_GOBBER2_SWORD = registerItem("gobcompat/dull_gobber2_sword",
            new DullSwordItem(ItemInit.GOBBER_TOOL_MATERIAL,1,-3f));
    
    public static final Item GOBBER2_WHETSTONE = registerItem("gobcompat/gobber2_whetstone",
            new Item(new FabricItemSettings())            {
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.gobber2_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.gobber2_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });

    //Gobber2 Nether
    public static final Item GOBBER2_NETHER_GUARD = registerItem("gobcompat/gobber2_nether_guard",new Item(new FabricItemSettings()));
    public static final Item SHARPENED_GOBBER2_NETHER_BLADE = registerItem("gobcompat/sharpened_gobber2_nether_blade",new Item(new FabricItemSettings()));
    public static final Item DULL_GOBBER2_NETHER_BLADE = registerItem("gobcompat/dull_gobber2_nether_blade",new Item(new FabricItemSettings())
    {   @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
    });
    public static final Item DULL_GOBBER2_NETHER_SWORD = registerItem("gobcompat/dull_gobber2_nether_sword",
            new DullSwordItem(ItemInit.GOBBER_END_TOOL_MATERIAL,3,-1.8f));

    public static final Item GOBBER2_NETHER_WHETSTONE = registerItem("gobcompat/gobber2_nether_whetstone",
            new Item(new FabricItemSettings())            {
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.gobber2_nether_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.gobber2_nether_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });

    //Gobber2 End
    public static final Item GOBBER2_END_GUARD = registerItem("gobcompat/gobber2_end_guard",new Item(new FabricItemSettings()));
    public static final Item SHARPENED_GOBBER2_END_BLADE = registerItem("gobcompat/sharpened_gobber2_end_blade",new Item(new FabricItemSettings()));
    public static final Item DULL_GOBBER2_END_BLADE = registerItem("gobcompat/dull_gobber2_end_blade",new Item(new FabricItemSettings())
    {   @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
    });
    public static final Item DULL_GOBBER2_END_SWORD = registerItem("gobcompat/dull_gobber2_end_sword",
            new DullSwordItem(ItemInit.GOBBER_NETHER_TOOL_MATERIAL,6,-1.6f));
    
    public static final Item GOBBER2_END_WHETSTONE = registerItem("gobcompat/gobber2_end_whetstone",
            new Item(new FabricItemSettings())            {
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.gobber2_end_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.gobber2_end_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });

    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup(GOBBER2_GUARD);
        addToItemGroup(SHARPENED_GOBBER2_SWORD_BLADE);
        addToItemGroup(DULL_GOBBER2_BLADE);
        addToItemGroup(DULL_GOBBER2_SWORD);
        addToItemGroup(GOBBER2_WHETSTONE);
        addToItemGroup(GOBBER2_NETHER_GUARD);
        addToItemGroup(SHARPENED_GOBBER2_NETHER_BLADE);
        addToItemGroup(DULL_GOBBER2_NETHER_BLADE);
        addToItemGroup(DULL_GOBBER2_NETHER_SWORD);
        addToItemGroup(GOBBER2_NETHER_WHETSTONE);
        addToItemGroup(GOBBER2_END_GUARD);
        addToItemGroup(SHARPENED_GOBBER2_END_BLADE);
        addToItemGroup(DULL_GOBBER2_END_BLADE);
        addToItemGroup(DULL_GOBBER2_END_SWORD);
        addToItemGroup(GOBBER2_END_WHETSTONE);
    }

    private static void addToItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(Initialize_Mod.EXPERT_WEAPONS).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }

}
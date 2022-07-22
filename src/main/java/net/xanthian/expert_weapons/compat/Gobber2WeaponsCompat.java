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

public class Gobber2WeaponsCompat {


    //Gobber2 Sword
    public static final Item GOBBER2_GUARD = registerItem("gobcompat/gobber2_guard",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item SHARPENED_GOBBER2_SWORD_BLADE = registerItem("gobcompat/sharpened_gobber2_blade",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item DULL_GOBBER2_BLADE = registerItem("gobcompat/dull_gobber2_blade",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)){
        @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
    });
    public static final Item DULL_GOBBER2_SWORD = registerItem("gobcompat/dull_gobber2_sword",
            new SwordItem(DullMaterials.DULL_GOBBER2,1,-3f, new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });

    //Gobber2 Nether Sword
    public static final Item GOBBER2_NETHER_GUARD = registerItem("gobcompat/gobber2_nether_guard",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item SHARPENED_GOBBER2_NETHER_BLADE = registerItem("gobcompat/sharpened_gobber2_nether_blade",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item DULL_GOBBER2_NETHER_BLADE = registerItem("gobcompat/dull_gobber2_nether_blade",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
    {   @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
    });
    public static final Item DULL_GOBBER2_NETHER_SWORD = registerItem("gobcompat/dull_gobber2_nether_sword",
            new SwordItem(DullMaterials.DULL_GOBBER2_NETHER,3,-1.8f, new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });

    //Gobber2 End Sword
    public static final Item GOBBER2_END_GUARD = registerItem("gobcompat/gobber2_end_guard",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item SHARPENED_GOBBER2_END_BLADE = registerItem("gobcompat/sharpened_gobber2_end_blade",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item DULL_GOBBER2_END_BLADE = registerItem("gobcompat/dull_gobber2_end_blade",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
    {   @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
    });
    public static final Item DULL_GOBBER2_END_SWORD = registerItem("gobcompat/dull_gobber2_end_sword",
            new SwordItem(DullMaterials.DULL_GOBBER2_END,6,-1.6f, new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });

    //Whetstones
    public static final Item GOBBER2_WHETSTONE = registerItem("gobcompat/gobber2_whetstone",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
            {	//Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.gobber2_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.gobber2_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });

    public static final Item GOBBER2_NETHER_WHETSTONE = registerItem("gobcompat/gobber2_nether_whetstone",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
            {	//Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.gobber2_nether_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.gobber2_nether_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });

    public static final Item GOBBER2_END_WHETSTONE = registerItem("gobcompat/gobber2_end_whetstone",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
            {	//Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.gobber2_end_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.gobber2_end_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });



    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
    }

}

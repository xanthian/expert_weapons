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

public class TRWeaponsCompat {

    //Bronze Sword
    public static final Item BRONZE_GUARD = registerItem("trcompat/bronze_guard",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item SHARPENED_BRONZE_BLADE = registerItem("trcompat/sharpened_bronze_blade",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item DULL_BRONZE_BLADE = registerItem("trcompat/dull_bronze_blade",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
    {   @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
    });
    public static final Item DULL_BRONZE_SWORD = registerItem("trcompat/dull_bronze_sword", new SwordItem(DullMaterials.DULL_BRONZE,2,-2.4f, new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    //Peridot Sword
    public static final Item PERIDOT_GUARD = registerItem("trcompat/peridot_guard",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item SHARPENED_PERIDOT_BLADE = registerItem("trcompat/sharpened_peridot_blade",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item DULL_PERIDOT_BLADE = registerItem("trcompat/dull_peridot_blade",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
    {   @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
    });
    public static final Item DULL_PERIDOT_SWORD = registerItem("trcompat/dull_peridot_sword", new SwordItem(DullMaterials.DULL_PERIDOT,2,-2.4f, new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    //Sapphire Sword
    public static final Item SAPPHIRE_GUARD = registerItem("trcompat/sapphire_guard",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item SHARPENED_SAPPHIRE_BLADE = registerItem("trcompat/sharpened_sapphire_blade",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item DULL_SAPPHIRE_BLADE = registerItem("trcompat/dull_sapphire_blade",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
    {   @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
    });
    public static final Item DULL_SAPPHIRE_SWORD = registerItem("trcompat/dull_sapphire_sword", new SwordItem(DullMaterials.DULL_SAPPHIRE,2,-2.4f, new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    //Ruby Sword
    public static final Item RUBY_GUARD = registerItem("trcompat/ruby_guard",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item SHARPENED_RUBY_BLADE = registerItem("trcompat/sharpened_ruby_blade",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS)));
    public static final Item DULL_RUBY_BLADE = registerItem("trcompat/dull_ruby_blade",new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
    {   @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
    });
    public static final Item DULL_RUBY_SWORD = registerItem("trcompat/dull_ruby_sword", new SwordItem(DullMaterials.DULL_RUBY,2,-2.4f, new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))	{
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
            tooltip.add(Text.translatable("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });
    //Whetstones
    public static final Item BRONZE_WHETSTONE = registerItem("trcompat/bronze_whetstone",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
            {	//Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.bronze_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.bronze_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });
    public static final Item ruby_whetstone = registerItem("trcompat/ruby_whetstone",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
            {	//Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.ruby_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.ruby_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });
    public static final Item sapphire_whetstone = registerItem("trcompat/sapphire_whetstone",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
            {	//Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sapphire_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sapphire_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });
    public static final Item peridot_whetstone = registerItem("trcompat/peridot_whetstone",
            new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT_WEAPONS))
            {	//Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.peridot_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.peridot_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });

    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
    }
}
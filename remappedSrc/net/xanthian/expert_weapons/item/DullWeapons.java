package net.xanthian.expert_weapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import net.xanthian.expert_weapons.Initialize_Mod;
import net.xanthian.expert_weapons.materials.DullMaterials;

import java.util.List;


public class DullWeapons {


    //Dull Weapons
    public static final Item DULL_IRON_SWORD = registerItem("dull_iron_sword",
            new SwordItem(DullMaterials.DULL_IRON,3,-2.4f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_WEAPONS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_GOLDEN_SWORD = registerItem("dull_golden_sword",
            new SwordItem(DullMaterials.DULL_GOLDEN,3,-2.4f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_WEAPONS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_DIAMOND_SWORD = registerItem("dull_diamond_sword",
            new SwordItem(DullMaterials.DULL_DIAMOND,3,-2.4f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_WEAPONS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item DULL_NETHERITE_SWORD = registerItem("dull_netherite_sword",
            new SwordItem(DullMaterials.DULL_NETHERITE,3,-2.4f,
                    new FabricItemSettings().group(ExpertGroup.EXPERT_WEAPONS))	{
                //Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
                    tooltip.add(new TranslatableText("tooltip.export_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });

    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
     public static void registerModItems() {}
}
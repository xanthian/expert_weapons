package net.xanthian.expert_weapons.compat;

import me.steven.indrev.tools.IRToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.world.World;

import net.xanthian.expert_weapons.Initialize_Mod;
import net.xanthian.expert_weapons.item.DullItems.*;

import java.util.List;

public class IndustrialRevolution {

    //Bronze
    //Axe
    public static final Item DULL_BRONZE_AXE_HEAD = registerItem("ircompat/dull_bronze_axe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_BRONZE_AXE_HEAD = registerItem("ircompat/sharpened_bronze_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_BRONZE_AXE = registerItem("ircompat/dull_bronze_axe",
            new DullAxeItem(IRToolMaterial.LEAD,1,3F));
    //Hoe

    public static final Item DULL_BRONZE_HOE_HEAD = registerItem("ircompat/dull_bronze_hoe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_BRONZE_HOE_HEAD = registerItem("ircompat/sharpened_bronze_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_BRONZE_HOE = registerItem("ircompat/dull_bronze_hoe",
            new DullHoeItem(IRToolMaterial.BRONZE,-1,-2.8f));
    //Pickaxe

    public static final Item DULL_BRONZE_PICKAXE_HEAD = registerItem("ircompat/dull_bronze_pickaxe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_BRONZE_PICKAXE_HEAD = registerItem("ircompat/sharpened_bronze_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_BRONZE_PICKAXE = registerItem("ircompat/dull_bronze_pickaxe",
            new DullPickaxeItem(IRToolMaterial.BRONZE,1,-2.8f));
    //Shovel

    public static final Item DULL_BRONZE_SHOVEL_HEAD = registerItem("ircompat/dull_bronze_shovel_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_BRONZE_SHOVEL_HEAD = registerItem("ircompat/sharpened_bronze_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_BRONZE_SHOVEL = registerItem("ircompat/dull_bronze_shovel",
            new DullShovelItem(IRToolMaterial.BRONZE,1,-2.8f));

    public static final Item BRONZE_GUARD = registerItem("ircompat/bronze_guard",new Item(new FabricItemSettings()));
    public static final Item DULL_BRONZE_BLADE = registerItem("ircompat/dull_bronze_blade",new Item(new FabricItemSettings())
    {   @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
    });
    public static final Item SHARPENED_BRONZE_BLADE = registerItem("ircompat/sharpened_bronze_blade",
            new Item(new FabricItemSettings()));
    public static final Item DULL_BRONZE_SWORD = registerItem("ircompat/dull_bronze_sword",
            new DullSwordItem(IRToolMaterial.BRONZE,2,-1.5F));
    public static final Item BRONZE_WHETSTONE = registerItem("ircompat/bronze_whetstone",
            new Item(new FabricItemSettings())
            {	//Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.bronze_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.bronze_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });

    //Copper
    //Axe

    public static final Item DULL_COPPER_AXE_HEAD = registerItem("ircompat/dull_copper_axe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_COPPER_AXE_HEAD = registerItem("ircompat/sharpened_copper_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_COPPER_AXE = registerItem("ircompat/dull_copper_axe",
            new DullAxeItem(IRToolMaterial.LEAD,1,3F));
    //Hoe

    public static final Item DULL_COPPER_HOE_HEAD = registerItem("ircompat/dull_copper_hoe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_COPPER_HOE_HEAD = registerItem("ircompat/sharpened_copper_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_COPPER_HOE = registerItem("ircompat/dull_copper_hoe",
            new DullHoeItem(IRToolMaterial.COPPER,-1,-2.8f));
    //Pickaxe

    public static final Item DULL_COPPER_PICKAXE_HEAD = registerItem("ircompat/dull_copper_pickaxe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_COPPER_PICKAXE_HEAD = registerItem("ircompat/sharpened_copper_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_COPPER_PICKAXE = registerItem("ircompat/dull_copper_pickaxe",
            new DullPickaxeItem(IRToolMaterial.COPPER,1,-2.8f));
    //Shovel

    public static final Item DULL_COPPER_SHOVEL_HEAD = registerItem("ircompat/dull_copper_shovel_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_COPPER_SHOVEL_HEAD = registerItem("ircompat/sharpened_copper_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_COPPER_SHOVEL = registerItem("ircompat/dull_copper_shovel",
            new DullShovelItem(IRToolMaterial.COPPER,1,-2.8f));


    public static final Item COPPER_GUARD = registerItem("ircompat/copper_guard",new Item(new FabricItemSettings()));
    public static final Item DULL_COPPER_BLADE = registerItem("ircompat/dull_copper_blade",new Item(new FabricItemSettings())
    {   @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
    });
    public static final Item SHARPENED_COPPER_BLADE = registerItem("ircompat/sharpened_copper_blade",
            new Item(new FabricItemSettings()));
    public static final Item DULL_COPPER_SWORD = registerItem("ircompat/dull_copper_sword",
            new DullSwordItem(IRToolMaterial.COPPER,2,-1.5F));
    public static final Item COPPER_WHETSTONE = registerItem("ircompat/copper_whetstone",
            new Item(new FabricItemSettings())
            {	//Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.copper_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.copper_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });

    //Lead
    //Axe
    public static final Item DULL_LEAD_AXE_HEAD = registerItem("ircompat/dull_lead_axe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_LEAD_AXE_HEAD = registerItem("ircompat/sharpened_lead_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_LEAD_AXE = registerItem("ircompat/dull_lead_axe",
            new DullAxeItem(IRToolMaterial.LEAD,1,3F));
    //Hoe
    public static final Item DULL_LEAD_HOE_HEAD = registerItem("ircompat/dull_lead_hoe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_LEAD_HOE_HEAD = registerItem("ircompat/sharpened_lead_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_LEAD_HOE = registerItem("ircompat/dull_lead_hoe",
            new DullHoeItem(IRToolMaterial.LEAD,-1,-2.8f));
    //Pickaxe
    public static final Item DULL_LEAD_PICKAXE_HEAD = registerItem("ircompat/dull_lead_pickaxe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_LEAD_PICKAXE_HEAD = registerItem("ircompat/sharpened_lead_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_LEAD_PICKAXE = registerItem("ircompat/dull_lead_pickaxe",
            new DullPickaxeItem(IRToolMaterial.LEAD,1,-2.8f));
    //Shovel
    public static final Item DULL_LEAD_SHOVEL_HEAD = registerItem("ircompat/dull_lead_shovel_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_LEAD_SHOVEL_HEAD = registerItem("ircompat/sharpened_lead_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_LEAD_SHOVEL = registerItem("ircompat/dull_lead_shovel",
            new DullShovelItem(IRToolMaterial.LEAD,1,-2.8f));

    public static final Item LEAD_GUARD = registerItem("ircompat/lead_guard",new Item(new FabricItemSettings()));
    //Sword
    public static final Item DULL_LEAD_BLADE = registerItem("ircompat/dull_lead_blade",new Item(new FabricItemSettings())
    {   @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
    });
    public static final Item SHARPENED_LEAD_BLADE = registerItem("ircompat/sharpened_lead_blade",
            new Item(new FabricItemSettings()));
    public static final Item DULL_LEAD_SWORD = registerItem("ircompat/dull_lead_sword",
            new DullSwordItem(IRToolMaterial.LEAD,2,-1.5F));
    public static final Item LEAD_WHETSTONE = registerItem("ircompat/lead_whetstone",
            new Item(new FabricItemSettings())
            {	//Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.lead_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.lead_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });

    //Silver
    //Axe
    public static final Item DULL_SILVER_AXE_HEAD = registerItem("ircompat/dull_silver_axe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_SILVER_AXE_HEAD = registerItem("ircompat/sharpened_silver_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_SILVER_AXE = registerItem("ircompat/dull_silver_axe",
            new DullAxeItem(IRToolMaterial.SILVER,1,3F));
    //Hoe

    public static final Item DULL_SILVER_HOE_HEAD = registerItem("ircompat/dull_silver_hoe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_SILVER_HOE_HEAD = registerItem("ircompat/sharpened_silver_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_SILVER_HOE = registerItem("ircompat/dull_silver_hoe",
            new DullHoeItem(IRToolMaterial.SILVER,-1,-2.8f));
    //Pickaxe

    public static final Item DULL_SILVER_PICKAXE_HEAD = registerItem("ircompat/dull_silver_pickaxe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_SILVER_PICKAXE_HEAD = registerItem("ircompat/sharpened_silver_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_SILVER_PICKAXE = registerItem("ircompat/dull_silver_pickaxe",
            new DullPickaxeItem(IRToolMaterial.SILVER,1,-2.8f));
    //Shovel

    public static final Item DULL_SILVER_SHOVEL_HEAD = registerItem("ircompat/dull_silver_shovel_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_SILVER_SHOVEL_HEAD = registerItem("ircompat/sharpened_silver_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_SILVER_SHOVEL = registerItem("ircompat/dull_silver_shovel",
            new DullShovelItem(IRToolMaterial.SILVER,1,-2.8f));

    public static final Item SILVER_GUARD = registerItem("ircompat/silver_guard",new Item(new FabricItemSettings()));
    public static final Item DULL_SILVER_BLADE = registerItem("ircompat/dull_silver_blade",new Item(new FabricItemSettings())
    {   @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
    });
    public static final Item SHARPENED_SILVER_BLADE = registerItem("ircompat/sharpened_silver_blade",
            new Item(new FabricItemSettings()));
    public static final Item DULL_SILVER_SWORD = registerItem("ircompat/dull_silver_sword",
            new DullSwordItem(IRToolMaterial.SILVER,2,-1.5F));
    public static final Item SILVER_WHETSTONE = registerItem("ircompat/silver_whetstone",
            new Item(new FabricItemSettings())
            {	//Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.silver_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.silver_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });
    //Steel
    //Axe

    public static final Item DULL_STEEL_AXE_HEAD = registerItem("ircompat/dull_steel_axe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_STEEL_AXE_HEAD = registerItem("ircompat/sharpened_steel_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_STEEL_AXE = registerItem("ircompat/dull_steel_axe",
            new DullAxeItem(IRToolMaterial.STEEL,1,3F));
    //Hoe

    public static final Item DULL_STEEL_HOE_HEAD = registerItem("ircompat/dull_steel_hoe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_STEEL_HOE_HEAD = registerItem("ircompat/sharpened_steel_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_STEEL_HOE = registerItem("ircompat/dull_steel_hoe",
            new DullHoeItem(IRToolMaterial.STEEL,-1,-2.8f));
    //Pickaxe

    public static final Item DULL_STEEL_PICKAXE_HEAD = registerItem("ircompat/dull_steel_pickaxe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_STEEL_PICKAXE_HEAD = registerItem("ircompat/sharpened_steel_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_STEEL_PICKAXE = registerItem("ircompat/dull_steel_pickaxe",
            new DullPickaxeItem(IRToolMaterial.STEEL, 1,-2.8f));
    //Shovel

    public static final Item DULL_STEEL_SHOVEL_HEAD = registerItem("ircompat/dull_steel_shovel_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_STEEL_SHOVEL_HEAD = registerItem("ircompat/sharpened_steel_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_STEEL_SHOVEL = registerItem("ircompat/dull_steel_shovel",
            new DullShovelItem(IRToolMaterial.STEEL,1,-2.8f));

    public static final Item STEEL_GUARD = registerItem("ircompat/steel_guard",new Item(new FabricItemSettings()));
    public static final Item DULL_STEEL_BLADE = registerItem("ircompat/dull_steel_blade",new Item(new FabricItemSettings())
    {   @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
    });
    public static final Item SHARPENED_STEEL_BLADE = registerItem("ircompat/sharpened_steel_blade",
            new Item(new FabricItemSettings()));
    public static final Item DULL_STEEL_SWORD = registerItem("ircompat/dull_steel_sword",
            new DullSwordItem(IRToolMaterial.STEEL,4,-2.0F));
    public static final Item STEEL_WHETSTONE = registerItem("ircompat/steel_whetstone",
            new Item(new FabricItemSettings())
            {	//Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.steel_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.steel_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });

    //Tin
    //Axe
    public static final Item DULL_TIN_AXE_HEAD = registerItem("ircompat/dull_tin_axe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_TIN_AXE_HEAD = registerItem("ircompat/sharpened_tin_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_TIN_AXE = registerItem("ircompat/dull_tin_axe",
            new DullAxeItem(IRToolMaterial.TIN,1,3F));
    //Hoe

    public static final Item DULL_TIN_HOE_HEAD = registerItem("ircompat/dull_tin_hoe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_TIN_HOE_HEAD = registerItem("ircompat/sharpened_tin_hoe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_TIN_HOE = registerItem("ircompat/dull_tin_hoe",
            new DullHoeItem(IRToolMaterial.TIN,-1,-2.8f));
    //Pickaxe

    public static final Item DULL_TIN_PICKAXE_HEAD = registerItem("ircompat/dull_tin_pickaxe_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_TIN_PICKAXE_HEAD = registerItem("ircompat/sharpened_tin_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_TIN_PICKAXE = registerItem("ircompat/dull_tin_pickaxe",
            new DullPickaxeItem(IRToolMaterial.TIN,0,-2.8f));
    //Shovel

    public static final Item DULL_TIN_SHOVEL_HEAD = registerItem("ircompat/dull_tin_shovel_head",
            new Item(new FabricItemSettings())	{
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
                }
            });
    public static final Item SHARPENED_TIN_SHOVEL_HEAD = registerItem("ircompat/sharpened_tin_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item DULL_TIN_SHOVEL = registerItem("ircompat/dull_tin_shovel",
            new DullShovelItem(IRToolMaterial.TIN,0,-2.8f));

    public static final Item TIN_GUARD = registerItem("ircompat/tin_guard",new Item(new FabricItemSettings()));
    public static final Item DULL_TIN_BLADE = registerItem("ircompat/dull_tin_blade",new Item(new FabricItemSettings())
    {   @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.sharpen").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
    });
    public static final Item SHARPENED_TIN_BLADE = registerItem("ircompat/sharpened_tin_blade",
            new Item(new FabricItemSettings()));
    public static final Item DULL_TIN_SWORD = registerItem("ircompat/dull_tin_sword",
            new DullSwordItem(IRToolMaterial.TIN,2,-1.5F));
    public static final Item TIN_WHETSTONE = registerItem("ircompat/tin_whetstone",
            new Item(new FabricItemSettings())
            {	//Tooltip
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.expert_weapons.tin_whetstone").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                    tooltip.add(Text.translatable("tooltip.expert_weapons.tin_whetstone2").formatted(Formatting.ITALIC, Formatting.DARK_GRAY));
                }
            });
    
    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_BRONZE_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_BRONZE_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_BRONZE_AXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_BRONZE_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_BRONZE_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_BRONZE_HOE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_BRONZE_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_BRONZE_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_BRONZE_PICKAXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_BRONZE_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_BRONZE_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_BRONZE_SHOVEL);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_COPPER_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_COPPER_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_COPPER_AXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_COPPER_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_COPPER_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_COPPER_HOE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_COPPER_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_COPPER_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_COPPER_PICKAXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_COPPER_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_COPPER_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_COPPER_SHOVEL);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_LEAD_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_LEAD_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_LEAD_AXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_LEAD_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_LEAD_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_LEAD_HOE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_LEAD_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_LEAD_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_LEAD_PICKAXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_LEAD_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_LEAD_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_LEAD_SHOVEL);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_SILVER_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_SILVER_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_SILVER_AXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_SILVER_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_SILVER_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_SILVER_HOE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_SILVER_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_SILVER_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_SILVER_PICKAXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_SILVER_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_SILVER_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_SILVER_SHOVEL);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_STEEL_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_STEEL_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_STEEL_AXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_STEEL_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_STEEL_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_STEEL_HOE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_STEEL_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_STEEL_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_STEEL_PICKAXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_STEEL_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_STEEL_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_STEEL_SHOVEL);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_TIN_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_TIN_AXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_TIN_AXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_TIN_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_TIN_HOE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_TIN_HOE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_TIN_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_TIN_PICKAXE_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_TIN_PICKAXE);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_TIN_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, SHARPENED_TIN_SHOVEL_HEAD);
        addToItemGroup(Initialize_Mod.EXPERT_TOOLS, DULL_TIN_SHOVEL);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, BRONZE_GUARD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_BRONZE_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, SHARPENED_BRONZE_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_BRONZE_SWORD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, BRONZE_WHETSTONE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, COPPER_GUARD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, SHARPENED_COPPER_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_COPPER_SWORD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, COPPER_WHETSTONE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, LEAD_GUARD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, SHARPENED_LEAD_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_LEAD_SWORD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, LEAD_WHETSTONE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, SILVER_GUARD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_SILVER_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, SHARPENED_SILVER_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_SILVER_SWORD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, SILVER_WHETSTONE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, STEEL_GUARD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_STEEL_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, SHARPENED_STEEL_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_STEEL_SWORD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, STEEL_WHETSTONE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, TIN_GUARD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, SHARPENED_TIN_BLADE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_TIN_SWORD);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, TIN_WHETSTONE);
        addToItemGroup(Initialize_Mod.EXPERT_WEAPONS, DULL_TIN_BLADE);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}
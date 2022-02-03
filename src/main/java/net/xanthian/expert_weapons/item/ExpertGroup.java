package net.xanthian.expert_weapons.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import net.xanthian.expert_weapons.Initialize_Mod;

public class ExpertGroup {
    public static final ItemGroup EXPERT_WEAPONS = FabricItemGroupBuilder.build(new Identifier(Initialize_Mod.MOD_ID, "expert_weapons"),
        () -> new ItemStack(ExpertWeapons.SHARPENED_DIAMOND_BLADE));
    public static final ItemGroup EXPERT_TOOLS = FabricItemGroupBuilder.build(new Identifier(Initialize_Mod.MOD_ID, "expert_tools"),
            () -> new ItemStack(ExpertTools.SHARPENED_DIAMOND_AXE_HEAD));
}
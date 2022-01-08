package net.xanthian.expert_weapons.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import net.xanthian.expert_weapons.Initialize_Mod;

public class ExpertGroup {
    public static final ItemGroup EXPERT = FabricItemGroupBuilder.build(new Identifier(Initialize_Mod.MOD_ID, "expert"),
        () -> new ItemStack(ExpertWeapons.SWORD_HILT));
}

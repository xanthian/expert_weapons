package net.xanthian.expert_weapons.util;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;


public class ModCreativeModeTab {
    public static final CreativeModeTab EW_TAB = new CreativeModeTab("expert_weapons") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(Items.DIAMOND_SWORD);
        }
    };
}
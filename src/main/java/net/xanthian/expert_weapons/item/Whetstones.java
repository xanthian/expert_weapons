package net.xanthian.expert_weapons.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xanthian.expert_weapons.Initialise;
import net.xanthian.expert_weapons.util.ModCreativeModeTab;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class Whetstones {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Initialise.MOD_ID);

    public static final RegistryObject<Item> IRON_WHETSTONE = ITEMS.register("iron_whetstone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)) {
                @Override
                public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.expert_weapons.iron_whetstone").withStyle(ChatFormatting.ITALIC, ChatFormatting.DARK_GRAY));
                    pTooltipComponents.add(Component.translatable("tooltip.expert_weapons.iron_whetstone2").withStyle(ChatFormatting.ITALIC, ChatFormatting.DARK_GRAY));
                }
            });

    public static final RegistryObject<Item> GOLDEN_WHETSTONE = ITEMS.register("golden_whetstone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)) {
                @Override
                public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.expert_weapons.golden_whetstone").withStyle(ChatFormatting.ITALIC, ChatFormatting.DARK_GRAY));
                    pTooltipComponents.add(Component.translatable("tooltip.expert_weapons.golden_whetstone2").withStyle(ChatFormatting.ITALIC, ChatFormatting.DARK_GRAY));
                }
            });

    public static final RegistryObject<Item> DIAMOND_WHETSTONE = ITEMS.register("diamond_whetstone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)) {
                @Override
                public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.expert_weapons.diamond_whetstone").withStyle(ChatFormatting.ITALIC, ChatFormatting.DARK_GRAY));
                    pTooltipComponents.add(Component.translatable("tooltip.expert_weapons.diamond_whetstone2").withStyle(ChatFormatting.ITALIC, ChatFormatting.DARK_GRAY));
                }
            });

    public static final RegistryObject<Item> NETHERITE_WHETSTONE = ITEMS.register("netherite_whetstone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)) {
                @Override
                public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.expert_weapons.netherite_whetstone").withStyle(ChatFormatting.ITALIC, ChatFormatting.DARK_GRAY));
                    pTooltipComponents.add(Component.translatable("tooltip.expert_weapons.netherite_whetstone2").withStyle(ChatFormatting.ITALIC, ChatFormatting.DARK_GRAY));
                }
            });
}
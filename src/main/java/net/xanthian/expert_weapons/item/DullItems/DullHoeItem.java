package net.xanthian.expert_weapons.item.DullItems;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.xanthian.expert_weapons.util.ModCreativeModeTab;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class DullHoeItem extends HoeItem {

    public DullHoeItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, new Item.Properties().defaultDurability(pTier.getUses() / 2).tab(ModCreativeModeTab.EW_TAB));
    }

    @Override
    public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.expert_weapons.no_enchant").withStyle(ChatFormatting.ITALIC, ChatFormatting.RED));
        pTooltipComponents.add(Component.translatable("tooltip.expert_weapons.no_enchant2").withStyle(ChatFormatting.ITALIC, ChatFormatting.GRAY));
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public boolean isEnchantable(@NotNull ItemStack stack) {
        return false;
    }
}

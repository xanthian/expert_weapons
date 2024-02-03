package net.xanthian.expert_weapons.item.DullItems;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.xanthian.expert_weapons.util.ModCreativeModeTab;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class DullItem extends Item {

    public DullItem() {
        super(new Item.Properties().tab(ModCreativeModeTab.EW_TAB));
    }

    @Override
    public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.expert_weapons.sharpen").withStyle(ChatFormatting.ITALIC, ChatFormatting.GRAY));
    }
}

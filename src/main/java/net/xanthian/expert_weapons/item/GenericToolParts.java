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

public class GenericToolParts {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Initialise.MOD_ID);

    // GENERIC
    public static final RegistryObject<Item> TOOL_FASTENER = ITEMS.register("tool_fastener",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)) {
                @Override
                public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.expert_weapons.nail_duh").withStyle(ChatFormatting.ITALIC, ChatFormatting.GRAY));
                }
            });
    public static final RegistryObject<Item> TOOL_HANDLE = ITEMS.register("tool_handle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EW_TAB)));

}
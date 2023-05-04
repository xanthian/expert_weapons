package net.xanthian.expert_weapons.item.DullItems;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.xanthian.expert_weapons.Initialize_Mod;

import java.util.List;

public class DullAxeItem extends AxeItem{

    public DullAxeItem(ToolMaterial material, float attackSpeed, float attackDamage) {
        super(material, attackSpeed, attackDamage, new FabricItemSettings().maxDamage(material.getDurability()/2));
    }


    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant").formatted(Formatting.ITALIC, Formatting.RED));
        tooltip.add(Text.translatable("tooltip.expert_weapons.no_enchant2").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
    @Override
    public boolean isEnchantable(ItemStack stack) {
        return false;
    }
    @Override
    public int getEnchantability() {
        return 0;
    }
}

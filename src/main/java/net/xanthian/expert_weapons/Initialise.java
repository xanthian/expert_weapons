package net.xanthian.expert_weapons;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.xanthian.expert_weapons.item.*;

@Mod(Initialise.MOD_ID)
public class Initialise {

    public static final String MOD_ID = "expert_weapons";

    public Initialise() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        DullToolParts.ITEMS.register(modEventBus);
        DullTools.ITEMS.register(modEventBus);
        DullWeaponParts.ITEMS.register(modEventBus);
        DullWeapons.ITEMS.register(modEventBus);
        GenericToolParts.ITEMS.register(modEventBus);
        GenericWeaponParts.ITEMS.register(modEventBus);
        SharpenedToolParts.ITEMS.register(modEventBus);
        SharpenedWeaponsParts.ITEMS.register(modEventBus);
        Whetstones.ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
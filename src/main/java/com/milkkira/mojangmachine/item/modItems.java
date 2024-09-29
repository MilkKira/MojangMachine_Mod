package com.milkkira.mojangmachine.item;

import com.milkkira.mojangmachine.mojangmachine;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class modItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, mojangmachine.MOD_ID);

    public static final RegistryObject<Item> MILK_ICON_ITEM = ITEMS.register("milk_icon",
            () -> new Item(new Item.Properties().tab(modItemsGroup.mojangmachine_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

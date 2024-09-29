package com.milkkira.mojangmachine.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class modItemsGroup {

    public static  final CreativeModeTab mojangmachine_TAB = new CreativeModeTab("mojangmachineTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(modItems.MOJANG_MACHINE_ITEM.get());
        }
    };
}

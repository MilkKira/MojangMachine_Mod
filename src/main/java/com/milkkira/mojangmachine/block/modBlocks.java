package com.milkkira.mojangmachine.block;

import com.milkkira.mojangmachine.mojangmachine;
import com.milkkira.mojangmachine.item.modItems;
import com.milkkira.mojangmachine.item.modItemsGroup;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class modBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, mojangmachine.MOD_ID);


    //注册方块
    /*
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> tRegistryObject = BLOCKS.register(name, block);
        registerBlockItem(name, tRegistryObject);
        return tRegistryObject;
    }*/

    //注册方块物品
    private static <T extends Block> void registerBlockItem(String name, Supplier<T> block) {
        modItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(modItemsGroup.mojangmachine_TAB)));
    }

    //注册
    public static void regeister(IEventBus eventBus) {
        BLOCKS.register(eventBus);

    }
}

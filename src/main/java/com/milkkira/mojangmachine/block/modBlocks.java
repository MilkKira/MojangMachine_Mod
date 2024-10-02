package com.milkkira.mojangmachine.block;

import com.milkkira.mojangmachine.mojangmachine;
import com.milkkira.mojangmachine.item.modItems;
import com.milkkira.mojangmachine.item.modItemsGroup;
import com.mojang.blaze3d.shaders.Uniform;
import com.mojang.logging.LogUtils;
import net.minecraft.util.datafix.fixes.BlockEntityKeepPacked;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropperBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.CallbackI;

import java.util.function.Supplier;

public class modBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, mojangmachine.MOD_ID);


    //注册方块
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> tRegistryObject = BLOCKS.register(name, block);
        //调用注册方块物品方法
        registerBlockItem(name, tRegistryObject);
        return tRegistryObject;
    }

    //注册方块物品并直接丢到我们的标签页[modItemsGroup.mojangmachine_TAB]
    private static <T extends Block> void registerBlockItem(String name, Supplier<T> block) {
        modItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(modItemsGroup.mojangmachine_TAB)));
    }



    public static final RegistryObject<Block> LINEMACHINE_BLOCK = registerBlock("line_machine",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6.0F).requiresCorrectToolForDrops())
            );
/**
 * DropExperienceBlock 在1.19+版本中更新 1.18.2版本未知。
 */
   /*
   public static final RegistryObject<Block> MILK_ORE = registerBlock("milk_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6.0F).requiresCorrectToolForDrops(),UniformInt.of(3,7))

    );
    */

    /*
    @ 单独注册方块以及单独注册方块物品方法
    public static final RegistryObject<Block> LINEMACHINE_BLOCK = BLOCKS.register("line_machine.json",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6.0F).requiresCorrectToolForDrops())
    );


    public static final RegistryObject<Item> LINEMACHINE_BLOCK_ITEM = modItems.ITEMS.register("line_machine.json",
            () -> new BlockItem(LINEMACHINE_BLOCK.get(),new Item.Properties().tab(modItemsGroup.mojangmachine_TAB))
    );
     */




    //注册
    public static void regeister(IEventBus eventBus) {
        BLOCKS.register(eventBus);

    }
}

package com.arynem.ramiel.block;

import com.arynem.ramiel.Ramiel;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


            public static final Block Angel_Skin = registerBlock("angel_skin",
                    new Block(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.AMETHYST_CLUSTER).luminance(state -> 15)));


    private static Block registerBlock(String name, Block block) {
        regisiterBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Ramiel.MOD_ID, name), block);
    }

    private static void regisiterBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Ramiel.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }

        public static void registerModBlocks(){


            Ramiel.LOGGER.info("Registering Mod Blocks For " + Ramiel.MOD_ID);
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> fabricItemGroupEntries.add(ModBlocks.Angel_Skin));
        }
}

package com.arynem.morecraftingrecipes.block;

import com.arynem.morecraftingrecipes.MoreCraftingRecipes;
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


            public static final Block Angle_Skin = registerBlock("angle_skin",
                    new Block(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.AMETHYST_CLUSTER)));


    private static Block registerBlock(String name, Block block) {
        regisiterBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreCraftingRecipes.MOD_ID, name), block);
    }

    private static void regisiterBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(MoreCraftingRecipes.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }

        public static void registerModBlocks(){


            MoreCraftingRecipes.LOGGER.info("Registering Mod Blocks For " + MoreCraftingRecipes.MOD_ID);
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> fabricItemGroupEntries.add(ModBlocks.Angle_Skin));
        }
}

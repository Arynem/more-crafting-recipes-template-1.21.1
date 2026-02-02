package com.arynem.morecraftingrecipes;

import com.arynem.morecraftingrecipes.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreCraftingRecipes implements ModInitializer {
	public static final String MOD_ID = "more-crafting-recipes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}
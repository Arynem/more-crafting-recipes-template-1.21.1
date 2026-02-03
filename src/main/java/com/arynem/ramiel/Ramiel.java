package com.arynem.ramiel;

import com.arynem.ramiel.block.ModBlocks;
import com.arynem.ramiel.item.ModItemGroups;
import com.arynem.ramiel.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ramiel implements ModInitializer {
	public static final String MOD_ID = "ramiel";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}

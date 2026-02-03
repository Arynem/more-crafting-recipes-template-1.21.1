package com.arynem.ramiel.item;

import com.arynem.ramiel.Ramiel;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SCRAP_OF_ANGEL_SKIN = registerItem("scrap_of_angel_skin", new Item(new  Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Ramiel.MOD_ID, name), item);
    }


    public static void registerModItems() {
        Ramiel.LOGGER.info("Registering Mod Items for " + Ramiel.MOD_ID);
        };
}

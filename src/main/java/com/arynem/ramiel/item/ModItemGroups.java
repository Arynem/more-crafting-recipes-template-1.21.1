package com.arynem.ramiel.item;

import com.arynem.ramiel.Ramiel;
import com.arynem.ramiel.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RAMIEL_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Ramiel.MOD_ID, "ramiel_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.Angel_Skin))
                    .displayName(Text.translatable("itemgroup.ramiel.ramiel_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SCRAP_OF_ANGEL_SKIN);
                        entries.add(ModBlocks.Angel_Skin);
                    }).build());



    public static void registerItemGroups() {
        Ramiel.LOGGER.info("Registering Item Groups for " + Ramiel.MOD_ID);
    }
}

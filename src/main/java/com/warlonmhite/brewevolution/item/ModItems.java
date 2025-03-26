package com.warlonmhite.brewevolution.item;

import com.warlonmhite.brewevolution.Brewevolution;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CHEESE = registerItem( "cheese", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Brewevolution.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Brewevolution.LOGGER.info("Registering Mod Items for " + Brewevolution.MOD_ID);


    }

}

package com.warlonmhite.brewevolution.item;
import com.warlonmhite.brewevolution.Brewevolution;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item HOPS_SEEDS = registerItem("hops_seeds", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Brewevolution.MOD_ID, name), item);
    }

    public static void registerModItems() {
    }
}


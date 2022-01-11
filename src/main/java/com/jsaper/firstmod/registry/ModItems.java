package com.jsaper.firstmod.registry;

import com.jsaper.firstmod.firstMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item JACKSONU = new Item(new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item JACKSONN = new Item(new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item JACKSOND = new Item(new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item JACKSONI = new Item(new Item.Settings().group(ItemGroup.TOOLS));



    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(firstMod.MOD_ID, "jacksonu"), JACKSONU);
        Registry.register(Registry.ITEM, new Identifier(firstMod.MOD_ID, "jacksonn"), JACKSONN);
        Registry.register(Registry.ITEM, new Identifier(firstMod.MOD_ID, "jacksoni"), JACKSONI);
        Registry.register(Registry.ITEM, new Identifier(firstMod.MOD_ID, "jacksond"), JACKSOND);

    }
}

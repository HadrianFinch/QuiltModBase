package com.skadoosh.template.items;

import java.util.HashMap;

import com.skadoosh.mcutils.datagen.AutoTranslate;
import com.skadoosh.mcutils.datagen.GenerateItemModel;
import com.skadoosh.template.template;
import com.skadoosh.template.components.ModComponents;
import com.skadoosh.template.items.itemGroup.AutoItemGroup;
import com.skadoosh.template.items.itemGroup.ModItemGroups;

import net.minecraft.block.Block;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.item.Item;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;

public final class ModItems
{
    public static final HashMap<Block, Item> BLOCK_ITEMS = new HashMap<>();


    public static void init()
    {
    }

    private static Item register(String name, Item item)
    {
        return Registry.register(Registries.ITEM, template.id(name), item);
    }
}

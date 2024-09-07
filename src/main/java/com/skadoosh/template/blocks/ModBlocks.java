package com.skadoosh.template.blocks;

import com.skadoosh.mcutils.datagen.AutoTranslate;
import com.skadoosh.mcutils.datagen.GenerateItemModel;
import com.skadoosh.template.template;
import com.skadoosh.template.items.ModItems;
import com.skadoosh.template.items.itemGroup.AutoItemGroup;
import com.skadoosh.template.items.itemGroup.ModItemGroups;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class ModBlocks
{
    private static Block register(String name, Block block, boolean shouldMakeItem)
    {
        Identifier identifier = template.id(name);

        if (shouldMakeItem)
        {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, identifier, blockItem);
			ModItems.BLOCK_ITEMS.put(block, blockItem);
        }

        return Registry.register(Registries.BLOCK, identifier, block);
    }

    public static void init()
    {
    }
}

package com.skadoosh.template;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.skadoosh.mcutils.cadmium.Cadmium;
import com.skadoosh.template.blockentities.ModBlockEntities;
import com.skadoosh.template.blocks.ModBlocks;
import com.skadoosh.template.commands.ModCommands;
import com.skadoosh.template.components.ModComponents;
import com.skadoosh.template.events.ModEvents;
import com.skadoosh.template.items.ModItems;
import com.skadoosh.template.items.itemGroup.ModItemGroups;
import com.skadoosh.template.misc.ModParticles;

import net.minecraft.util.Identifier;

public class template implements ModInitializer
{
    public static final Logger LOGGER = LoggerFactory.getLogger("template");
    public static final String NAMESPACE = "template";

    @Override
    public void onInitialize(ModContainer mod)
    {
        Cadmium.initialize();
        
        ModParticles.init();
        ModBlocks.init();
        ModItems.init();
        ModComponents.init();
        ModBlockEntities.init();
        
        ModItemGroups.register();
        ModEvents.register();
        ModCommands.register();
    }

    public static Identifier id(String name)
    {
        return Identifier.of(NAMESPACE, name);
    }
}

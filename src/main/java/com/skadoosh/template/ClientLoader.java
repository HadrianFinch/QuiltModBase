package com.skadoosh.template;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

import com.skadoosh.mcutils.cadmium.Cadmium;
import com.skadoosh.template.items.ModItems;

import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ClientLoader implements ClientModInitializer
{
    @Override
    public void onInitializeClient(ModContainer mod)
    {
        template.LOGGER.info("Template Client Loaded!");
        Cadmium.initializeClient();
    }
}

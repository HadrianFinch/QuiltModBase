package com.skadoosh.template.commands;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public final class ModCommands
{
    public static void register()
    {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
        });
    }
}

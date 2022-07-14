package com.foxdev.ldev;

import org.bukkit.plugin.java.JavaPlugin;

public final class LDev extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("gui").setExecutor(new GuiMaker());


        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

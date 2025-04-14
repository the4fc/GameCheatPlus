package com.tuplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class GameCheatPlus extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("GameCheat+ activado!");

        // Registrar comandos
        getCommand("helpop").setExecutor(new HelpOpCommand());
        getCommand("report").setExecutor(new ReportCommand());
        getCommand("history").setExecutor(new HistoryCommand());
        getCommand("afk").setExecutor(new AfkCommand());
        getCommand("gamecheat").setExecutor(new GameCheatCommand());

        // Otros inicializadores...
    }

    @Override
    public void onDisable() {
        getLogger().info("GameCheat+ desactivado.");
    }
}

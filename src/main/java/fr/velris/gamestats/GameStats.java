package fr.velris.gamestats;

import org.bukkit.plugin.java.JavaPlugin;

public final class GameStats extends JavaPlugin {

    private static GameStats instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static GameStats getInstance() {
        return instance;
    }
}

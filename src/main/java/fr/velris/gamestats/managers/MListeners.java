package fr.velris.gamestats.managers;

import fr.velris.gamestats.GameStats;
import org.bukkit.plugin.PluginManager;

public class MListeners {

    private final GameStats plugin = GameStats.getInstance();

    public void LoadListeners() {
        PluginManager pm = plugin.getServer().getPluginManager();
    }

}

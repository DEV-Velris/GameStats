package fr.velris.gamestats.managers;

import fr.velris.gamestats.GameStats;
import fr.velris.gamestats.commands.CDebug;

public class MCommands {

    private final GameStats plugin = GameStats.getInstance();

    public void LoadCommands() {
        //Create command “debug”
        plugin.getCommand("debug").setExecutor(new CDebug());
    }

}

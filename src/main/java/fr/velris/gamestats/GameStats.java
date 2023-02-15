package fr.velris.gamestats;

import fr.velris.gamestats.managers.MCommands;
import fr.velris.gamestats.managers.MFiles;
import fr.velris.gamestats.managers.MListeners;
import fr.velris.gamestats.utils.UUtils;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class GameStats extends JavaPlugin {

    //Instance
    private static GameStats instance;

    /*
    MANAGERS
     */
    privatze MFiles mFiles;
    private MListeners mListeners;
    private MCommands mCommands;

    /*
    UTILS
     */
    private UUtils utils;

    @Override
    public void onEnable() {
        Log(Level.INFO, "Loading the plugin...");
        //Instance
        instance = this;

        /*
        MANAGERS
         */
        mFiles = new MFiles();
        //Load files before all
        mFiles.LoadFiles();
        mListeners = new MListeners();
        mCommands = new MCommands();

        /*
        UTILS
         */
        utils = new UUtils();

        /*
        INITIALIZATION
         */
        mListeners.LoadListeners();
        mCommands.LoadCommands();
        Log(Level.INFO, "Plugin ready");
    }

    @Override
    public void onDisable() {
        Log(Level.INFO, "Unloading the plugin...");
    }

    public void Log(Level level, String message) {
        getLogger().log(level, message);
    }

    public static GameStats getInstance() {
        return instance;
    }

    public MFiles getmFiles() {
        return mFiles;
    }

    public MListeners getmListeners() {
        return mListeners;
    }

    public MCommands getmCommands() {
        return mCommands;
    }

    public UUtils getUtils() {
        return utils;
    }
}

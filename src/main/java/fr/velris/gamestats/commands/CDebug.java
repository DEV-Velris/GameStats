package fr.velris.gamestats.commands;

import fr.velris.gamestats.GameStats;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CDebug implements CommandExecutor {

    private final GameStats plugin = GameStats.getInstance();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }
}

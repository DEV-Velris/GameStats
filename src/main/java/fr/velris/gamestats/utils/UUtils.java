package fr.velris.gamestats.utils;

import fr.velris.gamestats.GameStats;
import org.bukkit.entity.Player;

public class UUtils {

    private final GameStats plugin = GameStats.getInstance();

    //TODO Test getPlayerPing
    public String getPlayerPing(Player player) {
        int ping = player.getPing();

        if (ping <= 40) {
            return "§a"+ping;
        } else if (ping <= 100) {
            return "§6"+ping;
        } else {
            return "§4"+ping;
        }
    }

    //TODO Test getPlayerLocation
    public String getPlayerLocation(Player player) {
        return "§bX§7: §c"+player.getLocation().getBlockX()+" §bY§7: §c"+player.getLocation().getBlockY()+" §bZ§7: §c"+player.getLocation().getBlockZ();
    }

}

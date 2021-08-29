package me.jacksondasheng.soupPvPEating;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static Server server = Bukkit.getServer();

    @Override
    public void onEnable() {
        server.getConsoleSender().sendMessage("Enabling SoupPvPEating");

        server.getPluginManager().registerEvents(new SoupEater(), this);

        server.getConsoleSender().sendMessage("SoupPvPEating enabled");
    }

    @Override
    public void onDisable() {
        server.getConsoleSender().sendMessage("SoupPvPEating disabled");
    }
}

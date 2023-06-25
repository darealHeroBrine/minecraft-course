package me.brian.guitesting;

import me.brian.guitesting.Events.MenuListener;
import me.brian.guitesting.commands.CreeperCommand;
import me.brian.guitesting.commands.MenuCommand;
import me.brian.guitesting.commands.NukerCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.*;
import java.util.logging.Logger;

public final class Guitesting extends JavaPlugin {
    public double Cvs;
    double CVS1 = getConfig().getDefaults().getDouble("Version");
    public boolean debug;
    public boolean fopTg;
    public static Logger log;

    public final Logger Plog;

    {
        Cvs = getConfig().getDouble("Version");
        debug = getConfig().getBoolean("Debug");
        log = Bukkit.getLogger();
        Plog = this.getLogger();
    }
    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("menu").setExecutor(new MenuCommand());
        getCommand("Nuker").setExecutor(new NukerCommand());
        getCommand("Creep").setExecutor(new CreeperCommand());
        Bukkit.getPluginManager().registerEvents(new MenuListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

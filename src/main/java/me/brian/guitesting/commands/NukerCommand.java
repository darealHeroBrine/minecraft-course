package me.brian.guitesting.commands;

import me.brian.guitesting.Guitesting;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class NukerCommand implements CommandExecutor {
    private Guitesting main;

    @Override
    public boolean onCommand(@NotNull CommandSender Sender, @NotNull Command cmd, @NotNull String s, String[] args) {
        if (Sender instanceof Player){
            Player player = (Player) Sender;
            if (args.length == 1){
                Player target = Bukkit.getPlayer(args[0]);
                if (args[0].toLowerCase().toString() != "me" || Bukkit.getPlayer(args[0].toLowerCase()) != null) {
                    player.sendMessage("1");
                    if (player.getPlayer().getUniqueId().toString().equals("b7b7f2ee-c452-436b-9204-c70a70c89203")) {
                        player.sendMessage("2");
                        player.sendMessage("your uuid is " + ChatColor.GREEN + "Confirmed");
                        if (Bukkit.getPlayer(args[0]) != null) {

                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(0, 10, 0), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(2, 10, 0), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(2, 10, 2), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(0, 10, 2), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-2, 10, 0), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-2, 10, -2), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(0, 10, -2), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(2, 10, -2), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-2, 10, 2), EntityType.PRIMED_TNT);
                            //
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(4, 10, 4), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(4, 10, 2), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(2, 10, 4), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-4, 10, -4), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(4, 10, -2), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-2, 10, -4), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(0, 10, 4), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(0, 10, -4), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(2, 10, -4), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(4, 10, -4), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-4, 10, -2), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-4, 10, 0), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-4, 10, 2), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-4, 10, 4), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-2, 10, 4), EntityType.PRIMED_TNT);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(4, 10, 0), EntityType.PRIMED_TNT);
                            target.sendMessage("you have been nuked!");
                        }
                    }else{
                        player.sendMessage("3");
                        player.sendMessage("Nuking " + args[0].toString() + "'s location.");
                        target.playSound(target.getLocation(), Sound.ENTITY_TNT_PRIMED, SoundCategory.MASTER, 1, 1);
                    }}
            }else {
                player.sendMessage("Nuking Your location.\n   " + player.getLocation().getX() + " " + player.getLocation().getY() + " " + player.getLocation().getZ());
            }
        }else {
            main.Plog.warning(ChatColor.RED + "Player command only");
        }


        return false;
    }
}

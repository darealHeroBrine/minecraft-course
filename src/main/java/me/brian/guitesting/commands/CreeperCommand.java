package me.brian.guitesting.commands;

import me.brian.guitesting.Guitesting;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.UUID;

public class CreeperCommand implements CommandExecutor {
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
                        player.sendMessage("sending creeps...");
                        //player.sendActionBar(ChatColor.GREEN + "Sending creeps");

                        if (Bukkit.getPlayer(args[0]) != null) {
                            //Player target = Bukkit.getPlayer(args[0]);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(0, 1, 0), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(2, 1, 0), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(2, 1, 2), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(0, 1, 2), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-2, 1, 0), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-2, 1, -2), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(0, 1, -2), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(2, 1, -2), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-2, 1, 2), EntityType.CREEPER);
                            //
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(4, 1, 4), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(4, 1, 2), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(2, 1, 4), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-4, 1, -4), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(4, 1, -2), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-2, 1, -4), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(0, 1, 4), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(0, 1, -4), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(2, 1, -4), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(4, 1, -4), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-4, 1, -2), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-4, 1, 0), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-4, 1, 2), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-4, 1, 4), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(-2, 1, 4), EntityType.CREEPER);
                            target.getPlayer().getWorld().spawnEntity(target.getLocation().add(4, 1, 0), EntityType.CREEPER);
                            //target.sendActionBar(ChatColor.BOLD.RED + "CREEPER!!!!");
                            //target.playSound(target.getLocation(), Sound.BLOCK_BELL_USE, 1, 0.7);
                        }//else{//player.sendActionBar(ChatColor.DARK_RED + "Creeping failed, Player not online");}
                    }else{
                        player.sendMessage("3");

                       target.playSound(target.getLocation(), Sound.ENTITY_CREEPER_PRIMED, SoundCategory.MASTER, 1, 1);
                        player.sendMessage("your uuid is " + ChatColor.GREEN + player.getUniqueId().toString());
                    }
                }
            }
        }


        return false;
    }
}

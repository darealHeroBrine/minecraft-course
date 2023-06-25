package me.brian.guitesting.commands;

import me.brian.guitesting.GUI.TestMenu;
import me.brian.guitesting.GUI.WhiteListing;
import me.brian.guitesting.Guitesting;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class MenuCommand implements CommandExecutor {
    private Guitesting main;
    @Override
    public boolean onCommand(@NotNull CommandSender Sender, @NotNull Command cmd, @NotNull String s, @NotNull String[] args) {

        if (Sender instanceof Player) {
            Player player = (Player) Sender;
            player.sendMessage("opening Menu");

            //Opening gui
            player.openInventory(new TestMenu().guiCreation());
        }else {main.Plog.warning(ChatColor.BLUE + "This command opens a gui and could crash the server if consol tries to open this." + ChatColor.DARK_RED + "\nAction Canceled!");}




        return false;
    }
}

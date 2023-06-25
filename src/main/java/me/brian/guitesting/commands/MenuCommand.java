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

           /* Inventory invtest = Bukkit.createInventory(player, 27, ChatColor.GREEN.toString() + ChatColor.BOLD + "Test gui");
            //Items them selves
            ItemStack Filler = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
            ItemStack Back = new ItemStack(Material.BARRIER);
            ItemStack Close = new ItemStack(Material.BARRIER);
            ItemStack Green = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemStack Follower = new ItemStack(Material.LEAD);
            ItemStack Subscribers = new ItemStack(Material.DIAMOND);
            ItemStack WhiteList = new ItemStack(Material.FLOWER_BANNER_PATTERN);

            //Item meta
            ItemMeta GSGP = Filler.getItemMeta();
            ItemMeta Barrier = Back.getItemMeta();
            ItemMeta Barrier2 = Close.getItemMeta();
            ItemMeta Outline = Green.getItemMeta();
            ItemMeta follows = Follower.getItemMeta();
            ItemMeta Subs = Subscribers.getItemMeta();
            ItemMeta Lists = WhiteList.getItemMeta();
            // item detail/NBT changes
            GSGP.setDisplayName(" ");
            Outline.setDisplayName(" ");
            //Outline.setLore(Arrays.asList(" "));

            follows.setDisplayName(ChatColor.BLUE + "Followers");
            Subs.setDisplayName(ChatColor.GOLD + "Subscribers");
            Lists.setDisplayName(ChatColor.WHITE + "WhiteList");
            Lists.setLore(Arrays.asList(
                    "sdad",
                    "sasdasd"
            ));
            //GSGP.setLore();
             //Barrier info
            Barrier.setDisplayName(ChatColor.RED + "Back");
            Barrier2.setDisplayName(ChatColor.DARK_RED + "Close");
            //??

            //Gui Creation
            Filler.setItemMeta(GSGP);
            Close.setItemMeta(Barrier2);
            Back.setItemMeta(Barrier);
            Green.setItemMeta(Outline);
            Follower.setItemMeta(follows);
            Subscribers.setItemMeta(Subs);
            WhiteList.setItemMeta(Lists);
            int i;
            for (i = 0; i < invtest.getSize(); i++) {invtest.setItem(i, Filler);}
            for (i = 0; i < 9; i++) {invtest.setItem(i, Green);}
            for (i = 18; i < 27; i++) {invtest.setItem(i, Green);}
            invtest.setItem(9, Green);
            invtest.setItem(17, Green);
            invtest.setItem(22, Close);
            invtest.setItem(11, Follower);
            invtest.setItem(13, Subscribers);
            invtest.setItem(15, WhiteList);*/



            //Opening gui
            player.openInventory(new TestMenu().guiCreation());
        }else {main.Plog.warning(ChatColor.BLUE + "This command opens a gui and could crash the server if consol tries to open this." + ChatColor.DARK_RED + "\nAction Canceled!");}




        return false;
    }
}

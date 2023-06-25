package me.brian.guitesting.GUI;

import com.google.common.collect.Lists;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class WhiteListing {
    public Inventory guiCreation() {
        Inventory WhitelistMenu = Bukkit.createInventory(null, InventoryType.ANVIL, ChatColor.GREEN.toString() + ChatColor.BOLD + "Add to Whitelist!");
        //Items them selves

        ItemStack WhiteList = new ItemStack(Material.PAPER);

        //Item meta
        ItemMeta paperMeta = WhiteList.getItemMeta();
        // item detail/NBT changes
        paperMeta.setDisplayName("Adding....");
        //Outline.setLore(Arrays.asList(" "));


        paperMeta.setLore(Arrays.asList(
                "To Add A Player:",
                "Type their username",
                "and pull the paper."
        ));

        //Gui Creation

        WhiteList.setItemMeta(paperMeta);


        WhitelistMenu.setItem(0, WhiteList);

        return WhitelistMenu;

    }
}
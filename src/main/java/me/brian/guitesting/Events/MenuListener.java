package me.brian.guitesting.Events;

import me.brian.guitesting.GUI.TestMenu;
import org.bukkit.block.data.type.Switch;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class MenuListener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getInventory().equals(new TestMenu().guiCreation().equals("invtest")) && e.getCurrentItem() != null) {
            Player player = (Player) e.getWhoClicked();
            switch (e.getRawSlot()) {
                case 22:
                    break;
                case 11: //Follower
                    player.sendMessage("not available yet!");
                    break;
                case 13: /// subs
                    player.sendMessage("not available yet!");
                    break;
                case 15:// whitelisting
                    player.openInventory(new TestMenu().guiCreation());
                    break;
                default:
                    return;
            }


            player.closeInventory();

        }
    }
}

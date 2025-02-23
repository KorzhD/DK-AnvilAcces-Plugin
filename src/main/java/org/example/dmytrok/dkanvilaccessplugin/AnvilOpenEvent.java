package org.example.dmytrok.dkanvilaccessplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class AnvilOpenEvent implements Listener {
    @EventHandler
    public void onInventoryClick(InventoryOpenEvent event) {

        Inventory inventory = event.getInventory();
        if (inventory.getType().equals(InventoryType.ANVIL)) {
            if (!(event.getPlayer().hasPermission("op"))) {
                event.setCancelled(true);
                event.getPlayer().sendMessage("§c You can not open Anvil at this server ;(");
            }
        }

    }
}

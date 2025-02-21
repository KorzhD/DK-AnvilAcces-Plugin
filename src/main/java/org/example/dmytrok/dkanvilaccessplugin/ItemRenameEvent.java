package org.example.dmytrok.dkanvilaccessplugin;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemRenameEvent implements Listener {
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {

        Inventory inventory = event.getInventory();
        if (inventory.getType() != InventoryType.ANVIL) {
            return;
        }


        ItemStack result = event.getCurrentItem();
        if (result == null || !result.hasItemMeta()) {
            return;
        }

        ItemMeta meta = result.getItemMeta();
        if (meta == null || !meta.hasDisplayName()) {
            return;
        }

        String displayName = meta.getDisplayName();


        if (event.getInventory().getItem(0) != null) {
            ItemStack inputItem = event.getInventory().getItem(0);


            if (inputItem.getType() == Material.CHEST && displayName.startsWith("Grave of")) {
                event.setCancelled(true);
                event.getWhoClicked().sendMessage("§4You cannot rename a chest to start with 'Grave of'.");
            }


            else if (inputItem.getType() == Material.TRIPWIRE_HOOK && displayName.startsWith("Grave Key")) {
                event.setCancelled(true);
                event.getWhoClicked().sendMessage("§4You cannot rename a hook to start with 'Grave Key'.");
            }

            else if (inputItem.getType() == Material.TOTEM && displayName.startsWith("Super Key")) {
                event.setCancelled(true);
                event.getWhoClicked().sendMessage("§4You cannot rename a totem to start with 'Super Key'.");
            }


            else if (inputItem.getType() == Material.GOLD_AXE && displayName.equals("Grave Breaker")) {
                event.setCancelled(true);
                event.getWhoClicked().sendMessage("§4You cannot rename a golden axe to 'Grave Breaker'.");
            }


            else if (inputItem.getType() == Material.WOOD_AXE && displayName.equals("Magic Wand")) {
                event.setCancelled(true);
                event.getWhoClicked().sendMessage("§4You cannot rename a wooden axe to 'Magic Wand'.");
            }
        }
    }
}

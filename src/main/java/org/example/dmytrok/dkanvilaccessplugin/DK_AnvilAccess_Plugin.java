package org.example.dmytrok.dkanvilaccessplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class DK_AnvilAccess_Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("AnvilAccess plugin enabled");

        getServer().getPluginManager().registerEvents(new ItemRenameEvent(), this);

    }

    @Override
    public void onDisable() {
        getLogger().info("AnvilAccess plugin disabled");
    }
}

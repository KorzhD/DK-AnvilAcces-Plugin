package org.example.dmytrok.dkanvilaccessplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class DK_AnvilAccess_Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("\u001B[32m!---------------AnvilAcces Plugin enabled---------------!\u001B[0m");

        getServer().getPluginManager().registerEvents(new AnvilOpenEvent(), this);

    }

    @Override
    public void onDisable() {
        getLogger().info("\u001B[32m!---------------AnvilAcces Plugin disabled---------------!\u001B[0m");
    }
}

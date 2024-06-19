package hakua_server.jp.practice;

import org.bukkit.plugin.java.JavaPlugin;

public final class Practice extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("起動しました");
        getCommand("test").setExecutor(new CommandClass());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("終了しました");
    }
}

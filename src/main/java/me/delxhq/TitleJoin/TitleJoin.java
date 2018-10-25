package me.delxhq.TitleJoin;

import me.delxhq.TitleJoin.config.Config;
import io.gomint.ChatColor;
import io.gomint.plugin.Plugin;
import io.gomint.plugin.PluginName;
import io.gomint.plugin.Version;
import me.delxhq.TitleJoin.listeners.JoinListener;

@PluginName("TitleJoin")
@Version(major = 1, minor = 0)

public class TitleJoin extends Plugin {
    public static TitleJoin instance = null;
    private Config config;

    public static TitleJoin instance() {
        return instance;
    }

    @Override
    public void onInstall() {
        instance = this;

        this.config = new Config(this);

        this.getLogger().info(ChatColor.GREEN + this.getName() + ChatColor.WHITE + " started!");

        this.registerListener(new JoinListener());
    }

    public Config getConfig() {
        return config;
    }
}


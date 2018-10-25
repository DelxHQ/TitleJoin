package me.delxhq.TitleJoin.config;

import me.delxhq.TitleJoin.TitleJoin;
import io.gomint.config.Comment;
import io.gomint.config.InvalidConfigurationException;
import io.gomint.config.YamlConfig;

import java.io.File;

public class Config extends YamlConfig {

    public Config(TitleJoin plugin) {
        try {
            this.init(new File(plugin.getDataFolder(), "config.yml"));
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    @Comment("This is where you change the title")
    private String title = "Welcome to my server!";

    @Comment("This is where you set the subtitle for the title")
    private String subTitle = "Enjoy!";

    public void saveFile(TitleJoin plugin) {
        try {
            this.save(new File(plugin.getDataFolder(), "config.yml"));
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }
}

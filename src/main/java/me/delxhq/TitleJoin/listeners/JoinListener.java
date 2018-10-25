package me.delxhq.TitleJoin.listeners;

import me.delxhq.TitleJoin.TitleJoin;
import me.delxhq.TitleJoin.config.Config;
import io.gomint.event.EventHandler;
import io.gomint.event.EventListener;
import io.gomint.event.player.PlayerJoinEvent;

import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class JoinListener implements EventListener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        TitleJoin.instance().getScheduler().schedule(new TimerTask() {
            @Override
            public void run() {
                Config config = TitleJoin.instance().getConfig() ;
                event.getPlayer().sendTitle(config.getTitle(), config.getSubTitle());
            }
        }, 5, TimeUnit.SECONDS);
    }
}

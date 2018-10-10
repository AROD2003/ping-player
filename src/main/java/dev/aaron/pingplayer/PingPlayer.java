package dev.aaron.pingplayer;

import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PingPlayer extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        registerEvents();
    }

    @Override
    public void onDisable() {

    }

    void registerEvents() {
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();

        if (event.getMessage().contains(player.getDisplayName())) {
            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_PLING, SoundCategory.AMBIENT, 5f, 5f);
        }

    }

}

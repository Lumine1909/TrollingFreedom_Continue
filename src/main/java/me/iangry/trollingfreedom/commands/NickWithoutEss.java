package me.iangry.trollingfreedom.commands;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class NickWithoutEss implements Listener {

    public void NickName(final Player p) {

        if (Bukkit.getServer().getPluginManager().getPlugin("Essentials") != null) {
            Nick eighteen = new Nick();
            eighteen.NickName(p);
        } else {
        }
    }

    public void UnNick(Player p) {
        if (Bukkit.getServer().getPluginManager().getPlugin("Essentials") != null) {
            Nick eighteen = new Nick();
            eighteen.UnNick(p);
        } else {
        }
    }
}
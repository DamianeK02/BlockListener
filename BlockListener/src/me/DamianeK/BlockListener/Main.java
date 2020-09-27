package me.DamianeK.BlockListener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.block.BlockBreakEvent;

public class Main extends JavaPlugin implements Listener {
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("§6----Turning On plugin----");
		getServer().getPluginManager().registerEvents(this,this);
	}
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§6----Turning Off plugin----");
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void onBlockBreak(BlockBreakEvent e) {
		
		Player p = e.getPlayer();
		String S1 = new String(" destroyed " + e.getBlock().getType());
		Bukkit.getConsoleSender().sendMessage("§4[BlockListener] " + "§c" + p.getName() + S1.toLowerCase());
	}
}

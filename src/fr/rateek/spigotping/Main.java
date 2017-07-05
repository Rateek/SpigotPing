package fr.rateek.spigotping;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable(){
		System.out.println("SpigotPing Enable");
		getCommand("ping").setExecutor(this);
	}
	
	@Override 
	public void onDisable(){
		System.out.println("SpigotPing Disable");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("ping")){
			if(!(sender instanceof Player)) return true;
			Player p = (Player) sender;
			p.sendMessage("§7[§bSpigotPing§7] " + "§6Your ping is §e" + ((CraftPlayer)p).getHandle().ping + " §6ms");
		}
	    return false;
	}
}

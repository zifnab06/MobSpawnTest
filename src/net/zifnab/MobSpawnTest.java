package net.zifnab.MobSpawnTest;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;

public class MobSpawnTest extends JavaPlugin implements Listener {

	@Override
	public void onEnable(){
		this.getServer().getPluginManager().registerEvents(this, this);
	}

	@Override
	public void onDisable(){}


    @EventHandler(ignoreCancelled = true)
    public void onCreatureSpawn(CreatureSpawnEvent event)
    {
				getLogger().info("Canceling mob spawn event");
                event.setCancelled(true);
    }

}


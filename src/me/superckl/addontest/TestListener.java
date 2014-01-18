package me.superckl.addontest;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.sensationcraft.addonmanager.Addon;
import org.sensationcraft.addonmanager.events.AddonEnableEvent;
import org.sensationcraft.addonmanager.events.AddonMessageEvent;

public class TestListener implements Listener{

	private final Addon addon;
	
	public TestListener(Addon addon){
		this.addon = addon;
	}
	
	@EventHandler
	public void onAddonEnable(AddonEnableEvent e){
		if(!e.getAddon().getName().equals(this.addon.getName()))
			this.addon.getLogger().info("Hello friendly Addon!");
		AddonMessageEvent<String> event = new AddonMessageEvent<String>(this.addon, "Hello fellow Addons!");
		this.addon.getPlugin().getServer().getPluginManager().callEvent(event);
	}
	
}

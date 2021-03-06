package me.superckl.addontest;

import org.bukkit.command.CommandSender;
import org.sensationcraft.addonmanager.Addon;
import org.sensationcraft.addonmanager.commands.AddonCommand;

public class CommandTest extends AddonCommand{

	private final Addon addon;
	
	protected CommandTest(String name, Addon addon) {
		super(name);
		this.addon = addon;
	}

	@Override
	public String getFallbackPrefix() {
		return "test";
	}

	@Override
	public boolean execute(CommandSender arg0, String arg1, String[] arg2) {
		this.addon.getLogger().info("It worked!");
		this.addon.getPlugin().unregisterCommand(this.addon, this);
		return true;
	}

}

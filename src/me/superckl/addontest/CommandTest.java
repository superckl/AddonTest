package me.superckl.addontest;

import org.bukkit.command.CommandSender;
import org.sensationcraft.addonmanager.Addon;
import org.sensationcraft.addonmanager.AddonManagerPlugin;
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
		System.out.println("It worked!");
		AddonManagerPlugin.getInstance().unregisterCommand(this.addon, this);
		return true;
	}

}

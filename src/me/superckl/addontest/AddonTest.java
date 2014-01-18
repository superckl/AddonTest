package me.superckl.addontest;

import java.util.HashMap;
import java.util.Map;

import org.sensationcraft.addonmanager.Addon;
import org.sensationcraft.addonmanager.AddonData;
import org.sensationcraft.addonmanager.AddonDescriptionFile;
import org.sensationcraft.addonmanager.AddonManagerPlugin;
import org.sensationcraft.addonmanager.addon.dependencies.AddonDepends;
import org.sensationcraft.addonmanager.addon.dependencies.DependencyType;

@AddonData(name = "AddonTest", authors = ("superckl"), version = "1.0")
public class AddonTest extends Addon{

	@AddonDepends
	private static Map<String, DependencyType> depend = new HashMap<>();
	static{
		depend.put("AddonTest2", DependencyType.HARD);
	}
	
	public AddonTest(AddonManagerPlugin scg, AddonDescriptionFile desc) {
		super(scg, desc);
	}
	
	@Override
	public void onEnable(){
		this.getPlugin().registerListener(this, new TestListener(this));
		this.getPlugin().registerCommand(this, new CommandTest("test", this));
		this.getLogger().info("It enabled!");
	}

}

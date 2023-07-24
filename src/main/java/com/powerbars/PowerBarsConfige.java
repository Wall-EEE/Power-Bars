package com.powerbars;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("Power Bars")
public interface PowerBarsConfig extends Config
{
	@ConfigItem(
		keyName = "greeting",
		name = "Welcome to PowerBar, a simple plugin to help you glimse your powers",
		description = "The message to show to the user when they login"
	)
	default String greeting()
	{
		return "Hello";
	}
}

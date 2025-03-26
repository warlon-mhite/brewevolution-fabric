package com.warlonmhite.brewevolution;

import net.fabricmc.api.ModInitializer;
import com.warlonmhite.brewevolution.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Brewevolution implements ModInitializer {
	public static final String MOD_ID = "brewevolution";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
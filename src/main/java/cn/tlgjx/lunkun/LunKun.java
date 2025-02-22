package cn.tlgjx.lunkun;

import cn.tlgjx.lunkun.block.ModBlocks;
import cn.tlgjx.lunkun.item.ModItemGroup;
import cn.tlgjx.lunkun.item.Moditems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LunKun implements ModInitializer {
	public static final String MOD_ID = "lunkun";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		LOGGER.info("Hello haitailook !");
		Moditems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroup.registerModItemGroup();
	}
}
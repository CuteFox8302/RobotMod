package net.cutefox.robotmod;

import net.cutefox.robotmod.entity.ModEntities;
import net.cutefox.robotmod.entity.custom.EvilRobotEntity;
import net.cutefox.robotmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class RobotMod implements ModInitializer {
	public static final String MOD_ID = "robotmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		GeckoLib.initialize();

		FabricDefaultAttributeRegistry.register(ModEntities.EVIL_ROBOT, EvilRobotEntity.setAttributes() );
	}
}

package net.cutefox.robotmod;

import net.cutefox.robotmod.entity.ModEntities;
import net.cutefox.robotmod.entity.client.EvilRobotRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class RobotModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.EVIL_ROBOT, EvilRobotRenderer::new);
    }
}

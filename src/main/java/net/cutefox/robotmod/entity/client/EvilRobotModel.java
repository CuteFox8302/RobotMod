package net.cutefox.robotmod.entity.client;

import net.cutefox.robotmod.RobotMod;
import net.cutefox.robotmod.entity.custom.EvilRobotEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EvilRobotModel extends AnimatedGeoModel<EvilRobotEntity> {
    @Override
    public Identifier getModelResource(EvilRobotEntity object) {
        return new Identifier(RobotMod.MOD_ID, "geo/evil_robot.geo.json");
    }

    @Override
    public Identifier getTextureResource(EvilRobotEntity object) {
        return new Identifier(RobotMod.MOD_ID, "textures/entity/evil_robot_texture.png");
    }

    @Override
    public Identifier getAnimationResource(EvilRobotEntity animatable) {
        return new Identifier(RobotMod.MOD_ID, "animations/evil_robot.animation.json");
    }
}

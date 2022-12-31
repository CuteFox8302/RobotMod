package net.cutefox.robotmod.entity.client;

import net.cutefox.robotmod.entity.custom.EvilRobotEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EvilRobotModel extends AnimatedGeoModel<EvilRobotEntity> {
    @Override
    public Identifier getModelResource(EvilRobotEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureResource(EvilRobotEntity object) {
        return null;
    }

    @Override
    public Identifier getAnimationResource(EvilRobotEntity animatable) {
        return null;
    }
}

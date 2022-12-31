package net.cutefox.robotmod.entity;

import net.cutefox.robotmod.RobotMod;
import net.cutefox.robotmod.entity.custom.EvilRobotEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<EvilRobotEntity> EVIL_ROBOT = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(RobotMod.MOD_ID, "evil_robot"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, EvilRobotEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build());

}

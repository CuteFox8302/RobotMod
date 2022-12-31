package net.cutefox.robotmod.item;

import net.cutefox.robotmod.RobotMod;
import net.cutefox.robotmod.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item EVIL_ROBOT_SPAWN_EGG = registerItem("evil_robot_spawn_egg",
            new SpawnEggItem(ModEntities.EVIL_ROBOT, 0x959b9b0, 000000,
                    new FabricItemSettings().group(ModItemGroup.ROBOTS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RobotMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RobotMod.LOGGER.debug("Registering Mod Items for " + RobotMod.MOD_ID);
    }
}

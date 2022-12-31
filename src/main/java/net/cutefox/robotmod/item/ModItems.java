package net.cutefox.robotmod.item;

import net.cutefox.robotmod.RobotMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RobotMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RobotMod.LOGGER.debug("Registering Mod Items for " + RobotMod.MOD_ID);
    }
}

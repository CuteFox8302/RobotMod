package net.cutefox.robotmod.item;

import net.cutefox.robotmod.RobotMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ROBOTS = FabricItemGroupBuilder.build(
            new Identifier(RobotMod.MOD_ID, "robots"), () -> new ItemStack(ModItems.EVIL_ROBOT_SPAWN_EGG));
}

package net.cutefox.robotmod.entity.client;

import net.cutefox.robotmod.RobotMod;
import net.cutefox.robotmod.entity.custom.EvilRobotEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class EvilRobotRenderer extends GeoEntityRenderer<EvilRobotEntity> {
    public EvilRobotRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new EvilRobotModel());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureResource(EvilRobotEntity instance) {
        return new Identifier(RobotMod.MOD_ID, "textures/entity/evil_robot_texture.png");
    }

    @Override
    public RenderLayer getRenderType(EvilRobotEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}

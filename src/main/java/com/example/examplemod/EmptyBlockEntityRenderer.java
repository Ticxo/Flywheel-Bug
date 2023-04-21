package com.example.examplemod;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.world.level.block.entity.BlockEntity;

public class EmptyBlockEntityRenderer<T extends BlockEntity> implements BlockEntityRenderer<T> {

	public static final BlockEntityRendererProvider<BlockEntity> PROVIDER = pContext -> new EmptyBlockEntityRenderer<>();

	private EmptyBlockEntityRenderer() {

	}

	@Override
	public void render(T pBlockEntity, float pPartialTick, PoseStack pPoseStack, MultiBufferSource pBufferSource, int pPackedLight, int pPackedOverlay) {

	}

}

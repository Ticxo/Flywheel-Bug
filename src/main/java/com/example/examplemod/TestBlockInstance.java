package com.example.examplemod;

import com.jozufozu.flywheel.api.MaterialManager;
import com.jozufozu.flywheel.backend.instancing.blockentity.BlockEntityInstance;
import com.jozufozu.flywheel.core.Materials;
import com.jozufozu.flywheel.core.materials.model.ModelData;
import net.minecraft.world.level.block.Blocks;

public class TestBlockInstance extends BlockEntityInstance<TestBlockEntity> {

	private final ModelData model;

	public TestBlockInstance(MaterialManager materialManager, TestBlockEntity blockEntity) {
		super(materialManager, blockEntity);

		model = materialManager.defaultSolid()
				.material(Materials.TRANSFORMED)
				.getModel(Blocks.BRICKS.defaultBlockState())
				.createInstance();

		model.loadIdentity()
				.translate(getInstancePosition());
	}

	@Override
	public void remove() {
		model.delete();
	}

	@Override
	public void updateLight() {
		relight(getWorldPosition(), model);
	}

}
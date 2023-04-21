package com.example.examplemod;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class TestBlockEntity extends BlockEntity {

	public TestBlockEntity(BlockPos pPos, BlockState pBlockState) {
		super(ExampleMod.TEST_BLOCK_ENTITY.get(), pPos, pBlockState);
	}

}

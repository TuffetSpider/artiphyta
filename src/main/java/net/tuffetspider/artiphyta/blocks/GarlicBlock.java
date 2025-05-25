package net.tuffetspider.artiphyta.blocks;

import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.block.*;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.tuffetspider.artiphyta.Artiphyta;

import java.util.List;

public class GarlicBlock extends PlantBlock {
    public static final int MAX_GARLIC = 4;
    public static final IntProperty GARLIC;
    private static final VoxelShape[] SHAPES_BY_GARLIC;
    public GarlicBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<GarlicBlock> getCodec() {
        return null;
    }
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPES_BY_GARLIC[(Integer)state.get(GARLIC) - 1];
    }
    static {
        GARLIC = IntProperty.of(Artiphyta.MOD_ID,1,4);

        SHAPES_BY_GARLIC = new VoxelShape[]{Block.createColumnShape(2.0, 0.0, 12.0), Block.createCuboidShape(5.0, 0.0, 6.0, 12.0, 6.0, 9.0), Block.createCuboidShape(5.0, 0.0, 6.0, 10.0, 12.0, 11.0), Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 12.0, 10.0)};
    }

}

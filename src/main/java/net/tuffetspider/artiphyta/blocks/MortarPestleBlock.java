package net.tuffetspider.artiphyta.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tuffetspider.artiphyta.ModGuis;
import net.tuffetspider.artiphyta.gui.MortarPestleScreenHandler;

public class MortarPestleBlock extends CraftingTableBlock {
    public MortarPestleBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, inventory, player) -> new MortarPestleScreenHandler(syncId,inventory, ScreenHandlerContext.create(world, pos)), SCREEN_TITLE);

    }
}

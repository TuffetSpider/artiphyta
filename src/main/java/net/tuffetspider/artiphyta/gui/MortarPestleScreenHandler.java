package net.tuffetspider.artiphyta.gui;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.tuffetspider.artiphyta.ModGuis;
import org.jetbrains.annotations.Nullable;

public class MortarPestleScreenHandler extends ScreenHandler {
    public MortarPestleScreenHandler(int syncId, PlayerInventory inventory, ScreenHandlerContext context) {
        super(ModGuis.MORTAR_PESTLE, syncId);
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        return null;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return false;
    }
}

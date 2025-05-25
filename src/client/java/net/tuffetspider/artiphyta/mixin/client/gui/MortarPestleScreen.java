package net.tuffetspider.artiphyta.mixin.client.gui;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.tuffetspider.artiphyta.gui.MortarPestleScreenHandler;

public class MortarPestleScreen extends HandledScreen<MortarPestleScreenHandler> {


    public MortarPestleScreen(MortarPestleScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void drawBackground(DrawContext context, float deltaTicks, int mouseX, int mouseY) {

    }
}

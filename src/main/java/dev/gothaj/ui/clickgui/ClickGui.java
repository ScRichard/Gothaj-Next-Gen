package dev.gothaj.ui.clickgui;

import dev.gothaj.utilities.font.FontConfig;
import dev.gothaj.utilities.font.impl.Fonts;
import dev.gothaj.utilities.render.RenderUtils;
import dev.gothaj.utilities.render.RoundedUtils;
import net.minecraft.client.gui.GuiScreen;

public class ClickGui extends GuiScreen {

    private final double width = 500;
    private final double height = 400;

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        super.drawScreen(mouseX, mouseY, partialTicks);

        RoundedUtils.drawRoundedRect(0,0,width, height, -1, 7);
        Fonts.drawString("Hello", 0,0, 0xff000000, FontConfig.ROBOTO);

    }
}

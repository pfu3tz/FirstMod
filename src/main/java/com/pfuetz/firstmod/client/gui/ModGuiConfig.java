package com.pfuetz.firstmod.client.gui;

import com.pfuetz.firstmod.handler.ConfigurationHandler;
import com.pfuetz.firstmod.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

/**
 * Created by pstae on 02.05.2016.
 */
public class ModGuiConfig extends GuiConfig {

    public ModGuiConfig(GuiScreen parentScreen) {

        super(parentScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));

    }
}

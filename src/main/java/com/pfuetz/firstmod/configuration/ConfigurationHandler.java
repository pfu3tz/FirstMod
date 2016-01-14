package com.pfuetz.firstmod.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static void init(File configFile){
        //Create the configuration object from the given configuration file
        Configuration configuration = new Configuration(configFile);
        //boolean configValue = false; May put it into the reference class

        try{
            //Load the configuration file
            configuration.load();

            //Read in properties from configuration file
            //configValue = configuration.get("FirstMod","configValue",true,"This is an example config value").getBoolean(true);
        }
        catch(Exception e){
            //Log the exception
        }
        finally
        {
            //save configuration file
            configuration.save();
        }
    }
}

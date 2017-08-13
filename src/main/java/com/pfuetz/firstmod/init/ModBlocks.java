package com.pfuetz.firstmod.init;


import com.pfuetz.firstmod.block.BlockFM;
import com.pfuetz.firstmod.block.BlockFlag;
import com.pfuetz.firstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockFM flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag,"flag");
    }
}

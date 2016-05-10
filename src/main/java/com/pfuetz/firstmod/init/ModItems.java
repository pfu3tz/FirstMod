package com.pfuetz.firstmod.init;

import com.pfuetz.firstmod.item.ItemFM;
import com.pfuetz.firstmod.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by pstae on 10.05.2016.
 */
public class ModItems {

    public static final ItemFM mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}

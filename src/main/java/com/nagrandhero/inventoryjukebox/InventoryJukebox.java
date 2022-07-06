package com.nagrandhero.inventoryjukebox;

import com.nagrandhero.inventoryjukebox.Items.Registers.ItemRegister;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class InventoryJukebox implements ModInitializer {

    public static final String MOD_ID = "inventory_jukebox";
    public static final Logger LOGGER = LogManager.getLogger();
    @Override
    public void onInitialize() {
        ItemRegister.registerRegisterItems();
    }
}

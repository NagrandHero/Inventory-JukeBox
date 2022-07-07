package com.nagrandhero.inventoryjukebox.Items;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static com.nagrandhero.inventoryjukebox.InventoryJukebox.MOD_ID;

public class RegisterItems extends Item {
    public RegisterItems(Settings settings) {
        super(settings);
    }
    public static Item registerItems(String itemName, Item item) {
        Registry.register(Registry.ITEM, createIdentifier(itemName), item);
        return item;
    }
    public static Identifier createIdentifier(String name) {
        return new Identifier(MOD_ID, name);
    }
}
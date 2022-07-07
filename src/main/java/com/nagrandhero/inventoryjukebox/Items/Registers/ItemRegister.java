package com.nagrandhero.inventoryjukebox.Items.Registers;

import com.nagrandhero.inventoryjukebox.Items.Trinkets.Headphones;
import com.nagrandhero.inventoryjukebox.Items.Trinkets.Speaker;
import com.nagrandhero.inventoryjukebox.Items.Crafing.CraftingSpeaker;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;
import util.ModItemGroup;

import static com.nagrandhero.inventoryjukebox.Items.RegisterItems.registerItems;

public class ItemRegister {
    private static Item.Settings createGroup = new Item.Settings().group(ModItemGroup.SUPPLEMENTARY_ACCESSORIES);
    public static Item headphones = new Headphones(createGroup.rarity(Rarity.COMMON).maxCount(1));
    public static Item speaker = new Speaker(createGroup.rarity(Rarity.COMMON).maxCount(1));
    public static Item crafting_speaker = new CraftingSpeaker(createGroup.rarity(Rarity.COMMON).maxCount(64));

    public static void registerRegisterItems() {
        registerItems("headphones", headphones);
        registerItems("speaker", speaker);
        registerItems("crafting_speaker", crafting_speaker);
    }
}
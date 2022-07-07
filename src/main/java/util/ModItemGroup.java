package util;

import com.nagrandhero.inventoryjukebox.InventoryJukebox;
import com.nagrandhero.inventoryjukebox.Items.Registers.ItemRegister;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SUPPLEMENTARY_ACCESSORIES = FabricItemGroupBuilder.build(
            new Identifier(InventoryJukebox.MOD_ID, "inventory-jukebox"),
            () -> new ItemStack(ItemRegister.headphones));
}
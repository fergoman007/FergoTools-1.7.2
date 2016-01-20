package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.item.ItemFT;
import io.github.fergoman123.fergotools.reference.ItemNames;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static ItemFT ingotObsidian;
    public static ItemFT gemEmerald;
    public static ItemFT gemLapis;
    public static ItemFT ingotBronze;
    public static ItemFT ingotCoal;
    public static ItemFT ingotGlowstone;
    public static ItemFT ingotAdamantium;
    public static ItemFT gemSilk;
    public static ItemFT gemRedstone;

    public static ItemFT gemExp;
    public static ItemFT gemExp2;
    public static ItemFT gemExp3;

    public static void addItems() {
        ingotObsidian = new ItemFT(ItemNames.ingotObsidian);
    }

    public static void registerItems() {
        register(ingotObsidian, ItemNames.ingotObsidian);
    }

    public static void register(Item item, int meta, String name) {
        GameRegistry.registerItem(item, name);
        RegisterHelper.getModelMesher().register(item, meta, new ModelResourceLocation("fergotools:" + name, "inventory"));
        ModelBakery.addVariantName(item, "fergotools:" + name);
    }

    public static void register(Item item, String name) {
        register(item, 0, name);
    }
}

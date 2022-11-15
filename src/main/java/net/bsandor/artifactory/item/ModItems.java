package net.bsandor.artifactory.item;

import net.bsandor.artifactory.Artifactory;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Artifactory.MOD_ID);

    public static final RegistryObject<Item> TRUEGOLD =
            ITEMS.register("truegold", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTORY_TAB)));
    public static final RegistryObject<Item> TRUESILVER =
            ITEMS.register("truesilver", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTORY_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

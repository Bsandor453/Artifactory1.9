package net.bsandor.artifactory.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab ARTIFACTORY_TAB = new CreativeModeTab("artifactory_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TRUEGOLD.get());
        }
    };

}

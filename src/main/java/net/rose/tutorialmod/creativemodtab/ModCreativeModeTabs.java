package net.rose.tutorialmod.creativemodtab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rose.tutorialmod.TutorialMod;
import net.rose.tutorialmod.block.ModBlocks;
import net.rose.tutorialmod.item.ModItems;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MODID);

    public static final Supplier<CreativeModeTab> AZURITE_ITEMS_TAB = CREATIVE_MODE_TABS.register("azurite_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.AZURITE.get()))
                    .title(Component.translatable("creativetab.tutorialmod.azurite_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AZURITE);
                        output.accept(ModItems.RAW_AZURITE);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> AZURITE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("azurite_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.AZURITE_BLOCK.get()))
                    .title(Component.translatable("creativetab.tutorialmod.azurite_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.AZURITE_BLOCK);
                        output.accept(ModBlocks.RAW_AZURITE_BLOCK);
                        output.accept(ModBlocks.AZURITE_ORE);
                        output.accept(ModBlocks.AZURITE_DEEPSLATE_ORE);

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

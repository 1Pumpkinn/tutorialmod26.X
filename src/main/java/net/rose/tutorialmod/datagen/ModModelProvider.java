package net.rose.tutorialmod.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.rose.tutorialmod.TutorialMod;
import net.rose.tutorialmod.block.ModBlocks;
import net.rose.tutorialmod.item.ModItems;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, TutorialMod.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.AZURITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_AZURITE.get(), ModelTemplates.FLAT_ITEM);

        /* BLOCKS */
        blockModels.createTrivialCube(ModBlocks.AZURITE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RAW_AZURITE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.AZURITE_ORE.get());
        blockModels.createTrivialCube(ModBlocks.AZURITE_DEEPSLATE_ORE.get());

    }
}

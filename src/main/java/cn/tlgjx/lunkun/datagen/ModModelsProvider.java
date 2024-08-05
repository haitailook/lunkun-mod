package cn.tlgjx.lunkun.datagen;

import cn.tlgjx.lunkun.item.Moditems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(Moditems.XRZB, Models.HANDHELD);
        itemModelGenerator.register(Moditems.HAHA_AXE, Models.HANDHELD);
        itemModelGenerator.register(Moditems.HAHA_SHOVE, Models.HANDHELD);
        itemModelGenerator.register(Moditems.HAHA_SWORD, Models.HANDHELD);
        itemModelGenerator.register(Moditems.HAHA_HOE, Models.HANDHELD);
        itemModelGenerator.register(Moditems.HAHA_PICKAXE, Models.HANDHELD);
    }
}

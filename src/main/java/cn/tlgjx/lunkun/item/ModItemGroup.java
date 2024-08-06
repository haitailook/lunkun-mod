package cn.tlgjx.lunkun.item;

import cn.tlgjx.lunkun.LunKun;
import cn.tlgjx.lunkun.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    private static final ItemGroup LUNKUN_GROUP=Registry.register(Registries.ITEM_GROUP,new Identifier(LunKun.MOD_ID,"lunkun_group"),FabricItemGroup.builder().displayName(Text.translatable("itemGroup.lunkun_group")).icon(()->new ItemStack(Moditems.XRZB)).entries((displayContext, entries) -> {
        entries.add(Moditems.LUNKUN_DEBRIS);
        entries.add(Moditems.LUNKUN_INGOT);
        entries.add(ModBlocks.LUNKUN_BLOCK);

        entries.add(Moditems.ANGRY_LUNKUN_DEBRIS);
        entries.add(Moditems.ANGRY_LUNKUN_INGOT);
        entries.add(ModBlocks.ANGRY_LUNKUN_BLOCK);

        entries.add(Moditems.XRZB);
        entries.add(Moditems.ANGRY_XRZB);

        entries.add(Moditems.HAHA_SWORD);
        entries.add(Moditems.HAHA_AXE);
        entries.add(Moditems.HAHA_PICKAXE);
        entries.add(Moditems.HAHA_SHOVE);
        entries.add(Moditems.HAHA_HOE);

        entries.add(Moditems.ANGRY_HAHA_SWORD);
        entries.add(Moditems.ANGRY_HAHA_AXE);
        entries.add(Moditems.ANGRY_HAHA_PICKAXE);
        entries.add(Moditems.ANGRY_HAHA_SHOVE);
        entries.add(Moditems.ANGRY_HAHA_HOE);
    }).build());
    public static void registerModItemGroup() {
    }
}

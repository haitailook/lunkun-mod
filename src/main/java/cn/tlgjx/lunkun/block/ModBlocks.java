package cn.tlgjx.lunkun.block;

import cn.tlgjx.lunkun.LunKun;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block LUNKUN_BLOCK=registerBlocks("lunkun_block",new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block ANGRY_LUNKUN_BLOCK=registerBlocks("angry_lunkun_block",new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    private static Block registerBlocks(String name,Block block){
        registerBlocksItem(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(LunKun.MOD_ID,name),block);
    }
    private static Item registerBlocksItem(String name,Block block){
        return Registry.register(Registries.ITEM,new Identifier(LunKun.MOD_ID,name),new BlockItem(block,new FabricItemSettings()));
    }
    public static void registerModBlocks(){

    }
}

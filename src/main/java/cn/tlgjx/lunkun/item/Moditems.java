package cn.tlgjx.lunkun.item;

import cn.tlgjx.lunkun.LunKun;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Moditems {
    public static final Item LUNKUN_DEBRIS=registerModItems("lunkun_debris",new Item(new FabricItemSettings()));
    public static final Item LUNKUN_INGOT=registerModItems("lunkun_ingot",new Item(new FabricItemSettings()));
    public static final Item XRZB=registerModItems("xrzb",new SwordItem(ModToolMaterial.LUNKUN_INGOT,3,2,new FabricItemSettings()));
    private static Item registerModItems(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(LunKun.MOD_ID,name),item);
    }
    public static void registerModItems(){
    }
}

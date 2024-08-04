package cn.tlgjx.lunkun.item;

import cn.tlgjx.lunkun.LunKun;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Moditems {
    public static final Item LUNKUN_DEBRIS=registerModItems("lunkun_debris",new Item(new FabricItemSettings()));
    public static final Item LUNKUN_INGOT=registerModItems("lunkun_ingot",new Item(new FabricItemSettings()));
    public static final Item XRZB=registerModItems("xrzb",new SwordItem(ModToolMaterial.LUNKUN_INGOT,10,2,new FabricItemSettings()));
    public static final Item HAHA_AXE=registerModItems("haha_axe",new AxeItem(ModToolMaterial.LUNKUN_INGOT,7,-3,new FabricItemSettings()));
    public static final Item HAHA_PICKAXE=registerModItems("haha_pickaxe",new PickaxeItem(ModToolMaterial.LUNKUN_INGOT,-1,-4,new FabricItemSettings()));
    public static final Item HAHA_SHOVE=registerModItems("haha_shove",new ShovelItem(ModToolMaterial.LUNKUN_INGOT,-2,-4,new FabricItemSettings()));
    public static final Item HAHA_HOT=registerModItems("haha_hot",new HoeItem(ModToolMaterial.LUNKUN_INGOT,-2,-4,new FabricItemSettings()));
    public static final Item HAHA_SWORD=registerModItems("haha_sword",new SwordItem(ModToolMaterial.LUNKUN_INGOT,3,(float) -2.4,new FabricItemSettings()));
    private static Item registerModItems(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(LunKun.MOD_ID,name),item);
    }
    public static void registerModItems(){
    }
}

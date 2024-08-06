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

    public static final Item ANGRY_LUNKUN_DEBRIS=registerModItems("angry_lunkun_debris",new Item(new FabricItemSettings()));
    public static final Item ANGRY_LUNKUN_INGOT=registerModItems("angry_lunkun_ingot",new Item(new FabricItemSettings()));

    public static final Item XRZB=registerModItems("xrzb",new SwordItem(ModToolMaterial.LUNKUN_INGOT,10,2,new FabricItemSettings()));

    public static final Item HAHA_AXE=registerModItems("haha_axe",new AxeItem(ModToolMaterial.LUNKUN_INGOT,5,-3,new FabricItemSettings()));
    public static final Item HAHA_PICKAXE=registerModItems("haha_pickaxe",new PickaxeItem(ModToolMaterial.LUNKUN_INGOT,1,(float)-2.8,new FabricItemSettings()));
    public static final Item HAHA_SHOVE=registerModItems("haha_shove",new ShovelItem(ModToolMaterial.LUNKUN_INGOT,(float)1.5,-3,new FabricItemSettings()));
    public static final Item HAHA_HOE=registerModItems("haha_hoe",new HoeItem(ModToolMaterial.LUNKUN_INGOT,-5,0,new FabricItemSettings()));
    public static final Item HAHA_SWORD=registerModItems("haha_sword",new SwordItem(ModToolMaterial.LUNKUN_INGOT,3,(float) -2.4,new FabricItemSettings()));

    public static final Item ANGRY_XRZB=registerModItems("angry_xrzb",new SwordItem(ModToolMaterial.LUNKUN_INGOT,20,4,new FabricItemSettings()));

    public static final Item ANGRY_HAHA_AXE=registerModItems("angry_haha_axe",new AxeItem(ModToolMaterial.ANGRY_LUNKUN_INGOT,6,-3,new FabricItemSettings()));
    public static final Item ANGRY_HAHA_PICKAXE=registerModItems("angry_haha_pickaxe",new PickaxeItem(ModToolMaterial.ANGRY_LUNKUN_INGOT,2,(float)-2.8,new FabricItemSettings()));
    public static final Item ANGRY_HAHA_SHOVE=registerModItems("angry_haha_shove",new ShovelItem(ModToolMaterial.ANGRY_LUNKUN_INGOT,(float)2.5,-3,new FabricItemSettings()));
    public static final Item ANGRY_HAHA_HOE=registerModItems("angry_haha_hoe",new HoeItem(ModToolMaterial.ANGRY_LUNKUN_INGOT,-4,0,new FabricItemSettings()));
    public static final Item ANGRY_HAHA_SWORD=registerModItems("angry_haha_sword",new SwordItem(ModToolMaterial.ANGRY_LUNKUN_INGOT,4,(float) -2.4,new FabricItemSettings()));

    private static Item registerModItems(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(LunKun.MOD_ID,name),item);
    }
    public static void registerModItems(){
    }
}

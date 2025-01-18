package net.experimentexe.firstmod.item;

import net.experimentexe.firstmod.FirstMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    public static final RegistryObject<Item> Coconut = ITEMS.register("coconut",()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Sushi = ITEMS.register("sushi",()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Toast = ITEMS.register("toast",()-> new Item(new Item.Properties()));

    public static void regisiter(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}

package codingkids.mc.ckgenerateore.proxy;

import codingkids.mc.ckgenerateore.GenerateOreMod;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Wilson Wu on 2020/02/11.
 */
@Mod.EventBusSubscriber
public interface CommonProxy {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(GenerateOreMod.myDust);
        event.getRegistry().registerAll(new ItemBlock(GenerateOreMod.myBlock).setRegistryName(GenerateOreMod.myBlock.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(GenerateOreMod.myBlock);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(GenerateOreMod.myDust, 0, new ModelResourceLocation(GenerateOreMod.myDust.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(GenerateOreMod.myBlock), 0, new ModelResourceLocation(Item.getItemFromBlock(GenerateOreMod.myBlock).getRegistryName(), "inventory"));
    }

}

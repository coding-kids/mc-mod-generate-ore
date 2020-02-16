package codingkids.mc.ckgenerateore;

import codingkids.mc.ckgenerateore.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

/**
 * Created by Wilson Wu on 2020/02/11.
 */
@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME,
        acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class GenerateOreMod {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    public static Item myDust;
    public static Block myBlock;
    public static IWorldGenerator myGen;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        myDust = new Item()
                .setRegistryName("my_dust")
                .setTranslationKey("ckgenerateore.my_dust")
                .setCreativeTab(CreativeTabs.MISC);
        myBlock = new OreBlock(new Material(MapColor.AIR), myDust)
                .setRegistryName("my_ore")
                .setTranslationKey("ckgenerateore.my_ore")
                .setHardness(1.5F)
                .setCreativeTab(CreativeTabs.MISC);
        GameRegistry.registerWorldGenerator(new GenerateOre(), 0);
    }

    @EventHandler
    public void init(FMLInitializationEvent event){

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}

package codingkids.mc.ckgenerateore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class OreBlock extends Block {
    Item toDrop;

    public OreBlock(Material materialIn, Item item) {
        super(materialIn);
        this.toDrop = item;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return toDrop == null ? Item.getItemFromBlock(this) : toDrop;
    }
}

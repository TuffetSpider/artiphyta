package net.tuffetspider.artiphyta;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tuffetspider.artiphyta.blocks.GarlicBlock;
import net.tuffetspider.artiphyta.blocks.MortarPestleBlock;

public class ModBlocks {
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(Artiphyta.MOD_ID,name), block);
    }
    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Artiphyta.MOD_ID),new BlockItem(block, new Item.Settings()));
    }
    public static Block MORTAR_AND_PESTLE;
    public static Block GARLIC_PLANT;
    public static void registerModBlocks(){
        MORTAR_AND_PESTLE = registerBlock("mortar_and_pestle",new MortarPestleBlock(AbstractBlock.Settings.create()));
    GARLIC_PLANT = registerBlock("garlic_plant", new GarlicBlock(AbstractBlock.Settings.create().breakInstantly().noCollision()));
    }
}

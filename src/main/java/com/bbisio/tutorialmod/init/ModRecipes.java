package com.bbisio.tutorialmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(ModItems.RUBY, new ItemStack(ModBlocks.RUBY_BLOCK, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.RUBY_BLOCK, new ItemStack(Blocks.DIAMOND_BLOCK, 2), 3.0F);
		GameRegistry.addSmelting(Blocks.DIRT, new ItemStack(Items.IRON_INGOT), 1.0F);
	}
}

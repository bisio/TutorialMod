package com.bbisio.tutorialmod.items.tools;

import com.bbisio.tutorialmod.Main;
import com.bbisio.tutorialmod.init.ModItems;
import com.bbisio.tutorialmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {
	public ToolAxe(String name, ToolMaterial material) {
		super(material, 6.0F, -3.2F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		// TODO Auto-generated method stub
		
	}
}

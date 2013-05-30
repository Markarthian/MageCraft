package magecraft.test;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemLevitator extends Item {
	
	public ItemLevitator(int par1) {
		super(par1);
		setCreativeTab(CreativeTabs.tabRedstone);
		setUnlocalizedName("levitator");
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public boolean itemInteractionForEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving){
		LevitationHelper.inst.addEntity(par2EntityLiving);
		//System.out.println(par2EntityLiving);
		return true;
	}

}

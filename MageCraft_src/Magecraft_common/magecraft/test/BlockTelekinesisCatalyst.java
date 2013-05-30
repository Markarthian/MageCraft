package magecraft.test;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockTelekinesisCatalyst extends Block{

	public BlockTelekinesisCatalyst(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(CreativeTabs.tabRedstone);
		this.setTickRandomly(true);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random){
		LevitationHelper.inst.hoverEntities();
	}
	
	@Override
    public int tickRate(World par1World){
        return 30;
    }

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9){
		
		switch(par6){ //Correct coords for block opposite the one interacted with
		case 0:
			++par3;
			break;
		case 1:
			--par3;
			break;
		case 2:
			++par4;
			break;
		case 3:
			--par4;
			break;
		case 4:
			++par2;
			break;
		case 5:
			--par2;
			break;
		}		

		//backup player position and set this block's pos in its place
		double oldX=par5EntityPlayer.posX;
		par5EntityPlayer.posX=par2;

		double oldY=par5EntityPlayer.posY;
		par5EntityPlayer.posY=par3;

		double oldZ=par5EntityPlayer.posZ;
		par5EntityPlayer.posZ=par4;

		try{ //pass on the interact
			Block.blocksList[par1World.getBlockId(par2	, par3, par4)].onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par2, par3, par4);
		}catch(NullPointerException e){} //Target block is null (air)

		//restore player pos
		
		par5EntityPlayer.posX=oldX;
		par5EntityPlayer.posY=oldY;
		par5EntityPlayer.posZ=oldZ;

		return true;
	}


}

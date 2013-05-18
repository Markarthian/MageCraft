package magecraft.wgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;

public class BiomeMagicArea extends BiomeGenBase{

	public BiomeMagicArea(int par1) { 
		super(par1);
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.topBlock = (byte)Block.whiteStone.blockID;
		this.fillerBlock = (byte)Block.stone.blockID;
	}
	
	@Override
    public void decorate(World par1World, Random par2Random, int par3, int par4){
		System.out.println("Decorating magic area");
	}

}

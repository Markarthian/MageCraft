package magecraft.wgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WgenTest implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if(b.biomeName.equals("Plains")) {
        	for(int cx=0;cx<16;cx++){
        		for(int cz=0;cz<16;cz++){
        			//if(random.nextInt(20)==0)
        				world.setBlock(chunkX*16+cx, random.nextInt(10)+100, chunkZ*16+cz, 2,0,2);
        		}
        	}

        }
	}

}

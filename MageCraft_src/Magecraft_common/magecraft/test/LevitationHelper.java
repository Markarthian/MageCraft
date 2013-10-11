package magecraft.test;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

import net.minecraft.entity.EntityLiving;

public class LevitationHelper implements ITickHandler{
	
	public static LevitationHelper inst=new LevitationHelper();
	private ArrayList<LevitatorEntry> entries=new ArrayList<LevitatorEntry>();
	
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {

	}
	
	public void addEntity(EntityLiving e){
		System.out.println("LevitationHelper adding "+e);
		entries.add(new LevitatorEntry(e));
	}
	
	public void hoverEntities(){
		System.out.println("Tick handler called");
		Iterator i=entries.iterator();
		while(i.hasNext()){
			LevitatorEntry le=((LevitatorEntry) i.next());
			if(le.update()){
				i.remove();
			}
		}
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		hoverEntities();
	}
	@Override
	public EnumSet<TickType> ticks() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	private class LevitatorEntry{
		
		public EntityLiving entity;
		public final double origY;
		public int lifespan=100;
		
		public LevitatorEntry(EntityLiving el){
			origY=el.posY;
			entity=el;
			
		}
		
		public boolean update(){
			if(entity.isDead||lifespan<0){
				return true;
			}
			lifespan--;
			entity.posY=origY;
			return false;
		}
	}


}

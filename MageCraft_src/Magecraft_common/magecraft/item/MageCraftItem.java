package magecraft.item;

import magecraft.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;


public class MageCraftItem extends Item
{
  public MageCraftItem(int id)
  {
    super(id);
    setMaxStackSize(64);
    
  }
  
  public void registerIcons(IconRegister ir){
	  this.itemIcon=ir.registerIcon(Reference.MOD_ID+":"+this.getUnlocalizedName());
  }


}
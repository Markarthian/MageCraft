package magecraft.item;

import magecraft.Magecraft;

public class ItemWoolCloth extends MageCraftItem {

    public ItemWoolCloth(int id) {
        
        super(id);
        this.setUnlocalizedName("Wool Cloth");
        this.setCreativeTab(Magecraft.tabsMageCraft);
    }
    
}

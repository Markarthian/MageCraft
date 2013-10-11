package magecraft.item;

import magecraft.Magecraft;
import magecraft.lib.Strings;
import net.minecraft.item.Item;

public class ItemEssenceTier1 extends MageCraftItem {

    public ItemEssenceTier1(int id) {
        
        super(id);
        this.setUnlocalizedName(Strings.ESSENCE_TIER_1_NAME);
        this.setCreativeTab(Magecraft.tabsMageCraft);
    }

}

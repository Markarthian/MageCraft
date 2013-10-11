package magecraft.item;

import magecraft.Magecraft;
import magecraft.lib.Strings;
import net.minecraft.item.Item;

public class ItemEssenceTier2 extends MageCraftItem {

    public ItemEssenceTier2(int id) {
        
        super(id);
        this.setUnlocalizedName(Strings.ESSENCE_TIER_2_NAME);
        this.setCreativeTab(Magecraft.tabsMageCraft);
    }

}

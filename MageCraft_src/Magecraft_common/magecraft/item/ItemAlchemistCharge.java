package magecraft.item;

import magecraft.Magecraft;
import magecraft.lib.Strings;

public class ItemAlchemistCharge extends MageCraftItem {

    public ItemAlchemistCharge(int id) {

        super(id);
        this.setUnlocalizedName(Strings.ALCHEMIST_CHARGE_NAME);
        this.setCreativeTab(Magecraft.tabsMageCraft);
    }

}

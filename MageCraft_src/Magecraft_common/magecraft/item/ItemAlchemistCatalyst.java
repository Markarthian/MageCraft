package magecraft.item;

import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import magecraft.Magecraft;
import magecraft.lib.Strings;

public class ItemAlchemistCatalyst extends MageCraftItem {
    
    public ItemAlchemistCatalyst (int id){
        
        super(id);
        this.setUnlocalizedName(Strings.ALCHEMIST_CATALYST_NAME);
        this.setCreativeTab(Magecraft.tabsMageCraft);
    }
    @Override
    public String getItemDisplayName(ItemStack itemStack) {

        return EnumChatFormatting.GOLD + super.getItemDisplayName(itemStack);
    }
}

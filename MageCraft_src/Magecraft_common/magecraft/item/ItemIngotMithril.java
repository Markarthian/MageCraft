package magecraft.item;

import magecraft.Magecraft;
import magecraft.lib.Strings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemIngotMithril extends Item {

    public ItemIngotMithril(int id) {
       
        super(id);
        this.setUnlocalizedName(Strings.INGOT_ADAMANT_NAME);
        this.setCreativeTab(Magecraft.tabsMageCraft);
    }
    @Override
    public String getItemDisplayName(ItemStack itemStack) {

        return EnumChatFormatting.YELLOW + super.getItemDisplayName(itemStack);
    }
}

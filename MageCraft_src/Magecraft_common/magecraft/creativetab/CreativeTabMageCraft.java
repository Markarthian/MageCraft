package magecraft.creativetab;

import magecraft.lib.ItemIds;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class CreativeTabMageCraft extends CreativeTabs {

    public CreativeTabMageCraft(int par1, String par2Str) {

        super(par1, par2Str);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {

        return ItemIds.ALCHEMIST_CATALYST_ID;
    }
}
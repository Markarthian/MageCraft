package magecraft.item;


import net.minecraft.item.Item;
import magecraft.lib.ItemIds;

public class ModItems {
    
    public static Item alchemistCatalyst;
    public static Item alchemistCharge;
    public static Item essenceTier1;
    public static Item essenceTier2;
    public static Item ingotMithril;
    public static Item ingotAdamant;
    public static Item woolCloth;

    public static void init(){
        
        alchemistCatalyst = new ItemAlchemistCatalyst(ItemIds.ALCHEMIST_CATALYST_ID);
        alchemistCharge = new ItemAlchemistCharge(ItemIds.ALCHEMIST_CHARGE_ID);
        essenceTier1 = new ItemEssenceTier1(ItemIds.ESSENCE_TIER_1_ID);
        essenceTier2 = new ItemEssenceTier2(ItemIds.ESSENCE_TIER_2_ID);
        ingotMithril = new ItemIngotMithril(ItemIds.INGOT_MITHRIL_ID);
        ingotAdamant = new ItemIngotAdamant(ItemIds.INGOT_ADAMANT_ID);        
        woolCloth = new ItemWoolCloth(ItemIds.WOOL_CLOTH_ID);
    }

}

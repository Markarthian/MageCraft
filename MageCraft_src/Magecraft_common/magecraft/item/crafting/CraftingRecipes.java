package magecraft.item.crafting;

import magecraft.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingRecipes {
    
    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModItems.alchemistCatalyst), new Object[] { "xyx", "yzy", "xyx", Character.valueOf('x'), new ItemStack(Item.ingotGold), Character.valueOf('y'), new ItemStack(Block.glowStone), Character.valueOf('z'), new ItemStack(Item.diamond) });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.alchemistCharge), new Object[] { new ItemStack(Item.goldNugget), new ItemStack(Item.redstone) });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceTier1, 1), new Object[] { new ItemStack(ModItems.alchemistCatalyst), new ItemStack(Item.coal), new ItemStack(Item.coal), new ItemStack(Item.coal), new ItemStack(Item.coal) });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceTier1, 1), new Object[] { new ItemStack(ModItems.alchemistCatalyst), new ItemStack(Item.ingotIron), new ItemStack(Item.ingotIron) });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceTier1, 1), new Object[] { new ItemStack(ModItems.alchemistCatalyst), new ItemStack(Item.redstone), new ItemStack(Item.redstone) });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceTier1, 1), new Object[] { new ItemStack(ModItems.alchemistCatalyst), new ItemStack(Item.dyePowder, 1, 4), new ItemStack(Item.dyePowder, 1, 4) });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceTier1, 2), new Object[] { new ItemStack(ModItems.alchemistCatalyst), new ItemStack(Item.lightStoneDust) });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceTier1, 4), new Object[] { new ItemStack(ModItems.alchemistCatalyst), new ItemStack(Item.ingotGold) });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceTier1, 16), new Object[] { new ItemStack(ModItems.alchemistCatalyst), new ItemStack(Item.diamond) });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceTier1, 32), new Object[] { new ItemStack(ModItems.alchemistCatalyst), new ItemStack(ModItems.ingotMithril) });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceTier1, 64), new Object[] { new ItemStack(ModItems.alchemistCatalyst), new ItemStack(ModItems.ingotAdamant) });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceTier2, 1), new Object[] { new ItemStack(ModItems.alchemistCatalyst), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceTier1, 8), new Object[] { new ItemStack(ModItems.alchemistCatalyst), new ItemStack(ModItems.essenceTier2) });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceTier1, 1), new Object[] { new ItemStack(ModItems.alchemistCharge), new ItemStack(Item.coal), new ItemStack(Item.coal), new ItemStack(Item.coal), new ItemStack(Item.coal) });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceTier1, 1), new Object[] { new ItemStack(ModItems.alchemistCharge), new ItemStack(Item.ingotIron), new ItemStack(Item.ingotIron) });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceTier1, 1), new Object[] { new ItemStack(ModItems.alchemistCharge), new ItemStack(Item.redstone), new ItemStack(Item.redstone) });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceTier1, 1), new Object[] { new ItemStack(ModItems.alchemistCharge), new ItemStack(Item.dyePowder, 1, 4), new ItemStack(Item.dyePowder, 1, 4) });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceTier1, 2), new Object[] { new ItemStack(ModItems.alchemistCharge), new ItemStack(Item.lightStoneDust) });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceTier1, 4), new Object[] { new ItemStack(ModItems.alchemistCharge), new ItemStack(Item.ingotGold) });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceTier1, 16), new Object[] { new ItemStack(ModItems.alchemistCharge), new ItemStack(Item.diamond) });

        GameRegistry.addShapelessRecipe(new ItemStack(Item.coal, 5), new Object[] { new ItemStack(ModItems.essenceTier1), new ItemStack(Item.coal) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotIron, 3), new Object[] { new ItemStack(ModItems.essenceTier1), new ItemStack(Item.ingotIron) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.redstone, 3), new Object[] { new ItemStack(ModItems.essenceTier1), new ItemStack(Item.redstone) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.dyePowder, 3, 4), new Object[] { new ItemStack(ModItems.essenceTier1), new ItemStack(Item.dyePowder, 1, 4) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.lightStoneDust, 2), new Object[] { new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1), new ItemStack(Item.lightStoneDust) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotGold, 2), new Object[] { new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1), new ItemStack(Item.ingotGold) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.diamond, 2), new Object[] { new ItemStack(ModItems.essenceTier2), new ItemStack(ModItems.essenceTier2), new ItemStack(Item.diamond) });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotMithril), new Object[] { new ItemStack(ModItems.essenceTier2), new ItemStack(ModItems.essenceTier2), new ItemStack(ModItems.essenceTier2), new ItemStack(ModItems.essenceTier2) });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotAdamant), new Object[] { new ItemStack(ModItems.essenceTier2), new ItemStack(ModItems.essenceTier2), new ItemStack(ModItems.essenceTier2), new ItemStack(ModItems.essenceTier2), new ItemStack(ModItems.essenceTier2), new ItemStack(ModItems.essenceTier2), new ItemStack(ModItems.essenceTier2), new ItemStack(ModItems.essenceTier2) });
        GameRegistry.addRecipe(new ItemStack(ModItems.woolCloth, 1), new Object[] { "xxx", "xxx", "xxx", Character.valueOf('x'), new ItemStack(Item.silk) });
        GameRegistry.addRecipe(new ItemStack(ModItems.woolCloth, 4), new Object[] { "xxx", "xxx", "xxx", Character.valueOf('x'), new ItemStack(Block.cloth) });
        GameRegistry.addShapelessRecipe(new ItemStack(Block.cobblestone, 33), new Object[] { new ItemStack(Block.cobblestone), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.dyePowder, 9, 0), new Object[] { new ItemStack(Item.dyePowder, 1, 0), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.enderPearl, 2), new Object[] { new ItemStack(Item.enderPearl), new ItemStack(ModItems.essenceTier2) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.ghastTear, 2), new Object[] { new ItemStack(Item.ghastTear), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier2) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.bone, 5), new Object[] { new ItemStack(Item.bone), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.leather, 5), new Object[] { new ItemStack(Item.leather), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.slimeBall, 9), new Object[] { new ItemStack(Item.slimeBall), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.blazeRod, 2), new Object[] { new ItemStack(Item.blazeRod), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.clay, 3), new Object[] { new ItemStack(Item.clay), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.silk, 13), new Object[] { new ItemStack(Item.silk), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.feather, 13), new Object[] { new ItemStack(Item.feather), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.gunpowder, 5), new Object[] { new ItemStack(Item.gunpowder), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.spiderEye, 9), new Object[] { new ItemStack(Item.spiderEye), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.seeds, 13), new Object[] { new ItemStack(Item.seeds), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.reed, 9), new Object[] { new ItemStack(Item.reed), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.pumpkinSeeds, 5), new Object[] { new ItemStack(Item.pumpkinSeeds), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.melonSeeds, 5), new Object[] { new ItemStack(Item.melonSeeds), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.netherStalkSeeds, 3), new Object[] { new ItemStack(Item.netherStalkSeeds), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.flint, 17), new Object[] { new ItemStack(Item.flint), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.emerald, 2), new Object[] { new ItemStack(Item.emerald), new ItemStack(ModItems.essenceTier2), new ItemStack(ModItems.essenceTier2), new ItemStack(ModItems.essenceTier2) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.carrot, 5), new Object[] { new ItemStack(Item.carrot), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.potato, 5), new Object[] { new ItemStack(Item.potato), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addRecipe(new ItemStack(Item.netherStar, 2), new Object[] { "xxx", "xyx", "xxx", Character.valueOf('x'), new ItemStack(ModItems.ingotAdamant), Character.valueOf('y'), new ItemStack(Item.netherStar) });
        GameRegistry.addShapelessRecipe(new ItemStack(Block.obsidian, 33), new Object[] { new ItemStack(Block.obsidian), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Block.dirt, 49), new Object[] { new ItemStack(Block.dirt), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Block.sand, 33), new Object[] { new ItemStack(Block.sand), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Block.cobblestone, 33), new Object[] { new ItemStack(Block.cobblestone), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Block.gravel, 33), new Object[] { new ItemStack(Block.gravel), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Block.cactus, 13), new Object[] { new ItemStack(Block.cactus), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Block.netherrack, 17), new Object[] { new ItemStack(Block.netherrack), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Block.slowSand, 13), new Object[] { new ItemStack(Block.slowSand), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Block.whiteStone, 9), new Object[] { new ItemStack(Block.whiteStone), new ItemStack(ModItems.essenceTier1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Block.netherBrick, 5), new Object[] { new ItemStack(Block.netherBrick), new ItemStack(ModItems.essenceTier1) });
        
      
    }

}

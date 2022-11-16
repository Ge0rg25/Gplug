package beaver.ru.gplug.Misc.CustomItems;

import beaver.ru.gplug.Gplug;
import beaver.ru.gplug.Interfaces.GRecipe;
import beaver.ru.gplug.Misc.CustomItems.Items.ScubaItem;
import beaver.ru.gplug.Misc.CustomItems.Recipes.ScubaItemGRecipe;
import org.bukkit.inventory.ItemStack;

public class CustomItems {
    public static ItemStack SCUBA = new ScubaItem().setupItem();

    public static void regiserRecipes(Gplug gplug){
        GRecipe[] recipes = new GRecipe[]{new ScubaItemGRecipe()};
        for(GRecipe recipe: recipes){
            recipe.setupRecipe(gplug);
        }
    }
}

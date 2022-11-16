package beaver.ru.gplug.Misc.CustomItems.Recipes;

import beaver.ru.gplug.Gplug;
import beaver.ru.gplug.Interfaces.GRecipe;
import beaver.ru.gplug.Misc.CustomItems.CustomItems;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import java.io.File;
import java.util.List;

public class ScubaItemGRecipe implements GRecipe {
    @Override
    public void setupRecipe(Gplug gplug) {
        createRecipes(List.of("potion_long", "potion_short"), gplug);
    }
    void createRecipes (List < String > recipesName, Gplug plugin){
        for (String recName : recipesName) {
            ItemStack item = new ItemStack(CustomItems.SCUBA);
            File potionFile = new File(plugin.getDataFolder() + "/potions/" + recName + ".yml");
            FileConfiguration config = YamlConfiguration.loadConfiguration(potionFile);

            ItemStack potion = config.getItemStack("potion");
            NamespacedKey key = new NamespacedKey(plugin, recName);
            assert potion != null;

            ShapedRecipe recipe = new ShapedRecipe(key, item);
            recipe.shape(" A ", " B ", " C ");
            recipe.setIngredient('A', Material.GLASS);
            recipe.setIngredient('B', potion);
            recipe.setIngredient('C', Material.KELP);
            Bukkit.addRecipe(recipe);
        }
    }

}

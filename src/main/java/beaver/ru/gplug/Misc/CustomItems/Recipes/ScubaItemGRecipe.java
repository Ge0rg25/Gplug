package beaver.ru.gplug.Misc.CustomItems.Recipes;

import beaver.ru.gplug.Gplug;
import beaver.ru.gplug.Interfaces.GRecipe;
import beaver.ru.gplug.Misc.CustomItems.CustomItems;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;



public class ScubaItemGRecipe implements GRecipe {
    @Override
    public void setupRecipe(Gplug gplug) {
        ItemStack potion_3min = new ItemStack(Material.POTION);
        PotionMeta potion_3minMeta = (PotionMeta) potion_3min.getItemMeta();
        potion_3minMeta.setBasePotionData(new PotionData(PotionType.WATER_BREATHING, false, false));
        potion_3min.setItemMeta(potion_3minMeta);
        NamespacedKey key_3min = new NamespacedKey(gplug, "potion_3min");
        ShapedRecipe recipe_3min = new ShapedRecipe(key_3min, CustomItems.SCUBA);
        recipe_3min.shape(" A ", " B ", " C ");
        recipe_3min.setIngredient('A', Material.GLASS);
        recipe_3min.setIngredient('B', potion_3min);
        recipe_3min.setIngredient('C', Material.KELP);
        Bukkit.addRecipe(recipe_3min);

        //----------------------------------

        ItemStack potion_8min = new ItemStack(Material.POTION);
        PotionMeta potion_8minMeta = (PotionMeta) potion_8min.getItemMeta();
        potion_8minMeta.setBasePotionData(new PotionData(PotionType.WATER_BREATHING, true, false));
        potion_8min.setItemMeta(potion_8minMeta);
        NamespacedKey key_8min = new NamespacedKey(gplug, "potion_8min");
        ShapedRecipe recipe_8min = new ShapedRecipe(key_8min, CustomItems.SCUBA);
        recipe_8min.shape(" A ", " B ", " C ");
        recipe_8min.setIngredient('A', Material.GLASS);
        recipe_8min.setIngredient('B', potion_8min);
        recipe_8min.setIngredient('C', Material.KELP);
        Bukkit.addRecipe(recipe_8min);

    }
}

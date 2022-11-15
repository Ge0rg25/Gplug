package beaver.ru.gplug.Misc;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class CustomItems {
    public static ItemStack SCUBA = new ItemStack(Material.GLASS);

    public static void setupScubaItem(){
        ItemMeta meta = SCUBA.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        lore.add("Это акваланг, он поможет дышать под водой!");
        meta.setDisplayName("Акваланг");
        meta.setLore(lore);
        SCUBA.setItemMeta(meta);
    }
}

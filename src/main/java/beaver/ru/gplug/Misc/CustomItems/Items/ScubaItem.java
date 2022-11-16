package beaver.ru.gplug.Misc.CustomItems.Items;


import beaver.ru.gplug.Interfaces.GCustomItem;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.ArrayList;
import java.util.List;

public class ScubaItem implements GCustomItem {
    @Override
    public ItemStack setupItem() {
        ItemStack SCUBA = new ItemStack(Material.GLASS);
        ItemMeta meta = SCUBA.getItemMeta();
        List<Component> lore = new ArrayList<Component>();
        lore.add(Component.text("Это Акваланг", NamedTextColor.RED));
        lore.add(Component.text("Он поможет дышать под водой", NamedTextColor.DARK_RED));
        meta.displayName(Component.text("Акваланг"));
        meta.lore(lore);
        SCUBA.setItemMeta(meta);
        return SCUBA;
    }
}

package beaver.ru.gplug.Events;

import beaver.ru.gplug.Gplug;
import beaver.ru.gplug.Misc.CustomItems.CustomItems;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityAirChangeEvent;
import org.bukkit.inventory.ItemStack;


public class BreatheUnderwater implements Listener {
    public BreatheUnderwater(Gplug plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onSuffocate(EntityAirChangeEvent event) {
        if (!(event.getEntity() instanceof Player)) {
            return;
        }
        Player player = (Player) event.getEntity();
        ItemStack scuba = CustomItems.SCUBA;
        if (player.getInventory().getHelmet() == null){
            return;
        }
        if (player.getInventory().getHelmet().isSimilar(scuba)) {
            player.setRemainingAir(300);
            event.setCancelled(true);
        }
    }
}

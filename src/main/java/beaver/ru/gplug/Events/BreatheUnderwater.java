package beaver.ru.gplug.Events;

import beaver.ru.gplug.Gplug;
import beaver.ru.gplug.Misc.CustomItems;
import jdk.javadoc.internal.doclets.toolkit.util.ClassUseMapper;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemStack;


public class BreatheUnderwater implements Listener {
    public BreatheUnderwater(Gplug plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onSuffocate(EntityDamageEvent event) {
        if (!(event.getEntity() instanceof Player)) {
            return;
        }
        if (!(event.getCause() == EntityDamageEvent.DamageCause.DROWNING)) {
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
        return;
    }
}

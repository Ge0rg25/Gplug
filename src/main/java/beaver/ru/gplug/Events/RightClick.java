package beaver.ru.gplug.Events;

import beaver.ru.gplug.Misc.CustomItems.CustomItems;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.PlayerInventory;


public class RightClick implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        if (!(event.getAction().isRightClick())) {
            return;
        }
        Player player = event.getPlayer();
        System.out.println(player.getInventory().getItemInMainHand().isSimilar(CustomItems.SCUBA));
        if (!(player.getInventory().getItemInMainHand().isSimilar(CustomItems.SCUBA))) {
            return;
        }
        PlayerInventory inventory = player.getInventory();
        if (inventory.getHelmet() != null) {
            inventory.addItem(inventory.getHelmet());
        }
        inventory.setHelmet(CustomItems.SCUBA);
        inventory.remove(player.getInventory().getItemInMainHand());
    }
}

package beaver.ru.gplug.Misc;

import beaver.ru.gplug.Gplug;
import org.bukkit.event.Listener;


public class EventsUtils {
    public static void registerEvents(Gplug plugin, Listener...events){
        for(Listener event: events){
            plugin.getServer().getPluginManager().registerEvents(event, plugin);
        }
    }
}

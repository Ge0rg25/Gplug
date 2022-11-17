package beaver.ru.gplug;

import beaver.ru.gplug.Commands.GiveScubaItems;
import beaver.ru.gplug.Events.BreatheUnderwater;
import beaver.ru.gplug.Events.RightClick;
import beaver.ru.gplug.Misc.CommandsUntils;
import beaver.ru.gplug.Misc.CustomItems.CustomItems;
import beaver.ru.gplug.Misc.EventsUtils;
import org.bukkit.plugin.java.JavaPlugin;

public final class Gplug extends JavaPlugin {

    @Override
    public void onEnable() {
        CustomItems.regiserRecipes(this);
        CommandsUntils.registerCommands(this, new GiveScubaItems());
        EventsUtils.registerEvents(this, new BreatheUnderwater(), new RightClick());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

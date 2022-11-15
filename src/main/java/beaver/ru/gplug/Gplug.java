package beaver.ru.gplug;

import beaver.ru.gplug.Commands.GiveScubaItems;
import beaver.ru.gplug.Events.BreatheUnderwater;
import beaver.ru.gplug.Misc.CommandsUntils;
import beaver.ru.gplug.Misc.CustomItems;
import org.bukkit.plugin.java.JavaPlugin;

public final class Gplug extends JavaPlugin {

    @Override
    public void onEnable() {
        new BreatheUnderwater(this);
        CustomItems.setupScubaItem();
        CommandsUntils.registerCommands(this, new GiveScubaItems());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

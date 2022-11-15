package beaver.ru.gplug.Misc;

import beaver.ru.gplug.Gplug;
import beaver.ru.gplug.Interfaces.GCommand;

public class CommandsUntils {



    public static void registerCommands(Gplug plugin, GCommand...executors){
        for(GCommand cmd: executors){
            cmd.setup(plugin);
        }
    }
}

package beaver.ru.gplug.Commands;

import beaver.ru.gplug.Gplug;
import beaver.ru.gplug.Interfaces.GCommand;
import beaver.ru.gplug.Misc.CustomItems;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class GiveScubaItems implements CommandExecutor, GCommand {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        Player player = (Player) sender;
        player.getInventory().addItem(CustomItems.SCUBA);
        player.sendMessage("Вам выдан акволанг");
        return true;
    }

    @Override
    public void setup(Gplug plugin) {
        Objects.requireNonNull(plugin.getCommand("scuba")).setExecutor(this);
    }
}

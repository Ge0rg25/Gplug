package beaver.ru.gplug.Commands;

import beaver.ru.gplug.Gplug;
import beaver.ru.gplug.Interfaces.GCommand;
import beaver.ru.gplug.Misc.CustomItems.CustomItems;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;
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
        player.sendMessage(player.getInventory().getItem(EquipmentSlot.HAND).toString());

        // --------------------
        ItemStack potion = new ItemStack(Material.POTION);
        PotionMeta meta_recipe = (PotionMeta) potion.getItemMeta();
        meta_recipe.setBasePotionData(new PotionData(PotionType.WATER_BREATHING));
        potion.setItemMeta(meta_recipe);
        player.getInventory().addItem(potion);
        return true;
    }

    @Override
    public void setup(Gplug plugin) {
        Objects.requireNonNull(plugin.getCommand("scuba")).setExecutor(this);
    }
}

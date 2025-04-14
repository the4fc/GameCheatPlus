package com.tuplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpOpCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Este comando solo puede ser ejecutado por un jugador.");
            return false;
        }

        Player player = (Player) sender;

        if (args.length < 1) {
            player.sendMessage(ChatColor.RED + "Por favor, ingresa un mensaje.");
            return false;
        }

        String message = String.join(" ", args);

        // Enviar el mensaje al staff
        for (Player staff : player.getServer().getOnlinePlayers()) {
            if (staff.hasPermission("gamecheat.helpop")) {
                staff.sendMessage(ChatColor.GREEN + "[HelpOp] " + ChatColor.YELLOW + player.getName() + ": " + message);
            }
        }

        player.sendMessage(ChatColor.GREEN + "Tu mensaje ha sido enviado al staff.");
        return true;
    }
}

package com.tuplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReportCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Este comando solo puede ser ejecutado por un jugador.");
            return false;
        }

        Player player = (Player) sender;

        if (args.length < 2) {
            player.sendMessage(ChatColor.RED + "Por favor, ingresa el jugador a reportar y la razón.");
            return false;
        }

        String reportedPlayerName = args[0];
        String reason = String.join(" ", args, 1, args.length);

        // Enviar el reporte al staff
        for (Player staff : player.getServer().getOnlinePlayers()) {
            if (staff.hasPermission("gamecheat.report")) {
                staff.sendMessage(ChatColor.RED + "[Report] " + ChatColor.YELLOW + player.getName() + " ha reportado a "
                        + reportedPlayerName + " por: " + reason);
            }
        }

        player.sendMessage(ChatColor.GREEN + "Tu reporte ha sido enviado al staff.");
        return true;
    }
}

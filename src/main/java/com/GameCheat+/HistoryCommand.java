package com.tuplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HistoryCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Este comando solo puede ser ejecutado por un jugador.");
            return false;
        }

        Player player = (Player) sender;

        if (args.length < 1) {
            player.sendMessage(ChatColor.RED + "Por favor, ingresa el jugador al que quieres ver el historial.");
            return false;
        }

        String targetPlayerName = args[0];
        String timePeriod = (args.length > 1) ? args[1] : "Sin filtro de tiempo";  // Si no se pasa tiempo, mostrar sin filtro

        // Simulación del historial
        player.sendMessage(ChatColor.GOLD + "Historial de " + targetPlayerName + ":");
        player.sendMessage(ChatColor.GREEN + " - Actividad 1: Hace 1 hora");
        player.sendMessage(ChatColor.GREEN + " - Actividad 2: Hace 3 días");
        player.sendMessage(ChatColor.GREEN + " - " + timePeriod);

        return true;
    }
}

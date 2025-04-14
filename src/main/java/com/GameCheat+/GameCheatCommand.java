package com.tuplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class GameCheatCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.YELLOW + "Comandos de GameCheat+:");
        sender.sendMessage(ChatColor.GREEN + "/helpop <mensaje> - Envía un mensaje al staff.");
        sender.sendMessage(ChatColor.GREEN + "/report <jugador> <razón> - Reporta a un jugador.");
        sender.sendMessage(ChatColor.GREEN + "/history <jugador> [tiempo] - Muestra el historial de un jugador.");
        sender.sendMessage(ChatColor.GREEN + "/afk - Marca al jugador como AFK.");
        sender.sendMessage(ChatColor.GREEN + "/gamecheat limit - Muestra las limitaciones del servidor.");
        return true;
    }
}

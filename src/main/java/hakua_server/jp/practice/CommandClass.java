package hakua_server.jp.practice;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandClass implements CommandExecutor {
    @Override
    public  boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(command.getName().equalsIgnoreCase("test")){
            sender.sendMessage("§atestが実行されました");
        }
        return true;
    }
}

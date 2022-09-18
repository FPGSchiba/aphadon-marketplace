package ch.schiba.aphadon;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class marketplace extends JavaPlugin {

    public static marketplace INSTANCE;
    public static Integer ERROR = 2;
    public  static  Integer WARNING = 1;
    public static  Integer INFO = 0;

    public marketplace(){
        INSTANCE = this;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        log("Marketplace is running.");

    }

    @Override
    public void onDisable() {

    }

    public void log(String Message){
        Bukkit.getConsoleSender().sendMessage("§a[INFO]: " + Message);
    }

    public void log(String Message, Integer Level) throws Exception {
        if(Level > 2) {
            throw new Exception("Level cannot be higher then 2.");
        } else {
            switch (Level){
                case 0: {
                    Bukkit.getConsoleSender().sendMessage("§a[INFO]: " + Message);
                } case 1: {
                    Bukkit.getConsoleSender().sendMessage("§e[WARNING]: " + Message);
                } case 2: {
                    Bukkit.getConsoleSender().sendMessage("§c[ERROR]: " + Message);
                }
            }
        }
    }
}

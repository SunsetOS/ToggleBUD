package sunsetos.togglebud.util;

import static net.minecraft.server.command.CommandManager.*;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import sunsetos.togglebud.command.EnableBUD;

public class CommandRegister {
    public static void registCommand(){
        CommandRegistrationCallback.EVENT.register(EnableBUD::register);
    }
}

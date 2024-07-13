package sunsetos.togglebud.command;


import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.CommandContextBuilder;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;


import static sunsetos.togglebud.ToggleBUD.sendMessageInChat;

public class EnableBUD {

    public static boolean bud = true;
    public static boolean getBudStatus() { return bud; }

    private static int switchbud(CommandContext<ServerCommandSource> context) {
        bud = !bud;
        sendMessageInChat("BUD is "+(bud?"ON":"OFF"));

        return 1;
    }

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess commandRegistryAccess, CommandManager.RegistrationEnvironment registrationEnvironment) {
        dispatcher.register(CommandManager.literal("bud")
                .executes(EnableBUD::switchbud));
    }
}


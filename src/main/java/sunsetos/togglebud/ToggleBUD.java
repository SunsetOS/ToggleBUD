package sunsetos.togglebud;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sunsetos.togglebud.util.CommandRegister;


public class ToggleBUD implements ModInitializer {
	public static void Log(String text){
		final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
		LOGGER.info(text);
	}

	public static void sendMessageInChat(String text){
		MinecraftClient mc = MinecraftClient.getInstance();

		mc.inGameHud.getChatHud().addMessage(Text.of(text));
	}

	public static  final String MOD_ID = "togglebud";


	public void onInitialize() {
		CommandRegister.registCommand();
		Log("TOGGLEBUD!");
	}
}
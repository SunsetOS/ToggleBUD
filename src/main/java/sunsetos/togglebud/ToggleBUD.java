package sunsetos.togglebud;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToggleBUD implements ModInitializer {
	public static  final String MOD_ID = "togglebud";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("_DEV TOGGLEBUD");
	}
}
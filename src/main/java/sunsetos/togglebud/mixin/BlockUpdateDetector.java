package sunsetos.togglebud.mixin;




import net.minecraft.client.MinecraftClient;
import net.minecraft.world.block.ChainRestrictedNeighborUpdater;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.slf4j.Logger;
import sunsetos.togglebud.command.EnableBUD;

import java.util.ArrayDeque;

import static sunsetos.togglebud.ToggleBUD.Log;
import static sunsetos.togglebud.ToggleBUD.sendMessageInChat;

@Mixin(ChainRestrictedNeighborUpdater.class)
public abstract class BlockUpdateDetector {

    @Inject(at = @At("HEAD"),method = "enqueue",cancellable = true)
    private void init(CallbackInfo ci){

        /*Log("_DEV Blocks update detected.");
        MinecraftClient mc = MinecraftClient.getInstance();
        sendMessageInChat("_DEV Block Update Detected");
        sendMessageInChat(EnableBUD.getBudStatus()?"True":"False");*/
        if (!EnableBUD.getBudStatus()) {ci.cancel();}

    }
}


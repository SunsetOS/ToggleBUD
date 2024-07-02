package sunsetos.togglebud.mixin;


import net.minecraft.world.block.ChainRestrictedNeighborUpdater;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.slf4j.Logger;


@Mixin(ChainRestrictedNeighborUpdater.class)
public class BlockUpdateDetector {

    @Shadow @Final private int depth = 0;
    private static final Logger LOGGER = LoggerFactory.getLogger("togglebud");



    @Inject(at = @At("HEAD"),method = "runQueuedUpdates")
    private void init(CallbackInfo ci){
        LOGGER.info("_DEV Blocks update detected. ");

    }
}

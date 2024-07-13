package sunsetos.togglebud.mixin;



import net.minecraft.world.block.ChainRestrictedNeighborUpdater;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import sunsetos.togglebud.command.EnableBUD;


@Mixin(ChainRestrictedNeighborUpdater.class)
public abstract class BlockUpdateDetector {

    @Inject(at = @At("HEAD"),method = "enqueue",cancellable = true)
    private void init(CallbackInfo ci){

        if (!EnableBUD.getBudStatus()) {ci.cancel();}

    }
}


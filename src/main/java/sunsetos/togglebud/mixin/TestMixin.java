package sunsetos.togglebud.mixin;

import net.minecraft.world.block.NeighborUpdater;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(NeighborUpdater.class)
public class TestMixin{
    @Inject(at = @At("HEAD"),method = "tryNeighborUpdate")
    private static void injectUpdate(CallbackInfo callbackInfo){
        System.out.println("Block Update");
    }
}

package org.qinz8848.no_32768_limit.mixin;

import net.minecraft.server.commands.FillCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(FillCommand.class)
public class FillCommandMixin {
    @ModifyConstant(method = "fillBlocks", constant = @Constant(intValue = 32768))
    private static int modifyConstant(int original){
        return 2147483647;
    }
}

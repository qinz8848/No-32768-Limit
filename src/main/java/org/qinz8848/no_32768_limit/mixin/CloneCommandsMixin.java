package org.qinz8848.no_32768_limit.mixin;

import net.minecraft.command.impl.CloneCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(CloneCommand.class)
public class CloneCommandsMixin {
    @ModifyConstant(method = "clone", constant = @Constant(intValue = 32768))
    private static int modifyLimit(int original) {
        return 2147483647;
    }
}

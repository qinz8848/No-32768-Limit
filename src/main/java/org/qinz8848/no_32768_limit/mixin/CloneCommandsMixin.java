package org.qinz8848.no_32768_limit.mixin;

import net.minecraft.server.commands.CloneCommands;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(CloneCommands.class)
public class CloneCommandsMixin {
    @ModifyConstant(method = "clone", constant = @Constant(intValue = 32768))
    private static int modifyLimit(int constant) {
        return 2147483647;
    }
}

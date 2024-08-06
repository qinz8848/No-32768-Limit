package org.qinz8848.no_32768_limit.mixin;

import net.minecraft.server.commands.FillBiomeCommand;
import org.apache.logging.log4j.core.config.plugins.validation.Constraint;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(FillBiomeCommand.class)
public class FillBiomeCommandMixin {
    @ModifyConstant(method = "fill", constant = @Constant(intValue = 32768))
    private static int modifyLimit(int limit) {
        return 2147483647;
    }
}

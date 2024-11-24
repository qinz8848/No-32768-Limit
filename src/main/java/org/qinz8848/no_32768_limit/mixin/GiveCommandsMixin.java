package org.qinz8848.no_32768_limit.mixin;

import net.minecraft.server.commands.GiveCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(GiveCommand.class)
public class GiveCommandsMixin {
    @Shadow
    @Mutable
    public static int MAX_ALLOWED_ITEMSTACKS = Integer.MAX_VALUE;
}

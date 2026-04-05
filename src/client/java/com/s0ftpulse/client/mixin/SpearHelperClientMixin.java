package com.s0ftpulse.client.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Minecraft.class)
public interface SpearHelperClientMixin {
	@Invoker("startAttack") // Берем с майна метод для иммитации обычного нажатия лкм
	void callStartAttack();
}
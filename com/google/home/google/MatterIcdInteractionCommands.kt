// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface MatterIcdInteractionCommands {
    public abstract suspend fun stayActive(extendActiveOnAnyInteraction: kotlin.Boolean, durationSeconds: kotlin.UInt): kotlin.Unit

    public abstract fun stayActiveBatchable(extendActiveOnAnyInteraction: kotlin.Boolean, durationSeconds: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit>
}

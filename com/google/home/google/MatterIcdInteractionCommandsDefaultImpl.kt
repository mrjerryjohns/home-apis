// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface MatterIcdInteractionCommandsDefaultImpl : com.google.home.google.MatterIcdInteractionCommands {
    public open suspend fun stayActive(extendActiveOnAnyInteraction: kotlin.Boolean, durationSeconds: kotlin.UInt): kotlin.Unit { /* compiled code */ }

    public open fun stayActiveBatchable(extendActiveOnAnyInteraction: kotlin.Boolean, durationSeconds: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}


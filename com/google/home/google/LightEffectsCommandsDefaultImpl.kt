// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface LightEffectsCommandsDefaultImpl : com.google.home.google.LightEffectsCommands {
    public open suspend fun pulseEffectSet(durationSeconds: kotlin.UInt, color: com.google.home.google.LightEffectsTrait.Color): kotlin.Unit { /* compiled code */ }

    public open suspend fun sleepEffectSet(durationSeconds: kotlin.UInt): kotlin.Unit { /* compiled code */ }

    public open suspend fun wakeEffectSet(durationSeconds: kotlin.UInt): kotlin.Unit { /* compiled code */ }

    public open suspend fun stopEffect(): kotlin.Unit { /* compiled code */ }

    public open fun pulseEffectSetBatchable(durationSeconds: kotlin.UInt, color: com.google.home.google.LightEffectsTrait.Color): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun sleepEffectSetBatchable(durationSeconds: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun wakeEffectSetBatchable(durationSeconds: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stopEffectBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}


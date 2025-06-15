// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface LightEffectsCommands {
    public abstract suspend fun pulseEffectSet(durationSeconds: kotlin.UInt, color: com.google.home.google.LightEffectsTrait.Color): kotlin.Unit

    public abstract suspend fun sleepEffectSet(durationSeconds: kotlin.UInt): kotlin.Unit

    public abstract suspend fun wakeEffectSet(durationSeconds: kotlin.UInt): kotlin.Unit

    public abstract suspend fun stopEffect(): kotlin.Unit

    public abstract fun pulseEffectSetBatchable(durationSeconds: kotlin.UInt, color: com.google.home.google.LightEffectsTrait.Color): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun sleepEffectSetBatchable(durationSeconds: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun wakeEffectSetBatchable(durationSeconds: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun stopEffectBatchable(): com.google.home.BatchableCommand<kotlin.Unit>
}

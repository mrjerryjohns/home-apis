// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedMediaPlaybackCommands {
    public abstract suspend fun closedCaptioningOff(): kotlin.Unit

    public abstract suspend fun closedCaptioningOn(userQueryLanguage: kotlin.String, closedCaptioningLanguage: kotlin.String): kotlin.Unit

    public abstract suspend fun setRepeat(isOn: kotlin.Boolean, isSingle: kotlin.Boolean): kotlin.Unit

    public abstract suspend fun shuffle(): kotlin.Unit

    public abstract fun closedCaptioningOffBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun closedCaptioningOnBatchable(userQueryLanguage: kotlin.String, closedCaptioningLanguage: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun setRepeatBatchable(isOn: kotlin.Boolean, isSingle: kotlin.Boolean): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun shuffleBatchable(): com.google.home.BatchableCommand<kotlin.Unit>
}

// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedMediaPlaybackCommandsDefaultImpl : com.google.home.google.ExtendedMediaPlaybackCommands {
    public open suspend fun closedCaptioningOff(): kotlin.Unit { /* compiled code */ }

    public open suspend fun closedCaptioningOn(userQueryLanguage: kotlin.String, closedCaptioningLanguage: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open suspend fun setRepeat(isOn: kotlin.Boolean, isSingle: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

    public open suspend fun shuffle(): kotlin.Unit { /* compiled code */ }

    public open fun closedCaptioningOffBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun closedCaptioningOnBatchable(userQueryLanguage: kotlin.String, closedCaptioningLanguage: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setRepeatBatchable(isOn: kotlin.Boolean, isSingle: kotlin.Boolean): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun shuffleBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}


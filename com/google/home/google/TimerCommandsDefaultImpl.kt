// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface TimerCommandsDefaultImpl : com.google.home.google.TimerCommands {
    public open suspend fun timerStart(timerTimeSeconds: kotlin.Int): kotlin.Unit { /* compiled code */ }

    public open suspend fun timerAdjust(adjustmentTimeSeconds: kotlin.Int): kotlin.Unit { /* compiled code */ }

    public open suspend fun timerPause(): kotlin.Unit { /* compiled code */ }

    public open suspend fun timerResume(): kotlin.Unit { /* compiled code */ }

    public open suspend fun timerCancel(): kotlin.Unit { /* compiled code */ }

    public open fun timerStartBatchable(timerTimeSeconds: kotlin.Int): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun timerAdjustBatchable(adjustmentTimeSeconds: kotlin.Int): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun timerPauseBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun timerResumeBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun timerCancelBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}


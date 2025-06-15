// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface TimerCommands {
    public abstract suspend fun timerStart(timerTimeSeconds: kotlin.Int): kotlin.Unit

    public abstract suspend fun timerAdjust(adjustmentTimeSeconds: kotlin.Int): kotlin.Unit

    public abstract suspend fun timerPause(): kotlin.Unit

    public abstract suspend fun timerResume(): kotlin.Unit

    public abstract suspend fun timerCancel(): kotlin.Unit

    public abstract fun timerStartBatchable(timerTimeSeconds: kotlin.Int): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun timerAdjustBatchable(adjustmentTimeSeconds: kotlin.Int): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun timerPauseBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun timerResumeBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun timerCancelBatchable(): com.google.home.BatchableCommand<kotlin.Unit>
}


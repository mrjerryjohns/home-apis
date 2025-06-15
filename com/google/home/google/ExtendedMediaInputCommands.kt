// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedMediaInputCommands {
    public abstract suspend fun selectCustomInput(newInput: kotlin.String): kotlin.Unit

    public abstract suspend fun previousInput(): kotlin.Unit

    public abstract suspend fun nextInput(): kotlin.Unit

    public abstract fun selectCustomInputBatchable(newInput: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun previousInputBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun nextInputBatchable(): com.google.home.BatchableCommand<kotlin.Unit>
}


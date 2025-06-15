// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedMediaInputCommandsDefaultImpl : com.google.home.google.ExtendedMediaInputCommands {
    public open suspend fun selectCustomInput(newInput: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open suspend fun previousInput(): kotlin.Unit { /* compiled code */ }

    public open suspend fun nextInput(): kotlin.Unit { /* compiled code */ }

    public open fun selectCustomInputBatchable(newInput: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun previousInputBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun nextInputBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}


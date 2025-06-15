// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface OpenCloseCommandsDefaultImpl : com.google.home.google.OpenCloseCommands {
    public open suspend fun open(openDirection: com.google.home.google.OpenCloseTrait.Direction): kotlin.Unit { /* compiled code */ }

    public open suspend fun close(): kotlin.Unit { /* compiled code */ }

    public open suspend fun goToOpenPercentage(openPercent: kotlin.Double, openDirection: com.google.home.google.OpenCloseTrait.Direction): kotlin.Unit { /* compiled code */ }

    public open suspend fun step(openRelativePercent: kotlin.Double, openDirection: com.google.home.google.OpenCloseTrait.Direction): kotlin.Unit { /* compiled code */ }

    public open fun openBatchable(openDirection: com.google.home.google.OpenCloseTrait.Direction): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun closeBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun goToOpenPercentageBatchable(openPercent: kotlin.Double, openDirection: com.google.home.google.OpenCloseTrait.Direction): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stepBatchable(openRelativePercent: kotlin.Double, openDirection: com.google.home.google.OpenCloseTrait.Direction): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}


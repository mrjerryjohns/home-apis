// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface OpenCloseCommands {
    public abstract suspend fun open(openDirection: com.google.home.google.OpenCloseTrait.Direction): kotlin.Unit

    public abstract suspend fun close(): kotlin.Unit

    public abstract suspend fun goToOpenPercentage(openPercent: kotlin.Double, openDirection: com.google.home.google.OpenCloseTrait.Direction): kotlin.Unit

    public abstract suspend fun step(openRelativePercent: kotlin.Double, openDirection: com.google.home.google.OpenCloseTrait.Direction): kotlin.Unit

    public abstract fun openBatchable(openDirection: com.google.home.google.OpenCloseTrait.Direction): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun closeBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun goToOpenPercentageBatchable(openPercent: kotlin.Double, openDirection: com.google.home.google.OpenCloseTrait.Direction): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun stepBatchable(openRelativePercent: kotlin.Double, openDirection: com.google.home.google.OpenCloseTrait.Direction): com.google.home.BatchableCommand<kotlin.Unit>
}

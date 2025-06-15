// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface LocatorCommands {
    public abstract suspend fun locate(lang: kotlin.String, reportLocation: kotlin.Boolean): kotlin.Unit

    public abstract suspend fun silence(): kotlin.Unit

    public abstract fun locateBatchable(lang: kotlin.String, reportLocation: kotlin.Boolean): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun silenceBatchable(): com.google.home.BatchableCommand<kotlin.Unit>
}

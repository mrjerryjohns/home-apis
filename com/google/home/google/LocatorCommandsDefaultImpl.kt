// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface LocatorCommandsDefaultImpl : com.google.home.google.LocatorCommands {
    public open suspend fun locate(lang: kotlin.String, reportLocation: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

    public open suspend fun silence(): kotlin.Unit { /* compiled code */ }

    public open fun locateBatchable(lang: kotlin.String, reportLocation: kotlin.Boolean): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun silenceBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}


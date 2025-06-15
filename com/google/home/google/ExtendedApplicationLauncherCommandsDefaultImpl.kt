// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedApplicationLauncherCommandsDefaultImpl : com.google.home.google.ExtendedApplicationLauncherCommands {
    public open suspend fun installApp(newApplicationName: kotlin.String, newApplication: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open suspend fun searchApp(newApplicationName: kotlin.String, newApplication: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open suspend fun launchApp(newApplicationName: kotlin.String, newApplication: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open fun installAppBatchable(newApplicationName: kotlin.String, newApplication: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun searchAppBatchable(newApplicationName: kotlin.String, newApplication: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun launchAppBatchable(newApplicationName: kotlin.String, newApplication: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}


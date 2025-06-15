// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedApplicationLauncherCommands {
    public abstract suspend fun installApp(newApplicationName: kotlin.String, newApplication: kotlin.String): kotlin.Unit

    public abstract suspend fun searchApp(newApplicationName: kotlin.String, newApplication: kotlin.String): kotlin.Unit

    public abstract suspend fun launchApp(newApplicationName: kotlin.String, newApplication: kotlin.String): kotlin.Unit

    public abstract fun installAppBatchable(newApplicationName: kotlin.String, newApplication: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun searchAppBatchable(newApplicationName: kotlin.String, newApplication: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun launchAppBatchable(newApplicationName: kotlin.String, newApplication: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit>
}

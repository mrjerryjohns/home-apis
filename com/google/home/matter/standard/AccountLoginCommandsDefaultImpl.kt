// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface AccountLoginCommandsDefaultImpl : com.google.home.matter.standard.AccountLoginCommands {
    public open suspend fun getSetupPin(tempAccountIdentifier: kotlin.String): com.google.home.matter.standard.AccountLoginTrait.GetSetupPinCommand.Response { /* compiled code */ }

    public open suspend fun login(tempAccountIdentifier: kotlin.String, setupPin: kotlin.String, optionalArgs: com.google.home.matter.standard.AccountLoginTrait.LoginCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun logout(optionalArgs: com.google.home.matter.standard.AccountLoginTrait.LogoutCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open fun getSetupPinBatchable(tempAccountIdentifier: kotlin.String): com.google.home.BatchableCommand<com.google.home.matter.standard.AccountLoginTrait.GetSetupPinCommand.Response> { /* compiled code */ }

    public open fun loginBatchable(tempAccountIdentifier: kotlin.String, setupPin: kotlin.String, optionalArgs: com.google.home.matter.standard.AccountLoginTrait.LoginCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun logoutBatchable(optionalArgs: com.google.home.matter.standard.AccountLoginTrait.LogoutCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}


// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface AccountLoginCommands {
    public abstract suspend fun getSetupPin(tempAccountIdentifier: kotlin.String): com.google.home.matter.standard.AccountLoginTrait.GetSetupPinCommand.Response

    public abstract suspend fun login(tempAccountIdentifier: kotlin.String, setupPin: kotlin.String, optionalArgs: com.google.home.matter.standard.AccountLoginTrait.LoginCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun logout(optionalArgs: com.google.home.matter.standard.AccountLoginTrait.LogoutCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract fun getSetupPinBatchable(tempAccountIdentifier: kotlin.String): com.google.home.BatchableCommand<com.google.home.matter.standard.AccountLoginTrait.GetSetupPinCommand.Response>

    public abstract fun loginBatchable(tempAccountIdentifier: kotlin.String, setupPin: kotlin.String, optionalArgs: com.google.home.matter.standard.AccountLoginTrait.LoginCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun logoutBatchable(optionalArgs: com.google.home.matter.standard.AccountLoginTrait.LogoutCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>
}


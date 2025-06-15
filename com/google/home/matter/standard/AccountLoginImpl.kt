// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class AccountLoginImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.AccountLoginTrait.Attributes) : com.google.home.matter.standard.AccountLogin, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.AccountLoginTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.AccountLoginTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.AccountLogin.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.AccountLogin.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun getSetupPin(tempAccountIdentifier: kotlin.String): com.google.home.matter.standard.AccountLoginTrait.GetSetupPinCommand.Response { /* compiled code */ }

    public open suspend fun login(tempAccountIdentifier: kotlin.String, setupPin: kotlin.String, optionalArgs: com.google.home.matter.standard.AccountLoginTrait.LoginCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun logout(optionalArgs: com.google.home.matter.standard.AccountLoginTrait.LogoutCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open fun getSetupPinBatchable(tempAccountIdentifier: kotlin.String): com.google.home.BatchableCommand<com.google.home.matter.standard.AccountLoginTrait.GetSetupPinCommand.Response> { /* compiled code */ }

    public open fun loginBatchable(tempAccountIdentifier: kotlin.String, setupPin: kotlin.String, optionalArgs: com.google.home.matter.standard.AccountLoginTrait.LoginCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun logoutBatchable(optionalArgs: com.google.home.matter.standard.AccountLoginTrait.LogoutCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}


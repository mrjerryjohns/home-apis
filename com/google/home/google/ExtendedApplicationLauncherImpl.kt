// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class ExtendedApplicationLauncherImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.ExtendedApplicationLauncherTrait.Attributes) : com.google.home.google.ExtendedApplicationLauncher, com.google.home.matter.MatterTraitImpl, com.google.home.google.ExtendedApplicationLauncherTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.ExtendedApplicationLauncherTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val availableApplications: kotlin.collections.List<com.google.home.google.ExtendedApplicationLauncherTrait.AvailableApplication>? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentApplicationKey: kotlin.String? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val globalApplicationCatalog: kotlin.collections.List<kotlin.String>? /* compiled code */

    public open val type: com.google.home.google.ExtendedApplicationLauncherTrait.ApplicationType? /* compiled code */

    public open val useGlobalApplicationCatalog: kotlin.Boolean? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.ExtendedApplicationLauncher.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.ExtendedApplicationLauncher.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun installApp(newApplicationName: kotlin.String, newApplication: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open suspend fun searchApp(newApplicationName: kotlin.String, newApplication: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open suspend fun launchApp(newApplicationName: kotlin.String, newApplication: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open fun installAppBatchable(newApplicationName: kotlin.String, newApplication: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun searchAppBatchable(newApplicationName: kotlin.String, newApplication: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun launchAppBatchable(newApplicationName: kotlin.String, newApplication: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

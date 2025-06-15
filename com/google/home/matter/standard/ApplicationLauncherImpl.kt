// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class ApplicationLauncherImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.ApplicationLauncherTrait.Attributes) : com.google.home.matter.standard.ApplicationLauncher, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.ApplicationLauncherTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.ApplicationLauncherTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val catalogList: kotlin.collections.List<kotlin.UShort>? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentApp: com.google.home.matter.standard.ApplicationLauncherTrait.ApplicationEpStruct? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.ApplicationLauncherTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.ApplicationLauncher.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.ApplicationLauncher.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun launchApp(optionalArgs: com.google.home.matter.standard.ApplicationLauncherTrait.LaunchAppCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.ApplicationLauncherTrait.LaunchAppCommand.Response { /* compiled code */ }

    public open suspend fun stopApp(optionalArgs: com.google.home.matter.standard.ApplicationLauncherTrait.StopAppCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.ApplicationLauncherTrait.StopAppCommand.Response { /* compiled code */ }

    public open suspend fun hideApp(optionalArgs: com.google.home.matter.standard.ApplicationLauncherTrait.HideAppCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.ApplicationLauncherTrait.HideAppCommand.Response { /* compiled code */ }

    public open fun launchAppBatchable(optionalArgs: com.google.home.matter.standard.ApplicationLauncherTrait.LaunchAppCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.ApplicationLauncherTrait.LaunchAppCommand.Response> { /* compiled code */ }

    public open fun stopAppBatchable(optionalArgs: com.google.home.matter.standard.ApplicationLauncherTrait.StopAppCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.ApplicationLauncherTrait.StopAppCommand.Response> { /* compiled code */ }

    public open fun hideAppBatchable(optionalArgs: com.google.home.matter.standard.ApplicationLauncherTrait.HideAppCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.ApplicationLauncherTrait.HideAppCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

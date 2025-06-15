// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class ContentLauncherImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.ContentLauncherTrait.Attributes) : com.google.home.matter.standard.ContentLauncher, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.ContentLauncherTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.ContentLauncherTrait.Attributes /* compiled code */

    public open val acceptHeader: kotlin.collections.List<kotlin.String>? /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.ContentLauncherTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val supportedStreamingProtocols: com.google.home.matter.standard.ContentLauncherTrait.SupportedProtocolsBitmap? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.ContentLauncher.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.ContentLauncher.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun launchContent(search: com.google.home.matter.standard.ContentLauncherTrait.ContentSearchStruct, autoPlay: kotlin.Boolean, optionalArgs: com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.Response { /* compiled code */ }

    public open suspend fun launchUrl(contentUrl: kotlin.String, optionalArgs: com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.Response { /* compiled code */ }

    public open fun launchContentBatchable(search: com.google.home.matter.standard.ContentLauncherTrait.ContentSearchStruct, autoPlay: kotlin.Boolean, optionalArgs: com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.ContentLauncherTrait.LaunchContentCommand.Response> { /* compiled code */ }

    public open fun launchUrlBatchable(contentUrl: kotlin.String, optionalArgs: com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.ContentLauncherTrait.LaunchUrlCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

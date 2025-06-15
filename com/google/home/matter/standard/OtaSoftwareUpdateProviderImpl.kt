// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class OtaSoftwareUpdateProviderImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.Attributes) : com.google.home.matter.standard.OtaSoftwareUpdateProvider, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.OtaSoftwareUpdateProvider.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.OtaSoftwareUpdateProvider.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun queryImage(vendorId: kotlin.UShort, productId: kotlin.UShort, softwareVersion: kotlin.UInt, protocolsSupported: kotlin.collections.List<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.DownloadProtocolEnum>, optionalArgs: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.Response { /* compiled code */ }

    public open suspend fun applyUpdateRequest(updateToken: kotlin.ByteArray, newVersion: kotlin.UInt): com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.ApplyUpdateRequestCommand.Response { /* compiled code */ }

    public open suspend fun notifyUpdateApplied(updateToken: kotlin.ByteArray, softwareVersion: kotlin.UInt): kotlin.Unit { /* compiled code */ }

    public open fun queryImageBatchable(vendorId: kotlin.UShort, productId: kotlin.UShort, softwareVersion: kotlin.UInt, protocolsSupported: kotlin.collections.List<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.DownloadProtocolEnum>, optionalArgs: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.Response> { /* compiled code */ }

    public open fun applyUpdateRequestBatchable(updateToken: kotlin.ByteArray, newVersion: kotlin.UInt): com.google.home.BatchableCommand<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.ApplyUpdateRequestCommand.Response> { /* compiled code */ }

    public open fun notifyUpdateAppliedBatchable(updateToken: kotlin.ByteArray, softwareVersion: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

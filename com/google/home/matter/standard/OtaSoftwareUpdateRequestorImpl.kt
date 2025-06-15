// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class OtaSoftwareUpdateRequestorImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.Attributes) : com.google.home.matter.standard.OtaSoftwareUpdateRequestor, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.OtaSoftwareUpdateRequestor, com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val defaultOtaProviders: kotlin.collections.List<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ProviderLocation>? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val updatePossible: kotlin.Boolean? /* compiled code */

    public open val updateState: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum? /* compiled code */

    public open val updateStateProgress: kotlin.UByte? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.OtaSoftwareUpdateRequestor.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.OtaSoftwareUpdateRequestor.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun announceOtaProvider(providerNodeId: kotlin.ULong, vendorId: kotlin.UShort, announcementReason: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnouncementReasonEnum, endpoint: kotlin.UShort, optionalArgs: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnounceOtaProviderCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.OtaSoftwareUpdateRequestor) -> kotlin.Unit, init: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.OtaSoftwareUpdateRequestor { /* compiled code */ }

    public open fun announceOtaProviderBatchable(providerNodeId: kotlin.ULong, vendorId: kotlin.UShort, announcementReason: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnouncementReasonEnum, endpoint: kotlin.UShort, optionalArgs: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnounceOtaProviderCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}


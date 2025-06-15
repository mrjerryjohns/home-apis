// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class GeneralCommissioningImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.GeneralCommissioningTrait.Attributes) : com.google.home.matter.standard.GeneralCommissioning, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.GeneralCommissioningTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.GeneralCommissioning, com.google.home.matter.standard.GeneralCommissioningTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.GeneralCommissioningTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val basicCommissioningInfo: com.google.home.matter.standard.GeneralCommissioningTrait.BasicCommissioningInfo? /* compiled code */

    public open val breadcrumb: kotlin.ULong? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.GeneralCommissioningTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val locationCapability: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum? /* compiled code */

    public open val regulatoryConfig: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum? /* compiled code */

    public open val supportsConcurrentConnection: kotlin.Boolean? /* compiled code */

    public open val tcAcceptedVersion: kotlin.UShort? /* compiled code */

    public open val tcAcknowledgements: kotlin.UShort? /* compiled code */

    public open val tcAcknowledgementsRequired: kotlin.Boolean? /* compiled code */

    public open val tcMinRequiredVersion: kotlin.UShort? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.GeneralCommissioning.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.GeneralCommissioning.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun armFailSafe(expiryLengthSeconds: kotlin.UShort, breadcrumb: kotlin.ULong): com.google.home.matter.standard.GeneralCommissioningTrait.ArmFailSafeCommand.Response { /* compiled code */ }

    public open suspend fun setRegulatoryConfig(newRegulatoryConfig: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum, countryCode: kotlin.String, breadcrumb: kotlin.ULong): com.google.home.matter.standard.GeneralCommissioningTrait.SetRegulatoryConfigCommand.Response { /* compiled code */ }

    public open suspend fun commissioningComplete(): com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningCompleteCommand.Response { /* compiled code */ }

    public open suspend fun setTcAcknowledgements(tcVersion: kotlin.UShort, tcUserResponse: kotlin.UShort): com.google.home.matter.standard.GeneralCommissioningTrait.SetTcAcknowledgementsCommand.Response { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.GeneralCommissioning) -> kotlin.Unit, init: com.google.home.matter.standard.GeneralCommissioningTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.GeneralCommissioning { /* compiled code */ }

    public open fun armFailSafeBatchable(expiryLengthSeconds: kotlin.UShort, breadcrumb: kotlin.ULong): com.google.home.BatchableCommand<com.google.home.matter.standard.GeneralCommissioningTrait.ArmFailSafeCommand.Response> { /* compiled code */ }

    public open fun setRegulatoryConfigBatchable(newRegulatoryConfig: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum, countryCode: kotlin.String, breadcrumb: kotlin.ULong): com.google.home.BatchableCommand<com.google.home.matter.standard.GeneralCommissioningTrait.SetRegulatoryConfigCommand.Response> { /* compiled code */ }

    public open fun commissioningCompleteBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningCompleteCommand.Response> { /* compiled code */ }

    public open fun setTcAcknowledgementsBatchable(tcVersion: kotlin.UShort, tcUserResponse: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.GeneralCommissioningTrait.SetTcAcknowledgementsCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

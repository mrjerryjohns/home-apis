// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class CommissionerControlImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.CommissionerControlTrait.Attributes) : com.google.home.matter.standard.CommissionerControl, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.CommissionerControlTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.CommissionerControlTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val supportedDeviceCategories: com.google.home.matter.standard.CommissionerControlTrait.SupportedDeviceCategoryBitmap? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.CommissionerControl.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.CommissionerControl.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun requestCommissioningApproval(requestId: kotlin.ULong, vendorId: kotlin.UShort, productId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.CommissionerControlTrait.RequestCommissioningApprovalCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun commissionNode(requestId: kotlin.ULong, responseTimeoutSeconds: kotlin.UShort): com.google.home.matter.standard.CommissionerControlTrait.CommissionNodeCommand.Response { /* compiled code */ }

    public open fun requestCommissioningApprovalBatchable(requestId: kotlin.ULong, vendorId: kotlin.UShort, productId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.CommissionerControlTrait.RequestCommissioningApprovalCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun commissionNodeBatchable(requestId: kotlin.ULong, responseTimeoutSeconds: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.CommissionerControlTrait.CommissionNodeCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}


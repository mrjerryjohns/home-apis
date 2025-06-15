// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class AdministratorCommissioningImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.AdministratorCommissioningTrait.Attributes) : com.google.home.matter.standard.AdministratorCommissioning, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.AdministratorCommissioningTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.AdministratorCommissioningTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val adminFabricIndex: kotlin.UByte? /* compiled code */

    public open val adminVendorId: kotlin.UShort? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.AdministratorCommissioningTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val windowStatus: com.google.home.matter.standard.AdministratorCommissioningTrait.CommissioningWindowStatusEnum? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.AdministratorCommissioning.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.AdministratorCommissioning.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun openCommissioningWindow(commissioningTimeout: kotlin.UShort, pakePasscodeVerifier: kotlin.ByteArray, discriminator: kotlin.UShort, iterations: kotlin.UInt, salt: kotlin.ByteArray): kotlin.Unit { /* compiled code */ }

    public open suspend fun openBasicCommissioningWindow(commissioningTimeout: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun revokeCommissioning(): kotlin.Unit { /* compiled code */ }

    public open fun openCommissioningWindowBatchable(commissioningTimeout: kotlin.UShort, pakePasscodeVerifier: kotlin.ByteArray, discriminator: kotlin.UShort, iterations: kotlin.UInt, salt: kotlin.ByteArray): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun openBasicCommissioningWindowBatchable(commissioningTimeout: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun revokeCommissioningBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}


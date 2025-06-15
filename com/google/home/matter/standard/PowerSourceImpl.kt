// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class PowerSourceImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.PowerSourceTrait.Attributes) : com.google.home.matter.standard.PowerSource, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.PowerSourceTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.PowerSourceTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val activeBatChargeFaults: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>? /* compiled code */

    public open val activeBatFaults: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>? /* compiled code */

    public open val activeWiredFaults: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val batAnsiDesignation: kotlin.String? /* compiled code */

    public open val batApprovedChemistry: com.google.home.matter.standard.PowerSourceTrait.BatApprovedChemistryEnum? /* compiled code */

    public open val batCapacity: kotlin.UInt? /* compiled code */

    public open val batChargeLevel: com.google.home.matter.standard.PowerSourceTrait.BatChargeLevelEnum? /* compiled code */

    public open val batChargeState: com.google.home.matter.standard.PowerSourceTrait.BatChargeStateEnum? /* compiled code */

    public open val batChargingCurrent: kotlin.UInt? /* compiled code */

    public open val batCommonDesignation: com.google.home.matter.standard.PowerSourceTrait.BatCommonDesignationEnum? /* compiled code */

    public open val batFunctionalWhileCharging: kotlin.Boolean? /* compiled code */

    public open val batIecDesignation: kotlin.String? /* compiled code */

    public open val batPercentRemaining: kotlin.UByte? /* compiled code */

    public open val batPresent: kotlin.Boolean? /* compiled code */

    public open val batQuantity: kotlin.UByte? /* compiled code */

    public open val batReplaceability: com.google.home.matter.standard.PowerSourceTrait.BatReplaceabilityEnum? /* compiled code */

    public open val batReplacementDescription: kotlin.String? /* compiled code */

    public open val batReplacementNeeded: kotlin.Boolean? /* compiled code */

    public open val batTimeRemaining: kotlin.UInt? /* compiled code */

    public open val batTimeToFullCharge: kotlin.UInt? /* compiled code */

    public open val batVoltage: kotlin.UInt? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val description: kotlin.String? /* compiled code */

    public open val endpointList: kotlin.collections.List<kotlin.UShort>? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.PowerSourceTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val order: kotlin.UByte? /* compiled code */

    public open val status: com.google.home.matter.standard.PowerSourceTrait.PowerSourceStatusEnum? /* compiled code */

    public open val wiredAssessedCurrent: kotlin.UInt? /* compiled code */

    public open val wiredAssessedInputFrequency: kotlin.UShort? /* compiled code */

    public open val wiredAssessedInputVoltage: kotlin.UInt? /* compiled code */

    public open val wiredCurrentType: com.google.home.matter.standard.PowerSourceTrait.WiredCurrentTypeEnum? /* compiled code */

    public open val wiredMaximumCurrent: kotlin.UInt? /* compiled code */

    public open val wiredNominalVoltage: kotlin.UInt? /* compiled code */

    public open val wiredPresent: kotlin.Boolean? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.PowerSource.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}


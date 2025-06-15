// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class ExtendedPowerSourceImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.ExtendedPowerSourceTrait.Attributes) : com.google.home.google.ExtendedPowerSource, com.google.home.matter.MatterTraitImpl, com.google.home.google.ExtendedPowerSourceTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.ExtendedPowerSourceTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val batterySaverEnabled: kotlin.Boolean? /* compiled code */

    public open val capacityRemaining: kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.Capacity>? /* compiled code */

    public open val capacityUntilFull: kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.Capacity>? /* compiled code */

    public open val chargeSpeed: com.google.home.google.ExtendedPowerSourceTrait.ChargeSpeed? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val descriptiveCapacityRemaining: com.google.home.google.ExtendedPowerSourceTrait.DescriptiveCapacityRemaining? /* compiled code */

    public open val energySource: com.google.home.google.ExtendedPowerSourceTrait.EnergySource? /* compiled code */

    public open val energyStorageDistanceUnitForUx: com.google.home.google.ExtendedPowerSourceTrait.DistanceUnit? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val isPluggedIn: kotlin.Boolean? /* compiled code */

    public open val usingBackupEnergySource: kotlin.Boolean? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.ExtendedPowerSource.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.ExtendedPowerSource.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun startCharging(): kotlin.Unit { /* compiled code */ }

    public open suspend fun stopCharging(): kotlin.Unit { /* compiled code */ }

    public open fun startChargingBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stopChargingBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}


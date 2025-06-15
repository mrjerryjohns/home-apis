// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class EnergyEvseImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.EnergyEvseTrait.Attributes) : com.google.home.matter.standard.EnergyEvse, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.EnergyEvseTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.EnergyEvse, com.google.home.matter.standard.EnergyEvseTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.EnergyEvseTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val approximateEvEfficiency: kotlin.UShort? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val batteryCapacity: kotlin.Long? /* compiled code */

    public open val chargingEnabledUntil: kotlin.UInt? /* compiled code */

    public open val circuitCapacity: kotlin.Long? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val dischargingEnabledUntil: kotlin.UInt? /* compiled code */

    public open val faultState: com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.EnergyEvseTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val maximumChargeCurrent: kotlin.Long? /* compiled code */

    public open val maximumDischargeCurrent: kotlin.Long? /* compiled code */

    public open val minimumChargeCurrent: kotlin.Long? /* compiled code */

    public open val nextChargeRequiredEnergy: kotlin.Long? /* compiled code */

    public open val nextChargeStartTime: kotlin.UInt? /* compiled code */

    public open val nextChargeTargetSoC: kotlin.UByte? /* compiled code */

    public open val nextChargeTargetTime: kotlin.UInt? /* compiled code */

    public open val randomizationDelayWindow: kotlin.UInt? /* compiled code */

    public open val sessionDuration: kotlin.UInt? /* compiled code */

    public open val sessionEnergyCharged: kotlin.Long? /* compiled code */

    public open val sessionEnergyDischarged: kotlin.Long? /* compiled code */

    public open val sessionId: kotlin.UInt? /* compiled code */

    public open val state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum? /* compiled code */

    public open val stateOfCharge: kotlin.UByte? /* compiled code */

    public open val supplyState: com.google.home.matter.standard.EnergyEvseTrait.SupplyStateEnum? /* compiled code */

    public open val userMaximumChargeCurrent: kotlin.Long? /* compiled code */

    public open val vehicleId: kotlin.String? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.EnergyEvse.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.EnergyEvse.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun disable(): kotlin.Unit { /* compiled code */ }

    public open suspend fun enableCharging(chargingEnabledUntil: kotlin.UInt?, minimumChargeCurrent: kotlin.Long, maximumChargeCurrent: kotlin.Long): kotlin.Unit { /* compiled code */ }

    public open suspend fun enableDischarging(dischargingEnabledUntil: kotlin.UInt?, maximumDischargeCurrent: kotlin.Long): kotlin.Unit { /* compiled code */ }

    public open suspend fun startDiagnostics(): kotlin.Unit { /* compiled code */ }

    public open suspend fun setTargets(chargingTargetSchedules: kotlin.collections.List<com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetScheduleStruct>): kotlin.Unit { /* compiled code */ }

    public open suspend fun getTargets(): com.google.home.matter.standard.EnergyEvseTrait.GetTargetsCommand.Response { /* compiled code */ }

    public open suspend fun clearTargets(): kotlin.Unit { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.EnergyEvse) -> kotlin.Unit, init: com.google.home.matter.standard.EnergyEvseTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.EnergyEvse { /* compiled code */ }

    public open fun disableBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun enableChargingBatchable(chargingEnabledUntil: kotlin.UInt?, minimumChargeCurrent: kotlin.Long, maximumChargeCurrent: kotlin.Long): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun enableDischargingBatchable(dischargingEnabledUntil: kotlin.UInt?, maximumDischargeCurrent: kotlin.Long): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun startDiagnosticsBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setTargetsBatchable(chargingTargetSchedules: kotlin.collections.List<com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetScheduleStruct>): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun getTargetsBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.EnergyEvseTrait.GetTargetsCommand.Response> { /* compiled code */ }

    public open fun clearTargetsBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

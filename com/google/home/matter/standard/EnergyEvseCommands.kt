// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface EnergyEvseCommands {
    public abstract suspend fun disable(): kotlin.Unit

    public abstract suspend fun enableCharging(chargingEnabledUntil: kotlin.UInt?, minimumChargeCurrent: kotlin.Long, maximumChargeCurrent: kotlin.Long): kotlin.Unit

    public abstract suspend fun enableDischarging(dischargingEnabledUntil: kotlin.UInt?, maximumDischargeCurrent: kotlin.Long): kotlin.Unit

    public abstract suspend fun startDiagnostics(): kotlin.Unit

    public abstract suspend fun setTargets(chargingTargetSchedules: kotlin.collections.List<com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetScheduleStruct>): kotlin.Unit

    public abstract suspend fun getTargets(): com.google.home.matter.standard.EnergyEvseTrait.GetTargetsCommand.Response

    public abstract suspend fun clearTargets(): kotlin.Unit

    public abstract fun disableBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun enableChargingBatchable(chargingEnabledUntil: kotlin.UInt?, minimumChargeCurrent: kotlin.Long, maximumChargeCurrent: kotlin.Long): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun enableDischargingBatchable(dischargingEnabledUntil: kotlin.UInt?, maximumDischargeCurrent: kotlin.Long): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun startDiagnosticsBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun setTargetsBatchable(chargingTargetSchedules: kotlin.collections.List<com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetScheduleStruct>): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun getTargetsBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.EnergyEvseTrait.GetTargetsCommand.Response>

    public abstract fun clearTargetsBatchable(): com.google.home.BatchableCommand<kotlin.Unit>
}


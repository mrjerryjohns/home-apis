// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface EnergyEvseCommandsDefaultImpl : com.google.home.matter.standard.EnergyEvseCommands {
    public open suspend fun disable(): kotlin.Unit { /* compiled code */ }

    public open suspend fun enableCharging(chargingEnabledUntil: kotlin.UInt?, minimumChargeCurrent: kotlin.Long, maximumChargeCurrent: kotlin.Long): kotlin.Unit { /* compiled code */ }

    public open suspend fun enableDischarging(dischargingEnabledUntil: kotlin.UInt?, maximumDischargeCurrent: kotlin.Long): kotlin.Unit { /* compiled code */ }

    public open suspend fun startDiagnostics(): kotlin.Unit { /* compiled code */ }

    public open suspend fun setTargets(chargingTargetSchedules: kotlin.collections.List<com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetScheduleStruct>): kotlin.Unit { /* compiled code */ }

    public open suspend fun getTargets(): com.google.home.matter.standard.EnergyEvseTrait.GetTargetsCommand.Response { /* compiled code */ }

    public open suspend fun clearTargets(): kotlin.Unit { /* compiled code */ }

    public open fun disableBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun enableChargingBatchable(chargingEnabledUntil: kotlin.UInt?, minimumChargeCurrent: kotlin.Long, maximumChargeCurrent: kotlin.Long): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun enableDischargingBatchable(dischargingEnabledUntil: kotlin.UInt?, maximumDischargeCurrent: kotlin.Long): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun startDiagnosticsBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setTargetsBatchable(chargingTargetSchedules: kotlin.collections.List<com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetScheduleStruct>): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun getTargetsBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.EnergyEvseTrait.GetTargetsCommand.Response> { /* compiled code */ }

    public open fun clearTargetsBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}


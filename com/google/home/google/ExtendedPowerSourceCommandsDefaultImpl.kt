// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedPowerSourceCommandsDefaultImpl : com.google.home.google.ExtendedPowerSourceCommands {
    public open suspend fun startCharging(): kotlin.Unit { /* compiled code */ }

    public open suspend fun stopCharging(): kotlin.Unit { /* compiled code */ }

    public open fun startChargingBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stopChargingBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}


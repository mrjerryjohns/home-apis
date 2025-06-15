// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedPowerSourceCommands {
    public abstract suspend fun startCharging(): kotlin.Unit

    public abstract suspend fun stopCharging(): kotlin.Unit

    public abstract fun startChargingBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun stopChargingBatchable(): com.google.home.BatchableCommand<kotlin.Unit>
}


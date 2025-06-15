// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedOperationalStateCommands {
    public abstract suspend fun startWithOperationZones(operationZones: kotlin.collections.List<kotlin.String>): kotlin.Unit

    public abstract suspend fun startWithDuration(operationZones: kotlin.collections.List<kotlin.String>, durationSeconds: kotlin.UInt): kotlin.Unit

    public abstract fun startWithOperationZonesBatchable(operationZones: kotlin.collections.List<kotlin.String>): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun startWithDurationBatchable(operationZones: kotlin.collections.List<kotlin.String>, durationSeconds: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit>
}

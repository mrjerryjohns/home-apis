// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedOperationalStateCommandsDefaultImpl : com.google.home.google.ExtendedOperationalStateCommands {
    public open suspend fun startWithOperationZones(operationZones: kotlin.collections.List<kotlin.String>): kotlin.Unit { /* compiled code */ }

    public open suspend fun startWithDuration(operationZones: kotlin.collections.List<kotlin.String>, durationSeconds: kotlin.UInt): kotlin.Unit { /* compiled code */ }

    public open fun startWithOperationZonesBatchable(operationZones: kotlin.collections.List<kotlin.String>): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun startWithDurationBatchable(operationZones: kotlin.collections.List<kotlin.String>, durationSeconds: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

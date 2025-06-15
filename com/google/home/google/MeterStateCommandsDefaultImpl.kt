// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface MeterStateCommandsDefaultImpl : com.google.home.google.MeterStateCommands {
    public open suspend fun fetchMeterStateHistory(startTimeUnixTimestampSeconds: kotlin.Long, endTimeUnixTimestampSeconds: kotlin.Long, meterStates: kotlin.collections.List<com.google.home.google.MeterStateTrait.MeterStates>): kotlin.Unit { /* compiled code */ }

    public open fun fetchMeterStateHistoryBatchable(startTimeUnixTimestampSeconds: kotlin.Long, endTimeUnixTimestampSeconds: kotlin.Long, meterStates: kotlin.collections.List<com.google.home.google.MeterStateTrait.MeterStates>): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
